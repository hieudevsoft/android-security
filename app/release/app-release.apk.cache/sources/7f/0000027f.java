package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements o00O0O0, OooOooo.o000OOo0, OooOooo.o00 {

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final int[] f2043OooOoo0 = {R.attr.actionBarSize, 16842841};

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f2044OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2045OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2046OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public ContentFrameLayout f2047OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public ActionBarContainer f2048OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Drawable f2049OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00O0O0O f2050OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2051OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2052OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f2053OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f2054OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f2055OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final Rect f2056OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final Rect f2057OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final Rect f2058OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public OooOooo.o0O0OOOo f2059OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public OooOooo.o0O0OOOo f2060OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public OooOooo.o0O0OOOo f2061OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final OooO0o f2062OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public OooOO0 f2063OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public OooOooo.o0O0OOOo f2064OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public OverScroller f2065OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public ViewPropertyAnimator f2066OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public final OooO f2067OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final OooO f2068OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final OooOooo.o00O0000 f2069OooOoOO;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2046OooO0O0 = 0;
        this.f2056OooOOO = new Rect();
        this.f2057OooOOOO = new Rect();
        this.f2058OooOOOo = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        OooOooo.o0O0OOOo o0o0oooo = OooOooo.o0O0OOOo.f1354OooO0O0;
        this.f2060OooOOo0 = o0o0oooo;
        this.f2059OooOOo = o0o0oooo;
        this.f2061OooOOoo = o0o0oooo;
        this.f2064OooOo00 = o0o0oooo;
        this.f2062OooOo = new OooO0o(0, this);
        this.f2068OooOoO0 = new OooO(this, 0);
        this.f2067OooOoO = new OooO(this, 1);
        OooOO0(context);
        this.f2069OooOoOO = new OooOooo.o00O0000();
    }

    public static boolean OooO0oO(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        OooOO0O oooOO0O = (OooOO0O) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) oooOO0O).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) oooOO0O).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) oooOO0O).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) oooOO0O).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) oooOO0O).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) oooOO0O).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) oooOO0O).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) oooOO0O).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final boolean OooO() {
        boolean z;
        OooOO0o();
        ActionMenuView actionMenuView = ((o0OO00OO) this.f2050OooO0o0).f2490OooO00o.f2197OooO00o;
        if (actionMenuView == null) {
            return false;
        }
        Oooo000 oooo000 = actionMenuView.f2076OooOo00;
        if (oooo000 != null && oooo000.OooO0o0()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    @Override // OooOooo.o000OOo0
    public final void OooO00o(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // OooOooo.o00
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooO0OO(view, i, i2, i3, i4, i5);
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0OO(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0Oo(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // OooOooo.o000OOo0
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0o0(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    public final void OooO0oo() {
        removeCallbacks(this.f2068OooOoO0);
        removeCallbacks(this.f2067OooOoO);
        ViewPropertyAnimator viewPropertyAnimator = this.f2066OooOo0o;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void OooOO0(Context context) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f2043OooOoo0);
        this.f2045OooO00o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f2049OooO0o = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f2051OooO0oO = context.getApplicationInfo().targetSdkVersion < 19;
        this.f2065OooOo0O = new OverScroller(context);
    }

    public final void OooOO0O(int i) {
        OooOO0o();
        if (i == 2 || i == 5) {
            this.f2050OooO0o0.getClass();
        } else if (i != 109) {
        } else {
            setOverlayMode(true);
        }
    }

    public final void OooOO0o() {
        o00O0O0O wrapper;
        if (this.f2047OooO0OO == null) {
            this.f2047OooO0OO = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f2048OooO0Oo = (ActionBarContainer) findViewById(R.id.action_bar_container);
            View findViewById = findViewById(R.id.action_bar);
            if (findViewById instanceof o00O0O0O) {
                wrapper = (o00O0O0O) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.f2050OooO0o0 = wrapper;
        }
    }

    public final void OooOOO0(OooO0oO.o00O00O o00o00o, OooO0Oo.oo000o oo000oVar) {
        OooOO0o();
        o0OO00OO o0oo00oo = (o0OO00OO) this.f2050OooO0o0;
        Oooo000 oooo000 = o0oo00oo.OooOOO0;
        Toolbar toolbar = o0oo00oo.f2490OooO00o;
        if (oooo000 == null) {
            o0oo00oo.OooOOO0 = new Oooo000(toolbar.getContext());
        }
        Oooo000 oooo0002 = o0oo00oo.OooOOO0;
        oooo0002.f2136OooO0o0 = oo000oVar;
        if (o00o00o != null || toolbar.f2197OooO00o != null) {
            toolbar.OooO0o0();
            OooO0oO.o00O00O o00o00o2 = toolbar.f2197OooO00o.f2070OooOOOo;
            if (o00o00o2 != o00o00o) {
                if (o00o00o2 != null) {
                    o00o00o2.OooOOo(toolbar.f2232Oooo0OO);
                    o00o00o2.OooOOo(toolbar.f2234Oooo0o0);
                }
                if (toolbar.f2234Oooo0o0 == null) {
                    toolbar.f2234Oooo0o0 = new o0OO000(toolbar);
                }
                oooo0002.f2146OooOOo0 = true;
                if (o00o00o != null) {
                    o00o00o.OooO0O0(oooo0002, toolbar.f2205OooOO0);
                    o00o00o.OooO0O0(toolbar.f2234Oooo0o0, toolbar.f2205OooOO0);
                } else {
                    oooo0002.OooOO0O(toolbar.f2205OooOO0, null);
                    toolbar.f2234Oooo0o0.OooOO0O(toolbar.f2205OooOO0, null);
                    oooo0002.OooO0OO();
                    toolbar.f2234Oooo0o0.OooO0OO();
                }
                toolbar.f2197OooO00o.setPopupTheme(toolbar.f2206OooOO0O);
                toolbar.f2197OooO00o.setPresenter(oooo0002);
                toolbar.f2232Oooo0OO = oooo0002;
                toolbar.OooOOoo();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof OooOO0O;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f2049OooO0o == null || this.f2051OooO0oO) {
            return;
        }
        if (this.f2048OooO0Oo.getVisibility() == 0) {
            i = (int) (this.f2048OooO0Oo.getTranslationY() + this.f2048OooO0Oo.getBottom() + 0.5f);
        } else {
            i = 0;
        }
        this.f2049OooO0o.setBounds(0, i, getWidth(), this.f2049OooO0o.getIntrinsicHeight() + i);
        this.f2049OooO0o.draw(canvas);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new OooOO0O();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new OooOO0O(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f2048OooO0Oo;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        OooOooo.o00O0000 o00o0000 = this.f2069OooOoOO;
        return o00o0000.f1293OooO0O0 | o00o0000.f1292OooO00o;
    }

    public CharSequence getTitle() {
        OooOO0o();
        return ((o0OO00OO) this.f2050OooO0o0).f2490OooO00o.getTitle();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        OooOO0o();
        OooOooo.o0O0OOOo OooO0oo2 = OooOooo.o0O0OOOo.OooO0oo(this, windowInsets);
        boolean OooO0oO2 = OooO0oO(this.f2048OooO0Oo, new Rect(OooO0oo2.OooO0OO(), OooO0oo2.OooO0o0(), OooO0oo2.OooO0Oo(), OooO0oo2.OooO0O0()), false);
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        Rect rect = this.f2056OooOOO;
        OooOooo.oo0oOO0.OooO0O0(this, OooO0oo2, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        OooOooo.o0O0OO0 o0o0oo0 = OooO0oo2.f1355OooO00o;
        OooOooo.o0O0OOOo OooOO0o2 = o0o0oo0.OooOO0o(i, i2, i3, i4);
        this.f2060OooOOo0 = OooOO0o2;
        boolean z = true;
        if (!this.f2059OooOOo.equals(OooOO0o2)) {
            this.f2059OooOOo = this.f2060OooOOo0;
            OooO0oO2 = true;
        }
        Rect rect2 = this.f2057OooOOOO;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = OooO0oO2;
        }
        if (z) {
            requestLayout();
        }
        return o0o0oo0.OooO00o().f1355OooO00o.OooO0OO().f1355OooO00o.OooO0O0().OooO0oO();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        OooOO0(getContext());
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        OooOooo.o00O0OO.OooO0OO(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooO0oo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                OooOO0O oooOO0O = (OooOO0O) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) oooOO0O).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) oooOO0O).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        OooOooo.o0O00oO0 o0o00ooo;
        OooOooo.o0O0OOOo OooO0O02;
        OooOO0o();
        measureChildWithMargins(this.f2048OooO0Oo, i, 0, i2, 0);
        OooOO0O oooOO0O = (OooOO0O) this.f2048OooO0Oo.getLayoutParams();
        int max = Math.max(0, this.f2048OooO0Oo.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooOO0O).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0O).rightMargin);
        int max2 = Math.max(0, this.f2048OooO0Oo.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooOO0O).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0O).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.f2048OooO0Oo.getMeasuredState());
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if ((OooOooo.o00O0O0.OooO0oO(this) & 256) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f2045OooO00o;
            if (this.f2044OooO && this.f2048OooO0Oo.getTabContainer() != null) {
                measuredHeight += this.f2045OooO00o;
            }
        } else {
            measuredHeight = this.f2048OooO0Oo.getVisibility() != 8 ? this.f2048OooO0Oo.getMeasuredHeight() : 0;
        }
        Rect rect = this.f2056OooOOO;
        Rect rect2 = this.f2058OooOOOo;
        rect2.set(rect);
        OooOooo.o0O0OOOo o0o0oooo = this.f2060OooOOo0;
        this.f2061OooOOoo = o0o0oooo;
        if (!this.f2052OooO0oo && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            OooO0O02 = o0o0oooo.f1355OooO00o.OooOO0o(0, measuredHeight, 0, 0);
        } else {
            OooOo.OooO0OO OooO0O03 = OooOo.OooO0OO.OooO0O0(o0o0oooo.OooO0OO(), this.f2061OooOOoo.OooO0o0() + measuredHeight, this.f2061OooOOoo.OooO0Oo(), this.f2061OooOOoo.OooO0O0() + 0);
            OooOooo.o0O0OOOo o0o0oooo2 = this.f2061OooOOoo;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                o0o00ooo = new OooOooo.o0O00o00(o0o0oooo2);
            } else if (i3 >= 29) {
                o0o00ooo = new OooOooo.o0oO0Ooo(o0o0oooo2);
            } else {
                o0o00ooo = new OooOooo.o0O00OOO(o0o0oooo2);
            }
            o0o00ooo.OooO0oO(OooO0O03);
            OooO0O02 = o0o00ooo.OooO0O0();
        }
        this.f2061OooOOoo = OooO0O02;
        OooO0oO(this.f2047OooO0OO, rect2, true);
        if (!this.f2064OooOo00.equals(this.f2061OooOOoo)) {
            OooOooo.o0O0OOOo o0o0oooo3 = this.f2061OooOOoo;
            this.f2064OooOo00 = o0o0oooo3;
            ContentFrameLayout contentFrameLayout = this.f2047OooO0OO;
            WindowInsets OooO0oO2 = o0o0oooo3.OooO0oO();
            if (OooO0oO2 != null) {
                WindowInsets OooO00o2 = OooOooo.o00O0OO.OooO00o(contentFrameLayout, OooO0oO2);
                if (!OooO00o2.equals(OooO0oO2)) {
                    OooOooo.o0O0OOOo.OooO0oo(contentFrameLayout, OooO00o2);
                }
            }
        }
        measureChildWithMargins(this.f2047OooO0OO, i, 0, i2, 0);
        OooOO0O oooOO0O2 = (OooOO0O) this.f2047OooO0OO.getLayoutParams();
        int max3 = Math.max(max, this.f2047OooO0OO.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) oooOO0O2).leftMargin + ((ViewGroup.MarginLayoutParams) oooOO0O2).rightMargin);
        int max4 = Math.max(max2, this.f2047OooO0OO.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) oooOO0O2).topMargin + ((ViewGroup.MarginLayoutParams) oooOO0O2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.f2047OooO0OO.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.f2053OooOO0 || !z) {
            return false;
        }
        this.f2065OooOo0O.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f2065OooOo0O.getFinalY() > this.f2048OooO0Oo.getHeight()) {
            z2 = true;
        }
        if (z2) {
            OooO0oo();
            this.f2067OooOoO.run();
        } else {
            OooO0oo();
            this.f2068OooOoO0.run();
        }
        this.f2054OooOO0O = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.f2055OooOO0o + i2;
        this.f2055OooOO0o = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO0Oo.o000O00O o000o00o;
        OooO0o.Oooo0 oooo0;
        this.f2069OooOoOO.f1292OooO00o = i;
        this.f2055OooOO0o = getActionBarHideOffset();
        OooO0oo();
        OooOO0 oooOO0 = this.f2063OooOo0;
        if (oooOO0 != null && (oooo0 = (o000o00o = (OooO0Oo.o000O00O) oooOO0).f213OooOOoo) != null) {
            oooo0.OooO00o();
            o000o00o.f213OooOOoo = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f2048OooO0Oo.getVisibility() != 0) {
            return false;
        }
        return this.f2053OooOO0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.f2053OooOO0 && !this.f2054OooOO0O) {
            if (this.f2055OooOO0o <= this.f2048OooO0Oo.getHeight()) {
                OooO0oo();
                postDelayed(this.f2068OooOoO0, 600L);
                return;
            }
            OooO0oo();
            postDelayed(this.f2067OooOoO, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        OooOO0o();
        int i2 = this.OooOOO0 ^ i;
        this.OooOOO0 = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        OooOO0 oooOO0 = this.f2063OooOo0;
        if (oooOO0 != null) {
            ((OooO0Oo.o000O00O) oooOO0).f209OooOOOO = !z2;
            if (!z && z2) {
                OooO0Oo.o000O00O o000o00o = (OooO0Oo.o000O00O) oooOO0;
                if (!o000o00o.f210OooOOOo) {
                    o000o00o.f210OooOOOo = true;
                    o000o00o.OooOo0o(true);
                }
            } else {
                OooO0Oo.o000O00O o000o00o2 = (OooO0Oo.o000O00O) oooOO0;
                if (o000o00o2.f210OooOOOo) {
                    o000o00o2.f210OooOOOo = false;
                    o000o00o2.OooOo0o(true);
                }
            }
        }
        if ((i2 & 256) != 0 && this.f2063OooOo0 != null) {
            WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
            OooOooo.o00O0OO.OooO0OO(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f2046OooO0O0 = i;
        OooOO0 oooOO0 = this.f2063OooOo0;
        if (oooOO0 != null) {
            ((OooO0Oo.o000O00O) oooOO0).f208OooOOO = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        OooO0oo();
        this.f2048OooO0Oo.setTranslationY(-Math.max(0, Math.min(i, this.f2048OooO0Oo.getHeight())));
    }

    public void setActionBarVisibilityCallback(OooOO0 oooOO0) {
        this.f2063OooOo0 = oooOO0;
        if (getWindowToken() != null) {
            ((OooO0Oo.o000O00O) this.f2063OooOo0).f208OooOOO = this.f2046OooO0O0;
            int i = this.OooOOO0;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
                OooOooo.o00O0OO.OooO0OO(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.f2044OooO = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.f2053OooOO0) {
            this.f2053OooOO0 = z;
            if (z) {
                return;
            }
            OooO0oo();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        OooOO0o();
        o0OO00OO o0oo00oo = (o0OO00OO) this.f2050OooO0o0;
        o0oo00oo.f2493OooO0Oo = i != 0 ? o0000O00.OooO00o.o0ooOoO(o0oo00oo.f2490OooO00o.getContext(), i) : null;
        o0oo00oo.OooO0O0();
    }

    public void setLogo(int i) {
        Drawable drawable;
        OooOO0o();
        o0OO00OO o0oo00oo = (o0OO00OO) this.f2050OooO0o0;
        if (i != 0) {
            drawable = o0000O00.OooO00o.o0ooOoO(o0oo00oo.f2490OooO00o.getContext(), i);
        } else {
            drawable = null;
        }
        o0oo00oo.f2495OooO0o0 = drawable;
        o0oo00oo.OooO0O0();
    }

    public void setOverlayMode(boolean z) {
        this.f2052OooO0oo = z;
        this.f2051OooO0oO = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // androidx.appcompat.widget.o00O0O0
    public void setWindowCallback(Window.Callback callback) {
        OooOO0o();
        ((o0OO00OO) this.f2050OooO0o0).f2499OooOO0O = callback;
    }

    @Override // androidx.appcompat.widget.o00O0O0
    public void setWindowTitle(CharSequence charSequence) {
        OooOO0o();
        o0OO00OO o0oo00oo = (o0OO00OO) this.f2050OooO0o0;
        if (!o0oo00oo.f2496OooO0oO) {
            o0oo00oo.f2497OooO0oo = charSequence;
            if ((o0oo00oo.f2491OooO0O0 & 8) != 0) {
                Toolbar toolbar = o0oo00oo.f2490OooO00o;
                toolbar.setTitle(charSequence);
                if (o0oo00oo.f2496OooO0oO) {
                    OooOooo.o0o0Oo.OooOOO0(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new OooOO0O(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        OooOO0o();
        o0OO00OO o0oo00oo = (o0OO00OO) this.f2050OooO0o0;
        o0oo00oo.f2493OooO0Oo = drawable;
        o0oo00oo.OooO0O0();
    }
}