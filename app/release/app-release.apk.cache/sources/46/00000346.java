package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f2770OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ View f2771OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ boolean f2772OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o00O0000 f2773OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ OooOO0O f2774OooO0o0;

    public OooO0OO(ViewGroup viewGroup, View view, boolean z, o00O0000 o00o0000, OooOO0O oooOO0O) {
        this.f2770OooO00o = viewGroup;
        this.f2771OooO0O0 = view;
        this.f2772OooO0OO = z;
        this.f2773OooO0Oo = o00o0000;
        this.f2774OooO0o0 = oooOO0O;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f2770OooO00o;
        View view = this.f2771OooO0O0;
        viewGroup.endViewTransition(view);
        if (this.f2772OooO0OO) {
            this.f2773OooO0Oo.f2941OooO00o.OooO00o(view);
        }
        this.f2774OooO0o0.OooO0O0();
    }
}