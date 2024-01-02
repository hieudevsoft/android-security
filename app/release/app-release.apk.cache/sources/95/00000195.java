package Oooo0;

import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o00Ooo {
    public static CharSequence OooO00o(PrecomputedText precomputedText) {
        return precomputedText;
    }

    public static String[] OooO0O0(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static PrecomputedText.Params OooO0OO(TextView textView) {
        return textView.getTextMetricsParams();
    }

    public static void OooO0Oo(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }
}