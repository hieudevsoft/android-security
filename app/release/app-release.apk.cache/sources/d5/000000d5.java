package OooOo;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public char f1114OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float[] f1115OooO0O0;

    public OooOO0(char c, float[] fArr) {
        this.f1114OooO00o = c;
        this.f1115OooO0O0 = fArr;
    }

    public static void OooO00o(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * cos) + ((-f) * sin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * sin) + (f3 * cos)) / d7;
        double d14 = ((d12 * cos) + ((-f3) * sin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            OooO00o(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d);
        double atan22 = Math.atan2(d14 - d2, d13 - d) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z2 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d7;
        double d28 = d27 * cos2;
        double d29 = d9 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d9 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = d32;
        double d35 = atan22 / ceil;
        int i2 = 0;
        while (i2 < ceil) {
            double d36 = atan2 + d35;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            double d37 = d35;
            double d38 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
            double d39 = d34;
            double d40 = d25;
            double d41 = (d39 * sin4) + (d7 * sin2 * cos4) + d26;
            double d42 = (d28 * sin4) - (d29 * cos4);
            double d43 = (cos4 * d39) + (sin4 * d31);
            double d44 = d36 - atan2;
            double tan = Math.tan(d44 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * sqrt3) + d6), (float) ((d33 * sqrt3) + d11), (float) (d38 - (sqrt3 * d42)), (float) (d41 - (sqrt3 * d43)), (float) d38, (float) d41);
            i2++;
            atan2 = d36;
            d31 = d31;
            cos2 = cos2;
            ceil = ceil;
            d33 = d43;
            d7 = d7;
            d30 = d42;
            d6 = d38;
            d11 = d41;
            d25 = d40;
            d35 = d37;
            d34 = d39;
        }
    }

    public static void OooO0O0(OooOO0[] oooOO0Arr, Path path) {
        int i;
        int i2;
        char c;
        OooOO0 oooOO0;
        int i3;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        OooOO0[] oooOO0Arr2 = oooOO0Arr;
        int i4 = 6;
        float[] fArr = new float[6];
        char c2 = 'm';
        int i5 = 0;
        char c3 = 'm';
        int i6 = 0;
        while (i6 < oooOO0Arr2.length) {
            OooOO0 oooOO02 = oooOO0Arr2[i6];
            char c4 = oooOO02.f1114OooO00o;
            float f22 = fArr[i5];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c4) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = i4;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                default:
                    i = 2;
                    break;
            }
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i7 = i5;
            while (true) {
                float[] fArr2 = oooOO02.f1115OooO0O0;
                if (i7 < fArr2.length) {
                    if (c4 != 'A') {
                        if (c4 != 'C') {
                            if (c4 != 'H') {
                                if (c4 != 'Q') {
                                    if (c4 != 'V') {
                                        if (c4 != 'a') {
                                            if (c4 != 'c') {
                                                if (c4 != 'h') {
                                                    if (c4 != 'q') {
                                                        if (c4 != 'v') {
                                                            if (c4 != 'L') {
                                                                if (c4 != 'M') {
                                                                    if (c4 != 'S') {
                                                                        if (c4 != 'T') {
                                                                            if (c4 != 'l') {
                                                                                if (c4 != c2) {
                                                                                    if (c4 != 's') {
                                                                                        if (c4 == 't') {
                                                                                            if (c3 != 'q' && c3 != 't' && c3 != 'Q' && c3 != 'T') {
                                                                                                f21 = 0.0f;
                                                                                                f20 = 0.0f;
                                                                                            } else {
                                                                                                f20 = f30 - f24;
                                                                                                f21 = f31 - f25;
                                                                                            }
                                                                                            int i8 = i7 + 0;
                                                                                            int i9 = i7 + 1;
                                                                                            path.rQuadTo(f20, f21, fArr2[i8], fArr2[i9]);
                                                                                            float f32 = f20 + f30;
                                                                                            float f33 = f21 + f31;
                                                                                            f30 += fArr2[i8];
                                                                                            f31 += fArr2[i9];
                                                                                            f25 = f33;
                                                                                            f24 = f32;
                                                                                        }
                                                                                        i2 = i7;
                                                                                    } else {
                                                                                        if (c3 != 'c' && c3 != 's' && c3 != 'C' && c3 != 'S') {
                                                                                            f18 = 0.0f;
                                                                                            f19 = 0.0f;
                                                                                        } else {
                                                                                            float f34 = f30 - f24;
                                                                                            f18 = f31 - f25;
                                                                                            f19 = f34;
                                                                                        }
                                                                                        int i10 = i7 + 0;
                                                                                        int i11 = i7 + 1;
                                                                                        int i12 = i7 + 2;
                                                                                        int i13 = i7 + 3;
                                                                                        i2 = i7;
                                                                                        f3 = f31;
                                                                                        float f35 = f30;
                                                                                        path.rCubicTo(f19, f18, fArr2[i10], fArr2[i11], fArr2[i12], fArr2[i13]);
                                                                                        f4 = fArr2[i10] + f35;
                                                                                        f5 = fArr2[i11] + f3;
                                                                                        f6 = f35 + fArr2[i12];
                                                                                        f7 = fArr2[i13];
                                                                                    }
                                                                                } else {
                                                                                    i2 = i7;
                                                                                    float f36 = fArr2[i2 + 0];
                                                                                    f30 += f36;
                                                                                    float f37 = fArr2[i2 + 1];
                                                                                    f31 += f37;
                                                                                    if (i2 > 0) {
                                                                                        path.rLineTo(f36, f37);
                                                                                    } else {
                                                                                        path.rMoveTo(f36, f37);
                                                                                        f29 = f31;
                                                                                        f28 = f30;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i2 = i7;
                                                                                f10 = f31;
                                                                                int i14 = i2 + 0;
                                                                                float f38 = fArr2[i14];
                                                                                int i15 = i2 + 1;
                                                                                path.rLineTo(f38, fArr2[i15]);
                                                                                f30 += fArr2[i14];
                                                                                f11 = fArr2[i15];
                                                                            }
                                                                        } else {
                                                                            i2 = i7;
                                                                            float f39 = f31;
                                                                            float f40 = f30;
                                                                            if (c3 != 'q' && c3 != 't' && c3 != 'Q' && c3 != 'T') {
                                                                                f16 = f40;
                                                                                f17 = f39;
                                                                            } else {
                                                                                f16 = (f40 * 2.0f) - f24;
                                                                                f17 = (f39 * 2.0f) - f25;
                                                                            }
                                                                            int i16 = i2 + 0;
                                                                            int i17 = i2 + 1;
                                                                            path.quadTo(f16, f17, fArr2[i16], fArr2[i17]);
                                                                            f25 = f17;
                                                                            f24 = f16;
                                                                            c = c4;
                                                                            oooOO0 = oooOO02;
                                                                            i3 = i6;
                                                                            f30 = fArr2[i16];
                                                                            f31 = fArr2[i17];
                                                                        }
                                                                    } else {
                                                                        i2 = i7;
                                                                        float f41 = f31;
                                                                        float f42 = f30;
                                                                        if (c3 != 'c' && c3 != 's' && c3 != 'C' && c3 != 'S') {
                                                                            f15 = f42;
                                                                            f14 = f41;
                                                                        } else {
                                                                            f14 = (f41 * 2.0f) - f25;
                                                                            f15 = (f42 * 2.0f) - f24;
                                                                        }
                                                                        int i18 = i2 + 0;
                                                                        int i19 = i2 + 1;
                                                                        int i20 = i2 + 2;
                                                                        int i21 = i2 + 3;
                                                                        path.cubicTo(f15, f14, fArr2[i18], fArr2[i19], fArr2[i20], fArr2[i21]);
                                                                        float f43 = fArr2[i18];
                                                                        float f44 = fArr2[i19];
                                                                        f9 = fArr2[i20];
                                                                        f8 = fArr2[i21];
                                                                        f24 = f43;
                                                                        f25 = f44;
                                                                        f30 = f9;
                                                                        f31 = f8;
                                                                    }
                                                                } else {
                                                                    i2 = i7;
                                                                    f12 = fArr2[i2 + 0];
                                                                    f13 = fArr2[i2 + 1];
                                                                    if (i2 > 0) {
                                                                        path.lineTo(f12, f13);
                                                                    } else {
                                                                        path.moveTo(f12, f13);
                                                                        f28 = f12;
                                                                        f29 = f13;
                                                                    }
                                                                }
                                                                f30 = f28;
                                                                f31 = f29;
                                                            } else {
                                                                i2 = i7;
                                                                int i22 = i2 + 0;
                                                                int i23 = i2 + 1;
                                                                path.lineTo(fArr2[i22], fArr2[i23]);
                                                                f12 = fArr2[i22];
                                                                f13 = fArr2[i23];
                                                            }
                                                            f30 = f12;
                                                            f31 = f13;
                                                        } else {
                                                            i2 = i7;
                                                            f10 = f31;
                                                            int i24 = i2 + 0;
                                                            path.rLineTo(0.0f, fArr2[i24]);
                                                            f11 = fArr2[i24];
                                                        }
                                                        f31 = f10 + f11;
                                                    } else {
                                                        i2 = i7;
                                                        f3 = f31;
                                                        float f45 = f30;
                                                        int i25 = i2 + 0;
                                                        float f46 = fArr2[i25];
                                                        int i26 = i2 + 1;
                                                        int i27 = i2 + 2;
                                                        int i28 = i2 + 3;
                                                        path.rQuadTo(f46, fArr2[i26], fArr2[i27], fArr2[i28]);
                                                        f4 = fArr2[i25] + f45;
                                                        f5 = fArr2[i26] + f3;
                                                        float f47 = f45 + fArr2[i27];
                                                        float f48 = fArr2[i28];
                                                        f6 = f47;
                                                        f7 = f48;
                                                    }
                                                } else {
                                                    i2 = i7;
                                                    int i29 = i2 + 0;
                                                    path.rLineTo(fArr2[i29], 0.0f);
                                                    f30 += fArr2[i29];
                                                }
                                                c = c4;
                                                oooOO0 = oooOO02;
                                                i3 = i6;
                                            } else {
                                                i2 = i7;
                                                f3 = f31;
                                                float f49 = f30;
                                                int i30 = i2 + 2;
                                                int i31 = i2 + 3;
                                                int i32 = i2 + 4;
                                                int i33 = i2 + 5;
                                                path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                                f4 = fArr2[i30] + f49;
                                                f5 = fArr2[i31] + f3;
                                                f6 = f49 + fArr2[i32];
                                                f7 = fArr2[i33];
                                            }
                                            f8 = f3 + f7;
                                            f24 = f4;
                                            f25 = f5;
                                            f9 = f6;
                                            f30 = f9;
                                            f31 = f8;
                                            c = c4;
                                            oooOO0 = oooOO02;
                                            i3 = i6;
                                        } else {
                                            i2 = i7;
                                            float f50 = f31;
                                            float f51 = f30;
                                            int i34 = i2 + 5;
                                            float f52 = fArr2[i34] + f51;
                                            int i35 = i2 + 6;
                                            float f53 = fArr2[i35] + f50;
                                            float f54 = fArr2[i2 + 0];
                                            float f55 = fArr2[i2 + 1];
                                            float f56 = fArr2[i2 + 2];
                                            if (fArr2[i2 + 3] != 0.0f) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (fArr2[i2 + 4] != 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c = c4;
                                            oooOO0 = oooOO02;
                                            i3 = i6;
                                            OooO00o(path, f51, f50, f52, f53, f54, f55, f56, z3, z4);
                                            f30 = f51 + fArr2[i34];
                                            f31 = f50 + fArr2[i35];
                                        }
                                    } else {
                                        i2 = i7;
                                        c = c4;
                                        oooOO0 = oooOO02;
                                        i3 = i6;
                                        int i36 = i2 + 0;
                                        path.lineTo(f30, fArr2[i36]);
                                        f31 = fArr2[i36];
                                    }
                                } else {
                                    i2 = i7;
                                    c = c4;
                                    oooOO0 = oooOO02;
                                    i3 = i6;
                                    int i37 = i2 + 0;
                                    int i38 = i2 + 1;
                                    int i39 = i2 + 2;
                                    int i40 = i2 + 3;
                                    path.quadTo(fArr2[i37], fArr2[i38], fArr2[i39], fArr2[i40]);
                                    f = fArr2[i37];
                                    f2 = fArr2[i38];
                                    f30 = fArr2[i39];
                                    f31 = fArr2[i40];
                                }
                            } else {
                                i2 = i7;
                                c = c4;
                                oooOO0 = oooOO02;
                                i3 = i6;
                                int i41 = i2 + 0;
                                path.lineTo(fArr2[i41], f31);
                                f30 = fArr2[i41];
                            }
                            i7 = i2 + i;
                            oooOO02 = oooOO0;
                            c3 = c;
                            c4 = c3;
                            i6 = i3;
                            c2 = 'm';
                            i5 = 0;
                        } else {
                            i2 = i7;
                            c = c4;
                            oooOO0 = oooOO02;
                            i3 = i6;
                            int i42 = i2 + 2;
                            int i43 = i2 + 3;
                            int i44 = i2 + 4;
                            int i45 = i2 + 5;
                            path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i42], fArr2[i43], fArr2[i44], fArr2[i45]);
                            float f57 = fArr2[i44];
                            float f58 = fArr2[i45];
                            f = fArr2[i42];
                            f30 = f57;
                            f31 = f58;
                            f2 = fArr2[i43];
                        }
                        f24 = f;
                        f25 = f2;
                        i7 = i2 + i;
                        oooOO02 = oooOO0;
                        c3 = c;
                        c4 = c3;
                        i6 = i3;
                        c2 = 'm';
                        i5 = 0;
                    } else {
                        i2 = i7;
                        float f59 = f31;
                        float f60 = f30;
                        c = c4;
                        oooOO0 = oooOO02;
                        i3 = i6;
                        int i46 = i2 + 5;
                        float f61 = fArr2[i46];
                        int i47 = i2 + 6;
                        float f62 = fArr2[i47];
                        float f63 = fArr2[i2 + 0];
                        float f64 = fArr2[i2 + 1];
                        float f65 = fArr2[i2 + 2];
                        if (fArr2[i2 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        OooO00o(path, f60, f59, f61, f62, f63, f64, f65, z, z2);
                        f30 = fArr2[i46];
                        f31 = fArr2[i47];
                    }
                    f25 = f31;
                    f24 = f30;
                    i7 = i2 + i;
                    oooOO02 = oooOO0;
                    c3 = c;
                    c4 = c3;
                    i6 = i3;
                    c2 = 'm';
                    i5 = 0;
                }
            }
            int i48 = i6;
            int i49 = i5;
            fArr[i49] = f30;
            fArr[1] = f31;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f28;
            fArr[5] = f29;
            i6 = i48 + 1;
            i4 = 6;
            c2 = 'm';
            i5 = i49;
            c3 = oooOO0Arr[i48].f1114OooO00o;
            oooOO0Arr2 = oooOO0Arr;
        }
    }

    public OooOO0(OooOO0 oooOO0) {
        this.f1114OooO00o = oooOO0.f1114OooO00o;
        float[] fArr = oooOO0.f1115OooO0O0;
        this.f1115OooO0O0 = o0000O00.OooO00o.OoooO0(fArr, fArr.length);
    }
}