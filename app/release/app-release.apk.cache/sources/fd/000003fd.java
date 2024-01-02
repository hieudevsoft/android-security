package com.google.android.material.timepicker;

import OooOOo0.o000oOoO;
import OooOo0.Oooo000;
import OooOooo.o0o0Oo;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class ClockFaceView extends OooOO0 implements OooO0o {

    /* renamed from: OooOo  reason: collision with root package name */
    public final SparseArray f3570OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public final Rect f3571OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final ClockHandView f3572OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final RectF f3573OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final Rect f3574OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final int[] f3575OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final OooO0OO f3576OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final float[] f3577OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public final int f3578OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final int f3579OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public final int f3580OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public final int f3581OooOooo;

    /* renamed from: Oooo000  reason: collision with root package name */
    public String[] f3582Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public float f3583Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public final ColorStateList f3584Oooo00o;

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3571OooOo0 = new Rect();
        this.f3573OooOo0O = new RectF();
        this.f3574OooOo0o = new Rect();
        SparseArray sparseArray = new SparseArray();
        this.f3570OooOo = sparseArray;
        this.f3577OooOoOO = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1790OooO0Oo, R.attr.materialClockStyle, 2131756112);
        Resources resources = getResources();
        ColorStateList o00oO0o = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 1);
        this.f3584Oooo00o = o00oO0o;
        LayoutInflater.from(context).inflate(R.layout.material_clockface_view, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        this.f3572OooOo00 = clockHandView;
        this.f3579OooOoo0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_padding);
        int colorForState = o00oO0o.getColorForState(new int[]{16842913}, o00oO0o.getDefaultColor());
        this.f3575OooOoO = new int[]{colorForState, colorForState, o00oO0o.getDefaultColor()};
        clockHandView.f3588OooO0OO.add(this);
        int defaultColor = Oooo000.OooO00o(context, R.color.material_timepicker_clockface).getDefaultColor();
        ColorStateList o00oO0o2 = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 0);
        setBackgroundColor(o00oO0o2 != null ? o00oO0o2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new OooO0O0(this));
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f3576OooOoO0 = new OooO0OO(this);
        String[] strArr = new String[12];
        Arrays.fill(strArr, "");
        this.f3582Oooo000 = strArr;
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = sparseArray.size();
        boolean z = false;
        for (int i = 0; i < Math.max(this.f3582Oooo000.length, size); i++) {
            TextView textView = (TextView) sparseArray.get(i);
            if (i >= this.f3582Oooo000.length) {
                removeView(textView);
                sparseArray.remove(i);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(R.layout.material_clockface_textview, (ViewGroup) this, false);
                    sparseArray.put(i, textView);
                    addView(textView);
                }
                textView.setText(this.f3582Oooo000[i]);
                textView.setTag(R.id.material_value_index, Integer.valueOf(i));
                int i2 = (i / 12) + 1;
                textView.setTag(R.id.material_clock_level, Integer.valueOf(i2));
                z = i2 > 1 ? true : z;
                o0o0Oo.OooOO0o(textView, this.f3576OooOoO0);
                textView.setTextColor(this.f3584Oooo00o);
            }
        }
        ClockHandView clockHandView2 = this.f3572OooOo00;
        if (clockHandView2.f3587OooO0O0 && !z) {
            clockHandView2.OooOOO0 = 1;
        }
        clockHandView2.f3587OooO0O0 = z;
        clockHandView2.invalidate();
        this.f3578OooOoo = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_height);
        this.f3580OooOooO = resources.getDimensionPixelSize(R.dimen.material_time_picker_minimum_screen_width);
        this.f3581OooOooo = resources.getDimensionPixelSize(R.dimen.material_clock_size);
    }

    @Override // com.google.android.material.timepicker.OooOO0
    public final void OooOO0o() {
        int i;
        o000oOoO o000oooo = new o000oOoO();
        o000oooo.OooO0O0(this);
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getId() != R.id.circle_center && !"skip".equals(childAt.getTag())) {
                int i3 = (Integer) childAt.getTag(R.id.material_clock_level);
                if (i3 == null) {
                    i3 = 1;
                }
                if (!hashMap.containsKey(i3)) {
                    hashMap.put(i3, new ArrayList());
                }
                ((List) hashMap.get(i3)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            if (((Integer) entry.getKey()).intValue() == 2) {
                i = Math.round(this.f3601OooOOo * 0.66f);
            } else {
                i = this.f3601OooOOo;
            }
            float f = 0.0f;
            for (View view : list) {
                int id = view.getId();
                HashMap hashMap2 = o000oooo.f1072OooO0OO;
                if (!hashMap2.containsKey(Integer.valueOf(id))) {
                    hashMap2.put(Integer.valueOf(id), new OooOOo0.OooOOOO());
                }
                OooOOo0.OooOo00 oooOo00 = ((OooOOo0.OooOOOO) hashMap2.get(Integer.valueOf(id))).f972OooO0Oo;
                oooOo00.f1009OooOoO = R.id.circle_center;
                oooOo00.f1011OooOoOO = i;
                oooOo00.f1013OooOoo0 = f;
                f += 360.0f / list.size();
            }
        }
        o000oooo.OooO00o(this);
        setConstraintSet(null);
        requestLayout();
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.f3570OooOo;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    public final void OooOOO0() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        boolean z;
        Rect rect2;
        RadialGradient radialGradient;
        RectF rectF2 = this.f3572OooOo00.f3592OooO0oO;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.f3570OooOo;
            int size = sparseArray.size();
            rectF = this.f3573OooOo0O;
            rect = this.f3571OooOo0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                if (textView3 == textView) {
                    z = true;
                } else {
                    z = false;
                }
                textView3.setSelected(z);
                textView3.getHitRect(rect);
                rectF.set(rect);
                textView3.getLineBounds(0, this.f3574OooOo0o);
                rectF.inset(rect2.left, rect2.top);
                if (!RectF.intersects(rectF2, rectF)) {
                    radialGradient = null;
                } else {
                    radialGradient = new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.f3575OooOoO, this.f3577OooOoOO, Shader.TileMode.CLAMP);
                }
                textView3.getPaint().setShader(radialGradient);
                textView3.invalidate();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.f3582Oooo000.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooOOO0();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (this.f3581OooOooo / Math.max(Math.max(this.f3578OooOoo / displayMetrics.heightPixels, this.f3580OooOooO / displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}