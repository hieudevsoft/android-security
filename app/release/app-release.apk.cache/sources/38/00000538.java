package o000000;

import android.security.keystore.KeyGenParameterSpec;
import androidx.appcompat.widget.o0O0O00;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import o00000O0.o00Oo0;
import o00000O0.o00Ooo;
import o0OO00O.OooO;

/* loaded from: classes.dex */
public final class OooO0o implements OooO {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final /* synthetic */ int f4010OooO0OO = 0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f4011OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public KeyStore f4012OooO0O0;

    public OooO0o() {
        this(new o0O0O00(9, (OooO0O0.OooO00o) null));
    }

    public static void OooO00o(String str) {
        if (new OooO0o().OooO0OO(str)) {
            throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
        }
        String OooO0O02 = o00Ooo.OooO0O0(str);
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(new KeyGenParameterSpec.Builder(OooO0O02, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
        keyGenerator.generateKey();
    }

    public final synchronized OooO0OO OooO0O0(String str) {
        OooO0OO oooO0OO;
        String str2 = this.f4011OooO00o;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f4011OooO00o, str));
        }
        oooO0OO = new OooO0OO(o00Ooo.OooO0O0(str), this.f4012OooO0O0);
        byte[] OooO00o2 = o00Oo0.OooO00o(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(OooO00o2, oooO0OO.OooO0O0(oooO0OO.OooO00o(OooO00o2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return oooO0OO;
    }

    public final synchronized boolean OooO0OO(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            try {
                Thread.sleep(20L);
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                this.f4012OooO0O0 = keyStore;
                keyStore.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f4012OooO0O0.containsAlias(str2);
        }
        return this.f4012OooO0O0.containsAlias(o00Ooo.OooO0O0(str));
    }

    public OooO0o(o0O0O00 o0o0o00) {
        this.f4011OooO00o = (String) o0o0o00.f2440OooO0O0;
        this.f4012OooO0O0 = (KeyStore) o0o0o00.f2441OooO0OO;
    }
}