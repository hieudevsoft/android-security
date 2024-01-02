package o000000;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* loaded from: classes.dex */
public final class OooO0OO implements o0OO00O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SecretKey f4009OooO00o;

    public OooO0OO(String str, KeyStore keyStore) {
        SecretKey secretKey = (SecretKey) keyStore.getKey(str, null);
        this.f4009OooO00o = secretKey;
        if (secretKey != null) {
            return;
        }
        throw new InvalidKeyException("Keystore cannot load the key with ID: " + str);
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        try {
            return OooO0Oo(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return OooO0Oo(bArr, bArr2);
        }
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        try {
            return OooO0OO(bArr, bArr2);
        } catch (GeneralSecurityException | ProviderException unused) {
            try {
                Thread.sleep((int) (Math.random() * 100.0d));
            } catch (InterruptedException unused2) {
            }
            return OooO0OO(bArr, bArr2);
        }
    }

    public final byte[] OooO0OO(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 28) {
            GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, 0, 12);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, this.f4009OooO00o, gCMParameterSpec);
            cipher.updateAAD(bArr2);
            return cipher.doFinal(bArr, 12, bArr.length - 12);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public final byte[] OooO0Oo(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483619) {
            byte[] bArr3 = new byte[bArr.length + 12 + 16];
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(1, this.f4009OooO00o);
            cipher.updateAAD(bArr2);
            cipher.doFinal(bArr, 0, bArr.length, bArr3, 12);
            System.arraycopy(cipher.getIV(), 0, bArr3, 0, 12);
            return bArr3;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
}