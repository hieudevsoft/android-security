package androidx.fragment.app;

import android.transition.Transition;

/* loaded from: classes.dex */
public final class o000O0Oo implements Transition.TransitionListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Runnable f2921OooO00o;

    public o000O0Oo(Runnable runnable) {
        this.f2921OooO00o = runnable;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.f2921OooO00o.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}