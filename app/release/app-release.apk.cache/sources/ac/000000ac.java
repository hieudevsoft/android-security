package OooOOOO;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooOo00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000oOoO f834OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f835OooO0O0 = new ArrayList();

    public OooOo00(o000oOoO o000oooo) {
        this.f834OooO00o = null;
        this.f834OooO00o = o000oooo;
    }

    public static long OooO00o(OooOO0 oooOO0, long j) {
        o000oOoO o000oooo = oooOO0.f823OooO0Oo;
        if (o000oooo instanceof OooOOO) {
            return j;
        }
        ArrayList arrayList = oooOO0.f829OooOO0O;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i);
            if (oooO0o instanceof OooOO0) {
                OooOO0 oooOO02 = (OooOO0) oooO0o;
                if (oooOO02.f823OooO0Oo != o000oooo) {
                    j2 = Math.min(j2, OooO00o(oooOO02, oooOO02.f824OooO0o + j));
                }
            }
        }
        if (oooOO0 == o000oooo.f850OooO) {
            long OooOO02 = o000oooo.OooOO0();
            OooOO0 oooOO03 = o000oooo.f858OooO0oo;
            long j3 = j - OooOO02;
            return Math.min(Math.min(j2, OooO00o(oooOO03, j3)), j3 - oooOO03.f824OooO0o);
        }
        return j2;
    }

    public static long OooO0O0(OooOO0 oooOO0, long j) {
        o000oOoO o000oooo = oooOO0.f823OooO0Oo;
        if (o000oooo instanceof OooOOO) {
            return j;
        }
        ArrayList arrayList = oooOO0.f829OooOO0O;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            OooO0o oooO0o = (OooO0o) arrayList.get(i);
            if (oooO0o instanceof OooOO0) {
                OooOO0 oooOO02 = (OooOO0) oooO0o;
                if (oooOO02.f823OooO0Oo != o000oooo) {
                    j2 = Math.max(j2, OooO0O0(oooOO02, oooOO02.f824OooO0o + j));
                }
            }
        }
        if (oooOO0 == o000oooo.f858OooO0oo) {
            long OooOO02 = o000oooo.OooOO0();
            OooOO0 oooOO03 = o000oooo.f850OooO;
            long j3 = j + OooOO02;
            return Math.max(Math.max(j2, OooO0O0(oooOO03, j3)), j3 - oooOO03.f824OooO0o);
        }
        return j2;
    }
}