package o0OOO0o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class OooO0OO extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5322OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ OooO0o f5323OooO0O0;

    public /* synthetic */ OooO0OO(OooO0o oooO0o, int i) {
        this.f5322OooO00o = i;
        this.f5323OooO0O0 = oooO0o;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5322OooO00o) {
            case 1:
                this.f5323OooO0O0.f5375OooO0O0.OooO0oo(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f5322OooO00o) {
            case 0:
                this.f5323OooO0O0.f5375OooO0O0.OooO0oo(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}