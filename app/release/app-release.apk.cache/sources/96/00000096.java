package OooOOO;

import OooOO0o.o00O0O;

/* loaded from: classes.dex */
public final class OooO00o extends OooOo00 {
    public int o00oO0o = 0;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public boolean f684o00oO0O = true;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public int f685o0ooOO0 = 0;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public boolean f686o0ooOOo = false;

    @Override // OooOOO.OooO
    public final void OooO0OO(OooOO0o.OooOo oooOo, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i;
        o00O0O o00o0o;
        OooO0o oooO0o;
        int i2;
        int i3;
        int i4;
        o00O0O o00o0o2;
        int i5;
        OooO0o[] oooO0oArr = this.f662OoooO00;
        OooO0o oooO0o2 = this.f650Oooo0;
        oooO0oArr[0] = oooO0o2;
        int i6 = 2;
        OooO0o oooO0o3 = this.f654Oooo0O0;
        oooO0oArr[2] = oooO0o3;
        OooO0o oooO0o4 = this.f655Oooo0OO;
        oooO0oArr[1] = oooO0o4;
        OooO0o oooO0o5 = this.f657Oooo0o0;
        oooO0oArr[3] = oooO0o5;
        for (OooO0o oooO0o6 : oooO0oArr) {
            oooO0o6.f712OooO = oooOo.OooOO0o(oooO0o6);
        }
        int i7 = this.o00oO0o;
        if (i7 >= 0 && i7 < 4) {
            OooO0o oooO0o7 = oooO0oArr[i7];
            if (!this.f686o0ooOOo) {
                OoooO0();
            }
            if (this.f686o0ooOOo) {
                this.f686o0ooOOo = false;
                int i8 = this.o00oO0o;
                if (i8 != 0 && i8 != 1) {
                    if (i8 == 2 || i8 == 3) {
                        oooOo.OooO0Oo(oooO0o3.f712OooO, this.OoooOoO);
                        o00o0o2 = oooO0o5.f712OooO;
                        i5 = this.OoooOoO;
                    } else {
                        return;
                    }
                } else {
                    oooOo.OooO0Oo(oooO0o2.f712OooO, this.f667OoooOo0);
                    o00o0o2 = oooO0o4.f712OooO;
                    i5 = this.f667OoooOo0;
                }
                oooOo.OooO0Oo(o00o0o2, i5);
                return;
            }
            for (int i9 = 0; i9 < this.f798oo000o; i9++) {
                OooO oooO = this.f797o00ooo[i9];
                if ((this.f684o00oO0O || oooO.OooO0Oo()) && ((((i4 = this.o00oO0o) == 0 || i4 == 1) && oooO.f681o00o0O[0] == 3 && oooO.f650Oooo0.f717OooO0o != null && oooO.f655Oooo0OO.f717OooO0o != null) || ((i4 == 2 || i4 == 3) && oooO.f681o00o0O[1] == 3 && oooO.f654Oooo0O0.f717OooO0o != null && oooO.f657Oooo0o0.f717OooO0o != null))) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
            if (!oooO0o2.OooO0oO() && !oooO0o4.OooO0oO()) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!oooO0o3.OooO0oO() && !oooO0o5.OooO0oO()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z2 && (((i3 = this.o00oO0o) == 0 && z3) || ((i3 == 2 && z4) || ((i3 == 1 && z3) || (i3 == 3 && z4))))) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (!z5) {
                i = 4;
            } else {
                i = 5;
            }
            int i10 = 0;
            while (i10 < this.f798oo000o) {
                OooO oooO2 = this.f797o00ooo[i10];
                if (this.f684o00oO0O || oooO2.OooO0Oo()) {
                    o00O0O OooOO0o2 = oooOo.OooOO0o(oooO2.f662OoooO00[this.o00oO0o]);
                    int i11 = this.o00oO0o;
                    OooO0o oooO0o8 = oooO2.f662OoooO00[i11];
                    oooO0o8.f712OooO = OooOO0o2;
                    OooO0o oooO0o9 = oooO0o8.f717OooO0o;
                    if (oooO0o9 != null && oooO0o9.f716OooO0Oo == this) {
                        i2 = oooO0o8.f719OooO0oO + 0;
                    } else {
                        i2 = 0;
                    }
                    if (i11 != 0 && i11 != i6) {
                        OooOO0o.OooOo00 OooOOO0 = oooOo.OooOOO0();
                        o00O0O OooOOO2 = oooOo.OooOOO();
                        OooOOO2.f611OooO0Oo = 0;
                        OooOOO0.OooO0O0(oooO0o7.f712OooO, OooOO0o2, OooOOO2, this.f685o0ooOO0 + i2);
                        oooOo.OooO0OO(OooOOO0);
                    } else {
                        OooOO0o.OooOo00 OooOOO02 = oooOo.OooOOO0();
                        o00O0O OooOOO3 = oooOo.OooOOO();
                        OooOOO3.f611OooO0Oo = 0;
                        OooOOO02.OooO0OO(oooO0o7.f712OooO, OooOO0o2, OooOOO3, this.f685o0ooOO0 - i2);
                        oooOo.OooO0OO(OooOOO02);
                    }
                    oooOo.OooO0o0(oooO0o7.f712OooO, OooOO0o2, this.f685o0ooOO0 + i2, i);
                }
                i10++;
                i6 = 2;
            }
            int i12 = this.o00oO0o;
            if (i12 == 0) {
                oooOo.OooO0o0(oooO0o4.f712OooO, oooO0o2.f712OooO, 0, 8);
                oooOo.OooO0o0(oooO0o2.f712OooO, this.f660OoooO.f655Oooo0OO.f712OooO, 0, 4);
                o00o0o = oooO0o2.f712OooO;
                oooO0o = this.f660OoooO.f650Oooo0;
            } else if (i12 == 1) {
                oooOo.OooO0o0(oooO0o2.f712OooO, oooO0o4.f712OooO, 0, 8);
                oooOo.OooO0o0(oooO0o2.f712OooO, this.f660OoooO.f650Oooo0.f712OooO, 0, 4);
                o00o0o = oooO0o2.f712OooO;
                oooO0o = this.f660OoooO.f655Oooo0OO;
            } else if (i12 == 2) {
                oooOo.OooO0o0(oooO0o5.f712OooO, oooO0o3.f712OooO, 0, 8);
                oooOo.OooO0o0(oooO0o3.f712OooO, this.f660OoooO.f657Oooo0o0.f712OooO, 0, 4);
                o00o0o = oooO0o3.f712OooO;
                oooO0o = this.f660OoooO.f654Oooo0O0;
            } else if (i12 == 3) {
                oooOo.OooO0o0(oooO0o3.f712OooO, oooO0o5.f712OooO, 0, 8);
                oooOo.OooO0o0(oooO0o3.f712OooO, this.f660OoooO.f654Oooo0O0.f712OooO, 0, 4);
                o00o0o = oooO0o3.f712OooO;
                oooO0o = this.f660OoooO.f657Oooo0o0;
            } else {
                return;
            }
            oooOo.OooO0o0(o00o0o, oooO0o.f712OooO, 0, 0);
        }
    }

