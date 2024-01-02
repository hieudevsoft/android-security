package o00000O0;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOo00 implements o0OO00O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Oooo0 f4048OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OO00O.OooOO0O f4049OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4050OooO0OO;

    public OooOo00(Oooo0 oooo0, o0OO00O.OooOO0O oooOO0O, int i) {
        this.f4048OooO00o = oooo0;
        this.f4049OooO0O0 = oooOO0O;
        this.f4050OooO0OO = i;
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        byte[] OooO00o2 = this.f4048OooO00o.OooO00o(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return o0000O00.OooO00o.Oooo(OooO00o2, this.f4049OooO0O0.OooO0O0(o0000O00.OooO00o.Oooo(bArr2, OooO00o2, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f4050OooO0OO;
        if (length >= i) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - i, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.f4049OooO0O0.OooO00o(copyOfRange2, o0000O00.OooO00o.Oooo(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.f4048OooO00o.OooO0O0(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}