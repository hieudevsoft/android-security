package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class o00oO0o extends CheckedTextView {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f2402OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00Oo0 f2403OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00 f2404OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o000OOo f2405OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oO0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        o0O0o000.OooO00o(context);
        oo0OOoo.OooO00o(this, getContext());
        o00 o00Var = new o00(this);
        this.f2404OooO0OO = o00Var;
        o00Var.OooO0o(attributeSet, R.attr.checkedTextViewStyle);
        o00Var.OooO0O0();
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2403OooO0O0 = o00oo0;
        o00oo0.OooO0o0(attributeSet, R.attr.checkedTextViewStyle);
        o0ooOOo o0ooooo = new o0ooOOo(this, 0);
        this.f2402OooO00o = o0ooooo;
        o0ooooo.OooO0OO(attributeSet, R.attr.checkedTextViewStyle);
        getEmojiTextViewHelper().OooO0O0(attributeSet, R.attr.checkedTextViewStyle);
    }

    private o000OOo getEmojiTextViewHelper() {
        if (this.f2405OooO0Oo == null) {
            this.f2405OooO0Oo = new o000OOo(this);
        }
        return this.f2405OooO0Oo;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00 o00Var = this.f2404OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            o0ooooo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o0000O00.OooO00o.o00O000(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            return o0ooooo.f2545OooO0O0;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            return o0ooooo.f2546OooO0OO;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2404OooO0OO.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2404OooO0OO.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o0000O00.OooO00o.o000(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0OO(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2404OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2404OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o0000O00.OooO00o.o00O00O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0Oo(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2403OooO0O0;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            o0ooooo.f2545OooO0O0 = colorStateList;
            o0ooooo.f2547OooO0Oo = true;
            o0ooooo.OooO0O0();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            o0ooooo.f2546OooO0OO = mode;
            o0ooooo.f2549OooO0o0 = true;
            o0ooooo.OooO0O0();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2404OooO0OO;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2404OooO0OO;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00 o00Var = this.f2404OooO0OO;
        if (o00Var != null) {
            o00Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        o0ooOOo o0ooooo = this.f2402OooO00o;
        if (o0ooooo != null) {
            if (o0ooooo.f2548OooO0o) {
                o0ooooo.f2548OooO0o = false;
                return;
            }
            o0ooooo.f2548OooO0o = true;
            o0ooooo.OooO0O0();
        }
    }
}