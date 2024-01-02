package com.google.crypto.tink.shaded.protobuf;

import java.util.Collections;

/* loaded from: classes.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static volatile o00Oo0 f3724OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o00Oo0 f3725OooO0O0 = new o00Oo0();

    public o00Oo0() {
        Collections.emptyMap();
    }

    public static o00Oo0 OooO00o() {
        o00Oo0 o00oo0 = f3724OooO00o;
        if (o00oo0 == null) {
            synchronized (o00Oo0.class) {
                o00oo0 = f3724OooO00o;
                if (o00oo0 == null) {
                    Class cls = o00O0O.f3712OooO00o;
                    o00Oo0 o00oo02 = null;
                    if (cls != null) {
                        try {
                            o00oo02 = (o00Oo0) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
                        } catch (Exception unused) {
                        }
                    }
                    if (o00oo02 == null) {
                        o00oo02 = f3725OooO0O0;
                    }
                    f3724OooO00o = o00oo02;
                    o00oo0 = o00oo02;
                }
            }
        }
        return o00oo0;
    }
}