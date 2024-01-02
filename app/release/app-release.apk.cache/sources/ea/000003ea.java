package com.google.android.material.floatingactionbutton;

import OooO0O0.OooO00o;
import OooOOoo.o00Oo0;
import OooOOoo.o00oO0o;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class FloatingActionButton$BaseBehavior<T> extends o00Oo0 {
    public FloatingActionButton$BaseBehavior() {
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO00o(View view) {
        OooO00o.OooO0oo(view);
        throw null;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooO0OO(o00oO0o o00oo0o) {
        if (o00oo0o.f1094OooO0oo == 0) {
            o00oo0o.f1094OooO0oo = 80;
        }
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        OooO00o.OooO0oo(view);
        throw null;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooO00o.OooO0oo(view);
        throw null;
    }

    public FloatingActionButton$BaseBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1793OooO0oO);
        obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }
}