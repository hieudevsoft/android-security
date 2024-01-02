package com.google.android.material.behavior;

import OooOOoo.o00Oo0;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo000.OooOOO;
import Oooo0o0.o000oOoO;
import Oooooo0.o0000OO0;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends View> extends o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o000oOoO f3246OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3247OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f3248OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3249OooO0Oo = 2;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f3251OooO0o0 = 0.5f;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f3250OooO0o = 0.0f;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f3252OooO0oO = 0.5f;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o0000OO0 f3253OooO0oo = new o0000OO0(this);

    @Override // OooOOoo.o00Oo0
    public boolean OooO0o(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z = this.f3247OooO0O0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.f3247OooO0O0 = false;
            }
        } else {
            z = coordinatorLayout.OooOOO(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3247OooO0O0 = z;
        }
        if (!z) {
            return false;
        }
        if (this.f3246OooO00o == null) {
            this.f3246OooO00o = new o000oOoO(coordinatorLayout.getContext(), coordinatorLayout, this.f3253OooO0oo);
        }
        if (!this.f3248OooO0OO && this.f3246OooO00o.OooOOo0(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, int i) {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0.OooO0OO(view) == 0) {
            o00O0O0.OooOOoo(view, 1);
            o0o0Oo.OooO(view, 1048576);
            o0o0Oo.OooO0oO(view, 0);
            if (OooOOo(view)) {
                o0o0Oo.OooOO0(view, OooOOO.f1428OooOO0, new OooO0Oo.o0000OO0(24, this));
            }
        }
        return false;
    }

    public boolean OooOOo(View view) {
        return true;
    }

    @Override // OooOOoo.o00Oo0
    public final boolean OooOOo0(View view, MotionEvent motionEvent) {
        if (this.f3246OooO00o != null) {
            if (this.f3248OooO0OO && motionEvent.getActionMasked() == 3) {
                return true;
            }
            this.f3246OooO00o.OooOO0(motionEvent);
            return true;
        }
        return false;
    }
}