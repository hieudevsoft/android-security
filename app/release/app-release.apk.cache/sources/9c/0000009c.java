package OooOOO;

import OooOO0o.o00O0O;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOOO extends OooO {

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public boolean f760o0ooOOo;

    /* renamed from: o00ooo  reason: collision with root package name */
    public float f758o00ooo = -1.0f;

    /* renamed from: oo000o  reason: collision with root package name */
    public int f761oo000o = -1;
    public int o00oO0o = -1;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public OooO0o f757o00oO0O = this.f654Oooo0O0;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public int f759o0ooOO0 = 0;

    public OooOOO() {
        this.f661OoooO0.clear();
        this.f661OoooO0.add(this.f757o00oO0O);
        int length = this.f662OoooO00.length;
        for (int i = 0; i < length; i++) {
            this.f662OoooO00[i] = this.f757o00oO0O;
        }
    }

    @Override // OooOOO.OooO
    public final void OooO0OO(OooOO0o.OooOo oooOo, boolean z) {
        boolean z2;
        OooOO0 oooOO0 = (OooOO0) this.f660OoooO;
        if (oooOO0 == null) {
            return;
        }
        Object OooOO02 = oooOO0.OooOO0(OooO0OO.LEFT);
        Object OooOO03 = oooOO0.OooOO0(OooO0OO.RIGHT);
        OooO oooO = this.f660OoooO;
        boolean z3 = true;
        if (oooO != null && oooO.f681o00o0O[0] == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f759o0ooOO0 == 0) {
            OooOO02 = oooOO0.OooOO0(OooO0OO.TOP);
            OooOO03 = oooOO0.OooOO0(OooO0OO.BOTTOM);
            OooO oooO2 = this.f660OoooO;
            if (oooO2 == null || oooO2.f681o00o0O[1] != 2) {
                z3 = false;
            }
            z2 = z3;
        }
        if (this.f760o0ooOOo) {
            OooO0o oooO0o = this.f757o00oO0O;
            if (oooO0o.f715OooO0OO) {
                o00O0O OooOO0o2 = oooOo.OooOO0o(oooO0o);
                oooOo.OooO0Oo(OooOO0o2, this.f757o00oO0O.OooO0Oo());
                if (this.f761oo000o != -1) {
                    if (z2) {
                        oooOo.OooO0o(oooOo.OooOO0o(OooOO03), OooOO0o2, 0, 5);
                    }
                } else if (this.o00oO0o != -1 && z2) {
                    o00O0O OooOO0o3 = oooOo.OooOO0o(OooOO03);
                    oooOo.OooO0o(OooOO0o2, oooOo.OooOO0o(OooOO02), 0, 5);
                    oooOo.OooO0o(OooOO0o3, OooOO0o2, 0, 5);
                }
                this.f760o0ooOOo = false;
                return;
            }
        }
        if (this.f761oo000o != -1) {
            o00O0O OooOO0o4 = oooOo.OooOO0o(this.f757o00oO0O);
            oooOo.OooO0o0(OooOO0o4, oooOo.OooOO0o(OooOO02), this.f761oo000o, 8);
            if (z2) {
                oooOo.OooO0o(oooOo.OooOO0o(OooOO03), OooOO0o4, 0, 5);
            }
        } else if (this.o00oO0o != -1) {
            o00O0O OooOO0o5 = oooOo.OooOO0o(this.f757o00oO0O);
            o00O0O OooOO0o6 = oooOo.OooOO0o(OooOO03);
            oooOo.OooO0o0(OooOO0o5, OooOO0o6, -this.o00oO0o, 8);
            if (z2) {
                oooOo.OooO0o(OooOO0o5, oooOo.OooOO0o(OooOO02), 0, 5);
                oooOo.OooO0o(OooOO0o6, OooOO0o5, 0, 5);
            }
        } else if (this.f758o00ooo != -1.0f) {
            o00O0O OooOO0o7 = oooOo.OooOO0o(this.f757o00oO0O);
            o00O0O OooOO0o8 = oooOo.OooOO0o(OooOO03);
            float f = this.f758o00ooo;
            OooOO0o.OooOo00 OooOOO0 = oooOo.OooOOO0();
            OooOOO0.f596OooO0Oo.OooO0o0(OooOO0o7, -1.0f);
            OooOOO0.f596OooO0Oo.OooO0o0(OooOO0o8, f);
            oooOo.OooO0OO(OooOOO0);
        }
    }

    @Override // OooOOO.OooO
    public final boolean OooO0Oo() {
        return true;
    }

    @Override // OooOOO.OooO
    public final OooO0o OooOO0(OooO0OO oooO0OO) {
        int ordinal = oooO0OO.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        return null;
                    }
                }
            }
            if (this.f759o0ooOO0 == 0) {
                return this.f757o00oO0O;
            }
            return null;
        }
        if (this.f759o0ooOO0 == 1) {
            return this.f757o00oO0O;
        }
        return null;
    }

    @Override // OooOOO.OooO
    public final boolean OooOoOO() {
        return this.f760o0ooOOo;
    }

    @Override // OooOOO.OooO
    public final boolean OooOoo0() {
        return this.f760o0ooOOo;
    }

    @Override // OooOOO.OooO
    public final void Oooo(OooOO0o.OooOo oooOo, boolean z) {
        if (this.f660OoooO == null) {
            return;
        }
        OooO0o oooO0o = this.f757o00oO0O;
        oooOo.getClass();
        int OooOOOO2 = OooOO0o.OooOo.OooOOOO(oooO0o);
        if (this.f759o0ooOO0 == 1) {
            this.f667OoooOo0 = OooOOOO2;
            this.OoooOoO = 0;
            Oooo0OO(this.f660OoooO.OooOO0o());
            Oooo0oO(0);
            return;
        }
        this.f667OoooOo0 = 0;
        this.OoooOoO = OooOOOO2;
        Oooo0oO(this.f660OoooO.OooOOo0());
        Oooo0OO(0);
    }

    public final void OoooO00(int i) {
        if (this.f759o0ooOO0 == i) {
            return;
        }
        this.f759o0ooOO0 = i;
        ArrayList arrayList = this.f661OoooO0;
        arrayList.clear();
        this.f757o00oO0O = this.f759o0ooOO0 == 1 ? this.f650Oooo0 : this.f654Oooo0O0;
        arrayList.add(this.f757o00oO0O);
        OooO0o[] oooO0oArr = this.f662OoooO00;
        int length = oooO0oArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            oooO0oArr[i2] = this.f757o00oO0O;
        }
    }
}