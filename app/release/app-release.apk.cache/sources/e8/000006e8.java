package o0ooOoO;

import OooOoO0.o0OOO0o;
import OooOooo.o00O0O0;
import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o0ooOO0.OooOOOO;
import o0ooOO0.Oooo0;

/* loaded from: classes.dex */
public abstract class OooOO0O extends FrameLayout {

    /* renamed from: OooO  reason: collision with root package name */
    public static final OooOO0 f5584OooO = new OooOO0();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Oooo0 f5585OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5586OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f5587OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final float f5588OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f5589OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5590OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ColorStateList f5591OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public PorterDuff.Mode f5592OooO0oo;

    /* JADX WARN: Multi-variable type inference failed */
    public OooOO0O(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, o0000O.f1804OooOo);
        if (obtainStyledAttributes.hasValue(6)) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0oOO0.OooOOoo(this, obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.f5586OooO0O0 = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f5585OooO00o = new Oooo0(Oooo0.OooO0O0(context2, attributeSet, 0, 0));
        }
        this.f5587OooO0OO = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(OooO00o.o00oO0o(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(OooO00o.o000OO0O(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f5588OooO0Oo = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f5590OooO0o0 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f5589OooO0o = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f5584OooO);
        setFocusable(true);
        if (getBackground() == null) {
            int o0000OOO2 = OooO00o.o0000OOO(OooO00o.oo000o(this, R.attr.colorSurface), OooO00o.oo000o(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
            Oooo0 oooo0 = this.f5585OooO00o;
            if (oooo0 != null) {
                int i = OooOOO0.f5594OooO00o;
                OooOOOO oooOOOO = new OooOOOO(oooo0);
                oooOOOO.OooOO0(ColorStateList.valueOf(o0000OOO2));
                gradientDrawable = oooOOOO;
            } else {
                Resources resources = getResources();
                int i2 = OooOOO0.f5594OooO00o;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(o0000OOO2);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f5591OooO0oO;
            if (colorStateList != null) {
                o0OOO0o.OooO0oo(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOo0(this, gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(OooOOO0 oooOOO0) {
    }

    public float getActionTextColorAlpha() {
        return this.f5588OooO0Oo;
    }

    public int getAnimationMode() {
        return this.f5586OooO0O0;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f5587OooO0OO;
    }

    public int getMaxInlineActionWidth() {
        return this.f5589OooO0o;
    }

    public int getMaxWidth() {
        return this.f5590OooO0o0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0OO.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f5590OooO0o0;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f5586OooO0O0 = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f5591OooO0oO != null) {
            drawable = drawable.mutate();
            o0OOO0o.OooO0oo(drawable, this.f5591OooO0oO);
            o0OOO0o.OooO(drawable, this.f5592OooO0oo);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f5591OooO0oO = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            o0OOO0o.OooO0oo(mutate, colorStateList);
            o0OOO0o.OooO(mutate, this.f5592OooO0oo);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f5592OooO0oo = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            o0OOO0o.OooO(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f5584OooO);
        super.setOnClickListener(onClickListener);
    }
}