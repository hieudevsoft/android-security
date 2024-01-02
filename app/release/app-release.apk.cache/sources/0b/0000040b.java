package com.google.android.material.transformation;

import OooO0O0.OooO00o;
import OooOOoo.o00Oo0;
import OooOooo.o0o0Oo;
import OooOooo.oo0o0O0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;

@Deprecated
/* loaded from: classes.dex */
public abstract class ExpandableBehavior extends o00Oo0 {
    public ExpandableBehavior() {
    }

    @Override // OooOOoo.o00Oo0
    public abstract void OooO0O0(View view);

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0Oo(CoordinatorLayout coordinatorLayout, View view, View view2) {
        OooO00o.OooO0oO(view2);
        throw null;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (!oo0o0O0.OooO0OO(view)) {
            ArrayList OooOO02 = coordinatorLayout.OooOO0(view);
            int size = OooOO02.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view2 = (View) OooOO02.get(i2);
                OooO0O0(view);
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(0);
    }
}