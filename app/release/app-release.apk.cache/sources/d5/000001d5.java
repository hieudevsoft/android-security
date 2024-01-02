package Oooo0oO;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import androidx.emoji2.text.OooOOOO;
import androidx.emoji2.text.OooOo;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o0oOOo extends OooOOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final WeakReference f1510OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final WeakReference f1511OooO0O0;

    public o0oOOo(TextView textView, o0O0o o0o0o) {
        this.f1510OooO00o = new WeakReference(textView);
        this.f1511OooO0O0 = new WeakReference(o0o0o);
    }

    @Override // androidx.emoji2.text.OooOOOO
    public final void OooO00o() {
        boolean z;
        int length;
        InputFilter[] filters;
        TextView textView = (TextView) this.f1510OooO00o.get();
        InputFilter inputFilter = (InputFilter) this.f1511OooO0O0.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            for (InputFilter inputFilter2 : filters) {
                if (inputFilter2 == inputFilter) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (z && textView.isAttachedToWindow()) {
            CharSequence text = textView.getText();
            OooOo OooO00o2 = OooOo.OooO00o();
            if (text == null) {
                length = 0;
            } else {
                OooO00o2.getClass();
                length = text.length();
            }
            CharSequence OooO0o2 = OooO00o2.OooO0o(0, length, text);
            if (text == OooO0o2) {
                return;
            }
            int selectionStart = Selection.getSelectionStart(OooO0o2);
            int selectionEnd = Selection.getSelectionEnd(OooO0o2);
            textView.setText(OooO0o2);
            if (OooO0o2 instanceof Spannable) {
                Spannable spannable = (Spannable) OooO0o2;
                if (selectionStart >= 0 && selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionStart, selectionEnd);
                } else if (selectionStart >= 0) {
                    Selection.setSelection(spannable, selectionStart);
                } else if (selectionEnd >= 0) {
                    Selection.setSelection(spannable, selectionEnd);
                }
            }
        }
    }
}