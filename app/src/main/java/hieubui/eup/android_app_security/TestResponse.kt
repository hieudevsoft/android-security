package hieubui.eup.android_app_security


import com.google.gson.annotations.SerializedName

data class TestResponse(
    @SerializedName("data")
    val `data`: String? = null,
    @SerializedName("msg")
    val msg: String? = null,
    @SerializedName("status")
    val status: Int? = null
)