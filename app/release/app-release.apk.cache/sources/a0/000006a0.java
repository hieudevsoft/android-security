package o0O0O00;

import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import o00000.o000;
import o00000O0.OooOo;
import o00000O0.o00Oo0;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class OooO00o extends ThreadLocal {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5298OooO00o;

    public final Cipher OooO00o() {
        switch (this.f5298OooO00o) {
            case 0:
                try {
                    return (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/GCM-SIV/NoPadding");
                } catch (GeneralSecurityException e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                try {
                    return (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/CTR/NoPadding");
                } catch (GeneralSecurityException e2) {
                    throw new IllegalStateException(e2);
                }
            case 2:
                try {
                    return (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/ECB/NOPADDING");
                } catch (GeneralSecurityException e3) {
                    throw new IllegalStateException(e3);
                }
            case 3:
                try {
                    return (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/CTR/NOPADDING");
                } catch (GeneralSecurityException e4) {
                    throw new IllegalStateException(e4);
                }
            default:
                try {
                    return (Cipher) OooOo.f4045OooO0o0.OooO00o("AES/GCM/NoPadding");
                } catch (GeneralSecurityException e5) {
                    throw new IllegalStateException(e5);
                }
        }
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f5298OooO00o) {
            case 0:
                return OooO00o();
            case 1:
                return OooO00o();
            case 2:
                return OooO00o();
            case 3:
                return OooO00o();
            case 4:
                return OooO00o();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                OooO00o oooO00o = o00Oo0.f4054OooO00o;
                SecureRandom secureRandom = new SecureRandom();
                secureRandom.nextLong();
                return secureRandom;
            case 6:
                return new Random();
            default:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(OooOO0O.f4408OooO0o0);
                return simpleDateFormat;
        }
    }
}