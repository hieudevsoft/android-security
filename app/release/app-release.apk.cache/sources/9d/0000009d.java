package OooOOO;

import OooOOOO.Oooo000;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOOO0 extends OooOo00 {

    /* renamed from: o0000OOo  reason: collision with root package name */
    public OooO[] f781o0000OOo;
    public int o00oO0o = 0;

    /* renamed from: o00oO0O  reason: collision with root package name */
    public int f788o00oO0O = 0;

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public int f792o0ooOO0 = 0;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public int f793o0ooOOo = 0;

    /* renamed from: o0ooOoO  reason: collision with root package name */
    public int f794o0ooOoO = 0;

    /* renamed from: o0OOO0o  reason: collision with root package name */
    public int f791o0OOO0o = 0;
    public boolean o0Oo0oo = false;

    /* renamed from: o0OO00O  reason: collision with root package name */
    public int f790o0OO00O = 0;

    /* renamed from: oo0o0Oo  reason: collision with root package name */
    public int f795oo0o0Oo = 0;

    /* renamed from: o0O0O00  reason: collision with root package name */
    public final OooOOOO.OooO0O0 f789o0O0O00 = new OooOOOO.OooO0O0();

    /* renamed from: o000OOo  reason: collision with root package name */
    public Oooo000 f787o000OOo = null;

    /* renamed from: o000000  reason: collision with root package name */
    public int f764o000000 = -1;

    /* renamed from: o000000O  reason: collision with root package name */
    public int f765o000000O = -1;

    /* renamed from: o000000o  reason: collision with root package name */
    public int f766o000000o = -1;

    /* renamed from: o00000  reason: collision with root package name */
    public int f763o00000 = -1;

    /* renamed from: o00000O0  reason: collision with root package name */
    public int f768o00000O0 = -1;

    /* renamed from: o00000O  reason: collision with root package name */
    public int f767o00000O = -1;

    /* renamed from: o00000OO  reason: collision with root package name */
    public float f769o00000OO = 0.5f;

    /* renamed from: o00000Oo  reason: collision with root package name */
    public float f770o00000Oo = 0.5f;

    /* renamed from: o00000o0  reason: collision with root package name */
    public float f771o00000o0 = 0.5f;

    /* renamed from: o0000Ooo  reason: collision with root package name */
    public float f783o0000Ooo = 0.5f;

    /* renamed from: o00000oO  reason: collision with root package name */
    public float f772o00000oO = 0.5f;

    /* renamed from: o00000oo  reason: collision with root package name */
    public float f773o00000oo = 0.5f;

    /* renamed from: o0000  reason: collision with root package name */
    public int f762o0000 = 0;

    /* renamed from: o0000O00  reason: collision with root package name */
    public int f776o0000O00 = 0;

    /* renamed from: o0000oo  reason: collision with root package name */
    public int f785o0000oo = 2;

    /* renamed from: o0000oO  reason: collision with root package name */
    public int f784o0000oO = 2;

    /* renamed from: o0000O0  reason: collision with root package name */
    public int f775o0000O0 = 0;

    /* renamed from: o0000O0O  reason: collision with root package name */
    public int f777o0000O0O = -1;

    /* renamed from: o000OO  reason: collision with root package name */
    public int f786o000OO = 0;

    /* renamed from: o0000O  reason: collision with root package name */
    public final ArrayList f774o0000O = new ArrayList();

    /* renamed from: o0000OO0  reason: collision with root package name */
    public OooO[] f779o0000OO0 = null;

    /* renamed from: o0000OO  reason: collision with root package name */
    public OooO[] f778o0000OO = null;

    /* renamed from: o0000OOO  reason: collision with root package name */
    public int[] f780o0000OOO = null;

    /* renamed from: o0000Oo0  reason: collision with root package name */
    public int f782o0000Oo0 = 0;

    @Override // OooOOO.OooOo00, OooOOO.OooOOOO
    public final void OooO00o() {
        for (int i = 0; i < this.f798oo000o; i++) {
            OooO oooO = this.f797o00ooo[i];
            if (oooO != null) {
                oooO.f651Oooo000 = true;
            }
        }
    }

    @Override // OooOOO.OooO
    public final void OooO0OO(OooOO0o.OooOo oooOo, boolean z) {
        boolean z2;
        boolean z3;
        OooO oooO;
        float f;
        int i;
        boolean z4;
        super.OooO0OO(oooOo, z);
        OooO oooO2 = this.f660OoooO;
        if (oooO2 != null && ((OooOO0) oooO2).f736o0ooOOo) {
            z2 = true;
        } else {
            z2 = false;
        }
        int i2 = this.f775o0000O0;
        ArrayList arrayList = this.f774o0000O;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            OooOO0O oooOO0O = (OooOO0O) arrayList.get(i3);
                            if (i3 == size - 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            oooOO0O.OooO0O0(i3, z2, z4);
                        }
                    }
                } else if (this.f780o0000OOO != null && this.f778o0000OO != null && this.f779o0000OO0 != null) {
                    for (int i4 = 0; i4 < this.f782o0000Oo0; i4++) {
                        this.f781o0000OOo[i4].OooOooO();
                    }
                    int[] iArr = this.f780o0000OOO;
                    int i5 = iArr[0];
                    int i6 = iArr[1];
                    float f2 = this.f769o00000OO;
                    OooO oooO3 = null;
                    int i7 = 0;
                    while (i7 < i5) {
                        if (z2) {
                            i = (i5 - i7) - 1;
                            f = 1.0f - this.f769o00000OO;
                        } else {
                            f = f2;
                            i = i7;
                        }
                        OooO oooO4 = this.f778o0000OO[i];
                        if (oooO4 != null && oooO4.f675Oooooo0 != 8) {
                            OooO0o oooO0o = oooO4.f650Oooo0;
                            if (i7 == 0) {
                                oooO4.OooO0oO(oooO0o, this.f650Oooo0, this.f794o0ooOoO);
                                oooO4.f676OoooooO = this.f764o000000;
                                oooO4.f671OooooO0 = f;
                            }
                            if (i7 == i5 - 1) {
                                oooO4.OooO0oO(oooO4.f655Oooo0OO, this.f655Oooo0OO, this.f791o0OOO0o);
                            }
                            if (i7 > 0 && oooO3 != null) {
                                int i8 = this.f762o0000;
                                OooO0o oooO0o2 = oooO3.f655Oooo0OO;
                                oooO4.OooO0oO(oooO0o, oooO0o2, i8);
                                oooO3.OooO0oO(oooO0o2, oooO0o, 0);
                            }
                            oooO3 = oooO4;
                        }
                        i7++;
                        f2 = f;
                    }
                    for (int i9 = 0; i9 < i6; i9++) {
                        OooO oooO5 = this.f779o0000OO0[i9];
                        if (oooO5 != null && oooO5.f675Oooooo0 != 8) {
                            OooO0o oooO0o3 = oooO5.f654Oooo0O0;
                            if (i9 == 0) {
                                oooO5.OooO0oO(oooO0o3, this.f654Oooo0O0, this.o00oO0o);
                                oooO5.f677Ooooooo = this.f765o000000O;
                                oooO5.f672OooooOO = this.f770o00000Oo;
                            }
                            if (i9 == i6 - 1) {
                                oooO5.OooO0oO(oooO5.f657Oooo0o0, this.f657Oooo0o0, this.f788o00oO0O);
                            }
                            if (i9 > 0 && oooO3 != null) {
                                int i10 = this.f776o0000O00;
                                OooO0o oooO0o4 = oooO3.f657Oooo0o0;
                                oooO5.OooO0oO(oooO0o3, oooO0o4, i10);
                                oooO3.OooO0oO(oooO0o4, oooO0o3, 0);
                            }
                            oooO3 = oooO5;
                        }
                    }
                    for (int i11 = 0; i11 < i5; i11++) {
                        for (int i12 = 0; i12 < i6; i12++) {
                            int i13 = (i12 * i5) + i11;
                            if (this.f786o000OO == 1) {
                                i13 = (i11 * i6) + i12;
                            }
                            OooO[] oooOArr = this.f781o0000OOo;
                            if (i13 < oooOArr.length && (oooO = oooOArr[i13]) != null && oooO.f675Oooooo0 != 8) {
                                OooO oooO6 = this.f778o0000OO[i11];
                                OooO oooO7 = this.f779o0000OO0[i12];
                                if (oooO != oooO6) {
                                    oooO.OooO0oO(oooO.f650Oooo0, oooO6.f650Oooo0, 0);
                                    oooO.OooO0oO(oooO.f655Oooo0OO, oooO6.f655Oooo0OO, 0);
                                }
                                if (oooO != oooO7) {
                                    oooO.OooO0oO(oooO.f654Oooo0O0, oooO7.f654Oooo0O0, 0);
                                    oooO.OooO0oO(oooO.f657Oooo0o0, oooO7.f657Oooo0o0, 0);
                                }
                            }
                        }
                    }
                }
            } else {
                int size2 = arrayList.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    OooOO0O oooOO0O2 = (OooOO0O) arrayList.get(i14);
                    if (i14 == size2 - 1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    oooOO0O2.OooO0O0(i14, z2, z3);
                }
            }
        } else if (arrayList.size() > 0) {
            ((OooOO0O) arrayList.get(0)).OooO0O0(0, z2, true);
        }
        this.o0Oo0oo = false;
    }

    public final void OoooO(OooO oooO, int i, int i2, int i3, int i4) {
        Oooo000 oooo000;
        boolean z;
        OooO oooO2;
        while (true) {
            oooo000 = this.f787o000OOo;
            if (oooo000 != null || (oooO2 = this.f660OoooO) == null) {
                break;
            }
            this.f787o000OOo = ((OooOO0) oooO2).f735o0ooOO0;
        }
        OooOOOO.OooO0O0 oooO0O0 = this.f789o0O0O00;
        oooO0O0.f808OooO00o = i;
        oooO0O0.f809OooO0O0 = i3;
        oooO0O0.f810OooO0OO = i2;
        oooO0O0.f811OooO0Oo = i4;
        oooo000.OooO0O0(oooO, oooO0O0);
        oooO.Oooo0oO(oooO0O0.f813OooO0o0);
        oooO.Oooo0OO(oooO0O0.f812OooO0o);
        oooO.f648OooOooo = oooO0O0.f815OooO0oo;
        int i5 = oooO0O0.f814OooO0oO;
        oooO.f668OoooOoo = i5;
        if (i5 > 0) {
            z = true;
        } else {
            z = false;
        }
        oooO.f648OooOooo = z;
    }

    public final int OoooO0(int i, OooO oooO) {
        if (oooO == null) {
            return 0;
        }
        int[] iArr = oooO.f681o00o0O;
        if (iArr[1] == 3) {
            int i2 = oooO.f636OooOOoo;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (oooO.f642OooOoO * i);
                if (i3 != oooO.OooOO0o()) {
                    oooO.f626OooO0oO = true;
                    OoooO(oooO, iArr[0], oooO.OooOOo0(), 1, i3);
                }
                return i3;
            } else if (i2 == 1) {
                return oooO.OooOO0o();
            } else {
                if (i2 == 3) {
                    return (int) ((oooO.OooOOo0() * oooO.f665OoooOOO) + 0.5f);
                }
            }
        }
        return oooO.OooOO0o();
    }

    public final int OoooO0O(int i, OooO oooO) {
        if (oooO == null) {
            return 0;
        }
        int[] iArr = oooO.f681o00o0O;
        if (iArr[0] == 3) {
            int i2 = oooO.f634OooOOo;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (oooO.f641OooOo0o * i);
                if (i3 != oooO.OooOOo0()) {
                    oooO.f626OooO0oO = true;
                    OoooO(oooO, 1, i3, iArr[1], oooO.OooOO0o());
                }
                return i3;
            } else if (i2 == 1) {
                return oooO.OooOOo0();
            } else {
                if (i2 == 3) {
                    return (int) ((oooO.OooOO0o() * oooO.f665OoooOOO) + 0.5f);
                }
            }
        }
        return oooO.OooOOo0();
    }
}