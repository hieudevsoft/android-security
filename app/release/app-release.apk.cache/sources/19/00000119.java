package OooOoo;

import OooOooO.o0000oo;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextPaint f1230OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final TextDirectionHeuristic f1231OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1232OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1233OooO0Oo;

    public oo000o(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f1230OooO00o = textPaint;
        textDirection = params.getTextDirection();
        this.f1231OooO0O0 = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f1232OooO0OO = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f1233OooO0Oo = hyphenationFrequency;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof oo000o)) {
            return false;
        }
        oo000o oo000oVar = (oo000o) obj;
        if (this.f1232OooO0OO == oo000oVar.f1232OooO0OO && this.f1233OooO0Oo == oo000oVar.f1233OooO0Oo) {
            TextPaint textPaint = this.f1230OooO00o;
            float textSize = textPaint.getTextSize();
            TextPaint textPaint2 = oo000oVar.f1230OooO00o;
            if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags() && textPaint.getTextLocales().equals(textPaint2.getTextLocales()) && (textPaint.getTypeface() != null ? textPaint.getTypeface().equals(textPaint2.getTypeface()) : textPaint2.getTypeface() == null)) {
                z = true;
                if (z && this.f1231OooO0O0 == oo000oVar.f1231OooO0O0) {
                    return true;
                }
                return false;
            }
        }
        z = false;
        if (z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        TextPaint textPaint = this.f1230OooO00o;
        return o0000oo.OooO0O0(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocales(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), this.f1231OooO0O0, Integer.valueOf(this.f1232OooO0OO), Integer.valueOf(this.f1233OooO0Oo));
    }

    public final String toString() {
        String fontVariationSettings;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f1230OooO00o;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        sb.append(", textLocale=" + textPaint.getTextLocales());
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i >= 26) {
            StringBuilder sb3 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb3.append(fontVariationSettings);
            sb.append(sb3.toString());
        }
        sb.append(", textDir=" + this.f1231OooO0O0);
        sb.append(", breakStrategy=" + this.f1232OooO0OO);
        sb.append(", hyphenationFrequency=" + this.f1233OooO0Oo);
        sb.append("}");
        return sb.toString();
    }

    public oo000o(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = o00Ooo.OooO(textPaint).setBreakStrategy(i);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f1230OooO00o = textPaint;
        this.f1231OooO0O0 = textDirectionHeuristic;
        this.f1232OooO0OO = i;
        this.f1233OooO0Oo = i2;
    }
}