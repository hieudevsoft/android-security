package hieubui.eup.security

import android.app.Application
import android.content.Context
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.content.pm.Signature
import android.os.Build
import android.os.Debug
import android.util.Base64
import org.json.JSONObject
import java.security.KeyFactory
import java.security.MessageDigest
import java.security.NoSuchAlgorithmException
import java.security.spec.PKCS8EncodedKeySpec
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec

object SecurityHelper {

    @Throws(PackageManager.NameNotFoundException::class, NoSuchAlgorithmException::class)
    fun convertSecurityAlgorithmToBase64(algorithm:String, bytes:ByteArray):String{
        val messageDigest = MessageDigest.getInstance(algorithm)
        messageDigest.update(bytes)
        return Base64.encodeToString(messageDigest.digest(), Base64.DEFAULT)
    }

    fun hexToBase64(input:String):String{
        val bytes = input.chunked(2).map { it.toInt(16).toByte() }.toByteArray()
        return Base64.encodeToString(bytes, Base64.DEFAULT);
    }

    @Throws(PackageManager.NameNotFoundException::class, NoSuchAlgorithmException::class)
    fun checkSignature(context: Context,base64Signature:List<String>): Boolean {
        val packageInfo: PackageInfo = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNING_CERTIFICATES)
        } else {
            context.packageManager.getPackageInfo(context.packageName, PackageManager.GET_SIGNATURES)
        }
        val signatures: Array<Signature> = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
            packageInfo.signingInfo.apkContentsSigners
        } else {
            packageInfo.signatures
        }
        for (signature in signatures) {
            val currentSignature: String = convertSecurityAlgorithmToBase64("SHA",signature.toByteArray())
            if (base64Signature.contains(currentSignature)) {
                return true
            }
        }
        return false
    }

    fun checkDebuggerAttached():Boolean {
        return Debug.isDebuggerConnected()
    }
    fun checkDebugger(application: Application):Boolean{
        val flags = application.applicationInfo.flags
        val flagDebuggable = flags.and(ApplicationInfo.FLAG_DEBUGGABLE)
        return flagDebuggable != 0
    }

    fun checkVendor(context: Context): Boolean {
        val pm: PackageManager = context.packageManager
        val installer = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            val installSourceInfo = pm.getInstallSourceInfo(context.packageName)
            installSourceInfo.installingPackageName
        } else {
            pm.getInstallerPackageName(context.packageName)
        }
        return installer == "com.android.vending"
    }

    fun decryptAes256Cbc(encryptedBase64Data: String, key: ByteArray, ivBytes: ByteArray): String {
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        val secretKey = SecretKeySpec(key, "AES")
        val ivSpec = IvParameterSpec(ivBytes)
        cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec)
        val encryptedData = Base64.decode(encryptedBase64Data, Base64.DEFAULT)
        val decryptedBytes = cipher.doFinal(encryptedData)
        return String(decryptedBytes, Charsets.UTF_8)
    }

    fun decryptAes256CbcJson(payload: String, key: ByteArray): String {
        val payloadJson = JSONObject(String(Base64.decode(payload,Base64.DEFAULT)))
        val iv = Base64.decode(payloadJson.getString("iv"), Base64.DEFAULT)
        val encryptedValue = Base64.decode(payloadJson.getString("value"), Base64.DEFAULT)
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding") // Replace with your cipher specification
        val secretKeySpec = SecretKeySpec(key, "AES")
        val ivParameterSpec = IvParameterSpec(iv)
        cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, ivParameterSpec)
        val decryptedBytes = cipher.doFinal(encryptedValue)
        return String(decryptedBytes, Charsets.UTF_8)
    }

    fun encryptAes256Cbc(dataToEncrypt: String, keyBytes: ByteArray, ivBytes: ByteArray): String {
        val secretKey = SecretKeySpec(keyBytes, "AES")
        val ivSpec = IvParameterSpec(ivBytes)
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec)
        val encrypted = cipher.doFinal(dataToEncrypt.toByteArray(Charsets.UTF_8))
        return Base64.encodeToString(encrypted, Base64.DEFAULT)
    }

    fun encryptRSA(dataToEncrypt: String, publicKey: ByteArray): String {
        val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
        val keyFactory = KeyFactory.getInstance("RSA")
        cipher.init(Cipher.ENCRYPT_MODE, keyFactory.generatePublic(X509EncodedKeySpec(publicKey)))
        val encrypted = cipher.doFinal(dataToEncrypt.toByteArray(Charsets.UTF_8))
        return Base64.encodeToString(encrypted, Base64.DEFAULT)
    }

    fun decryptRSA(dataToDecrypt: String, privateKey: ByteArray): String {
        val cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding")
        val keyFactory = KeyFactory.getInstance("RSA")
        cipher.init(Cipher.DECRYPT_MODE, keyFactory.generatePrivate(PKCS8EncodedKeySpec(privateKey)))
        val encrypted = cipher.doFinal(Base64.decode(dataToDecrypt,Base64.DEFAULT))
        return String(encrypted)
    }
}