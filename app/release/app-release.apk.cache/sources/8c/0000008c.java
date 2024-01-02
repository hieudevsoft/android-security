package OooOO0o;

import OooO0O0.OooO00o;
import OooO0o.OooOOO0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOOO implements OooOOOO {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOo00 f569OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOOO0 f570OooO0OO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f568OooO00o = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f571OooO0Oo = 8;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int[] f573OooO0o0 = new int[8];

    /* renamed from: OooO0o  reason: collision with root package name */
    public int[] f572OooO0o = new int[8];

    /* renamed from: OooO0oO  reason: collision with root package name */
    public float[] f574OooO0oO = new float[8];

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f575OooO0oo = -1;

    /* renamed from: OooO  reason: collision with root package name */
    public int f567OooO = -1;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f576OooOO0 = false;

    public OooOOO(OooOo00 oooOo00, OooOOO0 oooOOO0) {
        this.f569OooO0O0 = oooOo00;
        this.f570OooO0OO = oooOOO0;
    }

    @Override // OooOO0o.OooOOOO
    public final float OooO(OooOo00 oooOo00, boolean z) {
        float OooO0oo2 = OooO0oo(oooOo00.f593OooO00o);
        OooO0Oo(oooOo00.f593OooO00o, z);
        OooOOOO oooOOOO = oooOo00.f596OooO0Oo;
        int OooOO0O2 = oooOOOO.OooOO0O();
        for (int i = 0; i < OooOO0O2; i++) {
            o00O0O OooO0O02 = oooOOOO.OooO0O0(i);
            OooO0o(OooO0O02, oooOOOO.OooO0oo(OooO0O02) * OooO0oo2, z);
        }
        return OooO0oo2;
    }

    @Override // OooOO0o.OooOOOO
    public final float OooO00o(int i) {
        int i2 = this.f575OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f568OooO00o; i3++) {
            if (i3 == i) {
                return this.f574OooO0oO[i2];
            }
            i2 = this.f572OooO0o[i2];
        }
        return 0.0f;
    }

    @Override // OooOO0o.OooOOOO
    public final o00O0O OooO0O0(int i) {
        int i2 = this.f575OooO0oo;
        for (int i3 = 0; i2 != -1 && i3 < this.f568OooO00o; i3++) {
            if (i3 == i) {
                return ((o00O0O[]) this.f570OooO0OO.f272OooO0Oo)[this.f573OooO0o0[i2]];
            }
            i2 = this.f572OooO0o[i2];
        }
        return null;
    }

    @Override // OooOO0o.OooOOOO
    public final boolean OooO0OO(o00O0O o00o0o) {
        int i = this.f575OooO0oo;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            if (this.f573OooO0o0[i] == o00o0o.f609OooO0O0) {
                return true;
            }
            i = this.f572OooO0o[i];
        }
        return false;
    }

    @Override // OooOO0o.OooOOOO
    public final float OooO0Oo(o00O0O o00o0o, boolean z) {
        int i = this.f575OooO0oo;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f568OooO00o) {
            if (this.f573OooO0o0[i] == o00o0o.f609OooO0O0) {
                if (i == this.f575OooO0oo) {
                    this.f575OooO0oo = this.f572OooO0o[i];
                } else {
                    int[] iArr = this.f572OooO0o;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    o00o0o.OooO0O0(this.f569OooO0O0);
                }
                o00o0o.f617OooOO0O--;
                this.f568OooO00o--;
                this.f573OooO0o0[i] = -1;
                if (this.f576OooOO0) {
                    this.f567OooO = i;
                }
                return this.f574OooO0oO[i];
            }
            i2++;
            i3 = i;
            i = this.f572OooO0o[i];
        }
        return 0.0f;
    }

    @Override // OooOO0o.OooOOOO
    public final void OooO0o(o00O0O o00o0o, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.f575OooO0oo;
            OooOo00 oooOo00 = this.f569OooO0O0;
            if (i == -1) {
                this.f575OooO0oo = 0;
                this.f574OooO0oO[0] = f;
                this.f573OooO0o0[0] = o00o0o.f609OooO0O0;
                this.f572OooO0o[0] = -1;
                o00o0o.f617OooOO0O++;
                o00o0o.OooO00o(oooOo00);
                this.f568OooO00o++;
                if (this.f576OooOO0) {
                    return;
                }
                int i2 = this.f567OooO + 1;
                this.f567OooO = i2;
                int[] iArr = this.f573OooO0o0;
                if (i2 >= iArr.length) {
                    this.f576OooOO0 = true;
                    this.f567OooO = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f568OooO00o; i4++) {
                int i5 = this.f573OooO0o0[i];
                int i6 = o00o0o.f609OooO0O0;
                if (i5 == i6) {
                    float[] fArr = this.f574OooO0oO;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.f575OooO0oo) {
                            this.f575OooO0oo = this.f572OooO0o[i];
                        } else {
                            int[] iArr2 = this.f572OooO0o;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            o00o0o.OooO0O0(oooOo00);
                        }
                        if (this.f576OooOO0) {
                            this.f567OooO = i;
                        }
                        o00o0o.f617OooOO0O--;
                        this.f568OooO00o--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f572OooO0o[i];
            }
            int i7 = this.f567OooO;
            int i8 = i7 + 1;
            if (this.f576OooOO0) {
                int[] iArr3 = this.f573OooO0o0;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f573OooO0o0;
            if (i7 >= iArr4.length && this.f568OooO00o < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f573OooO0o0;
                    if (i9 >= iArr5.length) {
                        break;
                    } else if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr6 = this.f573OooO0o0;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f571OooO0Oo * 2;
                this.f571OooO0Oo = i10;
                this.f576OooOO0 = false;
                this.f567OooO = i7 - 1;
                this.f574OooO0oO = Arrays.copyOf(this.f574OooO0oO, i10);
                this.f573OooO0o0 = Arrays.copyOf(this.f573OooO0o0, this.f571OooO0Oo);
                this.f572OooO0o = Arrays.copyOf(this.f572OooO0o, this.f571OooO0Oo);
            }
            this.f573OooO0o0[i7] = o00o0o.f609OooO0O0;
            this.f574OooO0oO[i7] = f;
            int[] iArr7 = this.f572OooO0o;
            if (i3 != -1) {
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                iArr7[i7] = this.f575OooO0oo;
                this.f575OooO0oo = i7;
            }
            o00o0o.f617OooOO0O++;
            o00o0o.OooO00o(oooOo00);
            this.f568OooO00o++;
            if (!this.f576OooOO0) {
                this.f567OooO++;
            }
            int i11 = this.f567OooO;
            int[] iArr8 = this.f573OooO0o0;
            if (i11 >= iArr8.length) {
                this.f576OooOO0 = true;
                this.f567OooO = iArr8.length - 1;
            }
        }
    }

    @Override // OooOO0o.OooOOOO
    public final void OooO0o0(o00O0O o00o0o, float f) {
        if (f == 0.0f) {
            OooO0Oo(o00o0o, true);
            return;
        }
        int i = this.f575OooO0oo;
        OooOo00 oooOo00 = this.f569OooO0O0;
        if (i == -1) {
            this.f575OooO0oo = 0;
            this.f574OooO0oO[0] = f;
            this.f573OooO0o0[0] = o00o0o.f609OooO0O0;
            this.f572OooO0o[0] = -1;
            o00o0o.f617OooOO0O++;
            o00o0o.OooO00o(oooOo00);
            this.f568OooO00o++;
            if (this.f576OooOO0) {
                return;
            }
            int i2 = this.f567OooO + 1;
            this.f567OooO = i2;
            int[] iArr = this.f573OooO0o0;
            if (i2 >= iArr.length) {
                this.f576OooOO0 = true;
                this.f567OooO = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f568OooO00o; i4++) {
            int i5 = this.f573OooO0o0[i];
            int i6 = o00o0o.f609OooO0O0;
            if (i5 == i6) {
                this.f574OooO0oO[i] = f;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f572OooO0o[i];
        }
        int i7 = this.f567OooO;
        int i8 = i7 + 1;
        if (this.f576OooOO0) {
            int[] iArr2 = this.f573OooO0o0;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f573OooO0o0;
        if (i7 >= iArr3.length && this.f568OooO00o < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f573OooO0o0;
                if (i9 >= iArr4.length) {
                    break;
                } else if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr5 = this.f573OooO0o0;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f571OooO0Oo * 2;
            this.f571OooO0Oo = i10;
            this.f576OooOO0 = false;
            this.f567OooO = i7 - 1;
            this.f574OooO0oO = Arrays.copyOf(this.f574OooO0oO, i10);
            this.f573OooO0o0 = Arrays.copyOf(this.f573OooO0o0, this.f571OooO0Oo);
            this.f572OooO0o = Arrays.copyOf(this.f572OooO0o, this.f571OooO0Oo);
        }
        this.f573OooO0o0[i7] = o00o0o.f609OooO0O0;
        this.f574OooO0oO[i7] = f;
        int[] iArr6 = this.f572OooO0o;
        if (i3 != -1) {
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            iArr6[i7] = this.f575OooO0oo;
            this.f575OooO0oo = i7;
        }
        o00o0o.f617OooOO0O++;
        o00o0o.OooO00o(oooOo00);
        int i11 = this.f568OooO00o + 1;
        this.f568OooO00o = i11;
        if (!this.f576OooOO0) {
            this.f567OooO++;
        }
        int[] iArr7 = this.f573OooO0o0;
        if (i11 >= iArr7.length) {
            this.f576OooOO0 = true;
        }
        if (this.f567OooO >= iArr7.length) {
            this.f576OooOO0 = true;
            this.f567OooO = iArr7.length - 1;
        }
    }

    @Override // OooOO0o.OooOOOO
    public final void OooO0oO(float f) {
        int i = this.f575OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            float[] fArr = this.f574OooO0oO;
            fArr[i] = fArr[i] / f;
            i = this.f572OooO0o[i];
        }
    }

    @Override // OooOO0o.OooOOOO
    public final float OooO0oo(o00O0O o00o0o) {
        int i = this.f575OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            if (this.f573OooO0o0[i] == o00o0o.f609OooO0O0) {
                return this.f574OooO0oO[i];
            }
            i = this.f572OooO0o[i];
        }
        return 0.0f;
    }

    @Override // OooOO0o.OooOOOO
    public final void OooOO0() {
        int i = this.f575OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            float[] fArr = this.f574OooO0oO;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f572OooO0o[i];
        }
    }

    @Override // OooOO0o.OooOOOO
    public final int OooOO0O() {
        return this.f568OooO00o;
    }

    @Override // OooOO0o.OooOOOO
    public final void clear() {
        int i = this.f575OooO0oo;
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            o00O0O o00o0o = ((o00O0O[]) this.f570OooO0OO.f272OooO0Oo)[this.f573OooO0o0[i]];
            if (o00o0o != null) {
                o00o0o.OooO0O0(this.f569OooO0O0);
            }
            i = this.f572OooO0o[i];
        }
        this.f575OooO0oo = -1;
        this.f567OooO = -1;
        this.f576OooOO0 = false;
        this.f568OooO00o = 0;
    }

    public final String toString() {
        int i = this.f575OooO0oo;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f568OooO00o; i2++) {
            str = (OooO00o.OooO0OO(str, " -> ") + this.f574OooO0oO[i] + " : ") + ((o00O0O[]) this.f570OooO0OO.f272OooO0Oo)[this.f573OooO0o0[i]];
            i = this.f572OooO0o[i];
        }
        return str;
    }
}