    @Override // OooOOO.OooO
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // OooOOO.OooO
    public final boolean OooOoOO() {
        return this.f686o0ooOOo;
    }

    @Override // OooOOO.OooO
    public final boolean OooOoo0() {
        return this.f686o0ooOOo;
    }

    public final boolean OoooO0() {
        int i;
        OooO0o OooOO02;
        OooO0o OooOO03;
        OooO0o OooOO04;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f798oo000o;
            if (i4 >= i) {
                break;
            }
            OooO oooO = this.f797o00ooo[i4];
            if ((this.f684o00oO0O || oooO.OooO0Oo()) && ((((i2 = this.o00oO0o) == 0 || i2 == 1) && !oooO.OooOoOO()) || (((i3 = this.o00oO0o) == 2 || i3 == 3) && !oooO.OooOoo0()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.f798oo000o; i6++) {
            OooO oooO2 = this.f797o00ooo[i6];
            if (this.f684o00oO0O || oooO2.OooO0Oo()) {
                OooO0OO oooO0OO = OooO0OO.BOTTOM;
                OooO0OO oooO0OO2 = OooO0OO.TOP;
                OooO0OO oooO0OO3 = OooO0OO.RIGHT;
                OooO0OO oooO0OO4 = OooO0OO.LEFT;
                if (!z2) {
                    int i7 = this.o00oO0o;
                    if (i7 == 0) {
                        OooOO04 = oooO2.OooOO0(oooO0OO4);
                    } else if (i7 == 1) {
                        OooOO04 = oooO2.OooOO0(oooO0OO3);
                    } else if (i7 == 2) {
                        OooOO04 = oooO2.OooOO0(oooO0OO2);
                    } else {
                        if (i7 == 3) {
                            OooOO04 = oooO2.OooOO0(oooO0OO);
                        }
                        z2 = true;
                    }
                    i5 = OooOO04.OooO0Oo();
                    z2 = true;
                }
                int i8 = this.o00oO0o;
                if (i8 == 0) {
                    OooOO03 = oooO2.OooOO0(oooO0OO4);
                } else {
                    if (i8 == 1) {
                        OooOO02 = oooO2.OooOO0(oooO0OO3);
                    } else if (i8 == 2) {
                        OooOO03 = oooO2.OooOO0(oooO0OO2);
                    } else if (i8 == 3) {
                        OooOO02 = oooO2.OooOO0(oooO0OO);
                    }
                    i5 = Math.max(i5, OooOO02.OooO0Oo());
                }
                i5 = Math.min(i5, OooOO03.OooO0Oo());
            }
        }
        int i9 = i5 + this.f685o0ooOO0;
        int i10 = this.o00oO0o;
        if (i10 == 0 || i10 == 1) {
            Oooo0(i9, i9);
        } else {
            Oooo0O0(i9, i9);
        }
        this.f686o0ooOOo = true;
        return true;
    }

    public final int OoooO0O() {
        int i = this.o00oO0o;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // OooOOO.OooO
    public final String toString() {
        String str = "[Barrier] " + this.f674Oooooo + " {";
        for (int i = 0; i < this.f798oo000o; i++) {
            OooO oooO = this.f797o00ooo[i];
            if (i > 0) {
                str = OooO0O0.OooO00o.OooO0OO(str, ", ");
            }
            str = str + oooO.f674Oooooo;
        }
        return OooO0O0.OooO00o.OooO0OO(str, "}");
    }
}