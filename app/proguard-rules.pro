##---------------Begin: proguard configuration for Gson  ----------
# Gson uses generic type information stored in a class file when working with fields. Proguard
# removes such information by default, so configure it to keep all of it.
# Gson specific classes
-dontwarn sun.misc.**
#-keep class com.google.gson.stream.** { *; }

# Application classes that will be serialized/deserialized over Gson
-keep class com.google.gson.examples.android.model.** { <fields>; }

# Prevent proguard from stripping interface information from TypeAdapter, TypeAdapterFactory,
# JsonSerializer, JsonDeserializer instances (so they can be used in @JsonAdapter)
-keep class * extends com.google.gson.TypeAdapter
-keep class * implements com.google.gson.TypeAdapterFactory
-keep class * implements com.google.gson.JsonSerializer
-keep class * implements com.google.gson.JsonDeserializer

# Prevent R8 from leaving Data object members always null
-keepclassmembers,allowobfuscation class * {
  @com.google.gson.annotations.SerializedName <fields>;
}

# Retain generic signatures of TypeToken and its subclasses with R8 version 3.0 and higher.
-keep,allowobfuscation,allowshrinking class com.google.gson.reflect.TypeToken
-keep,allowobfuscation,allowshrinking class * extends com.google.gson.reflect.TypeToken

##---------------End: proguard configuration for Gson  ----------
-keepattributes *Annotation*, Signature
-obfuscationdictionary "/Users/admin/Library/Android/sdk/tools/proguard/dict.txt"
-classobfuscationdictionary "/Users/admin/Library/Android/sdk/tools/proguard/dict.txt"
-packageobfuscationdictionary "/Users/admin/Library/Android/sdk/tools/proguard/dict.txt"
-overloadaggressively
-assumenosideeffects class android.util.Log {
     public static *** e(...);
     public static *** w(...);
     public static *** i(...);
     public static *** d(...);
     public static *** v(...);
}
-keepclassmembers,allowoptimization,allowobfuscation class hieubui.eup.android_app_security.PostProfileUserUpdate {
    <init>(...);
    <fields>;
}
-keepclassmembers,allowoptimization,allowobfuscation class hieubui.eup.android_app_security.KeyResponse {
    <init>(...);
    <fields>;
}
-keepclassmembers,allowoptimization,allowobfuscation class hieubui.eup.android_app_security.TestResponse {
    <init>(...);
    <fields>;
}