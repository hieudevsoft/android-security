package OooOO0o;

import OooO0o.OooOOO0;
import OooOOO.OooO0o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOo {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static boolean f577OooOOOo = false;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public static int f578OooOOo0 = 1000;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o000oOoO f582OooO0OO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooOo00[] f584OooO0o;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final OooOOO0 f590OooOO0o;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public OooOo00 f592OooOOOO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f580OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f581OooO0O0 = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f583OooO0Oo = 32;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f585OooO0o0 = 32;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f586OooO0oO = false;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean[] f587OooO0oo = new boolean[32];

    /* renamed from: OooO  reason: collision with root package name */
    public int f579OooO = 1;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f588OooOO0 = 0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f589OooOO0O = 32;
    public o00O0O[] OooOOO0 = new o00O0O[f578OooOOo0];

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f591OooOOO = 0;

    public OooOo() {
        this.f584OooO0o = null;
        this.f584OooO0o = new OooOo00[32];
        OooOo00();
        OooOOO0 oooOOO0 = new OooOOO0(1);
        this.f590OooOO0o = oooOOO0;
        this.f582OooO0OO = new o000oOoO(oooOOO0);
        this.f592OooOOOO = new OooOo00(oooOOO0);
    }

    public static int OooOOOO(OooO0o oooO0o) {
        o00O0O o00o0o = oooO0o.f712OooO;
        if (o00o0o != null) {
            return (int) (o00o0o.f613OooO0o0 + 0.5f);
        }
        return 0;
    }

    public final void OooO(OooOo00 oooOo00) {
        int i;
        if (oooOo00.f597OooO0o0) {
            oooOo00.f593OooO00o.OooO0Oo(this, oooOo00.f594OooO0O0);
        } else {
            OooOo00[] oooOo00Arr = this.f584OooO0o;
            int i2 = this.f588OooOO0;
            oooOo00Arr[i2] = oooOo00;
            o00O0O o00o0o = oooOo00.f593OooO00o;
            o00o0o.f610OooO0OO = i2;
            this.f588OooOO0 = i2 + 1;
            o00o0o.OooO0o0(this, oooOo00);
        }
        if (this.f580OooO00o) {
            int i3 = 0;
            while (i3 < this.f588OooOO0) {
                if (this.f584OooO0o[i3] == null) {
                    System.out.println("WTF");
                }
                OooOo00 oooOo002 = this.f584OooO0o[i3];
                if (oooOo002 != null && oooOo002.f597OooO0o0) {
                    oooOo002.f593OooO00o.OooO0Oo(this, oooOo002.f594OooO0O0);
                    ((Oooo000) this.f590OooOO0o.f270OooO0O0).OooO0O0(oooOo002);
                    this.f584OooO0o[i3] = null;
                    int i4 = i3 + 1;
                    int i5 = i4;
                    while (true) {
                        i = this.f588OooOO0;
                        if (i4 >= i) {
                            break;
                        }
                        OooOo00[] oooOo00Arr2 = this.f584OooO0o;
                        int i6 = i4 - 1;
                        OooOo00 oooOo003 = oooOo00Arr2[i4];
                        oooOo00Arr2[i6] = oooOo003;
                        o00O0O o00o0o2 = oooOo003.f593OooO00o;
                        if (o00o0o2.f610OooO0OO == i4) {
                            o00o0o2.f610OooO0OO = i6;
                        }
                        i5 = i4;
                        i4++;
                    }
                    if (i5 < i) {
                        this.f584OooO0o[i5] = null;
                    }
                    this.f588OooOO0 = i - 1;
                    i3--;
                }
                i3++;
            }
            this.f580OooO00o = false;
        }
    }

    public final o00O0O OooO00o(int i) {
        o00O0O o00o0o = (o00O0O) ((Oooo000) this.f590OooOO0o.f271OooO0OO).OooO00o();
        if (o00o0o == null) {
            o00o0o = new o00O0O(i);
        } else {
            o00o0o.OooO0OO();
        }
        o00o0o.f618OooOO0o = i;
        int i2 = this.f591OooOOO;
        int i3 = f578OooOOo0;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f578OooOOo0 = i4;
            this.OooOOO0 = (o00O0O[]) Arrays.copyOf(this.OooOOO0, i4);
        }
        o00O0O[] o00o0oArr = this.OooOOO0;
        int i5 = this.f591OooOOO;
        this.f591OooOOO = i5 + 1;
        o00o0oArr[i5] = o00o0o;
        return o00o0o;
    }

    public final void OooO0O0(o00O0O o00o0o, o00O0O o00o0o2, int i, float f, o00O0O o00o0o3, o00O0O o00o0o4, int i2, int i3) {
        int i4;
        float f2;
        OooOo00 OooOOO0 = OooOOO0();
        if (o00o0o2 == o00o0o3) {
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, 1.0f);
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o4, 1.0f);
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, -2.0f);
        } else {
            if (f == 0.5f) {
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, 1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, -1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o3, -1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o4, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                    f2 = i4;
                }
            } else if (f <= 0.0f) {
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, -1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, 1.0f);
                f2 = i;
            } else if (f >= 1.0f) {
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o4, -1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o3, 1.0f);
                i4 = -i2;
                f2 = i4;
            } else {
                float f3 = 1.0f - f;
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, f3 * 1.0f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, f3 * (-1.0f));
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o3, (-1.0f) * f);
                OooOOO0.f596OooO0Oo.OooO0o0(o00o0o4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    OooOOO0.f594OooO0O0 = (i2 * f) + ((-i) * f3);
                }
            }
            OooOOO0.f594OooO0O0 = f2;
        }
        if (i3 != 8) {
            OooOOO0.OooO00o(this, i3);
        }
        OooO0OO(OooOOO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
        if (r4.f617OooOO0O <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c2, code lost:
        if (r4.f617OooOO0O <= 1) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c5, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e0, code lost:
        if (r4.f617OooOO0O <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e9, code lost:
        if (r4.f617OooOO0O <= 1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00ec, code lost:
        r14 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(OooOO0o.OooOo00 r17) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0o.OooOo.OooO0OO(OooOO0o.OooOo00):void");
    }

    public final void OooO0Oo(o00O0O o00o0o, int i) {
        OooOo00 OooOOO0;
        OooOOOO oooOOOO;
        float f;
        int i2 = o00o0o.f610OooO0OO;
        if (i2 == -1) {
            o00o0o.OooO0Oo(this, i);
            for (int i3 = 0; i3 < this.f581OooO0O0 + 1; i3++) {
                o00O0O o00o0o2 = ((o00O0O[]) this.f590OooOO0o.f272OooO0Oo)[i3];
            }
            return;
        }
        if (i2 != -1) {
            OooOo00 oooOo00 = this.f584OooO0o[i2];
            if (!oooOo00.f597OooO0o0) {
                if (oooOo00.f596OooO0Oo.OooOO0O() == 0) {
                    oooOo00.f597OooO0o0 = true;
                } else {
                    OooOOO0 = OooOOO0();
                    if (i < 0) {
                        OooOOO0.f594OooO0O0 = i * (-1);
                        oooOOOO = OooOOO0.f596OooO0Oo;
                        f = 1.0f;
                    } else {
                        OooOOO0.f594OooO0O0 = i;
                        oooOOOO = OooOOO0.f596OooO0Oo;
                        f = -1.0f;
                    }
                    oooOOOO.OooO0o0(o00o0o, f);
                }
            }
            oooOo00.f594OooO0O0 = i;
            return;
        }
        OooOOO0 = OooOOO0();
        OooOOO0.f593OooO00o = o00o0o;
        float f2 = i;
        o00o0o.f613OooO0o0 = f2;
        OooOOO0.f594OooO0O0 = f2;
        OooOOO0.f597OooO0o0 = true;
        OooO0OO(OooOOO0);
    }

    public final void OooO0o(o00O0O o00o0o, o00O0O o00o0o2, int i, int i2) {
        OooOo00 OooOOO0 = OooOOO0();
        o00O0O OooOOO2 = OooOOO();
        OooOOO2.f611OooO0Oo = 0;
        OooOOO0.OooO0O0(o00o0o, o00o0o2, OooOOO2, i);
        if (i2 != 8) {
            OooOOO0.f596OooO0Oo.OooO0o0(OooOO0O(i2), (int) (OooOOO0.f596OooO0Oo.OooO0oo(OooOOO2) * (-1.0f)));
        }
        OooO0OO(OooOOO0);
    }

    public final void OooO0o0(o00O0O o00o0o, o00O0O o00o0o2, int i, int i2) {
        if (i2 == 8 && o00o0o2.f612OooO0o && o00o0o.f610OooO0OO == -1) {
            o00o0o.OooO0Oo(this, o00o0o2.f613OooO0o0 + i);
            return;
        }
        OooOo00 OooOOO0 = OooOOO0();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            OooOOO0.f594OooO0O0 = i;
        }
        if (!z) {
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, -1.0f);
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, 1.0f);
        } else {
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, 1.0f);
            OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, -1.0f);
        }
        if (i2 != 8) {
            OooOOO0.OooO00o(this, i2);
        }
        OooO0OO(OooOOO0);
    }

    public final void OooO0oO(o00O0O o00o0o, o00O0O o00o0o2, int i, int i2) {
        OooOo00 OooOOO0 = OooOOO0();
        o00O0O OooOOO2 = OooOOO();
        OooOOO2.f611OooO0Oo = 0;
        OooOOO0.OooO0OO(o00o0o, o00o0o2, OooOOO2, i);
        if (i2 != 8) {
            OooOOO0.f596OooO0Oo.OooO0o0(OooOO0O(i2), (int) (OooOOO0.f596OooO0Oo.OooO0oo(OooOOO2) * (-1.0f)));
        }
        OooO0OO(OooOOO0);
    }

    public final void OooO0oo(o00O0O o00o0o, o00O0O o00o0o2, o00O0O o00o0o3, o00O0O o00o0o4, float f) {
        OooOo00 OooOOO0 = OooOOO0();
        OooOOO0.f596OooO0Oo.OooO0o0(o00o0o, -1.0f);
        OooOOO0.f596OooO0Oo.OooO0o0(o00o0o2, 1.0f);
        OooOOO0.f596OooO0Oo.OooO0o0(o00o0o3, f);
        OooOOO0.f596OooO0Oo.OooO0o0(o00o0o4, -f);
        OooO0OO(OooOOO0);
    }

    public final void OooOO0() {
        for (int i = 0; i < this.f588OooOO0; i++) {
            OooOo00 oooOo00 = this.f584OooO0o[i];
            oooOo00.f593OooO00o.f613OooO0o0 = oooOo00.f594OooO0O0;
        }
    }

    public final o00O0O OooOO0O(int i) {
        if (this.f579OooO + 1 >= this.f585OooO0o0) {
            OooOOOo();
        }
        o00O0O OooO00o2 = OooO00o(4);
        int i2 = this.f581OooO0O0 + 1;
        this.f581OooO0O0 = i2;
        this.f579OooO++;
        OooO00o2.f609OooO0O0 = i2;
        OooO00o2.f611OooO0Oo = i;
        ((o00O0O[]) this.f590OooOO0o.f272OooO0Oo)[i2] = OooO00o2;
        o000oOoO o000oooo = this.f582OooO0OO;
        o000oooo.f603OooO.f1982OooO0O0 = OooO00o2;
        float[] fArr = OooO00o2.f615OooO0oo;
        Arrays.fill(fArr, 0.0f);
        fArr[OooO00o2.f611OooO0Oo] = 1.0f;
        o000oooo.OooOO0(OooO00o2);
        return OooO00o2;
    }

    public final o00O0O OooOO0o(Object obj) {
        o00O0O o00o0o = null;
        if (obj == null) {
            return null;
        }
        if (this.f579OooO + 1 >= this.f585OooO0o0) {
            OooOOOo();
        }
        if (obj instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) obj;
            o00o0o = oooO0o.f712OooO;
            if (o00o0o == null) {
                oooO0o.OooOO0O();
                o00o0o = oooO0o.f712OooO;
            }
            int i = o00o0o.f609OooO0O0;
            OooOOO0 oooOOO0 = this.f590OooOO0o;
            if (i == -1 || i > this.f581OooO0O0 || ((o00O0O[]) oooOOO0.f272OooO0Oo)[i] == null) {
                if (i != -1) {
                    o00o0o.OooO0OO();
                }
                int i2 = this.f581OooO0O0 + 1;
                this.f581OooO0O0 = i2;
                this.f579OooO++;
                o00o0o.f609OooO0O0 = i2;
                o00o0o.f618OooOO0o = 1;
                ((o00O0O[]) oooOOO0.f272OooO0Oo)[i2] = o00o0o;
            }
        }
        return o00o0o;
    }

    public final o00O0O OooOOO() {
        if (this.f579OooO + 1 >= this.f585OooO0o0) {
            OooOOOo();
        }
        o00O0O OooO00o2 = OooO00o(3);
        int i = this.f581OooO0O0 + 1;
        this.f581OooO0O0 = i;
        this.f579OooO++;
        OooO00o2.f609OooO0O0 = i;
        ((o00O0O[]) this.f590OooOO0o.f272OooO0Oo)[i] = OooO00o2;
        return OooO00o2;
    }

    public final OooOo00 OooOOO0() {
        OooOOO0 oooOOO0 = this.f590OooOO0o;
        OooOo00 oooOo00 = (OooOo00) ((Oooo000) oooOOO0.f270OooO0O0).OooO00o();
        if (oooOo00 == null) {
            return new OooOo00(oooOOO0);
        }
        oooOo00.f593OooO00o = null;
        oooOo00.f596OooO0Oo.clear();
        oooOo00.f594OooO0O0 = 0.0f;
        oooOo00.f597OooO0o0 = false;
        return oooOo00;
    }

    public final void OooOOOo() {
        int i = this.f583OooO0Oo * 2;
        this.f583OooO0Oo = i;
        this.f584OooO0o = (OooOo00[]) Arrays.copyOf(this.f584OooO0o, i);
        OooOOO0 oooOOO0 = this.f590OooOO0o;
        oooOOO0.f272OooO0Oo = (o00O0O[]) Arrays.copyOf((o00O0O[]) oooOOO0.f272OooO0Oo, this.f583OooO0Oo);
        int i2 = this.f583OooO0Oo;
        this.f587OooO0oo = new boolean[i2];
        this.f585OooO0o0 = i2;
        this.f589OooOO0O = i2;
    }

    public final void OooOOo(o000oOoO o000oooo) {
        float f;
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            f = 0.0f;
            i = 1;
            if (i2 < this.f588OooOO0) {
                OooOo00 oooOo00 = this.f584OooO0o[i2];
                if (oooOo00.f593OooO00o.f618OooOO0o != 1 && oooOo00.f594OooO0O0 < 0.0f) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3 += i;
                float f2 = Float.MAX_VALUE;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                int i7 = 0;
                while (i6 < this.f588OooOO0) {
                    OooOo00 oooOo002 = this.f584OooO0o[i6];
                    if (oooOo002.f593OooO00o.f618OooOO0o != i && !oooOo002.f597OooO0o0 && oooOo002.f594OooO0O0 < f) {
                        int OooOO0O2 = oooOo002.f596OooO0Oo.OooOO0O();
                        int i8 = 0;
                        while (i8 < OooOO0O2) {
                            o00O0O OooO0O02 = oooOo002.f596OooO0Oo.OooO0O0(i8);
                            float OooO0oo2 = oooOo002.f596OooO0Oo.OooO0oo(OooO0O02);
                            if (OooO0oo2 > f) {
                                for (int i9 = 0; i9 < 9; i9++) {
                                    float f3 = OooO0O02.f614OooO0oO[i9] / OooO0oo2;
                                    if ((f3 < f2 && i9 == i7) || i9 > i7) {
                                        i5 = OooO0O02.f609OooO0O0;
                                        i7 = i9;
                                        f2 = f3;
                                        i4 = i6;
                                    }
                                }
                            }
                            i8++;
                            f = 0.0f;
                        }
                    }
                    i6++;
                    f = 0.0f;
                    i = 1;
                }
                if (i4 != -1) {
                    OooOo00 oooOo003 = this.f584OooO0o[i4];
                    oooOo003.f593OooO00o.f610OooO0OO = -1;
                    oooOo003.OooO0oO(((o00O0O[]) this.f590OooOO0o.f272OooO0Oo)[i5]);
                    o00O0O o00o0o = oooOo003.f593OooO00o;
                    o00o0o.f610OooO0OO = i4;
                    o00o0o.OooO0o0(this, oooOo003);
                } else {
                    z2 = true;
                }
                if (i3 > this.f579OooO / 2) {
                    z2 = true;
                }
                f = 0.0f;
                i = 1;
            }
        }
        OooOOoo(o000oooo);
        OooOO0();
    }

    public final void OooOOo0() {
        o000oOoO o000oooo = this.f582OooO0OO;
        if (o000oooo.OooO0o0()) {
            OooOO0();
            return;
        }
        if (this.f586OooO0oO) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.f588OooOO0) {
                    z = true;
                    break;
                } else if (!this.f584OooO0o[i].f597OooO0o0) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                OooOO0();
                return;
            }
        }
        OooOOo(o000oooo);
    }

    public final void OooOOoo(OooOo00 oooOo00) {
        for (int i = 0; i < this.f579OooO; i++) {
            this.f587OooO0oo[i] = false;
        }
        boolean z = false;
        int i2 = 0;
        while (!z) {
            i2++;
            if (i2 >= this.f579OooO * 2) {
                return;
            }
            o00O0O o00o0o = oooOo00.f593OooO00o;
            if (o00o0o != null) {
                this.f587OooO0oo[o00o0o.f609OooO0O0] = true;
            }
            o00O0O OooO0Oo2 = oooOo00.OooO0Oo(this.f587OooO0oo);
            if (OooO0Oo2 != null) {
                boolean[] zArr = this.f587OooO0oo;
                int i3 = OooO0Oo2.f609OooO0O0;
                if (zArr[i3]) {
                    return;
                }
                zArr[i3] = true;
            }
            if (OooO0Oo2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.f588OooOO0; i5++) {
                    OooOo00 oooOo002 = this.f584OooO0o[i5];
                    if (oooOo002.f593OooO00o.f618OooOO0o != 1 && !oooOo002.f597OooO0o0 && oooOo002.f596OooO0Oo.OooO0OO(OooO0Oo2)) {
                        float OooO0oo2 = oooOo002.f596OooO0Oo.OooO0oo(OooO0Oo2);
                        if (OooO0oo2 < 0.0f) {
                            float f2 = (-oooOo002.f594OooO0O0) / OooO0oo2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    OooOo00 oooOo003 = this.f584OooO0o[i4];
                    oooOo003.f593OooO00o.f610OooO0OO = -1;
                    oooOo003.OooO0oO(OooO0Oo2);
                    o00O0O o00o0o2 = oooOo003.f593OooO00o;
                    o00o0o2.f610OooO0OO = i4;
                    o00o0o2.OooO0o0(this, oooOo003);
                }
            } else {
                z = true;
            }
        }
    }

    public final void OooOo0() {
        OooOOO0 oooOOO0;
        int i = 0;
        while (true) {
            oooOOO0 = this.f590OooOO0o;
            o00O0O[] o00o0oArr = (o00O0O[]) oooOOO0.f272OooO0Oo;
            if (i >= o00o0oArr.length) {
                break;
            }
            o00O0O o00o0o = o00o0oArr[i];
            if (o00o0o != null) {
                o00o0o.OooO0OO();
            }
            i++;
        }
        Oooo000 oooo000 = (Oooo000) oooOOO0.f271OooO0OO;
        o00O0O[] o00o0oArr2 = this.OooOOO0;
        int i2 = this.f591OooOOO;
        oooo000.getClass();
        if (i2 > o00o0oArr2.length) {
            i2 = o00o0oArr2.length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            o00O0O o00o0o2 = o00o0oArr2[i3];
            int i4 = oooo000.f602OooO0OO;
            Object[] objArr = oooo000.f601OooO0O0;
            if (i4 < objArr.length) {
                objArr[i4] = o00o0o2;
                oooo000.f602OooO0OO = i4 + 1;
            }
        }
        this.f591OooOOO = 0;
        Arrays.fill((o00O0O[]) oooOOO0.f272OooO0Oo, (Object) null);
        this.f581OooO0O0 = 0;
        o000oOoO o000oooo = this.f582OooO0OO;
        o000oooo.f606OooO0oo = 0;
        o000oooo.f594OooO0O0 = 0.0f;
        this.f579OooO = 1;
        for (int i5 = 0; i5 < this.f588OooOO0; i5++) {
            OooOo00 oooOo00 = this.f584OooO0o[i5];
        }
        OooOo00();
        this.f588OooOO0 = 0;
        this.f592OooOOOO = new OooOo00(oooOOO0);
    }

    public final void OooOo00() {
        for (int i = 0; i < this.f588OooOO0; i++) {
            OooOo00 oooOo00 = this.f584OooO0o[i];
            if (oooOo00 != null) {
                ((Oooo000) this.f590OooOO0o.f270OooO0O0).OooO0O0(oooOo00);
            }
            this.f584OooO0o[i] = null;
        }
    }
}