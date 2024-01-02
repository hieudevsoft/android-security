package OoooOoo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class oO000Oo0 extends AnimatorListenerAdapter implements o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f1678OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1679OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ViewGroup f1680OooO0OO;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f1683OooO0o0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1682OooO0o = false;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final boolean f1681OooO0Oo = true;

    public oO000Oo0(View view, int i) {
        this.f1678OooO00o = view;
        this.f1679OooO0O0 = i;
        this.f1680OooO0OO = (ViewGroup) view.getParent();
        OooO0o(true);
    }

    @Override // OoooOoo.o
    public final void OooO00o() {
    }

    @Override // OoooOoo.o
    public final void OooO0O0() {
        OooO0o(false);
    }

    @Override // OoooOoo.o
    public final void OooO0OO() {
    }

    @Override // OoooOoo.o
    public final void OooO0Oo() {
        OooO0o(true);
    }

    public final void OooO0o(boolean z) {
        ViewGroup viewGroup;
        if (!this.f1681OooO0Oo || this.f1683OooO0o0 == z || (viewGroup = this.f1680OooO0OO) == null) {
            return;
        }
        this.f1683OooO0o0 = z;
        OooO00o.o000ooOO(viewGroup, z);
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        if (!this.f1682OooO0o) {
            oO0Ooooo.f1692OooO00o.OooOo(this.f1678OooO00o, this.f1679OooO0O0);
            ViewGroup viewGroup = this.f1680OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0o(false);
        oo00000.OooOo0O(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f1682OooO0o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f1682OooO0o) {
            oO0Ooooo.f1692OooO00o.OooOo(this.f1678OooO00o, this.f1679OooO0O0);
            ViewGroup viewGroup = this.f1680OooO0OO;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        OooO0o(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f1682OooO0o) {
            oO0Ooooo.f1692OooO00o.OooOo(this.f1678OooO00o, this.f1679OooO0O0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f1682OooO0o) {
            oO0Ooooo.f1692OooO00o.OooOo(this.f1678OooO00o, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}