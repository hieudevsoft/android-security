package OooOOOO;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOOO extends o000oOoO {
    @Override // OooOOOO.OooO0o
    public final void OooO00o(OooO0o oooO0o) {
        OooOOO.OooO00o oooO00o = (OooOOO.OooO00o) this.f852OooO0O0;
        int i = oooO00o.o00oO0o;
        OooOO0 oooOO0 = this.f858OooO0oo;
        Iterator it = oooOO0.f830OooOO0o.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((OooOO0) it.next()).f826OooO0oO;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i != 0 && i != 2) {
            oooOO0.OooO0Oo(i2 + oooO00o.f685o0ooOO0);
        } else {
            oooOO0.OooO0Oo(i3 + oooO00o.f685o0ooOO0);
        }
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0Oo() {
        o000oOoO o000oooo;
        OooOOO.OooO oooO = this.f852OooO0O0;
        if (oooO instanceof OooOOO.OooO00o) {
            OooOO0 oooOO0 = this.f858OooO0oo;
            oooOO0.f821OooO0O0 = true;
            OooOOO.OooO00o oooO00o = (OooOOO.OooO00o) oooO;
            int i = oooO00o.o00oO0o;
            boolean z = oooO00o.f684o00oO0O;
            ArrayList arrayList = oooOO0.f830OooOO0o;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            oooOO0.f825OooO0o0 = 7;
                            while (i2 < oooO00o.f798oo000o) {
                                OooOOO.OooO oooO2 = oooO00o.f797o00ooo[i2];
                                if (z || oooO2.f675Oooooo0 != 8) {
                                    OooOO0 oooOO02 = oooO2.f625OooO0o0.f850OooO;
                                    oooOO02.f829OooOO0O.add(oooOO0);
                                    arrayList.add(oooOO02);
                                }
                                i2++;
                            }
                        } else {
                            return;
                        }
                    } else {
                        oooOO0.f825OooO0o0 = 6;
                        while (i2 < oooO00o.f798oo000o) {
                            OooOOO.OooO oooO3 = oooO00o.f797o00ooo[i2];
                            if (z || oooO3.f675Oooooo0 != 8) {
                                OooOO0 oooOO03 = oooO3.f625OooO0o0.f858OooO0oo;
                                oooOO03.f829OooOO0O.add(oooOO0);
                                arrayList.add(oooOO03);
                            }
                            i2++;
                        }
                    }
                    OooOOO0(this.f852OooO0O0.f625OooO0o0.f858OooO0oo);
                    o000oooo = this.f852OooO0O0.f625OooO0o0;
                    OooOOO0(o000oooo.f850OooO);
                }
                oooOO0.f825OooO0o0 = 5;
                while (i2 < oooO00o.f798oo000o) {
                    OooOOO.OooO oooO4 = oooO00o.f797o00ooo[i2];
                    if (z || oooO4.f675Oooooo0 != 8) {
                        OooOO0 oooOO04 = oooO4.f623OooO0Oo.f850OooO;
                        oooOO04.f829OooOO0O.add(oooOO0);
                        arrayList.add(oooOO04);
                    }
                    i2++;
                }
            } else {
                oooOO0.f825OooO0o0 = 4;
                while (i2 < oooO00o.f798oo000o) {
                    OooOOO.OooO oooO5 = oooO00o.f797o00ooo[i2];
                    if (z || oooO5.f675Oooooo0 != 8) {
                        OooOO0 oooOO05 = oooO5.f623OooO0Oo.f858OooO0oo;
                        oooOO05.f829OooOO0O.add(oooOO0);
                        arrayList.add(oooOO05);
                    }
                    i2++;
                }
            }
            OooOOO0(this.f852OooO0O0.f623OooO0Oo.f858OooO0oo);
            o000oooo = this.f852OooO0O0.f623OooO0Oo;
            OooOOO0(o000oooo.f850OooO);
        }
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o() {
        this.f853OooO0OO = null;
        this.f858OooO0oo.OooO0OO();
    }

    @Override // OooOOOO.o000oOoO
    public final void OooO0o0() {
        OooOOO.OooO oooO = this.f852OooO0O0;
        if (oooO instanceof OooOOO.OooO00o) {
            int i = ((OooOOO.OooO00o) oooO).o00oO0o;
            OooOO0 oooOO0 = this.f858OooO0oo;
            if (i != 0 && i != 1) {
                oooO.OoooOoO = oooOO0.f826OooO0oO;
            } else {
                oooO.f667OoooOo0 = oooOO0.f826OooO0oO;
            }
        }
    }

    @Override // OooOOOO.o000oOoO
    public final boolean OooOO0O() {
        return false;
    }

    public final void OooOOO0(OooOO0 oooOO0) {
        OooOO0 oooOO02 = this.f858OooO0oo;
        oooOO02.f829OooOO0O.add(oooOO0);
        oooOO0.f830OooOO0o.add(oooOO02);
    }
}