package OooOoOO;

import OooOoo.o00Oo0;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o000000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Locale[] f1205OooO00o = {new Locale("en", "XA"), new Locale("ar", "XB")};

    public static Locale OooO00o(String str) {
        return Locale.forLanguageTag(str);
    }

    public static boolean OooO0O0(Locale locale, Locale locale2) {
        boolean z;
        boolean z2;
        if (locale.equals(locale2)) {
            return true;
        }
        if (!locale.getLanguage().equals(locale2.getLanguage())) {
            return false;
        }
        Locale[] localeArr = f1205OooO00o;
        int length = localeArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (localeArr[i].equals(locale)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            int length2 = localeArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length2) {
                    if (localeArr[i2].equals(locale2)) {
                        z2 = true;
                        break;
                    }
                    i2++;
                } else {
                    z2 = false;
                    break;
                }
            }
            if (!z2) {
                String OooO0OO2 = o00Oo0.OooO0OO(o00Oo0.OooO00o(o00Oo0.OooO0O0(locale)));
                if (OooO0OO2.isEmpty()) {
                    String country = locale.getCountry();
                    if (country.isEmpty() || country.equals(locale2.getCountry())) {
                        return true;
                    }
                    return false;
                }
                return OooO0OO2.equals(o00Oo0.OooO0OO(o00Oo0.OooO00o(o00Oo0.OooO0O0(locale2))));
            }
        }
        return false;
    }
}