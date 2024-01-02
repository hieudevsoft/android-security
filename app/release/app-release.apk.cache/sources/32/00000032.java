package OooO0Oo;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class o00O0O {
    public static LocaleList OooO00o(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void OooO0O0(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}