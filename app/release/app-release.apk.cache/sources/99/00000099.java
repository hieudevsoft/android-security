package OooOOO;

import OooOO0o.o00O0O;
import OooOOOO.Oooo0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o00000.o000;

/* loaded from: classes.dex */
public final class OooO0o {

    /* renamed from: OooO  reason: collision with root package name */
    public o00O0O f712OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f714OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f715OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooO f716OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooO0o f717OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooO0OO f718OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public HashSet f713OooO00o = null;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f719OooO0oO = 0;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f720OooO0oo = Integer.MIN_VALUE;

    public OooO0o(OooO oooO, OooO0OO oooO0OO) {
        this.f716OooO0Oo = oooO;
        this.f718OooO0o0 = oooO0OO;
    }

    public final boolean OooO(OooO0o oooO0o) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (oooO0o == null) {
            return false;
        }
        OooO0OO oooO0OO = OooO0OO.BASELINE;
        OooO0OO oooO0OO2 = this.f718OooO0o0;
        OooO oooO = oooO0o.f716OooO0Oo;
        OooO0OO oooO0OO3 = oooO0o.f718OooO0o0;
        if (oooO0OO3 == oooO0OO2) {
            if (oooO0OO2 == oooO0OO && (!oooO.f648OooOooo || !this.f716OooO0Oo.f648OooOooo)) {
                return false;
            }
            return true;
        }
        int ordinal = oooO0OO2.ordinal();
        OooO0OO oooO0OO4 = OooO0OO.CENTER_Y;
        OooO0OO oooO0OO5 = OooO0OO.RIGHT;
        OooO0OO oooO0OO6 = OooO0OO.CENTER_X;
        OooO0OO oooO0OO7 = OooO0OO.LEFT;
        switch (ordinal) {
            case 0:
            case 7:
            case 8:
                return false;
            case 1:
            case 3:
                if (oooO0OO3 != oooO0OO7 && oooO0OO3 != oooO0OO5) {
                    z = false;
                } else {
                    z = true;
                }
                if (oooO instanceof OooOOO) {
                    if (z || oooO0OO3 == oooO0OO6) {
                        z3 = true;
                    }
                    return z3;
                }
                return z;
            case 2:
            case 4:
                if (oooO0OO3 != OooO0OO.TOP && oooO0OO3 != OooO0OO.BOTTOM) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (oooO instanceof OooOOO) {
                    if (z2 || oooO0OO3 == oooO0OO4) {
                        z3 = true;
                    }
                    return z3;
                }
                return z2;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (oooO0OO3 == oooO0OO7 || oooO0OO3 == oooO0OO5) {
                    return false;
                }
                return true;
            case 6:
                if (oooO0OO3 == oooO0OO || oooO0OO3 == oooO0OO6 || oooO0OO3 == oooO0OO4) {
                    return false;
                }
                return true;
            default:
                throw new AssertionError(oooO0OO2.name());
        }
    }

    public final void OooO00o(OooO0o oooO0o, int i) {
        OooO0O0(oooO0o, i, Integer.MIN_VALUE, false);
    }

    public final boolean OooO0O0(OooO0o oooO0o, int i, int i2, boolean z) {
        if (oooO0o == null) {
            OooOO0();
            return true;
        } else if (z || OooO(oooO0o)) {
            this.f717OooO0o = oooO0o;
            if (oooO0o.f713OooO00o == null) {
                oooO0o.f713OooO00o = new HashSet();
            }
            HashSet hashSet = this.f717OooO0o.f713OooO00o;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f719OooO0oO = i;
            this.f720OooO0oo = i2;
            return true;
        } else {
            return false;
        }
    }

    public final void OooO0OO(int i, Oooo0 oooo0, ArrayList arrayList) {
        HashSet hashSet = this.f713OooO00o;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                o0000O00.OooO00o.o00Oo0(((OooO0o) it.next()).f716OooO0Oo, i, arrayList, oooo0);
            }
        }
    }

    public final int OooO0Oo() {
        if (this.f715OooO0OO) {
            return this.f714OooO0O0;
        }
        return 0;
    }

    public final OooO0o OooO0o() {
        OooO0OO oooO0OO = this.f718OooO0o0;
        int ordinal = oooO0OO.ordinal();
        OooO oooO = this.f716OooO0Oo;
        switch (ordinal) {
            case 0:
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return oooO.f655Oooo0OO;
            case 2:
                return oooO.f657Oooo0o0;
            case 3:
                return oooO.f650Oooo0;
            case 4:
                return oooO.f654Oooo0O0;
            default:
                throw new AssertionError(oooO0OO.name());
        }
    }

    public final int OooO0o0() {
        OooO0o oooO0o;
        if (this.f716OooO0Oo.f675Oooooo0 == 8) {
            return 0;
        }
        int i = this.f720OooO0oo;
        if (i != Integer.MIN_VALUE && (oooO0o = this.f717OooO0o) != null && oooO0o.f716OooO0Oo.f675Oooooo0 == 8) {
            return i;
        }
        return this.f719OooO0oO;
    }

    public final boolean OooO0oO() {
        HashSet hashSet = this.f713OooO00o;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((OooO0o) it.next()).OooO0o().OooO0oo()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooO0oo() {
        return this.f717OooO0o != null;
    }

    public final void OooOO0() {
        HashSet hashSet;
        OooO0o oooO0o = this.f717OooO0o;
        if (oooO0o != null && (hashSet = oooO0o.f713OooO00o) != null) {
            hashSet.remove(this);
            if (this.f717OooO0o.f713OooO00o.size() == 0) {
                this.f717OooO0o.f713OooO00o = null;
            }
        }
        this.f713OooO00o = null;
        this.f717OooO0o = null;
        this.f719OooO0oO = 0;
        this.f720OooO0oo = Integer.MIN_VALUE;
        this.f715OooO0OO = false;
        this.f714OooO0O0 = 0;
    }

    public final void OooOO0O() {
        o00O0O o00o0o = this.f712OooO;
        if (o00o0o == null) {
            this.f712OooO = new o00O0O(1);
        } else {
            o00o0o.OooO0OO();
        }
    }

    public final void OooOO0o(int i) {
        this.f714OooO0O0 = i;
        this.f715OooO0OO = true;
    }

    public final String toString() {
        return this.f716OooO0Oo.f674Oooooo + ":" + this.f718OooO0o0.toString();
    }
}