package OoooOOo;

import android.security.keystore.KeyGenParameterSpec;

/* loaded from: classes.dex */
public abstract class o0OOooO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final KeyGenParameterSpec f1593OooO00o = new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
}