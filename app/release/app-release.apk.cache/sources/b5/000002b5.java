package androidx.appcompat.widget;

import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class o000OO00 {
    public static int OooO00o(TextView textView) {
        return textView.getAutoSizeStepGranularity();
    }

    public static void OooO0O0(TextView textView, int i, int i2, int i3, int i4) {
        textView.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    public static void OooO0OO(TextView textView, int[] iArr, int i) {
        textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    public static boolean OooO0Oo(TextView textView, String str) {
        return textView.setFontVariationSettings(str);
    }
}