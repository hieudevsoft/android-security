package o0OOO0o;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o00oO0o extends o000oOoO {

    /* renamed from: OooO0o  reason: collision with root package name */
    public EditText f5409OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5410OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final com.google.android.material.datepicker.Oooo0 f5411OooO0oO;

    public o00oO0o(Oooo0 oooo0, int i) {
        super(oooo0);
        this.f5410OooO0o0 = R.drawable.design_password_eye;
        this.f5411OooO0oO = new com.google.android.material.datepicker.Oooo0(3, this);
        if (i != 0) {
            this.f5410OooO0o0 = i;
        }
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooO0O0() {
        OooOOo0();
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0OO() {
        return R.string.password_toggle_content_description;
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0Oo() {
        return this.f5410OooO0o0;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnClickListener OooO0o() {
        return this.f5411OooO0oO;
    }

    @Override // o0OOO0o.o000oOoO
    public final boolean OooOO0O() {
        return true;
    }

    @Override // o0OOO0o.o000oOoO
    public final boolean OooOO0o() {
        boolean z;
        EditText editText = this.f5409OooO0o;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOO0(EditText editText) {
        this.f5409OooO0o = editText;
        OooOOo0();
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOo() {
        boolean z;
        EditText editText = this.f5409OooO0o;
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f5409OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOoo() {
        EditText editText = this.f5409OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}