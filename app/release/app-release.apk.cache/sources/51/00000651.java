package o000oOoO;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4897OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f4898OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ View f4899OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f4900OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f4901OooO0o0;

    public /* synthetic */ OooOO0(OooOo00 oooOo00, Object obj, View view, ViewPropertyAnimator viewPropertyAnimator, int i) {
        this.f4897OooO00o = i;
        this.f4901OooO0o0 = oooOo00;
        this.f4898OooO0O0 = obj;
        this.f4899OooO0OO = view;
        this.f4900OooO0Oo = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4897OooO00o) {
            case 1:
                this.f4899OooO0OO.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4897OooO00o;
        Object obj = this.f4901OooO0o0;
        View view = this.f4899OooO0OO;
        Object obj2 = this.f4898OooO0O0;
        Object obj3 = this.f4900OooO0Oo;
        switch (i) {
            case 0:
                ((ViewPropertyAnimator) obj3).setListener(null);
                view.setAlpha(1.0f);
                OooOo00 oooOo00 = (OooOo00) obj;
                o000OOo0 o000ooo0 = (o000OOo0) obj2;
                oooOo00.OooO0OO(o000ooo0);
                oooOo00.f4937OooOOo0.remove(o000ooo0);
                oooOo00.OooO();
                return;
            case 1:
                ((ViewPropertyAnimator) obj3).setListener(null);
                OooOo00 oooOo002 = (OooOo00) obj;
                o000OOo0 o000ooo02 = (o000OOo0) obj2;
                oooOo002.OooO0OO(o000ooo02);
                oooOo002.f4934OooOOOO.remove(o000ooo02);
                oooOo002.OooO();
                return;
            default:
                ((ViewGroup) obj2).endViewTransition(view);
                animator.removeListener(this);
                androidx.fragment.app.o00Oo0 o00oo0 = (androidx.fragment.app.o00Oo0) obj3;
                View view2 = o00oo0.f2979OooOooo;
                if (view2 != null && o00oo0.f2974OooOoO0) {
                    view2.setVisibility(8);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f4897OooO00o;
        Object obj = this.f4901OooO0o0;
        switch (i) {
            case 0:
                ((OooOo00) obj).getClass();
                return;
            case 1:
                ((OooOo00) obj).getClass();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public OooOO0(OooOo00 oooOo00, o000OOo0 o000ooo0, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f4897OooO00o = 0;
        this.f4901OooO0o0 = oooOo00;
        this.f4898OooO0O0 = o000ooo0;
        this.f4900OooO0Oo = viewPropertyAnimator;
        this.f4899OooO0OO = view;
    }
}