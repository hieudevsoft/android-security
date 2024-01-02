package OooOooo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class o0oOOo extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1370OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1371OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f1372OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Object f1373OooO0Oo;

    public /* synthetic */ o0oOOo(Object obj, Object obj2, Object obj3, int i) {
        this.f1370OooO00o = i;
        this.f1373OooO0Oo = obj;
        this.f1372OooO0OO = obj2;
        this.f1371OooO0O0 = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f1370OooO00o) {
            case 0:
                ((o0O00000) this.f1372OooO0OO).OooO0Oo((View) this.f1371OooO0O0);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f1370OooO00o;
        Object obj = this.f1372OooO0OO;
        switch (i) {
            case 0:
                ((o0O00000) obj).OooO00o();
                return;
            default:
                ((o0O00O) obj).f1321OooO00o.OooO0Oo(1.0f);
                o0O000o0.OooO0o0((View) this.f1371OooO0O0);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f1370OooO00o) {
            case 0:
                ((o0O00000) this.f1372OooO0OO).OooO0o();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}