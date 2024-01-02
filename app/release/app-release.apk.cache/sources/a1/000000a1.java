package OooOOOO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO.OooOO0 f799OooO00o;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOOO.OooOO0 f802OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Oooo000 f803OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final OooO0O0 f805OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f806OooO0oo;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f800OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f801OooO0OO = true;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final ArrayList f804OooO0o0 = new ArrayList();

    public OooO(OooOOO.OooOO0 oooOO0) {
        new ArrayList();
        this.f803OooO0o = null;
        this.f805OooO0oO = new OooO0O0();
        this.f806OooO0oo = new ArrayList();
        this.f799OooO00o = oooOO0;
        this.f802OooO0Oo = oooOO0;
    }

    public final void OooO00o(OooOO0 oooOO0, int i, int i2, ArrayList arrayList, OooOo00 oooOo00) {
        o000oOoO o000oooo = oooOO0.f823OooO0Oo;
        if (o000oooo.f853OooO0OO == null) {
            OooOOO.OooOO0 oooOO02 = this.f799OooO00o;
            if (o000oooo != oooOO02.f623OooO0Oo && o000oooo != oooOO02.f625OooO0o0) {
                if (oooOo00 == null) {
                    oooOo00 = new OooOo00(o000oooo);
                    arrayList.add(oooOo00);
                }
                o000oooo.f853OooO0OO = oooOo00;
                oooOo00.f835OooO0O0.add(o000oooo);
                OooOO0 oooOO03 = o000oooo.f858OooO0oo;
                Iterator it = oooOO03.f829OooOO0O.iterator();
                while (it.hasNext()) {
                    OooO0o oooO0o = (OooO0o) it.next();
                    if (oooO0o instanceof OooOO0) {
                        OooO00o((OooOO0) oooO0o, i, 0, arrayList, oooOo00);
                    }
                }
                OooOO0 oooOO04 = o000oooo.f850OooO;
                Iterator it2 = oooOO04.f829OooOO0O.iterator();
                while (it2.hasNext()) {
                    OooO0o oooO0o2 = (OooO0o) it2.next();
                    if (oooO0o2 instanceof OooOO0) {
                        OooO00o((OooOO0) oooO0o2, i, 1, arrayList, oooOo00);
                    }
                }
                if (i == 1 && (o000oooo instanceof OooOo)) {
                    Iterator it3 = ((OooOo) o000oooo).f832OooOO0O.f829OooOO0O.iterator();
                    while (it3.hasNext()) {
                        OooO0o oooO0o3 = (OooO0o) it3.next();
                        if (oooO0o3 instanceof OooOO0) {
                            OooO00o((OooOO0) oooO0o3, i, 2, arrayList, oooOo00);
                        }
                    }
                }
                Iterator it4 = oooOO03.f830OooOO0o.iterator();
                while (it4.hasNext()) {
                    OooO00o((OooOO0) it4.next(), i, 0, arrayList, oooOo00);
                }
                Iterator it5 = oooOO04.f830OooOO0o.iterator();
                while (it5.hasNext()) {
                    OooO00o((OooOO0) it5.next(), i, 1, arrayList, oooOo00);
                }
                if (i == 1 && (o000oooo instanceof OooOo)) {
                    Iterator it6 = ((OooOo) o000oooo).f832OooOO0O.f830OooOO0o.iterator();
                    while (it6.hasNext()) {
                        OooO00o((OooOO0) it6.next(), i, 2, arrayList, oooOo00);
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r2.f636OooOOoo == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(OooOOO.OooOO0 r17) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOOO.OooO.OooO0O0(OooOOO.OooOO0):void");
    }

    public final void OooO0OO() {
        OooO0o oooOOO0;
        ArrayList arrayList = this.f804OooO0o0;
        arrayList.clear();
        OooOOO.OooOO0 oooOO0 = this.f802OooO0Oo;
        oooOO0.f623OooO0Oo.OooO0o();
        oooOO0.f625OooO0o0.OooO0o();
        arrayList.add(oooOO0.f623OooO0Oo);
        arrayList.add(oooOO0.f625OooO0o0);
        Iterator it = oooOO0.f796o00ooo.iterator();
        HashSet hashSet = null;
        while (it.hasNext()) {
            OooOOO.OooO oooO = (OooOOO.OooO) it.next();
            if (oooO instanceof OooOOO.OooOOO) {
                oooOOO0 = new OooOOO0(oooO);
            } else {
                if (oooO.OooOo()) {
                    if (oooO.f621OooO0O0 == null) {
                        oooO.f621OooO0O0 = new OooO0OO(0, oooO);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(oooO.f621OooO0O0);
                } else {
                    arrayList.add(oooO.f623OooO0Oo);
                }
                if (oooO.OooOoO0()) {
                    if (oooO.f622OooO0OO == null) {
                        oooO.f622OooO0OO = new OooO0OO(1, oooO);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(oooO.f622OooO0OO);
                } else {
                    arrayList.add(oooO.f625OooO0o0);
                }
                if (oooO instanceof OooOOO.OooOo00) {
                    oooOOO0 = new OooOOO(oooO);
                }
            }
            arrayList.add(oooOOO0);
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((o000oOoO) it2.next()).OooO0o();
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o000oOoO o000oooo = (o000oOoO) it3.next();
            if (o000oooo.f852OooO0O0 != oooOO0) {
                o000oooo.OooO0Oo();
            }
        }
        ArrayList arrayList2 = this.f806OooO0oo;
        arrayList2.clear();
        OooOOO.OooOO0 oooOO02 = this.f799OooO00o;
        OooO0o0(oooOO02.f623OooO0Oo, 0, arrayList2);
        OooO0o0(oooOO02.f625OooO0o0, 1, arrayList2);
        this.f800OooO0O0 = false;
    }

    public final int OooO0Oo(OooOOO.OooOO0 oooOO0, int i) {
        int i2;
        long j;
        long j2;
        ArrayList arrayList;
        o000oOoO o000oooo;
        o000oOoO o000oooo2;
        long j3;
        long j4;
        long j5;
        float f;
        long j6;
        OooOOO.OooOO0 oooOO02 = oooOO0;
        ArrayList arrayList2 = this.f806OooO0oo;
        int size = arrayList2.size();
        int i3 = 0;
        long j7 = 0;
        while (i3 < size) {
            o000oOoO o000oooo3 = ((OooOo00) arrayList2.get(i3)).f834OooO00o;
            if (!(o000oooo3 instanceof OooO0OO) ? !(i != 0 ? (o000oooo3 instanceof OooOo) : (o000oooo3 instanceof OooOOOO)) : ((OooO0OO) o000oooo3).f855OooO0o != i) {
                i2 = size;
                j = j7;
                j2 = 0;
                arrayList = arrayList2;
            } else {
                if (i == 0) {
                    o000oooo = oooOO02.f623OooO0Oo;
                } else {
                    o000oooo = oooOO02.f625OooO0o0;
                }
                OooOO0 oooOO03 = o000oooo.f858OooO0oo;
                if (i == 0) {
                    o000oooo2 = oooOO02.f623OooO0Oo;
                } else {
                    o000oooo2 = oooOO02.f625OooO0o0;
                }
                OooOO0 oooOO04 = o000oooo2.f850OooO;
                boolean contains = o000oooo3.f858OooO0oo.f830OooOO0o.contains(oooOO03);
                OooOO0 oooOO05 = o000oooo3.f850OooO;
                boolean contains2 = oooOO05.f830OooOO0o.contains(oooOO04);
                long OooOO02 = o000oooo3.OooOO0();
                OooOO0 oooOO06 = o000oooo3.f858OooO0oo;
                if (contains && contains2) {
                    long OooO0O02 = OooOo00.OooO0O0(oooOO06, 0L);
                    ArrayList arrayList3 = arrayList2;
                    i2 = size;
                    long OooO00o2 = OooOo00.OooO00o(oooOO05, 0L);
                    long j8 = OooO0O02 - OooOO02;
                    int i4 = oooOO05.f824OooO0o;
                    j3 = j7;
                    arrayList = arrayList3;
                    if (j8 >= (-i4)) {
                        j8 += i4;
                    }
                    long j9 = oooOO06.f824OooO0o;
                    long j10 = ((-OooO00o2) - OooOO02) - j9;
                    if (j10 >= j9) {
                        j10 -= j9;
                    }
                    OooOOO.OooO oooO = o000oooo3.f852OooO0O0;
                    if (i == 0) {
                        f = oooO.f671OooooO0;
                    } else if (i == 1) {
                        f = oooO.f672OooooOO;
                    } else {
                        oooO.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j6 = (((float) j8) / (1.0f - f)) + (((float) j10) / f);
                    } else {
                        j6 = 0;
                    }
                    float f2 = (float) j6;
                    j2 = (oooOO06.f824OooO0o + ((((f2 * f) + 0.5f) + OooOO02) + (((1.0f - f) * f2) + 0.5f))) - oooOO05.f824OooO0o;
                } else {
                    i2 = size;
                    j3 = j7;
                    arrayList = arrayList2;
                    if (contains) {
                        j5 = OooOo00.OooO0O0(oooOO06, oooOO06.f824OooO0o);
                        j4 = oooOO06.f824OooO0o + OooOO02;
                    } else if (contains2) {
                        j4 = (-oooOO05.f824OooO0o) + OooOO02;
                        j5 = -OooOo00.OooO00o(oooOO05, oooOO05.f824OooO0o);
                    } else {
                        j2 = (o000oooo3.OooOO0() + oooOO06.f824OooO0o) - oooOO05.f824OooO0o;
                    }
                    j2 = Math.max(j5, j4);
                }
                j = j3;
            }
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j7 = Math.max(j, j2);
            oooOO02 = oooOO0;
        }
        return (int) j7;
    }

    public final void OooO0o(OooOOO.OooO oooO, int i, int i2, int i3, int i4) {
        boolean z;
        OooO0O0 oooO0O0 = this.f805OooO0oO;
        oooO0O0.f808OooO00o = i;
        oooO0O0.f809OooO0O0 = i3;
        oooO0O0.f810OooO0OO = i2;
        oooO0O0.f811OooO0Oo = i4;
        this.f803OooO0o.OooO0O0(oooO, oooO0O0);
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

    public final void OooO0o0(o000oOoO o000oooo, int i, ArrayList arrayList) {
        OooOO0 oooOO0;
        OooOO0 oooOO02;
        OooOO0 oooOO03;
        Iterator it = o000oooo.f858OooO0oo.f829OooOO0O.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            oooOO0 = o000oooo.f850OooO;
            if (!hasNext) {
                break;
            }
            OooO0o oooO0o = (OooO0o) it.next();
            if (oooO0o instanceof OooOO0) {
                oooOO03 = (OooOO0) oooO0o;
            } else if (oooO0o instanceof o000oOoO) {
                oooOO03 = ((o000oOoO) oooO0o).f858OooO0oo;
            }
            OooO00o(oooOO03, i, 0, arrayList, null);
        }
        Iterator it2 = oooOO0.f829OooOO0O.iterator();
        while (it2.hasNext()) {
            OooO0o oooO0o2 = (OooO0o) it2.next();
            if (oooO0o2 instanceof OooOO0) {
                oooOO02 = (OooOO0) oooO0o2;
            } else if (oooO0o2 instanceof o000oOoO) {
                oooOO02 = ((o000oOoO) oooO0o2).f850OooO;
            }
            OooO00o(oooOO02, i, 1, arrayList, null);
        }
        if (i == 1) {
            Iterator it3 = ((OooOo) o000oooo).f832OooOO0O.f829OooOO0O.iterator();
            while (it3.hasNext()) {
                OooO0o oooO0o3 = (OooO0o) it3.next();
                if (oooO0o3 instanceof OooOO0) {
                    OooO00o((OooOO0) oooO0o3, i, 2, arrayList, null);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006c, code lost:
        if (r10 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r8 == 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        r2.OooOOO0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008b, code lost:
        r2.OooO0Oo(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oO() {
        /*
            r13 = this;
            OooOOO.OooOO0 r0 = r13.f799OooO00o
            java.util.ArrayList r0 = r0.f796o00ooo
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La1
            java.lang.Object r1 = r0.next()
            OooOOO.OooO r1 = (OooOOO.OooO) r1
            boolean r2 = r1.f620OooO00o
            if (r2 == 0) goto L19
            goto L8
        L19:
            int[] r2 = r1.f681o00o0O
            r3 = 0
            r8 = r2[r3]
            r9 = 1
            r10 = r2[r9]
            int r2 = r1.f634OooOOo
            int r4 = r1.f636OooOOoo
            r5 = 2
            r11 = 3
            if (r8 == r5) goto L30
            if (r8 != r11) goto L2e
            if (r2 != r9) goto L2e
            goto L30
        L2e:
            r2 = r3
            goto L31
        L30:
            r2 = r9
        L31:
            if (r10 == r5) goto L37
            if (r10 != r11) goto L38
            if (r4 != r9) goto L38
        L37:
            r3 = r9
        L38:
            OooOOOO.OooOOOO r4 = r1.f623OooO0Oo
            OooOOOO.OooOO0O r4 = r4.f856OooO0o0
            boolean r5 = r4.f828OooOO0
            OooOOOO.OooOo r6 = r1.f625OooO0o0
            OooOOOO.OooOO0O r6 = r6.f856OooO0o0
            boolean r7 = r6.f828OooOO0
            r12 = 1
            if (r5 == 0) goto L55
            if (r7 == 0) goto L55
            int r5 = r4.f826OooO0oO
            int r7 = r6.f826OooO0oO
            r6 = 1
            r2 = r13
            r3 = r1
            r4 = r6
            r2.OooO0o(r3, r4, r5, r6, r7)
            goto L8e
        L55:
            if (r5 == 0) goto L6f
            if (r3 == 0) goto L6f
            int r5 = r4.f826OooO0oO
            int r7 = r6.f826OooO0oO
            r4 = 1
            r6 = 2
            r2 = r13
            r3 = r1
            r2.OooO0o(r3, r4, r5, r6, r7)
            OooOOOO.OooOo r2 = r1.f625OooO0o0
            OooOOOO.OooOO0O r2 = r2.f856OooO0o0
            int r3 = r1.OooOO0o()
            if (r10 != r11) goto L8b
            goto L88
        L6f:
            if (r7 == 0) goto L90
            if (r2 == 0) goto L90
            int r5 = r4.f826OooO0oO
            int r7 = r6.f826OooO0oO
            r4 = 2
            r2 = r13
            r3 = r1
            r6 = r12
            r2.OooO0o(r3, r4, r5, r6, r7)
            OooOOOO.OooOOOO r2 = r1.f623OooO0Oo
            OooOOOO.OooOO0O r2 = r2.f856OooO0o0
            int r3 = r1.OooOOo0()
            if (r8 != r11) goto L8b
        L88:
            r2.OooOOO0 = r3
            goto L90
        L8b:
            r2.OooO0Oo(r3)
        L8e:
            r1.f620OooO00o = r9
        L90:
            boolean r2 = r1.f620OooO00o
            if (r2 == 0) goto L8
            OooOOOO.OooOo r2 = r1.f625OooO0o0
            OooOOOO.OooO00o r2 = r2.f833OooOO0o
            if (r2 == 0) goto L8
            int r1 = r1.f668OoooOoo
            r2.OooO0Oo(r1)
            goto L8
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOOO.OooO.OooO0oO():void");
    }
}