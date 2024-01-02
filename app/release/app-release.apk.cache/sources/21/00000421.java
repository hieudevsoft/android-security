package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class o00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Charset f3650OooO00o = Charset.forName("UTF-8");

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final byte[] f3651OooO0O0;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f3651OooO0O0 = bArr;
        ByteBuffer.wrap(bArr);
        if ((0 - 0) + 0 <= Integer.MAX_VALUE) {
            return;
        }
        try {
            throw o00000O.OooO0o();
        } catch (o00000O e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int OooO00o(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int OooO0O0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static o0O0O00 OooO0OO(Object obj, Object obj2) {
        o0O0O00 o0o0o00 = (o0O0O00) ((OooO0O0) obj);
        o0Oo0oo o0oo0oo = (o0Oo0oo) o0o0o00.OooO0oO(oo0o0Oo.NEW_BUILDER);
        o0oo0oo.OooO0OO();
        o0Oo0oo.OooO0Oo(o0oo0oo.f3737OooO0O0, o0o0o00);
        OooO0O0 oooO0O0 = (OooO0O0) obj2;
        if (o0oo0oo.f3736OooO00o.getClass().isInstance(oooO0O0)) {
            o0oo0oo.OooO0OO();
            o0Oo0oo.OooO0Oo(o0oo0oo.f3737OooO0O0, (o0O0O00) oooO0O0);
            return o0oo0oo.OooO0O0();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}