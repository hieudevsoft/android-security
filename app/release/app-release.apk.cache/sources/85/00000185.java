package Oooo0;

/* loaded from: classes.dex */
public final class OooO00o {

    /* renamed from: OooO  reason: collision with root package name */
    public int f1386OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1387OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1388OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f1389OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f1390OooO0Oo;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public float f1394OooO0oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public long f1392OooO0o0 = Long.MIN_VALUE;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public long f1393OooO0oO = -1;

    /* renamed from: OooO0o  reason: collision with root package name */
    public long f1391OooO0o = 0;

    public final float OooO00o(long j) {
        long j2 = this.f1392OooO0o0;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f1393OooO0oO;
        if (j3 < 0 || j < j3) {
            return OooOO0O.OooO0O0(((float) (j - j2)) / this.f1387OooO00o, 0.0f, 1.0f) * 0.5f;
        }
        float f = this.f1394OooO0oo;
        return (OooOO0O.OooO0O0(((float) (j - j3)) / this.f1386OooO, 0.0f, 1.0f) * f) + (1.0f - f);
    }
}