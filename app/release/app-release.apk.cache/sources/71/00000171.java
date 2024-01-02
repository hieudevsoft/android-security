package OooOooo;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class o0OoO00O extends o0O00O0o {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final WindowInsetsAnimation f1359OooO0o0;

    public o0OoO00O(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f1359OooO0o0 = windowInsetsAnimation;
    }

    @Override // OooOooo.o0O00O0o
    public final long OooO00o() {
        long durationMillis;
        durationMillis = this.f1359OooO0o0.getDurationMillis();
        return durationMillis;
    }

    @Override // OooOooo.o0O00O0o
    public final float OooO0O0() {
        float interpolatedFraction;
        interpolatedFraction = this.f1359OooO0o0.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // OooOooo.o0O00O0o
    public final int OooO0OO() {
        int typeMask;
        typeMask = this.f1359OooO0o0.getTypeMask();
        return typeMask;
    }

    @Override // OooOooo.o0O00O0o
    public final void OooO0Oo(float f) {
        this.f1359OooO0o0.setFraction(f);
    }
}