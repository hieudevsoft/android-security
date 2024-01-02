package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class o00Ooo extends Button {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2399OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00 f2400OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o000OOo f2401OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0O0o000.OooO00o(context);
        oo0OOoo.OooO00o(this, getContext());
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2399OooO00o = o00oo0;
        o00oo0.OooO0o0(attributeSet, i);
        o00 o00Var = new o00(this);
        this.f2400OooO0O0 = o00Var;
        o00Var.OooO0o(attributeSet, i);
        o00Var.OooO0O0();
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    private o000OOo getEmojiTextViewHelper() {
        if (this.f2401OooO0OO == null) {
            this.f2401OooO0OO = new o000OOo(this);
        }
        return this.f2401OooO0OO;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o0OO0oO0.f2517OooO0O0) {
            return super.getAutoSizeMaxTextSize();
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            return Math.round(o00Var.f2244OooO.f2562OooO0o0);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (o0OO0oO0.f2517OooO0O0) {
            return super.getAutoSizeMinTextSize();
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            return Math.round(o00Var.f2244OooO.f2560OooO0Oo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (o0OO0oO0.f2517OooO0O0) {
            return super.getAutoSizeStepGranularity();
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            return Math.round(o00Var.f2244OooO.f2559OooO0OO);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (o0OO0oO0.f2517OooO0O0) {
            return super.getAutoSizeTextAvailableSizes();
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            return o00Var.f2244OooO.f2561OooO0o;
        }
        return new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (o0OO0oO0.f2517OooO0O0) {
            if (super.getAutoSizeTextType() != 1) {
                return 0;
            }
            return 1;
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var == null) {
            return 0;
        }
        return o00Var.f2244OooO.f2557OooO00o;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o0000O00.OooO00o.o00O000(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2400OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2400OooO0O0.OooO0o0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null && !o0OO0oO0.f2517OooO0O0) {
            o00Var.f2244OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null && !o0OO0oO0.f2517OooO0O0) {
            oo00o oo00oVar = o00Var.f2244OooO;
            if (oo00oVar.OooO0oo() && oo00oVar.f2557OooO00o != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (z2) {
            o00Var.f2244OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (o0OO0oO0.f2517OooO0O0) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.OooO(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (o0OO0oO0.f2517OooO0O0) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.OooOO0(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (o0OO0oO0.f2517OooO0O0) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.OooOO0O(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o0000O00.OooO00o.o00O00O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z) {
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.f2245OooO00o.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2399OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2400OooO0O0;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2400OooO0O0;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = o0OO0oO0.f2517OooO0O0;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        o00 o00Var = this.f2400OooO0O0;
        if (o00Var != null && !z2) {
            oo00o oo00oVar = o00Var.f2244OooO;
            if (oo00oVar.OooO0oo() && oo00oVar.f2557OooO00o != 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                oo00oVar.OooO0o0(i, f);
            }
        }
    }
}