package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class oo0o0Oo extends ReplacementSpan {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O0O f2730OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Paint.FontMetricsInt f2729OooO00o = new Paint.FontMetricsInt();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f2731OooO0OO = 1.0f;

    public oo0o0Oo(o00O0O o00o0o) {
        if (o00o0o != null) {
            this.f2730OooO0O0 = o00o0o;
            return;
        }
        throw new NullPointerException("metadata cannot be null");
    }

    @Override // android.text.style.ReplacementSpan
    /* renamed from: OooO00o */
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        short s;
        Paint.FontMetricsInt fontMetricsInt2 = this.f2729OooO00o;
        paint.getFontMetricsInt(fontMetricsInt2);
        float abs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        o00O0O o00o0o = this.f2730OooO0O0;
        Oooo0o.o00Oo0 OooO0OO2 = o00o0o.OooO0OO();
        int OooO00o2 = OooO0OO2.OooO00o(14);
        short s2 = 0;
        if (OooO00o2 != 0) {
            s = ((ByteBuffer) OooO0OO2.f1460OooO0Oo).getShort(OooO00o2 + OooO0OO2.f1457OooO00o);
        } else {
            s = 0;
        }
        this.f2731OooO0OO = abs / s;
        Oooo0o.o00Oo0 OooO0OO3 = o00o0o.OooO0OO();
        int OooO00o3 = OooO0OO3.OooO00o(14);
        if (OooO00o3 != 0) {
            ((ByteBuffer) OooO0OO3.f1460OooO0Oo).getShort(OooO00o3 + OooO0OO3.f1457OooO00o);
        }
        Oooo0o.o00Oo0 OooO0OO4 = o00o0o.OooO0OO();
        int OooO00o4 = OooO0OO4.OooO00o(12);
        if (OooO00o4 != 0) {
            s2 = ((ByteBuffer) OooO0OO4.f1460OooO0Oo).getShort(OooO00o4 + OooO0OO4.f1457OooO00o);
        }
        short s3 = (short) (s2 * this.f2731OooO0OO);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        OooOo.OooO00o().getClass();
        o00O0O o00o0o = this.f2730OooO0O0;
        OooO0o.OooOOO0 oooOOO0 = o00o0o.f2699OooO0O0;
        Typeface typeface = paint.getTypeface();
        paint.setTypeface((Typeface) oooOOO0.f272OooO0Oo);
        int i6 = o00o0o.f2698OooO00o * 2;
        canvas.drawText((char[]) oooOOO0.f270OooO0O0, i6, 2, f, i4, paint);
        paint.setTypeface(typeface);
    }
}