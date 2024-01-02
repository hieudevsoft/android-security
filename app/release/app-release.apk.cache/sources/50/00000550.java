package o00000O0;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class o00O0O implements o0OO00O.OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000000o.OooO0o f4052OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4053OooO0O0;

    public o00O0O(o000000o.OooO0o oooO0o, int i) {
        this.f4052OooO00o = oooO0o;
        this.f4053OooO0O0 = i;
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        oooO0o.OooO0o(i, new byte[0]);
    }

    @Override // o0OO00O.OooOO0O
    public final void OooO00o(byte[] bArr, byte[] bArr2) {
        if (!o0000O00.OooO00o.Ooooooo(OooO0O0(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // o0OO00O.OooOO0O
    public final byte[] OooO0O0(byte[] bArr) {
        return this.f4052OooO00o.OooO0o(this.f4053OooO0O0, bArr);
    }
}