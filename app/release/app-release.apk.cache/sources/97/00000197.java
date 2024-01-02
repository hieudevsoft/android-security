package Oooo0;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class o0OoOo0 {
    public static Drawable[] OooO00o(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int OooO0O0(View view) {
        return view.getLayoutDirection();
    }

    public static int OooO0OO(View view) {
        return view.getTextDirection();
    }

    public static Locale OooO0Oo(TextView textView) {
        return textView.getTextLocale();
    }

    public static void OooO0o(TextView textView, int i, int i2, int i3, int i4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    public static void OooO0o0(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void OooO0oO(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public static void OooO0oo(View view, int i) {
        view.setTextDirection(i);
    }
}