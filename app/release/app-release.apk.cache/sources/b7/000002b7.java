package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class o000OOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextView f2313OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0Oo.o0000OO0 f2314OooO0O0;

    public o000OOo(TextView textView) {
        this.f2313OooO00o = textView;
        this.f2314OooO0O0 = new OooO0Oo.o0000OO0(textView);
    }

    public final InputFilter[] OooO00o(InputFilter[] inputFilterArr) {
        return ((o0ooOO0.OooOOO0) this.f2314OooO0O0.f183OooO0O0).OooO0oO(inputFilterArr);
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f2313OooO00o.getContext().obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f17OooO, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            OooO0Oo(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void OooO0OO(boolean z) {
        ((o0ooOO0.OooOOO0) this.f2314OooO0O0.f183OooO0O0).OooOo00(z);
    }

    public final void OooO0Oo(boolean z) {
        ((o0ooOO0.OooOOO0) this.f2314OooO0O0.f183OooO0O0).OooOo0o(z);
    }
}