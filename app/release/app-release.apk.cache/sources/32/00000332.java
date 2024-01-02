package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class o000OOo implements Spannable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2693OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Spannable f2694OooO0O0;

    public o000OOo(Spannable spannable) {
        this.f2694OooO0O0 = spannable;
    }

    public final void OooO00o() {
        o0ooOO0.OooOOO0 o0o0o00;
        Spannable spannable = this.f2694OooO0O0;
        if (!this.f2693OooO00o) {
            if (Build.VERSION.SDK_INT < 28) {
                o0o0o00 = new o0ooOO0.OooOOO0(12, (Object) null);
            } else {
                o0o0o00 = new o0O0O00();
            }
            if (o0o0o00.OooOOo0(spannable)) {
                this.f2694OooO0O0 = new SpannableString(spannable);
            }
        }
        this.f2693OooO00o = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.f2694OooO0O0.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f2694OooO0O0.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f2694OooO0O0.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f2694OooO0O0.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f2694OooO0O0.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f2694OooO0O0.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.f2694OooO0O0.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f2694OooO0O0.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.f2694OooO0O0.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        OooO00o();
        this.f2694OooO0O0.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        OooO00o();
        this.f2694OooO0O0.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.f2694OooO0O0.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f2694OooO0O0.toString();
    }

    public o000OOo(CharSequence charSequence) {
        this.f2694OooO0O0 = new SpannableString(charSequence);
    }
}