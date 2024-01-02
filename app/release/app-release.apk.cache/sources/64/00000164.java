package OooOooo;

import OooOo.OooO0OO;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class o0O00oO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O0OOOo f1336OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0OO[] f1337OooO0O0;

    public o0O00oO0() {
        this(new o0O0OOOo());
    }

    public final void OooO00o() {
        OooO0OO[] oooO0OOArr = this.f1337OooO0O0;
        if (oooO0OOArr != null) {
            OooO0OO oooO0OO = oooO0OOArr[OooO00o.o0000O00(1)];
            OooO0OO oooO0OO2 = this.f1337OooO0O0[OooO00o.o0000O00(2)];
            o0O0OOOo o0o0oooo = this.f1336OooO00o;
            if (oooO0OO2 == null) {
                oooO0OO2 = o0o0oooo.OooO00o(2);
            }
            if (oooO0OO == null) {
                oooO0OO = o0o0oooo.OooO00o(1);
            }
            OooO0oO(OooO0OO.OooO00o(oooO0OO, oooO0OO2));
            OooO0OO oooO0OO3 = this.f1337OooO0O0[OooO00o.o0000O00(16)];
            if (oooO0OO3 != null) {
                OooO0o(oooO0OO3);
            }
            OooO0OO oooO0OO4 = this.f1337OooO0O0[OooO00o.o0000O00(32)];
            if (oooO0OO4 != null) {
                OooO0Oo(oooO0OO4);
            }
            OooO0OO oooO0OO5 = this.f1337OooO0O0[OooO00o.o0000O00(64)];
            if (oooO0OO5 != null) {
                OooO0oo(oooO0OO5);
            }
        }
    }

    public abstract o0O0OOOo OooO0O0();

    public void OooO0OO(int i, OooO0OO oooO0OO) {
        if (this.f1337OooO0O0 == null) {
            this.f1337OooO0O0 = new OooO0OO[9];
        }
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                this.f1337OooO0O0[OooO00o.o0000O00(i2)] = oooO0OO;
            }
        }
    }

    public void OooO0Oo(OooO0OO oooO0OO) {
    }

    public void OooO0o(OooO0OO oooO0OO) {
    }

    public abstract void OooO0o0(OooO0OO oooO0OO);

    public abstract void OooO0oO(OooO0OO oooO0OO);

    public void OooO0oo(OooO0OO oooO0OO) {
    }

    public o0O00oO0(o0O0OOOo o0o0oooo) {
        this.f1336OooO00o = o0o0oooo;
    }
}