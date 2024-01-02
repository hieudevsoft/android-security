package OooOo0o;

import android.graphics.Color;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00oO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f1184OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f1185OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f1186OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final float f1187OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final float f1188OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f1189OooO0o0;

    public o00oO0o(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f1184OooO00o = f;
        this.f1185OooO0O0 = f2;
        this.f1186OooO0OO = f3;
        this.f1187OooO0Oo = f4;
        this.f1189OooO0o0 = f5;
        this.f1188OooO0o = f6;
    }

    public static o00oO0o OooO00o(int i) {
        float f;
        float pow;
        o0000O00 o0000o00 = o0000O00.f1169OooOO0O;
        float o0000Oo02 = OooO00o.o0000Oo0(Color.red(i));
        float o0000Oo03 = OooO00o.o0000Oo0(Color.green(i));
        float o0000Oo04 = OooO00o.o0000Oo0(Color.blue(i));
        float[][] fArr = OooO00o.f4110OooO;
        float[] fArr2 = fArr[0];
        float f2 = (fArr2[2] * o0000Oo04) + (fArr2[1] * o0000Oo03) + (fArr2[0] * o0000Oo02);
        float[] fArr3 = fArr[1];
        float f3 = (fArr3[2] * o0000Oo04) + (fArr3[1] * o0000Oo03) + (fArr3[0] * o0000Oo02);
        float[] fArr4 = fArr[2];
        float f4 = (o0000Oo04 * fArr4[2]) + (o0000Oo03 * fArr4[1]) + (o0000Oo02 * fArr4[0]);
        float[][] fArr5 = OooO00o.f4115OooO0o;
        float[] fArr6 = fArr5[0];
        float f5 = (fArr6[2] * f4) + (fArr6[1] * f3) + (fArr6[0] * f2);
        float[] fArr7 = fArr5[1];
        float f6 = fArr7[1] * f3;
        float f7 = fArr7[2] * f4;
        float[] fArr8 = fArr5[2];
        float f8 = f2 * fArr8[0];
        float f9 = f4 * fArr8[2];
        float[] fArr9 = o0000o00.f1177OooO0oO;
        float f10 = fArr9[0] * f5;
        float f11 = fArr9[1] * (f7 + f6 + (fArr7[0] * f2));
        float f12 = fArr9[2] * (f9 + (f3 * fArr8[1]) + f8);
        float abs = Math.abs(f10);
        float f13 = o0000o00.f1178OooO0oo;
        float pow2 = (float) Math.pow((abs * f13) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f11) * f13) / 100.0d, 0.42d);
        float pow4 = (float) Math.pow((Math.abs(f12) * f13) / 100.0d, 0.42d);
        float signum = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f12) * 400.0f) * pow4) / (pow4 + 27.13f);
        double d = signum3;
        float f14 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d)) / 11.0f;
        float f15 = ((float) ((signum + signum2) - (d * 2.0d))) / 9.0f;
        float f16 = signum2 * 20.0f;
        float f17 = ((21.0f * signum3) + ((signum * 20.0f) + f16)) / 20.0f;
        float f18 = (((signum * 40.0f) + f16) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f15, f14)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f19 = atan2;
        float f20 = (3.1415927f * f19) / 180.0f;
        float f21 = f18 * o0000o00.f1172OooO0O0;
        float f22 = o0000o00.f1171OooO00o;
        double d2 = f21 / f22;
        float f23 = o0000o00.f1179OooOO0;
        float f24 = o0000o00.f1174OooO0Oo;
        float pow5 = ((float) Math.pow(d2, f23 * f24)) * 100.0f;
        Math.sqrt(pow5 / 100.0f);
        float f25 = f22 + 4.0f;
        if (f19 < 20.14d) {
            f = 360.0f + f19;
        } else {
            f = f19;
        }
        float sqrt = ((float) Math.sqrt(pow5 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, o0000o00.f1175OooO0o), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos(((f * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * o0000o00.f1176OooO0o0) * o0000o00.f1173OooO0OO) * ((float) Math.sqrt((f15 * f15) + (f14 * f14)))) / (f17 + 0.305f), 0.9d));
        Math.sqrt((pow * f24) / f25);
        float f26 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((o0000o00.f1170OooO * sqrt * 0.0228f) + 1.0f)) * 43.85965f;
        double d3 = f20;
        return new o00oO0o(f19, sqrt, pow5, f26, ((float) Math.cos(d3)) * log, log * ((float) Math.sin(d3)));
    }

    public static o00oO0o OooO0O0(float f, float f2, float f3) {
        o0000O00 o0000o00;
        double d;
        float f4 = o0000O00.f1169OooOO0O.f1174OooO0Oo;
        Math.sqrt(f / 100.0d);
        Math.sqrt(((f2 / ((float) Math.sqrt(d))) * o0000o00.f1174OooO0Oo) / (o0000o00.f1171OooO00o + 4.0f));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((o0000o00.f1170OooO * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (3.1415927f * f3) / 180.0f;
        return new o00oO0o(f3, f2, f, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int OooO0OO(o0000O00 o0000o00) {
        float f;
        float[] fArr;
        float f2 = this.f1185OooO0O0;
        int i = (f2 > 0.0d ? 1 : (f2 == 0.0d ? 0 : -1));
        float f3 = this.f1186OooO0OO;
        if (i != 0) {
            double d = f3;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, o0000o00.f1175OooO0o), 0.73d), 1.1111111111111112d);
                double d2 = (this.f1184OooO00o * 3.1415927f) / 180.0f;
                float pow2 = o0000o00.f1171OooO00o * ((float) Math.pow(f3 / 100.0d, (1.0d / o0000o00.f1174OooO0Oo) / o0000o00.f1179OooOO0));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * o0000o00.f1176OooO0o0 * o0000o00.f1173OooO0OO;
                float f4 = pow2 / o0000o00.f1172OooO0O0;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f5 = (((0.305f + f4) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f4 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (Math.abs(f9) * 27.13d) / (400.0d - Math.abs(f9)));
                float signum = Math.signum(f9);
                float f12 = 100.0f / o0000o00.f1178OooO0oo;
                float pow3 = signum * f12 * ((float) Math.pow(max, 2.380952380952381d));
                float signum2 = Math.signum(f10) * f12 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f10) * 27.13d) / (400.0d - Math.abs(f10))), 2.380952380952381d));
                float[] fArr2 = o0000o00.f1177OooO0oO;
                float f13 = pow3 / fArr2[0];
                float f14 = signum2 / fArr2[1];
                float signum3 = ((Math.signum(f11) * f12) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d))) / fArr2[2];
                float[][] fArr3 = OooO00o.f4117OooO0oO;
                float[] fArr4 = fArr3[0];
                float f15 = (fArr4[2] * signum3) + (fArr4[1] * f14) + (fArr4[0] * f13);
                float[] fArr5 = fArr3[1];
                float f16 = fArr5[1] * f14;
                float f17 = fArr5[2] * signum3;
                float f18 = f13 * fArr3[2][0];
                return OooOo.OooO00o.OooO00o(f15, f17 + f16 + (fArr5[0] * f13), (signum3 * fArr[2]) + (f14 * fArr[1]) + f18);
            }
        }
        f = 0.0f;
        float pow4 = (float) Math.pow(f / Math.pow(1.64d - Math.pow(0.29d, o0000o00.f1175OooO0o), 0.73d), 1.1111111111111112d);
        double d22 = (this.f1184OooO00o * 3.1415927f) / 180.0f;
        float pow22 = o0000o00.f1171OooO00o * ((float) Math.pow(f3 / 100.0d, (1.0d / o0000o00.f1174OooO0Oo) / o0000o00.f1179OooOO0));
        float cos3 = ((float) (Math.cos(2.0d + d22) + 3.8d)) * 0.25f * 3846.1538f * o0000o00.f1176OooO0o0 * o0000o00.f1173OooO0OO;
        float f42 = pow22 / o0000o00.f1172OooO0O0;
        float sin2 = (float) Math.sin(d22);
        float cos22 = (float) Math.cos(d22);
        float f52 = (((0.305f + f42) * 23.0f) * pow4) / (((pow4 * 108.0f) * sin2) + (((11.0f * pow4) * cos22) + (cos3 * 23.0f)));
        float f62 = cos22 * f52;
        float f72 = f52 * sin2;
        float f82 = f42 * 460.0f;
        float f92 = ((288.0f * f72) + ((451.0f * f62) + f82)) / 1403.0f;
        float f102 = ((f82 - (891.0f * f62)) - (261.0f * f72)) / 1403.0f;
        float f112 = ((f82 - (f62 * 220.0f)) - (f72 * 6300.0f)) / 1403.0f;
        float max2 = (float) Math.max(0.0d, (Math.abs(f92) * 27.13d) / (400.0d - Math.abs(f92)));
        float signum4 = Math.signum(f92);
        float f122 = 100.0f / o0000o00.f1178OooO0oo;
        float pow32 = signum4 * f122 * ((float) Math.pow(max2, 2.380952380952381d));
        float signum22 = Math.signum(f102) * f122 * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f102) * 27.13d) / (400.0d - Math.abs(f102))), 2.380952380952381d));
        float[] fArr22 = o0000o00.f1177OooO0oO;
        float f132 = pow32 / fArr22[0];
        float f142 = signum22 / fArr22[1];
        float signum32 = ((Math.signum(f112) * f122) * ((float) Math.pow((float) Math.max(0.0d, (Math.abs(f112) * 27.13d) / (400.0d - Math.abs(f112))), 2.380952380952381d))) / fArr22[2];
        float[][] fArr32 = OooO00o.f4117OooO0oO;
        float[] fArr42 = fArr32[0];
        float f152 = (fArr42[2] * signum32) + (fArr42[1] * f142) + (fArr42[0] * f132);
        float[] fArr52 = fArr32[1];
        float f162 = fArr52[1] * f142;
        float f172 = fArr52[2] * signum32;
        float f182 = f132 * fArr32[2][0];
        return OooOo.OooO00o.OooO00o(f152, f172 + f162 + (fArr52[0] * f132), (signum32 * fArr[2]) + (f142 * fArr[1]) + f182);
    }
}