package OooO0Oo;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class o0OOO0o {
    public static void OooO00o(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static OooOoOO.o00000O0 OooO0O0(Configuration configuration) {
        return OooOoOO.o00000O0.OooO00o(configuration.getLocales().toLanguageTags());
    }

    public static void OooO0OO(OooOoOO.o00000O0 o00000o02) {
        LocaleList.setDefault(LocaleList.forLanguageTags(((OooOoOO.o00000OO) o00000o02.f1207OooO00o).f1208OooO00o.toLanguageTags()));
    }

    public static void OooO0Oo(Configuration configuration, OooOoOO.o00000O0 o00000o02) {
        configuration.setLocales(LocaleList.forLanguageTags(((OooOoOO.o00000OO) o00000o02.f1207OooO00o).f1208OooO00o.toLanguageTags()));
    }
}