package OooOO0o;

import OooO0o.OooOOO0;
import androidx.activity.result.OooO0o;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o000oOoO extends OooOo00 {

    /* renamed from: OooO  reason: collision with root package name */
    public final OooO0o f603OooO;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o00O0O[] f604OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o00O0O[] f605OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f606OooO0oo;

    public o000oOoO(OooOOO0 oooOOO0) {
        super(oooOOO0);
        this.f604OooO0o = new o00O0O[128];
        this.f605OooO0oO = new o00O0O[128];
        this.f606OooO0oo = 0;
        this.f603OooO = new OooO0o(this, this);
    }

    @Override // OooOO0o.OooOo00
    public final void OooO(OooOo oooOo, OooOo00 oooOo00, boolean z) {
        boolean z2;
        o00O0O o00o0o = oooOo00.f593OooO00o;
        if (o00o0o == null) {
            return;
        }
        OooOOOO oooOOOO = oooOo00.f596OooO0Oo;
        int OooOO0O2 = oooOOOO.OooOO0O();
        for (int i = 0; i < OooOO0O2; i++) {
            o00O0O OooO0O02 = oooOOOO.OooO0O0(i);
            float OooO00o2 = oooOOOO.OooO00o(i);
            OooO0o oooO0o = this.f603OooO;
            oooO0o.f1982OooO0O0 = OooO0O02;
            boolean z3 = OooO0O02.f608OooO00o;
            float[] fArr = o00o0o.f615OooO0oo;
            if (z3) {
                boolean z4 = true;
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr2 = ((o00O0O) oooO0o.f1982OooO0O0).f615OooO0oo;
                    float f = (fArr[i2] * OooO00o2) + fArr2[i2];
                    fArr2[i2] = f;
                    if (Math.abs(f) < 1.0E-4f) {
                        ((o00O0O) oooO0o.f1982OooO0O0).f615OooO0oo[i2] = 0.0f;
                    } else {
                        z4 = false;
                    }
                }
                if (z4) {
                    ((o000oOoO) oooO0o.f1984OooO0Oo).OooOO0O((o00O0O) oooO0o.f1982OooO0O0);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != 0.0f) {
                        float f3 = f2 * OooO00o2;
                        if (Math.abs(f3) < 1.0E-4f) {
                            f3 = 0.0f;
                        }
                        ((o00O0O) oooO0o.f1982OooO0O0).f615OooO0oo[i3] = f3;
                    } else {
                        ((o00O0O) oooO0o.f1982OooO0O0).f615OooO0oo[i3] = 0.0f;
                    }
                }
                z2 = true;
            }
            if (z2) {
                OooOO0(OooO0O02);
            }
            this.f594OooO0O0 = (oooOo00.f594OooO0O0 * OooO00o2) + this.f594OooO0O0;
        }
        OooOO0O(o00o0o);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
        if (r9 < r8) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
        r5 = false;
     */
    @Override // OooOO0o.OooOo00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final OooOO0o.o00O0O OooO0Oo(boolean[] r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r3 = r0
            r2 = r1
        L4:
            int r4 = r11.f606OooO0oo
            if (r2 >= r4) goto L5b
            OooOO0o.o00O0O[] r4 = r11.f604OooO0o
            r5 = r4[r2]
            int r6 = r5.f609OooO0O0
            boolean r6 = r12[r6]
            if (r6 == 0) goto L13
            goto L58
        L13:
            androidx.activity.result.OooO0o r6 = r11.f603OooO
            r6.f1982OooO0O0 = r5
            r5 = 1
            r7 = 8
            if (r3 != r0) goto L38
        L1c:
            if (r7 < 0) goto L34
            java.lang.Object r4 = r6.f1982OooO0O0
            OooOO0o.o00O0O r4 = (OooOO0o.o00O0O) r4
            float[] r4 = r4.f615OooO0oo
            r4 = r4[r7]
            r8 = 0
            int r9 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r9 <= 0) goto L2c
            goto L34
        L2c:
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 >= 0) goto L31
            goto L35
        L31:
            int r7 = r7 + (-1)
            goto L1c
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L58
            goto L57
        L38:
            r4 = r4[r3]
        L3a:
            if (r7 < 0) goto L54
            float[] r8 = r4.f615OooO0oo
            r8 = r8[r7]
            java.lang.Object r9 = r6.f1982OooO0O0
            OooOO0o.o00O0O r9 = (OooOO0o.o00O0O) r9
            float[] r9 = r9.f615OooO0oo
            r9 = r9[r7]
            int r10 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r10 != 0) goto L4f
            int r7 = r7 + (-1)
            goto L3a
        L4f:
            int r4 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r4 >= 0) goto L54
            goto L55
        L54:
            r5 = r1
        L55:
            if (r5 == 0) goto L58
        L57:
            r3 = r2
        L58:
            int r2 = r2 + 1
            goto L4
        L5b:
            if (r3 != r0) goto L5f
            r12 = 0
            return r12
        L5f:
            OooOO0o.o00O0O[] r12 = r11.f604OooO0o
            r12 = r12[r3]
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0o.o000oOoO.OooO0Oo(boolean[]):OooOO0o.o00O0O");
    }

    @Override // OooOO0o.OooOo00
    public final boolean OooO0o0() {
        return this.f606OooO0oo == 0;
    }

    public final void OooOO0(o00O0O o00o0o) {
        int i;
        int i2 = this.f606OooO0oo + 1;
        o00O0O[] o00o0oArr = this.f604OooO0o;
        if (i2 > o00o0oArr.length) {
            o00O0O[] o00o0oArr2 = (o00O0O[]) Arrays.copyOf(o00o0oArr, o00o0oArr.length * 2);
            this.f604OooO0o = o00o0oArr2;
            this.f605OooO0oO = (o00O0O[]) Arrays.copyOf(o00o0oArr2, o00o0oArr2.length * 2);
        }
        o00O0O[] o00o0oArr3 = this.f604OooO0o;
        int i3 = this.f606OooO0oo;
        o00o0oArr3[i3] = o00o0o;
        int i4 = i3 + 1;
        this.f606OooO0oo = i4;
        if (i4 > 1 && o00o0oArr3[i4 - 1].f609OooO0O0 > o00o0o.f609OooO0O0) {
            int i5 = 0;
            while (true) {
                i = this.f606OooO0oo;
                if (i5 >= i) {
                    break;
                }
                this.f605OooO0oO[i5] = this.f604OooO0o[i5];
                i5++;
            }
            Arrays.sort(this.f605OooO0oO, 0, i, new Oooo0(0, this));
            for (int i6 = 0; i6 < this.f606OooO0oo; i6++) {
                this.f604OooO0o[i6] = this.f605OooO0oO[i6];
            }
        }
        o00o0o.f608OooO00o = true;
        o00o0o.OooO00o(this);
    }

    public final void OooOO0O(o00O0O o00o0o) {
        int i = 0;
        while (i < this.f606OooO0oo) {
            if (this.f604OooO0o[i] == o00o0o) {
                while (true) {
                    int i2 = this.f606OooO0oo;
                    if (i >= i2 - 1) {
                        this.f606OooO0oo = i2 - 1;
                        o00o0o.f608OooO00o = false;
                        return;
                    }
                    o00O0O[] o00o0oArr = this.f604OooO0o;
                    int i3 = i + 1;
                    o00o0oArr[i] = o00o0oArr[i3];
                    i = i3;
                }
            } else {
                i++;
            }
        }
    }

    @Override // OooOO0o.OooOo00
    public final String toString() {
        String str = " goal -> (" + this.f594OooO0O0 + ") : ";
        for (int i = 0; i < this.f606OooO0oo; i++) {
            o00O0O o00o0o = this.f604OooO0o[i];
            OooO0o oooO0o = this.f603OooO;
            oooO0o.f1982OooO0O0 = o00o0o;
            str = str + oooO0o + " ";
        }
        return str;
    }
}