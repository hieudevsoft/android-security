#include <jni.h>
#include <string>
extern "C"
JNIEXPORT jstring JNICALL
Java_hieubui_eup_android_1app_1security_NativeLib_getMyCode(JNIEnv *env, jobject thiz) {
    const char *cStr = "9roBmYG0n/I8V33NqToFacA6fJoRrq8NFkPQI2pRxWg=";
    return env->NewStringUTF(cStr);
}

extern "C"
JNIEXPORT jstring JNICALL
Java_hieubui_eup_android_1app_1security_NativeLib_getAbc(JNIEnv *env, jobject thiz) {
    return env->NewStringUTF("isPremium");
}