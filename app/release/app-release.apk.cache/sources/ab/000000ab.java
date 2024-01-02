package OooOOOO;

import OooOO0o.o0OoOo0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOo extends o000oOoO {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final OooOO0 f832OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public OooO00o f833OooOO0o;

    public OooOo(OooOOO.OooO oooO) {
        super(oooO);
        OooOO0 oooOO0 = new OooOO0(this);
        this.f832OooOO0O = oooOO0;
        this.f833OooOO0o = null;
        this.f858OooO0oo.f825OooO0o0 = 6;
        this.f850OooO.f825OooO0o0 = 7;
        oooOO0.f825OooO0o0 = 8;
        this.f855OooO0o = 1;
    }

    @Override // OooOOOO.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        OooOO0O oooOO0O;
        float f;
        int i;
        OooOO0O oooOO0O2;
        if (o0OoOo0.OooO00o(this.f859OooOO0) != 3) {
            OooOO0O oooOO0O3 = this.f856OooO0o0;
            if (oooOO0O3.f822OooO0OO && !oooOO0O3.f828OooOO0 && this.f854OooO0Oo == 3) {
                OooOOO.OooO oooO = this.f852OooO0O0;
                int i2 = oooO.f636OooOOoo;
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (oooO.f623OooO0Oo.f856OooO0o0.f828OooOO0) {
                            int i3 = oooO.f666OoooOOo;
                            if (i3 != -1) {
                                if (i3 != 0) {
                                    if (i3 != 1) {
                                        i = 0;
                                    }
                                } else {
                                    f = oooOO0O2.f826OooO0oO * oooO.f665OoooOOO;
                                    i = (int) (f + 0.5f);
                                }
                            }
                            f = oooOO0O2.f826OooO0oO / oooO.f665OoooOOO;
                            i = (int) (f + 0.5f);
                        }
                    }
                } else {
                    OooOOO.OooO oooO2 = oooO.f660OoooO;
                    if (oooO2 != null) {
                        if (oooO2.f625OooO0o0.f856OooO0o0.f828OooOO0) {
                            f = oooOO0O.f826OooO0oO * oooO.f642OooOoO;
                            i = (int) (f + 0.5f);
                        }
                    }
                }
                oooOO0O3.OooO0Oo(i);
            }
            OooOO0 oooOO0 = this.f858OooO0oo;
            if (oooOO0.f822OooO0OO) {
                OooOO0 oooOO02 = this.f850OooO;
                if (oooOO02.f822OooO0OO) {
                    if (oooOO0.f828OooOO0 && oooOO02.f828OooOO0 && oooOO0O3.f828OooOO0) {
                        return;
                    }
                    boolean z = oooOO0O3.f828OooOO0;
                    ArrayList arrayList = oooOO0.f830OooOO0o;
                    ArrayList arrayList2 = oooOO02.f830OooOO0o;
                    if (!z && this.f854OooO0Oo == 3) {
                        OooOOO.OooO oooO3 = this.f852OooO0O0;
                        if (oooO3.f634OooOOo == 0 && !oooO3.OooOoO0()) {
                            int i4 = ((OooOO0) arrayList.get(0)).f826OooO0oO + oooOO0.f824OooO0o;
                            int i5 = ((OooOO0) arrayList2.get(0)).f826OooO0oO + oooOO02.f824OooO0o;
                            oooOO0.OooO0Oo(i4);
                            oooOO02.OooO0Oo(i5);
                            oooOO0O3.OooO0Oo(i5 - i4);
                            return;
                        }
                    }
                    if (!oooOO0O3.f828OooOO0 && this.f854OooO0Oo == 3 && this.f851OooO00o == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        int i6 = (((OooOO0) arrayList2.get(0)).f826OooO0oO + oooOO02.f824OooO0o) - (((OooOO0) arrayList.get(0)).f826OooO0oO + oooOO0.f824OooO0o);
                        int i7 = oooOO0O3.OooOOO0;
                        if (i6 < i7) {
                            oooOO0O3.OooO0Oo(i6);
                        } else {
                            oooOO0O3.OooO0Oo(i7);
                        }
                    }
                    if (oooOO0O3.f828OooOO0 && arrayList.size() > 0 && arrayList2.size() > 0) {
                        OooOO0 oooOO03 = (OooOO0) arrayList.get(0);
                        OooOO0 oooOO04 = (OooOO0) arrayList2.get(0);
                        int i8 = oooOO03.f826OooO0oO;
                        int i9 = oooOO0.f824OooO0o + i8;
                        int i10 = oooOO04.f826OooO0oO;
                        int i11 = oooOO02.f824OooO0o + i10;
                        float f2 = this.f852OooO0O0.f672OooooOO;
                        if (oooOO03 == oooOO04) {
                            f2 = 0.5f;
                        } else {
                            i8 = i9;
                            i10 = i11;
                        }
                        oooOO0.OooO0Oo((int) ((((i10 - i8) - oooOO0O3.f826OooO0oO) * f2) + i8 + 0.5f));
                        oooOO02.OooO0Oo(oooOO0.f826OooO0oO + oooOO0O3.f826OooO0oO);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        OooOOO.OooO oooO4 = this.f852OooO0O0;
        OooOO0o(oooO4.f654Oooo0O0, oooO4.f657Oooo0o0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x025b, code lost:
        if (r15.f852OooO0O0.f648OooOooo != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0292, code lost:
        if (r0.f854OooO0Oo == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02b8, code lost:
        if (r15.f852OooO0O0.f648OooOooo != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ba, code lost:
        OooO0OO(r7, r3, 1, r15.f833OooOO0o);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0309, code lost:
        if (r0.f854OooO0Oo == 3) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030b, code lost:
        r0.f856OooO0o0.f829OooOO0O.add(r2);
        r10.add(r15.f852OooO0O0.f623OooO0Oo.f856OooO0o0);
        r2.f820OooO00o = r15;
     */
    @Override // OooOOOO.o000oOoO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo() {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOOO.OooOo.OooO0Oo():void");
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o() {
        this.f853OooO0OO = null;
        this.f858OooO0oo.OooO0OO();
        this.f850OooO.OooO0OO();
        this.f832OooOO0O.OooO0OO();
        this.f856OooO0o0.OooO0OO();
        this.f857OooO0oO = false;
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o0() {
        OooOO0 oooOO0 = this.f858OooO0oo;
        if (oooOO0.f828OooOO0) {
            this.f852OooO0O0.OoooOoO = oooOO0.f826OooO0oO;
        }
    }

    @Override // OooOOOO.o000oOoO
    public final boolean OooOO0O() {
        return this.f854OooO0Oo != 3 || this.f852OooO0O0.f636OooOOoo == 0;
    }

    public final void OooOOO0() {
        this.f857OooO0oO = false;
        OooOO0 oooOO0 = this.f858OooO0oo;
        oooOO0.OooO0OO();
        oooOO0.f828OooOO0 = false;
        OooOO0 oooOO02 = this.f850OooO;
        oooOO02.OooO0OO();
        oooOO02.f828OooOO0 = false;
        OooOO0 oooOO03 = this.f832OooOO0O;
        oooOO03.OooO0OO();
        oooOO03.f828OooOO0 = false;
        this.f856OooO0o0.f828OooOO0 = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f852OooO0O0.f674Oooooo;
    }
}