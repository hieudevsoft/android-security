package OooOo0o;

import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0000O00 {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final o0000O00 f1169OooOO0O;

    /* renamed from: OooO  reason: collision with root package name */
    public final float f1170OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f1171OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f1172OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f1173OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final float f1174OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final float f1175OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f1176OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final float[] f1177OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final float f1178OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final float f1179OooOO0;

    static {
        float f;
        float f2;
        float[] fArr = OooO00o.f4118OooO0oo;
        float o00O0O0O = (float) ((OooO00o.o00O0O0O() * 63.66197723675813d) / 100.0d);
        float[][] fArr2 = OooO00o.f4115OooO0o;
        float f3 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1] * f4;
        float f6 = fArr[2];
        float f7 = (fArr3[2] * f6) + f5 + (fArr3[0] * f3);
        float[] fArr4 = fArr2[1];
        float f8 = (fArr4[2] * f6) + (fArr4[1] * f4) + (fArr4[0] * f3);
        float[] fArr5 = fArr2[2];
        float f9 = (f6 * fArr5[2]) + (f4 * fArr5[1]) + (f3 * fArr5[0]);
        if (1.0f >= 0.9d) {
            f = 0.100000046f;
            f2 = 0.59f;
        } else {
            f = 0.12999998f;
            f2 = 0.525f;
        }
        float f10 = f + f2;
        float exp = (1.0f - (((float) Math.exp(((-o00O0O0O) - 42.0f) / 92.0f)) * 0.2777778f)) * 1.0f;
        double d = exp;
        if (d > 1.0d) {
            exp = 1.0f;
        } else if (d < 0.0d) {
            exp = 0.0f;
        }
        float[] fArr6 = {(((100.0f / f7) * exp) + 1.0f) - exp, (((100.0f / f8) * exp) + 1.0f) - exp, (((100.0f / f9) * exp) + 1.0f) - exp};
        float f11 = 1.0f / ((5.0f * o00O0O0O) + 1.0f);
        float f12 = f11 * f11 * f11 * f11;
        float f13 = 1.0f - f12;
        float cbrt = (0.1f * f13 * f13 * ((float) Math.cbrt(o00O0O0O * 5.0d))) + (f12 * o00O0O0O);
        float o00O0O0O2 = OooO00o.o00O0O0O() / fArr[1];
        double d2 = o00O0O0O2;
        float sqrt = ((float) Math.sqrt(d2)) + 1.48f;
        float pow = 0.725f / ((float) Math.pow(d2, 0.2d));
        float pow2 = (float) Math.pow(((fArr6[2] * cbrt) * f9) / 100.0d, 0.42d);
        float[] fArr7 = {(float) Math.pow(((fArr6[0] * cbrt) * f7) / 100.0d, 0.42d), (float) Math.pow(((fArr6[1] * cbrt) * f8) / 100.0d, 0.42d), pow2};
        float f14 = fArr7[0];
        float f15 = fArr7[1];
        f1169OooOO0O = new o0000O00(o00O0O0O2, ((((400.0f * pow2) / (pow2 + 27.13f)) * 0.05f) + (((f14 * 400.0f) / (f14 + 27.13f)) * 2.0f) + ((f15 * 400.0f) / (f15 + 27.13f))) * pow, pow, pow, f10, 1.0f, fArr6, cbrt, (float) Math.pow(cbrt, 0.25d), sqrt);
    }

    public o0000O00(float f, float f2, float f3, float f4, float f5, float f6, float[] fArr, float f7, float f8, float f9) {
        this.f1175OooO0o = f;
        this.f1171OooO00o = f2;
        this.f1172OooO0O0 = f3;
        this.f1173OooO0OO = f4;
        this.f1174OooO0Oo = f5;
        this.f1176OooO0o0 = f6;
        this.f1177OooO0oO = fArr;
        this.f1178OooO0oo = f7;
        this.f1170OooO = f8;
        this.f1179OooOO0 = f9;
    }
}