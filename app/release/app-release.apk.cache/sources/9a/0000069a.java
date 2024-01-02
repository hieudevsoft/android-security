package o00o0O;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class OooOOOO {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f5277OooO0OO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public oo000o.OooO0o f5279OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public WeakReference f5280OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextPaint f5275OooO00o = new TextPaint(1);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ooOO.Oooo000 f5276OooO0O0 = new ooOO.Oooo000(1, this);

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5278OooO0Oo = true;

    public OooOOOO(OooOOO oooOOO) {
        this.f5280OooO0o0 = new WeakReference(null);
        this.f5280OooO0o0 = new WeakReference(oooOOO);
    }

    public final float OooO00o(String str) {
        float measureText;
        if (!this.f5278OooO0Oo) {
            return this.f5277OooO0OO;
        }
        TextPaint textPaint = this.f5275OooO00o;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f5277OooO0OO = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f5278OooO0Oo = false;
        return this.f5277OooO0OO;
    }
}