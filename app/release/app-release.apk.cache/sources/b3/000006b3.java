package o0OOO0o;

import OooooOO.oO00O0o0;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooO0o extends o000oOoO {

    /* renamed from: OooO  reason: collision with root package name */
    public EditText f5324OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f5325OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5326OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final TimeInterpolator f5327OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final TimeInterpolator f5328OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final com.google.android.material.datepicker.Oooo0 f5329OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final OooO0O0 f5330OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public AnimatorSet f5331OooOO0o;
    public ValueAnimator OooOOO0;

    public OooO0o(Oooo0 oooo0) {
        super(oooo0);
        this.f5329OooOO0 = new com.google.android.material.datepicker.Oooo0(1, this);
        this.f5330OooOO0O = new OooO0O0(this, 0);
        this.f5326OooO0o0 = o0000O00.OooO00o.o000OooO(oooo0.getContext(), R.attr.motionDurationShort3, 100);
        this.f5325OooO0o = o0000O00.OooO00o.o000OooO(oooo0.getContext(), R.attr.motionDurationShort3, 150);
        this.f5327OooO0oO = o0000O00.OooO00o.o000Oooo(oooo0.getContext(), R.attr.motionEasingLinearInterpolator, oO00O0o0.f1815OooO00o);
        this.f5328OooO0oo = o0000O00.OooO00o.o000Oooo(oooo0.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1818OooO0Oo);
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooO00o() {
        if (this.f5375OooO0O0.f5366OooOOOo != null) {
            return;
        }
        OooOo00(OooOo0());
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0OO() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // o0OOO0o.o000oOoO
    public final int OooO0Oo() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnClickListener OooO0o() {
        return this.f5329OooOO0;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnFocusChangeListener OooO0o0() {
        return this.f5330OooOO0O;
    }

    @Override // o0OOO0o.o000oOoO
    public final View.OnFocusChangeListener OooO0oO() {
        return this.f5330OooOO0O;
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOO0(EditText editText) {
        this.f5324OooO = editText;
        this.f5374OooO00o.setEndIconVisible(OooOo0());
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOOo(boolean z) {
        if (this.f5375OooO0O0.f5366OooOOOo == null) {
            return;
        }
        OooOo00(z);
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOo() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f5328OooO0oo);
        ofFloat.setDuration(this.f5325OooO0o);
        ofFloat.addUpdateListener(new OooO00o(this, 0));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f5327OooO0oO;
        ofFloat2.setInterpolator(timeInterpolator);
        int i = this.f5326OooO0o0;
        ofFloat2.setDuration(i);
        ofFloat2.addUpdateListener(new OooO00o(this, 1));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f5331OooOO0o = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f5331OooOO0o.addListener(new OooO0OO(this, 0));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i);
        ofFloat3.addUpdateListener(new OooO00o(this, 1));
        this.OooOOO0 = ofFloat3;
        ofFloat3.addListener(new OooO0OO(this, 1));
    }

    @Override // o0OOO0o.o000oOoO
    public final void OooOOoo() {
        EditText editText = this.f5324OooO;
        if (editText != null) {
            editText.post(new androidx.activity.OooO0o(10, this));
        }
    }

    public final boolean OooOo0() {
        EditText editText = this.f5324OooO;
        return editText != null && (editText.hasFocus() || this.f5377OooO0Oo.hasFocus()) && this.f5324OooO.getText().length() > 0;
    }

    public final void OooOo00(boolean z) {
        boolean z2 = this.f5375OooO0O0.OooO0Oo() == z;
        if (z && !this.f5331OooOO0o.isRunning()) {
            this.OooOOO0.cancel();
            this.f5331OooOO0o.start();
            if (z2) {
                this.f5331OooOO0o.end();
            }
        } else if (z) {
        } else {
            this.f5331OooOO0o.cancel();
            this.OooOOO0.start();
            if (z2) {
                this.OooOOO0.end();
            }
        }
    }
}