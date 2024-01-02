package o00000O0;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class OooO0OO implements o0OO00O.OooO00o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0O0O00.OooO00o f4028OooO0O0 = new o0O0O00.OooO00o(4);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SecretKeySpec f4029OooO00o;

    public OooO0OO(byte[] bArr) {
        o00Ooo.OooO00o(bArr.length);
        this.f4029OooO00o = new SecretKeySpec(bArr, "AES");
    }

    public static AlgorithmParameterSpec OooO0OO(byte[] bArr, int i) {
        boolean z;
        int i2;
        try {
            Class.forName("android.app.Application", false, null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            try {
                i2 = Class.forName("android.os.Build$VERSION").getDeclaredField("SDK_INT").getInt(null);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused2) {
                i2 = -1;
            }
            if (i2 <= 19) {
                return new IvParameterSpec(bArr, 0, i);
            }
        }
        return new GCMParameterSpec(128, bArr, 0, i);
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] OooO00o2 = o00Oo0.OooO00o(12);
            System.arraycopy(OooO00o2, 0, bArr3, 0, 12);
            AlgorithmParameterSpec OooO0OO2 = OooO0OO(OooO00o2, OooO00o2.length);
            o0O0O00.OooO00o oooO00o = f4028OooO0O0;
            ((Cipher) oooO00o.get()).init(1, this.f4029OooO00o, OooO0OO2);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) oooO00o.get()).updateAAD(bArr2);
            }
            int doFinal = ((Cipher) oooO00o.get()).doFinal(bArr, 0, bArr.length, bArr3, 12);
            if (doFinal == bArr.length + 16) {
                return bArr3;
            }
            throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(doFinal - bArr.length)));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            AlgorithmParameterSpec OooO0OO2 = OooO0OO(bArr, 12);
            o0O0O00.OooO00o oooO00o = f4028OooO0O0;
            ((Cipher) oooO00o.get()).init(2, this.f4029OooO00o, OooO0OO2);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) oooO00o.get()).updateAAD(bArr2);
            }
            return ((Cipher) oooO00o.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}