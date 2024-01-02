package oo0o0Oo;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import o00000.o00oOoo;
import o0OO00O.OooOo;

/* loaded from: classes.dex */
public abstract class OooO00o {
    static {
        new OooOO0(0);
        new OooOO0(3);
        new OooOO0(4);
        new OooOO0(2);
        new OooOO0(6);
        new OooOO0(7);
        new OooOO0(5);
        new OooOO0(8);
        int i = o00oOoo.CONFIG_NAME_FIELD_NUMBER;
        try {
            OooO00o();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void OooO00o() {
        o000000O.OooO00o.OooO00o();
        boolean z = false;
        OooOo.OooO0o0(new OooOO0(0), true);
        OooOo.OooO0o0(new OooOO0(2), true);
        OooOo.OooO0o0(new OooOO0(3), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
        }
        if (z) {
            OooOo.OooO0o0(new OooOO0(4), true);
        }
        OooOo.OooO0o0(new OooOO0(5), true);
        OooOo.OooO0o0(new OooOO0(6), true);
        OooOo.OooO0o0(new OooOO0(7), true);
        OooOo.OooO0o0(new OooOO0(8), true);
        OooOo.OooO0o(new OooO0OO());
    }
}