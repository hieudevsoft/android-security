package o00000O0;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class OooO00o implements Oooo0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o0O0O00.OooO00o f4018OooO0Oo = new o0O0O00.OooO00o(1);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SecretKeySpec f4019OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4020OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4021OooO0OO;

    public OooO00o(int i, byte[] bArr) {
        o00Ooo.OooO00o(bArr.length);
        this.f4019OooO00o = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f4018OooO0Oo.get()).getBlockSize();
        this.f4021OooO0OO = blockSize;
        if (i < 12 || i > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f4020OooO0O0 = i;
    }

    @Override // o00000O0.Oooo0
    public final byte[] OooO00o(byte[] bArr) {
        int length = bArr.length;
        int i = this.f4020OooO0O0;
        int i2 = Integer.MAX_VALUE - i;
        if (length <= i2) {
            byte[] bArr2 = new byte[bArr.length + i];
            byte[] OooO00o2 = o00Oo0.OooO00o(i);
            System.arraycopy(OooO00o2, 0, bArr2, 0, i);
            OooO0OO(bArr, 0, bArr.length, bArr2, this.f4020OooO0O0, OooO00o2, true);
            return bArr2;
        }
        throw new GeneralSecurityException(OooO0O0.OooO00o.OooO0O0("plaintext length can not exceed ", i2));
    }

    @Override // o00000O0.Oooo0
    public final byte[] OooO0O0(byte[] bArr) {
        int length = bArr.length;
        int i = this.f4020OooO0O0;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int length2 = bArr.length;
            int i2 = this.f4020OooO0O0;
            byte[] bArr3 = new byte[length2 - i2];
            OooO0OO(bArr, i2, bArr.length - i2, bArr3, 0, bArr2, false);
            return bArr3;
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final void OooO0OO(byte[] bArr, int i, int i2, byte[] bArr2, int i3, byte[] bArr3, boolean z) {
        Cipher cipher = (Cipher) f4018OooO0Oo.get();
        byte[] bArr4 = new byte[this.f4021OooO0OO];
        System.arraycopy(bArr3, 0, bArr4, 0, this.f4020OooO0O0);
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr4);
        cipher.init(z ? 1 : 2, this.f4019OooO00o, ivParameterSpec);
        if (cipher.doFinal(bArr, i, i2, bArr2, i3) != i2) {
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
    }
}