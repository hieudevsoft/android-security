package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o0Oo0oo extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f3014OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ View f3015OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f3016OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o000000O f3017OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ OooOoOO.o000000 f3018OooO0o0;

    public o0Oo0oo(ViewGroup viewGroup, View view, o00Oo0 o00oo0, o000000O o000000o2, OooOoOO.o000000 o000000Var) {
        this.f3014OooO00o = viewGroup;
        this.f3015OooO0O0 = view;
        this.f3016OooO0OO = o00oo0;
        this.f3017OooO0Oo = o000000o2;
        this.f3018OooO0o0 = o000000Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        Animator animator2;
        ViewGroup viewGroup = this.f3014OooO00o;
        View view = this.f3015OooO0O0;
        viewGroup.endViewTransition(view);
        o00Oo0 o00oo0 = this.f3016OooO0OO;
        o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
        if (o0oooo0 == null) {
            animator2 = null;
        } else {
            animator2 = o0oooo0.f3021OooO0O0;
        }
        o00oo0.OooO0o().f3021OooO0O0 = null;
        if (animator2 != null && viewGroup.indexOfChild(view) < 0) {
            this.f3017OooO0Oo.OooO0OO(o00oo0, this.f3018OooO0o0);
        }
    }
}