package o0OOO0o;

import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OooooOO.oO00O0o0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.o00oOoo;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00Oo0 {

    /* renamed from: OooO  reason: collision with root package name */
    public LinearLayout f5379OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f5380OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f5381OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f5382OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final TimeInterpolator f5383OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final TimeInterpolator f5384OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final TimeInterpolator f5385OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Context f5386OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final TextInputLayout f5387OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f5388OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public FrameLayout f5389OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public Animator f5390OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f5391OooOOO;
    public final float OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f5392OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public CharSequence f5393OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o00oOoo f5394OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public boolean f5395OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public CharSequence f5396OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public boolean f5397OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f5398OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f5399OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public ColorStateList f5400OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public CharSequence f5401OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public int f5402OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public o00oOoo f5403OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public ColorStateList f5404OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public Typeface f5405OooOoo0;

    public o00Oo0(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f5386OooO0oO = context;
        this.f5387OooO0oo = textInputLayout;
        this.OooOOO0 = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f5380OooO00o = o0000O00.OooO00o.o000OooO(context, R.attr.motionDurationShort4, 217);
        this.f5381OooO0O0 = o0000O00.OooO00o.o000OooO(context, R.attr.motionDurationMedium4, 167);
        this.f5382OooO0OO = o0000O00.OooO00o.o000OooO(context, R.attr.motionDurationShort4, 167);
        this.f5383OooO0Oo = o0000O00.OooO00o.o000Oooo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, oO00O0o0.f1818OooO0Oo);
        LinearInterpolator linearInterpolator = oO00O0o0.f1815OooO00o;
        this.f5385OooO0o0 = o0000O00.OooO00o.o000Oooo(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f5384OooO0o = o0000O00.OooO00o.o000Oooo(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void OooO(int i, int i2, boolean z) {
        TextView OooO0o02;
        TextView OooO0o03;
        if (i == i2) {
            return;
        }
        if (z) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f5390OooOO0o = animatorSet;
            ArrayList arrayList = new ArrayList();
            OooO0Oo(arrayList, this.f5397OooOo, this.f5403OooOoO0, 2, i, i2);
            OooO0Oo(arrayList, this.f5395OooOOo0, this.f5394OooOOo, 1, i, i2);
            o0000O00.OooO00o.o000O0o0(animatorSet, arrayList);
            animatorSet.addListener(new o0OoOo0(this, i2, OooO0o0(i), i, OooO0o0(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (OooO0o03 = OooO0o0(i2)) != null) {
                OooO0o03.setVisibility(0);
                OooO0o03.setAlpha(1.0f);
            }
            if (i != 0 && (OooO0o02 = OooO0o0(i)) != null) {
                OooO0o02.setVisibility(4);
                if (i == 1) {
                    OooO0o02.setText((CharSequence) null);
                }
            }
            this.f5391OooOOO = i2;
        }
        TextInputLayout textInputLayout = this.f5387OooO0oo;
        textInputLayout.OooOOo0();
        textInputLayout.OooOo00(z, false);
        textInputLayout.OooOo0o();
    }

    public final void OooO00o(TextView textView, int i) {
        if (this.f5379OooO == null && this.f5389OooOO0O == null) {
            Context context = this.f5386OooO0oO;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f5379OooO = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f5379OooO;
            TextInputLayout textInputLayout = this.f5387OooO0oo;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f5389OooOO0O = new FrameLayout(context);
            this.f5379OooO.addView(this.f5389OooOO0O, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                OooO0O0();
            }
        }
        if (i == 0 || i == 1) {
            this.f5389OooOO0O.setVisibility(0);
            this.f5389OooOO0O.addView(textView);
        } else {
            this.f5379OooO.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f5379OooO.setVisibility(0);
        this.f5388OooOO0++;
    }

    public final void OooO0O0() {
        boolean z;
        LinearLayout linearLayout = this.f5379OooO;
        TextInputLayout textInputLayout = this.f5387OooO0oo;
        if (linearLayout != null && textInputLayout.getEditText() != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EditText editText = textInputLayout.getEditText();
            Context context = this.f5386OooO0oO;
            boolean o000OO2 = o0000O00.OooO00o.o000OO(context);
            LinearLayout linearLayout2 = this.f5379OooO;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            int OooO0o2 = o00O0O0O.OooO0o(editText);
            if (o000OO2) {
                OooO0o2 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
            if (o000OO2) {
                dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
            }
            int OooO0o02 = o00O0O0O.OooO0o0(editText);
            if (o000OO2) {
                OooO0o02 = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
            }
            o00O0O0O.OooOO0O(linearLayout2, OooO0o2, dimensionPixelSize, OooO0o02, 0);
        }
    }

    public final void OooO0OO() {
        Animator animator = this.f5390OooOO0o;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void OooO0Oo(ArrayList arrayList, boolean z, TextView textView, int i, int i2, int i3) {
        boolean z2;
        boolean z3;
        float f;
        int i4;
        TimeInterpolator timeInterpolator;
        boolean z4;
        if (textView != null && z) {
            if (i != i3 && i != i2) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                if (i3 == i) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, f);
                int i5 = this.f5382OooO0OO;
                if (z3) {
                    i4 = this.f5381OooO0O0;
                } else {
                    i4 = i5;
                }
                ofFloat.setDuration(i4);
                if (z3) {
                    timeInterpolator = this.f5385OooO0o0;
                } else {
                    timeInterpolator = this.f5384OooO0o;
                }
                ofFloat.setInterpolator(timeInterpolator);
                if (i == i3 && i2 != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    ofFloat.setStartDelay(i5);
                }
                arrayList.add(ofFloat);
                if (i3 == i && i2 != 0) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, -this.OooOOO0, 0.0f);
                    ofFloat2.setDuration(this.f5380OooO00o);
                    ofFloat2.setInterpolator(this.f5383OooO0Oo);
                    ofFloat2.setStartDelay(i5);
                    arrayList.add(ofFloat2);
                }
            }
        }
    }

    public final void OooO0o() {
        this.f5393OooOOOo = null;
        OooO0OO();
        if (this.f5391OooOOO == 1) {
            this.f5392OooOOOO = (!this.f5397OooOo || TextUtils.isEmpty(this.f5401OooOo0o)) ? 0 : 2;
        }
        OooO(this.f5391OooOOO, this.f5392OooOOOO, OooO0oo(this.f5394OooOOo, ""));
    }

    public final TextView OooO0o0(int i) {
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.f5403OooOoO0;
        }
        return this.f5394OooOOo;
    }

    public final void OooO0oO(TextView textView, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = this.f5379OooO;
        if (viewGroup2 == null) {
            return;
        }
        boolean z = true;
        if (i != 0 && i != 1) {
            z = false;
        }
        if (z && (viewGroup = this.f5389OooOO0O) != null) {
            viewGroup2 = viewGroup;
        }
        viewGroup2.removeView(textView);
        int i2 = this.f5388OooOO0 - 1;
        this.f5388OooOO0 = i2;
        LinearLayout linearLayout = this.f5379OooO;
        if (i2 == 0) {
            linearLayout.setVisibility(8);
        }
    }

    public final boolean OooO0oo(TextView textView, CharSequence charSequence) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        TextInputLayout textInputLayout = this.f5387OooO0oo;
        if (oo0o0O0.OooO0OO(textInputLayout) && textInputLayout.isEnabled() && (this.f5392OooOOOO != this.f5391OooOOO || textView == null || !TextUtils.equals(textView.getText(), charSequence))) {
            return true;
        }
        return false;
    }
}