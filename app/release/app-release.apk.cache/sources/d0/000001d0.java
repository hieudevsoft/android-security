package Oooo0oO;

import android.text.Editable;
import android.text.Selection;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.OooOo;

/* loaded from: classes.dex */
public final class o0O000O implements TextWatcher {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final EditText f1497OooO00o;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0O000 f1499OooO0OO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f1498OooO0O0 = false;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f1500OooO0Oo = true;

    public o0O000O(EditText editText) {
        this.f1497OooO00o = editText;
    }

    public static void OooO00o(EditText editText, int i) {
        int length;
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            OooOo OooO00o2 = OooOo.OooO00o();
            if (editableText == null) {
                length = 0;
            } else {
                OooO00o2.getClass();
                length = editableText.length();
            }
            OooO00o2.OooO0o(0, length, editableText);
            if (selectionStart >= 0 && selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionStart, selectionEnd);
            } else if (selectionStart >= 0) {
                Selection.setSelection(editableText, selectionStart);
            } else if (selectionEnd >= 0) {
                Selection.setSelection(editableText, selectionEnd);
            }
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    @Override // android.text.TextWatcher
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            android.widget.EditText r0 = r4.f1497OooO00o
            boolean r1 = r0.isInEditMode()
            if (r1 != 0) goto L54
            boolean r1 = r4.f1500OooO0Oo
            r2 = 1
            if (r1 == 0) goto L1b
            boolean r1 = r4.f1498OooO0O0
            r3 = 0
            if (r1 != 0) goto L1c
            androidx.emoji2.text.OooOo r1 = androidx.emoji2.text.OooOo.f2680OooOO0
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 != 0) goto L1c
        L1b:
            r3 = r2
        L1c:
            if (r3 == 0) goto L1f
            goto L54
        L1f:
            if (r7 > r8) goto L54
            boolean r7 = r5 instanceof android.text.Spannable
            if (r7 == 0) goto L54
            androidx.emoji2.text.OooOo r7 = androidx.emoji2.text.OooOo.OooO00o()
            int r7 = r7.OooO0O0()
            if (r7 == 0) goto L40
            if (r7 == r2) goto L35
            r5 = 3
            if (r7 == r5) goto L40
            goto L54
        L35:
            android.text.Spannable r5 = (android.text.Spannable) r5
            androidx.emoji2.text.OooOo r7 = androidx.emoji2.text.OooOo.OooO00o()
            int r8 = r8 + r6
            r7.OooO0o(r6, r8, r5)
            goto L54
        L40:
            androidx.emoji2.text.OooOo r5 = androidx.emoji2.text.OooOo.OooO00o()
            Oooo0oO.o0O000 r6 = r4.f1499OooO0OO
            if (r6 != 0) goto L4f
            Oooo0oO.o0O000 r6 = new Oooo0oO.o0O000
            r6.<init>(r0)
            r4.f1499OooO0OO = r6
        L4f:
            Oooo0oO.o0O000 r6 = r4.f1499OooO0OO
            r5.OooO0oO(r6)
        L54:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0oO.o0O000O.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}