package com.google.android.material.textfield;

import OooO0O0.OooO0O0;
import OooO0Oo.o0000OO0;
import OooOo0O.oo000o;
import OooOoo.o000OOo;
import OooOoo.o00O0O;
import OooOoo.o0O0O00;
import OooOooo.o000O0O0;
import OooOooo.o00O0O0;
import OooOooo.o00OO000;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import OoooOoo.o0OOOO0o;
import OoooOoo.oO0000Oo;
import OooooO0.o0000O;
import OooooOO.oO00O0o0;
import Oooooo.o000000;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.o00O0OO0;
import androidx.appcompat.widget.o00oOoo;
import androidx.appcompat.widget.o0O000Oo;
import androidx.appcompat.widget.o0oO0O0o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o00o0O.OooO0OO;
import o0OOO0o.OooOOO0;
import o0OOO0o.Oooo0;
import o0OOO0o.o00Oo0;
import o0OOO0o.o0OO00O;
import o0OOO0o.o0OOO0o;
import o0OOO0o.o0Oo0oo;
import o0OOO0o.o0ooOOo;
import o0OOO0o.oo0o0Oo;
import o0ooOO0.OooOO0;
import o0ooOO0.OooOOO;
import o0ooOO0.OooOOOO;
import o0ooOO0.Oooo000;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] o0Oo0oo = {new int[]{16842919}, new int[0]};

    /* renamed from: OooO  reason: collision with root package name */
    public int f3496OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final FrameLayout f3497OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0ooOOo f3498OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Oooo0 f3499OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public EditText f3500OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f3501OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public CharSequence f3502OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f3503OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f3504OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o00Oo0 f3505OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f3506OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f3507OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public o0OO00O f3508OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public o00oOoo f3509OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f3510OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public CharSequence f3511OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f3512OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f3513OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public o0OOOO0o f3514OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public ColorStateList f3515OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public o00oOoo f3516OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f3517OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public o0OOOO0o f3518OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public ColorStateList f3519OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public ColorStateList f3520OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public ColorStateList f3521OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public boolean f3522OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public ColorStateList f3523OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public CharSequence f3524OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public boolean f3525OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public int f3526Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public boolean f3527Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public OooOOOO f3528Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public OooOOOO f3529Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public StateListDrawable f3530Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public OooOOOO f3531Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public OooOOOO f3532Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public boolean f3533Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public o0ooOO0.Oooo0 f3534Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public final int f3535Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public int f3536Oooo0oo;

    /* renamed from: OoooO  reason: collision with root package name */
    public int f3537OoooO;

    /* renamed from: OoooO0  reason: collision with root package name */
    public int f3538OoooO0;

    /* renamed from: OoooO00  reason: collision with root package name */
    public int f3539OoooO00;

    /* renamed from: OoooO0O  reason: collision with root package name */
    public int f3540OoooO0O;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public int f3541OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public final Rect f3542OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public final RectF f3543OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public Typeface f3544OoooOo0;
    public ColorDrawable OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public int f3545OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public final LinkedHashSet f3546Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public ColorDrawable f3547Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public int f3548OooooO0;

    /* renamed from: OooooOO  reason: collision with root package name */
    public Drawable f3549OooooOO;

    /* renamed from: OooooOo  reason: collision with root package name */
    public ColorStateList f3550OooooOo;

    /* renamed from: Oooooo  reason: collision with root package name */
    public int f3551Oooooo;

    /* renamed from: Oooooo0  reason: collision with root package name */
    public ColorStateList f3552Oooooo0;

    /* renamed from: OoooooO  reason: collision with root package name */
    public int f3553OoooooO;

    /* renamed from: Ooooooo  reason: collision with root package name */
    public int f3554Ooooooo;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public final Rect f3555o000oOoO;

    /* renamed from: o00O0O  reason: collision with root package name */
    public int f3556o00O0O;
    public int o00Oo0;

    /* renamed from: o00Ooo  reason: collision with root package name */
    public int f3557o00Ooo;

    /* renamed from: o00o0O  reason: collision with root package name */
    public int f3558o00o0O;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public boolean f3559o00oO0O;
    public boolean o00oO0o;

    /* renamed from: o00ooo  reason: collision with root package name */
    public boolean f3560o00ooo;

    /* renamed from: o0OOO0o  reason: collision with root package name */
    public boolean f3561o0OOO0o;

    /* renamed from: o0OoOo0  reason: collision with root package name */
    public ColorStateList f3562o0OoOo0;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public ValueAnimator f3563o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public boolean f3564o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with root package name */
    public boolean f3565o0ooOoO;

    /* renamed from: oo000o  reason: collision with root package name */
    public final OooO0OO f3566oo000o;

    /* renamed from: ooOO  reason: collision with root package name */
    public int f3567ooOO;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.textInputStyle, 2131755834), attributeSet, R.attr.textInputStyle);
        int colorForState;
        this.f3501OooO0o = -1;
        this.f3503OooO0oO = -1;
        this.f3504OooO0oo = -1;
        this.f3496OooO = -1;
        this.f3505OooOO0 = new o00Oo0(this);
        this.f3508OooOOO = new o0OOO0o();
        this.f3555o000oOoO = new Rect();
        this.f3542OoooOOO = new Rect();
        this.f3543OoooOOo = new RectF();
        this.f3546Ooooo00 = new LinkedHashSet();
        OooO0OO oooO0OO = new OooO0OO(this);
        this.f3566oo000o = oooO0OO;
        this.f3561o0OOO0o = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3497OooO00o = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = oO00O0o0.f1815OooO00o;
        oooO0OO.f5248OoooO00 = linearInterpolator;
        oooO0OO.OooO0oo(false);
        oooO0OO.f5235Oooo = linearInterpolator;
        oooO0OO.OooO0oo(false);
        if (oooO0OO.f5212OooO0oO != 8388659) {
            oooO0OO.f5212OooO0oO = 8388659;
            oooO0OO.OooO0oo(false);
        }
        int[] iArr = o0000O.f1811OooOoOO;
        OooO0o.OooO0Oo(context2, attributeSet, R.attr.textInputStyle, 2131755834);
        OooO0o.OooO0oO(context2, attributeSet, iArr, R.attr.textInputStyle, 2131755834, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.textInputStyle, 2131755834);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(context2, obtainStyledAttributes);
        o0ooOOo o0ooooo = new o0ooOOo(this, o0oo0o0o);
        this.f3498OooO0O0 = o0ooooo;
        this.f3522OooOoo = o0oo0o0o.OooO00o(48, true);
        setHint(o0oo0o0o.OooOO0O(4));
        this.f3559o00oO0O = o0oo0o0o.OooO00o(47, true);
        this.o00oO0o = o0oo0o0o.OooO00o(42, true);
        if (o0oo0o0o.OooOO0o(6)) {
            setMinEms(o0oo0o0o.OooO0oo(6, -1));
        } else if (o0oo0o0o.OooOO0o(3)) {
            setMinWidth(o0oo0o0o.OooO0Oo(3, -1));
        }
        if (o0oo0o0o.OooOO0o(5)) {
            setMaxEms(o0oo0o0o.OooO0oo(5, -1));
        } else if (o0oo0o0o.OooOO0o(2)) {
            setMaxWidth(o0oo0o0o.OooO0Oo(2, -1));
        }
        this.f3534Oooo0o0 = new o0ooOO0.Oooo0(o0ooOO0.Oooo0.OooO0O0(context2, attributeSet, R.attr.textInputStyle, 2131755834));
        this.f3535Oooo0oO = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3526Oooo = o0oo0o0o.OooO0OO(9, 0);
        this.f3538OoooO0 = o0oo0o0o.OooO0Oo(16, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3540OoooO0O = o0oo0o0o.OooO0Oo(17, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3539OoooO00 = this.f3538OoooO0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        o0ooOO0.Oooo0 oooo0 = this.f3534Oooo0o0;
        oooo0.getClass();
        Oooo000 oooo000 = new Oooo000(oooo0);
        if (dimension >= 0.0f) {
            oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(dimension);
        }
        if (dimension2 >= 0.0f) {
            oooo000.f5532OooO0o = new o0ooOO0.OooO0o(dimension2);
        }
        if (dimension3 >= 0.0f) {
            oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(dimension3);
        }
        if (dimension4 >= 0.0f) {
            oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(dimension4);
        }
        this.f3534Oooo0o0 = new o0ooOO0.Oooo0(oooo000);
        ColorStateList o00oO0O2 = OooO00o.o00oO0O(context2, o0oo0o0o, 7);
        if (o00oO0O2 != null) {
            int defaultColor = o00oO0O2.getDefaultColor();
            this.f3567ooOO = defaultColor;
            this.f3541OoooOO0 = defaultColor;
            if (o00oO0O2.isStateful()) {
                this.f3556o00O0O = o00oO0O2.getColorForState(new int[]{-16842910}, -1);
                this.o00Oo0 = o00oO0O2.getColorForState(new int[]{16842908, 16842910}, -1);
                colorForState = o00oO0O2.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.o00Oo0 = this.f3567ooOO;
                ColorStateList OooO00o2 = OooOo0.Oooo000.OooO00o(context2, R.color.mtrl_filled_background_color);
                this.f3556o00O0O = OooO00o2.getColorForState(new int[]{-16842910}, -1);
                colorForState = OooO00o2.getColorForState(new int[]{16843623}, -1);
            }
            this.f3557o00Ooo = colorForState;
        } else {
            this.f3541OoooOO0 = 0;
            this.f3567ooOO = 0;
            this.f3556o00O0O = 0;
            this.o00Oo0 = 0;
            this.f3557o00Ooo = 0;
        }
        if (o0oo0o0o.OooOO0o(1)) {
            ColorStateList OooO0O02 = o0oo0o0o.OooO0O0(1);
            this.f3552Oooooo0 = OooO0O02;
            this.f3550OooooOo = OooO0O02;
        }
        ColorStateList o00oO0O3 = OooO00o.o00oO0O(context2, o0oo0o0o, 14);
        this.f3554Ooooooo = obtainStyledAttributes.getColor(14, 0);
        Object obj = OooOo0.Oooo000.f1139OooO00o;
        this.f3551Oooooo = oo000o.OooO00o(context2, R.color.mtrl_textinput_default_box_stroke_color);
        this.f3558o00o0O = oo000o.OooO00o(context2, R.color.mtrl_textinput_disabled_color);
        this.f3553OoooooO = oo000o.OooO00o(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (o00oO0O3 != null) {
            setBoxStrokeColorStateList(o00oO0O3);
        }
        if (o0oo0o0o.OooOO0o(15)) {
            setBoxStrokeErrorColor(OooO00o.o00oO0O(context2, o0oo0o0o, 15));
        }
        if (o0oo0o0o.OooO(49, -1) != -1) {
            setHintTextAppearance(o0oo0o0o.OooO(49, 0));
        }
        this.f3521OooOoOO = o0oo0o0o.OooO0O0(24);
        this.f3523OooOoo0 = o0oo0o0o.OooO0O0(25);
        int OooO2 = o0oo0o0o.OooO(40, 0);
        CharSequence OooOO0O2 = o0oo0o0o.OooOO0O(35);
        int OooO0oo2 = o0oo0o0o.OooO0oo(34, 1);
        boolean OooO00o3 = o0oo0o0o.OooO00o(36, false);
        int OooO3 = o0oo0o0o.OooO(45, 0);
        boolean OooO00o4 = o0oo0o0o.OooO00o(44, false);
        CharSequence OooOO0O3 = o0oo0o0o.OooOO0O(43);
        int OooO4 = o0oo0o0o.OooO(57, 0);
        CharSequence OooOO0O4 = o0oo0o0o.OooOO0O(56);
        boolean OooO00o5 = o0oo0o0o.OooO00o(18, false);
        setCounterMaxLength(o0oo0o0o.OooO0oo(19, -1));
        this.f3512OooOOo0 = o0oo0o0o.OooO(22, 0);
        this.f3510OooOOOo = o0oo0o0o.OooO(20, 0);
        setBoxBackgroundMode(o0oo0o0o.OooO0oo(8, 0));
        setErrorContentDescription(OooOO0O2);
        setErrorAccessibilityLiveRegion(OooO0oo2);
        setCounterOverflowTextAppearance(this.f3510OooOOOo);
        setHelperTextTextAppearance(OooO3);
        setErrorTextAppearance(OooO2);
        setCounterTextAppearance(this.f3512OooOOo0);
        setPlaceholderText(OooOO0O4);
        setPlaceholderTextAppearance(OooO4);
        if (o0oo0o0o.OooOO0o(41)) {
            setErrorTextColor(o0oo0o0o.OooO0O0(41));
        }
        if (o0oo0o0o.OooOO0o(46)) {
            setHelperTextColor(o0oo0o0o.OooO0O0(46));
        }
        if (o0oo0o0o.OooOO0o(50)) {
            setHintTextColor(o0oo0o0o.OooO0O0(50));
        }
        if (o0oo0o0o.OooOO0o(23)) {
            setCounterTextColor(o0oo0o0o.OooO0O0(23));
        }
        if (o0oo0o0o.OooOO0o(21)) {
            setCounterOverflowTextColor(o0oo0o0o.OooO0O0(21));
        }
        if (o0oo0o0o.OooOO0o(58)) {
            setPlaceholderTextColor(o0oo0o0o.OooO0O0(58));
        }
        Oooo0 oooo02 = new Oooo0(this, o0oo0o0o);
        this.f3499OooO0OO = oooo02;
        boolean OooO00o6 = o0oo0o0o.OooO00o(0, true);
        o0oo0o0o.OooOOOO();
        o00O0O0.OooOOoo(this, 2);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i >= 26) {
            o00OO000.OooOOO0(this, 1);
        }
        frameLayout.addView(o0ooooo);
        frameLayout.addView(oooo02);
        addView(frameLayout);
        setEnabled(OooO00o6);
        setHelperTextEnabled(OooO00o4);
        setErrorEnabled(OooO00o3);
        setCounterEnabled(OooO00o5);
        setHelperText(OooOO0O3);
    }

    public static void OooOO0(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                OooOO0((ViewGroup) childAt, z);
            }
        }
    }

    private Drawable getEditTextBoxBackground() {
        boolean z;
        int i;
        EditText editText = this.f3500OooO0Oo;
        if (editText instanceof AutoCompleteTextView) {
            if (editText.getInputType() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int oo000o2 = OooO00o.oo000o(this.f3500OooO0Oo, R.attr.colorControlHighlight);
                int i2 = this.f3536Oooo0oo;
                int[][] iArr = o0Oo0oo;
                if (i2 == 2) {
                    Context context = getContext();
                    OooOOOO oooOOOO = this.f3528Oooo000;
                    TypedValue o000o000 = OooO00o.o000o000(context, R.attr.colorSurface, "TextInputLayout");
                    int i3 = o000o000.resourceId;
                    if (i3 != 0) {
                        Object obj = OooOo0.Oooo000.f1139OooO00o;
                        i = oo000o.OooO00o(context, i3);
                    } else {
                        i = o000o000.data;
                    }
                    OooOOOO oooOOOO2 = new OooOOOO(oooOOOO.f5494OooO00o.f5468OooO00o);
                    int o0000OOO2 = OooO00o.o0000OOO(oo000o2, i, 0.1f);
                    oooOOOO2.OooOO0(new ColorStateList(iArr, new int[]{o0000OOO2, 0}));
                    oooOOOO2.setTint(i);
                    ColorStateList colorStateList = new ColorStateList(iArr, new int[]{o0000OOO2, i});
                    OooOOOO oooOOOO3 = new OooOOOO(oooOOOO.f5494OooO00o.f5468OooO00o);
                    oooOOOO3.setTint(-1);
                    return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, oooOOOO2, oooOOOO3), oooOOOO});
                } else if (i2 == 1) {
                    OooOOOO oooOOOO4 = this.f3528Oooo000;
                    int i4 = this.f3541OoooOO0;
                    return new RippleDrawable(new ColorStateList(iArr, new int[]{OooO00o.o0000OOO(oo000o2, i4, 0.1f), i4}), oooOOOO4, oooOOOO4);
                } else {
                    return null;
                }
            }
        }
        return this.f3528Oooo000;
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3530Oooo00o == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3530Oooo00o = stateListDrawable;
            stateListDrawable.addState(new int[]{16842922}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3530Oooo00o.addState(new int[0], OooO0o(false));
        }
        return this.f3530Oooo00o;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3529Oooo00O == null) {
            this.f3529Oooo00O = OooO0o(true);
        }
        return this.f3529Oooo00O;
    }

    private void setEditText(EditText editText) {
        if (this.f3500OooO0Oo == null) {
            if (getEndIconMode() != 3) {
                boolean z = editText instanceof TextInputEditText;
            }
            this.f3500OooO0Oo = editText;
            int i = this.f3501OooO0o;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f3504OooO0oo);
            }
            int i2 = this.f3503OooO0oO;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f3496OooO);
            }
            this.f3527Oooo0 = false;
            OooO0oo();
            setTextInputAccessibilityDelegate(new o0Oo0oo(this));
            Typeface typeface = this.f3500OooO0Oo.getTypeface();
            OooO0OO oooO0OO = this.f3566oo000o;
            oooO0OO.OooOOO0(typeface);
            float textSize = this.f3500OooO0Oo.getTextSize();
            if (oooO0OO.f5213OooO0oo != textSize) {
                oooO0OO.f5213OooO0oo = textSize;
                oooO0OO.OooO0oo(false);
            }
            int i3 = Build.VERSION.SDK_INT;
            float letterSpacing = this.f3500OooO0Oo.getLetterSpacing();
            if (oooO0OO.f5251OoooOOO != letterSpacing) {
                oooO0OO.f5251OoooOOO = letterSpacing;
                oooO0OO.OooO0oo(false);
            }
            int gravity = this.f3500OooO0Oo.getGravity();
            int i4 = (gravity & (-113)) | 48;
            if (oooO0OO.f5212OooO0oO != i4) {
                oooO0OO.f5212OooO0oO = i4;
                oooO0OO.OooO0oo(false);
            }
            if (oooO0OO.f5210OooO0o != gravity) {
                oooO0OO.f5210OooO0o = gravity;
                oooO0OO.OooO0oo(false);
            }
            this.f3500OooO0Oo.addTextChangedListener(new o0O000Oo(this, 1));
            if (this.f3550OooooOo == null) {
                this.f3550OooooOo = this.f3500OooO0Oo.getHintTextColors();
            }
            if (this.f3522OooOoo) {
                if (TextUtils.isEmpty(this.f3524OooOooO)) {
                    CharSequence hint = this.f3500OooO0Oo.getHint();
                    this.f3502OooO0o0 = hint;
                    setHint(hint);
                    this.f3500OooO0Oo.setHint((CharSequence) null);
                }
                this.f3525OooOooo = true;
            }
            if (i3 >= 29) {
                OooOOOO();
            }
            if (this.f3509OooOOOO != null) {
                OooOOO0(this.f3500OooO0Oo.getText());
            }
            OooOOo0();
            this.f3505OooOO0.OooO0O0();
            this.f3498OooO0O0.bringToFront();
            Oooo0 oooo0 = this.f3499OooO0OO;
            oooo0.bringToFront();
            Iterator it = this.f3546Ooooo00.iterator();
            while (it.hasNext()) {
                ((o0OOO0o.Oooo000) it.next()).OooO00o(this);
            }
            oooo0.OooOOO0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            OooOo00(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f3524OooOooO)) {
            this.f3524OooOooO = charSequence;
            OooO0OO oooO0OO = this.f3566oo000o;
            if (charSequence == null || !TextUtils.equals(oooO0OO.f5230OooOoOO, charSequence)) {
                oooO0OO.f5230OooOoOO = charSequence;
                oooO0OO.f5232OooOoo0 = null;
                Bitmap bitmap = oooO0OO.f5234OooOooo;
                if (bitmap != null) {
                    bitmap.recycle();
                    oooO0OO.f5234OooOooo = null;
                }
                oooO0OO.OooO0oo(false);
            }
            if (!this.f3560o00ooo) {
                OooO();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f3513OooOOoo == z) {
            return;
        }
        if (z) {
            o00oOoo o00oooo = this.f3516OooOo00;
            if (o00oooo != null) {
                this.f3497OooO00o.addView(o00oooo);
                this.f3516OooOo00.setVisibility(0);
            }
        } else {
            o00oOoo o00oooo2 = this.f3516OooOo00;
            if (o00oooo2 != null) {
                o00oooo2.setVisibility(8);
            }
            this.f3516OooOo00 = null;
        }
        this.f3513OooOOoo = z;
    }

    public final void OooO() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        if (!OooO0o0()) {
            return;
        }
        int width = this.f3500OooO0Oo.getWidth();
        int gravity = this.f3500OooO0Oo.getGravity();
        OooO0OO oooO0OO = this.f3566oo000o;
        boolean OooO0O02 = oooO0OO.OooO0O0(oooO0OO.f5230OooOoOO);
        oooO0OO.f5231OooOoo = OooO0O02;
        Rect rect = oooO0OO.f5209OooO0Oo;
        if (gravity != 17 && (gravity & 7) != 1) {
            if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? OooO0O02 : !OooO0O02) {
                f3 = rect.left;
                float max = Math.max(f3, rect.left);
                rectF = this.f3543OoooOOo;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity == 17 && (gravity & 7) != 1) {
                    if ((gravity & 8388613) != 8388613 && (gravity & 5) != 5) {
                        if (!oooO0OO.f5231OooOoo) {
                            f4 = oooO0OO.OoooOoO + max;
                        }
                        f4 = rect.right;
                    } else {
                        if (oooO0OO.f5231OooOoo) {
                            f4 = oooO0OO.OoooOoO + max;
                        }
                        f4 = rect.right;
                    }
                } else {
                    f4 = (width / 2.0f) + (oooO0OO.OoooOoO / 2.0f);
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = oooO0OO.OooO0Oo() + rect.top;
                if (rectF.width() <= 0.0f && rectF.height() > 0.0f) {
                    float f5 = rectF.left;
                    float f6 = this.f3535Oooo0oO;
                    rectF.left = f5 - f6;
                    rectF.right += f6;
                    rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3539OoooO00);
                    OooOOO0 oooOOO0 = (OooOOO0) this.f3528Oooo000;
                    oooOOO0.getClass();
                    oooOOO0.OooOOO(rectF.left, rectF.top, rectF.right, rectF.bottom);
                    return;
                }
            }
            f = rect.right;
            f2 = oooO0OO.OoooOoO;
        } else {
            f = width / 2.0f;
            f2 = oooO0OO.OoooOoO / 2.0f;
        }
        f3 = f - f2;
        float max2 = Math.max(f3, rect.left);
        rectF = this.f3543OoooOOo;
        rectF.left = max2;
        rectF.top = rect.top;
        if (gravity == 17) {
        }
        f4 = (width / 2.0f) + (oooO0OO.OoooOoO / 2.0f);
        rectF.right = Math.min(f4, rect.right);
        rectF.bottom = oooO0OO.OooO0Oo() + rect.top;
        if (rectF.width() <= 0.0f) {
        }
    }

    public final void OooO00o(float f) {
        OooO0OO oooO0OO = this.f3566oo000o;
        if (oooO0OO.f5207OooO0O0 == f) {
            return;
        }
        if (this.f3563o0ooOO0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3563o0ooOO0 = valueAnimator;
            valueAnimator.setInterpolator(OooO00o.o000Oooo(getContext(), R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1816OooO0O0));
            this.f3563o0ooOO0.setDuration(OooO00o.o000OooO(getContext(), R.attr.motionDurationMedium4, 167));
            this.f3563o0ooOO0.addUpdateListener(new o000000(1, this));
        }
        this.f3563o0ooOO0.setFloatValues(oooO0OO.f5207OooO0O0, f);
        this.f3563o0ooOO0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0() {
        /*
            r7 = this;
            o0ooOO0.OooOOOO r0 = r7.f3528Oooo000
            if (r0 != 0) goto L5
            return
        L5:
            o0ooOO0.OooOOO r1 = r0.f5494OooO00o
            o0ooOO0.Oooo0 r1 = r1.f5468OooO00o
            o0ooOO0.Oooo0 r2 = r7.f3534Oooo0o0
            if (r1 == r2) goto L10
            r0.setShapeAppearanceModel(r2)
        L10:
            int r0 = r7.f3536Oooo0oo
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L27
            int r0 = r7.f3539OoooO00
            if (r0 <= r2) goto L22
            int r0 = r7.f3537OoooO
            if (r0 == 0) goto L22
            r0 = r4
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 == 0) goto L27
            r0 = r4
            goto L28
        L27:
            r0 = r3
        L28:
            if (r0 == 0) goto L4b
            o0ooOO0.OooOOOO r0 = r7.f3528Oooo000
            int r1 = r7.f3539OoooO00
            float r1 = (float) r1
            int r5 = r7.f3537OoooO
            o0ooOO0.OooOOO r6 = r0.f5494OooO00o
            r6.f5477OooOO0O = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r5)
            o0ooOO0.OooOOO r5 = r0.f5494OooO00o
            android.content.res.ColorStateList r6 = r5.f5471OooO0Oo
            if (r6 == r1) goto L4b
            r5.f5471OooO0Oo = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4b:
            int r0 = r7.f3541OoooOO0
            int r1 = r7.f3536Oooo0oo
            if (r1 != r4) goto L62
            android.content.Context r0 = r7.getContext()
            r1 = 2130903328(0x7f030120, float:1.741347E38)
            int r0 = o0000O00.OooO00o.o00ooo(r0, r1, r3)
            int r1 = r7.f3541OoooOO0
            int r0 = OooOo.OooO00o.OooO0O0(r1, r0)
        L62:
            r7.f3541OoooOO0 = r0
            o0ooOO0.OooOOOO r1 = r7.f3528Oooo000
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.OooOO0(r0)
            o0ooOO0.OooOOOO r0 = r7.f3531Oooo0O0
            if (r0 == 0) goto La3
            o0ooOO0.OooOOOO r1 = r7.f3532Oooo0OO
            if (r1 != 0) goto L76
            goto La3
        L76:
            int r1 = r7.f3539OoooO00
            if (r1 <= r2) goto L7f
            int r1 = r7.f3537OoooO
            if (r1 == 0) goto L7f
            r3 = r4
        L7f:
            if (r3 == 0) goto La0
            android.widget.EditText r1 = r7.f3500OooO0Oo
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto L8c
            int r1 = r7.f3551Oooooo
            goto L8e
        L8c:
            int r1 = r7.f3537OoooO
        L8e:
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.OooOO0(r1)
            o0ooOO0.OooOOOO r0 = r7.f3532Oooo0OO
            int r1 = r7.f3537OoooO
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.OooOO0(r1)
        La0:
            r7.invalidate()
        La3:
            r7.OooOOo()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooO0O0():void");
    }

    public final int OooO0OO() {
        float OooO0Oo2;
        if (this.f3522OooOoo) {
            int i = this.f3536Oooo0oo;
            OooO0OO oooO0OO = this.f3566oo000o;
            if (i == 0) {
                OooO0Oo2 = oooO0OO.OooO0Oo();
            } else if (i != 2) {
                return 0;
            } else {
                OooO0Oo2 = oooO0OO.OooO0Oo() / 2.0f;
            }
            return (int) OooO0Oo2;
        }
        return 0;
    }

    public final o0OOOO0o OooO0Oo() {
        o0OOOO0o o0oooo0o = new o0OOOO0o();
        o0oooo0o.f1643OooO0OO = OooO00o.o000OooO(getContext(), R.attr.motionDurationShort2, 87);
        o0oooo0o.f1644OooO0Oo = OooO00o.o000Oooo(getContext(), R.attr.motionEasingLinearInterpolator, oO00O0o0.f1815OooO00o);
        return o0oooo0o;
    }

    public final OooOOOO OooO0o(boolean z) {
        float f;
        float dimensionPixelOffset;
        ColorStateList colorStateList;
        int i;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        if (z) {
            f = dimensionPixelOffset2;
        } else {
            f = 0.0f;
        }
        EditText editText = this.f3500OooO0Oo;
        if (editText instanceof o0OOO0o.oo000o) {
            dimensionPixelOffset = ((o0OOO0o.oo000o) editText).getPopupElevation();
        } else {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        Oooo000 oooo000 = new Oooo000();
        oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(f);
        oooo000.f5532OooO0o = new o0ooOO0.OooO0o(f);
        oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(dimensionPixelOffset2);
        oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(dimensionPixelOffset2);
        o0ooOO0.Oooo0 oooo0 = new o0ooOO0.Oooo0(oooo000);
        EditText editText2 = this.f3500OooO0Oo;
        if (editText2 instanceof o0OOO0o.oo000o) {
            colorStateList = ((o0OOO0o.oo000o) editText2).getDropDownBackgroundTintList();
        } else {
            colorStateList = null;
        }
        Context context = getContext();
        if (colorStateList == null) {
            Paint paint = OooOOOO.f5492OooOo0o;
            TypedValue o000o000 = OooO00o.o000o000(context, R.attr.colorSurface, OooOOOO.class.getSimpleName());
            int i2 = o000o000.resourceId;
            if (i2 != 0) {
                Object obj = OooOo0.Oooo000.f1139OooO00o;
                i = oo000o.OooO00o(context, i2);
            } else {
                i = o000o000.data;
            }
            colorStateList = ColorStateList.valueOf(i);
        }
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.OooO0oo(context);
        oooOOOO.OooOO0(colorStateList);
        oooOOOO.OooO(dimensionPixelOffset);
        oooOOOO.setShapeAppearanceModel(oooo0);
        OooOOO oooOOO = oooOOOO.f5494OooO00o;
        if (oooOOO.f5475OooO0oo == null) {
            oooOOO.f5475OooO0oo = new Rect();
        }
        oooOOOO.f5494OooO00o.f5475OooO0oo.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        oooOOOO.invalidateSelf();
        return oooOOOO;
    }

    public final boolean OooO0o0() {
        return this.f3522OooOoo && !TextUtils.isEmpty(this.f3524OooOooO) && (this.f3528Oooo000 instanceof OooOOO0);
    }

    public final int OooO0oO(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.f3500OooO0Oo.getCompoundPaddingLeft() : this.f3499OooO0OO.OooO0OO() : this.f3498OooO0O0.OooO00o()) + i;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo() {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooO0oo():void");
    }

    public final void OooOO0O(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(2131755416);
            Context context = getContext();
            Object obj = OooOo0.Oooo000.f1139OooO00o;
            textView.setTextColor(oo000o.OooO00o(context, R.color.design_error));
        }
    }

    public final boolean OooOO0o() {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (o00oo0.f5392OooOOOO == 1 && o00oo0.f5394OooOOo != null && !TextUtils.isEmpty(o00oo0.f5393OooOOOo)) {
            return true;
        }
        return false;
    }

    public final void OooOOO() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o00oOoo o00oooo = this.f3509OooOOOO;
        if (o00oooo != null) {
            OooOO0O(o00oooo, this.OooOOO0 ? this.f3510OooOOOo : this.f3512OooOOo0);
            if (!this.OooOOO0 && (colorStateList2 = this.f3520OooOoO0) != null) {
                this.f3509OooOOOO.setTextColor(colorStateList2);
            }
            if (!this.OooOOO0 || (colorStateList = this.f3519OooOoO) == null) {
                return;
            }
            this.f3509OooOOOO.setTextColor(colorStateList);
        }
    }

    public final void OooOOO0(Editable editable) {
        int i;
        boolean z;
        int i2;
        o00O0O o00o0o;
        ((o0OOO0o) this.f3508OooOOO).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        boolean z2 = this.OooOOO0;
        int i3 = this.f3507OooOO0o;
        String str = null;
        if (i3 == -1) {
            this.f3509OooOOOO.setText(String.valueOf(i));
            this.f3509OooOOOO.setContentDescription(null);
            this.OooOOO0 = false;
        } else {
            boolean z3 = true;
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.OooOOO0 = z;
            Context context = getContext();
            o00oOoo o00oooo = this.f3509OooOOOO;
            int i4 = this.f3507OooOO0o;
            if (this.OooOOO0) {
                i2 = R.string.character_counter_overflowed_content_description;
            } else {
                i2 = R.string.character_counter_content_description;
            }
            o00oooo.setContentDescription(context.getString(i2, Integer.valueOf(i), Integer.valueOf(i4)));
            if (z2 != this.OooOOO0) {
                OooOOO();
            }
            String str2 = o00O0O.f1211OooO0Oo;
            Locale locale = Locale.getDefault();
            int i5 = o000OOo.f1210OooO00o;
            if (o0O0O00.OooO00o(locale) != 1) {
                z3 = false;
            }
            if (z3) {
                o00o0o = o00O0O.f1214OooO0oO;
            } else {
                o00o0o = o00O0O.f1212OooO0o;
            }
            o00oOoo o00oooo2 = this.f3509OooOOOO;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.f3507OooOO0o));
            if (string == null) {
                o00o0o.getClass();
            } else {
                str = o00o0o.OooO0OO(string, o00o0o.f1217OooO0OO).toString();
            }
            o00oooo2.setText(str);
        }
        if (this.f3500OooO0Oo != null && z2 != this.OooOOO0) {
            OooOo00(false, false);
            OooOo0o();
            OooOOo0();
        }
    }

    public final void OooOOOO() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3521OooOoOO;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue o000OoOo = OooO00o.o000OoOo(context, R.attr.colorControlActivated);
            if (o000OoOo != null) {
                int i = o000OoOo.resourceId;
                if (i != 0) {
                    colorStateList2 = OooOo0.Oooo000.OooO00o(context, i);
                } else {
                    int i2 = o000OoOo.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f3500OooO0Oo;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                textCursorDrawable2 = this.f3500OooO0Oo.getTextCursorDrawable();
                Drawable mutate = textCursorDrawable2.mutate();
                if (!OooOO0o() && (this.f3509OooOOOO == null || !this.OooOOO0)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && (colorStateList = this.f3523OooOoo0) != null) {
                    colorStateList2 = colorStateList;
                }
                OooOoO0.o0OOO0o.OooO0oo(mutate, colorStateList2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0093, code lost:
        if (r3.OooO0Oo() != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
        if (r3.f5366OooOOOo != null) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOOo() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOOOo():boolean");
    }

    public final void OooOOo() {
        EditText editText = this.f3500OooO0Oo;
        if (editText != null && this.f3528Oooo000 != null) {
            if ((this.f3527Oooo0 || editText.getBackground() == null) && this.f3536Oooo0oo != 0) {
                Drawable editTextBoxBackground = getEditTextBoxBackground();
                EditText editText2 = this.f3500OooO0Oo;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0O0.OooOOo0(editText2, editTextBoxBackground);
                this.f3527Oooo0 = true;
            }
        }
    }

    public final void OooOOo0() {
        Drawable background;
        o00oOoo o00oooo;
        int currentTextColor;
        EditText editText = this.f3500OooO0Oo;
        if (editText == null || this.f3536Oooo0oo != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = o00O0OO0.f2334OooO00o;
        Drawable mutate = background.mutate();
        if (OooOO0o()) {
            currentTextColor = getErrorCurrentTextColors();
        } else if (this.OooOOO0 && (o00oooo = this.f3509OooOOOO) != null) {
            currentTextColor = o00oooo.getCurrentTextColor();
        } else {
            mutate.clearColorFilter();
            this.f3500OooO0Oo.refreshDrawableState();
            return;
        }
        mutate.setColorFilter(androidx.appcompat.widget.o0Oo0oo.OooO0OO(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void OooOOoo() {
        if (this.f3536Oooo0oo != 1) {
            FrameLayout frameLayout = this.f3497OooO00o;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int OooO0OO2 = OooO0OO();
            if (OooO0OO2 != layoutParams.topMargin) {
                layoutParams.topMargin = OooO0OO2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void OooOo0(Editable editable) {
        int i;
        ((o0OOO0o) this.f3508OooOOO).getClass();
        if (editable != null) {
            i = editable.length();
        } else {
            i = 0;
        }
        FrameLayout frameLayout = this.f3497OooO00o;
        if (i == 0 && !this.f3560o00ooo) {
            if (this.f3516OooOo00 != null && this.f3513OooOOoo && !TextUtils.isEmpty(this.f3511OooOOo)) {
                this.f3516OooOo00.setText(this.f3511OooOOo);
                oO0000Oo.OooO00o(frameLayout, this.f3518OooOo0o);
                this.f3516OooOo00.setVisibility(0);
                this.f3516OooOo00.bringToFront();
                announceForAccessibility(this.f3511OooOOo);
                return;
            }
            return;
        }
        o00oOoo o00oooo = this.f3516OooOo00;
        if (o00oooo != null && this.f3513OooOOoo) {
            o00oooo.setText((CharSequence) null);
            oO0000Oo.OooO00o(frameLayout, this.f3514OooOo);
            this.f3516OooOo00.setVisibility(4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo00(boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOo00(boolean, boolean):void");
    }

    public final void OooOo0O(boolean z, boolean z2) {
        int defaultColor = this.f3562o0OoOo0.getDefaultColor();
        int colorForState = this.f3562o0OoOo0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f3562o0OoOo0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f3537OoooO = colorForState2;
        } else if (z2) {
            this.f3537OoooO = colorForState;
        } else {
            this.f3537OoooO = defaultColor;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOo0o() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.OooOo0o():void");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3497OooO00o;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        OooOOoo();
        setEditText((EditText) view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f3500OooO0Oo;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f3502OooO0o0 != null) {
            boolean z = this.f3525OooOooo;
            this.f3525OooOooo = false;
            CharSequence hint = editText.getHint();
            this.f3500OooO0Oo.setHint(this.f3502OooO0o0);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f3500OooO0Oo.setHint(hint);
                this.f3525OooOooo = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f3497OooO00o;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f3500OooO0Oo) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3565o0ooOoO = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3565o0ooOoO = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        OooOOOO oooOOOO;
        super.draw(canvas);
        boolean z = this.f3522OooOoo;
        OooO0OO oooO0OO = this.f3566oo000o;
        if (z) {
            oooO0OO.getClass();
            int save = canvas.save();
            if (oooO0OO.f5232OooOoo0 != null) {
                RectF rectF = oooO0OO.f5211OooO0o0;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = oooO0OO.f5244Oooo0oO;
                    textPaint.setTextSize(oooO0OO.f5238Oooo00O);
                    float f = oooO0OO.f5219OooOOOo;
                    float f2 = oooO0OO.f5221OooOOo0;
                    float f3 = oooO0OO.f5237Oooo000;
                    if (f3 != 1.0f) {
                        canvas.scale(f3, f3, f, f2);
                    }
                    boolean z2 = true;
                    if (oooO0OO.f5257OooooO0 <= 1 || oooO0OO.f5231OooOoo) {
                        z2 = false;
                    }
                    if (z2) {
                        int alpha = textPaint.getAlpha();
                        canvas.translate(oooO0OO.f5219OooOOOo - oooO0OO.f5253OoooOo0.getLineStart(0), f2);
                        float f4 = alpha;
                        textPaint.setAlpha((int) (oooO0OO.f5255Ooooo00 * f4));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f5 = oooO0OO.f5239Oooo00o;
                            float f6 = oooO0OO.f5236Oooo0;
                            float f7 = oooO0OO.f5240Oooo0O0;
                            int i2 = oooO0OO.f5241Oooo0OO;
                            textPaint.setShadowLayer(f5, f6, f7, OooOo.OooO00o.OooO0OO(i2, (Color.alpha(i2) * textPaint.getAlpha()) / 255));
                        }
                        oooO0OO.f5253OoooOo0.draw(canvas);
                        textPaint.setAlpha((int) (oooO0OO.f5254OoooOoo * f4));
                        if (i >= 31) {
                            float f8 = oooO0OO.f5239Oooo00o;
                            float f9 = oooO0OO.f5236Oooo0;
                            float f10 = oooO0OO.f5240Oooo0O0;
                            int i3 = oooO0OO.f5241Oooo0OO;
                            textPaint.setShadowLayer(f8, f9, f10, OooOo.OooO00o.OooO0OO(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = oooO0OO.f5253OoooOo0.getLineBaseline(0);
                        CharSequence charSequence = oooO0OO.f5256Ooooo0o;
                        float f11 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(oooO0OO.f5239Oooo00o, oooO0OO.f5236Oooo0, oooO0OO.f5240Oooo0O0, oooO0OO.f5241Oooo0OO);
                        }
                        String trim = oooO0OO.f5256Ooooo0o.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(oooO0OO.f5253OoooOo0.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                    } else {
                        canvas.translate(f, f2);
                        oooO0OO.f5253OoooOo0.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f3532Oooo0OO != null && (oooOOOO = this.f3531Oooo0O0) != null) {
            oooOOOO.draw(canvas);
            if (this.f3500OooO0Oo.isFocused()) {
                Rect bounds = this.f3532Oooo0OO.getBounds();
                Rect bounds2 = this.f3531Oooo0O0.getBounds();
                float f12 = oooO0OO.f5207OooO0O0;
                int centerX = bounds2.centerX();
                int i4 = bounds2.left;
                LinearInterpolator linearInterpolator = oO00O0o0.f1815OooO00o;
                bounds.left = Math.round((i4 - centerX) * f12) + centerX;
                bounds.right = Math.round(f12 * (bounds2.right - centerX)) + centerX;
                this.f3532Oooo0OO.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        boolean z3;
        if (this.f3564o0ooOOo) {
            return;
        }
        boolean z4 = true;
        this.f3564o0ooOOo = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        OooO0OO oooO0OO = this.f3566oo000o;
        if (oooO0OO != null) {
            oooO0OO.f5243Oooo0o0 = drawableState;
            ColorStateList colorStateList2 = oooO0OO.f5215OooOO0O;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = oooO0OO.f5214OooOO0) != null && colorStateList.isStateful())) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                oooO0OO.OooO0oo(false);
                z3 = true;
            } else {
                z3 = false;
            }
            z = z3 | false;
        } else {
            z = false;
        }
        if (this.f3500OooO0Oo != null) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (!oo0o0O0.OooO0OO(this) || !isEnabled()) {
                z4 = false;
            }
            OooOo00(z4, false);
        }
        OooOOo0();
        OooOo0o();
        if (z) {
            invalidate();
        }
        this.f3564o0ooOOo = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3500OooO0Oo;
        if (editText != null) {
            return OooO0OO() + getPaddingTop() + editText.getBaseline();
        }
        return super.getBaseline();
    }

    public OooOOOO getBoxBackground() {
        int i = this.f3536Oooo0oo;
        if (i == 1 || i == 2) {
            return this.f3528Oooo000;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3541OoooOO0;
    }

    public int getBoxBackgroundMode() {
        return this.f3536Oooo0oo;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3526Oooo;
    }

    public float getBoxCornerRadiusBottomEnd() {
        OooOO0 oooOO0;
        boolean o0000O2 = OooO00o.o0000O(this);
        RectF rectF = this.f3543OoooOOo;
        if (o0000O2) {
            oooOO0 = this.f3534Oooo0o0.f5523OooO0oo;
        } else {
            oooOO0 = this.f3534Oooo0o0.f5522OooO0oO;
        }
        return oooOO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        OooOO0 oooOO0;
        boolean o0000O2 = OooO00o.o0000O(this);
        RectF rectF = this.f3543OoooOOo;
        if (o0000O2) {
            oooOO0 = this.f3534Oooo0o0.f5522OooO0oO;
        } else {
            oooOO0 = this.f3534Oooo0o0.f5523OooO0oo;
        }
        return oooOO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        OooOO0 oooOO0;
        boolean o0000O2 = OooO00o.o0000O(this);
        RectF rectF = this.f3543OoooOOo;
        if (o0000O2) {
            oooOO0 = this.f3534Oooo0o0.f5521OooO0o0;
        } else {
            oooOO0 = this.f3534Oooo0o0.f5520OooO0o;
        }
        return oooOO0.OooO00o(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        OooOO0 oooOO0;
        boolean o0000O2 = OooO00o.o0000O(this);
        RectF rectF = this.f3543OoooOOo;
        if (o0000O2) {
            oooOO0 = this.f3534Oooo0o0.f5520OooO0o;
        } else {
            oooOO0 = this.f3534Oooo0o0.f5521OooO0o0;
        }
        return oooOO0.OooO00o(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3554Ooooooo;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3562o0OoOo0;
    }

    public int getBoxStrokeWidth() {
        return this.f3538OoooO0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3540OoooO0O;
    }

    public int getCounterMaxLength() {
        return this.f3507OooOO0o;
    }

    public CharSequence getCounterOverflowDescription() {
        o00oOoo o00oooo;
        if (this.f3506OooOO0O && this.OooOOO0 && (o00oooo = this.f3509OooOOOO) != null) {
            return o00oooo.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3519OooOoO;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3520OooOoO0;
    }

    public ColorStateList getCursorColor() {
        return this.f3521OooOoOO;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3523OooOoo0;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3550OooooOo;
    }

    public EditText getEditText() {
        return this.f3500OooO0Oo;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3499OooO0OO.f5359OooO0oO.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3499OooO0OO.f5359OooO0oO.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3499OooO0OO.OooOOO0;
    }

    public int getEndIconMode() {
        return this.f3499OooO0OO.f5352OooO;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3499OooO0OO.f5364OooOOO;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3499OooO0OO.f5359OooO0oO;
    }

    public CharSequence getError() {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (o00oo0.f5395OooOOo0) {
            return o00oo0.f5393OooOOOo;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3505OooOO0.f5399OooOo00;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3505OooOO0.f5396OooOOoo;
    }

    public int getErrorCurrentTextColors() {
        o00oOoo o00oooo = this.f3505OooOO0.f5394OooOOo;
        if (o00oooo != null) {
            return o00oooo.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3499OooO0OO.f5355OooO0OO.getDrawable();
    }

    public CharSequence getHelperText() {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (o00oo0.f5397OooOo) {
            return o00oo0.f5401OooOo0o;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        o00oOoo o00oooo = this.f3505OooOO0.f5403OooOoO0;
        if (o00oooo != null) {
            return o00oooo.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3522OooOoo) {
            return this.f3524OooOooO;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3566oo000o.OooO0Oo();
    }

    public final int getHintCurrentCollapsedTextColor() {
        OooO0OO oooO0OO = this.f3566oo000o;
        return oooO0OO.OooO0o0(oooO0OO.f5215OooOO0O);
    }

    public ColorStateList getHintTextColor() {
        return this.f3552Oooooo0;
    }

    public o0OO00O getLengthCounter() {
        return this.f3508OooOOO;
    }

    public int getMaxEms() {
        return this.f3503OooO0oO;
    }

    public int getMaxWidth() {
        return this.f3496OooO;
    }

    public int getMinEms() {
        return this.f3501OooO0o;
    }

    public int getMinWidth() {
        return this.f3504OooO0oo;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3499OooO0OO.f5359OooO0oO.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3499OooO0OO.f5359OooO0oO.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3513OooOOoo) {
            return this.f3511OooOOo;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3517OooOo0O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3515OooOo0;
    }

    public CharSequence getPrefixText() {
        return this.f3498OooO0O0.f5421OooO0OO;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3498OooO0O0.f5420OooO0O0.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3498OooO0O0.f5420OooO0O0;
    }

    public o0ooOO0.Oooo0 getShapeAppearanceModel() {
        return this.f3534Oooo0o0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3498OooO0O0.f5422OooO0Oo.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3498OooO0O0.f5422OooO0Oo.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3498OooO0O0.f5425OooO0oO;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3498OooO0O0.f5426OooO0oo;
    }

    public CharSequence getSuffixText() {
        return this.f3499OooO0OO.f5366OooOOOo;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3499OooO0OO.f5368OooOOo0.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3499OooO0OO.f5368OooOOo0;
    }

    public Typeface getTypeface() {
        return this.f3544OoooOo0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3566oo000o.OooO0oO(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.f3561o0OOO0o = false;
        if (this.f3500OooO0Oo != null && this.f3500OooO0Oo.getMeasuredHeight() < (max = Math.max(oooo0.getMeasuredHeight(), this.f3498OooO0O0.getMeasuredHeight()))) {
            this.f3500OooO0Oo.setMinimumHeight(max);
            z = true;
        }
        boolean OooOOOo2 = OooOOOo();
        if (z || OooOOOo2) {
            this.f3500OooO0Oo.post(new androidx.activity.OooO0o(12, this));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.f3561o0OOO0o;
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (!z) {
            oooo0.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3561o0OOO0o = true;
        }
        if (this.f3516OooOo00 != null && (editText = this.f3500OooO0Oo) != null) {
            this.f3516OooOo00.setGravity(editText.getGravity());
            this.f3516OooOo00.setPadding(this.f3500OooO0Oo.getCompoundPaddingLeft(), this.f3500OooO0Oo.getCompoundPaddingTop(), this.f3500OooO0Oo.getCompoundPaddingRight(), this.f3500OooO0Oo.getCompoundPaddingBottom());
        }
        oooo0.OooOOO0();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oo0o0Oo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oo0o0Oo oo0o0oo = (oo0o0Oo) parcelable;
        super.onRestoreInstanceState(oo0o0oo.f1456OooO00o);
        setError(oo0o0oo.f5436OooO0OO);
        if (oo0o0oo.f5437OooO0Oo) {
            post(new androidx.activity.OooOOO(8, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != this.f3533Oooo0o) {
            OooOO0 oooOO0 = this.f3534Oooo0o0.f5521OooO0o0;
            RectF rectF = this.f3543OoooOOo;
            float OooO00o2 = oooOO0.OooO00o(rectF);
            float OooO00o3 = this.f3534Oooo0o0.f5520OooO0o.OooO00o(rectF);
            float OooO00o4 = this.f3534Oooo0o0.f5523OooO0oo.OooO00o(rectF);
            float OooO00o5 = this.f3534Oooo0o0.f5522OooO0oO.OooO00o(rectF);
            o0ooOO0.Oooo0 oooo0 = this.f3534Oooo0o0;
            OooO0O0 oooO0O0 = oooo0.f5516OooO00o;
            Oooo000 oooo000 = new Oooo000();
            OooO0O0 oooO0O02 = oooo0.f5517OooO0O0;
            oooo000.f5528OooO00o = oooO0O02;
            Oooo000.OooO0O0(oooO0O02);
            oooo000.f5529OooO0O0 = oooO0O0;
            Oooo000.OooO0O0(oooO0O0);
            OooO0O0 oooO0O03 = oooo0.f5518OooO0OO;
            oooo000.f5531OooO0Oo = oooO0O03;
            Oooo000.OooO0O0(oooO0O03);
            OooO0O0 oooO0O04 = oooo0.f5519OooO0Oo;
            oooo000.f5530OooO0OO = oooO0O04;
            Oooo000.OooO0O0(oooO0O04);
            oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(OooO00o3);
            oooo000.f5532OooO0o = new o0ooOO0.OooO0o(OooO00o2);
            oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(OooO00o5);
            oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(OooO00o4);
            o0ooOO0.Oooo0 oooo02 = new o0ooOO0.Oooo0(oooo000);
            this.f3533Oooo0o = z;
            setShapeAppearanceModel(oooo02);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        oo0o0Oo oo0o0oo = new oo0o0Oo(super.onSaveInstanceState());
        if (OooOO0o()) {
            oo0o0oo.f5436OooO0OO = getError();
        }
        Oooo0 oooo0 = this.f3499OooO0OO;
        boolean z2 = true;
        if (oooo0.f5352OooO != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !oooo0.f5359OooO0oO.isChecked()) {
            z2 = false;
        }
        oo0o0oo.f5437OooO0Oo = z2;
        return oo0o0oo;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3541OoooOO0 != i) {
            this.f3541OoooOO0 = i;
            this.f3567ooOO = i;
            this.o00Oo0 = i;
            this.f3557o00Ooo = i;
            OooO0O0();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = OooOo0.Oooo000.f1139OooO00o;
        setBoxBackgroundColor(oo000o.OooO00o(context, i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3567ooOO = defaultColor;
        this.f3541OoooOO0 = defaultColor;
        this.f3556o00O0O = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.o00Oo0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f3557o00Ooo = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        OooO0O0();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f3536Oooo0oo) {
            return;
        }
        this.f3536Oooo0oo = i;
        if (this.f3500OooO0Oo != null) {
            OooO0oo();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f3526Oooo = i;
    }

    public void setBoxCornerFamily(int i) {
        o0ooOO0.Oooo0 oooo0 = this.f3534Oooo0o0;
        oooo0.getClass();
        Oooo000 oooo000 = new Oooo000(oooo0);
        OooOO0 oooOO0 = this.f3534Oooo0o0.f5521OooO0o0;
        OooO0O0 OoooOOO2 = OooO00o.OoooOOO(i);
        oooo000.f5528OooO00o = OoooOOO2;
        Oooo000.OooO0O0(OoooOOO2);
        oooo000.f5533OooO0o0 = oooOO0;
        OooOO0 oooOO02 = this.f3534Oooo0o0.f5520OooO0o;
        OooO0O0 OoooOOO3 = OooO00o.OoooOOO(i);
        oooo000.f5529OooO0O0 = OoooOOO3;
        Oooo000.OooO0O0(OoooOOO3);
        oooo000.f5532OooO0o = oooOO02;
        OooOO0 oooOO03 = this.f3534Oooo0o0.f5523OooO0oo;
        OooO0O0 OoooOOO4 = OooO00o.OoooOOO(i);
        oooo000.f5531OooO0Oo = OoooOOO4;
        Oooo000.OooO0O0(OoooOOO4);
        oooo000.f5535OooO0oo = oooOO03;
        OooOO0 oooOO04 = this.f3534Oooo0o0.f5522OooO0oO;
        OooO0O0 OoooOOO5 = OooO00o.OoooOOO(i);
        oooo000.f5530OooO0OO = OoooOOO5;
        Oooo000.OooO0O0(OoooOOO5);
        oooo000.f5534OooO0oO = oooOO04;
        this.f3534Oooo0o0 = new o0ooOO0.Oooo0(oooo000);
        OooO0O0();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f3554Ooooooo != i) {
            this.f3554Ooooooo = i;
            OooOo0o();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.f3554Ooooooo != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            OooOo0o();
        }
        this.f3551Oooooo = colorStateList.getDefaultColor();
        this.f3558o00o0O = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3553OoooooO = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        defaultColor = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f3554Ooooooo = defaultColor;
        OooOo0o();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3562o0OoOo0 != colorStateList) {
            this.f3562o0OoOo0 = colorStateList;
            OooOo0o();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f3538OoooO0 = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f3540OoooO0O = i;
        OooOo0o();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f3506OooOO0O != z) {
            Editable editable = null;
            o00Oo0 o00oo0 = this.f3505OooOO0;
            if (z) {
                o00oOoo o00oooo = new o00oOoo(getContext(), null);
                this.f3509OooOOOO = o00oooo;
                o00oooo.setId(R.id.textinput_counter);
                Typeface typeface = this.f3544OoooOo0;
                if (typeface != null) {
                    this.f3509OooOOOO.setTypeface(typeface);
                }
                this.f3509OooOOOO.setMaxLines(1);
                o00oo0.OooO00o(this.f3509OooOOOO, 2);
                o000O0O0.OooO0oo((ViewGroup.MarginLayoutParams) this.f3509OooOOOO.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                OooOOO();
                if (this.f3509OooOOOO != null) {
                    EditText editText = this.f3500OooO0Oo;
                    if (editText != null) {
                        editable = editText.getText();
                    }
                    OooOOO0(editable);
                }
            } else {
                o00oo0.OooO0oO(this.f3509OooOOOO, 2);
                this.f3509OooOOOO = null;
            }
            this.f3506OooOO0O = z;
        }
    }

    public void setCounterMaxLength(int i) {
        Editable text;
        if (this.f3507OooOO0o != i) {
            if (i <= 0) {
                i = -1;
            }
            this.f3507OooOO0o = i;
            if (this.f3506OooOO0O && this.f3509OooOOOO != null) {
                EditText editText = this.f3500OooO0Oo;
                if (editText == null) {
                    text = null;
                } else {
                    text = editText.getText();
                }
                OooOOO0(text);
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3510OooOOOo != i) {
            this.f3510OooOOOo = i;
            OooOOO();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3519OooOoO != colorStateList) {
            this.f3519OooOoO = colorStateList;
            OooOOO();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3512OooOOo0 != i) {
            this.f3512OooOOo0 = i;
            OooOOO();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3520OooOoO0 != colorStateList) {
            this.f3520OooOoO0 = colorStateList;
            OooOOO();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f3521OooOoOO != colorStateList) {
            this.f3521OooOoOO = colorStateList;
            OooOOOO();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        boolean z;
        if (this.f3523OooOoo0 != colorStateList) {
            this.f3523OooOoo0 = colorStateList;
            if (!OooOO0o() && (this.f3509OooOOOO == null || !this.OooOOO0)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                OooOOOO();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3550OooooOo = colorStateList;
        this.f3552Oooooo0 = colorStateList;
        if (this.f3500OooO0Oo != null) {
            OooOo00(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OooOO0(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f3499OooO0OO.f5359OooO0oO.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f3499OooO0OO.f5359OooO0oO.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        CharSequence text = i != 0 ? oooo0.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        Drawable o0ooOoO2 = i != 0 ? OooO00o.o0ooOoO(oooo0.getContext(), i) : null;
        CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
        checkableImageButton.setImageDrawable(o0ooOoO2);
        if (o0ooOoO2 != null) {
            ColorStateList colorStateList = oooo0.f5362OooOO0O;
            PorterDuff.Mode mode = oooo0.f5363OooOO0o;
            TextInputLayout textInputLayout = oooo0.f5353OooO00o;
            OooO00o.OooOO0o(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO00o.o000OoOO(textInputLayout, checkableImageButton, oooo0.f5362OooOO0O);
        }
    }

    public void setEndIconMinSize(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (i >= 0) {
            if (i != oooo0.OooOOO0) {
                oooo0.OooOOO0 = i;
                CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                CheckableImageButton checkableImageButton2 = oooo0.f5355OooO0OO;
                checkableImageButton2.setMinimumWidth(i);
                checkableImageButton2.setMinimumHeight(i);
                return;
            }
            return;
        }
        oooo0.getClass();
        throw new IllegalArgumentException("endIconSize cannot be less than 0");
    }

    public void setEndIconMode(int i) {
        this.f3499OooO0OO.OooO0oO(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        View.OnLongClickListener onLongClickListener = oooo0.f5365OooOOOO;
        CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
        checkableImageButton.setOnClickListener(onClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5365OooOOOO = onLongClickListener;
        CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5364OooOOO = scaleType;
        oooo0.f5359OooO0oO.setScaleType(scaleType);
        oooo0.f5355OooO0OO.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (oooo0.f5362OooOO0O != colorStateList) {
            oooo0.f5362OooOO0O = colorStateList;
            OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5359OooO0oO, colorStateList, oooo0.f5363OooOO0o);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (oooo0.f5363OooOO0o != mode) {
            oooo0.f5363OooOO0o = mode;
            OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5359OooO0oO, oooo0.f5362OooOO0O, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.f3499OooO0OO.OooO0oo(z);
    }

    public void setError(CharSequence charSequence) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (!o00oo0.f5395OooOOo0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            o00oo0.OooO0OO();
            o00oo0.f5393OooOOOo = charSequence;
            o00oo0.f5394OooOOo.setText(charSequence);
            int i = o00oo0.f5391OooOOO;
            if (i != 1) {
                o00oo0.f5392OooOOOO = 1;
            }
            o00oo0.OooO(i, o00oo0.f5392OooOOOO, o00oo0.OooO0oo(o00oo0.f5394OooOOo, charSequence));
            return;
        }
        o00oo0.OooO0o();
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5399OooOo00 = i;
        o00oOoo o00oooo = o00oo0.f5394OooOOo;
        if (o00oooo != null) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0o0O0.OooO0o(o00oooo, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5396OooOOoo = charSequence;
        o00oOoo o00oooo = o00oo0.f5394OooOOo;
        if (o00oooo != null) {
            o00oooo.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (o00oo0.f5395OooOOo0 != z) {
            o00oo0.OooO0OO();
            TextInputLayout textInputLayout = o00oo0.f5387OooO0oo;
            if (z) {
                o00oOoo o00oooo = new o00oOoo(o00oo0.f5386OooO0oO, null);
                o00oo0.f5394OooOOo = o00oooo;
                o00oooo.setId(R.id.textinput_error);
                o00oo0.f5394OooOOo.setTextAlignment(5);
                Typeface typeface = o00oo0.f5405OooOoo0;
                if (typeface != null) {
                    o00oo0.f5394OooOOo.setTypeface(typeface);
                }
                int i = o00oo0.f5398OooOo0;
                o00oo0.f5398OooOo0 = i;
                o00oOoo o00oooo2 = o00oo0.f5394OooOOo;
                if (o00oooo2 != null) {
                    textInputLayout.OooOO0O(o00oooo2, i);
                }
                ColorStateList colorStateList = o00oo0.f5400OooOo0O;
                o00oo0.f5400OooOo0O = colorStateList;
                o00oOoo o00oooo3 = o00oo0.f5394OooOOo;
                if (o00oooo3 != null && colorStateList != null) {
                    o00oooo3.setTextColor(colorStateList);
                }
                CharSequence charSequence = o00oo0.f5396OooOOoo;
                o00oo0.f5396OooOOoo = charSequence;
                o00oOoo o00oooo4 = o00oo0.f5394OooOOo;
                if (o00oooo4 != null) {
                    o00oooo4.setContentDescription(charSequence);
                }
                int i2 = o00oo0.f5399OooOo00;
                o00oo0.f5399OooOo00 = i2;
                o00oOoo o00oooo5 = o00oo0.f5394OooOOo;
                if (o00oooo5 != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    oo0o0O0.OooO0o(o00oooo5, i2);
                }
                o00oo0.f5394OooOOo.setVisibility(4);
                o00oo0.OooO00o(o00oo0.f5394OooOOo, 0);
            } else {
                o00oo0.OooO0o();
                o00oo0.OooO0oO(o00oo0.f5394OooOOo, 0);
                o00oo0.f5394OooOOo = null;
                textInputLayout.OooOOo0();
                textInputLayout.OooOo0o();
            }
            o00oo0.f5395OooOOo0 = z;
        }
    }

    public void setErrorIconDrawable(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.OooO(i != 0 ? OooO00o.o0ooOoO(oooo0.getContext(), i) : null);
        OooO00o.o000OoOO(oooo0.f5353OooO00o, oooo0.f5355OooO0OO, oooo0.f5356OooO0Oo);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        CheckableImageButton checkableImageButton = oooo0.f5355OooO0OO;
        View.OnLongClickListener onLongClickListener = oooo0.f5357OooO0o;
        checkableImageButton.setOnClickListener(onClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5357OooO0o = onLongClickListener;
        CheckableImageButton checkableImageButton = oooo0.f5355OooO0OO;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (oooo0.f5356OooO0Oo != colorStateList) {
            oooo0.f5356OooO0Oo = colorStateList;
            OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5355OooO0OO, colorStateList, oooo0.f5358OooO0o0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (oooo0.f5358OooO0o0 != mode) {
            oooo0.f5358OooO0o0 = mode;
            OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5355OooO0OO, oooo0.f5356OooO0Oo, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5398OooOo0 = i;
        o00oOoo o00oooo = o00oo0.f5394OooOOo;
        if (o00oooo != null) {
            o00oo0.f5387OooO0oo.OooOO0O(o00oooo, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5400OooOo0O = colorStateList;
        o00oOoo o00oooo = o00oo0.f5394OooOOo;
        if (o00oooo != null && colorStateList != null) {
            o00oooo.setTextColor(colorStateList);
        }
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.o00oO0o != z) {
            this.o00oO0o = z;
            OooOo00(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (isEmpty) {
            if (o00oo0.f5397OooOo) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!o00oo0.f5397OooOo) {
            setHelperTextEnabled(true);
        }
        o00oo0.OooO0OO();
        o00oo0.f5401OooOo0o = charSequence;
        o00oo0.f5403OooOoO0.setText(charSequence);
        int i = o00oo0.f5391OooOOO;
        if (i != 2) {
            o00oo0.f5392OooOOOO = 2;
        }
        o00oo0.OooO(i, o00oo0.f5392OooOOOO, o00oo0.OooO0oo(o00oo0.f5403OooOoO0, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5404OooOoOO = colorStateList;
        o00oOoo o00oooo = o00oo0.f5403OooOoO0;
        if (o00oooo != null && colorStateList != null) {
            o00oooo.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        if (o00oo0.f5397OooOo != z) {
            o00oo0.OooO0OO();
            if (z) {
                o00oOoo o00oooo = new o00oOoo(o00oo0.f5386OooO0oO, null);
                o00oo0.f5403OooOoO0 = o00oooo;
                o00oooo.setId(R.id.textinput_helper_text);
                o00oo0.f5403OooOoO0.setTextAlignment(5);
                Typeface typeface = o00oo0.f5405OooOoo0;
                if (typeface != null) {
                    o00oo0.f5403OooOoO0.setTypeface(typeface);
                }
                o00oo0.f5403OooOoO0.setVisibility(4);
                oo0o0O0.OooO0o(o00oo0.f5403OooOoO0, 1);
                int i = o00oo0.f5402OooOoO;
                o00oo0.f5402OooOoO = i;
                o00oOoo o00oooo2 = o00oo0.f5403OooOoO0;
                if (o00oooo2 != null) {
                    o00oooo2.setTextAppearance(i);
                }
                ColorStateList colorStateList = o00oo0.f5404OooOoOO;
                o00oo0.f5404OooOoOO = colorStateList;
                o00oOoo o00oooo3 = o00oo0.f5403OooOoO0;
                if (o00oooo3 != null && colorStateList != null) {
                    o00oooo3.setTextColor(colorStateList);
                }
                o00oo0.OooO00o(o00oo0.f5403OooOoO0, 1);
                o00oo0.f5403OooOoO0.setAccessibilityDelegate(new o0OOO0o.o00O0O(o00oo0));
            } else {
                o00oo0.OooO0OO();
                int i2 = o00oo0.f5391OooOOO;
                if (i2 == 2) {
                    o00oo0.f5392OooOOOO = 0;
                }
                o00oo0.OooO(i2, o00oo0.f5392OooOOOO, o00oo0.OooO0oo(o00oo0.f5403OooOoO0, ""));
                o00oo0.OooO0oO(o00oo0.f5403OooOoO0, 1);
                o00oo0.f5403OooOoO0 = null;
                TextInputLayout textInputLayout = o00oo0.f5387OooO0oo;
                textInputLayout.OooOOo0();
                textInputLayout.OooOo0o();
            }
            o00oo0.f5397OooOo = z;
        }
    }

    public void setHelperTextTextAppearance(int i) {
        o00Oo0 o00oo0 = this.f3505OooOO0;
        o00oo0.f5402OooOoO = i;
        o00oOoo o00oooo = o00oo0.f5403OooOoO0;
        if (o00oooo != null) {
            o00oooo.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f3559o00oO0O = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f3522OooOoo) {
            this.f3522OooOoo = z;
            if (z) {
                CharSequence hint = this.f3500OooO0Oo.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3524OooOooO)) {
                        setHint(hint);
                    }
                    this.f3500OooO0Oo.setHint((CharSequence) null);
                }
                this.f3525OooOooo = true;
            } else {
                this.f3525OooOooo = false;
                if (!TextUtils.isEmpty(this.f3524OooOooO) && TextUtils.isEmpty(this.f3500OooO0Oo.getHint())) {
                    this.f3500OooO0Oo.setHint(this.f3524OooOooO);
                }
                setHintInternal(null);
            }
            if (this.f3500OooO0Oo != null) {
                OooOOoo();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        OooO0OO oooO0OO = this.f3566oo000o;
        View view = oooO0OO.f5206OooO00o;
        oo000o.OooO0o oooO0o = new oo000o.OooO0o(view.getContext(), i);
        ColorStateList colorStateList = oooO0o.f5620OooOO0;
        if (colorStateList != null) {
            oooO0OO.f5215OooOO0O = colorStateList;
        }
        float f = oooO0o.f5621OooOO0O;
        if (f != 0.0f) {
            oooO0OO.f5205OooO = f;
        }
        ColorStateList colorStateList2 = oooO0o.f5612OooO00o;
        if (colorStateList2 != null) {
            oooO0OO.f5250OoooOO0 = colorStateList2;
        }
        oooO0OO.f5249OoooO0O = oooO0o.f5617OooO0o0;
        oooO0OO.f5246OoooO = oooO0o.f5616OooO0o;
        oooO0OO.f5247OoooO0 = oooO0o.f5618OooO0oO;
        oooO0OO.f5260o000oOoO = oooO0o.f5611OooO;
        oo000o.OooO00o oooO00o = oooO0OO.f5229OooOoO0;
        if (oooO00o != null) {
            oooO00o.f5604OooO0OO = true;
        }
        o0000OO0 o0000oo02 = new o0000OO0(27, oooO0OO);
        oooO0o.OooO00o();
        oooO0OO.f5229OooOoO0 = new oo000o.OooO00o(o0000oo02, oooO0o.f5623OooOOO);
        oooO0o.OooO0OO(view.getContext(), oooO0OO.f5229OooOoO0);
        oooO0OO.OooO0oo(false);
        this.f3552Oooooo0 = oooO0OO.f5215OooOO0O;
        if (this.f3500OooO0Oo != null) {
            OooOo00(false, false);
            OooOOoo();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3552Oooooo0 != colorStateList) {
            if (this.f3550OooooOo == null) {
                OooO0OO oooO0OO = this.f3566oo000o;
                if (oooO0OO.f5215OooOO0O != colorStateList) {
                    oooO0OO.f5215OooOO0O = colorStateList;
                    oooO0OO.OooO0oo(false);
                }
            }
            this.f3552Oooooo0 = colorStateList;
            if (this.f3500OooO0Oo != null) {
                OooOo00(false, false);
            }
        }
    }

    public void setLengthCounter(o0OO00O o0oo00o) {
        this.f3508OooOOO = o0oo00o;
    }

    public void setMaxEms(int i) {
        this.f3503OooO0oO = i;
        EditText editText = this.f3500OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f3496OooO = i;
        EditText editText = this.f3500OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f3501OooO0o = i;
        EditText editText = this.f3500OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f3504OooO0oo = i;
        EditText editText = this.f3500OooO0Oo;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5359OooO0oO.setContentDescription(i != 0 ? oooo0.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5359OooO0oO.setImageDrawable(i != 0 ? OooO00o.o0ooOoO(oooo0.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        if (z && oooo0.f5352OooO != 1) {
            oooo0.OooO0oO(1);
        } else if (!z) {
            oooo0.OooO0oO(0);
        } else {
            oooo0.getClass();
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5362OooOO0O = colorStateList;
        OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5359OooO0oO, colorStateList, oooo0.f5363OooOO0o);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.f5363OooOO0o = mode;
        OooO00o.OooOO0o(oooo0.f5353OooO00o, oooo0.f5359OooO0oO, oooo0.f5362OooOO0O, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        Editable editable = null;
        if (this.f3516OooOo00 == null) {
            o00oOoo o00oooo = new o00oOoo(getContext(), null);
            this.f3516OooOo00 = o00oooo;
            o00oooo.setId(R.id.textinput_placeholder);
            o00O0O0.OooOOoo(this.f3516OooOo00, 2);
            o0OOOO0o OooO0Oo2 = OooO0Oo();
            this.f3518OooOo0o = OooO0Oo2;
            OooO0Oo2.f1642OooO0O0 = 67L;
            this.f3514OooOo = OooO0Oo();
            setPlaceholderTextAppearance(this.f3517OooOo0O);
            setPlaceholderTextColor(this.f3515OooOo0);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3513OooOOoo) {
                setPlaceholderTextEnabled(true);
            }
            this.f3511OooOOo = charSequence;
        }
        EditText editText = this.f3500OooO0Oo;
        if (editText != null) {
            editable = editText.getText();
        }
        OooOo0(editable);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3517OooOo0O = i;
        o00oOoo o00oooo = this.f3516OooOo00;
        if (o00oooo != null) {
            o00oooo.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3515OooOo0 != colorStateList) {
            this.f3515OooOo0 = colorStateList;
            o00oOoo o00oooo = this.f3516OooOo00;
            if (o00oooo == null || colorStateList == null) {
                return;
            }
            o00oooo.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        CharSequence charSequence2;
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        o0ooooo.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        o0ooooo.f5421OooO0OO = charSequence2;
        o0ooooo.f5420OooO0O0.setText(charSequence);
        o0ooooo.OooO0o0();
    }

    public void setPrefixTextAppearance(int i) {
        this.f3498OooO0O0.f5420OooO0O0.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3498OooO0O0.f5420OooO0O0.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(o0ooOO0.Oooo0 oooo0) {
        OooOOOO oooOOOO = this.f3528Oooo000;
        if (oooOOOO != null && oooOOOO.f5494OooO00o.f5468OooO00o != oooo0) {
            this.f3534Oooo0o0 = oooo0;
            OooO0O0();
        }
    }

    public void setStartIconCheckable(boolean z) {
        this.f3498OooO0O0.f5422OooO0Oo.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? OooO00o.o0ooOoO(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        if (i >= 0) {
            if (i != o0ooooo.f5425OooO0oO) {
                o0ooooo.f5425OooO0oO = i;
                CheckableImageButton checkableImageButton = o0ooooo.f5422OooO0Oo;
                checkableImageButton.setMinimumWidth(i);
                checkableImageButton.setMinimumHeight(i);
                return;
            }
            return;
        }
        o0ooooo.getClass();
        throw new IllegalArgumentException("startIconSize cannot be less than 0");
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        View.OnLongClickListener onLongClickListener = o0ooooo.f5418OooO;
        CheckableImageButton checkableImageButton = o0ooooo.f5422OooO0Oo;
        checkableImageButton.setOnClickListener(onClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        o0ooooo.f5418OooO = onLongClickListener;
        CheckableImageButton checkableImageButton = o0ooooo.f5422OooO0Oo;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        OooO00o.oooo00o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        o0ooooo.f5426OooO0oo = scaleType;
        o0ooooo.f5422OooO0Oo.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        if (o0ooooo.f5424OooO0o0 != colorStateList) {
            o0ooooo.f5424OooO0o0 = colorStateList;
            OooO00o.OooOO0o(o0ooooo.f5419OooO00o, o0ooooo.f5422OooO0Oo, colorStateList, o0ooooo.f5423OooO0o);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        o0ooOOo o0ooooo = this.f3498OooO0O0;
        if (o0ooooo.f5423OooO0o != mode) {
            o0ooooo.f5423OooO0o = mode;
            OooO00o.OooOO0o(o0ooooo.f5419OooO00o, o0ooooo.f5422OooO0Oo, o0ooooo.f5424OooO0o0, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.f3498OooO0O0.OooO0OO(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        Oooo0 oooo0 = this.f3499OooO0OO;
        oooo0.getClass();
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        oooo0.f5366OooOOOo = charSequence2;
        oooo0.f5368OooOOo0.setText(charSequence);
        oooo0.OooOOO();
    }

    public void setSuffixTextAppearance(int i) {
        this.f3499OooO0OO.f5368OooOOo0.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3499OooO0OO.f5368OooOOo0.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(o0Oo0oo o0oo0oo) {
        EditText editText = this.f3500OooO0Oo;
        if (editText != null) {
            o0o0Oo.OooOO0o(editText, o0oo0oo);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3544OoooOo0) {
            this.f3544OoooOo0 = typeface;
            this.f3566oo000o.OooOOO0(typeface);
            o00Oo0 o00oo0 = this.f3505OooOO0;
            if (typeface != o00oo0.f5405OooOoo0) {
                o00oo0.f5405OooOoo0 = typeface;
                o00oOoo o00oooo = o00oo0.f5394OooOOo;
                if (o00oooo != null) {
                    o00oooo.setTypeface(typeface);
                }
                o00oOoo o00oooo2 = o00oo0.f5403OooOoO0;
                if (o00oooo2 != null) {
                    o00oooo2.setTypeface(typeface);
                }
            }
            o00oOoo o00oooo3 = this.f3509OooOOOO;
            if (o00oooo3 != null) {
                o00oooo3.setTypeface(typeface);
            }
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3522OooOoo) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3498OooO0O0.f5422OooO0Oo;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3498OooO0O0.OooO0O0(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3499OooO0OO.f5359OooO0oO.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3499OooO0OO.f5359OooO0oO.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3499OooO0OO.OooO(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3499OooO0OO.f5359OooO0oO;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        Oooo0 oooo0 = this.f3499OooO0OO;
        CheckableImageButton checkableImageButton = oooo0.f5359OooO0oO;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = oooo0.f5362OooOO0O;
            PorterDuff.Mode mode = oooo0.f5363OooOO0o;
            TextInputLayout textInputLayout = oooo0.f5353OooO00o;
            OooO00o.OooOO0o(textInputLayout, checkableImageButton, colorStateList, mode);
            OooO00o.o000OoOO(textInputLayout, checkableImageButton, oooo0.f5362OooOO0O);
        }
    }
}