package o000oOoO;

import android.view.View;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class oo00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5171OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Object f5172OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f5173OooO0OO;

    public oo00o(int i) {
        this.f5171OooO00o = i;
        if (i != 1) {
            this.f5172OooO0O0 = new OooOO0.OooOOOO();
            this.f5173OooO0OO = new OooOO0.OooO0o();
        }
    }

    public final void OooO(int i, int i2) {
        int[] iArr = (int[]) this.f5172OooO0O0;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            OooO0o0(i3);
            int[] iArr2 = (int[]) this.f5172OooO0O0;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill((int[]) this.f5172OooO0O0, i, i3, -1);
            List list = (List) this.f5173OooO0OO;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    o00O000o o00o000o = (o00O000o) ((List) this.f5173OooO0OO).get(size);
                    int i4 = o00o000o.f5063OooO00o;
                    if (i4 >= i) {
                        o00o000o.f5063OooO00o = i4 + i2;
                    }
                }
            }
        }
    }

    public final void OooO00o(o000OOo0 o000ooo0) {
        o00O00o0 o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).getOrDefault(o000ooo0, null);
        if (o00o00o0 == null) {
            o00o00o0 = o00O00o0.OooO00o();
            ((OooOO0.OooOOOO) this.f5172OooO0O0).put(o000ooo0, o00o00o0);
        }
        o00o00o0.f5074OooO00o |= 1;
    }

    public final void OooO0O0(o000OOo0 o000ooo0, o0000O00 o0000o00) {
        o00O00o0 o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).getOrDefault(o000ooo0, null);
        if (o00o00o0 == null) {
            o00o00o0 = o00O00o0.OooO00o();
            ((OooOO0.OooOOOO) this.f5172OooO0O0).put(o000ooo0, o00o00o0);
        }
        o00o00o0.f5076OooO0OO = o0000o00;
        o00o00o0.f5074OooO00o |= 8;
    }

    public final void OooO0OO(o000OOo0 o000ooo0, o0000O00 o0000o00) {
        o00O00o0 o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).getOrDefault(o000ooo0, null);
        if (o00o00o0 == null) {
            o00o00o0 = o00O00o0.OooO00o();
            ((OooOO0.OooOOOO) this.f5172OooO0O0).put(o000ooo0, o00o00o0);
        }
        o00o00o0.f5075OooO0O0 = o0000o00;
        o00o00o0.f5074OooO00o |= 4;
    }

    public final void OooO0Oo() {
        switch (this.f5171OooO00o) {
            case 0:
                ((OooOO0.OooOOOO) this.f5172OooO0O0).clear();
                ((OooOO0.OooO0o) this.f5173OooO0OO).OooO00o();
                return;
            default:
                int[] iArr = (int[]) this.f5172OooO0O0;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                this.f5173OooO0OO = null;
                return;
        }
    }

    public final View OooO0o(int i, int i2, int i3, int i4) {
        int OooOooo2;
        int i5;
        View OooOo02;
        androidx.fragment.app.OooOo oooOo = (androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0);
        int i6 = oooOo.f2790OooO00o;
        Object obj = oooOo.f2791OooO0O0;
        switch (i6) {
            case 0:
                OooOooo2 = ((o000OO) obj).OooOoo();
                break;
            default:
                OooOooo2 = ((o000OO) obj).OooOooo();
                break;
        }
        int OooO0Oo2 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO0Oo();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            androidx.fragment.app.OooOo oooOo2 = (androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0);
            int i7 = oooOo2.f2790OooO00o;
            Object obj2 = oooOo2.f2791OooO0O0;
            switch (i7) {
                case 0:
                    OooOo02 = ((o000OO) obj2).OooOo0(i);
                    break;
                default:
                    OooOo02 = ((o000OO) obj2).OooOo0(i);
                    break;
            }
            int OooO0O02 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO0O0(OooOo02);
            int OooO00o2 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO00o(OooOo02);
            Object obj3 = this.f5173OooO0OO;
            oOO00O ooo00o = (oOO00O) obj3;
            ooo00o.f5165OooO0O0 = OooOooo2;
            ooo00o.f5166OooO0OO = OooO0Oo2;
            ooo00o.f5167OooO0Oo = OooO0O02;
            ooo00o.f5168OooO0o0 = OooO00o2;
            if (i3 != 0) {
                ((oOO00O) obj3).f5164OooO00o = i3 | 0;
                if (((oOO00O) obj3).OooO00o()) {
                    return OooOo02;
                }
            }
            if (i4 != 0) {
                Object obj4 = this.f5173OooO0OO;
                ((oOO00O) obj4).f5164OooO00o = i4 | 0;
                if (((oOO00O) obj4).OooO00o()) {
                    view = OooOo02;
                }
            }
            i += i5;
        }
        return view;
    }

    public final void OooO0o0(int i) {
        Object obj = this.f5172OooO0O0;
        if (((int[]) obj) == null) {
            int[] iArr = new int[Math.max(i, 10) + 1];
            this.f5172OooO0O0 = iArr;
            Arrays.fill(iArr, -1);
        } else if (i >= ((int[]) obj).length) {
            int[] iArr2 = (int[]) obj;
            int length = ((int[]) obj).length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f5172OooO0O0 = iArr3;
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
            Object obj2 = this.f5172OooO0O0;
            Arrays.fill((int[]) obj2, iArr2.length, ((int[]) obj2).length, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0oO(int r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f5172OooO0O0
            int[] r0 = (int[]) r0
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r0.length
            if (r6 < r0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r5.f5173OooO0OO
            r2 = r0
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L14
            goto L71
        L14:
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            if (r0 != 0) goto L1a
            goto L34
        L1a:
            int r0 = r0.size()
            int r0 = r0 + r1
        L1f:
            if (r0 < 0) goto L34
            java.lang.Object r3 = r5.f5173OooO0OO
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r0)
            o000oOoO.o00O000o r3 = (o000oOoO.o00O000o) r3
            int r4 = r3.f5063OooO00o
            if (r4 != r6) goto L31
            r2 = r3
            goto L34
        L31:
            int r0 = r0 + (-1)
            goto L1f
        L34:
            if (r2 == 0) goto L3d
            java.lang.Object r0 = r5.f5173OooO0OO
            java.util.List r0 = (java.util.List) r0
            r0.remove(r2)
        L3d:
            java.lang.Object r0 = r5.f5173OooO0OO
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            r2 = 0
        L46:
            if (r2 >= r0) goto L5a
            java.lang.Object r3 = r5.f5173OooO0OO
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r3 = r3.get(r2)
            o000oOoO.o00O000o r3 = (o000oOoO.o00O000o) r3
            int r3 = r3.f5063OooO00o
            if (r3 < r6) goto L57
            goto L5b
        L57:
            int r2 = r2 + 1
            goto L46
        L5a:
            r2 = r1
        L5b:
            if (r2 == r1) goto L71
            java.lang.Object r0 = r5.f5173OooO0OO
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r2)
            o000oOoO.o00O000o r0 = (o000oOoO.o00O000o) r0
            java.lang.Object r3 = r5.f5173OooO0OO
            java.util.List r3 = (java.util.List) r3
            r3.remove(r2)
            int r0 = r0.f5063OooO00o
            goto L72
        L71:
            r0 = r1
        L72:
            if (r0 != r1) goto L82
            java.lang.Object r0 = r5.f5172OooO0O0
            int[] r0 = (int[]) r0
            int r2 = r0.length
            java.util.Arrays.fill(r0, r6, r2, r1)
            java.lang.Object r6 = r5.f5172OooO0O0
            int[] r6 = (int[]) r6
            int r6 = r6.length
            return r6
        L82:
            java.lang.Object r2 = r5.f5172OooO0O0
            int[] r2 = (int[]) r2
            int r0 = r0 + 1
            java.util.Arrays.fill(r2, r6, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.oo00o.OooO0oO(int):int");
    }

    public final boolean OooO0oo(View view) {
        int OooOooo2;
        oOO00O ooo00o = (oOO00O) this.f5173OooO0OO;
        androidx.fragment.app.OooOo oooOo = (androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0);
        int i = oooOo.f2790OooO00o;
        Object obj = oooOo.f2791OooO0O0;
        switch (i) {
            case 0:
                OooOooo2 = ((o000OO) obj).OooOoo();
                break;
            default:
                OooOooo2 = ((o000OO) obj).OooOooo();
                break;
        }
        int OooO0Oo2 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO0Oo();
        int OooO0O02 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO0O0(view);
        int OooO00o2 = ((androidx.fragment.app.OooOo) ((o00O00OO) this.f5172OooO0O0)).OooO00o(view);
        ooo00o.f5165OooO0O0 = OooOooo2;
        ooo00o.f5166OooO0OO = OooO0Oo2;
        ooo00o.f5167OooO0Oo = OooO0O02;
        ooo00o.f5168OooO0o0 = OooO00o2;
        Object obj2 = this.f5173OooO0OO;
        ((oOO00O) obj2).f5164OooO00o = 24579 | 0;
        return ((oOO00O) obj2).OooO00o();
    }

    public final void OooOO0(int i, int i2) {
        int[] iArr = (int[]) this.f5172OooO0O0;
        if (iArr != null && i < iArr.length) {
            int i3 = i + i2;
            OooO0o0(i3);
            int[] iArr2 = (int[]) this.f5172OooO0O0;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = (int[]) this.f5172OooO0O0;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            List list = (List) this.f5173OooO0OO;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    o00O000o o00o000o = (o00O000o) ((List) this.f5173OooO0OO).get(size);
                    int i4 = o00o000o.f5063OooO00o;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            ((List) this.f5173OooO0OO).remove(size);
                        } else {
                            o00o000o.f5063OooO00o = i4 - i2;
                        }
                    }
                }
            }
        }
    }

    public final o0000O00 OooOO0O(o000OOo0 o000ooo0, int i) {
        o00O00o0 o00o00o0;
        o0000O00 o0000o00;
        int OooO0o02 = ((OooOO0.OooOOOO) this.f5172OooO0O0).OooO0o0(o000ooo0);
        if (OooO0o02 >= 0 && (o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).OooOO0(OooO0o02)) != null) {
            int i2 = o00o00o0.f5074OooO00o;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                o00o00o0.f5074OooO00o = i3;
                if (i == 4) {
                    o0000o00 = o00o00o0.f5075OooO0O0;
                } else if (i == 8) {
                    o0000o00 = o00o00o0.f5076OooO0OO;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    ((OooOO0.OooOOOO) this.f5172OooO0O0).OooO(OooO0o02);
                    o00o00o0.f5074OooO00o = 0;
                    o00o00o0.f5075OooO0O0 = null;
                    o00o00o0.f5076OooO0OO = null;
                    o00O00o0.f5073OooO0Oo.OooO0O0(o00o00o0);
                }
                return o0000o00;
            }
        }
        return null;
    }

    public final void OooOO0o(o000OOo0 o000ooo0) {
        o00O00o0 o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).getOrDefault(o000ooo0, null);
        if (o00o00o0 == null) {
            return;
        }
        o00o00o0.f5074OooO00o &= -2;
    }

    public final void OooOOO0(o000OOo0 o000ooo0) {
        OooOO0.OooO0o oooO0o = (OooOO0.OooO0o) this.f5173OooO0OO;
        if (oooO0o.f520OooO00o) {
            oooO0o.OooO0OO();
        }
        int i = oooO0o.f523OooO0Oo - 1;
        while (true) {
            if (i < 0) {
                break;
            } else if (o000ooo0 == ((OooOO0.OooO0o) this.f5173OooO0OO).OooO0o(i)) {
                OooOO0.OooO0o oooO0o2 = (OooOO0.OooO0o) this.f5173OooO0OO;
                Object[] objArr = oooO0o2.f522OooO0OO;
                Object obj = objArr[i];
                Object obj2 = OooOO0.OooO0o.f519OooO0o0;
                if (obj != obj2) {
                    objArr[i] = obj2;
                    oooO0o2.f520OooO00o = true;
                }
            } else {
                i--;
            }
        }
        o00O00o0 o00o00o0 = (o00O00o0) ((OooOO0.OooOOOO) this.f5172OooO0O0).remove(o000ooo0);
        if (o00o00o0 != null) {
            o00o00o0.f5074OooO00o = 0;
            o00o00o0.f5075OooO0O0 = null;
            o00o00o0.f5076OooO0OO = null;
            o00O00o0.f5073OooO0Oo.OooO0O0(o00o00o0);
        }
    }

    public oo00o(androidx.fragment.app.OooOo oooOo) {
        this.f5171OooO00o = 2;
        this.f5172OooO0O0 = oooOo;
        this.f5173OooO0OO = new oOO00O();
    }
}