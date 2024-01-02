package OooOooo;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class o0O00O0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1322OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f1323OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Interpolator f1324OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final long f1325OooO0Oo;

    public o0O00O0o(int i, Interpolator interpolator, long j) {
        this.f1322OooO00o = i;
        this.f1324OooO0OO = interpolator;
        this.f1325OooO0Oo = j;
    }

    public long OooO00o() {
        return this.f1325OooO0Oo;
    }

    public float OooO0O0() {
        Interpolator interpolator = this.f1324OooO0OO;
        return interpolator != null ? interpolator.getInterpolation(this.f1323OooO0O0) : this.f1323OooO0O0;
    }

    public int OooO0OO() {
        return this.f1322OooO00o;
    }

    public void OooO0Oo(float f) {
        this.f1323OooO0O0 = f;
    }
}