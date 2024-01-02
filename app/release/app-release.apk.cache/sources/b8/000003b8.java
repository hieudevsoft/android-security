package androidx.recyclerview.widget;

import OooO0O0.OooO00o;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import o000oOoO.o0000O;
import o000oOoO.o0000O0O;
import o000oOoO.o000O00;
import o000oOoO.o000O0O0;
import o000oOoO.o000OO;
import o000oOoO.o000OO0O;
import o000oOoO.o000OOo;
import o000oOoO.o00O0O;
import o000oOoO.o0O0O00;
import o000oOoO.o0OO00O;
import o000oOoO.o0OOO0o;
import o000oOoO.o0Oo0oo;
import o000oOoO.o0ooOOo;
import o000oOoO.oo0o0Oo;

/* loaded from: classes.dex */
public class LinearLayoutManager extends o000OO implements o000OO0O {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f3125OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o0O0O00 f3126OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public o0Oo0oo f3127OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public boolean f3128OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public int f3129OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public boolean f3130OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public boolean f3131OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public boolean f3132OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public final boolean f3133OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public o0OO00O f3134OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public int f3135OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final o0ooOOo f3136OooOoOO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public final int f3137OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final o0OOO0o f3138OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public final int[] f3139OooOooO;

    public LinearLayoutManager(int i) {
        this.f3125OooOOOo = 1;
        this.f3131OooOo00 = false;
        this.f3130OooOo0 = false;
        this.f3132OooOo0O = false;
        this.f3133OooOo0o = true;
        this.f3129OooOo = -1;
        this.f3135OooOoO0 = Integer.MIN_VALUE;
        this.f3134OooOoO = null;
        this.f3136OooOoOO = new o0ooOOo();
        this.f3138OooOoo0 = new o0OOO0o();
        this.f3137OooOoo = 2;
        this.f3139OooOooO = new int[2];
        o0000OO(i);
        OooO0OO(null);
        if (this.f3131OooOo00) {
            this.f3131OooOo00 = false;
            Ooooooo();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0024  */
    @Override // o000oOoO.o000OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(int r7, o000oOoO.o00O0O r8) {
        /*
            r6 = this;
            o000oOoO.o0OO00O r0 = r6.f3134OooOoO
            r1 = 1
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L13
            int r4 = r0.f5111OooO00o
            if (r4 < 0) goto Ld
            r5 = r1
            goto Le
        Ld:
            r5 = r3
        Le:
            if (r5 == 0) goto L13
            boolean r0 = r0.f5113OooO0OO
            goto L22
        L13:
            r6.o0000O()
            boolean r0 = r6.f3130OooOo0
            int r4 = r6.f3129OooOo
            if (r4 != r2) goto L22
            if (r0 == 0) goto L21
            int r4 = r7 + (-1)
            goto L22
        L21:
            r4 = r3
        L22:
            if (r0 == 0) goto L25
            r1 = r2
        L25:
            r0 = r3
        L26:
            int r2 = r6.f3137OooOoo
            if (r0 >= r2) goto L35
            if (r4 < 0) goto L35
            if (r4 >= r7) goto L35
            r8.Oooo0oo(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L26
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.OooO(int, o000oOoO.o00O0O):void");
    }

    @Override // o000oOoO.o000OO0O
    public final PointF OooO00o(int i) {
        if (OooOo0O() == 0) {
            return null;
        }
        int i2 = (i < o000OO.Oooo000(OooOo0(0))) != this.f3130OooOo0 ? -1 : 1;
        return this.f3125OooOOOo == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // o000oOoO.o000OO
    public final void OooO0OO(String str) {
        if (this.f3134OooOoO == null) {
            super.OooO0OO(str);
        }
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0Oo() {
        return this.f3125OooOOOo == 0;
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0o0() {
        return this.f3125OooOOOo == 1;
    }

    @Override // o000oOoO.o000OO
    public final void OooO0oo(int i, int i2, o000O0O0 o000o0o0, o00O0O o00o0o) {
        if (this.f3125OooOOOo != 0) {
            i = i2;
        }
        if (OooOo0O() == 0 || i == 0) {
            return;
        }
        o000000O();
        o0000OOo(i > 0 ? 1 : -1, Math.abs(i), true, o000o0o0);
        o0OO00O(o000o0o0, this.f3127OooOOo0, o00o0o);
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0(o000O0O0 o000o0o0) {
        return oo0o0Oo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public int OooOO0O(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public int OooOO0o(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public int OooOOO(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOOO0(o000O0O0 o000o0o0) {
        return oo0o0Oo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public int OooOOOO(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public o0000O OooOOo() {
        return new o0000O(-2, -2);
    }

    @Override // o000oOoO.o000OO
    public final View OooOOo0(int i) {
        int OooOo0O2 = OooOo0O();
        if (OooOo0O2 == 0) {
            return null;
        }
        int Oooo0002 = i - o000OO.Oooo000(OooOo0(0));
        if (Oooo0002 >= 0 && Oooo0002 < OooOo0O2) {
            View OooOo02 = OooOo0(Oooo0002);
            if (o000OO.Oooo000(OooOo02) == i) {
                return OooOo02;
            }
        }
        return super.OooOOo0(i);
    }

    @Override // o000oOoO.o000OO
    public final void Oooo(RecyclerView recyclerView) {
    }

    @Override // o000oOoO.o000OO
    public final boolean Oooo0O0() {
        return true;
    }

    @Override // o000oOoO.o000OO
    public final void OoooO0(AccessibilityEvent accessibilityEvent) {
        super.OoooO0(accessibilityEvent);
        if (OooOo0O() > 0) {
            accessibilityEvent.setFromIndex(o00000O());
            accessibilityEvent.setToIndex(o00000OO());
        }
    }

    @Override // o000oOoO.o000OO
    public View OoooO00(View view, int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        int o0000002;
        View o00000Oo2;
        View o00002;
        o0000O();
        if (OooOo0O() == 0 || (o0000002 = o000000(i)) == Integer.MIN_VALUE) {
            return null;
        }
        o000000O();
        o0000OOo(o0000002, (int) (this.f3126OooOOo.OooO() * 0.33333334f), false, o000o0o0);
        o0Oo0oo o0oo0oo = this.f3127OooOOo0;
        o0oo0oo.f5125OooO0oO = Integer.MIN_VALUE;
        o0oo0oo.f5119OooO00o = false;
        o000000o(o000o00, o0oo0oo, o000o0o0, true);
        if (o0000002 == -1) {
            if (this.f3130OooOo0) {
                o00000Oo2 = o00000Oo(OooOo0O() - 1, -1);
            } else {
                o00000Oo2 = o00000Oo(0, OooOo0O());
            }
        } else if (this.f3130OooOo0) {
            o00000Oo2 = o00000Oo(0, OooOo0O());
        } else {
            o00000Oo2 = o00000Oo(OooOo0O() - 1, -1);
        }
        if (o0000002 == -1) {
            o00002 = o0000O00();
        } else {
            o00002 = o0000();
        }
        if (o00002.hasFocusable()) {
            if (o00000Oo2 == null) {
                return null;
            }
            return o00002;
        }
        return o00000Oo2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0298  */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v40 */
    @Override // o000oOoO.o000OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void OoooOoO(o000oOoO.o000O00 r18, o000oOoO.o000O0O0 r19) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.OoooOoO(o000oOoO.o000O00, o000oOoO.o000O0O0):void");
    }

    @Override // o000oOoO.o000OO
    public void OoooOoo(o000O0O0 o000o0o0) {
        this.f3134OooOoO = null;
        this.f3129OooOo = -1;
        this.f3135OooOoO0 = Integer.MIN_VALUE;
        this.f3136OooOoOO.OooO0OO();
    }

    @Override // o000oOoO.o000OO
    public final void Ooooo00(Parcelable parcelable) {
        if (parcelable instanceof o0OO00O) {
            this.f3134OooOoO = (o0OO00O) parcelable;
            Ooooooo();
        }
    }

    @Override // o000oOoO.o000OO
    public final Parcelable Ooooo0o() {
        o0OO00O o0oo00o = this.f3134OooOoO;
        if (o0oo00o != null) {
            return new o0OO00O(o0oo00o);
        }
        o0OO00O o0oo00o2 = new o0OO00O();
        if (OooOo0O() > 0) {
            o000000O();
            boolean z = this.f3128OooOOoo ^ this.f3130OooOo0;
            o0oo00o2.f5113OooO0OO = z;
            if (z) {
                View o00002 = o0000();
                o0oo00o2.f5112OooO0O0 = this.f3126OooOOo.OooO0o() - this.f3126OooOOo.OooO0O0(o00002);
                o0oo00o2.f5111OooO00o = o000OO.Oooo000(o00002);
            } else {
                View o0000O002 = o0000O00();
                o0oo00o2.f5111OooO00o = o000OO.Oooo000(o0000O002);
                o0oo00o2.f5112OooO0O0 = this.f3126OooOOo.OooO0Oo(o0000O002) - this.f3126OooOOo.OooO0oo();
            }
        } else {
            o0oo00o2.f5111OooO00o = -1;
        }
        return o0oo00o2;
    }

    public final View o0000() {
        return OooOo0(this.f3130OooOo0 ? 0 : OooOo0O() - 1);
    }

    public final View o00000(boolean z) {
        int OooOo0O2;
        int i;
        if (this.f3130OooOo0) {
            i = OooOo0O();
            OooOo0O2 = 0;
        } else {
            OooOo0O2 = OooOo0O() - 1;
            i = -1;
        }
        return o00000o0(OooOo0O2, i, z);
    }

    public final int o000000(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.f3125OooOOOo == 1) ? 1 : Integer.MIN_VALUE : this.f3125OooOOOo == 0 ? 1 : Integer.MIN_VALUE : this.f3125OooOOOo == 1 ? -1 : Integer.MIN_VALUE : this.f3125OooOOOo == 0 ? -1 : Integer.MIN_VALUE : (this.f3125OooOOOo != 1 && o0000oo()) ? -1 : 1 : (this.f3125OooOOOo != 1 && o0000oo()) ? 1 : -1;
    }

