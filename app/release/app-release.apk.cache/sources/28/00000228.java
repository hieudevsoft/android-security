package Ooooo00;

import OooOO0.OooO0O0;
import OooOo.OooOO0;
import OooOo0o.o0OOO0o;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00O0O {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static final Matrix f1734OooOOOo = new Matrix();

    /* renamed from: OooO  reason: collision with root package name */
    public float f1735OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Path f1736OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Path f1737OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Matrix f1738OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Paint f1739OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public PathMeasure f1740OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Paint f1741OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Oooo0 f1742OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public float f1743OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public float f1744OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public float f1745OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f1746OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public Boolean f1747OooOOO;
    public String OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public final OooO0O0 f1748OooOOOO;

    public o00O0O() {
        this.f1738OooO0OO = new Matrix();
        this.f1743OooO0oo = 0.0f;
        this.f1735OooO = 0.0f;
        this.f1744OooOO0 = 0.0f;
        this.f1745OooOO0O = 0.0f;
        this.f1746OooOO0o = 255;
        this.OooOOO0 = null;
        this.f1747OooOOO = null;
        this.f1748OooOOOO = new OooO0O0();
        this.f1742OooO0oO = new Oooo0();
        this.f1736OooO00o = new Path();
        this.f1737OooO0O0 = new Path();
    }

    public final void OooO00o(Oooo0 oooo0, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Path.FillType fillType;
        Path.FillType fillType2;
        oooo0.f1713OooO00o.set(matrix);
        Matrix matrix2 = oooo0.f1713OooO00o;
        matrix2.preConcat(oooo0.f1721OooOO0);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = oooo0.f1714OooO0O0;
            if (i4 < arrayList.size()) {
                o000oOoO o000oooo = (o000oOoO) arrayList.get(i4);
                if (o000oooo instanceof Oooo0) {
                    OooO00o((Oooo0) o000oooo, matrix2, canvas, i, i2);
                } else if (o000oooo instanceof o0OoOo0) {
                    o0OoOo0 o0oooo0 = (o0OoOo0) o000oooo;
                    float f3 = i / this.f1744OooOO0;
                    float f4 = i2 / this.f1745OooOO0O;
                    float min = Math.min(f3, f4);
                    Matrix matrix3 = this.f1738OooO0OO;
                    matrix3.set(matrix2);
                    matrix3.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    i3 = i4;
                    float hypot = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), hypot);
                    if (max > 0.0f) {
                        f = Math.abs(f5) / max;
                    } else {
                        f = 0.0f;
                    }
                    if (f != 0.0f) {
                        o0oooo0.getClass();
                        Path path = this.f1736OooO00o;
                        path.reset();
                        OooOO0[] oooOO0Arr = o0oooo0.f1762OooO00o;
                        if (oooOO0Arr != null) {
                            OooOO0.OooO0O0(oooOO0Arr, path);
                        }
                        Path path2 = this.f1737OooO0O0;
                        path2.reset();
                        if (o0oooo0 instanceof OooOo) {
                            if (o0oooo0.f1764OooO0OO == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            Oooo000 oooo000 = (Oooo000) o0oooo0;
                            float f6 = oooo000.f1729OooOO0;
                            if (f6 != 0.0f || oooo000.f1730OooOO0O != 1.0f) {
                                float f7 = oooo000.f1731OooOO0o;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (oooo000.f1730OooOO0O + f7) % 1.0f;
                                if (this.f1740OooO0o == null) {
                                    this.f1740OooO0o = new PathMeasure();
                                }
                                this.f1740OooO0o.setPath(path, false);
                                float length = this.f1740OooO0o.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f1740OooO0o.getSegment(f10, length, path, true);
                                    f2 = 0.0f;
                                    this.f1740OooO0o.getSegment(0.0f, f11, path, true);
                                } else {
                                    f2 = 0.0f;
                                    this.f1740OooO0o.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f2, f2);
                            }
                            path2.addPath(path, matrix3);
                            o0OOO0o o0ooo0o = oooo000.f1727OooO0oO;
                            if (o0ooo0o.f1196OooO00o != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && o0ooo0o.f1198OooO0OO == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (this.f1741OooO0o0 == null) {
                                    Paint paint = new Paint(1);
                                    this.f1741OooO0o0 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.f1741OooO0o0;
                                Shader shader = o0ooo0o.f1196OooO00o;
                                if (shader != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(oooo000.f1724OooO * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = o0ooo0o.f1198OooO0OO;
                                    float f12 = oooo000.f1724OooO;
                                    PorterDuff.Mode mode = oo000o.f1766OooOO0;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (oooo000.f1764OooO0OO == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            o0OOO0o o0ooo0o2 = oooo000.f1726OooO0o0;
                            if (o0ooo0o2.f1196OooO00o != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3 && o0ooo0o2.f1198OooO0OO == 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (this.f1739OooO0Oo == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.f1739OooO0Oo = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.f1739OooO0Oo;
                                Paint.Join join = oooo000.f1732OooOOO;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = oooo000.OooOOO0;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(oooo000.f1733OooOOOO);
                                Shader shader2 = o0ooo0o2.f1196OooO00o;
                                if (shader2 == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(oooo000.f1728OooO0oo * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = o0ooo0o2.f1198OooO0OO;
                                    float f13 = oooo000.f1728OooO0oo;
                                    PorterDuff.Mode mode2 = oo000o.f1766OooOO0;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(oooo000.f1725OooO0o * f * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i4 = i3 + 1;
                    c = 0;
                }
                i3 = i4;
                i4 = i3 + 1;
                c = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f1746OooOO0o;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f1746OooOO0o = i;
    }

    public o00O0O(o00O0O o00o0o) {
        this.f1738OooO0OO = new Matrix();
        this.f1743OooO0oo = 0.0f;
        this.f1735OooO = 0.0f;
        this.f1744OooOO0 = 0.0f;
        this.f1745OooOO0O = 0.0f;
        this.f1746OooOO0o = 255;
        this.OooOOO0 = null;
        this.f1747OooOOO = null;
        OooO0O0 oooO0O0 = new OooO0O0();
        this.f1748OooOOOO = oooO0O0;
        this.f1742OooO0oO = new Oooo0(o00o0o.f1742OooO0oO, oooO0O0);
        this.f1736OooO00o = new Path(o00o0o.f1736OooO00o);
        this.f1737OooO0O0 = new Path(o00o0o.f1737OooO0O0);
        this.f1743OooO0oo = o00o0o.f1743OooO0oo;
        this.f1735OooO = o00o0o.f1735OooO;
        this.f1744OooOO0 = o00o0o.f1744OooOO0;
        this.f1745OooOO0O = o00o0o.f1745OooOO0O;
        this.f1746OooOO0o = o00o0o.f1746OooOO0o;
        this.OooOOO0 = o00o0o.OooOOO0;
        String str = o00o0o.OooOOO0;
        if (str != null) {
            oooO0O0.put(str, this);
        }
        this.f1747OooOOO = o00o0o.f1747OooOOO;
    }
}