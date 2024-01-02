package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* loaded from: classes.dex */
public class oo000o extends CheckBox implements Oooo0.o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f2551OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00Oo0 f2552OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00 f2553OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o000OOo f2554OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo000o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0O0o000.OooO00o(context);
        oo0OOoo.OooO00o(this, getContext());
        o0ooOOo o0ooooo = new o0ooOOo(this, 1);
        this.f2551OooO00o = o0ooooo;
        o0ooooo.OooO0OO(attributeSet, i);
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2552OooO0O0 = o00oo0;
        o00oo0.OooO0o0(attributeSet, i);
        o00 o00Var = new o00(this);
        this.f2553OooO0OO = o00Var;
        o00Var.OooO0o(attributeSet, i);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    private o000OOo getEmojiTextViewHelper() {
        if (this.f2554OooO0Oo == null) {
            this.f2554OooO0Oo = new o000OOo(this);
        }
        return this.f2554OooO0Oo;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o00 o00Var = this.f2553OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            o0ooooo.getClass();
        }
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    @Override // Oooo0.o0ooOOo
    public ColorStateList getSupportButtonTintList() {
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            return o0ooooo.f2545OooO0O0;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            return o0ooooo.f2546OooO0OO;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2553OooO0OO.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2553OooO0OO.OooO0o0();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2553OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2553OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2552OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    @Override // Oooo0.o0ooOOo
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            o0ooooo.f2545OooO0O0 = colorStateList;
            o0ooooo.f2547OooO0Oo = true;
            o0ooooo.OooO00o();
        }
    }

    @Override // Oooo0.o0ooOOo
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            o0ooooo.f2546OooO0OO = mode;
            o0ooooo.f2549OooO0o0 = true;
            o0ooooo.OooO00o();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2553OooO0OO;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2553OooO0OO;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        o0ooOOo o0ooooo = this.f2551OooO00o;
        if (o0ooooo != null) {
            if (o0ooooo.f2548OooO0o) {
                o0ooooo.f2548OooO0o = false;
                return;
            }
            o0ooooo.f2548OooO0o = true;
            o0ooooo.OooO00o();
        }
    }
}