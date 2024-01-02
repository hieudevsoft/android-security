package OooOoo;

import android.icu.util.ULocale;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o00Oo0 {
    public static ULocale OooO00o(Object obj) {
        return ULocale.addLikelySubtags((ULocale) obj);
    }

    public static ULocale OooO0O0(Locale locale) {
        return ULocale.forLocale(locale);
    }

    public static String OooO0OO(Object obj) {
        return ((ULocale) obj).getScript();
    }
}