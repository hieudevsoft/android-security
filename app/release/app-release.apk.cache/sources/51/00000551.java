package o00000O0;

import java.security.SecureRandom;

/* loaded from: classes.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0O0O00.OooO00o f4054OooO00o = new o0O0O00.OooO00o(5);

    public static byte[] OooO00o(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f4054OooO00o.get()).nextBytes(bArr);
        return bArr;
    }
}