    public final void o000000O() {
        if (this.f3127OooOOo0 == null) {
            this.f3127OooOOo0 = new o0Oo0oo();
        }
    }

    public final int o000000o(o000O00 o000o00, o0Oo0oo o0oo0oo, o000O0O0 o000o0o0, boolean z) {
        boolean z2;
        int i = o0oo0oo.f5121OooO0OO;
        int i2 = o0oo0oo.f5125OooO0oO;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                o0oo0oo.f5125OooO0oO = i2 + i;
            }
            o0000O0O(o000o00, o0oo0oo);
        }
        int i3 = o0oo0oo.f5121OooO0OO + o0oo0oo.f5126OooO0oo;
        while (true) {
            if (!o0oo0oo.f5129OooOO0o && i3 <= 0) {
                break;
            }
            int i4 = o0oo0oo.f5122OooO0Oo;
            if (i4 >= 0 && i4 < o000o0o0.OooO0O0()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            o0OOO0o o0ooo0o = this.f3138OooOoo0;
            o0ooo0o.f5114OooO00o = 0;
            o0ooo0o.f5115OooO0O0 = false;
            o0ooo0o.f5116OooO0OO = false;
            o0ooo0o.f5117OooO0Oo = false;
            o0000oO(o000o00, o000o0o0, o0oo0oo, o0ooo0o);
            if (!o0ooo0o.f5115OooO0O0) {
                int i5 = o0oo0oo.f5120OooO0O0;
                int i6 = o0ooo0o.f5114OooO00o;
                o0oo0oo.f5120OooO0O0 = (o0oo0oo.f5123OooO0o * i6) + i5;
                if (!o0ooo0o.f5116OooO0OO || o0oo0oo.f5128OooOO0O != null || !o000o0o0.f4988OooO0oO) {
                    o0oo0oo.f5121OooO0OO -= i6;
                    i3 -= i6;
                }
                int i7 = o0oo0oo.f5125OooO0oO;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    o0oo0oo.f5125OooO0oO = i8;
                    int i9 = o0oo0oo.f5121OooO0OO;
                    if (i9 < 0) {
                        o0oo0oo.f5125OooO0oO = i8 + i9;
                    }
                    o0000O0O(o000o00, o0oo0oo);
                }
                if (z && o0ooo0o.f5117OooO0Oo) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - o0oo0oo.f5121OooO0OO;
    }

    public final int o00000O() {
        View o00000o02 = o00000o0(0, OooOo0O(), false);
        if (o00000o02 == null) {
            return -1;
        }
        return o000OO.Oooo000(o00000o02);
    }

    public final View o00000O0(boolean z) {
        int OooOo0O2;
        int i;
        if (this.f3130OooOo0) {
            OooOo0O2 = -1;
            i = OooOo0O() - 1;
        } else {
            OooOo0O2 = OooOo0O();
            i = 0;
        }
        return o00000o0(i, OooOo0O2, z);
    }

    public final int o00000OO() {
        View o00000o02 = o00000o0(OooOo0O() - 1, -1, false);
        if (o00000o02 == null) {
            return -1;
        }
        return o000OO.Oooo000(o00000o02);
    }

    public final View o00000Oo(int i, int i2) {
        int i3;
        int i4;
        o000000O();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return OooOo0(i);
        }
        if (this.f3126OooOOo.OooO0Oo(OooOo0(i)) < this.f3126OooOOo.OooO0oo()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        return (this.f3125OooOOOo == 0 ? this.f5008OooO0OO : this.f5009OooO0Oo).OooO0o(i, i2, i3, i4);
    }

    public final View o00000o0(int i, int i2, boolean z) {
        o000000O();
        return (this.f3125OooOOOo == 0 ? this.f5008OooO0OO : this.f5009OooO0Oo).OooO0o(i, i2, z ? 24579 : 320, 320);
    }

    public final int o00000oO(int i, o000O00 o000o00, o000O0O0 o000o0o0, boolean z) {
        int OooO0o2;
        int OooO0o3 = this.f3126OooOOo.OooO0o() - i;
        if (OooO0o3 > 0) {
            int i2 = -o0000OO0(-OooO0o3, o000o00, o000o0o0);
            int i3 = i + i2;
            if (!z || (OooO0o2 = this.f3126OooOOo.OooO0o() - i3) <= 0) {
                return i2;
            }
            this.f3126OooOOo.OooOO0o(OooO0o2);
            return OooO0o2 + i2;
        }
        return 0;
    }

    public final int o00000oo(int i, o000O00 o000o00, o000O0O0 o000o0o0, boolean z) {
        int OooO0oo2;
        int OooO0oo3 = i - this.f3126OooOOo.OooO0oo();
        if (OooO0oo3 > 0) {
            int i2 = -o0000OO0(OooO0oo3, o000o00, o000o0o0);
            int i3 = i + i2;
            if (!z || (OooO0oo2 = i3 - this.f3126OooOOo.OooO0oo()) <= 0) {
                return i2;
            }
            this.f3126OooOOo.OooOO0o(-OooO0oo2);
            return i2 - OooO0oo2;
        }
        return 0;
    }

    public final void o0000O() {
        this.f3130OooOo0 = (this.f3125OooOOOo == 1 || !o0000oo()) ? this.f3131OooOo00 : !this.f3131OooOo00;
    }

    public void o0000O0(o000O00 o000o00, o000O0O0 o000o0o0, o0ooOOo o0ooooo, int i) {
    }

    public final View o0000O00() {
        return OooOo0(this.f3130OooOo0 ? OooOo0O() - 1 : 0);
    }

    public final void o0000O0O(o000O00 o000o00, o0Oo0oo o0oo0oo) {
        if (o0oo0oo.f5119OooO00o && !o0oo0oo.f5129OooOO0o) {
            int i = o0oo0oo.f5125OooO0oO;
            int i2 = o0oo0oo.f5118OooO;
            if (o0oo0oo.f5123OooO0o == -1) {
                int OooOo0O2 = OooOo0O();
                if (i >= 0) {
                    int OooO0o02 = (this.f3126OooOOo.OooO0o0() - i) + i2;
                    if (this.f3130OooOo0) {
                        for (int i3 = 0; i3 < OooOo0O2; i3++) {
                            View OooOo02 = OooOo0(i3);
                            if (this.f3126OooOOo.OooO0Oo(OooOo02) < OooO0o02 || this.f3126OooOOo.OooOO0O(OooOo02) < OooO0o02) {
                                o000OO(o000o00, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = OooOo0O2 - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View OooOo03 = OooOo0(i5);
                        if (this.f3126OooOOo.OooO0Oo(OooOo03) < OooO0o02 || this.f3126OooOOo.OooOO0O(OooOo03) < OooO0o02) {
                            o000OO(o000o00, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int OooOo0O3 = OooOo0O();
                if (this.f3130OooOo0) {
                    int i7 = OooOo0O3 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View OooOo04 = OooOo0(i8);
                        if (this.f3126OooOOo.OooO0O0(OooOo04) > i6 || this.f3126OooOOo.OooOO0(OooOo04) > i6) {
                            o000OO(o000o00, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < OooOo0O3; i9++) {
                    View OooOo05 = OooOo0(i9);
                    if (this.f3126OooOOo.OooO0O0(OooOo05) > i6 || this.f3126OooOOo.OooOO0(OooOo05) > i6) {
                        o000OO(o000o00, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    public final void o0000OO(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO0O0("invalid orientation:", i));
        }
        OooO0OO(null);
        if (i != this.f3125OooOOOo || this.f3126OooOOo == null) {
            o0O0O00 OooO00o2 = o000OOo.OooO00o(this, i);
            this.f3126OooOOo = OooO00o2;
            this.f3136OooOoOO.f5159OooO00o = OooO00o2;
            this.f3125OooOOOo = i;
            Ooooooo();
        }
    }

    public final int o0000OO0(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o000000O();
        this.f3127OooOOo0.f5119OooO00o = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        o0000OOo(i2, abs, true, o000o0o0);
        o0Oo0oo o0oo0oo = this.f3127OooOOo0;
        int o000000o2 = o000000o(o000o00, o0oo0oo, o000o0o0, false) + o0oo0oo.f5125OooO0oO;
        if (o000000o2 < 0) {
            return 0;
        }
        if (abs > o000000o2) {
            i = i2 * o000000o2;
        }
        this.f3126OooOOo.OooOO0o(-i);
        this.f3127OooOOo0.f5127OooOO0 = i;
        return i;
    }

    public void o0000OOO(boolean z) {
        OooO0OO(null);
        if (this.f3132OooOo0O == z) {
            return;
        }
        this.f3132OooOo0O = z;
        Ooooooo();
    }

    public final void o0000OOo(int i, int i2, boolean z, o000O0O0 o000o0o0) {
        boolean z2;
        int i3;
        int OooO0oo2;
        int OooOoo02;
        o0Oo0oo o0oo0oo = this.f3127OooOOo0;
        int i4 = 1;
        boolean z3 = false;
        if (this.f3126OooOOo.OooO0oO() == 0 && this.f3126OooOOo.OooO0o0() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        o0oo0oo.f5129OooOO0o = z2;
        this.f3127OooOOo0.f5123OooO0o = i;
        int[] iArr = this.f3139OooOooO;
        iArr[0] = 0;
        iArr[1] = 0;
        o0Oo0oo(o000o0o0, iArr);
        int max = Math.max(0, iArr[0]);
        int max2 = Math.max(0, iArr[1]);
        if (i == 1) {
            z3 = true;
        }
        o0Oo0oo o0oo0oo2 = this.f3127OooOOo0;
        if (z3) {
            i3 = max2;
        } else {
            i3 = max;
        }
        o0oo0oo2.f5126OooO0oo = i3;
        if (!z3) {
            max = max2;
        }
        o0oo0oo2.f5118OooO = max;
        if (z3) {
            o0O0O00 o0o0o00 = this.f3126OooOOo;
            int i5 = o0o0o00.f5108OooO0Oo;
            o000OO o000oo = o0o0o00.f5026OooO00o;
            switch (i5) {
                case 0:
                    OooOoo02 = o000oo.OooOooO();
                    break;
                default:
                    OooOoo02 = o000oo.OooOoo0();
                    break;
            }
            o0oo0oo2.f5126OooO0oo = OooOoo02 + i3;
            View o00002 = o0000();
            o0Oo0oo o0oo0oo3 = this.f3127OooOOo0;
            if (this.f3130OooOo0) {
                i4 = -1;
            }
            o0oo0oo3.f5124OooO0o0 = i4;
            int Oooo0002 = o000OO.Oooo000(o00002);
            o0Oo0oo o0oo0oo4 = this.f3127OooOOo0;
            o0oo0oo3.f5122OooO0Oo = Oooo0002 + o0oo0oo4.f5124OooO0o0;
            o0oo0oo4.f5120OooO0O0 = this.f3126OooOOo.OooO0O0(o00002);
            OooO0oo2 = this.f3126OooOOo.OooO0O0(o00002) - this.f3126OooOOo.OooO0o();
        } else {
            View o0000O002 = o0000O00();
            o0Oo0oo o0oo0oo5 = this.f3127OooOOo0;
            o0oo0oo5.f5126OooO0oo = this.f3126OooOOo.OooO0oo() + o0oo0oo5.f5126OooO0oo;
            o0Oo0oo o0oo0oo6 = this.f3127OooOOo0;
            if (!this.f3130OooOo0) {
                i4 = -1;
            }
            o0oo0oo6.f5124OooO0o0 = i4;
            int Oooo0003 = o000OO.Oooo000(o0000O002);
            o0Oo0oo o0oo0oo7 = this.f3127OooOOo0;
            o0oo0oo6.f5122OooO0Oo = Oooo0003 + o0oo0oo7.f5124OooO0o0;
            o0oo0oo7.f5120OooO0O0 = this.f3126OooOOo.OooO0Oo(o0000O002);
            OooO0oo2 = (-this.f3126OooOOo.OooO0Oo(o0000O002)) + this.f3126OooOOo.OooO0oo();
        }
        o0Oo0oo o0oo0oo8 = this.f3127OooOOo0;
        o0oo0oo8.f5121OooO0OO = i2;
        if (z) {
            o0oo0oo8.f5121OooO0OO = i2 - OooO0oo2;
        }
        o0oo0oo8.f5125OooO0oO = OooO0oo2;
    }

    public final void o0000Oo(int i, int i2) {
        this.f3127OooOOo0.f5121OooO0OO = i2 - this.f3126OooOOo.OooO0oo();
        o0Oo0oo o0oo0oo = this.f3127OooOOo0;
        o0oo0oo.f5122OooO0Oo = i;
        o0oo0oo.f5124OooO0o0 = this.f3130OooOo0 ? 1 : -1;
        o0oo0oo.f5123OooO0o = -1;
        o0oo0oo.f5120OooO0O0 = i2;
        o0oo0oo.f5125OooO0oO = Integer.MIN_VALUE;
    }

    public final void o0000Oo0(int i, int i2) {
        this.f3127OooOOo0.f5121OooO0OO = this.f3126OooOOo.OooO0o() - i2;
        o0Oo0oo o0oo0oo = this.f3127OooOOo0;
        o0oo0oo.f5124OooO0o0 = this.f3130OooOo0 ? -1 : 1;
        o0oo0oo.f5122OooO0Oo = i;
        o0oo0oo.f5123OooO0o = 1;
        o0oo0oo.f5120OooO0O0 = i2;
        o0oo0oo.f5125OooO0oO = Integer.MIN_VALUE;
    }

    public View o0000Ooo(o000O00 o000o00, o000O0O0 o000o0o0, int i, int i2, int i3) {
        o000000O();
        int OooO0oo2 = this.f3126OooOOo.OooO0oo();
        int OooO0o2 = this.f3126OooOOo.OooO0o();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View OooOo02 = OooOo0(i);
            int Oooo0002 = o000OO.Oooo000(OooOo02);
            if (Oooo0002 >= 0 && Oooo0002 < i3) {
                if (((o0000O) OooOo02.getLayoutParams()).OooO0OO()) {
                    if (view2 == null) {
                        view2 = OooOo02;
                    }
                } else if (this.f3126OooOOo.OooO0Oo(OooOo02) < OooO0o2 && this.f3126OooOOo.OooO0O0(OooOo02) >= OooO0oo2) {
                    return OooOo02;
                } else {
                    if (view == null) {
                        view = OooOo02;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public void o0000oO(o000O00 o000o00, o000O0O0 o000o0o0, o0Oo0oo o0oo0oo, o0OOO0o o0ooo0o) {
        boolean z;
        int OooOOO0;
        int i;
        int i2;
        int i3;
        int OooOoo2;
        boolean z2;
        View OooO0O02 = o0oo0oo.OooO0O0(o000o00);
        if (OooO0O02 == null) {
            o0ooo0o.f5115OooO0O0 = true;
            return;
        }
        o0000O o0000o2 = (o0000O) OooO0O02.getLayoutParams();
        if (o0oo0oo.f5128OooOO0O == null) {
            boolean z3 = this.f3130OooOo0;
            if (o0oo0oo.f5123OooO0o == -1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z3 == z2) {
                OooO0O0(OooO0O02, -1, false);
            } else {
                OooO0O0(OooO0O02, 0, false);
            }
        } else {
            boolean z4 = this.f3130OooOo0;
            if (o0oo0oo.f5123OooO0o == -1) {
                z = true;
            } else {
                z = false;
            }
            if (z4 == z) {
                OooO0O0(OooO0O02, -1, true);
            } else {
                OooO0O0(OooO0O02, 0, true);
            }
        }
        o0000O o0000o3 = (o0000O) OooO0O02.getLayoutParams();
        Rect Oooo0O02 = this.f5007OooO0O0.Oooo0O0(OooO0O02);
        int OooOo0o2 = o000OO.OooOo0o(this.f5017OooOOO, this.f5016OooOO0o, OooOooO() + OooOoo() + ((ViewGroup.MarginLayoutParams) o0000o3).leftMargin + ((ViewGroup.MarginLayoutParams) o0000o3).rightMargin + Oooo0O02.left + Oooo0O02.right + 0, ((ViewGroup.MarginLayoutParams) o0000o3).width, OooO0Oo());
        int OooOo0o3 = o000OO.OooOo0o(this.f5018OooOOOO, this.OooOOO0, OooOoo0() + OooOooo() + ((ViewGroup.MarginLayoutParams) o0000o3).topMargin + ((ViewGroup.MarginLayoutParams) o0000o3).bottomMargin + Oooo0O02.top + Oooo0O02.bottom + 0, ((ViewGroup.MarginLayoutParams) o0000o3).height, OooO0o0());
        if (o00oO0o(OooO0O02, OooOo0o2, OooOo0o3, o0000o3)) {
            OooO0O02.measure(OooOo0o2, OooOo0o3);
        }
        o0ooo0o.f5114OooO00o = this.f3126OooOOo.OooO0OO(OooO0O02);
        if (this.f3125OooOOOo == 1) {
            if (o0000oo()) {
                i3 = this.f5017OooOOO - OooOooO();
                OooOoo2 = i3 - this.f3126OooOOo.OooOOO0(OooO0O02);
            } else {
                OooOoo2 = OooOoo();
                i3 = this.f3126OooOOo.OooOOO0(OooO0O02) + OooOoo2;
            }
            int i4 = o0oo0oo.f5123OooO0o;
            i2 = o0oo0oo.f5120OooO0O0;
            if (i4 == -1) {
                int i5 = OooOoo2;
                OooOOO0 = i2;
                i2 -= o0ooo0o.f5114OooO00o;
                i = i5;
            } else {
                i = OooOoo2;
                OooOOO0 = o0ooo0o.f5114OooO00o + i2;
            }
        } else {
            int OooOooo2 = OooOooo();
            OooOOO0 = this.f3126OooOOo.OooOOO0(OooO0O02) + OooOooo2;
            int i6 = o0oo0oo.f5123OooO0o;
            int i7 = o0oo0oo.f5120OooO0O0;
            if (i6 == -1) {
                i = i7 - o0ooo0o.f5114OooO00o;
                i3 = i7;
                i2 = OooOooo2;
            } else {
                int i8 = o0ooo0o.f5114OooO00o + i7;
                i = i7;
                i2 = OooOooo2;
                i3 = i8;
            }
        }
        o000OO.Oooo0o0(OooO0O02, i, i2, i3, OooOOO0);
        if (o0000o2.OooO0OO() || o0000o2.OooO0O0()) {
            o0ooo0o.f5116OooO0OO = true;
        }
        o0ooo0o.f5117OooO0Oo = OooO0O02.hasFocusable();
    }

    public final boolean o0000oo() {
        return OooOoOO() == 1;
    }

    public final void o000OO(o000O00 o000o00, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                View OooOo02 = OooOo0(i);
                Oooooo(i);
                o000o00.OooO0oO(OooOo02);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 >= i) {
                View OooOo03 = OooOo0(i2);
                Oooooo(i2);
                o000o00.OooO0oO(OooOo03);
            } else {
                return;
            }
        }
    }

    public final int o000OOo(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000000O();
        o0O0O00 o0o0o00 = this.f3126OooOOo;
        boolean z = !this.f3133OooOo0o;
        return o0000O00.OooO00o.Oooo0oo(o000o0o0, o0o0o00, o00000O0(z), o00000(z), this, this.f3133OooOo0o);
    }

    @Override // o000oOoO.o000OO
    public int o00O0O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (this.f3125OooOOOo == 0) {
            return 0;
        }
        return o0000OO0(i, o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final boolean o00oO0O() {
        boolean z;
        if (this.OooOOO0 == 1073741824 || this.f5016OooOO0o == 1073741824) {
            return false;
        }
        int OooOo0O2 = OooOo0O();
        int i = 0;
        while (true) {
            if (i < OooOo0O2) {
                ViewGroup.LayoutParams layoutParams = OooOo0(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final int o0O0O00(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000000O();
        o0O0O00 o0o0o00 = this.f3126OooOOo;
        boolean z = !this.f3133OooOo0o;
        return o0000O00.OooO00o.Oooo0oO(o000o0o0, o0o0o00, o00000O0(z), o00000(z), this, this.f3133OooOo0o, this.f3130OooOo0);
    }

    public void o0OO00O(o000O0O0 o000o0o0, o0Oo0oo o0oo0oo, o00O0O o00o0o) {
        int i = o0oo0oo.f5122OooO0Oo;
        if (i < 0 || i >= o000o0o0.OooO0O0()) {
            return;
        }
        o00o0o.Oooo0oo(i, Math.max(0, o0oo0oo.f5125OooO0oO));
    }

    @Override // o000oOoO.o000OO
    public boolean o0OOO0o() {
        return this.f3134OooOoO == null && this.f3128OooOOoo == this.f3132OooOo0O;
    }

    public void o0Oo0oo(o000O0O0 o000o0o0, int[] iArr) {
        boolean z;
        int i;
        int i2;
        if (o000o0o0.f4982OooO00o != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = this.f3126OooOOo.OooO();
        } else {
            i = 0;
        }
        if (this.f3127OooOOo0.f5123OooO0o == -1) {
            i2 = 0;
        } else {
            i2 = i;
            i = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    @Override // o000oOoO.o000OO
    public int o0OoOo0(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (this.f3125OooOOOo == 1) {
            return 0;
        }
        return o0000OO0(i, o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public void o0ooOOo(RecyclerView recyclerView, int i) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(recyclerView.getContext());
        oo0o0oo.f5175OooO00o = i;
        o0ooOoO(oo0o0oo);
    }

    public final int oo0o0Oo(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000000O();
        o0O0O00 o0o0o00 = this.f3126OooOOo;
        boolean z = !this.f3133OooOo0o;
        return o0000O00.OooO00o.Oooo0o(o000o0o0, o0o0o00, o00000O0(z), o00000(z), this, this.f3133OooOo0o);
    }

    @Override // o000oOoO.o000OO
    public final void ooOO(int i) {
        this.f3129OooOo = i;
        this.f3135OooOoO0 = Integer.MIN_VALUE;
        o0OO00O o0oo00o = this.f3134OooOoO;
        if (o0oo00o != null) {
            o0oo00o.f5111OooO00o = -1;
        }
        Ooooooo();
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3125OooOOOo = 1;
        this.f3131OooOo00 = false;
        this.f3130OooOo0 = false;
        this.f3132OooOo0O = false;
        this.f3133OooOo0o = true;
        this.f3129OooOo = -1;
        this.f3135OooOoO0 = Integer.MIN_VALUE;
        this.f3134OooOoO = null;
        this.f3136OooOoOO = new o0ooOOo();
        this.f3138OooOoo0 = new o0OOO0o();
        this.f3137OooOoo = 2;
        this.f3139OooOooO = new int[2];
        o0000O0O Oooo00O2 = o000OO.Oooo00O(context, attributeSet, i, i2);
        o0000OO(Oooo00O2.f4962OooO00o);
        boolean z = Oooo00O2.f4964OooO0OO;
        OooO0OO(null);
        if (z != this.f3131OooOo00) {
            this.f3131OooOo00 = z;
            Ooooooo();
        }
        o0000OOO(Oooo00O2.f4965OooO0Oo);
    }
}