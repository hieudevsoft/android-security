package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Class f3618OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final boolean f3619OooO0O0;

    static {
        Class<?> cls;
        boolean z;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f3618OooO00o = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        if (cls2 != null) {
            z = true;
        } else {
            z = false;
        }
        f3619OooO0O0 = z;
    }

    public static boolean OooO00o() {
        return (f3618OooO00o == null || f3619OooO0O0) ? false : true;
    }
}