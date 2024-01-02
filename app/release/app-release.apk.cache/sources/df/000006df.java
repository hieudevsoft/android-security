package o0ooOO0;

import OooO0O0.OooO0O0;
import OooO0Oo.o0000OO0;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes.dex */
public final class o0OoOo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0Oo0oo[] f5559OooO00o = new o0Oo0oo[4];

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Matrix[] f5560OooO0O0 = new Matrix[4];

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Matrix[] f5561OooO0OO = new Matrix[4];

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final PointF f5562OooO0Oo = new PointF();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Path f5564OooO0o0 = new Path();

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Path f5563OooO0o = new Path();

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o0Oo0oo f5565OooO0oO = new o0Oo0oo();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final float[] f5566OooO0oo = new float[2];

    /* renamed from: OooO  reason: collision with root package name */
    public final float[] f5558OooO = new float[2];

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Path f5567OooOO0 = new Path();

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Path f5568OooOO0O = new Path();

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final boolean f5569OooOO0o = true;

    public o0OoOo0() {
        for (int i = 0; i < 4; i++) {
            this.f5559OooO00o[i] = new o0Oo0oo();
            this.f5560OooO0O0[i] = new Matrix();
            this.f5561OooO0OO[i] = new Matrix();
        }
    }

    public final void OooO00o(Oooo0 oooo0, float f, RectF rectF, o0000OO0 o0000oo02, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        o0Oo0oo[] o0oo0ooArr;
        float centerX;
        float f2;
        OooOOO0 oooOOO0;
        char c;
        OooOO0 oooOO0;
        OooO0O0 oooO0O0;
        float f3;
        float f4;
        float f5;
        float f6;
        o0OoOo0 o0oooo0 = this;
        RectF rectF2 = rectF;
        o0000OO0 o0000oo03 = o0000oo02;
        Path path2 = path;
        path.rewind();
        Path path3 = o0oooo0.f5564OooO0o0;
        path3.rewind();
        Path path4 = o0oooo0.f5563OooO0o;
        path4.rewind();
        path4.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = o0oooo0.f5561OooO0OO;
            fArr = o0oooo0.f5566OooO0oo;
            matrixArr2 = o0oooo0.f5560OooO0O0;
            o0oo0ooArr = o0oooo0.f5559OooO00o;
            if (i2 >= 4) {
                break;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        oooOO0 = oooo0.f5520OooO0o;
                    } else {
                        oooOO0 = oooo0.f5521OooO0o0;
                    }
                } else {
                    oooOO0 = oooo0.f5523OooO0oo;
                }
            } else {
                oooOO0 = oooo0.f5522OooO0oO;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        oooO0O0 = oooo0.f5517OooO0O0;
                    } else {
                        oooO0O0 = oooo0.f5516OooO00o;
                    }
                } else {
                    oooO0O0 = oooo0.f5519OooO0Oo;
                }
            } else {
                oooO0O0 = oooo0.f5518OooO0OO;
            }
            o0Oo0oo o0oo0oo = o0oo0ooArr[i2];
            oooO0O0.getClass();
            oooO0O0.OooO0oo(f, oooOO0.OooO00o(rectF2), o0oo0oo);
            int i3 = i2 + 1;
            float f7 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = o0oooo0.f5562OooO0Oo;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        f6 = rectF2.right;
                    } else {
                        f6 = rectF2.left;
                    }
                    f4 = f6;
                    f5 = rectF2.top;
                    pointF.set(f4, f5);
                    matrixArr2[i2].setTranslate(pointF.x, pointF.y);
                    matrixArr2[i2].preRotate(f7);
                    o0Oo0oo o0oo0oo2 = o0oo0ooArr[i2];
                    fArr[0] = o0oo0oo2.f5552OooO0OO;
                    fArr[1] = o0oo0oo2.f5553OooO0Oo;
                    matrixArr2[i2].mapPoints(fArr);
                    matrixArr[i2].reset();
                    matrixArr[i2].setTranslate(fArr[0], fArr[1]);
                    matrixArr[i2].preRotate(f7);
                    rectF2 = rectF;
                    i2 = i3;
                } else {
                    f3 = rectF2.left;
                }
            } else {
                f3 = rectF2.right;
            }
            f4 = f3;
            f5 = rectF2.bottom;
            pointF.set(f4, f5);
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f7);
            o0Oo0oo o0oo0oo22 = o0oo0ooArr[i2];
            fArr[0] = o0oo0oo22.f5552OooO0OO;
            fArr[1] = o0oo0oo22.f5553OooO0Oo;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f7);
            rectF2 = rectF;
            i2 = i3;
        }
        char c2 = 1;
        char c3 = 0;
        int i4 = 0;
        while (i4 < i) {
            o0Oo0oo o0oo0oo3 = o0oo0ooArr[i4];
            fArr[c3] = o0oo0oo3.f5550OooO00o;
            fArr[c2] = o0oo0oo3.f5551OooO0O0;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path2.moveTo(fArr[c3], fArr[c2]);
            } else {
                path2.lineTo(fArr[c3], fArr[c2]);
            }
            o0oo0ooArr[i4].OooO0O0(matrixArr2[i4], path2);
            if (o0000oo03 != null) {
                o0Oo0oo o0oo0oo4 = o0oo0ooArr[i4];
                Matrix matrix = matrixArr2[i4];
                OooOOOO oooOOOO = (OooOOOO) o0000oo03.f183OooO0O0;
                BitSet bitSet = oooOOOO.f5497OooO0Oo;
                o0oo0oo4.getClass();
                bitSet.set(i4, false);
                o0oo0oo4.OooO00o(o0oo0oo4.f5554OooO0o);
                oooOOOO.f5495OooO0O0[i4] = new o00O0O(new ArrayList(o0oo0oo4.f5557OooO0oo), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            o0Oo0oo o0oo0oo5 = o0oo0ooArr[i4];
            fArr[0] = o0oo0oo5.f5552OooO0OO;
            fArr[1] = o0oo0oo5.f5553OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            o0Oo0oo o0oo0oo6 = o0oo0ooArr[i6];
            float f8 = o0oo0oo6.f5550OooO00o;
            float[] fArr2 = o0oooo0.f5558OooO;
            fArr2[0] = f8;
            fArr2[1] = o0oo0oo6.f5551OooO0O0;
            matrixArr2[i6].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            o0Oo0oo o0oo0oo7 = o0oo0ooArr[i4];
            fArr[0] = o0oo0oo7.f5552OooO0OO;
            fArr[1] = o0oo0oo7.f5553OooO0Oo;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                centerX = rectF.centerY();
                f2 = fArr[1];
            } else {
                centerX = rectF.centerX();
                f2 = fArr[0];
            }
            Math.abs(centerX - f2);
            o0Oo0oo o0oo0oo8 = o0oooo0.f5565OooO0oO;
            o0oo0oo8.OooO0Oo(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        oooOOO0 = oooo0.f5524OooOO0;
                    } else {
                        oooOOO0 = oooo0.f5515OooO;
                    }
                } else {
                    oooOOO0 = oooo0.f5526OooOO0o;
                }
            } else {
                oooOOO0 = oooo0.f5525OooOO0O;
            }
            oooOOO0.getClass();
            o0oo0oo8.OooO0OO(max, 0.0f);
            Path path5 = o0oooo0.f5567OooOO0;
            path5.reset();
            o0oo0oo8.OooO0O0(matrixArr[i4], path5);
            if (o0oooo0.f5569OooOO0o && (o0oooo0.OooO0O0(path5, i4) || o0oooo0.OooO0O0(path5, i6))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr[0] = o0oo0oo8.f5550OooO00o;
                fArr[1] = o0oo0oo8.f5551OooO0O0;
                matrixArr[i4].mapPoints(fArr);
                path3.moveTo(fArr[0], fArr[1]);
                o0oo0oo8.OooO0O0(matrixArr[i4], path3);
                o0000oo03 = o0000oo02;
                path2 = path;
            } else {
                path2 = path;
                o0oo0oo8.OooO0O0(matrixArr[i4], path2);
                o0000oo03 = o0000oo02;
            }
            if (o0000oo03 != null) {
                Matrix matrix2 = matrixArr[i4];
                OooOOOO oooOOOO2 = (OooOOOO) o0000oo03.f183OooO0O0;
                c = 0;
                oooOOOO2.f5497OooO0Oo.set(i4 + 4, false);
                o0oo0oo8.OooO00o(o0oo0oo8.f5554OooO0o);
                oooOOOO2.f5496OooO0OO[i4] = new o00O0O(new ArrayList(o0oo0oo8.f5557OooO0oo), new Matrix(matrix2));
            } else {
                c = 0;
            }
            i4 = i5;
            c3 = c;
            c2 = 1;
            i = 4;
            o0oooo0 = this;
        }
        path.close();
        path3.close();
        if (!path3.isEmpty()) {
            path2.op(path3, Path.Op.UNION);
        }
    }

    public final boolean OooO0O0(Path path, int i) {
        Path path2 = this.f5568OooOO0O;
        path2.reset();
        this.f5559OooO00o[i].OooO0O0(this.f5560OooO0O0[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}