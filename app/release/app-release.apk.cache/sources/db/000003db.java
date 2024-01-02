package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* loaded from: classes.dex */
public final /* synthetic */ class Oooo0 implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3391OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f3392OooO0O0;

    public /* synthetic */ Oooo0(int i, Object obj) {
        this.f3391OooO00o = i;
        this.f3392OooO0O0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        EditText editText;
        int i = this.f3391OooO00o;
        PasswordTransformationMethod passwordTransformationMethod = null;
        Object obj = this.f3392OooO0O0;
        switch (i) {
            case 0:
                int i2 = o000oOoO.f3404o000000o;
                ((o000oOoO) obj).Oooo0();
                throw null;
            case 1:
                o0OOO0o.OooO0o oooO0o = (o0OOO0o.OooO0o) obj;
                EditText editText2 = oooO0o.f5324OooO;
                if (editText2 != null) {
                    Editable text = editText2.getText();
                    if (text != null) {
                        text.clear();
                    }
                    oooO0o.OooOOo0();
                    return;
                }
                return;
            case 2:
                ((o0OOO0o.OooOo00) obj).OooOo0();
                return;
            default:
                o0OOO0o.o00oO0o o00oo0o = (o0OOO0o.o00oO0o) obj;
                EditText editText3 = o00oo0o.f5409OooO0o;
                if (editText3 != null) {
                    int selectionEnd = editText3.getSelectionEnd();
                    EditText editText4 = o00oo0o.f5409OooO0o;
                    if (editText4 != null && (editText4.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        editText = o00oo0o.f5409OooO0o;
                    } else {
                        editText = o00oo0o.f5409OooO0o;
                        passwordTransformationMethod = PasswordTransformationMethod.getInstance();
                    }
                    editText.setTransformationMethod(passwordTransformationMethod);
                    if (selectionEnd >= 0) {
                        o00oo0o.f5409OooO0o.setSelection(selectionEnd);
                    }
                    o00oo0o.OooOOo0();
                    return;
                }
                return;
        }
    }
}