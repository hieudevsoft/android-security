package com.google.android.material.button;

import OooO0Oo.o0000OO0;
import OooOoO0.o0OOO0o;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import Oooo0.o0OoOo0;
import OooooO0.o0000O;
import OoooooO.oO00Oo0;
import OoooooO.oO00o000;
import OoooooO.oOOoOOO0;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.o00Ooo;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.Oooo0;
import o0ooOO0.Oooo000;
import o0ooOO0.o0OO00O;

/* loaded from: classes.dex */
public class MaterialButton extends o00Ooo implements Checkable, o0OO00O {

    /* renamed from: OooOOo  reason: collision with root package name */
    public static final int[] f3308OooOOo = {16842911};

    /* renamed from: OooOOoo  reason: collision with root package name */
    public static final int[] f3309OooOOoo = {16842912};

    /* renamed from: OooO  reason: collision with root package name */
    public Drawable f3310OooO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final oO00o000 f3311OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public oO00Oo0 f3312OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final LinkedHashSet f3313OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public PorterDuff.Mode f3314OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public ColorStateList f3315OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public String f3316OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f3317OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f3318OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f3319OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f3320OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f3321OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f3322OooOOo0;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, R.attr.materialButtonStyle, 2131756020), attributeSet, R.attr.materialButtonStyle);
        this.f3313OooO0o0 = new LinkedHashSet();
        this.f3320OooOOOO = false;
        this.f3321OooOOOo = false;
        Context context2 = getContext();
        TypedArray OooOOOO2 = OooO0o.OooOOOO(context2, attributeSet, o0000O.f1795OooOO0, R.attr.materialButtonStyle, 2131756020, new int[0]);
        this.f3319OooOOO = OooOOOO2.getDimensionPixelSize(12, 0);
        this.f3314OooO0oO = OooO00o.o000OO0O(OooOOOO2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.f3315OooO0oo = OooO00o.o00oO0o(getContext(), OooOOOO2, 14);
        this.f3310OooO = OooO00o.o0OOO0o(getContext(), OooOOOO2, 10);
        this.f3322OooOOo0 = OooOOOO2.getInteger(11, 1);
        this.f3317OooOO0O = OooOOOO2.getDimensionPixelSize(13, 0);
        oO00o000 oo00o000 = new oO00o000(this, new Oooo0(Oooo0.OooO0O0(context2, attributeSet, R.attr.materialButtonStyle, 2131756020)));
        this.f3311OooO0Oo = oo00o000;
        oo00o000.f1877OooO0OO = OooOOOO2.getDimensionPixelOffset(1, 0);
        oo00o000.f1878OooO0Oo = OooOOOO2.getDimensionPixelOffset(2, 0);
        oo00o000.f1880OooO0o0 = OooOOOO2.getDimensionPixelOffset(3, 0);
        oo00o000.f1879OooO0o = OooOOOO2.getDimensionPixelOffset(4, 0);
        if (OooOOOO2.hasValue(8)) {
            int dimensionPixelSize = OooOOOO2.getDimensionPixelSize(8, -1);
            oo00o000.f1881OooO0oO = dimensionPixelSize;
            Oooo0 oooo0 = oo00o000.f1876OooO0O0;
            float f = dimensionPixelSize;
            oooo0.getClass();
            Oooo000 oooo000 = new Oooo000(oooo0);
            oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(f);
            oooo000.f5532OooO0o = new o0ooOO0.OooO0o(f);
            oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(f);
            oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(f);
            oo00o000.OooO0OO(new Oooo0(oooo000));
            oo00o000.f1888OooOOOo = true;
        }
        oo00o000.f1882OooO0oo = OooOOOO2.getDimensionPixelSize(20, 0);
        oo00o000.f1874OooO = OooO00o.o000OO0O(OooOOOO2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        oo00o000.f1883OooOO0 = OooO00o.o00oO0o(getContext(), OooOOOO2, 6);
        oo00o000.f1884OooOO0O = OooO00o.o00oO0o(getContext(), OooOOOO2, 19);
        oo00o000.f1885OooOO0o = OooO00o.o00oO0o(getContext(), OooOOOO2, 16);
        oo00o000.f1890OooOOo0 = OooOOOO2.getBoolean(5, false);
        oo00o000.f1892OooOo00 = OooOOOO2.getDimensionPixelSize(9, 0);
        oo00o000.f1889OooOOo = OooOOOO2.getBoolean(21, true);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        int OooO0o2 = o00O0O0O.OooO0o(this);
        int paddingTop = getPaddingTop();
        int OooO0o02 = o00O0O0O.OooO0o0(this);
        int paddingBottom = getPaddingBottom();
        if (OooOOOO2.hasValue(0)) {
            oo00o000.f1887OooOOOO = true;
            setSupportBackgroundTintList(oo00o000.f1883OooOO0);
            setSupportBackgroundTintMode(oo00o000.f1874OooO);
        } else {
            oo00o000.OooO0o0();
        }
        o00O0O0O.OooOO0O(this, OooO0o2 + oo00o000.f1877OooO0OO, paddingTop + oo00o000.f1880OooO0o0, OooO0o02 + oo00o000.f1878OooO0Oo, paddingBottom + oo00o000.f1879OooO0o);
        OooOOOO2.recycle();
        setCompoundDrawablePadding(this.f3319OooOOO);
        OooO0OO(this.f3310OooO != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public final boolean OooO00o() {
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        if (oo00o000 != null && !oo00o000.f1887OooOOOO) {
            return true;
        }
        return false;
    }

    public final void OooO0O0() {
        boolean z;
        boolean z2;
        int i = this.f3322OooOOo0;
        boolean z3 = false;
        if (i != 1 && i != 2) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            o0OoOo0.OooO0o0(this, this.f3310OooO, null, null, null);
            return;
        }
        if (i != 3 && i != 4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            o0OoOo0.OooO0o0(this, null, null, this.f3310OooO, null);
            return;
        }
        if (i == 16 || i == 32) {
            z3 = true;
        }
        if (z3) {
            o0OoOo0.OooO0o0(this, null, this.f3310OooO, null, null);
        }
    }

    public final void OooO0OO(boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        Drawable drawable = this.f3310OooO;
        boolean z5 = true;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3310OooO = mutate;
            o0OOO0o.OooO0oo(mutate, this.f3315OooO0oo);
            PorterDuff.Mode mode = this.f3314OooO0oO;
            if (mode != null) {
                o0OOO0o.OooO(this.f3310OooO, mode);
            }
            int i = this.f3317OooOO0O;
            if (i == 0) {
                i = this.f3310OooO.getIntrinsicWidth();
            }
            int i2 = this.f3317OooOO0O;
            if (i2 == 0) {
                i2 = this.f3310OooO.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3310OooO;
            int i3 = this.f3318OooOO0o;
            int i4 = this.OooOOO0;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f3310OooO.setVisible(true, z);
        }
        if (z) {
            OooO0O0();
            return;
        }
        Drawable[] OooO00o2 = o0OoOo0.OooO00o(this);
        Drawable drawable3 = OooO00o2[0];
        Drawable drawable4 = OooO00o2[1];
        Drawable drawable5 = OooO00o2[2];
        int i5 = this.f3322OooOOo0;
        if (i5 != 1 && i5 != 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2 || drawable3 == this.f3310OooO) {
            if (i5 != 3 && i5 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3 || drawable5 == this.f3310OooO) {
                if (i5 != 16 && i5 != 32) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                if (!z4 || drawable4 == this.f3310OooO) {
                    z5 = false;
                }
            }
        }
        if (z5) {
            OooO0O0();
        }
    }

    public final void OooO0Oo(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f3310OooO != null && getLayout() != null) {
            int i3 = this.f3322OooOOo0;
            boolean z4 = true;
            if (i3 != 1 && i3 != 2) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                if (i3 != 3 && i3 != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (!z3) {
                    if (i3 != 16 && i3 != 32) {
                        z4 = false;
                    }
                    if (z4) {
                        this.f3318OooOO0o = 0;
                        if (i3 == 16) {
                            this.OooOOO0 = 0;
                            OooO0OO(false);
                        }
                        int i4 = this.f3317OooOO0O;
                        if (i4 == 0) {
                            i4 = this.f3310OooO.getIntrinsicHeight();
                        }
                        int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f3319OooOOO) - getPaddingBottom()) / 2);
                        if (this.OooOOO0 != max) {
                            this.OooOOO0 = max;
                            OooO0OO(false);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            this.OooOOO0 = 0;
            Layout.Alignment actualTextAlignment = getActualTextAlignment();
            int i5 = this.f3322OooOOo0;
            if (i5 != 1 && i5 != 3 && ((i5 != 2 || actualTextAlignment != Layout.Alignment.ALIGN_NORMAL) && (i5 != 4 || actualTextAlignment != Layout.Alignment.ALIGN_OPPOSITE))) {
                int i6 = this.f3317OooOO0O;
                if (i6 == 0) {
                    i6 = this.f3310OooO.getIntrinsicWidth();
                }
                int textLayoutWidth = i - getTextLayoutWidth();
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                int OooO0o02 = (((textLayoutWidth - o00O0O0O.OooO0o0(this)) - i6) - this.f3319OooOOO) - o00O0O0O.OooO0o(this);
                if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
                    OooO0o02 /= 2;
                }
                if (o00O0O0O.OooO0Oo(this) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (this.f3322OooOOo0 != 4) {
                    z4 = false;
                }
                if (z2 != z4) {
                    OooO0o02 = -OooO0o02;
                }
                if (this.f3318OooOO0o != OooO0o02) {
                    this.f3318OooOO0o = OooO0o02;
                    OooO0OO(false);
                    return;
                }
                return;
            }
            this.f3318OooOO0o = 0;
            OooO0OO(false);
        }
    }

    public String getA11yClassName() {
        boolean z;
        Class cls;
        if (!TextUtils.isEmpty(this.f3316OooOO0)) {
            return this.f3316OooOO0;
        }
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        if (oo00o000 != null && oo00o000.f1890OooOOo0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cls = CompoundButton.class;
        } else {
            cls = Button.class;
        }
        return cls.getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1881OooO0oO;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3310OooO;
    }

    public int getIconGravity() {
        return this.f3322OooOOo0;
    }

    public int getIconPadding() {
        return this.f3319OooOOO;
    }

    public int getIconSize() {
        return this.f3317OooOO0O;
    }

    public ColorStateList getIconTint() {
        return this.f3315OooO0oo;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3314OooO0oO;
    }

    public int getInsetBottom() {
        return this.f3311OooO0Oo.f1879OooO0o;
    }

    public int getInsetTop() {
        return this.f3311OooO0Oo.f1880OooO0o0;
    }

    public ColorStateList getRippleColor() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1885OooOO0o;
        }
        return null;
    }

    public Oooo0 getShapeAppearanceModel() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1876OooO0O0;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1884OooOO0O;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1882OooO0oo;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.o00Ooo
    public ColorStateList getSupportBackgroundTintList() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1883OooOO0;
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.o00Ooo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (OooO00o()) {
            return this.f3311OooO0Oo.f1874OooO;
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3320OooOOOO;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (OooO00o()) {
            OooO00o.o000o0O(this, this.f3311OooO0Oo.OooO0O0(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        boolean z;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        if (oo00o000 != null && oo00o000.f1890OooOOo0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            View.mergeDrawableStates(onCreateDrawableState, f3308OooOOo);
        }
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3309OooOOoo);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        if (oo00o000 != null && oo00o000.f1890OooOOo0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof oOOoOOO0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oOOoOOO0 ooooooo0 = (oOOoOOO0) parcelable;
        super.onRestoreInstanceState(ooooooo0.f1456OooO00o);
        setChecked(ooooooo0.f1893OooO0OO);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        oOOoOOO0 ooooooo0 = new oOOoOOO0(super.onSaveInstanceState());
        ooooooo0.f1893OooO0OO = this.f3320OooOOOO;
        return ooooooo0;
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3311OooO0Oo.f1889OooOOo) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3310OooO != null) {
            if (this.f3310OooO.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3316OooOO0 = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.OooO0O0(false) != null) {
                oo00o000.OooO0O0(false).setTint(i);
                return;
            }
            return;
        }
        super.setBackgroundColor(i);
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (OooO00o()) {
            if (drawable != getBackground()) {
                oO00o000 oo00o000 = this.f3311OooO0Oo;
                oo00o000.f1887OooOOOO = true;
                ColorStateList colorStateList = oo00o000.f1883OooOO0;
                MaterialButton materialButton = oo00o000.f1875OooO00o;
                materialButton.setSupportBackgroundTintList(colorStateList);
                materialButton.setSupportBackgroundTintMode(oo00o000.f1874OooO);
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.o00Ooo, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? OooO00o.o0ooOoO(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (OooO00o()) {
            this.f3311OooO0Oo.f1890OooOOo0 = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        boolean z2;
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        if (oo00o000 != null && oo00o000.f1890OooOOo0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && isEnabled() && this.f3320OooOOOO != z) {
            this.f3320OooOOOO = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f3320OooOOOO;
                if (!materialButtonToggleGroup.f3329OooO0o) {
                    materialButtonToggleGroup.OooO0O0(getId(), z3);
                }
            }
            if (this.f3321OooOOOo) {
                return;
            }
            this.f3321OooOOOo = true;
            Iterator it = this.f3313OooO0o0.iterator();
            if (!it.hasNext()) {
                this.f3321OooOOOo = false;
            } else {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
        }
    }

    public void setCornerRadius(int i) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (!oo00o000.f1888OooOOOo || oo00o000.f1881OooO0oO != i) {
                oo00o000.f1881OooO0oO = i;
                oo00o000.f1888OooOOOo = true;
                Oooo0 oooo0 = oo00o000.f1876OooO0O0;
                float f = i;
                oooo0.getClass();
                Oooo000 oooo000 = new Oooo000(oooo0);
                oooo000.f5533OooO0o0 = new o0ooOO0.OooO0o(f);
                oooo000.f5532OooO0o = new o0ooOO0.OooO0o(f);
                oooo000.f5534OooO0oO = new o0ooOO0.OooO0o(f);
                oooo000.f5535OooO0oo = new o0ooOO0.OooO0o(f);
                oo00o000.OooO0OO(new Oooo0(oooo000));
            }
        }
    }

    public void setCornerRadiusResource(int i) {
        if (OooO00o()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (OooO00o()) {
            this.f3311OooO0Oo.OooO0O0(false).OooO(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3310OooO != drawable) {
            this.f3310OooO = drawable;
            OooO0OO(true);
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f3322OooOOo0 != i) {
            this.f3322OooOOo0 = i;
            OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f3319OooOOO != i) {
            this.f3319OooOOO = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? OooO00o.o0ooOoO(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3317OooOO0O != i) {
            this.f3317OooOO0O = i;
            OooO0OO(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3315OooO0oo != colorStateList) {
            this.f3315OooO0oo = colorStateList;
            OooO0OO(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3314OooO0oO != mode) {
            this.f3314OooO0oO = mode;
            OooO0OO(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(OooOo0.Oooo000.OooO00o(getContext(), i));
    }

    public void setInsetBottom(int i) {
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        oo00o000.OooO0Oo(oo00o000.f1880OooO0o0, i);
    }

    public void setInsetTop(int i) {
        oO00o000 oo00o000 = this.f3311OooO0Oo;
        oo00o000.OooO0Oo(i, oo00o000.f1879OooO0o);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(oO00Oo0 oo00oo0) {
        this.f3312OooO0o = oo00oo0;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        oO00Oo0 oo00oo0 = this.f3312OooO0o;
        if (oo00oo0 != null) {
            ((MaterialButtonToggleGroup) ((o0000OO0) oo00oo0).f183OooO0O0).invalidate();
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.f1885OooOO0o != colorStateList) {
                oo00o000.f1885OooOO0o = colorStateList;
                MaterialButton materialButton = oo00o000.f1875OooO00o;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(OooO0o.OooOOo(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (OooO00o()) {
            setRippleColor(OooOo0.Oooo000.OooO00o(getContext(), i));
        }
    }

    @Override // o0ooOO0.o0OO00O
    public void setShapeAppearanceModel(Oooo0 oooo0) {
        if (!OooO00o()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3311OooO0Oo.OooO0OO(oooo0);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            oo00o000.f1886OooOOO = z;
            oo00o000.OooO0o();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.f1884OooOO0O != colorStateList) {
                oo00o000.f1884OooOO0O = colorStateList;
                oo00o000.OooO0o();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (OooO00o()) {
            setStrokeColor(OooOo0.Oooo000.OooO00o(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.f1882OooO0oo != i) {
                oo00o000.f1882OooO0oo = i;
                oo00o000.OooO0o();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (OooO00o()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.o00Ooo
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.f1883OooOO0 != colorStateList) {
                oo00o000.f1883OooOO0 = colorStateList;
                if (oo00o000.OooO0O0(false) != null) {
                    o0OOO0o.OooO0oo(oo00o000.OooO0O0(false), oo00o000.f1883OooOO0);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintList(colorStateList);
    }

    @Override // androidx.appcompat.widget.o00Ooo
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (OooO00o()) {
            oO00o000 oo00o000 = this.f3311OooO0Oo;
            if (oo00o000.f1874OooO != mode) {
                oo00o000.f1874OooO = mode;
                if (oo00o000.OooO0O0(false) != null && oo00o000.f1874OooO != null) {
                    o0OOO0o.OooO(oo00o000.OooO0O0(false), oo00o000.f1874OooO);
                    return;
                }
                return;
            }
            return;
        }
        super.setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        OooO0Oo(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.f3311OooO0Oo.f1889OooOOo = z;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3320OooOOOO);
    }
}