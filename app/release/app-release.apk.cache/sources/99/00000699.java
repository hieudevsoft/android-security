package o00o0O;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public CharSequence f5264OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final TextPaint f5265OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f5266OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5267OooO0Oo;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f5273OooOO0O;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Layout.Alignment f5269OooO0o0 = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f5268OooO0o = Integer.MAX_VALUE;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f5270OooO0oO = 0.0f;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public float f5271OooO0oo = 1.0f;

    /* renamed from: OooO  reason: collision with root package name */
    public int f5263OooO = 1;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f5272OooOO0 = true;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public TextUtils.TruncateAt f5274OooOO0o = null;

    public OooOOO0(CharSequence charSequence, TextPaint textPaint, int i) {
        this.f5264OooO00o = charSequence;
        this.f5265OooO0O0 = textPaint;
        this.f5266OooO0OO = i;
        this.f5267OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() {
        if (this.f5264OooO00o == null) {
            this.f5264OooO00o = "";
        }
        int max = Math.max(0, this.f5266OooO0OO);
        CharSequence charSequence = this.f5264OooO00o;
        int i = this.f5268OooO0o;
        TextPaint textPaint = this.f5265OooO0O0;
        if (i == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f5274OooOO0o);
        }
        int min = Math.min(charSequence.length(), this.f5267OooO0Oo);
        this.f5267OooO0Oo = min;
        if (this.f5273OooOO0O && this.f5268OooO0o == 1) {
            this.f5269OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f5269OooO0o0);
        obtain.setIncludePad(this.f5272OooOO0);
        obtain.setTextDirection(this.f5273OooOO0O ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR);
        TextUtils.TruncateAt truncateAt = this.f5274OooOO0o;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f5268OooO0o);
        float f = this.f5270OooO0oO;
        if (f != 0.0f || this.f5271OooO0oo != 1.0f) {
            obtain.setLineSpacing(f, this.f5271OooO0oo);
        }
        if (this.f5268OooO0o > 1) {
            obtain.setHyphenationFrequency(this.f5263OooO);
        }
        return obtain.build();
    }
}