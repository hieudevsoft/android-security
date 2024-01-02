package o0OOO0o;

import OooOooo.o000O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.o00oOoo;
import androidx.appcompat.widget.o0oO0O0o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0ooOOo extends LinearLayout {

    /* renamed from: OooO  reason: collision with root package name */
    public View.OnLongClickListener f5418OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextInputLayout f5419OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00oOoo f5420OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public CharSequence f5421OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final CheckableImageButton f5422OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public PorterDuff.Mode f5423OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public ColorStateList f5424OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f5425OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public ImageView.ScaleType f5426OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f5427OooOO0;

    public o0ooOOo(TextInputLayout textInputLayout, o0oO0O0o o0oo0o0o) {
        super(textInputLayout.getContext());
        CharSequence OooOO0O2;
        this.f5419OooO00o = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f5422OooO0Oo = checkableImageButton;
        o00oOoo o00oooo = new o00oOoo(getContext(), null);
        this.f5420OooO0O0 = o00oooo;
        if (o0000O00.OooO00o.o000OO(getContext())) {
            o000O0O0.OooO0oO((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f5418OooO;
        checkableImageButton.setOnClickListener(null);
        o0000O00.OooO00o.oooo00o(checkableImageButton, onLongClickListener);
        this.f5418OooO = null;
        checkableImageButton.setOnLongClickListener(null);
        o0000O00.OooO00o.oooo00o(checkableImageButton, null);
        if (o0oo0o0o.OooOO0o(69)) {
            this.f5424OooO0o0 = o0000O00.OooO00o.o00oO0O(getContext(), o0oo0o0o, 69);
        }
        if (o0oo0o0o.OooOO0o(70)) {
            this.f5423OooO0o = o0000O00.OooO00o.o000OO0O(o0oo0o0o.OooO0oo(70, -1), null);
        }
        if (o0oo0o0o.OooOO0o(66)) {
            OooO0O0(o0oo0o0o.OooO0o0(66));
            if (o0oo0o0o.OooOO0o(65) && checkableImageButton.getContentDescription() != (OooOO0O2 = o0oo0o0o.OooOO0O(65))) {
                checkableImageButton.setContentDescription(OooOO0O2);
            }
            checkableImageButton.setCheckable(o0oo0o0o.OooO00o(64, true));
        }
        int OooO0Oo2 = o0oo0o0o.OooO0Oo(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (OooO0Oo2 >= 0) {
            if (OooO0Oo2 != this.f5425OooO0oO) {
                this.f5425OooO0oO = OooO0Oo2;
                checkableImageButton.setMinimumWidth(OooO0Oo2);
                checkableImageButton.setMinimumHeight(OooO0Oo2);
            }
            if (o0oo0o0o.OooOO0o(68)) {
                ImageView.ScaleType OoooO002 = o0000O00.OooO00o.OoooO00(o0oo0o0o.OooO0oo(68, -1));
                this.f5426OooO0oo = OoooO002;
                checkableImageButton.setScaleType(OoooO002);
            }
            o00oooo.setVisibility(8);
            o00oooo.setId(R.id.textinput_prefix_text);
            o00oooo.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0o0O0.OooO0o(o00oooo, 1);
            o00oooo.setTextAppearance(o0oo0o0o.OooO(60, 0));
            if (o0oo0o0o.OooOO0o(61)) {
                o00oooo.setTextColor(o0oo0o0o.OooO0O0(61));
            }
            CharSequence OooOO0O3 = o0oo0o0o.OooOO0O(59);
            this.f5421OooO0OO = TextUtils.isEmpty(OooOO0O3) ? null : OooOO0O3;
            o00oooo.setText(OooOO0O3);
            OooO0o0();
            addView(checkableImageButton);
            addView(o00oooo);
            return;
        }
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public final int OooO00o() {
        boolean z;
        CheckableImageButton checkableImageButton = this.f5422OooO0Oo;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = o000O0O0.OooO0O0((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        return o00O0O0O.OooO0o(this.f5420OooO0O0) + o00O0O0O.OooO0o(this) + i;
    }

    public final void OooO0O0(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f5422OooO0Oo;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f5424OooO0o0;
            PorterDuff.Mode mode = this.f5423OooO0o;
            TextInputLayout textInputLayout = this.f5419OooO00o;
            o0000O00.OooO00o.OooOO0o(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO0OO(true);
            o0000O00.OooO00o.o000OoOO(textInputLayout, checkableImageButton, this.f5424OooO0o0);
            return;
        }
        OooO0OO(false);
        View.OnLongClickListener onLongClickListener = this.f5418OooO;
        checkableImageButton.setOnClickListener(null);
        o0000O00.OooO00o.oooo00o(checkableImageButton, onLongClickListener);
        this.f5418OooO = null;
        checkableImageButton.setOnLongClickListener(null);
        o0000O00.OooO00o.oooo00o(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void OooO0OO(boolean z) {
        boolean z2;
        CheckableImageButton checkableImageButton = this.f5422OooO0Oo;
        int i = 0;
        if (checkableImageButton.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 != z) {
            if (!z) {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            OooO0Oo();
            OooO0o0();
        }
    }

    public final void OooO0Oo() {
        boolean z;
        EditText editText = this.f5419OooO00o.f3500OooO0Oo;
        if (editText == null) {
            return;
        }
        int i = 0;
        if (this.f5422OooO0Oo.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            i = o00O0O0O.OooO0o(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
        o00O0O0O.OooOO0O(this.f5420OooO0O0, i, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void OooO0o0() {
        int i = (this.f5421OooO0OO == null || this.f5427OooOO0) ? 8 : 0;
        setVisibility(this.f5422OooO0Oo.getVisibility() == 0 || i == 0 ? 0 : 8);
        this.f5420OooO0O0.setVisibility(i);
        this.f5419OooO00o.OooOOOo();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        OooO0Oo();
    }
}