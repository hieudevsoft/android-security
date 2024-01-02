package Oooo0oO;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.OooOo;

/* loaded from: classes.dex */
public final class o0O0o implements InputFilter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextView f1504OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0oOOo f1505OooO0O0;

    public o0O0o(TextView textView) {
        this.f1504OooO00o = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f1504OooO00o;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int OooO0O02 = OooOo.OooO00o().OooO0O0();
        if (OooO0O02 != 0) {
            boolean z = true;
            if (OooO0O02 != 1) {
                if (OooO0O02 != 3) {
                    return charSequence;
                }
            } else {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z = false;
                }
                if (z && charSequence != null) {
                    if (i != 0 || i2 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i, i2);
                    }
                    return OooOo.OooO00o().OooO0o(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        OooOo OooO00o2 = OooOo.OooO00o();
        if (this.f1505OooO0O0 == null) {
            this.f1505OooO0O0 = new o0oOOo(textView, this);
        }
        OooO00o2.OooO0oO(this.f1505OooO0O0);
        return charSequence;
    }
}