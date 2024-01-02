package o00000O0;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class OooO0O0 implements o0OO00O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final byte[] f4024OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final byte[] f4025OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final SecretKeySpec f4026OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f4027OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final o0O0O00.OooO00o f4023OooO0o0 = new o0O0O00.OooO00o(2);

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o0O0O00.OooO00o f4022OooO0o = new o0O0O00.OooO00o(3);

    public OooO0O0(int i, byte[] bArr) {
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f4027OooO0Oo = i;
        o00Ooo.OooO00o(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f4026OooO0OO = secretKeySpec;
        Cipher cipher = (Cipher) f4023OooO0o0.get();
        cipher.init(1, secretKeySpec);
        byte[] OooO0OO2 = OooO0OO(cipher.doFinal(new byte[16]));
        this.f4024OooO00o = OooO0OO2;
        this.f4025OooO0O0 = OooO0OO(OooO0OO2);
    }

    public static byte[] OooO0OO(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            int i2 = i + 1;
            bArr2[i] = (byte) (((bArr[i] << 1) ^ ((bArr[i2] & 255) >>> 7)) & 255);
            i = i2;
        }
        bArr2[15] = (byte) ((bArr[15] << 1) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    public static byte[] OooO0o0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f4027OooO0Oo;
        if (length <= (Integer.MAX_VALUE - i) - 16) {
            byte[] bArr3 = new byte[bArr.length + i + 16];
            byte[] OooO00o2 = o00Oo0.OooO00o(i);
            System.arraycopy(OooO00o2, 0, bArr3, 0, i);
            Cipher cipher = (Cipher) f4023OooO0o0.get();
            SecretKeySpec secretKeySpec = this.f4026OooO0OO;
            cipher.init(1, secretKeySpec);
            byte[] OooO0Oo2 = OooO0Oo(cipher, 0, OooO00o2, 0, OooO00o2.length);
            byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
            byte[] OooO0Oo3 = OooO0Oo(cipher, 1, bArr4, 0, bArr4.length);
            Cipher cipher2 = (Cipher) f4022OooO0o.get();
            cipher2.init(1, secretKeySpec, new IvParameterSpec(OooO0Oo2));
            cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f4027OooO0Oo);
            byte[] OooO0Oo4 = OooO0Oo(cipher, 2, bArr3, this.f4027OooO0Oo, bArr.length);
            int length2 = bArr.length + i;
            for (int i2 = 0; i2 < 16; i2++) {
                bArr3[length2 + i2] = (byte) ((OooO0Oo3[i2] ^ OooO0Oo2[i2]) ^ OooO0Oo4[i2]);
            }
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = this.f4027OooO0Oo;
        int i2 = (length - i) - 16;
        if (i2 >= 0) {
            Cipher cipher = (Cipher) f4023OooO0o0.get();
            SecretKeySpec secretKeySpec = this.f4026OooO0OO;
            cipher.init(1, secretKeySpec);
            byte[] OooO0Oo2 = OooO0Oo(cipher, 0, bArr, 0, this.f4027OooO0Oo);
            byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
            byte[] OooO0Oo3 = OooO0Oo(cipher, 1, bArr3, 0, bArr3.length);
            byte[] OooO0Oo4 = OooO0Oo(cipher, 2, bArr, this.f4027OooO0Oo, i2);
            int length2 = bArr.length - 16;
            byte b = 0;
            for (int i3 = 0; i3 < 16; i3++) {
                b = (byte) (b | (((bArr[length2 + i3] ^ OooO0Oo3[i3]) ^ OooO0Oo2[i3]) ^ OooO0Oo4[i3]));
            }
            if (b == 0) {
                Cipher cipher2 = (Cipher) f4022OooO0o.get();
                cipher2.init(1, secretKeySpec, new IvParameterSpec(OooO0Oo2));
                return cipher2.doFinal(bArr, i, i2);
            }
            throw new AEADBadTagException("tag mismatch");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] OooO0Oo(Cipher cipher, int i, byte[] bArr, int i2, int i3) {
        byte[] copyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        byte[] bArr3 = this.f4024OooO00o;
        if (i3 == 0) {
            return cipher.doFinal(OooO0o0(bArr2, bArr3));
        }
        byte[] doFinal = cipher.doFinal(bArr2);
        int i4 = 0;
        while (i3 - i4 > 16) {
            for (int i5 = 0; i5 < 16; i5++) {
                doFinal[i5] = (byte) (doFinal[i5] ^ bArr[(i2 + i4) + i5]);
            }
            doFinal = cipher.doFinal(doFinal);
            i4 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i4 + i2, i2 + i3);
        if (copyOfRange.length == 16) {
            copyOf = OooO0o0(copyOfRange, bArr3);
        } else {
            copyOf = Arrays.copyOf(this.f4025OooO0O0, 16);
            for (int i6 = 0; i6 < copyOfRange.length; i6++) {
                copyOf[i6] = (byte) (copyOf[i6] ^ copyOfRange[i6]);
            }
            copyOf[copyOfRange.length] = (byte) (copyOf[copyOfRange.length] ^ 128);
        }
        return cipher.doFinal(OooO0o0(doFinal, copyOf));
    }
}