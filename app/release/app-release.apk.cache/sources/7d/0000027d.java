package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: OooO  reason: collision with root package name */
    public final int f2015OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2016OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public View f2017OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public View f2018OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Drawable f2019OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Drawable f2020OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Drawable f2021OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f2022OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2023OooO0oo;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0O0 oooO0O0 = new OooO0O0(this);
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        OooOooo.o00O0O0.OooOOo0(this, oooO0O0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO0OO.OooO00o.f18OooO00o);
        boolean z = false;
        this.f2019OooO0Oo = obtainStyledAttributes.getDrawable(0);
        this.f2021OooO0o0 = obtainStyledAttributes.getDrawable(2);
        this.f2015OooO = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f2022OooO0oO = true;
            this.f2020OooO0o = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f2022OooO0oO ? !(this.f2019OooO0Oo != null || this.f2021OooO0o0 != null) : this.f2020OooO0o == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f2019OooO0Oo;
        if (drawable != null && drawable.isStateful()) {
            this.f2019OooO0Oo.setState(getDrawableState());
        }
        Drawable drawable2 = this.f2021OooO0o0;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f2021OooO0o0.setState(getDrawableState());
        }
        Drawable drawable3 = this.f2020OooO0o;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f2020OooO0o.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f2019OooO0Oo;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f2021OooO0o0;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f2020OooO0o;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f2017OooO0O0 = findViewById(R.id.action_bar);
        this.f2018OooO0OO = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f2016OooO00o || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        int left;
        int top;
        int right;
        View view;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (this.f2022OooO0oO) {
            Drawable drawable2 = this.f2020OooO0o;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f2019OooO0Oo != null) {
                if (this.f2017OooO0O0.getVisibility() == 0) {
                    drawable = this.f2019OooO0Oo;
                    left = this.f2017OooO0O0.getLeft();
                    top = this.f2017OooO0O0.getTop();
                    right = this.f2017OooO0O0.getRight();
                    view = this.f2017OooO0O0;
                } else {
                    View view2 = this.f2018OooO0OO;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f2019OooO0Oo.setBounds(0, 0, 0, 0);
                    } else {
                        drawable = this.f2019OooO0Oo;
                        left = this.f2018OooO0OO.getLeft();
                        top = this.f2018OooO0OO.getTop();
                        right = this.f2018OooO0OO.getRight();
                        view = this.f2018OooO0OO;
                    }
                }
                drawable.setBounds(left, top, right, view.getBottom());
            } else {
                z2 = false;
            }
            this.f2023OooO0oo = false;
        }
        if (z2) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f2017OooO0O0 == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f2015OooO) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f2017OooO0O0 == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f2019OooO0Oo;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2019OooO0Oo);
        }
        this.f2019OooO0Oo = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f2017OooO0O0;
            if (view != null) {
                this.f2019OooO0Oo.setBounds(view.getLeft(), this.f2017OooO0O0.getTop(), this.f2017OooO0O0.getRight(), this.f2017OooO0O0.getBottom());
            }
        }
        boolean z = true;
        if (!this.f2022OooO0oO ? this.f2019OooO0Oo != null || this.f2021OooO0o0 != null : this.f2020OooO0o != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f2020OooO0o;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f2020OooO0o);
        }
        this.f2020OooO0o = drawable;
        boolean z = this.f2022OooO0oO;
        boolean z2 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z && (drawable2 = this.f2020OooO0o) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z ? !(this.f2019OooO0Oo != null || this.f2021OooO0o0 != null) : this.f2020OooO0o == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2021OooO0o0;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f2021OooO0o0);
        }
        this.f2021OooO0o0 = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2023OooO0oo && this.f2021OooO0o0 != null) {
                throw null;
            }
        }
        if (!this.f2022OooO0oO ? !(this.f2019OooO0Oo != null || this.f2021OooO0o0 != null) : this.f2020OooO0o == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(o0OoOoOo o0oooooo) {
    }

    public void setTransitioning(boolean z) {
        this.f2016OooO00o = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2019OooO0Oo;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.f2021OooO0o0;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.f2020OooO0o;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f2019OooO0Oo;
        boolean z = this.f2022OooO0oO;
        return (drawable == drawable2 && !z) || (drawable == this.f2021OooO0o0 && this.f2023OooO0oo) || ((drawable == this.f2020OooO0o && z) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}