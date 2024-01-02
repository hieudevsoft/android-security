package OooOOOO;

/* loaded from: classes.dex */
public abstract class o000oOoO implements OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f851OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooOOO.OooO f852OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public OooOo00 f853OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f854OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooOO0O f856OooO0o0 = new OooOO0O(this);

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f855OooO0o = 0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f857OooO0oO = false;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final OooOO0 f858OooO0oo = new OooOO0(this);

    /* renamed from: OooO  reason: collision with root package name */
    public final OooOO0 f850OooO = new OooOO0(this);

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f859OooOO0 = 1;

    public o000oOoO(OooOOO.OooO oooO) {
        this.f852OooO0O0 = oooO;
    }

    public static OooOO0 OooO(OooOOO.OooO0o oooO0o, int i) {
        OooOOO.OooO0o oooO0o2 = oooO0o.f717OooO0o;
        if (oooO0o2 == null) {
            return null;
        }
        OooOOO.OooO oooO = oooO0o2.f716OooO0Oo;
        o000oOoO o000oooo = i == 0 ? oooO.f623OooO0Oo : oooO.f625OooO0o0;
        int ordinal = oooO0o2.f718OooO0o0.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return o000oooo.f858OooO0oo;
        }
        if (ordinal == 3 || ordinal == 4) {
            return o000oooo.f850OooO;
        }
        return null;
    }

    public static void OooO0O0(OooOO0 oooOO0, OooOO0 oooOO02, int i) {
        oooOO0.f830OooOO0o.add(oooOO02);
        oooOO0.f824OooO0o = i;
        oooOO02.f829OooOO0O.add(oooOO0);
    }

    public static OooOO0 OooO0oo(OooOOO.OooO0o oooO0o) {
        o000oOoO o000oooo;
        o000oOoO o000oooo2;
        OooOOO.OooO0o oooO0o2 = oooO0o.f717OooO0o;
        if (oooO0o2 == null) {
            return null;
        }
        int ordinal = oooO0o2.f718OooO0o0.ordinal();
        OooOOO.OooO oooO = oooO0o2.f716OooO0Oo;
        if (ordinal == 1) {
            o000oooo = oooO.f623OooO0Oo;
        } else if (ordinal != 2) {
            if (ordinal == 3) {
                o000oooo2 = oooO.f623OooO0Oo;
            } else if (ordinal != 4) {
                if (ordinal != 5) {
                    return null;
                }
                return oooO.f625OooO0o0.f832OooOO0O;
            } else {
                o000oooo2 = oooO.f625OooO0o0;
            }
            return o000oooo2.f850OooO;
        } else {
            o000oooo = oooO.f625OooO0o0;
        }
        return o000oooo.f858OooO0oo;
    }

    public final void OooO0OO(OooOO0 oooOO0, OooOO0 oooOO02, int i, OooOO0O oooOO0O) {
        oooOO0.f830OooOO0o.add(oooOO02);
        oooOO0.f830OooOO0o.add(this.f856OooO0o0);
        oooOO0.f827OooO0oo = i;
        oooOO0.f819OooO = oooOO0O;
        oooOO02.f829OooOO0O.add(oooOO0);
        oooOO0O.f829OooOO0O.add(oooOO0);
    }

    public abstract void OooO0Oo();

    public abstract void OooO0o();

    public abstract void OooO0o0();

    public final int OooO0oO(int i, int i2) {
        int max;
        if (i2 == 0) {
            OooOOO.OooO oooO = this.f852OooO0O0;
            int i3 = oooO.f640OooOo0O;
            max = Math.max(oooO.f638OooOo0, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            OooOOO.OooO oooO2 = this.f852OooO0O0;
            int i4 = oooO2.f643OooOoO0;
            max = Math.max(oooO2.f637OooOo, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    public long OooOO0() {
        OooOO0O oooOO0O = this.f856OooO0o0;
        if (oooOO0O.f828OooOO0) {
            return oooOO0O.f826OooO0oO;
        }
        return 0L;
    }

    public abstract boolean OooOO0O();

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (r9.f851OooO00o == 3) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0o(OooOOO.OooO0o r12, OooOOO.OooO0o r13, int r14) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOOO.o000oOoO.OooOO0o(OooOOO.OooO0o, OooOOO.OooO0o, int):void");
    }
}