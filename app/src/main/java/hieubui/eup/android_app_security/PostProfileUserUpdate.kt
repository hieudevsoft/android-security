package hieubui.eup.android_app_security


import com.google.gson.annotations.SerializedName

data class PostProfileUserUpdate(
    @SerializedName("encrypted_data")
    val data: String =  ""
)

data class ProfileUserUpdate(
    @SerializedName("language")
    val language: String? = null,
    @SerializedName("level_ielts")
    val levelIelts: Int? = null,
    @SerializedName("level_toefl")
    val levelToefl: Int? = null,
    @SerializedName("level_toeic")
    val levelToeic: Int? = null,
    @SerializedName("name")
    val name: String? = null
)