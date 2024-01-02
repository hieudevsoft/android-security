package com.google.gson.internal.sql;

import com.google.gson.o0Oo0oo;

/* loaded from: classes.dex */
public abstract class OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final boolean f3928OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3929OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o0Oo0oo f3930OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o0Oo0oo f3931OooO0Oo;

    static {
        boolean z;
        o0Oo0oo o0oo0oo;
        try {
            Class.forName("java.sql.Date");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f3928OooO00o = z;
        if (z) {
            f3929OooO0O0 = SqlDateTypeAdapter.f3932OooO0O0;
            f3930OooO0OO = SqlTimeTypeAdapter.f3934OooO0O0;
            o0oo0oo = SqlTimestampTypeAdapter.f3936OooO0O0;
        } else {
            o0oo0oo = null;
            f3929OooO0O0 = null;
            f3930OooO0OO = null;
        }
        f3931OooO0Oo = o0oo0oo;
    }
}