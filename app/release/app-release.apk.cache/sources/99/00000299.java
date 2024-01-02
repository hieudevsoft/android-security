package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: OooO  reason: collision with root package name */
    public View f2196OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public ActionMenuView f2197OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o00oOoo f2198OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00oOoo f2199OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o000000 f2200OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Drawable f2201OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o00000 f2202OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final CharSequence f2203OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o000000 f2204OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public Context f2205OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f2206OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f2207OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final int f2208OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final int f2209OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f2210OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f2211OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public int f2212OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public int f2213OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public CharSequence f2214OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f2215OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public o0O000O f2216OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public int f2217OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final int f2218OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public ColorStateList f2219OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public CharSequence f2220OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public ColorStateList f2221OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public boolean f2222OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public boolean f2223OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public final ArrayList f2224OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public final ArrayList f2225OooOooo;

    /* renamed from: Oooo  reason: collision with root package name */
    public boolean f2226Oooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public final o0O0oo00 f2227Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public final int[] f2228Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public final androidx.activity.result.OooO0o f2229Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public ArrayList f2230Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public o0OO00OO f2231Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public Oooo000 f2232Oooo0OO;

    /* renamed from: Oooo0o  reason: collision with root package name */
    public boolean f2233Oooo0o;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public o0OO000 f2234Oooo0o0;

    /* renamed from: Oooo0oO  reason: collision with root package name */
    public OnBackInvokedCallback f2235Oooo0oO;

    /* renamed from: Oooo0oo  reason: collision with root package name */
    public OnBackInvokedDispatcher f2236Oooo0oo;

    /* renamed from: OoooO00  reason: collision with root package name */
    public final androidx.activity.OooOOO f2237OoooO00;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static int OooO(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return OooOooo.o000O0O0.OooO0O0(marginLayoutParams) + OooOooo.o000O0O0.OooO0OO(marginLayoutParams);
    }

    public static o0OO000o OooO0oO(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o0OO000o ? new o0OO000o((o0OO000o) layoutParams) : layoutParams instanceof OooO0Oo.OooO0O0 ? new o0OO000o((OooO0Oo.OooO0O0) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o0OO000o((ViewGroup.MarginLayoutParams) layoutParams) : new o0OO000o(layoutParams);
    }

    public static int OooOO0(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new OooO0o.OooOo(getContext());
    }

    public final void OooO00o(int i, ArrayList arrayList) {
        boolean z;
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if (OooOooo.o00O0O0O.OooO0Oo(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, OooOooo.o00O0O0O.OooO0Oo(this));
        arrayList.clear();
        if (z) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                o0OO000o o0oo000o = (o0OO000o) childAt.getLayoutParams();
                if (o0oo000o.f2487OooO0O0 == 0 && OooOOo(childAt)) {
                    int i3 = o0oo000o.f53OooO00o;
                    WeakHashMap weakHashMap2 = OooOooo.o0o0Oo.f1363OooO00o;
                    int OooO0Oo2 = OooOooo.o00O0O0O.OooO0Oo(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i3, OooO0Oo2) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = OooO0Oo2 == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            o0OO000o o0oo000o2 = (o0OO000o) childAt2.getLayoutParams();
            if (o0oo000o2.f2487OooO0O0 == 0 && OooOOo(childAt2)) {
                int i5 = o0oo000o2.f53OooO00o;
                WeakHashMap weakHashMap3 = OooOooo.o0o0Oo.f1363OooO00o;
                int OooO0Oo3 = OooOooo.o00O0O0O.OooO0Oo(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i5, OooO0Oo3) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = OooO0Oo3 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void OooO0O0(View view, boolean z) {
        o0OO000o o0oo000o;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            o0oo000o = new o0OO000o();
        } else if (!checkLayoutParams(layoutParams)) {
            o0oo000o = OooO0oO(layoutParams);
        } else {
            o0oo000o = (o0OO000o) layoutParams;
        }
        o0oo000o.f2487OooO0O0 = 1;
        if (z && this.f2196OooO != null) {
            view.setLayoutParams(o0oo000o);
            this.f2225OooOooo.add(view);
            return;
        }
        addView(view, o0oo000o);
    }

    public final void OooO0OO() {
        if (this.f2204OooO0oo == null) {
            o000000 o000000Var = new o000000(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f2204OooO0oo = o000000Var;
            o000000Var.setImageDrawable(this.f2201OooO0o);
            this.f2204OooO0oo.setContentDescription(this.f2203OooO0oO);
            o0OO000o o0oo000o = new o0OO000o();
            o0oo000o.f53OooO00o = (this.f2208OooOOO & 112) | 8388611;
            o0oo000o.f2487OooO0O0 = 2;
            this.f2204OooO0oo.setLayoutParams(o0oo000o);
            this.f2204OooO0oo.setOnClickListener(new OooO0Oo.OooO0OO(1, this));
        }
    }

    public final void OooO0Oo() {
        OooO0o0();
        ActionMenuView actionMenuView = this.f2197OooO00o;
        if (actionMenuView.f2070OooOOOo == null) {
            OooO0oO.o00O00O o00o00o = (OooO0oO.o00O00O) actionMenuView.getMenu();
            if (this.f2234Oooo0o0 == null) {
                this.f2234Oooo0o0 = new o0OO000(this);
            }
            this.f2197OooO00o.setExpandedActionViewsExclusive(true);
            o00o00o.OooO0O0(this.f2234Oooo0o0, this.f2205OooOO0);
            OooOOoo();
        }
    }

    public final void OooO0o() {
        if (this.f2200OooO0Oo == null) {
            this.f2200OooO0Oo = new o000000(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            o0OO000o o0oo000o = new o0OO000o();
            o0oo000o.f53OooO00o = (this.f2208OooOOO & 112) | 8388611;
            this.f2200OooO0Oo.setLayoutParams(o0oo000o);
        }
    }

    public final void OooO0o0() {
        if (this.f2197OooO00o == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f2197OooO00o = actionMenuView;
            actionMenuView.setPopupTheme(this.f2206OooOO0O);
            this.f2197OooO00o.setOnMenuItemClickListener(this.f2227Oooo0);
            ActionMenuView actionMenuView2 = this.f2197OooO00o;
            o0O0oo00 o0o0oo00 = new o0O0oo00(this);
            actionMenuView2.f2075OooOo0 = null;
            actionMenuView2.f2077OooOo0O = o0o0oo00;
            o0OO000o o0oo000o = new o0OO000o();
            o0oo000o.f53OooO00o = (this.f2208OooOOO & 112) | 8388613;
            this.f2197OooO00o.setLayoutParams(o0oo000o);
            OooO0O0(this.f2197OooO00o, false);
        }
    }

    public final int OooO0oo(View view, int i) {
        int i2;
        o0OO000o o0oo000o = (o0OO000o) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = o0oo000o.f53OooO00o & 112;
        if (i3 != 16 && i3 != 48 && i3 != 80) {
            i3 = this.f2218OooOo0o & 112;
        }
        if (i3 != 48) {
            if (i3 != 80) {
                int paddingTop = getPaddingTop();
                int paddingBottom = getPaddingBottom();
                int height = getHeight();
                int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
                int i5 = ((ViewGroup.MarginLayoutParams) o0oo000o).topMargin;
                if (i4 < i5) {
                    i4 = i5;
                } else {
                    int i6 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
                    int i7 = ((ViewGroup.MarginLayoutParams) o0oo000o).bottomMargin;
                    if (i6 < i7) {
                        i4 = Math.max(0, i4 - (i7 - i6));
                    }
                }
                return paddingTop + i4;
            }
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) o0oo000o).bottomMargin) - i2;
        }
        return getPaddingTop() - i2;
    }

    public void OooOO0O(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void OooOO0o() {
        Iterator it = this.f2230Oooo00o.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it2 = ((CopyOnWriteArrayList) this.f2229Oooo00O.f1983OooO0OO).iterator();
        if (!it2.hasNext()) {
            ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
            currentMenuItems2.removeAll(currentMenuItems);
            this.f2230Oooo00o = currentMenuItems2;
            return;
        }
        OooO0O0.OooO00o.OooO0oO(it2.next());
        throw null;
    }

    public final int OooOOO(View view, int i, int i2, int[] iArr) {
        o0OO000o o0oo000o = (o0OO000o) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o0oo000o).leftMargin - iArr[0];
        int max = Math.max(0, i3) + i;
        iArr[0] = Math.max(0, -i3);
        int OooO0oo2 = OooO0oo(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, OooO0oo2, max + measuredWidth, view.getMeasuredHeight() + OooO0oo2);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) o0oo000o).rightMargin + max;
    }

    public final boolean OooOOO0(View view) {
        return view.getParent() == this || this.f2225OooOooo.contains(view);
    }

    public final int OooOOOO(View view, int i, int i2, int[] iArr) {
        o0OO000o o0oo000o = (o0OO000o) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) o0oo000o).rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int OooO0oo2 = OooO0oo(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, OooO0oo2, max, view.getMeasuredHeight() + OooO0oo2);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) o0oo000o).leftMargin);
    }

    public final int OooOOOo(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i6) + Math.max(0, i5);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final boolean OooOOo(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void OooOOo0(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void OooOOoo() {
        boolean z;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher OooO00o2 = o0O.OooO00o(this);
            o0OO000 o0oo000 = this.f2234Oooo0o0;
            boolean z2 = false;
            if (o0oo000 != null && o0oo000.f2485OooO0O0 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z && OooO00o2 != null) {
                WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
                if (OooOooo.oo0o0O0.OooO0O0(this) && this.f2226Oooo) {
                    z2 = true;
                }
            }
            if (z2 && this.f2236Oooo0oo == null) {
                if (this.f2235Oooo0oO == null) {
                    this.f2235Oooo0oO = o0O.OooO0O0(new o0oOo0O0(this, 1));
                }
                o0O.OooO0OO(OooO00o2, this.f2235Oooo0oO);
            } else if (!z2 && (onBackInvokedDispatcher = this.f2236Oooo0oo) != null) {
                o0O.OooO0Oo(onBackInvokedDispatcher, this.f2235Oooo0oO);
                OooO00o2 = null;
            } else {
                return;
            }
            this.f2236Oooo0oo = OooO00o2;
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof o0OO000o);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o0OO000o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o0OO000o(getContext(), attributeSet);
    }

    public CharSequence getCollapseContentDescription() {
        o000000 o000000Var = this.f2204OooO0oo;
        if (o000000Var != null) {
            return o000000Var.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        o000000 o000000Var = this.f2204OooO0oo;
        if (o000000Var != null) {
            return o000000Var.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        o0O000O o0o000o = this.f2216OooOo00;
        if (o0o000o != null) {
            if (o0o000o.f2428OooO0oO) {
                return o0o000o.f2422OooO00o;
            }
            return o0o000o.f2423OooO0O0;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f2217OooOo0O;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        o0O000O o0o000o = this.f2216OooOo00;
        if (o0o000o != null) {
            return o0o000o.f2422OooO00o;
        }
        return 0;
    }

    public int getContentInsetRight() {
        o0O000O o0o000o = this.f2216OooOo00;
        if (o0o000o != null) {
            return o0o000o.f2423OooO0O0;
        }
        return 0;
    }

    public int getContentInsetStart() {
        o0O000O o0o000o = this.f2216OooOo00;
        if (o0o000o != null) {
            if (o0o000o.f2428OooO0oO) {
                return o0o000o.f2423OooO0O0;
            }
            return o0o000o.f2422OooO00o;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f2215OooOo0;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        boolean z;
        OooO0oO.o00O00O o00o00o;
        ActionMenuView actionMenuView = this.f2197OooO00o;
        if (actionMenuView != null && (o00o00o = actionMenuView.f2070OooOOOo) != null && o00o00o.hasVisibleItems()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return Math.max(getContentInsetEnd(), Math.max(this.f2217OooOo0O, 0));
        }
        return getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if (OooOooo.o00O0O0O.OooO0Oo(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if (OooOooo.o00O0O0O.OooO0Oo(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f2215OooOo0, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        o00000 o00000Var = this.f2202OooO0o0;
        if (o00000Var != null) {
            return o00000Var.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        o00000 o00000Var = this.f2202OooO0o0;
        if (o00000Var != null) {
            return o00000Var.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        OooO0Oo();
        return this.f2197OooO00o.getMenu();
    }

    public View getNavButtonView() {
        return this.f2200OooO0Oo;
    }

    public CharSequence getNavigationContentDescription() {
        o000000 o000000Var = this.f2200OooO0Oo;
        if (o000000Var != null) {
            return o000000Var.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        o000000 o000000Var = this.f2200OooO0Oo;
        if (o000000Var != null) {
            return o000000Var.getDrawable();
        }
        return null;
    }

    public Oooo000 getOuterActionMenuPresenter() {
        return this.f2232Oooo0OO;
    }

    public Drawable getOverflowIcon() {
        OooO0Oo();
        return this.f2197OooO00o.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.f2205OooOO0;
    }

    public int getPopupTheme() {
        return this.f2206OooOO0O;
    }

    public CharSequence getSubtitle() {
        return this.f2220OooOoO0;
    }

    public final TextView getSubtitleTextView() {
        return this.f2199OooO0OO;
    }

    public CharSequence getTitle() {
        return this.f2214OooOo;
    }

    public int getTitleMarginBottom() {
        return this.f2213OooOOoo;
    }

    public int getTitleMarginEnd() {
        return this.f2212OooOOo0;
    }

    public int getTitleMarginStart() {
        return this.f2210OooOOOo;
    }

    public int getTitleMarginTop() {
        return this.f2211OooOOo;
    }

    public final TextView getTitleTextView() {
        return this.f2198OooO0O0;
    }

    public o00O0O0O getWrapper() {
        if (this.f2231Oooo0O0 == null) {
            this.f2231Oooo0O0 = new o0OO00OO(this);
        }
        return this.f2231Oooo0O0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOoo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f2237OoooO00);
        OooOOoo();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2222OooOoo = false;
        }
        if (!this.f2222OooOoo) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2222OooOoo = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2222OooOoo = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0288 A[LOOP:0: B:107:0x0286->B:108:0x0288, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4 A[LOOP:1: B:110:0x02a2->B:111:0x02a4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3 A[LOOP:2: B:113:0x02c1->B:114:0x02c3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0311 A[LOOP:3: B:122:0x030f->B:123:0x0311, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0213  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 802
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0284  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        OooO0oO.o00O00O o00o00o;
        MenuItem findItem;
        if (!(parcelable instanceof oo0ooO)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        oo0ooO oo0ooo = (oo0ooO) parcelable;
        super.onRestoreInstanceState(oo0ooo.f1456OooO00o);
        ActionMenuView actionMenuView = this.f2197OooO00o;
        if (actionMenuView != null) {
            o00o00o = actionMenuView.f2070OooOOOo;
        } else {
            o00o00o = null;
        }
        int i = oo0ooo.f2581OooO0OO;
        if (i != 0 && this.f2234Oooo0o0 != null && o00o00o != null && (findItem = o00o00o.findItem(i)) != null) {
            findItem.expandActionView();
        }
        if (oo0ooo.f2582OooO0Oo) {
            androidx.activity.OooOOO oooOOO = this.f2237OoooO00;
            removeCallbacks(oooOOO);
            post(oooOOO);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002f, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003d, code lost:
        if (r1 != Integer.MIN_VALUE) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onRtlPropertiesChanged(int r3) {
        /*
            r2 = this;
            super.onRtlPropertiesChanged(r3)
            androidx.appcompat.widget.o0O000O r0 = r2.f2216OooOo00
            if (r0 != 0) goto Le
            androidx.appcompat.widget.o0O000O r0 = new androidx.appcompat.widget.o0O000O
            r0.<init>()
            r2.f2216OooOo00 = r0
        Le:
            androidx.appcompat.widget.o0O000O r0 = r2.f2216OooOo00
            r1 = 1
            if (r3 != r1) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            boolean r3 = r0.f2428OooO0oO
            if (r1 != r3) goto L1a
            goto L48
        L1a:
            r0.f2428OooO0oO = r1
            boolean r3 = r0.f2429OooO0oo
            if (r3 == 0) goto L40
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L32
            int r1 = r0.f2425OooO0Oo
            if (r1 == r3) goto L29
            goto L2b
        L29:
            int r1 = r0.f2427OooO0o0
        L2b:
            r0.f2422OooO00o = r1
            int r1 = r0.f2424OooO0OO
            if (r1 == r3) goto L44
            goto L46
        L32:
            int r1 = r0.f2424OooO0OO
            if (r1 == r3) goto L37
            goto L39
        L37:
            int r1 = r0.f2427OooO0o0
        L39:
            r0.f2422OooO00o = r1
            int r1 = r0.f2425OooO0Oo
            if (r1 == r3) goto L44
            goto L46
        L40:
            int r3 = r0.f2427OooO0o0
            r0.f2422OooO00o = r3
        L44:
            int r1 = r0.f2426OooO0o
        L46:
            r0.f2423OooO0O0 = r1
        L48:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        OooO0oO.o00O00OO o00o00oo;
        oo0ooO oo0ooo = new oo0ooO(super.onSaveInstanceState());
        o0OO000 o0oo000 = this.f2234Oooo0o0;
        if (o0oo000 != null && (o00o00oo = o0oo000.f2485OooO0O0) != null) {
            oo0ooo.f2581OooO0OO = o00o00oo.f413OooO00o;
        }
        ActionMenuView actionMenuView = this.f2197OooO00o;
        boolean z2 = false;
        if (actionMenuView != null) {
            Oooo000 oooo000 = actionMenuView.f2076OooOo00;
            if (oooo000 != null && oooo000.OooO()) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        oo0ooo.f2582OooO0Oo = z2;
        return oo0ooo;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2223OooOoo0 = false;
        }
        if (!this.f2223OooOoo0) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2223OooOoo0 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2223OooOoo0 = false;
        }
        return true;
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.f2226Oooo != z) {
            this.f2226Oooo = z;
            OooOOoo();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    public void setCollapsible(boolean z) {
        this.f2233Oooo0o = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2217OooOo0O) {
            this.f2217OooOo0O = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f2215OooOo0) {
            this.f2215OooOo0 = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(o0000O00.OooO00o.o0ooOoO(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        OooO0o();
        this.f2200OooO0Oo.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(oo0oO0 oo0oo0) {
    }

    public void setOverflowIcon(Drawable drawable) {
        OooO0Oo();
        this.f2197OooO00o.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f2206OooOO0O != i) {
            this.f2206OooOO0O = i;
            if (i == 0) {
                this.f2205OooOO0 = getContext();
            } else {
                this.f2205OooOO0 = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f2213OooOOoo = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f2212OooOOo0 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f2210OooOOOo = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f2211OooOOo = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f2218OooOo0o = 8388627;
        this.f2224OooOooO = new ArrayList();
        this.f2225OooOooo = new ArrayList();
        this.f2228Oooo000 = new int[2];
        this.f2229Oooo00O = new androidx.activity.result.OooO0o(new o0oOo0O0(this, 0));
        this.f2230Oooo00o = new ArrayList();
        this.f2227Oooo0 = new o0O0oo00(this);
        this.f2237OoooO00 = new androidx.activity.OooOOO(3, this);
        Context context2 = getContext();
        int[] iArr = OooO0OO.OooO00o.f35OooOo;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(context2, attributeSet, iArr, R.attr.toolbarStyle);
        Object obj = OooOOO0.f2540OooO0O0;
        OooOooo.o0o0Oo.OooOO0O(this, context, iArr, attributeSet, (TypedArray) obj, R.attr.toolbarStyle);
        this.f2207OooOO0o = OooOOO0.OooO(28, 0);
        this.OooOOO0 = OooOOO0.OooO(19, 0);
        this.f2218OooOo0o = ((TypedArray) obj).getInteger(0, 8388627);
        this.f2208OooOOO = ((TypedArray) obj).getInteger(2, 48);
        int OooO0OO2 = OooOOO0.OooO0OO(22, 0);
        OooO0OO2 = OooOOO0.OooOO0o(27) ? OooOOO0.OooO0OO(27, OooO0OO2) : OooO0OO2;
        this.f2213OooOOoo = OooO0OO2;
        this.f2211OooOOo = OooO0OO2;
        this.f2212OooOOo0 = OooO0OO2;
        this.f2210OooOOOo = OooO0OO2;
        int OooO0OO3 = OooOOO0.OooO0OO(25, -1);
        if (OooO0OO3 >= 0) {
            this.f2210OooOOOo = OooO0OO3;
        }
        int OooO0OO4 = OooOOO0.OooO0OO(24, -1);
        if (OooO0OO4 >= 0) {
            this.f2212OooOOo0 = OooO0OO4;
        }
        int OooO0OO5 = OooOOO0.OooO0OO(26, -1);
        if (OooO0OO5 >= 0) {
            this.f2211OooOOo = OooO0OO5;
        }
        int OooO0OO6 = OooOOO0.OooO0OO(23, -1);
        if (OooO0OO6 >= 0) {
            this.f2213OooOOoo = OooO0OO6;
        }
        this.f2209OooOOOO = OooOOO0.OooO0Oo(13, -1);
        int OooO0OO7 = OooOOO0.OooO0OO(9, Integer.MIN_VALUE);
        int OooO0OO8 = OooOOO0.OooO0OO(5, Integer.MIN_VALUE);
        int OooO0Oo2 = OooOOO0.OooO0Oo(7, 0);
        int OooO0Oo3 = OooOOO0.OooO0Oo(8, 0);
        if (this.f2216OooOo00 == null) {
            this.f2216OooOo00 = new o0O000O();
        }
        o0O000O o0o000o = this.f2216OooOo00;
        o0o000o.f2429OooO0oo = false;
        if (OooO0Oo2 != Integer.MIN_VALUE) {
            o0o000o.f2427OooO0o0 = OooO0Oo2;
            o0o000o.f2422OooO00o = OooO0Oo2;
        }
        if (OooO0Oo3 != Integer.MIN_VALUE) {
            o0o000o.f2426OooO0o = OooO0Oo3;
            o0o000o.f2423OooO0O0 = OooO0Oo3;
        }
        if (OooO0OO7 != Integer.MIN_VALUE || OooO0OO8 != Integer.MIN_VALUE) {
            o0o000o.OooO00o(OooO0OO7, OooO0OO8);
        }
        this.f2215OooOo0 = OooOOO0.OooO0OO(10, Integer.MIN_VALUE);
        this.f2217OooOo0O = OooOOO0.OooO0OO(6, Integer.MIN_VALUE);
        this.f2201OooO0o = OooOOO0.OooO0o0(4);
        this.f2203OooO0oO = OooOOO0.OooOO0O(3);
        CharSequence OooOO0O2 = OooOOO0.OooOO0O(21);
        if (!TextUtils.isEmpty(OooOO0O2)) {
            setTitle(OooOO0O2);
        }
        CharSequence OooOO0O3 = OooOOO0.OooOO0O(18);
        if (!TextUtils.isEmpty(OooOO0O3)) {
            setSubtitle(OooOO0O3);
        }
        this.f2205OooOO0 = getContext();
        setPopupTheme(OooOOO0.OooO(17, 0));
        Drawable OooO0o02 = OooOOO0.OooO0o0(16);
        if (OooO0o02 != null) {
            setNavigationIcon(OooO0o02);
        }
        CharSequence OooOO0O4 = OooOOO0.OooOO0O(15);
        if (!TextUtils.isEmpty(OooOO0O4)) {
            setNavigationContentDescription(OooOO0O4);
        }
        Drawable OooO0o03 = OooOOO0.OooO0o0(11);
        if (OooO0o03 != null) {
            setLogo(OooO0o03);
        }
        CharSequence OooOO0O5 = OooOOO0.OooOO0O(12);
        if (!TextUtils.isEmpty(OooOO0O5)) {
            setLogoDescription(OooOO0O5);
        }
        if (OooOOO0.OooOO0o(29)) {
            setTitleTextColor(OooOOO0.OooO0O0(29));
        }
        if (OooOOO0.OooOO0o(20)) {
            setSubtitleTextColor(OooOOO0.OooO0O0(20));
        }
        if (OooOOO0.OooOO0o(14)) {
            OooOO0O(OooOOO0.OooO(14, 0));
        }
        OooOOO0.OooOOOO();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return OooO0oO(layoutParams);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0OO();
        }
        o000000 o000000Var = this.f2204OooO0oo;
        if (o000000Var != null) {
            o000000Var.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0OO();
            this.f2204OooO0oo.setImageDrawable(drawable);
            return;
        }
        o000000 o000000Var = this.f2204OooO0oo;
        if (o000000Var != null) {
            o000000Var.setImageDrawable(this.f2201OooO0o);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f2202OooO0o0 == null) {
                this.f2202OooO0o0 = new o00000(getContext(), null, 0);
            }
            if (!OooOOO0(this.f2202OooO0o0)) {
                OooO0O0(this.f2202OooO0o0, true);
            }
        } else {
            o00000 o00000Var = this.f2202OooO0o0;
            if (o00000Var != null && OooOOO0(o00000Var)) {
                removeView(this.f2202OooO0o0);
                this.f2225OooOooo.remove(this.f2202OooO0o0);
            }
        }
        o00000 o00000Var2 = this.f2202OooO0o0;
        if (o00000Var2 != null) {
            o00000Var2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f2202OooO0o0 == null) {
            this.f2202OooO0o0 = new o00000(getContext(), null, 0);
        }
        o00000 o00000Var = this.f2202OooO0o0;
        if (o00000Var != null) {
            o00000Var.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            OooO0o();
        }
        o000000 o000000Var = this.f2200OooO0Oo;
        if (o000000Var != null) {
            o000000Var.setContentDescription(charSequence);
            o0000O00.OooO00o.o000o0oO(this.f2200OooO0Oo, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            OooO0o();
            if (!OooOOO0(this.f2200OooO0Oo)) {
                OooO0O0(this.f2200OooO0Oo, true);
            }
        } else {
            o000000 o000000Var = this.f2200OooO0Oo;
            if (o000000Var != null && OooOOO0(o000000Var)) {
                removeView(this.f2200OooO0Oo);
                this.f2225OooOooo.remove(this.f2200OooO0Oo);
            }
        }
        o000000 o000000Var2 = this.f2200OooO0Oo;
        if (o000000Var2 != null) {
            o000000Var2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            o00oOoo o00oooo = this.f2199OooO0OO;
            if (o00oooo != null && OooOOO0(o00oooo)) {
                removeView(this.f2199OooO0OO);
                this.f2225OooOooo.remove(this.f2199OooO0OO);
            }
        } else {
            if (this.f2199OooO0OO == null) {
                Context context = getContext();
                o00oOoo o00oooo2 = new o00oOoo(context, null);
                this.f2199OooO0OO = o00oooo2;
                o00oooo2.setSingleLine();
                this.f2199OooO0OO.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.OooOOO0;
                if (i != 0) {
                    this.f2199OooO0OO.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2221OooOoOO;
                if (colorStateList != null) {
                    this.f2199OooO0OO.setTextColor(colorStateList);
                }
            }
            if (!OooOOO0(this.f2199OooO0OO)) {
                OooO0O0(this.f2199OooO0OO, true);
            }
        }
        o00oOoo o00oooo3 = this.f2199OooO0OO;
        if (o00oooo3 != null) {
            o00oooo3.setText(charSequence);
        }
        this.f2220OooOoO0 = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f2221OooOoOO = colorStateList;
        o00oOoo o00oooo = this.f2199OooO0OO;
        if (o00oooo != null) {
            o00oooo.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            o00oOoo o00oooo = this.f2198OooO0O0;
            if (o00oooo != null && OooOOO0(o00oooo)) {
                removeView(this.f2198OooO0O0);
                this.f2225OooOooo.remove(this.f2198OooO0O0);
            }
        } else {
            if (this.f2198OooO0O0 == null) {
                Context context = getContext();
                o00oOoo o00oooo2 = new o00oOoo(context, null);
                this.f2198OooO0O0 = o00oooo2;
                o00oooo2.setSingleLine();
                this.f2198OooO0O0.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f2207OooOO0o;
                if (i != 0) {
                    this.f2198OooO0O0.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f2219OooOoO;
                if (colorStateList != null) {
                    this.f2198OooO0O0.setTextColor(colorStateList);
                }
            }
            if (!OooOOO0(this.f2198OooO0O0)) {
                OooO0O0(this.f2198OooO0O0, true);
            }
        }
        o00oOoo o00oooo3 = this.f2198OooO0O0;
        if (o00oooo3 != null) {
            o00oooo3.setText(charSequence);
        }
        this.f2214OooOo = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f2219OooOoO = colorStateList;
        o00oOoo o00oooo = this.f2198OooO0O0;
        if (o00oooo != null) {
            o00oooo.setTextColor(colorStateList);
        }
    }
}