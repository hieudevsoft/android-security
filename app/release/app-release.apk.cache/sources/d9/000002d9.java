package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class o00oOoo extends TextView {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f2406OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00 f2407OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0O0O00 f2408OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o000OOo f2409OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooO0Oo.o0000OO0 f2410OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f2411OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public Future f2412OooO0oO;

    public o00oOoo(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private o000OOo getEmojiTextViewHelper() {
        if (this.f2409OooO0Oo == null) {
            this.f2409OooO0Oo = new o000OOo(this);
        }
        return this.f2409OooO0Oo;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO00o();
        }
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (o0OO0oO0.f2517OooO0O0) {
            return super.getAutoSizeMaxTextSize();
        }
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var == null) {
            return 0;
        }
        return o00Var.f2244OooO.f2557OooO00o;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return o0000O00.OooO00o.o00O000(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public o00O0000 getSuperCaller() {
        OooO0Oo.o0000OO0 o0000oo02;
        if (this.f2410OooO0o == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                o0000oo02 = new o0O0ooO(this);
            } else if (i >= 26) {
                o0000oo02 = new OooO0Oo.o0000OO0(6, this);
            }
            this.f2410OooO0o = o0000oo02;
        }
        return this.f2410OooO0o;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0OO();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            return o00oo0.OooO0Oo();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f2407OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f2407OooO0O0.OooO0o0();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.f2412OooO0oO;
        if (future != null) {
            try {
                this.f2412OooO0oO = null;
                OooO0O0.OooO00o.OooO0oO(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                o0000O00.OooO00o.o00000Oo(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        o0O0O00 o0o0o00;
        if (Build.VERSION.SDK_INT < 28 && (o0o0o00 = this.f2408OooO0OO) != null) {
            TextClassifier textClassifier = (TextClassifier) o0o0o00.f2441OooO0OO;
            if (textClassifier == null) {
                return o000O0.OooO00o((TextView) o0o0o00.f2440OooO0O0);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    public OooOoo.oo000o getTextMetricsParamsCompat() {
        return o0000O00.OooO00o.o00000Oo(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f2407OooO0O0.getClass();
        o00.OooO0oo(this, onCreateInputConnection, editorInfo);
        o0000O00.OooO00o.o000(this, editorInfo, onCreateInputConnection);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null && !o0OO0oO0.f2517OooO0O0) {
            o00Var.f2244OooO.OooO00o();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.f2412OooO0oO;
        if (future != null) {
            try {
                this.f2412OooO0oO = null;
                OooO0O0.OooO00o.OooO0oO(future.get());
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                o0000O00.OooO00o.o00000Oo(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        super.onTextChanged(charSequence, i, i2, i3);
        boolean z2 = false;
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
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
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooOO0O(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO0oO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? o0000O00.OooO00o.o0ooOoO(context, i) : null, i2 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i2) : null, i3 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i3) : null, i4 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i4) : null);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? o0000O00.OooO00o.o0ooOoO(context, i) : null, i2 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i2) : null, i3 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i3) : null, i4 != 0 ? o0000O00.OooO00o.o0ooOoO(context, i4) : null);
        o00 o00Var = this.f2407OooO0O0;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().OooO00o(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooO0O0(i);
        } else {
            o0000O00.OooO00o.o000o00o(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().OooOOOo(i);
        } else {
            o0000O00.OooO00o.o000o0O0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        o0000O00.OooO00o.OooOo0O(i);
        int fontMetricsInt = getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public void setPrecomputedText(OooOoo.o00oO0o o00oo0o) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        o0000O00.OooO00o.o00000Oo(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooO(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o00Oo0 o00oo0 = this.f2406OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00 o00Var = this.f2407OooO0O0;
        o00Var.OooOO0o(colorStateList);
        o00Var.OooO0O0();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00 o00Var = this.f2407OooO0O0;
        o00Var.OooOOO0(mode);
        o00Var.OooO0O0();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        o0O0O00 o0o0o00;
        if (Build.VERSION.SDK_INT >= 28 || (o0o0o00 = this.f2408OooO0OO) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            o0o0o00.f2441OooO0OO = textClassifier;
        }
    }

    public void setTextFuture(Future<OooOoo.o00oO0o> future) {
        this.f2412OooO0oO = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(OooOoo.oo000o oo000oVar) {
        int i;
        TextDirectionHeuristic textDirectionHeuristic = oo000oVar.f1231OooO0O0;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
            Oooo0.o0OoOo0.OooO0oo(this, i);
            getPaint().set(oo000oVar.f1230OooO00o);
            Oooo0.o00O0O.OooO0o0(this, oo000oVar.f1232OooO0OO);
            Oooo0.o00O0O.OooO0oo(this, oo000oVar.f1233OooO0Oo);
        }
        i = 1;
        Oooo0.o0OoOo0.OooO0oo(this, i);
        getPaint().set(oo000oVar.f1230OooO00o);
        Oooo0.o00O0O.OooO0o0(this, oo000oVar.f1232OooO0OO);
        Oooo0.o00O0O.OooO0oo(this, oo000oVar.f1233OooO0Oo);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z;
        boolean z2 = o0OO0oO0.f2517OooO0O0;
        if (z2) {
            super.setTextSize(i, f);
            return;
        }
        o00 o00Var = this.f2407OooO0O0;
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

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f2411OooO0o0) {
            return;
        }
        if (typeface != null && i > 0) {
            Context context = getContext();
            OooO0Oo.o0000OO0 o0000oo02 = OooOo.OooOO0O.f1116OooO00o;
            if (context != null) {
                typeface2 = Typeface.create(typeface, i);
            } else {
                throw new IllegalArgumentException("Context cannot be null");
            }
        } else {
            typeface2 = null;
        }
        this.f2411OooO0o0 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f2411OooO0o0 = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00oOoo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o0O0o000.OooO00o(context);
        this.f2411OooO0o0 = false;
        this.f2410OooO0o = null;
        oo0OOoo.OooO00o(this, getContext());
        o00Oo0 o00oo0 = new o00Oo0(this);
        this.f2406OooO00o = o00oo0;
        o00oo0.OooO0o0(attributeSet, i);
        o00 o00Var = new o00(this);
        this.f2407OooO0O0 = o00Var;
        o00Var.OooO0o(attributeSet, i);
        o00Var.OooO0O0();
        this.f2408OooO0OO = new o0O0O00(this);
        getEmojiTextViewHelper().OooO0O0(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        o00 o00Var = this.f2407OooO0O0;
        if (o00Var != null) {
            o00Var.OooO0O0();
        }
    }
}