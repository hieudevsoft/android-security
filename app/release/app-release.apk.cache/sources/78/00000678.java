package o000oOoO;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class o000oOoO implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0OoOo0 f5049OooO00o;

    public o000oOoO(o0OoOo0 o0oooo0) {
        this.f5049OooO00o = o0oooo0;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        o0OoOo0 o0oooo0 = this.f5049OooO00o;
        o0oooo0.f5135OooO0OO.setAlpha(floatValue);
        o0oooo0.f5136OooO0Oo.setAlpha(floatValue);
        o0oooo0.f5149OooOOoo.invalidate();
    }
}