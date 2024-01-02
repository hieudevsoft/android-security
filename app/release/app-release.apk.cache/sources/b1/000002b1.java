package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o000O0O0 {
    public static Drawable[] OooO00o(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void OooO0O0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void OooO0OO(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }
}