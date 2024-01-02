package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public class o00O0O extends AutoCompleteTextView {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f2326OooO0Oo = {16843126};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2327OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00 f2328OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0O0O00 f2329OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0O(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        o0O0o000.OooO00o(context);
        oo0OOoo.OooO00o(this, getContext());
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(getContext(), attributeSet, f2326OooO0Oo, R.attr.autoCompleteTextViewStyle);
        if (OooOOO0.OooOO0o(0)) {
            setDropDownBackgroundDrawable(OooOOO0.OooO0o0(0));
        }
        OooOOO0.OooOOOO();
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2327OooO00o = o00oo0;
        o00oo0.OooO0o0(attributeSet, R.attr.autoCompleteTextViewStyle);
        o00 o00Var = new o00(this);
        this.f2328OooO0O0 = o00Var;
        o00Var.OooO0o(attributeSet, R.attr.autoCompleteTextViewStyle);
        o00Var.OooO0O0();
        o0O0O00 o0o0o00 = new o0O0O00((EditText) this);
        this.f2329OooO0OO = o0o0o00;
        o0o0o00.OooO0Oo(attributeSet, R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener OooO00o2 = o0o0o00.OooO00o(keyListener);
            if (OooO00o2 != keyListener) {
                super.setKeyListener(OooO00o2);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o00 o00Var = this.f2328OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o0000O00.OooO00o.o00O000(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2328OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2328OooO0O0.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        o0000O00.OooO00o.o000(this, editorInfo, onCreateInputConnection);
        return this.f2329OooO0OO.OooO0o(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2328OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2328OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(o0000O00.OooO00o.o00O00O(callback, this));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((o0ooOO0.OooOOO0) ((Oooo0oO.o0oOO) this.f2329OooO0OO.f2441OooO0OO).f1509OooO0OO).OooOo0o(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f2329OooO0OO.OooO00o(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2327OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2328OooO0O0;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2328OooO0O0;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00 o00Var = this.f2328OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0oO(context, i);
        }
    }
}