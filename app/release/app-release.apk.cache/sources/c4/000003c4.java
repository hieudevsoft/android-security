package com.google.android.material.appbar;

import OooOOoo.o00Oo0;
import OooOOoo.o00oO0o;
import OooOooo.o0o0Oo;
import OooooO0.o0000O;
import OooooOo.oO00OOo0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class AppBarLayout$ScrollingViewBehavior extends oO00OOo0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3231OooO0OO;

    public AppBarLayout$ScrollingViewBehavior() {
        new Rect();
        new Rect();
    }

    public static void OooOOoo(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            View view = (View) arrayList.get(i);
        }
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0O0(View view) {
    }

    @Override // OooOOoo.o00Oo0
    public boolean OooO0Oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int OooOooo2;
        o00Oo0 o00oo0 = ((o00oO0o) view2.getLayoutParams()).f1087OooO00o;
        if (o00oo0 instanceof AppBarLayout$BaseBehavior) {
            ((AppBarLayout$BaseBehavior) o00oo0).getClass();
            int bottom = (view2.getBottom() - view.getTop()) + 0 + 0;
            int i = this.f3231OooO0OO;
            if (i == 0) {
                OooOooo2 = 0;
            } else {
                OooOooo2 = OooO00o.OooOooo((int) (i * 0.0f), 0, i);
            }
            int i2 = bottom - OooOooo2;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            view.offsetTopAndBottom(i2);
        }
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oo(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        int i4 = view.getLayoutParams().height;
        if (i4 == -1 || i4 == -2) {
            OooOOoo(coordinatorLayout.OooOO0(view));
            return false;
        }
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOO0o(CoordinatorLayout coordinatorLayout, View view) {
        OooOOoo(coordinatorLayout.OooOO0(view));
    }

    @Override // OooooOo.oO00OOo0
    public final void OooOOo(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOOoo(coordinatorLayout.OooOO0(view));
        coordinatorLayout.OooOOOo(view, i);
    }

    public AppBarLayout$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        new Rect();
        new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1805OooOo0);
        this.f3231OooO0OO = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }
}