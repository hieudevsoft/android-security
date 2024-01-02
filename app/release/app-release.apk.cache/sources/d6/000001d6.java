package Oooo0oO;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import androidx.emoji2.text.OooOo;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class oo00oO extends InputConnectionWrapper {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextView f1512OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO0 f1513OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo00oO(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        boolean z;
        OooOOO0 oooOOO0 = new OooOOO0(15, (Object) null);
        this.f1512OooO00o = editText;
        this.f1513OooO0O0 = oooOOO0;
        if (OooOo.f2680OooOO0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            OooOo OooO00o2 = OooOo.OooO00o();
            if ((OooO00o2.OooO0O0() == 1) && editorInfo != null) {
                if (editorInfo.extras == null) {
                    editorInfo.extras = new Bundle();
                }
                OooO00o2.f2686OooO0o0.OooOoo(editorInfo);
            }
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f1512OooO00o.getEditableText();
        this.f1513OooO0O0.getClass();
        if (!OooOOO0.OooOOO0(this, editableText, i, i2, false) && !super.deleteSurroundingText(i, i2)) {
            return false;
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f1512OooO00o.getEditableText();
        this.f1513OooO0O0.getClass();
        if (OooOOO0.OooOOO0(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2)) {
            return true;
        }
        return false;
    }
}