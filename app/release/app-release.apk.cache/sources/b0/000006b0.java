package o0OOO0o;

import android.animation.ValueAnimator;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5318OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000oOoO f5319OooO0O0;

    public /* synthetic */ OooO00o(o000oOoO o000oooo, int i) {
        this.f5318OooO00o = i;
        this.f5319OooO0O0 = o000oooo;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f5318OooO00o;
        o000oOoO o000oooo = this.f5319OooO0O0;
        switch (i) {
            case 0:
                OooO0o oooO0o = (OooO0o) o000oooo;
                oooO0o.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                CheckableImageButton checkableImageButton = oooO0o.f5377OooO0Oo;
                checkableImageButton.setScaleX(floatValue);
                checkableImageButton.setScaleY(floatValue);
                return;
            case 1:
                OooO0o oooO0o2 = (OooO0o) o000oooo;
                oooO0o2.getClass();
                oooO0o2.f5377OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                OooOo00 oooOo00 = (OooOo00) o000oooo;
                oooOo00.getClass();
                oooOo00.f5377OooO0Oo.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}