package o000oOoO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4914OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ OooOOO f4915OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f4916OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ View f4917OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ OooOo00 f4918OooO0o0;

    public /* synthetic */ OooOOO0(OooOo00 oooOo00, OooOOO oooOOO, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f4914OooO00o = i;
        this.f4918OooO0o0 = oooOo00;
        this.f4915OooO0O0 = oooOOO;
        this.f4916OooO0OO = viewPropertyAnimator;
        this.f4917OooO0Oo = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4914OooO00o;
        OooOo00 oooOo00 = this.f4918OooO0o0;
        OooOOO oooOOO = this.f4915OooO0O0;
        View view = this.f4917OooO0Oo;
        ViewPropertyAnimator viewPropertyAnimator = this.f4916OooO0OO;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                oooOo00.OooO0OO(oooOOO.f4908OooO00o);
                oooOo00.f4936OooOOo.remove(oooOOO.f4908OooO00o);
                oooOo00.OooO();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                oooOo00.OooO0OO(oooOOO.f4909OooO0O0);
                oooOo00.f4936OooOOo.remove(oooOOO.f4909OooO0O0);
                oooOo00.OooO();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f4914OooO00o;
        OooOo00 oooOo00 = this.f4918OooO0o0;
        OooOOO oooOOO = this.f4915OooO0O0;
        switch (i) {
            case 0:
                o000OOo0 o000ooo0 = oooOOO.f4908OooO00o;
                oooOo00.getClass();
                return;
            default:
                o000OOo0 o000ooo02 = oooOOO.f4909OooO0O0;
                oooOo00.getClass();
                return;
        }
    }
}