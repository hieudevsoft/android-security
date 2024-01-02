package hieubui.eup.android_app_security

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.os.Looper
import android.util.Base64
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import hieubui.eup.android_app_security.databinding.ActivityMainBinding
import hieubui.eup.security.EncryptedPreferenceHelper
import hieubui.eup.security.SecurityHelper
import hieubui.eup.security.SecurityHelper.decryptAes256CbcJson
import okhttp3.Call
import okhttp3.Callback
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import okhttp3.Response
import java.io.IOException
import java.util.concurrent.TimeUnit

const val BASE_URL = "https://secure.eup.ai"
const val END_POINT_AES = "/api/aes/key"
const val END_POINT_RSA = "/api/rsa/public-key"
const val END_POINT_TEST = "/api/test/1/detail"
const val END_POINT_GET_PROFILE = "/api/user/profile/detail"
const val END_POINT_UPDATE_PROFILE = "/api/user/profile/update"
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val encryptedPreferenceHelper by lazy { EncryptedPreferenceHelper(this) }
    private val okHttp3 by lazy {
        val clientBuilder = OkHttpClient().newBuilder()
        clientBuilder.apply {
            readTimeout(5, TimeUnit.SECONDS)
            connectTimeout(5, TimeUnit.SECONDS)
            writeTimeout(5, TimeUnit.SECONDS)
            callTimeout(6, TimeUnit.SECONDS)
        }
        clientBuilder.build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            getAesKey.setOnClickListener {
                val requestAesKey = Request.Builder()
                    .url("$BASE_URL$END_POINT_AES")
                    .build()
                okHttp3.newCall(requestAesKey).enqueue(object:Callback{
                    override fun onFailure(call: Call, e: IOException) {}
                    override fun onResponse(call: Call, response: Response) {
                        val body = response.body
                        body?.let {
                            val bodyResponse = body.string()
                            val keyResponse = Gson().fromJson(bodyResponse,KeyResponse::class.java)
                            if(response.code==200){
                                val prKey = keyResponse.data
                                if(!prKey.isNullOrEmpty()){
                                    encryptedPreferenceHelper.setString("aes_key",prKey)
                                    showToast("GET AES KEY SUCCESSFULLY~")
                                }
                            }
                        }
                    }
                })
            }
            getPublicRsaKey.setOnClickListener {
                val requestAesKey = Request.Builder()
                    .url("$BASE_URL$END_POINT_RSA")
                    .build()
                okHttp3.newCall(requestAesKey).enqueue(object:Callback{
                    override fun onFailure(call: Call, e: IOException) {}
                    override fun onResponse(call: Call, response: Response) {
                        val body = response.body
                        body?.let {
                            val bodyResponse = body.string()
                            val keyResponse = Gson().fromJson(bodyResponse,KeyResponse::class.java)
                            if(response.code==200){
                                val prKey = keyResponse.data
                                if(!prKey.isNullOrEmpty()){
                                    encryptedPreferenceHelper.setString("rsa_key",prKey)
                                    showToast("GET PUBLIC RSA KEY SUCCESSFULLY~")
                                }
                            }
                        }
                    }
                })
            }
            getTest.setOnClickListener {
                val requestTest = Request.Builder()
                    .addHeader("Authorization","wv7Q909F2rlvMHP00OfCRPcRkGJORFrL")
                    .url("$BASE_URL$END_POINT_TEST")
                    .build()
                okHttp3.newCall(requestTest).enqueue(object:Callback{
                    override fun onFailure(call: Call, e: IOException) {}
                    override fun onResponse(call: Call, response: Response) {
                        val body = response.body
                        body?.let {
                            val bodyResponse = body.string()
                            val testResponse = Gson().fromJson(bodyResponse,TestResponse::class.java)
                            if(response.code==200){
                                val data = testResponse.data
                                if(!data.isNullOrEmpty()){
                                    val keySaved = Base64.decode(encryptedPreferenceHelper.getString("aes_key"),Base64.DEFAULT)
                                    val dataDecrypt = decryptAes256CbcJson(data,keySaved)
                                    handleUiSafety {
                                        txtContent.text = "Server encrypt: $data\n\nClient decrypt: $dataDecrypt"
                                    }
                                }
                            }
                        }
                    }
                })
            }
            updateProfile.setOnClickListener {
                val profileUpdate = ProfileUserUpdate(
                    name = "PHAM VAN TIEN",
                    language = "vi",
                    levelToeic = 3,
                    levelIelts = 3,
                    levelToefl = 3,
                )
                val publicKeySavedBase64EncodedString = encryptedPreferenceHelper.getString("rsa_key")
                    .replace("-----BEGIN PUBLIC KEY-----","")
                    .replace("-----END PUBLIC KEY-----","")
                    .trim()
                val publicKeyByteArray = Base64.decode(publicKeySavedBase64EncodedString,Base64.DEFAULT)
                val profileJsonEncoded = Gson().toJson(profileUpdate)
                val dataEncrypted = SecurityHelper.encryptRSA(profileJsonEncoded,publicKeyByteArray)
                //----
                val postProfileUserUpdate = PostProfileUserUpdate(data = dataEncrypted)
                val body = Gson().toJson(postProfileUserUpdate)
                val requestUpdateProfile = Request.Builder()
                    .addHeader("Authorization","wv7Q909F2rlvMHP00OfCRPcRkGJORFrL")
                    .url("$BASE_URL$END_POINT_UPDATE_PROFILE")
                    .post(body.toRequestBody("application/json".toMediaType()))
                    .build()
                okHttp3.newCall(requestUpdateProfile).enqueue(object:Callback{
                    override fun onFailure(call: Call, e: IOException) {
                        Log.d("DEBUG", "onFailure: ${e.localizedMessage}")
                    }

                    override fun onResponse(call: Call, response: Response) {
                        if(response.code==200){
                            handleUiSafety {
                                binding.txtContent.text = body
                                showToast("Update profile successfully~")
                            }
                        }
                    }
                })
            }
            getProfile.setOnClickListener {
                val requestUpdateProfile = Request.Builder()
                    .addHeader("Authorization","wv7Q909F2rlvMHP00OfCRPcRkGJORFrL")
                    .url("$BASE_URL$END_POINT_GET_PROFILE")
                    .build()
                okHttp3.newCall(requestUpdateProfile).enqueue(object:Callback{
                    override fun onFailure(call: Call, e: IOException) {
                        Log.d("DEBUG", "onFailure: ${e.localizedMessage}")
                    }

                    override fun onResponse(call: Call, response: Response) {
                        if(response.code==200){
                            handleUiSafety {
                                binding.txtContent.text = response.body?.string()
                                showToast("Get profile successfully~")
                            }
                        }
                    }
                })
            }
        }
    }
}

fun Context.showToast(message:String){
    val isMainThread = Looper.myLooper()==Looper.getMainLooper()
    if(isMainThread){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    } else{
        if(this is Activity){
            this.runOnUiThread { Toast.makeText(this, message, Toast.LENGTH_SHORT).show() }
        }
    }
}

fun Context.handleUiSafety(callback:()->Unit){
    val isMainThread = Looper.myLooper()==Looper.getMainLooper()
    if(isMainThread){
        callback()
    } else{
        if(this is Activity){
            runOnUiThread { callback() }
        }
    }
}