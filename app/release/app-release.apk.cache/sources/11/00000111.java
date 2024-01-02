package OooOoo;

import android.graphics.Typeface;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextPaint;

/* loaded from: classes.dex */
public abstract /* synthetic */ class o00Ooo {
    public static /* synthetic */ PrecomputedText.Params.Builder OooO(TextPaint textPaint) {
        return new PrecomputedText.Params.Builder(textPaint);
    }

    public static /* bridge */ /* synthetic */ int OooO00o(Typeface typeface) {
        return typeface.getWeight();
    }

    public static /* bridge */ /* synthetic */ Typeface OooO0o0(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static /* bridge */ /* synthetic */ boolean OooOOoo(Spannable spannable) {
        return spannable instanceof PrecomputedText;
    }
}