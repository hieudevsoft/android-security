package Oooo;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class OooOo00 implements Interpolator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float[] f1384OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f1385OooO0O0;

    public OooOo00(float[] fArr) {
        this.f1384OooO00o = fArr;
        this.f1385OooO0O0 = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        if (f >= 1.0f) {
            return 1.0f;
        }
        if (f <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f1384OooO00o;
        int min = Math.min((int) ((fArr.length - 1) * f), fArr.length - 2);
        float f2 = this.f1385OooO0O0;
        float f3 = fArr[min];
        return ((fArr[min + 1] - f3) * ((f - (min * f2)) / f2)) + f3;
    }
}