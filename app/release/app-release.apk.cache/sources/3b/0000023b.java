package Oooooo;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import o0ooOO0.OooOOO;
import o0ooOO0.OooOOOO;

/* loaded from: classes.dex */
public final class o000000 implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1851OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1852OooO0O0;

    public /* synthetic */ o000000(int i, Object obj) {
        this.f1851OooO00o = i;
        this.f1852OooO0O0 = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f1851OooO00o;
        Object obj = this.f1852OooO0O0;
        switch (i) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                OooOOOO oooOOOO = ((BottomSheetBehavior) obj).f3254OooO;
                if (oooOOOO != null) {
                    OooOOO oooOOO = oooOOOO.f5494OooO00o;
                    if (oooOOO.f5476OooOO0 != floatValue) {
                        oooOOO.f5476OooOO0 = floatValue;
                        oooOOOO.f5499OooO0o0 = true;
                        oooOOOO.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((TextInputLayout) obj).f3566oo000o.OooOO0O(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}