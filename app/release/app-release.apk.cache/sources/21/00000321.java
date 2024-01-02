package androidx.core.widget;

import OooO0Oo.OooOOO0;
import OooOooo.o00;
import OooOooo.o000OO00;
import OooOooo.o00O0000;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import Oooo0.OooO;
import Oooo0.OooOOO;
import Oooo0.OooOOOO;
import Oooo0.OooOo;
import Oooo0.OooOo00;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import androidx.activity.result.OooO0o;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements o00 {

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f2642OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f2643OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f2644OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Rect f2645OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OverScroller f2646OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final EdgeEffect f2647OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final EdgeEffect f2648OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f2649OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2650OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public View f2651OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f2652OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public VelocityTracker f2653OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f2654OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f2655OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f2656OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f2657OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f2658OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final int[] f2659OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public final o00O0000 f2660OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f2661OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final int[] f2662OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f2663OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public OooOo f2664OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public float f2665OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public final o000OO00 f2666OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public OooOo00 f2667OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final float f2640OooOoo0 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: OooOoo  reason: collision with root package name */
    public static final OooOOO f2639OooOoo = new OooOOO();

    /* renamed from: OooOooO  reason: collision with root package name */
    public static final int[] f2641OooOooO = {16843130};

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.nestedScrollViewStyle);
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        this.f2645OooO0OO = new Rect();
        this.f2650OooO0oo = true;
        this.f2642OooO = false;
        this.f2651OooOO0 = null;
        this.f2652OooOO0O = false;
        this.f2654OooOOO = true;
        this.f2657OooOOo = -1;
        this.f2659OooOOoo = new int[2];
        this.f2662OooOo00 = new int[2];
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            edgeEffect = OooO.OooO00o(context, attributeSet);
        } else {
            edgeEffect = new EdgeEffect(context);
        }
        this.f2648OooO0o0 = edgeEffect;
        if (i >= 31) {
            edgeEffect2 = OooO.OooO00o(context, attributeSet);
        } else {
            edgeEffect2 = new EdgeEffect(context);
        }
        this.f2647OooO0o = edgeEffect2;
        this.f2643OooO00o = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f2646OooO0Oo = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f2655OooOOOO = viewConfiguration.getScaledTouchSlop();
        this.f2656OooOOOo = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2658OooOOo0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2641OooOooO, R.attr.nestedScrollViewStyle, 0);
        setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f2660OooOo = new o00O0000();
        this.f2666OooOoO0 = new o000OO00(this);
        setNestedScrollingEnabled(true);
        o0o0Oo.OooOO0o(this, f2639OooOoo);
    }

    public static boolean OooOOO0(View view, View view2) {
        if (view == view2) {
            return true;
        }
        ViewParent parent = view.getParent();
        return (parent instanceof ViewGroup) && OooOOO0((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f2665OooOoO == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f2665OooOoO = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f2665OooOoO;
    }

    public final void OooO() {
        this.f2657OooOOo = -1;
        this.f2652OooOO0O = false;
        VelocityTracker velocityTracker = this.f2653OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2653OooOO0o = null;
        }
        OooOoO0(0);
        this.f2648OooO0o0.onRelease();
        this.f2647OooO0o.onRelease();
    }

    @Override // OooOooo.o000OOo0
    public final void OooO00o(View view, View view2, int i, int i2) {
        o00O0000 o00o0000 = this.f2660OooOo;
        if (i2 == 1) {
            o00o0000.f1293OooO0O0 = i;
        } else {
            o00o0000.f1292OooO00o = i;
        }
        OooOo0o(2, i2);
    }

    @Override // OooOooo.o00
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        OooOOOO(i4, i5, iArr);
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0OO(View view, int i, int i2, int i3, int i4, int i5) {
        OooOOOO(i4, i5, null);
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0Oo(View view, int i) {
        o00O0000 o00o0000 = this.f2660OooOo;
        if (i == 1) {
            o00o0000.f1293OooO0O0 = 0;
        } else {
            o00o0000.f1292OooO00o = 0;
        }
        OooOoO0(i);
    }

    @Override // OooOooo.o000OOo0
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0o0(View view, int i, int i2, int[] iArr, int i3) {
        this.f2666OooOoO0.OooO0OO(i, i2, iArr, null, i3);
    }

    public final boolean OooO0oO(int i) {
        View findFocus = findFocus();
        if (findFocus == this) {
            findFocus = null;
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (findNextFocus != null && OooOOO(findNextFocus, maxScrollAmount, getHeight())) {
            Rect rect = this.f2645OooO0OO;
            findNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findNextFocus, rect);
            OooOo00(OooO0oo(rect), 0, 1, true);
            findNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            OooOo00(maxScrollAmount, 0, 1, true);
        }
        if (findFocus != null && findFocus.isFocused() && (!OooOOO(findFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final int OooO0oo(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i2 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i3 = rect.bottom;
        if (i3 > i2 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i2) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        } else if (rect.top >= scrollY || i3 >= i2) {
            return 0;
        } else {
            return Math.max(rect.height() > height ? 0 - (i2 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOO0(android.view.KeyEvent r6) {
        /*
            r5 = this;
            android.graphics.Rect r0 = r5.f2645OooO0OO
            r0.setEmpty()
            int r0 = r5.getChildCount()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L33
            android.view.View r0 = r5.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r0 = r0.getHeight()
            int r4 = r3.topMargin
            int r0 = r0 + r4
            int r3 = r3.bottomMargin
            int r0 = r0 + r3
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            if (r0 <= r3) goto L33
            r0 = r1
            goto L34
        L33:
            r0 = r2
        L34:
            r3 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L62
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L61
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L61
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L4c
            r6 = 0
        L4c:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r3)
            if (r6 == 0) goto L5f
            if (r6 == r5) goto L5f
            boolean r6 = r6.requestFocus(r3)
            if (r6 == 0) goto L5f
            goto L60
        L5f:
            r1 = r2
        L60:
            return r1
        L61:
            return r2
        L62:
            int r0 = r6.getAction()
            if (r0 != 0) goto Lb9
            int r0 = r6.getKeyCode()
            r1 = 19
            r4 = 33
            if (r0 == r1) goto Laa
            r1 = 20
            if (r0 == r1) goto L9a
            r1 = 62
            if (r0 == r1) goto L8f
            r6 = 92
            if (r0 == r6) goto Lb0
            r6 = 93
            if (r0 == r6) goto La0
            r6 = 122(0x7a, float:1.71E-43)
            if (r0 == r6) goto L8b
            r6 = 123(0x7b, float:1.72E-43)
            if (r0 == r6) goto L96
            goto Lb9
        L8b:
            r5.OooOOo(r4)
            goto Lb9
        L8f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L96
            r3 = r4
        L96:
            r5.OooOOo(r3)
            goto Lb9
        L9a:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto La5
        La0:
            boolean r2 = r5.OooOO0o(r3)
            goto Lb9
        La5:
            boolean r2 = r5.OooO0oO(r3)
            goto Lb9
        Laa:
            boolean r6 = r6.isAltPressed()
            if (r6 == 0) goto Lb5
        Lb0:
            boolean r2 = r5.OooOO0o(r4)
            goto Lb9
        Lb5:
            boolean r2 = r5.OooO0oO(r4)
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOO0(android.view.KeyEvent):boolean");
    }

    public final void OooOO0O(int i) {
        if (getChildCount() > 0) {
            this.f2646OooO0Oo.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            OooOo0o(2, 1);
            this.f2663OooOo0O = getScrollY();
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        }
    }

    public final boolean OooOO0o(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2645OooO0OO;
        rect.top = 0;
        rect.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return OooOOoo(i, rect.top, rect.bottom);
    }

    public final boolean OooOOO(View view, int i, int i2) {
        Rect rect = this.f2645OooO0OO;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i2;
    }

    public final void OooOOOO(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f2666OooOoO0.OooO0Oo(scrollY2, i - scrollY2, i2, iArr);
    }

    public final void OooOOOo(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f2657OooOOo) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f2649OooO0oO = (int) motionEvent.getY(i);
            this.f2657OooOOo = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f2653OooOO0o;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final void OooOOo(int i) {
        boolean z = i == 130;
        int height = getHeight();
        Rect rect = this.f2645OooO0OO;
        if (z) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i2 = rect.top;
        int i3 = height + i2;
        rect.bottom = i3;
        OooOOoo(i, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooOOo0(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            int r0 = r9.getOverScrollMode()
            r9.computeHorizontalScrollRange()
            r9.computeHorizontalScrollExtent()
            r9.computeVerticalScrollRange()
            r9.computeVerticalScrollExtent()
            r1 = 1
            r0 = 0
            int r11 = r11 + r0
            int r12 = r12 + r10
            int r13 = r13 + r0
            if (r11 <= 0) goto L1a
        L17:
            r11 = r0
            r10 = r1
            goto L1e
        L1a:
            if (r11 >= 0) goto L1d
            goto L17
        L1d:
            r10 = r0
        L1e:
            if (r12 <= r13) goto L23
            r12 = r13
        L21:
            r13 = r1
            goto L28
        L23:
            if (r12 >= 0) goto L27
            r12 = r0
            goto L21
        L27:
            r13 = r0
        L28:
            if (r13 == 0) goto L45
            OooOooo.o000OO00 r2 = r9.f2666OooOoO0
            android.view.ViewParent r2 = r2.OooO0o(r1)
            if (r2 == 0) goto L34
            r2 = r1
            goto L35
        L34:
            r2 = r0
        L35:
            if (r2 != 0) goto L45
            android.widget.OverScroller r2 = r9.f2646OooO0Oo
            r5 = 0
            r6 = 0
            r7 = 0
            int r8 = r9.getScrollRange()
            r3 = r11
            r4 = r12
            r2.springBack(r3, r4, r5, r6, r7, r8)
        L45:
            r9.onOverScrolled(r11, r12, r10, r13)
            if (r10 != 0) goto L4e
            if (r13 == 0) goto L4d
            goto L4e
        L4d:
            r1 = r0
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOOo0(int, int, int, int):boolean");
    }

    public final boolean OooOOoo(int i, int i2, int i3) {
        boolean z;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        if (i == 33) {
            z = true;
        } else {
            z = false;
        }
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z5 = false;
        for (int i6 = 0; i6 < size; i6++) {
            View view2 = focusables.get(i6);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                if (i2 < top && bottom < i3) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (view == null) {
                    view = view2;
                    z5 = z3;
                } else {
                    if ((z && top < view.getTop()) || (!z && bottom > view.getBottom())) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z5) {
                        if (z3) {
                            if (!z4) {
                            }
                            view = view2;
                        }
                    } else if (z3) {
                        view = view2;
                        z5 = true;
                    } else {
                        if (!z4) {
                        }
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i2 >= scrollY && i3 <= i5) {
            z2 = false;
        } else {
            if (z) {
                i4 = i2 - scrollY;
            } else {
                i4 = i3 - i5;
            }
            OooOo00(i4, 0, 1, true);
            z2 = true;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z2;
    }

    public final boolean OooOo(MotionEvent motionEvent) {
        boolean z;
        EdgeEffect edgeEffect = this.f2648OooO0o0;
        if (OooO00o.o0ooOOo(edgeEffect) != 0.0f) {
            OooO00o.o000O0O(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.f2647OooO0o;
        if (OooO00o.o0ooOOo(edgeEffect2) != 0.0f) {
            OooO00o.o000O0O(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z;
    }

    public final boolean OooOo0(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float o0ooOOo2 = OooO00o.o0ooOOo(edgeEffect) * getHeight();
        float f = this.f2643OooO00o * 0.015f;
        double log = Math.log((Math.abs(-i) * 0.35f) / f);
        double d = f2640OooOoo0;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < o0ooOOo2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooOo00(int r21, int r22, int r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.OooOo00(int, int, int, boolean):int");
    }

    public final void OooOo0O(int i, int i2, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f2644OooO0O0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            OverScroller overScroller = this.f2646OooO0Oo;
            int scrollX = getScrollX();
            overScroller.startScroll(scrollX, scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z) {
                OooOo0o(2, 1);
            } else {
                OooOoO0(1);
            }
            this.f2663OooOo0O = getScrollY();
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        } else {
            if (!this.f2646OooO0Oo.isFinished()) {
                this.f2646OooO0Oo.abortAnimation();
                OooOoO0(1);
            }
            scrollBy(i, i2);
        }
        this.f2644OooO0O0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean OooOo0o(int i, int i2) {
        return this.f2666OooOoO0.OooO0oO(i, i2);
    }

    public final void OooOoO0(int i) {
        this.f2666OooOoO0.OooO0oo(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int max = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > max ? bottom + (scrollY - max) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || OooOO0(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f2666OooOoO0.OooO00o(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.f2666OooOoO0.OooO0O0(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f2666OooOoO0.OooO0OO(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f2666OooOoO0.OooO0o0(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f2648OooO0o0;
        int i2 = 0;
        if (!edgeEffect.isFinished()) {
            int save = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(0, scrollY);
            if (OooOOOO.OooO00o(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                i = getPaddingLeft() + 0;
            } else {
                i = 0;
            }
            if (OooOOOO.OooO00o(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                min += getPaddingTop();
            }
            canvas.translate(i, min);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0O0.OooOO0O(this);
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect2 = this.f2647OooO0o;
        if (!edgeEffect2.isFinished()) {
            int save2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int max = Math.max(getScrollRange(), scrollY) + height2;
            if (OooOOOO.OooO00o(this)) {
                width2 -= getPaddingRight() + getPaddingLeft();
                i2 = 0 + getPaddingLeft();
            }
            if (OooOOOO.OooO00o(this)) {
                height2 -= getPaddingBottom() + getPaddingTop();
                max -= getPaddingBottom();
            }
            canvas.translate(i2 - width2, max);
            canvas.rotate(180.0f, width2, 0.0f);
            edgeEffect2.setSize(width2, height2);
            if (edgeEffect2.draw(canvas)) {
                WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                o00O0O0.OooOO0O(this);
            }
            canvas.restoreToCount(save2);
        }
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00O0000 o00o0000 = this.f2660OooOo;
        return o00o0000.f1293OooO0O0 | o00o0000.f1292OooO00o;
    }

    public int getScrollRange() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
        }
        return 0;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (this.f2666OooOoO0.OooO0o(0) == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f2666OooOoO0.f1285OooO0Oo;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2642OooO = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int i;
        float f;
        boolean z3 = false;
        if (motionEvent.getAction() != 8 || this.f2652OooOO0O) {
            return false;
        }
        if ((motionEvent.getSource() & 2) == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f = motionEvent.getAxisValue(9);
            i = (int) motionEvent.getX();
        } else {
            if ((motionEvent.getSource() & 4194304) == 4194304) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                f = motionEvent.getAxisValue(26);
                i = getWidth() / 2;
            } else {
                i = 0;
                f = 0.0f;
            }
        }
        if (f == 0.0f) {
            return false;
        }
        int verticalScrollFactorCompat = (int) (f * getVerticalScrollFactorCompat());
        if ((motionEvent.getSource() & 8194) == 8194) {
            z3 = true;
        }
        OooOo00(-verticalScrollFactorCompat, i, 1, z3);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ec  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        int i6 = 0;
        this.f2650OooO0oo = false;
        View view = this.f2651OooOO0;
        if (view != null && OooOOO0(view, this)) {
            View view2 = this.f2651OooOO0;
            Rect rect = this.f2645OooO0OO;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int OooO0oo2 = OooO0oo(rect);
            if (OooO0oo2 != 0) {
                scrollBy(0, OooO0oo2);
            }
        }
        this.f2651OooOO0 = null;
        if (!this.f2642OooO) {
            if (this.f2664OooOo0o != null) {
                scrollTo(getScrollX(), this.f2664OooOo0o.f1412OooO00o);
                this.f2664OooOo0o = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                i5 = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                i5 = 0;
            }
            int paddingTop = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < i5 && scrollY >= 0) {
                i6 = paddingTop + scrollY > i5 ? i5 - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f2642OooO = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.OooOOO0 && View.MeasureSpec.getMode(i2) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(0.0f, f2, true);
        OooOO0O((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO0o0(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooOOOO(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        View findNextFocusFromRect;
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (rect == null) {
            findNextFocusFromRect = focusFinder.findNextFocus(this, null, i);
        } else {
            findNextFocusFromRect = focusFinder.findNextFocusFromRect(this, rect, i);
        }
        if (findNextFocusFromRect == null || (true ^ OooOOO(findNextFocusFromRect, 0, getHeight()))) {
            return false;
        }
        return findNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof OooOo)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        OooOo oooOo = (OooOo) parcelable;
        super.onRestoreInstanceState(oooOo.getSuperState());
        this.f2664OooOo0o = oooOo;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        OooOo oooOo = new OooOo(super.onSaveInstanceState());
        oooOo.f1412OooO00o = getScrollY();
        return oooOo;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        OooOo00 oooOo00 = this.f2667OooOoOO;
        if (oooOo00 != null) {
            OooO0o oooO0o = (OooO0o) oooOo00;
            OooOOO0.OooO00o(this, (View) oooO0o.f1982OooO0O0, (View) oooO0o.f1983OooO0OO);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View findFocus = findFocus();
        if (findFocus != null && this != findFocus && OooOOO(findFocus, 0, i4)) {
            Rect rect = this.f2645OooO0OO;
            findFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(findFocus, rect);
            int OooO0oo2 = OooO0oo(rect);
            if (OooO0oo2 != 0) {
                if (this.f2654OooOOO) {
                    OooOo0O(0, OooO0oo2, false);
                } else {
                    scrollBy(0, OooO0oo2);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0Oo(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
        if (r13.f2646OooO0Oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d2, code lost:
        if (o0000O00.OooO00o.o0ooOOo(r6) == 0.0f) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0156, code lost:
        if (OooOo0(r6, r0) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0186, code lost:
        if (r13.f2646OooO0Oo.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange()) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0188, code lost:
        r14 = OooOooo.o0o0Oo.f1363OooO00o;
        OooOooo.o00O0O0.OooOO0O(r13);
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0162  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.f2650OooO0oo) {
            Rect rect = this.f2645OooO0OO;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int OooO0oo2 = OooO0oo(rect);
            if (OooO0oo2 != 0) {
                scrollBy(0, OooO0oo2);
            }
        } else {
            this.f2651OooOO0 = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        boolean z2;
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int OooO0oo2 = OooO0oo(rect);
        if (OooO0oo2 != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (z) {
                scrollBy(0, OooO0oo2);
            } else {
                OooOo0O(0, OooO0oo2, false);
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        VelocityTracker velocityTracker;
        if (z && (velocityTracker = this.f2653OooOO0o) != null) {
            velocityTracker.recycle();
            this.f2653OooOO0o = null;
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f2650OooO0oo = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i2 < 0) {
                i2 = 0;
            } else if (height + i2 > height2) {
                i2 = height2 - height;
            }
            if (i == getScrollX() && i2 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i2);
        }
    }

    public void setFillViewport(boolean z) {
        if (z != this.OooOOO0) {
            this.OooOOO0 = z;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        o000OO00 o000oo00 = this.f2666OooOoO0;
        if (o000oo00.f1285OooO0Oo) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            oo0oOO0.OooOoO(o000oo00.f1284OooO0OO);
        }
        o000oo00.f1285OooO0Oo = z;
    }

    public void setOnScrollChangeListener(OooOo00 oooOo00) {
        this.f2667OooOoOO = oooOo00;
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.f2654OooOOO = z;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return OooOo0o(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        OooOoO0(0);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }
}