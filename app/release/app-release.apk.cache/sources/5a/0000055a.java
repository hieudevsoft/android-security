package o00000oO;

import OoooOOo.o0OO0;
import OoooOOo.o0OO00o0;
import OoooOOo.o0OO0O0;
import OoooOOo.o0OOooO0;
import android.security.keystore.KeyGenParameterSpec;
import hieubui.eup.android_app_security.MainActivity;
import java.security.KeyStore;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import o000000.OooO0O0;
import o0000O00.OooO00o;
import o0OO00O.OooO0OO;

/* loaded from: classes.dex */
public final class OooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0OO0O0 f4068OooO00o;

    public OooO(MainActivity mainActivity) {
        OooO0O0 oooO0O0;
        OooO0OO OooO0OO2;
        OooO0O0 oooO0O02;
        OooO0OO OooO0OO3;
        OooO00o.OooOoo0(mainActivity, "context");
        KeyGenParameterSpec keyGenParameterSpec = o0OOooO0.f1593OooO00o;
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired() && keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1) {
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        String keystoreAlias = keyGenParameterSpec.getKeystoreAlias();
                        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                        keyStore.load(null);
                        if (!keyStore.containsAlias(keystoreAlias)) {
                            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            keyGenerator.init(keyGenParameterSpec);
                            keyGenerator.generateKey();
                        }
                        String keystoreAlias2 = keyGenParameterSpec.getKeystoreAlias();
                        OooO00o.OooOoOO(keystoreAlias2, "getOrCreate(...)");
                        o0OO00o0 o0oo00o0 = o0OO00o0.f1585OooO0O0;
                        o0OO0 o0oo0 = o0OO0.f1578OooO0O0;
                        int i = o000OOo.OooO00o.f4876OooO00o;
                        o0OO00O.OooOo.OooO0o0(new oo0o0Oo.OooOO0(9), true);
                        o0OO00O.OooOo.OooO0o(new o000OOo.OooO0OO());
                        oo0o0Oo.OooO00o.OooO00o();
                        o000000.OooO00o oooO00o = new o000000.OooO00o();
                        oooO00o.f4006OooO0o0 = o0oo00o0.f1587OooO00o;
                        oooO00o.OooO0OO(mainActivity, "__androidx_security_crypto_encrypted_prefs_key_keyset__");
                        String concat = "android-keystore://".concat(keystoreAlias2);
                        if (concat.startsWith("android-keystore://")) {
                            oooO00o.f4003OooO0OO = concat;
                            synchronized (oooO00o) {
                                if (oooO00o.f4003OooO0OO != null) {
                                    oooO00o.f4004OooO0Oo = oooO00o.OooO0O0();
                                }
                                oooO00o.f4005OooO0o = oooO00o.OooO00o();
                                oooO0O0 = new OooO0O0(oooO00o);
                            }
                            synchronized (oooO0O0) {
                                OooO0OO2 = oooO0O0.f4008OooO00o.OooO0OO();
                            }
                            o000000.OooO00o oooO00o2 = new o000000.OooO00o();
                            oooO00o2.f4006OooO0o0 = o0oo0.f1580OooO00o;
                            oooO00o2.OooO0OO(mainActivity, "__androidx_security_crypto_encrypted_prefs_value_keyset__");
                            String concat2 = "android-keystore://".concat(keystoreAlias2);
                            if (concat2.startsWith("android-keystore://")) {
                                oooO00o2.f4003OooO0OO = concat2;
                                synchronized (oooO00o2) {
                                    if (oooO00o2.f4003OooO0OO != null) {
                                        oooO00o2.f4004OooO0Oo = oooO00o2.OooO0O0();
                                    }
                                    oooO00o2.f4005OooO0o = oooO00o2.OooO00o();
                                    oooO0O02 = new OooO0O0(oooO00o2);
                                }
                                synchronized (oooO0O02) {
                                    OooO0OO3 = oooO0O02.f4008OooO00o.OooO0OO();
                                }
                                o0OO00O.OooO00o oooO00o3 = (o0OO00O.OooO00o) OooO0OO3.OooO0Oo(o0OO00O.OooO00o.class);
                                this.f4068OooO00o = new o0OO0O0(mainActivity.getSharedPreferences("encrypted_shared_preference", 0), oooO00o3, (o0OO00O.OooO0O0) OooO0OO2.OooO0Oo(o0OO00O.OooO0O0.class));
                                return;
                            }
                            throw new IllegalArgumentException("key URI must start with android-keystore://");
                        }
                        throw new IllegalArgumentException("key URI must start with android-keystore://");
                    }
                    throw new IllegalArgumentException("invalid padding mode, want NoPadding got " + Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
                }
                throw new IllegalArgumentException("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got " + keyGenParameterSpec.getPurposes());
            }
            throw new IllegalArgumentException("invalid block mode, want GCM got " + Arrays.toString(keyGenParameterSpec.getBlockModes()));
        }
        throw new IllegalArgumentException("invalid key size, want 256 bits got " + keyGenParameterSpec.getKeySize() + " bits");
    }
}