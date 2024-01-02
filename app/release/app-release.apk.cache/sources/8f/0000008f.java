package OooOO0o;

import OooO0o.OooOOO0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class OooOo00 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public OooOOOO f596OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00O0O f593OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public float f594OooO0O0 = 0.0f;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f595OooO0OO = new ArrayList();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f597OooO0o0 = false;

    public OooOo00(OooOOO0 oooOOO0) {
        this.f596OooO0Oo = new OooOOO(this, oooOOO0);
    }

    public void OooO(OooOo oooOo, OooOo00 oooOo00, boolean z) {
        float OooO2 = this.f596OooO0Oo.OooO(oooOo00, z);
        this.f594OooO0O0 = (oooOo00.f594OooO0O0 * OooO2) + this.f594OooO0O0;
        if (z) {
            oooOo00.f593OooO00o.OooO0O0(this);
        }
        if (this.f593OooO00o == null || this.f596OooO0Oo.OooOO0O() != 0) {
            return;
        }
        this.f597OooO0o0 = true;
        oooOo.f580OooO00o = true;
    }

    public final void OooO00o(OooOo oooOo, int i) {
        this.f596OooO0Oo.OooO0o0(oooOo.OooOO0O(i), 1.0f);
        this.f596OooO0Oo.OooO0o0(oooOo.OooOO0O(i), -1.0f);
    }

    public final void OooO0O0(o00O0O o00o0o, o00O0O o00o0o2, o00O0O o00o0o3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f594OooO0O0 = i;
        }
        if (z) {
            this.f596OooO0Oo.OooO0o0(o00o0o, 1.0f);
            this.f596OooO0Oo.OooO0o0(o00o0o2, -1.0f);
            this.f596OooO0Oo.OooO0o0(o00o0o3, -1.0f);
            return;
        }
        this.f596OooO0Oo.OooO0o0(o00o0o, -1.0f);
        this.f596OooO0Oo.OooO0o0(o00o0o2, 1.0f);
        this.f596OooO0Oo.OooO0o0(o00o0o3, 1.0f);
    }

    public final void OooO0OO(o00O0O o00o0o, o00O0O o00o0o2, o00O0O o00o0o3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f594OooO0O0 = i;
        }
        if (z) {
            this.f596OooO0Oo.OooO0o0(o00o0o, 1.0f);
            this.f596OooO0Oo.OooO0o0(o00o0o2, -1.0f);
            this.f596OooO0Oo.OooO0o0(o00o0o3, 1.0f);
            return;
        }
        this.f596OooO0Oo.OooO0o0(o00o0o, -1.0f);
        this.f596OooO0Oo.OooO0o0(o00o0o2, 1.0f);
        this.f596OooO0Oo.OooO0o0(o00o0o3, -1.0f);
    }

    public o00O0O OooO0Oo(boolean[] zArr) {
        return OooO0o(zArr, null);
    }

    public final o00O0O OooO0o(boolean[] zArr, o00O0O o00o0o) {
        int i;
        int OooOO0O2 = this.f596OooO0Oo.OooOO0O();
        o00O0O o00o0o2 = null;
        float f = 0.0f;
        for (int i2 = 0; i2 < OooOO0O2; i2++) {
            float OooO00o2 = this.f596OooO0Oo.OooO00o(i2);
            if (OooO00o2 < 0.0f) {
                o00O0O OooO0O02 = this.f596OooO0Oo.OooO0O0(i2);
                if ((zArr == null || !zArr[OooO0O02.f609OooO0O0]) && OooO0O02 != o00o0o && (((i = OooO0O02.f618OooOO0o) == 3 || i == 4) && OooO00o2 < f)) {
                    f = OooO00o2;
                    o00o0o2 = OooO0O02;
                }
            }
        }
        return o00o0o2;
    }

    public boolean OooO0o0() {
        return this.f593OooO00o == null && this.f594OooO0O0 == 0.0f && this.f596OooO0Oo.OooOO0O() == 0;
    }

    public final void OooO0oO(o00O0O o00o0o) {
        o00O0O o00o0o2 = this.f593OooO00o;
        if (o00o0o2 != null) {
            this.f596OooO0Oo.OooO0o0(o00o0o2, -1.0f);
            this.f593OooO00o.f610OooO0OO = -1;
            this.f593OooO00o = null;
        }
        float OooO0Oo2 = this.f596OooO0Oo.OooO0Oo(o00o0o, true) * (-1.0f);
        this.f593OooO00o = o00o0o;
        if (OooO0Oo2 == 1.0f) {
            return;
        }
        this.f594OooO0O0 /= OooO0Oo2;
        this.f596OooO0Oo.OooO0oO(OooO0Oo2);
    }

    public final void OooO0oo(OooOo oooOo, o00O0O o00o0o, boolean z) {
        if (o00o0o == null || !o00o0o.f612OooO0o) {
            return;
        }
        float OooO0oo2 = this.f596OooO0Oo.OooO0oo(o00o0o);
        this.f594OooO0O0 = (o00o0o.f613OooO0o0 * OooO0oo2) + this.f594OooO0O0;
        this.f596OooO0Oo.OooO0Oo(o00o0o, z);
        if (z) {
            o00o0o.OooO0O0(this);
        }
        if (this.f596OooO0Oo.OooOO0O() == 0) {
            this.f597OooO0o0 = true;
            oooOo.f580OooO00o = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            OooOO0o.o00O0O r0 = r9.f593OooO00o
            if (r0 != 0) goto L7
            java.lang.String r0 = "0"
            goto L17
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            OooOO0o.o00O0O r1 = r9.f593OooO00o
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L17:
            java.lang.String r1 = " = "
            java.lang.String r0 = OooO0O0.OooO00o.OooO0OO(r0, r1)
            float r1 = r9.f594OooO0O0
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L39
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f594OooO0O0
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r3
            goto L3a
        L39:
            r1 = r4
        L3a:
            OooOO0o.OooOOOO r5 = r9.f596OooO0Oo
            int r5 = r5.OooOO0O()
        L40:
            if (r4 >= r5) goto Lb2
            OooOO0o.OooOOOO r6 = r9.f596OooO0Oo
            OooOO0o.o00O0O r6 = r6.OooO0O0(r4)
            if (r6 != 0) goto L4b
            goto Laf
        L4b:
            OooOO0o.OooOOOO r7 = r9.f596OooO0Oo
            float r7 = r7.OooO00o(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L56
            goto Laf
        L56:
            java.lang.String r6 = r6.toString()
            if (r1 != 0) goto L6b
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L8b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto L81
        L6b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            if (r8 <= 0) goto L7f
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L8b
        L7f:
            java.lang.String r0 = " - "
        L81:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r7 = r7 * r1
        L8b:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L97
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto La4
        L97:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        La4:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r3
        Laf:
            int r4 = r4 + 1
            goto L40
        Lb2:
            if (r1 != 0) goto Lba
            java.lang.String r1 = "0.0"
            java.lang.String r0 = OooO0O0.OooO00o.OooO0OO(r0, r1)
        Lba:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0o.OooOo00.toString():java.lang.String");
    }
}