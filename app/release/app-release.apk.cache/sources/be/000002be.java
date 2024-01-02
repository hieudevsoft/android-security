package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o00O000 {
    public static StaticLayout OooO00o(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
        return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    public static int OooO0O0(TextView textView) {
        return textView.getMaxLines();
    }
}