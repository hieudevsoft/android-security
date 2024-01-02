package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OoooOoo.oO0Ooooo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Oooo0 extends AnimatorListenerAdapter {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4938OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4939OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f4940OooO0OO;

    public Oooo0(View view) {
        this.f4940OooO0OO = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4938OooO00o) {
            case 0:
                this.f4939OooO0O0 = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.f4938OooO00o;
        Object obj = this.f4940OooO0OO;
        switch (i) {
            case 0:
                if (this.f4939OooO0O0) {
                    this.f4939OooO0O0 = false;
                    return;
                }
                o0OoOo0 o0oooo0 = (o0OoOo0) obj;
                if (((Float) o0oooo0.f5155OooOoO.getAnimatedValue()).floatValue() == 0.0f) {
                    o0oooo0.f5157OooOoOO = 0;
                    o0oooo0.OooO0o(0);
                    return;
                }
                o0oooo0.f5157OooOoOO = 2;
                o0oooo0.f5149OooOOoo.invalidate();
                return;
            default:
                View view = (View) obj;
                oO0Ooooo.f1692OooO00o.OooOoo0(view, 1.0f);
                if (this.f4939OooO0O0) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4938OooO00o) {
            case 1:
                View view = (View) this.f4940OooO0OO;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                if (o00O0O0.OooO0oo(view) && view.getLayerType() == 0) {
                    this.f4939OooO0O0 = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public Oooo0(o0OoOo0 o0oooo0) {
        this.f4940OooO0OO = o0oooo0;
    }
}