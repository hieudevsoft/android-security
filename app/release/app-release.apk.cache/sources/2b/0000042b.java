package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o0000OO0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o000OO f3669OooO0O0 = new o000OO();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000O00 f3670OooO00o;

    public o0000OO0() {
        o000O00 o000o00;
        o000O00[] o000o00Arr = new o000O00[2];
        o000o00Arr[0] = o0OOO0o.f3735OooO00o;
        try {
            o000o00 = (o000O00) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            o000o00 = f3669OooO0O0;
        }
        o000o00Arr[1] = o000o00;
        o0000O o0000o2 = new o0000O(o000o00Arr);
        Charset charset = o00000.f3650OooO00o;
        this.f3670OooO00o = o0000o2;
    }
}