package o0000Oo0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO0OO implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f4388OooO00o = -1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4389OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4390OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0000OO.OooO0OO f4391OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ OooO0o f4392OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4393OooO0o0;

    public OooO0OO(OooO0o oooO0o) {
        this.f4392OooO0o = oooO0o;
        int i = oooO0o.f4395OooO0O0;
        int length = oooO0o.f4394OooO00o.length();
        if (length >= 0) {
            if (i < 0) {
                i = 0;
            } else if (i > length) {
                i = length;
            }
            this.f4389OooO0O0 = i;
            this.f4390OooO0OO = i;
            return;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + length + " is less than minimum 0.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r6 < r3) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO00o() {
        /*
            r7 = this;
            int r0 = r7.f4390OooO0OO
            r1 = 0
            if (r0 >= 0) goto Lc
            r7.f4388OooO00o = r1
            r0 = 0
            r7.f4391OooO0Oo = r0
            goto L85
        Lc:
            o0000Oo0.OooO0o r2 = r7.f4392OooO0o
            int r3 = r2.f4396OooO0OO
            java.lang.CharSequence r4 = r2.f4394OooO00o
            r5 = 1
            if (r3 <= 0) goto L1c
            int r6 = r7.f4393OooO0o0
            int r6 = r6 + r5
            r7.f4393OooO0o0 = r6
            if (r6 >= r3) goto L22
        L1c:
            int r3 = r4.length()
            if (r0 <= r3) goto L2e
        L22:
            o0000OO.OooO0OO r0 = new o0000OO.OooO0OO
            int r1 = r7.f4389OooO0O0
            int r2 = o0000Oo0.OooOOOO.o00O0OO(r4)
            r0.<init>(r1, r2)
            goto L5c
        L2e:
            int r0 = r7.f4390OooO0OO
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            o0000O0O.o0OoOo0 r2 = r2.f4397OooO0Oo
            o0000Oo0.OooOOO r2 = (o0000Oo0.OooOOO) r2
            int r3 = r2.f4398OooO00o
            switch(r3) {
                case 0: goto L3e;
                default: goto L3d;
            }
        L3d:
            goto L47
        L3e:
            int r0 = r0.intValue()
            o00000oo.o00O0O r0 = r2.OooO0OO(r0, r4)
            goto L4f
        L47:
            int r0 = r0.intValue()
            o00000oo.o00O0O r0 = r2.OooO0OO(r0, r4)
        L4f:
            if (r0 != 0) goto L62
            o0000OO.OooO0OO r0 = new o0000OO.OooO0OO
            int r1 = r7.f4389OooO0O0
            int r2 = o0000Oo0.OooOOOO.o00O0OO(r4)
            r0.<init>(r1, r2)
        L5c:
            r7.f4391OooO0Oo = r0
            r0 = -1
            r7.f4390OooO0OO = r0
            goto L83
        L62:
            java.lang.Object r2 = r0.f4100OooO00o
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f4101OooO0O0
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f4389OooO0O0
            o0000OO.OooO0OO r3 = o0000O00.OooO00o.o00oOoo(r3, r2)
            r7.f4391OooO0Oo = r3
            int r2 = r2 + r0
            r7.f4389OooO0O0 = r2
            if (r0 != 0) goto L80
            r1 = r5
        L80:
            int r2 = r2 + r1
            r7.f4390OooO0OO = r2
        L83:
            r7.f4388OooO00o = r5
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000Oo0.OooO0OO.OooO00o():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f4388OooO00o == -1) {
            OooO00o();
        }
        return this.f4388OooO00o == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4388OooO00o == -1) {
            OooO00o();
        }
        if (this.f4388OooO00o != 0) {
            o0000OO.OooO0OO oooO0OO = this.f4391OooO0Oo;
            OooO00o.OooOoO0(oooO0OO, "null cannot be cast to non-null type kotlin.ranges.IntRange");
            this.f4391OooO0Oo = null;
            this.f4388OooO00o = -1;
            return oooO0OO;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}