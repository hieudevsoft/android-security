package OooOOO;

import OooOOOO.Oooo000;
import OooOOOO.o000oOoO;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOO0 extends OooOo {

    /* renamed from: o00oO0O  reason: collision with root package name */
    public int f731o00oO0O;

    /* renamed from: o0OOO0o  reason: collision with root package name */
    public int f734o0OOO0o;
    public int o0Oo0oo;

    /* renamed from: oo000o  reason: collision with root package name */
    public final androidx.activity.result.OooO0o f738oo000o = new androidx.activity.result.OooO0o(this);
    public final OooOOOO.OooO o00oO0o = new OooOOOO.OooO(this);

    /* renamed from: o0ooOO0  reason: collision with root package name */
    public Oooo000 f735o0ooOO0 = null;

    /* renamed from: o0ooOOo  reason: collision with root package name */
    public boolean f736o0ooOOo = false;

    /* renamed from: o0ooOoO  reason: collision with root package name */
    public final OooOO0o.OooOo f737o0ooOoO = new OooOO0o.OooOo();

    /* renamed from: o0OO00O  reason: collision with root package name */
    public int f733o0OO00O = 0;

    /* renamed from: oo0o0Oo  reason: collision with root package name */
    public int f739oo0o0Oo = 0;

    /* renamed from: o0O0O00  reason: collision with root package name */
    public OooO0O0[] f732o0O0O00 = new OooO0O0[4];

    /* renamed from: o000OOo  reason: collision with root package name */
    public OooO0O0[] f730o000OOo = new OooO0O0[4];

    /* renamed from: o000000  reason: collision with root package name */
    public int f722o000000 = 257;

    /* renamed from: o000000O  reason: collision with root package name */
    public boolean f723o000000O = false;

    /* renamed from: o000000o  reason: collision with root package name */
    public boolean f724o000000o = false;

    /* renamed from: o00000  reason: collision with root package name */
    public WeakReference f721o00000 = null;

    /* renamed from: o00000O0  reason: collision with root package name */
    public WeakReference f726o00000O0 = null;

    /* renamed from: o00000O  reason: collision with root package name */
    public WeakReference f725o00000O = null;

    /* renamed from: o00000OO  reason: collision with root package name */
    public WeakReference f727o00000OO = null;

    /* renamed from: o00000Oo  reason: collision with root package name */
    public final HashSet f728o00000Oo = new HashSet();

    /* renamed from: o00000o0  reason: collision with root package name */
    public final OooOOOO.OooO0O0 f729o00000o0 = new OooOOOO.OooO0O0();

    public static void OoooOO0(OooO oooO, Oooo000 oooo000, OooOOOO.OooO0O0 oooO0O0) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        int i2;
        int i3;
        if (oooo000 == null) {
            return;
        }
        if (oooO.f675Oooooo0 != 8 && !(oooO instanceof OooOOO) && !(oooO instanceof OooO00o)) {
            int[] iArr = oooO.f681o00o0O;
            oooO0O0.f808OooO00o = iArr[0];
            boolean z5 = true;
            oooO0O0.f809OooO0O0 = iArr[1];
            oooO0O0.f810OooO0OO = oooO.OooOOo0();
            oooO0O0.f811OooO0Oo = oooO.OooOO0o();
            oooO0O0.f807OooO = false;
            oooO0O0.f816OooOO0 = 0;
            if (oooO0O0.f808OooO00o == 3) {
                z = true;
            } else {
                z = false;
            }
            if (oooO0O0.f809OooO0O0 == 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z && oooO.f665OoooOOO > 0.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && oooO.f665OoooOOO > 0.0f) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z && oooO.OooOo00(0) && oooO.f634OooOOo == 0 && !z3) {
                oooO0O0.f808OooO00o = 2;
                if (z2 && oooO.f636OooOOoo == 0) {
                    oooO0O0.f808OooO00o = 1;
                }
                z = false;
            }
            if (z2 && oooO.OooOo00(1) && oooO.f636OooOOoo == 0 && !z4) {
                oooO0O0.f809OooO0O0 = 2;
                if (z && oooO.f634OooOOo == 0) {
                    oooO0O0.f809OooO0O0 = 1;
                }
                z2 = false;
            }
            if (oooO.OooOoOO()) {
                oooO0O0.f808OooO00o = 1;
                z = false;
            }
            if (oooO.OooOoo0()) {
                oooO0O0.f809OooO0O0 = 1;
                z2 = false;
            }
            int[] iArr2 = oooO.f639OooOo00;
            if (z3) {
                if (iArr2[0] == 4) {
                    oooO0O0.f808OooO00o = 1;
                } else if (!z2) {
                    if (oooO0O0.f809OooO0O0 == 1) {
                        i3 = oooO0O0.f811OooO0Oo;
                    } else {
                        oooO0O0.f808OooO00o = 2;
                        oooo000.OooO0O0(oooO, oooO0O0);
                        i3 = oooO0O0.f812OooO0o;
                    }
                    oooO0O0.f808OooO00o = 1;
                    oooO0O0.f810OooO0OO = (int) (oooO.f665OoooOOO * i3);
                }
            }
            if (z4) {
                if (iArr2[1] == 4) {
                    oooO0O0.f809OooO0O0 = 1;
                } else if (!z) {
                    if (oooO0O0.f808OooO00o == 1) {
                        i = oooO0O0.f810OooO0OO;
                    } else {
                        oooO0O0.f809OooO0O0 = 2;
                        oooo000.OooO0O0(oooO, oooO0O0);
                        i = oooO0O0.f813OooO0o0;
                    }
                    oooO0O0.f809OooO0O0 = 1;
                    if (oooO.f666OoooOOo == -1) {
                        i2 = (int) (i / oooO.f665OoooOOO);
                    } else {
                        i2 = (int) (oooO.f665OoooOOO * i);
                    }
                    oooO0O0.f811OooO0Oo = i2;
                }
            }
            oooo000.OooO0O0(oooO, oooO0O0);
            oooO.Oooo0oO(oooO0O0.f813OooO0o0);
            oooO.Oooo0OO(oooO0O0.f812OooO0o);
            oooO.f648OooOooo = oooO0O0.f815OooO0oo;
            int i4 = oooO0O0.f814OooO0oO;
            oooO.f668OoooOoo = i4;
            if (i4 <= 0) {
                z5 = false;
            }
            oooO.f648OooOooo = z5;
            oooO0O0.f816OooOO0 = 0;
            return;
        }
        oooO0O0.f813OooO0o0 = 0;
        oooO0O0.f812OooO0o = 0;
    }

    @Override // OooOOO.OooO
    public final void OooOOO(StringBuilder sb) {
        sb.append(this.f628OooOO0 + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f664OoooOO0);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f678o000oOoO);
        sb.append("\n");
        Iterator it = this.f796o00ooo.iterator();
        while (it.hasNext()) {
            ((OooO) it.next()).OooOOO(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }

    @Override // OooOOO.OooOo, OooOOO.OooO
    public final void OooOoo() {
        this.f737o0ooOoO.OooOo0();
        this.f734o0OOO0o = 0;
        this.o0Oo0oo = 0;
        super.OooOoo();
    }

    @Override // OooOOO.OooO
    public final void Oooo0oo(boolean z, boolean z2) {
        super.Oooo0oo(z, z2);
        int size = this.f796o00ooo.size();
        for (int i = 0; i < size; i++) {
            ((OooO) this.f796o00ooo.get(i)).Oooo0oo(z, z2);
        }
    }

    public final boolean OoooO(int i, boolean z) {
        boolean z2;
        OooOOOO.OooOO0O oooOO0O;
        int OooOO0o2;
        boolean z3 = true;
        boolean z4 = z & true;
        OooOOOO.OooO oooO = this.o00oO0o;
        OooOO0 oooOO0 = oooO.f799OooO00o;
        int OooOO0O2 = oooOO0.OooOO0O(0);
        int OooOO0O3 = oooOO0.OooOO0O(1);
        int OooOOo2 = oooOO0.OooOOo();
        int OooOOoo2 = oooOO0.OooOOoo();
        ArrayList arrayList = oooO.f804OooO0o0;
        if (z4 && (OooOO0O2 == 2 || OooOO0O3 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o000oOoO o000oooo = (o000oOoO) it.next();
                if (o000oooo.f855OooO0o == i && !o000oooo.OooOO0O()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && OooOO0O2 == 2) {
                    oooOO0.Oooo0o0(1);
                    oooOO0.Oooo0oO(oooO.OooO0Oo(oooOO0, 0));
                    oooOO0O = oooOO0.f623OooO0Oo.f856OooO0o0;
                    OooOO0o2 = oooOO0.OooOOo0();
                    oooOO0O.OooO0Oo(OooOO0o2);
                }
            } else if (z4 && OooOO0O3 == 2) {
                oooOO0.Oooo0o(1);
                oooOO0.Oooo0OO(oooO.OooO0Oo(oooOO0, 1));
                oooOO0O = oooOO0.f625OooO0o0.f856OooO0o0;
                OooOO0o2 = oooOO0.OooOO0o();
                oooOO0O.OooO0Oo(OooOO0o2);
            }
        }
        int[] iArr = oooOO0.f681o00o0O;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int OooOOo02 = oooOO0.OooOOo0() + OooOOo2;
                oooOO0.f623OooO0Oo.f850OooO.OooO0Oo(OooOOo02);
                oooOO0.f623OooO0Oo.f856OooO0o0.OooO0Oo(OooOOo02 - OooOOo2);
                z2 = true;
            }
            z2 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int OooOO0o3 = oooOO0.OooOO0o() + OooOOoo2;
                oooOO0.f625OooO0o0.f850OooO.OooO0Oo(OooOO0o3);
                oooOO0.f625OooO0o0.f856OooO0o0.OooO0Oo(OooOO0o3 - OooOOoo2);
                z2 = true;
            }
            z2 = false;
        }
        oooO.OooO0oO();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            o000oOoO o000oooo2 = (o000oOoO) it2.next();
            if (o000oooo2.f855OooO0o == i && (o000oooo2.f852OooO0O0 != oooOO0 || o000oooo2.f857OooO0oO)) {
                o000oooo2.OooO0o0();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            o000oOoO o000oooo3 = (o000oOoO) it3.next();
            if (o000oooo3.f855OooO0o == i && (z2 || o000oooo3.f852OooO0O0 != oooOO0)) {
                if (!o000oooo3.f858OooO0oo.f828OooOO0 || !o000oooo3.f850OooO.f828OooOO0 || (!(o000oooo3 instanceof OooOOOO.OooO0OO) && !o000oooo3.f856OooO0o0.f828OooOO0)) {
                    z3 = false;
                    break;
                }
            }
        }
        oooOO0.Oooo0o0(OooOO0O2);
        oooOO0.Oooo0o(OooOO0O3);
        return z3;
    }

    public final void OoooO0(int i, OooO oooO) {
        if (i == 0) {
            int i2 = this.f733o0OO00O + 1;
            OooO0O0[] oooO0O0Arr = this.f730o000OOo;
            if (i2 >= oooO0O0Arr.length) {
                this.f730o000OOo = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr, oooO0O0Arr.length * 2);
            }
            OooO0O0[] oooO0O0Arr2 = this.f730o000OOo;
            int i3 = this.f733o0OO00O;
            oooO0O0Arr2[i3] = new OooO0O0(oooO, 0, this.f736o0ooOOo);
            this.f733o0OO00O = i3 + 1;
        } else if (i == 1) {
            int i4 = this.f739oo0o0Oo + 1;
            OooO0O0[] oooO0O0Arr3 = this.f732o0O0O00;
            if (i4 >= oooO0O0Arr3.length) {
                this.f732o0O0O00 = (OooO0O0[]) Arrays.copyOf(oooO0O0Arr3, oooO0O0Arr3.length * 2);
            }
            OooO0O0[] oooO0O0Arr4 = this.f732o0O0O00;
            int i5 = this.f739oo0o0Oo;
            oooO0O0Arr4[i5] = new OooO0O0(oooO, 1, this.f736o0ooOOo);
            this.f739oo0o0Oo = i5 + 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:355:0x05d5  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0601 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0609  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0649  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0668  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x067e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:409:0x068c  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x080b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0817 A[LOOP:14: B:502:0x0815->B:503:0x0817, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x08ef  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x08e3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // OooOOO.OooOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OoooO00() {
        /*
            Method dump skipped, instructions count: 2299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOOO.OooOO0.OoooO00():void");
    }

    public final void OoooO0O(OooOO0o.OooOo oooOo) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean o000oOoO2 = o000oOoO(64);
        OooO0OO(oooOo, o000oOoO2);
        int size = this.f796o00ooo.size();
        boolean z5 = false;
        for (int i2 = 0; i2 < size; i2++) {
            OooO oooO = (OooO) this.f796o00ooo.get(i2);
            boolean[] zArr = oooO.f663OoooO0O;
            zArr[0] = false;
            zArr[1] = false;
            if (oooO instanceof OooO00o) {
                z5 = true;
            }
        }
        if (z5) {
            for (int i3 = 0; i3 < size; i3++) {
                OooO oooO2 = (OooO) this.f796o00ooo.get(i3);
                if (oooO2 instanceof OooO00o) {
                    OooO00o oooO00o = (OooO00o) oooO2;
                    for (int i4 = 0; i4 < oooO00o.f798oo000o; i4++) {
                        OooO oooO3 = oooO00o.f797o00ooo[i4];
                        if (oooO00o.f684o00oO0O || oooO3.OooO0Oo()) {
                            int i5 = oooO00o.o00oO0o;
                            if (i5 != 0 && i5 != 1) {
                                if (i5 == 2 || i5 == 3) {
                                    oooO3.f663OoooO0O[1] = true;
                                }
                            } else {
                                oooO3.f663OoooO0O[0] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f728o00000Oo;
        hashSet.clear();
        for (int i6 = 0; i6 < size; i6++) {
            OooO oooO4 = (OooO) this.f796o00ooo.get(i6);
            oooO4.getClass();
            if (!(oooO4 instanceof OooOOO0) && !(oooO4 instanceof OooOOO)) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                if (oooO4 instanceof OooOOO0) {
                    hashSet.add(oooO4);
                } else {
                    oooO4.OooO0OO(oooOo, o000oOoO2);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                OooOOO0 oooOOO0 = (OooOOO0) ((OooO) it.next());
                int i7 = 0;
                while (true) {
                    if (i7 < oooOOO0.f798oo000o) {
                        if (hashSet.contains(oooOOO0.f797o00ooo[i7])) {
                            z3 = true;
                            continue;
                            break;
                        }
                        i7++;
                    } else {
                        z3 = false;
                        continue;
                        break;
                    }
                }
                if (z3) {
                    oooOOO0.OooO0OO(oooOo, o000oOoO2);
                    hashSet.remove(oooOOO0);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((OooO) it2.next()).OooO0OO(oooOo, o000oOoO2);
                }
                hashSet.clear();
            }
        }
        if (OooOO0o.OooOo.f577OooOOOo) {
            HashSet hashSet2 = new HashSet();
            for (int i8 = 0; i8 < size; i8++) {
                OooO oooO5 = (OooO) this.f796o00ooo.get(i8);
                oooO5.getClass();
                if (!(oooO5 instanceof OooOOO0) && !(oooO5 instanceof OooOOO)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    hashSet2.add(oooO5);
                }
            }
            if (this.f681o00o0O[0] == 2) {
                i = 0;
            } else {
                i = 1;
            }
            OooO0O0(this, oooOo, hashSet2, i, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                OooO oooO6 = (OooO) it3.next();
                o0000O00.OooO00o.OooOo0o(this, oooOo, oooO6);
                oooO6.OooO0OO(oooOo, o000oOoO2);
            }
        } else {
            for (int i9 = 0; i9 < size; i9++) {
                OooO oooO7 = (OooO) this.f796o00ooo.get(i9);
                if (oooO7 instanceof OooOO0) {
                    int[] iArr = oooO7.f681o00o0O;
                    int i10 = iArr[0];
                    int i11 = iArr[1];
                    if (i10 == 2) {
                        oooO7.Oooo0o0(1);
                    }
                    if (i11 == 2) {
                        oooO7.Oooo0o(1);
                    }
                    oooO7.OooO0OO(oooOo, o000oOoO2);
                    if (i10 == 2) {
                        oooO7.Oooo0o0(i10);
                    }
                    if (i11 == 2) {
                        oooO7.Oooo0o(i11);
                    }
                } else {
                    o0000O00.OooO00o.OooOo0o(this, oooOo, oooO7);
                    if (!(oooO7 instanceof OooOOO0) && !(oooO7 instanceof OooOOO)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!z) {
                        oooO7.OooO0OO(oooOo, o000oOoO2);
                    }
                }
            }
        }
        if (this.f733o0OO00O > 0) {
            o0000O00.OooO00o.OooOO0O(this, oooOo, null, 0);
        }
        if (this.f739oo0o0Oo > 0) {
            o0000O00.OooO00o.OooOO0O(this, oooOo, null, 1);
        }
    }

    public final boolean o000oOoO(int i) {
        return (this.f722o000000 & i) == i;
    }
}