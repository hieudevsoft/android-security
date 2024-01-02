package o0O0O00;

import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import o00000O0.o00Oo0;
import o00000O0.o00Ooo;

/* loaded from: classes.dex */
public final class OooO0O0 implements o0OO00O.OooO00o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooO00o f5299OooO0O0 = new OooO00o(0);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SecretKeySpec f5300OooO00o;

    public OooO0O0(byte[] bArr) {
        o00Ooo.OooO00o(bArr.length);
        this.f5300OooO00o = new SecretKeySpec(bArr, "AES");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.spec.AlgorithmParameterSpec OooO0OO(byte[] r3, int r4) {
        /*
            r0 = 0
            java.lang.String r1 = "javax.crypto.spec.GCMParameterSpec"
            java.lang.Class.forName(r1)     // Catch: java.lang.ClassNotFoundException -> Le
            javax.crypto.spec.GCMParameterSpec r1 = new javax.crypto.spec.GCMParameterSpec     // Catch: java.lang.ClassNotFoundException -> Le
            r2 = 128(0x80, float:1.8E-43)
            r1.<init>(r2, r3, r0, r4)     // Catch: java.lang.ClassNotFoundException -> Le
            return r1
        Le:
            java.lang.String r1 = "android.app.Application"
            r2 = 0
            java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.Exception -> L16
            r1 = 1
            goto L17
        L16:
            r1 = r0
        L17:
            if (r1 == 0) goto L1f
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec
            r1.<init>(r3, r0, r4)
            return r1
        L1f:
            java.security.GeneralSecurityException r3 = new java.security.GeneralSecurityException
            java.lang.String r4 = "cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0O0O00.OooO0O0.OooO0OO(byte[], int):java.security.spec.AlgorithmParameterSpec");
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            byte[] OooO00o2 = o00Oo0.OooO00o(12);
            System.arraycopy(OooO00o2, 0, bArr3, 0, 12);
            AlgorithmParameterSpec OooO0OO2 = OooO0OO(OooO00o2, OooO00o2.length);
            OooO00o oooO00o = f5299OooO0O0;
            ((Cipher) oooO00o.get()).init(1, this.f5300OooO00o, OooO0OO2);
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
            OooO00o oooO00o = f5299OooO0O0;
            ((Cipher) oooO00o.get()).init(2, this.f5300OooO00o, OooO0OO2);
            if (bArr2 != null && bArr2.length != 0) {
                ((Cipher) oooO00o.get()).updateAAD(bArr2);
            }
            return ((Cipher) oooO00o.get()).doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}