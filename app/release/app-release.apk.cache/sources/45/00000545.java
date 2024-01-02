package o00000O0;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class OooO0o implements o0OO00O.OooO0O0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final List f4030OooO0OO = Arrays.asList(64);

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final byte[] f4031OooO0Oo = new byte[16];

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final byte[] f4032OooO0o0 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.activity.result.OooO0o f4033OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final byte[] f4034OooO0O0;

    public OooO0o(byte[] bArr) {
        if (f4030OooO0OO.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.f4034OooO0O0 = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.f4033OooO00o = new androidx.activity.result.OooO0o(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    @Override // o0OO00O.OooO0O0
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher cipher = (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/CTR/NoPadding");
            byte[] OooO0OO2 = OooO0OO(bArr2, bArr);
            byte[] bArr3 = (byte[]) OooO0OO2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(1, new SecretKeySpec(this.f4034OooO0O0, "AES"), new IvParameterSpec(bArr3));
            return o0000O00.OooO00o.Oooo(OooO0OO2, cipher.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // o0OO00O.OooO0O0
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        boolean z;
        if (bArr.length >= 16) {
            Cipher cipher = (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            cipher.init(2, new SecretKeySpec(this.f4034OooO0O0, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = cipher.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null) {
                try {
                    Class.forName("android.app.Application", false, null);
                    z = true;
                } catch (Exception unused) {
                    z = false;
                }
                if (z) {
                    doFinal = new byte[0];
                }
            }
            if (o0000O00.OooO00o.Ooooooo(copyOfRange, OooO0OO(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final byte[] OooO0OO(byte[]... bArr) {
        byte[] o00O0O0;
        int length = bArr.length;
        androidx.activity.result.OooO0o oooO0o = this.f4033OooO00o;
        if (length == 0) {
            return oooO0o.OooO0o(16, f4032OooO0o0);
        }
        byte[] OooO0o2 = oooO0o.OooO0o(16, f4031OooO0Oo);
        for (int i = 0; i < bArr.length - 1; i++) {
            byte[] bArr2 = bArr[i];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            OooO0o2 = o0000O00.OooO00o.o00O0O0(o0000O00.OooO00o.OoooOoo(OooO0o2), oooO0o.OooO0o(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length >= OooO0o2.length) {
                int length2 = bArr3.length - OooO0o2.length;
                o00O0O0 = Arrays.copyOf(bArr3, bArr3.length);
                for (int i2 = 0; i2 < OooO0o2.length; i2++) {
                    int i3 = length2 + i2;
                    o00O0O0[i3] = (byte) (o00O0O0[i3] ^ OooO0o2[i2]);
                }
            } else {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
        } else if (bArr3.length < 16) {
            byte[] copyOf = Arrays.copyOf(bArr3, 16);
            copyOf[bArr3.length] = Byte.MIN_VALUE;
            o00O0O0 = o0000O00.OooO00o.o00O0O0(copyOf, o0000O00.OooO00o.OoooOoo(OooO0o2));
        } else {
            throw new IllegalArgumentException("x must be smaller than a block.");
        }
        return oooO0o.OooO0o(16, o00O0O0);
    }
}