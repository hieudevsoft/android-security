package com.google.android.material.snackbar;

import OooO0O0.OooO00o;
import OooO0Oo.o0000OO0;
import OooO0o.OooOOO0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o0ooOoO.OooOO0O;

/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {

    /* renamed from: OooO  reason: collision with root package name */
    public final o0000OO0 f3490OooO = new o0000OO0(this);

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, OooOOoo.o00Oo0
    public final boolean OooO0o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        o0000OO0 o0000oo02 = this.f3490OooO;
        o0000oo02.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                if (OooOOO0.f268OooO0o0 == null) {
                    OooOOO0.f268OooO0o0 = new OooOOO0(6);
                }
                OooOOO0 oooOOO0 = OooOOO0.f268OooO0o0;
                OooO00o.OooO0oO(o0000oo02.f183OooO0O0);
                synchronized (oooOOO0.f269OooO00o) {
                    OooO00o.OooO0oO(oooOOO0.f271OooO0OO);
                }
            }
        } else if (coordinatorLayout.OooOOO(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            if (OooOOO0.f268OooO0o0 == null) {
                OooOOO0.f268OooO0o0 = new OooOOO0(6);
            }
            OooOOO0 oooOOO02 = OooOOO0.f268OooO0o0;
            OooO00o.OooO0oO(o0000oo02.f183OooO0O0);
            synchronized (oooOOO02.f269OooO00o) {
                OooO00o.OooO0oO(oooOOO02.f271OooO0OO);
            }
        }
        return super.OooO0o(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean OooOOo(View view) {
        this.f3490OooO.getClass();
        return view instanceof OooOO0O;
    }
}