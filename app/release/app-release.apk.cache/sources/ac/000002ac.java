package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o000O {
    public static LocaleList OooO00o(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void OooO0O0(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}