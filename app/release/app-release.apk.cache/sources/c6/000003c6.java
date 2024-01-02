package com.google.android.material.behavior;

import OooOOoo.o00Oo0;
import OooooOO.oO00O0o0;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.appcompat.widget.OooO0o;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import hieubui.eup.android_app_security.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final LinkedHashSet f3238OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f3239OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3240OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public TimeInterpolator f3241OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f3242OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public TimeInterpolator f3243OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f3244OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public ViewPropertyAnimator f3245OooO0oo;

    public HideBottomViewOnScrollBehavior() {
        this.f3238OooO00o = new LinkedHashSet();
        this.f3242OooO0o = 0;
        this.f3244OooO0oO = 2;
    }

    @Override // OooOOoo.o00Oo0
    public boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f3242OooO0o = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f3239OooO0O0 = OooO00o.o000OooO(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f3240OooO0OO = OooO00o.o000OooO(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f3241OooO0Oo = OooO00o.o000Oooo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1818OooO0Oo);
        this.f3243OooO0o0 = OooO00o.o000Oooo(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1817OooO0OO);
        return false;
    }

    @Override // OooOOoo.o00Oo0
    public final void OooOO0O(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int[] iArr) {
        boolean z;
        LinkedHashSet linkedHashSet = this.f3238OooO00o;
        boolean z2 = true;
        if (i > 0) {
            if (this.f3244OooO0oO == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator = this.f3245OooO0oo;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f3244OooO0oO = 1;
                Iterator it = linkedHashSet.iterator();
                if (!it.hasNext()) {
                    OooOOo(view, this.f3242OooO0o + 0, this.f3240OooO0OO, this.f3243OooO0o0);
                } else {
                    OooO0O0.OooO00o.OooO0oO(it.next());
                    throw null;
                }
            }
        } else if (i < 0) {
            if (this.f3244OooO0oO != 2) {
                z2 = false;
            }
            if (!z2) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f3245OooO0oo;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f3244OooO0oO = 2;
                Iterator it2 = linkedHashSet.iterator();
                if (!it2.hasNext()) {
                    OooOOo(view, 0, this.f3239OooO0O0, this.f3241OooO0Oo);
                } else {
                    OooO0O0.OooO00o.OooO0oO(it2.next());
                    throw null;
                }
            }
        }
    }

    @Override // OooOOoo.o00Oo0
    public boolean OooOOOO(View view, int i, int i2) {
        return i == 2;
    }

    public final void OooOOo(View view, int i, long j, TimeInterpolator timeInterpolator) {
        this.f3245OooO0oo = view.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new OooO0o(3, this));
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.f3238OooO00o = new LinkedHashSet();
        this.f3242OooO0o = 0;
        this.f3244OooO0oO = 2;
    }
}