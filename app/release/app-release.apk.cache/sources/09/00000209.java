package OoooOoo;

import OooOO0.OooO0O0;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class o0oo0000 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Object f1630OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1631OooO0O0;

    public /* synthetic */ o0oo0000(Object obj, OooO0O0 oooO0O0) {
        this.f1631OooO0O0 = obj;
        this.f1630OooO00o = oooO0O0;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((OooO0O0) this.f1630OooO00o).remove(animator);
        ((oO00000) this.f1631OooO0O0).OooOOO0.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((oO00000) this.f1631OooO0O0).OooOOO0.add(animator);
    }
}