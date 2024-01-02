package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;

/* loaded from: classes.dex */
public class ActionMenuView extends LinearLayoutCompat implements OooO0oO.o00O00, OooO0oO.o00OO00O {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public OooO0oO.o00O00O f2070OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f2071OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public Context f2072OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f2073OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public int f2074OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public OooO0oO.oo0oOO0 f2075OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public Oooo000 f2076OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public OooO0oO.o00O000o f2077OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f2078OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final int f2079OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final int f2080OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public o0OoOo0 f2081OooOoOO;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.f2080OooOoO0 = (int) (56.0f * f);
        this.f2079OooOoO = (int) (f * 4.0f);
        this.f2072OooOOo0 = context;
        this.f2071OooOOo = 0;
    }

    public static o000oOoO OooOO0o(ViewGroup.LayoutParams layoutParams) {
        o000oOoO o000oooo;
        if (layoutParams != null) {
            if (layoutParams instanceof o000oOoO) {
                o000oooo = new o000oOoO((o000oOoO) layoutParams);
            } else {
                o000oooo = new o000oOoO(layoutParams);
            }
            if (((LinearLayout.LayoutParams) o000oooo).gravity <= 0) {
                ((LinearLayout.LayoutParams) o000oooo).gravity = 16;
            }
            return o000oooo;
        }
        o000oOoO o000oooo2 = new o000oOoO();
        ((LinearLayout.LayoutParams) o000oooo2).gravity = 16;
        return o000oooo2;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final oo0O OooO(AttributeSet attributeSet) {
        return new o000oOoO(getContext(), attributeSet);
    }

    @Override // OooO0oO.o00O00
    public final boolean OooO0O0(OooO0oO.o00O00OO o00o00oo) {
        return this.f2070OooOOOo.OooOOo0(o00o00oo, null, 0);
    }

    @Override // OooO0oO.o00OO00O
    public final void OooO0OO(OooO0oO.o00O00O o00o00o) {
        this.f2070OooOOOo = o00o00o;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final oo0O OooO0oo() {
        o000oOoO o000oooo = new o000oOoO();
        ((LinearLayout.LayoutParams) o000oooo).gravity = 16;
        return o000oooo;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    public final /* bridge */ /* synthetic */ oo0O OooOO0(ViewGroup.LayoutParams layoutParams) {
        return OooOO0o(layoutParams);
    }

    public final boolean OooOOO0(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof Oooo0)) {
            z = false | ((Oooo0) childAt).OooO0O0();
        }
        return (i <= 0 || !(childAt2 instanceof Oooo0)) ? z : z | ((Oooo0) childAt2).OooO00o();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o000oOoO;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o000oOoO o000oooo = new o000oOoO();
        ((LinearLayout.LayoutParams) o000oooo).gravity = 16;
        return o000oooo;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o000oOoO(getContext(), attributeSet);
    }

    public Menu getMenu() {
        if (this.f2070OooOOOo == null) {
            Context context = getContext();
            OooO0oO.o00O00O o00o00o = new OooO0oO.o00O00O(context);
            this.f2070OooOOOo = o00o00o;
            o00o00o.f395OooO0o0 = new OooO0Oo.o0000OO0(5, this);
            Oooo000 oooo000 = new Oooo000(context);
            this.f2076OooOo00 = oooo000;
            oooo000.f2141OooOO0o = true;
            oooo000.OooOOO0 = true;
            OooO0oO.oo0oOO0 oo0ooo0 = this.f2075OooOo0;
            if (oo0ooo0 == null) {
                oo0ooo0 = new o0ooOO0.OooOOO0(4, (Object) null);
            }
            oooo000.f2136OooO0o0 = oo0ooo0;
            this.f2070OooOOOo.OooO0O0(oooo000, this.f2072OooOOo0);
            Oooo000 oooo0002 = this.f2076OooOo00;
            oooo0002.f2138OooO0oo = this;
            this.f2070OooOOOo = oooo0002.f2133OooO0OO;
        }
        return this.f2070OooOOOo;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        Oooo000 oooo000 = this.f2076OooOo00;
        OooOo oooOo = oooo000.f2130OooO;
        if (oooOo != null) {
            return oooOo.getDrawable();
        }
        if (oooo000.f2140OooOO0O) {
            return oooo000.f2139OooOO0;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f2071OooOOo;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Oooo000 oooo000 = this.f2076OooOo00;
        if (oooo000 != null) {
            oooo000.OooO0OO();
            if (this.f2076OooOo00.OooO()) {
                this.f2076OooOo00.OooO0o0();
                this.f2076OooOo00.OooOO0o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Oooo000 oooo000 = this.f2076OooOo00;
        if (oooo000 != null) {
            oooo000.OooO0o0();
            OooOOO0 oooOOO0 = oooo000.f2149OooOo00;
            if (oooOOO0 != null && oooOOO0.OooO0O0()) {
                oooOOO0.f458OooOO0.dismiss();
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f2078OooOo0o) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean OooO00o2 = o0OO0oO0.OooO00o(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                o000oOoO o000oooo = (o000oOoO) childAt.getLayoutParams();
                if (o000oooo.f2316OooO00o) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (OooOOO0(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (OooO00o2) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) o000oooo).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) o000oooo).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) o000oooo).leftMargin) + ((LinearLayout.LayoutParams) o000oooo).rightMargin;
                    OooOOO0(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (OooO00o2) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                o000oOoO o000oooo2 = (o000oOoO) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !o000oooo2.f2316OooO00o) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) o000oooo2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) o000oooo2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            o000oOoO o000oooo3 = (o000oOoO) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !o000oooo3.f2316OooO00o) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) o000oooo3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) o000oooo3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z6;
        int i9;
        int i10;
        int i11;
        ActionMenuItemView actionMenuItemView;
        boolean z7;
        int i12;
        boolean z8;
        OooO0oO.o00O00O o00o00o;
        boolean z9 = this.f2078OooOo0o;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            z = true;
        } else {
            z = false;
        }
        this.f2078OooOo0o = z;
        if (z9 != z) {
            this.f2074OooOo = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f2078OooOo0o && (o00o00o = this.f2070OooOOOo) != null && size != this.f2074OooOo) {
            this.f2074OooOo = size;
            o00o00o.OooOOOo(true);
        }
        int childCount = getChildCount();
        if (this.f2078OooOo0o && childCount > 0) {
            int mode = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i);
            int size3 = View.MeasureSpec.getSize(i2);
            int paddingRight = getPaddingRight() + getPaddingLeft();
            int paddingBottom = getPaddingBottom() + getPaddingTop();
            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
            int i13 = size2 - paddingRight;
            int i14 = this.f2080OooOoO0;
            int i15 = i13 / i14;
            int i16 = i13 % i14;
            if (i15 == 0) {
                setMeasuredDimension(i13, 0);
                return;
            }
            int i17 = (i16 / i15) + i14;
            int childCount2 = getChildCount();
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            boolean z10 = false;
            int i22 = 0;
            long j = 0;
            while (true) {
                i3 = this.f2079OooOoO;
                if (i21 >= childCount2) {
                    break;
                }
                View childAt = getChildAt(i21);
                int i23 = size3;
                int i24 = i13;
                if (childAt.getVisibility() == 8) {
                    i10 = mode;
                    i11 = paddingBottom;
                } else {
                    boolean z11 = childAt instanceof ActionMenuItemView;
                    int i25 = i19 + 1;
                    if (z11) {
                        childAt.setPadding(i3, 0, i3, 0);
                    }
                    o000oOoO o000oooo = (o000oOoO) childAt.getLayoutParams();
                    o000oooo.f2320OooO0o = false;
                    o000oooo.f2318OooO0OO = 0;
                    o000oooo.f2317OooO0O0 = 0;
                    o000oooo.f2319OooO0Oo = false;
                    ((LinearLayout.LayoutParams) o000oooo).leftMargin = 0;
                    ((LinearLayout.LayoutParams) o000oooo).rightMargin = 0;
                    if (z11 && ((ActionMenuItemView) childAt).OooOO0o()) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    o000oooo.f2321OooO0o0 = z6;
                    if (o000oooo.f2316OooO00o) {
                        i9 = 1;
                    } else {
                        i9 = i15;
                    }
                    o000oOoO o000oooo2 = (o000oOoO) childAt.getLayoutParams();
                    i10 = mode;
                    i11 = paddingBottom;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                    if (z11) {
                        actionMenuItemView = (ActionMenuItemView) childAt;
                    } else {
                        actionMenuItemView = null;
                    }
                    if (actionMenuItemView != null && actionMenuItemView.OooOO0o()) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (i9 > 0 && (!z7 || i9 >= 2)) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(i9 * i17, Integer.MIN_VALUE), makeMeasureSpec);
                        int measuredWidth = childAt.getMeasuredWidth();
                        i12 = measuredWidth / i17;
                        if (measuredWidth % i17 != 0) {
                            i12++;
                        }
                        if (z7 && i12 < 2) {
                            i12 = 2;
                        }
                    } else {
                        i12 = 0;
                    }
                    if (!o000oooo2.f2316OooO00o && z7) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    o000oooo2.f2319OooO0Oo = z8;
                    o000oooo2.f2317OooO0O0 = i12;
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i17 * i12, 1073741824), makeMeasureSpec);
                    i20 = Math.max(i20, i12);
                    if (o000oooo.f2319OooO0Oo) {
                        i22++;
                    }
                    if (o000oooo.f2316OooO00o) {
                        z10 = true;
                    }
                    i15 -= i12;
                    i18 = Math.max(i18, childAt.getMeasuredHeight());
                    if (i12 == 1) {
                        j |= 1 << i21;
                    }
                    i19 = i25;
                }
                i21++;
                size3 = i23;
                i13 = i24;
                paddingBottom = i11;
                mode = i10;
            }
            int i26 = mode;
            int i27 = i13;
            int i28 = size3;
            if (z10 && i19 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z12 = false;
            while (i22 > 0 && i15 > 0) {
                int i29 = Integer.MAX_VALUE;
                int i30 = 0;
                int i31 = 0;
                long j2 = 0;
                while (i31 < childCount2) {
                    o000oOoO o000oooo3 = (o000oOoO) getChildAt(i31).getLayoutParams();
                    boolean z13 = z12;
                    if (o000oooo3.f2319OooO0Oo) {
                        int i32 = o000oooo3.f2317OooO0O0;
                        if (i32 < i29) {
                            j2 = 1 << i31;
                            i29 = i32;
                            i30 = 1;
                        } else if (i32 == i29) {
                            j2 |= 1 << i31;
                            i30++;
                        }
                    }
                    i31++;
                    z12 = z13;
                }
                z3 = z12;
                j |= j2;
                if (i30 > i15) {
                    break;
                }
                int i33 = i29 + 1;
                int i34 = 0;
                while (i34 < childCount2) {
                    View childAt2 = getChildAt(i34);
                    o000oOoO o000oooo4 = (o000oOoO) childAt2.getLayoutParams();
                    int i35 = i18;
                    int i36 = childMeasureSpec;
                    int i37 = childCount2;
                    long j3 = 1 << i34;
                    if ((j2 & j3) == 0) {
                        if (o000oooo4.f2317OooO0O0 == i33) {
                            j |= j3;
                        }
                    } else {
                        if (z2 && o000oooo4.f2321OooO0o0) {
                            r4 = 1;
                            r4 = 1;
                            if (i15 == 1) {
                                childAt2.setPadding(i3 + i17, 0, i3, 0);
                            }
                        } else {
                            r4 = 1;
                        }
                        o000oooo4.f2317OooO0O0 += r4;
                        o000oooo4.f2320OooO0o = r4;
                        i15--;
                    }
                    i34++;
                    childMeasureSpec = i36;
                    i18 = i35;
                    childCount2 = i37;
                }
                z12 = true;
            }
            z3 = z12;
            int i38 = i18;
            int i39 = childMeasureSpec;
            int i40 = childCount2;
            if (!z10 && i19 == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i15 > 0 && j != 0 && (i15 < i19 - 1 || z4 || i20 > 1)) {
                float bitCount = Long.bitCount(j);
                if (!z4) {
                    if ((j & 1) != 0 && !((o000oOoO) getChildAt(0).getLayoutParams()).f2321OooO0o0) {
                        bitCount -= 0.5f;
                    }
                    int i41 = i40 - 1;
                    if ((j & (1 << i41)) != 0 && !((o000oOoO) getChildAt(i41).getLayoutParams()).f2321OooO0o0) {
                        bitCount -= 0.5f;
                    }
                }
                if (bitCount > 0.0f) {
                    i8 = (int) ((i15 * i17) / bitCount);
                } else {
                    i8 = 0;
                }
                boolean z14 = z3;
                i4 = i40;
                for (int i42 = 0; i42 < i4; i42++) {
                    if ((j & (1 << i42)) != 0) {
                        View childAt3 = getChildAt(i42);
                        o000oOoO o000oooo5 = (o000oOoO) childAt3.getLayoutParams();
                        if (childAt3 instanceof ActionMenuItemView) {
                            o000oooo5.f2318OooO0OO = i8;
                            o000oooo5.f2320OooO0o = true;
                            if (i42 == 0 && !o000oooo5.f2321OooO0o0) {
                                ((LinearLayout.LayoutParams) o000oooo5).leftMargin = (-i8) / 2;
                            }
                            z14 = true;
                        } else {
                            if (o000oooo5.f2316OooO00o) {
                                o000oooo5.f2318OooO0OO = i8;
                                o000oooo5.f2320OooO0o = true;
                                ((LinearLayout.LayoutParams) o000oooo5).rightMargin = (-i8) / 2;
                                z14 = true;
                            } else {
                                if (i42 != 0) {
                                    ((LinearLayout.LayoutParams) o000oooo5).leftMargin = i8 / 2;
                                }
                                if (i42 != i4 - 1) {
                                    ((LinearLayout.LayoutParams) o000oooo5).rightMargin = i8 / 2;
                                }
                            }
                        }
                    }
                }
                z5 = z14;
            } else {
                i4 = i40;
                z5 = z3;
            }
            if (z5) {
                int i43 = 0;
                while (i43 < i4) {
                    View childAt4 = getChildAt(i43);
                    o000oOoO o000oooo6 = (o000oOoO) childAt4.getLayoutParams();
                    if (!o000oooo6.f2320OooO0o) {
                        i7 = i39;
                    } else {
                        i7 = i39;
                        childAt4.measure(View.MeasureSpec.makeMeasureSpec((o000oooo6.f2317OooO0O0 * i17) + o000oooo6.f2318OooO0OO, 1073741824), i7);
                    }
                    i43++;
                    i39 = i7;
                }
            }
            if (i26 != 1073741824) {
                i6 = i27;
                i5 = i38;
            } else {
                i5 = i28;
                i6 = i27;
            }
            setMeasuredDimension(i6, i5);
            return;
        }
        for (int i44 = 0; i44 < childCount; i44++) {
            o000oOoO o000oooo7 = (o000oOoO) getChildAt(i44).getLayoutParams();
            ((LinearLayout.LayoutParams) o000oooo7).rightMargin = 0;
            ((LinearLayout.LayoutParams) o000oooo7).leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.f2076OooOo00.f2146OooOOo0 = z;
    }

    public void setOnMenuItemClickListener(o0OoOo0 o0oooo0) {
        this.f2081OooOoOO = o0oooo0;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        Oooo000 oooo000 = this.f2076OooOo00;
        OooOo oooOo = oooo000.f2130OooO;
        if (oooOo != null) {
            oooOo.setImageDrawable(drawable);
            return;
        }
        oooo000.f2140OooOO0O = true;
        oooo000.f2139OooOO0 = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.f2073OooOOoo = z;
    }

    public void setPopupTheme(int i) {
        if (this.f2071OooOOo != i) {
            this.f2071OooOOo = i;
            if (i == 0) {
                this.f2072OooOOo0 = getContext();
            } else {
                this.f2072OooOOo0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(Oooo000 oooo000) {
        this.f2076OooOo00 = oooo000;
        oooo000.f2138OooO0oo = this;
        this.f2070OooOOOo = oooo000.f2133OooO0OO;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooOO0o(layoutParams);
    }
}