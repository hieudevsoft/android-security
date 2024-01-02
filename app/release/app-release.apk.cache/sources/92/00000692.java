package o00o0O;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;

/* loaded from: classes.dex */
public abstract class OooO extends LinearLayoutCompat {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public Drawable f5198OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public final Rect f5199OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final Rect f5200OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public int f5201OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f5202OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final boolean f5203OooOo00;

    public OooO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f5200OooOOo0 = new Rect();
        this.f5199OooOOo = new Rect();
        this.f5201OooOOoo = 119;
        this.f5203OooOo00 = true;
        this.f5202OooOo0 = false;
        TypedArray OooOOOO2 = com.google.gson.internal.OooO0o.OooOOOO(context, attributeSet, o0000O.f1794OooO0oo, 0, 0, new int[0]);
        this.f5201OooOOoo = OooOOOO2.getInt(1, this.f5201OooOOoo);
        Drawable drawable = OooOOOO2.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f5203OooOo00 = OooOOOO2.getBoolean(2, true);
        OooOOOO2.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f5198OooOOOo;
        if (drawable != null) {
            if (this.f5202OooOo0) {
                this.f5202OooOo0 = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z = this.f5203OooOo00;
                Rect rect = this.f5200OooOOo0;
                if (z) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f5201OooOOoo;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f5199OooOOo;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f5198OooOOOo;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f5198OooOOOo;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f5198OooOOOo.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f5198OooOOOo;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f5201OooOOoo;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5198OooOOOo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f5202OooOo0 = z | this.f5202OooOo0;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5202OooOo0 = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f5198OooOOOo;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f5198OooOOOo);
            }
            this.f5198OooOOOo = drawable;
            this.f5202OooOo0 = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f5201OooOOoo == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f5201OooOOoo != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f5201OooOOoo = i;
            if (i == 119 && this.f5198OooOOOo != null) {
                this.f5198OooOOOo.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f5198OooOOOo;
    }
}