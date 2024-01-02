package o000oOoO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o000OOo0 f4902OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f4903OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ View f4904OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f4905OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ OooOo00 f4906OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4907OooO0o0;

    public OooOO0O(OooOo00 oooOo00, o000OOo0 o000ooo0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f4906OooO0o = oooOo00;
        this.f4902OooO00o = o000ooo0;
        this.f4903OooO0O0 = i;
        this.f4904OooO0OO = view;
        this.f4905OooO0Oo = i2;
        this.f4907OooO0o0 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f4903OooO0O0;
        View view = this.f4904OooO0OO;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f4905OooO0Oo != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f4907OooO0o0.setListener(null);
        OooOo00 oooOo00 = this.f4906OooO0o;
        o000OOo0 o000ooo0 = this.f4902OooO00o;
        oooOo00.OooO0OO(o000ooo0);
        oooOo00.f4935OooOOOo.remove(o000ooo0);
        oooOo00.OooO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f4906OooO0o.getClass();
    }
}