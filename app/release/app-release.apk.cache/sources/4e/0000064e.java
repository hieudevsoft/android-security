package o000oOoO;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class OooO0O0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00000O0 f4890OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0o.Oooo000 f4887OooO00o = new OooOO0o.Oooo000(30, 1);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayList f4888OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4889OooO0OO = new ArrayList();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final androidx.fragment.app.OooOo f4891OooO0o0 = new androidx.fragment.app.OooOo(2, this);

    public OooO0O0(o00000O0 o00000o02) {
        this.f4890OooO0Oo = o00000o02;
    }

    public final void OooO(OooO00o oooO00o) {
        this.f4889OooO0OO.add(oooO00o);
        int i = oooO00o.f4883OooO00o;
        o00000O0 o00000o02 = this.f4890OooO0Oo;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i == 8) {
                        o00000o02.OooO0o(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + oooO00o);
                }
                o00000o02.OooO0Oo(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo, oooO00o.f4885OooO0OO);
                return;
            }
            int i2 = oooO00o.f4884OooO0O0;
            int i3 = oooO00o.f4886OooO0Oo;
            RecyclerView recyclerView = o00000o02.f4953OooO00o;
            recyclerView.Oooo0oO(i2, i3, false);
            recyclerView.f3194Ooooo0o = true;
            return;
        }
        o00000o02.OooO0o0(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
    }

    public final boolean OooO00o(int i) {
        ArrayList arrayList = this.f4889OooO0OO;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            OooO00o oooO00o = (OooO00o) arrayList.get(i2);
            int i3 = oooO00o.f4883OooO00o;
            if (i3 == 8) {
                if (OooO0o(oooO00o.f4886OooO0Oo, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = oooO00o.f4884OooO0O0;
                int i5 = oooO00o.f4886OooO0Oo + i4;
                while (i4 < i5) {
                    if (OooO0o(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public final void OooO0O0() {
        ArrayList arrayList = this.f4889OooO0OO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f4890OooO0Oo.OooO00o((OooO00o) arrayList.get(i));
        }
        OooOO0o(arrayList);
    }

    public final void OooO0OO() {
        OooO0O0();
        ArrayList arrayList = this.f4888OooO0O0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooO00o oooO00o = (OooO00o) arrayList.get(i);
            int i2 = oooO00o.f4883OooO00o;
            o00000O0 o00000o02 = this.f4890OooO0Oo;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 4) {
                        if (i2 == 8) {
                            o00000o02.OooO00o(oooO00o);
                            o00000o02.OooO0o(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
                        }
                    } else {
                        o00000o02.OooO00o(oooO00o);
                        o00000o02.OooO0Oo(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo, oooO00o.f4885OooO0OO);
                    }
                } else {
                    o00000o02.OooO00o(oooO00o);
                    int i3 = oooO00o.f4884OooO0O0;
                    int i4 = oooO00o.f4886OooO0Oo;
                    RecyclerView recyclerView = o00000o02.f4953OooO00o;
                    recyclerView.Oooo0oO(i3, i4, true);
                    recyclerView.f3194Ooooo0o = true;
                    recyclerView.OoooOoO.f4984OooO0OO += i4;
                }
            } else {
                o00000o02.OooO00o(oooO00o);
                o00000o02.OooO0o0(oooO00o.f4884OooO0O0, oooO00o.f4886OooO0Oo);
            }
        }
        OooOO0o(arrayList);
    }

    public final void OooO0Oo(OooO00o oooO00o) {
        int i;
        int i2 = oooO00o.f4883OooO00o;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int OooOOO0 = OooOOO0(oooO00o.f4884OooO0O0, i2);
        int i3 = oooO00o.f4884OooO0O0;
        int i4 = oooO00o.f4883OooO00o;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + oooO00o);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < oooO00o.f4886OooO0Oo; i6++) {
            int OooOOO02 = OooOOO0((i * i6) + oooO00o.f4884OooO0O0, oooO00o.f4883OooO00o);
            int i7 = oooO00o.f4883OooO00o;
            if (i7 == 2 ? OooOOO02 == OooOOO0 : i7 == 4 && OooOOO02 == OooOOO0 + 1) {
                i5++;
            } else {
                OooO00o OooO0oo2 = OooO0oo(oooO00o.f4885OooO0OO, i7, OooOOO0, i5);
                OooO0o0(OooO0oo2, i3);
                OooOO0O(OooO0oo2);
                if (oooO00o.f4883OooO00o == 4) {
                    i3 += i5;
                }
                i5 = 1;
                OooOOO0 = OooOOO02;
            }
        }
        Object obj = oooO00o.f4885OooO0OO;
        OooOO0O(oooO00o);
        if (i5 > 0) {
            OooO00o OooO0oo3 = OooO0oo(obj, oooO00o.f4883OooO00o, OooOOO0, i5);
            OooO0o0(OooO0oo3, i3);
            OooOO0O(OooO0oo3);
        }
    }

    public final int OooO0o(int i, int i2) {
        ArrayList arrayList = this.f4889OooO0OO;
        int size = arrayList.size();
        while (i2 < size) {
            OooO00o oooO00o = (OooO00o) arrayList.get(i2);
            int i3 = oooO00o.f4883OooO00o;
            if (i3 == 8) {
                int i4 = oooO00o.f4884OooO0O0;
                if (i4 == i) {
                    i = oooO00o.f4886OooO0Oo;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (oooO00o.f4886OooO0Oo <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = oooO00o.f4884OooO0O0;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = oooO00o.f4886OooO0Oo;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += oooO00o.f4886OooO0Oo;
                }
            }
            i2++;
        }
        return i;
    }

    public final void OooO0o0(OooO00o oooO00o, int i) {
        o00000O0 o00000o02 = this.f4890OooO0Oo;
        o00000o02.OooO00o(oooO00o);
        int i2 = oooO00o.f4883OooO00o;
        if (i2 != 2) {
            if (i2 == 4) {
                o00000o02.OooO0Oo(i, oooO00o.f4886OooO0Oo, oooO00o.f4885OooO0OO);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i3 = oooO00o.f4886OooO0Oo;
        RecyclerView recyclerView = o00000o02.f4953OooO00o;
        recyclerView.Oooo0oO(i, i3, true);
        recyclerView.f3194Ooooo0o = true;
        recyclerView.OoooOoO.f4984OooO0OO += i3;
    }

    public final boolean OooO0oO() {
        return this.f4888OooO0O0.size() > 0;
    }

    public final OooO00o OooO0oo(Object obj, int i, int i2, int i3) {
        OooO00o oooO00o = (OooO00o) this.f4887OooO00o.OooO00o();
        if (oooO00o == null) {
            return new OooO00o(obj, i, i2, i3);
        }
        oooO00o.f4883OooO00o = i;
        oooO00o.f4884OooO0O0 = i2;
        oooO00o.f4886OooO0Oo = i3;
        oooO00o.f4885OooO0OO = obj;
        return oooO00o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017e, code lost:
        r1.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0182, code lost:
        r1.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0185, code lost:
        if (r6 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0187, code lost:
        r1.add(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
        if (r4 > r12.f4884OooO0O0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x016e, code lost:
        if (r4 >= r12.f4884OooO0O0) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0170, code lost:
        r11.f4886OooO0Oo = r4 - r12.f4886OooO0Oo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
        r1.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017c, code lost:
        if (r11.f4884OooO0O0 == r11.f4886OooO0Oo) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00a1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x011b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x010e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00cb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOO0() {
        /*
            Method dump skipped, instructions count: 648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.OooO0O0.OooOO0():void");
    }

    public final void OooOO0O(OooO00o oooO00o) {
        oooO00o.f4885OooO0OO = null;
        this.f4887OooO00o.OooO0O0(oooO00o);
    }

    public final void OooOO0o(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            OooOO0O((OooO00o) arrayList.get(i));
        }
        arrayList.clear();
    }

    public final int OooOOO0(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        ArrayList arrayList = this.f4889OooO0OO;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            OooO00o oooO00o = (OooO00o) arrayList.get(size);
            int i9 = oooO00o.f4883OooO00o;
            if (i9 == 8) {
                int i10 = oooO00o.f4884OooO0O0;
                int i11 = oooO00o.f4886OooO0Oo;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            oooO00o.f4884OooO0O0 = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            oooO00o.f4884OooO0O0 = i10 - 1;
                            i6 = i11 - 1;
                        }
                        oooO00o.f4886OooO0Oo = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    oooO00o.f4886OooO0Oo = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    oooO00o.f4884OooO0O0 = i7;
                    i--;
                }
            } else {
                int i12 = oooO00o.f4884OooO0O0;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    oooO00o.f4884OooO0O0 = i3;
                } else if (i9 == 1) {
                    i -= oooO00o.f4886OooO0Oo;
                } else if (i9 == 2) {
                    i += oooO00o.f4886OooO0Oo;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            OooO00o oooO00o2 = (OooO00o) arrayList.get(size2);
            if (oooO00o2.f4883OooO00o == 8) {
                int i13 = oooO00o2.f4886OooO0Oo;
                if (i13 != oooO00o2.f4884OooO0O0 && i13 >= 0) {
                }
                arrayList.remove(size2);
                OooOO0O(oooO00o2);
            } else {
                if (oooO00o2.f4886OooO0Oo > 0) {
                }
                arrayList.remove(size2);
                OooOO0O(oooO00o2);
            }
        }
        return i;
    }
}