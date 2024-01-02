package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: OooO  reason: collision with root package name */
    public int[] f2096OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2097OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2098OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2099OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2100OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2101OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2102OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f2103OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2104OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int[] f2105OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public Drawable f2106OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f2107OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f2108OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f2109OooOOOO;

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooO */
    public oo0O generateLayoutParams(AttributeSet attributeSet) {
        return new oo0O(getContext(), attributeSet);
    }

    public final void OooO0o(Canvas canvas, int i) {
        this.f2106OooOO0O.setBounds(getPaddingLeft() + this.f2109OooOOOO, i, (getWidth() - getPaddingRight()) - this.f2109OooOOOO, this.OooOOO0 + i);
        this.f2106OooOO0O.draw(canvas);
    }

    public final void OooO0oO(Canvas canvas, int i) {
        this.f2106OooOO0O.setBounds(i, getPaddingTop() + this.f2109OooOOOO, this.f2107OooOO0o + i, (getHeight() - getPaddingBottom()) - this.f2109OooOOOO);
        this.f2106OooOO0O.draw(canvas);
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooO0oo */
    public oo0O generateDefaultLayoutParams() {
        int i = this.f2100OooO0Oo;
        if (i == 0) {
            return new oo0O(-2);
        }
        if (i == 1) {
            return new oo0O(-1);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* renamed from: OooOO0 */
    public oo0O generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new oo0O(layoutParams);
    }

    public final boolean OooOO0O(int i) {
        if (i == 0) {
            return (this.f2108OooOOO & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.f2108OooOOO & 4) != 0;
        } else if ((this.f2108OooOOO & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof oo0O;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.f2098OooO0O0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f2098OooO0O0;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline == -1) {
                if (this.f2098OooO0O0 == 0) {
                    return -1;
                }
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
            int i3 = this.f2099OooO0OO;
            if (this.f2100OooO0Oo == 1 && (i = this.f2102OooO0o0 & 112) != 48) {
                if (i == 16) {
                    i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f2101OooO0o) / 2;
                } else if (i == 80) {
                    i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f2101OooO0o;
                }
            }
            return i3 + ((LinearLayout.LayoutParams) ((oo0O) childAt.getLayoutParams())).topMargin + baseline;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    }

    public int getBaselineAlignedChildIndex() {
        return this.f2098OooO0O0;
    }

    public Drawable getDividerDrawable() {
        return this.f2106OooOO0O;
    }

    public int getDividerPadding() {
        return this.f2109OooOOOO;
    }

    public int getDividerWidth() {
        return this.f2107OooOO0o;
    }

    public int getGravity() {
        return this.f2102OooO0o0;
    }

    public int getOrientation() {
        return this.f2100OooO0Oo;
    }

    public int getShowDividers() {
        return this.f2108OooOOO;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f2103OooO0oO;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int right;
        int left;
        int i;
        int left2;
        int bottom;
        if (this.f2106OooOO0O == null) {
            return;
        }
        int i2 = 0;
        if (this.f2100OooO0Oo == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i2 < virtualChildCount) {
                View childAt = getChildAt(i2);
                if (childAt != null && childAt.getVisibility() != 8 && OooOO0O(i2)) {
                    OooO0o(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((oo0O) childAt.getLayoutParams())).topMargin) - this.OooOOO0);
                }
                i2++;
            }
            if (OooOO0O(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.OooOOO0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((oo0O) childAt2.getLayoutParams())).bottomMargin;
                }
                OooO0o(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean OooO00o2 = o0OO0oO0.OooO00o(this);
        while (i2 < virtualChildCount2) {
            View childAt3 = getChildAt(i2);
            if (childAt3 != null && childAt3.getVisibility() != 8 && OooOO0O(i2)) {
                oo0O oo0o = (oo0O) childAt3.getLayoutParams();
                if (OooO00o2) {
                    left2 = childAt3.getRight() + ((LinearLayout.LayoutParams) oo0o).rightMargin;
                } else {
                    left2 = (childAt3.getLeft() - ((LinearLayout.LayoutParams) oo0o).leftMargin) - this.f2107OooOO0o;
                }
                OooO0oO(canvas, left2);
            }
            i2++;
        }
        if (OooOO0O(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 == null) {
                if (OooO00o2) {
                    right = getPaddingLeft();
                } else {
                    left = getWidth();
                    i = getPaddingRight();
                    right = (left - i) - this.f2107OooOO0o;
                }
            } else {
                oo0O oo0o2 = (oo0O) childAt4.getLayoutParams();
                if (OooO00o2) {
                    left = childAt4.getLeft();
                    i = ((LinearLayout.LayoutParams) oo0o2).leftMargin;
                    right = (left - i) - this.f2107OooOO0o;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) oo0o2).rightMargin;
                }
            }
            OooO0oO(canvas, right);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a7  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b0, code lost:
        if (r13 < 0) goto L164;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x06bf  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x06db  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x088e  */
    /* JADX WARN: Removed duplicated region for block: B:439:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMeasure(int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2252
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f2097OooO00o = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i >= 0 && i < getChildCount()) {
            this.f2098OooO0O0 = i;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f2106OooOO0O) {
            return;
        }
        this.f2106OooOO0O = drawable;
        if (drawable != null) {
            this.f2107OooOO0o = drawable.getIntrinsicWidth();
            this.OooOOO0 = drawable.getIntrinsicHeight();
        } else {
            this.f2107OooOO0o = 0;
            this.OooOOO0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.f2109OooOOOO = i;
    }

    public void setGravity(int i) {
        if (this.f2102OooO0o0 != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f2102OooO0o0 = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f2102OooO0o0;
        if ((8388615 & i3) != i2) {
            this.f2102OooO0o0 = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f2104OooO0oo = z;
    }

    public void setOrientation(int i) {
        if (this.f2100OooO0Oo != i) {
            this.f2100OooO0Oo = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f2108OooOOO) {
            requestLayout();
        }
        this.f2108OooOOO = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f2102OooO0o0;
        if ((i3 & 112) != i2) {
            this.f2102OooO0o0 = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f2103OooO0oO = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2097OooO00o = true;
        this.f2098OooO0O0 = -1;
        this.f2099OooO0OO = 0;
        this.f2102OooO0o0 = 8388659;
        int[] iArr = OooO0OO.OooO00o.f29OooOOO;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        o0oO0O0o o0oo0o0o = new o0oO0O0o(context, obtainStyledAttributes);
        OooOooo.o0o0Oo.OooOO0O(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        int OooO0oo2 = o0oo0o0o.OooO0oo(1, -1);
        if (OooO0oo2 >= 0) {
            setOrientation(OooO0oo2);
        }
        int OooO0oo3 = o0oo0o0o.OooO0oo(0, -1);
        if (OooO0oo3 >= 0) {
            setGravity(OooO0oo3);
        }
        boolean OooO00o2 = o0oo0o0o.OooO00o(2, true);
        if (!OooO00o2) {
            setBaselineAligned(OooO00o2);
        }
        this.f2103OooO0oO = obtainStyledAttributes.getFloat(4, -1.0f);
        this.f2098OooO0O0 = o0oo0o0o.OooO0oo(3, -1);
        this.f2104OooO0oo = o0oo0o0o.OooO00o(7, false);
        setDividerDrawable(o0oo0o0o.OooO0o0(5));
        this.f2108OooOOO = o0oo0o0o.OooO0oo(8, 0);
        this.f2109OooOOOO = o0oo0o0o.OooO0Oo(6, 0);
        o0oo0o0o.OooOOOO();
    }
}