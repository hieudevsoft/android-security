package Ooooo00;

import OooOO0.OooO0O0;
import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class Oooo0 extends o000oOoO {

    /* renamed from: OooO  reason: collision with root package name */
    public float f1712OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Matrix f1713OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f1714OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f1715OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f1716OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f1717OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f1718OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float f1719OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public float f1720OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Matrix f1721OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final int f1722OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public String f1723OooOO0o;

    public Oooo0() {
        this.f1713OooO00o = new Matrix();
        this.f1714OooO0O0 = new ArrayList();
        this.f1715OooO0OO = 0.0f;
        this.f1716OooO0Oo = 0.0f;
        this.f1718OooO0o0 = 0.0f;
        this.f1717OooO0o = 1.0f;
        this.f1719OooO0oO = 1.0f;
        this.f1720OooO0oo = 0.0f;
        this.f1712OooO = 0.0f;
        this.f1721OooOO0 = new Matrix();
        this.f1723OooOO0o = null;
    }

    @Override // Ooooo00.o000oOoO
    public final boolean OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f1714OooO0O0;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((o000oOoO) arrayList.get(i)).OooO00o()) {
                return true;
            }
            i++;
        }
    }

    @Override // Ooooo00.o000oOoO
    public final boolean OooO0O0(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f1714OooO0O0;
            if (i >= arrayList.size()) {
                return z;
            }
            z |= ((o000oOoO) arrayList.get(i)).OooO0O0(iArr);
            i++;
        }
    }

    public final void OooO0OO() {
        Matrix matrix = this.f1721OooOO0;
        matrix.reset();
        matrix.postTranslate(-this.f1716OooO0Oo, -this.f1718OooO0o0);
        matrix.postScale(this.f1717OooO0o, this.f1719OooO0oO);
        matrix.postRotate(this.f1715OooO0OO, 0.0f, 0.0f);
        matrix.postTranslate(this.f1720OooO0oo + this.f1716OooO0Oo, this.f1712OooO + this.f1718OooO0o0);
    }

    public String getGroupName() {
        return this.f1723OooOO0o;
    }

    public Matrix getLocalMatrix() {
        return this.f1721OooOO0;
    }

    public float getPivotX() {
        return this.f1716OooO0Oo;
    }

    public float getPivotY() {
        return this.f1718OooO0o0;
    }

    public float getRotation() {
        return this.f1715OooO0OO;
    }

    public float getScaleX() {
        return this.f1717OooO0o;
    }

    public float getScaleY() {
        return this.f1719OooO0oO;
    }

    public float getTranslateX() {
        return this.f1720OooO0oo;
    }

    public float getTranslateY() {
        return this.f1712OooO;
    }

    public void setPivotX(float f) {
        if (f != this.f1716OooO0Oo) {
            this.f1716OooO0Oo = f;
            OooO0OO();
        }
    }

    public void setPivotY(float f) {
        if (f != this.f1718OooO0o0) {
            this.f1718OooO0o0 = f;
            OooO0OO();
        }
    }

    public void setRotation(float f) {
        if (f != this.f1715OooO0OO) {
            this.f1715OooO0OO = f;
            OooO0OO();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f1717OooO0o) {
            this.f1717OooO0o = f;
            OooO0OO();
        }
    }

    public void setScaleY(float f) {
        if (f != this.f1719OooO0oO) {
            this.f1719OooO0oO = f;
            OooO0OO();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.f1720OooO0oo) {
            this.f1720OooO0oo = f;
            OooO0OO();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.f1712OooO) {
            this.f1712OooO = f;
            OooO0OO();
        }
    }

    public Oooo0(Oooo0 oooo0, OooO0O0 oooO0O0) {
        o0OoOo0 oooOo;
        this.f1713OooO00o = new Matrix();
        this.f1714OooO0O0 = new ArrayList();
        this.f1715OooO0OO = 0.0f;
        this.f1716OooO0Oo = 0.0f;
        this.f1718OooO0o0 = 0.0f;
        this.f1717OooO0o = 1.0f;
        this.f1719OooO0oO = 1.0f;
        this.f1720OooO0oo = 0.0f;
        this.f1712OooO = 0.0f;
        Matrix matrix = new Matrix();
        this.f1721OooOO0 = matrix;
        this.f1723OooOO0o = null;
        this.f1715OooO0OO = oooo0.f1715OooO0OO;
        this.f1716OooO0Oo = oooo0.f1716OooO0Oo;
        this.f1718OooO0o0 = oooo0.f1718OooO0o0;
        this.f1717OooO0o = oooo0.f1717OooO0o;
        this.f1719OooO0oO = oooo0.f1719OooO0oO;
        this.f1720OooO0oo = oooo0.f1720OooO0oo;
        this.f1712OooO = oooo0.f1712OooO;
        String str = oooo0.f1723OooOO0o;
        this.f1723OooOO0o = str;
        this.f1722OooOO0O = oooo0.f1722OooOO0O;
        if (str != null) {
            oooO0O0.put(str, this);
        }
        matrix.set(oooo0.f1721OooOO0);
        ArrayList arrayList = oooo0.f1714OooO0O0;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof Oooo0) {
                this.f1714OooO0O0.add(new Oooo0((Oooo0) obj, oooO0O0));
            } else {
                if (obj instanceof Oooo000) {
                    oooOo = new Oooo000((Oooo000) obj);
                } else if (!(obj instanceof OooOo)) {
                    throw new IllegalStateException("Unknown object in the tree!");
                } else {
                    oooOo = new OooOo((OooOo) obj);
                }
                this.f1714OooO0O0.add(oooOo);
                Object obj2 = oooOo.f1763OooO0O0;
                if (obj2 != null) {
                    oooO0O0.put(obj2, oooOo);
                }
            }
        }
    }
}