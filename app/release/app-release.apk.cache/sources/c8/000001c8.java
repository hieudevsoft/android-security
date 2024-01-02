package Oooo0o0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class Oooo0 implements Interpolator {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f1462OooO00o;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f1462OooO00o) {
            case 0:
            default:
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }
}