package OooOOOO;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOOOO extends o000oOoO {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final int[] f831OooOO0O = new int[2];

    public OooOOOO(OooOOO.OooO oooO) {
        super(oooO);
        this.f858OooO0oo.f825OooO0o0 = 4;
        this.f850OooO.f825OooO0o0 = 5;
        this.f855OooO0o = 0;
    }

    public static void OooOOO0(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else if (i5 != 1) {
                return;
            } else {
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x022a, code lost:
        if (r3 != 1) goto L125;
     */
    @Override // OooOOOO.OooO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o(OooOOOO.OooO0o r24) {
        /*
            Method dump skipped, instructions count: 855
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOOO.OooOOOO.OooO00o(OooOOOO.OooO0o):void");
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0Oo() {
        OooOOO.OooO oooO;
        OooOOO.OooO oooO2;
        int i;
        OooOOO.OooO oooO3;
        OooOOO.OooO0o oooO0o;
        ArrayList arrayList;
        OooOOO.OooO oooO4;
        int i2;
        OooOOO.OooO oooO5 = this.f852OooO0O0;
        boolean z = oooO5.f620OooO00o;
        OooOO0O oooOO0O = this.f856OooO0o0;
        if (z) {
            oooOO0O.OooO0Oo(oooO5.OooOOo0());
        }
        boolean z2 = oooOO0O.f828OooOO0;
        OooOO0 oooOO0 = this.f850OooO;
        OooOO0 oooOO02 = this.f858OooO0oo;
        if (!z2) {
            OooOOO.OooO oooO6 = this.f852OooO0O0;
            int i3 = oooO6.f681o00o0O[0];
            this.f854OooO0Oo = i3;
            if (i3 != 3) {
                if (i3 == 4 && (oooO4 = oooO6.f660OoooO) != null && ((i2 = oooO4.f681o00o0O[0]) == 1 || i2 == 4)) {
                    int OooOOo02 = (oooO4.OooOOo0() - this.f852OooO0O0.f650Oooo0.OooO0o0()) - this.f852OooO0O0.f655Oooo0OO.OooO0o0();
                    o000oOoO.OooO0O0(oooOO02, oooO4.f623OooO0Oo.f858OooO0oo, this.f852OooO0O0.f650Oooo0.OooO0o0());
                    o000oOoO.OooO0O0(oooOO0, oooO4.f623OooO0Oo.f850OooO, -this.f852OooO0O0.f655Oooo0OO.OooO0o0());
                    oooOO0O.OooO0Oo(OooOOo02);
                    return;
                } else if (i3 == 1) {
                    oooOO0O.OooO0Oo(oooO6.OooOOo0());
                }
            }
        } else if (this.f854OooO0Oo == 4 && (oooO2 = (oooO = this.f852OooO0O0).f660OoooO) != null && ((i = oooO2.f681o00o0O[0]) == 1 || i == 4)) {
            o000oOoO.OooO0O0(oooOO02, oooO2.f623OooO0Oo.f858OooO0oo, oooO.f650Oooo0.OooO0o0());
            o000oOoO.OooO0O0(oooOO0, oooO2.f623OooO0Oo.f850OooO, -this.f852OooO0O0.f655Oooo0OO.OooO0o0());
            return;
        }
        if (oooOO0O.f828OooOO0) {
            OooOOO.OooO oooO7 = this.f852OooO0O0;
            if (oooO7.f620OooO00o) {
                OooOOO.OooO0o[] oooO0oArr = oooO7.f662OoooO00;
                OooOOO.OooO0o oooO0o2 = oooO0oArr[0];
                OooOOO.OooO0o oooO0o3 = oooO0o2.f717OooO0o;
                if (oooO0o3 != null && oooO0oArr[1].f717OooO0o != null) {
                    if (oooO7.OooOo()) {
                        oooOO02.f824OooO0o = this.f852OooO0O0.f662OoooO00[0].OooO0o0();
                        oooO0o = this.f852OooO0O0.f662OoooO00[1];
                        oooOO0.f824OooO0o = -oooO0o.OooO0o0();
                        return;
                    }
                    OooOO0 OooO0oo2 = o000oOoO.OooO0oo(this.f852OooO0O0.f662OoooO00[0]);
                    if (OooO0oo2 != null) {
                        o000oOoO.OooO0O0(oooOO02, OooO0oo2, this.f852OooO0O0.f662OoooO00[0].OooO0o0());
                    }
                    OooOO0 OooO0oo3 = o000oOoO.OooO0oo(this.f852OooO0O0.f662OoooO00[1]);
                    if (OooO0oo3 != null) {
                        o000oOoO.OooO0O0(oooOO0, OooO0oo3, -this.f852OooO0O0.f662OoooO00[1].OooO0o0());
                    }
                    oooOO02.f821OooO0O0 = true;
                    oooOO0.f821OooO0O0 = true;
                    return;
                }
                if (oooO0o3 != null) {
                    OooOO0 OooO0oo4 = o000oOoO.OooO0oo(oooO0o2);
                    if (OooO0oo4 != null) {
                        o000oOoO.OooO0O0(oooOO02, OooO0oo4, this.f852OooO0O0.f662OoooO00[0].OooO0o0());
                    } else {
                        return;
                    }
                } else {
                    OooOOO.OooO0o oooO0o4 = oooO0oArr[1];
                    if (oooO0o4.f717OooO0o != null) {
                        OooOO0 OooO0oo5 = o000oOoO.OooO0oo(oooO0o4);
                        if (OooO0oo5 != null) {
                            o000oOoO.OooO0O0(oooOO0, OooO0oo5, -this.f852OooO0O0.f662OoooO00[1].OooO0o0());
                            o000oOoO.OooO0O0(oooOO02, oooOO0, -oooOO0O.f826OooO0oO);
                            return;
                        }
                        return;
                    } else if (!(oooO7 instanceof OooOOO.OooOOOO) && oooO7.f660OoooO != null && oooO7.OooOO0(OooOOO.OooO0OO.CENTER).f717OooO0o == null) {
                        OooOOO.OooO oooO8 = this.f852OooO0O0;
                        o000oOoO.OooO0O0(oooOO02, oooO8.f660OoooO.f623OooO0Oo.f858OooO0oo, oooO8.OooOOo());
                    } else {
                        return;
                    }
                }
                o000oOoO.OooO0O0(oooOO0, oooOO02, oooOO0O.f826OooO0oO);
                return;
            }
        }
        if (this.f854OooO0Oo == 3) {
            OooOOO.OooO oooO9 = this.f852OooO0O0;
            int i4 = oooO9.f634OooOOo;
            ArrayList arrayList2 = oooOO0O.f829OooOO0O;
            ArrayList arrayList3 = oooOO0O.f830OooOO0o;
            if (i4 != 2) {
                if (i4 == 3) {
                    if (oooO9.f636OooOOoo == 3) {
                        oooOO02.f820OooO00o = this;
                        oooOO0.f820OooO00o = this;
                        OooOo oooOo = oooO9.f625OooO0o0;
                        oooOo.f858OooO0oo.f820OooO00o = this;
                        oooOo.f850OooO.f820OooO00o = this;
                        oooOO0O.f820OooO00o = this;
                        if (oooO9.OooOoO0()) {
                            arrayList3.add(this.f852OooO0O0.f625OooO0o0.f856OooO0o0);
                            this.f852OooO0O0.f625OooO0o0.f856OooO0o0.f829OooOO0O.add(oooOO0O);
                            OooOo oooOo2 = this.f852OooO0O0.f625OooO0o0;
                            oooOo2.f856OooO0o0.f820OooO00o = this;
                            arrayList3.add(oooOo2.f858OooO0oo);
                            arrayList3.add(this.f852OooO0O0.f625OooO0o0.f850OooO);
                            this.f852OooO0O0.f625OooO0o0.f858OooO0oo.f829OooOO0O.add(oooOO0O);
                            arrayList = this.f852OooO0O0.f625OooO0o0.f850OooO.f829OooOO0O;
                        } else if (this.f852OooO0O0.OooOo()) {
                            this.f852OooO0O0.f625OooO0o0.f856OooO0o0.f830OooOO0o.add(oooOO0O);
                            arrayList2.add(this.f852OooO0O0.f625OooO0o0.f856OooO0o0);
                        } else {
                            arrayList = this.f852OooO0O0.f625OooO0o0.f856OooO0o0.f830OooOO0o;
                        }
                    } else {
                        OooOO0O oooOO0O2 = oooO9.f625OooO0o0.f856OooO0o0;
                        arrayList3.add(oooOO0O2);
                        oooOO0O2.f829OooOO0O.add(oooOO0O);
                        this.f852OooO0O0.f625OooO0o0.f858OooO0oo.f829OooOO0O.add(oooOO0O);
                        this.f852OooO0O0.f625OooO0o0.f850OooO.f829OooOO0O.add(oooOO0O);
                        oooOO0O.f821OooO0O0 = true;
                        arrayList2.add(oooOO02);
                        arrayList2.add(oooOO0);
                        oooOO02.f830OooOO0o.add(oooOO0O);
                        arrayList = oooOO0.f830OooOO0o;
                    }
                    arrayList.add(oooOO0O);
                }
            } else {
                OooOOO.OooO oooO10 = oooO9.f660OoooO;
                if (oooO10 != null) {
                    OooOO0O oooOO0O3 = oooO10.f625OooO0o0.f856OooO0o0;
                    arrayList3.add(oooOO0O3);
                    oooOO0O3.f829OooOO0O.add(oooOO0O);
                    oooOO0O.f821OooO0O0 = true;
                    arrayList2.add(oooOO02);
                    arrayList2.add(oooOO0);
                }
            }
        }
        OooOOO.OooO oooO11 = this.f852OooO0O0;
        OooOOO.OooO0o[] oooO0oArr2 = oooO11.f662OoooO00;
        OooOOO.OooO0o oooO0o5 = oooO0oArr2[0];
        OooOOO.OooO0o oooO0o6 = oooO0o5.f717OooO0o;
        if (oooO0o6 != null && oooO0oArr2[1].f717OooO0o != null) {
            if (oooO11.OooOo()) {
                oooOO02.f824OooO0o = this.f852OooO0O0.f662OoooO00[0].OooO0o0();
                oooO0o = this.f852OooO0O0.f662OoooO00[1];
                oooOO0.f824OooO0o = -oooO0o.OooO0o0();
                return;
            }
            OooOO0 OooO0oo6 = o000oOoO.OooO0oo(this.f852OooO0O0.f662OoooO00[0]);
            OooOO0 OooO0oo7 = o000oOoO.OooO0oo(this.f852OooO0O0.f662OoooO00[1]);
            if (OooO0oo6 != null) {
                OooO0oo6.OooO0O0(this);
            }
            if (OooO0oo7 != null) {
                OooO0oo7.OooO0O0(this);
            }
            this.f859OooOO0 = 4;
            return;
        }
        if (oooO0o6 != null) {
            OooOO0 OooO0oo8 = o000oOoO.OooO0oo(oooO0o5);
            if (OooO0oo8 != null) {
                o000oOoO.OooO0O0(oooOO02, OooO0oo8, this.f852OooO0O0.f662OoooO00[0].OooO0o0());
            } else {
                return;
            }
        } else {
            OooOOO.OooO0o oooO0o7 = oooO0oArr2[1];
            if (oooO0o7.f717OooO0o != null) {
                OooOO0 OooO0oo9 = o000oOoO.OooO0oo(oooO0o7);
                if (OooO0oo9 != null) {
                    o000oOoO.OooO0O0(oooOO0, OooO0oo9, -this.f852OooO0O0.f662OoooO00[1].OooO0o0());
                    OooO0OO(oooOO02, oooOO0, -1, oooOO0O);
                    return;
                }
                return;
            } else if (!(oooO11 instanceof OooOOO.OooOOOO) && (oooO3 = oooO11.f660OoooO) != null) {
                o000oOoO.OooO0O0(oooOO02, oooO3.f623OooO0Oo.f858OooO0oo, oooO11.OooOOo());
            } else {
                return;
            }
        }
        OooO0OO(oooOO0, oooOO02, 1, oooOO0O);
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o() {
        this.f853OooO0OO = null;
        this.f858OooO0oo.OooO0OO();
        this.f850OooO.OooO0OO();
        this.f856OooO0o0.OooO0OO();
        this.f857OooO0oO = false;
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o0() {
        OooOO0 oooOO0 = this.f858OooO0oo;
        if (oooOO0.f828OooOO0) {
            this.f852OooO0O0.f667OoooOo0 = oooOO0.f826OooO0oO;
        }
    }

    @Override // OooOOOO.o000oOoO
    public final boolean OooOO0O() {
        return this.f854OooO0Oo != 3 || this.f852OooO0O0.f634OooOOo == 0;
    }

    public final void OooOOO() {
        this.f857OooO0oO = false;
        OooOO0 oooOO0 = this.f858OooO0oo;
        oooOO0.OooO0OO();
        oooOO0.f828OooOO0 = false;
        OooOO0 oooOO02 = this.f850OooO;
        oooOO02.OooO0OO();
        oooOO02.f828OooOO0 = false;
        this.f856OooO0o0.f828OooOO0 = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f852OooO0O0.f674Oooooo;
    }
}