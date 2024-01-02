package androidx.appcompat.widget;

import android.util.SparseIntArray;

/* loaded from: classes.dex */
public final class o0O0o00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2475OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f2476OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f2477OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Object f2478OooO0Oo;

    public o0O0o00O(int i) {
        if (i != 1) {
            return;
        }
        this.f2477OooO0OO = new SparseIntArray();
        this.f2478OooO0Oo = new SparseIntArray();
        this.f2475OooO00o = false;
        this.f2476OooO0O0 = false;
    }

    public final int OooO00o(int i, int i2) {
        if (!this.f2476OooO0O0) {
            return OooO0OO(i, i2);
        }
        int i3 = ((SparseIntArray) this.f2478OooO0Oo).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int OooO0OO2 = OooO0OO(i, i2);
        ((SparseIntArray) this.f2478OooO0Oo).put(i, OooO0OO2);
        return OooO0OO2;
    }

    public final int OooO0O0(int i, int i2) {
        if (!this.f2475OooO00o) {
            return i % i2;
        }
        int i3 = ((SparseIntArray) this.f2477OooO0OO).get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = i % i2;
        ((SparseIntArray) this.f2477OooO0OO).put(i, i4);
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0OO(int r9, int r10) {
        /*
            r8 = this;
            boolean r0 = r8.f2476OooO0O0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L48
            java.lang.Object r0 = r8.f2478OooO0Oo
            android.util.SparseIntArray r0 = (android.util.SparseIntArray) r0
            int r3 = r0.size()
            r4 = -1
            int r3 = r3 + r4
            r5 = r2
        L11:
            if (r5 > r3) goto L22
            int r6 = r5 + r3
            int r6 = r6 >>> r1
            int r7 = r0.keyAt(r6)
            if (r7 >= r9) goto L1f
            int r5 = r6 + 1
            goto L11
        L1f:
            int r3 = r6 + (-1)
            goto L11
        L22:
            int r5 = r5 + r4
            if (r5 < 0) goto L30
            int r3 = r0.size()
            if (r5 >= r3) goto L30
            int r0 = r0.keyAt(r5)
            goto L31
        L30:
            r0 = r4
        L31:
            if (r0 == r4) goto L48
            java.lang.Object r3 = r8.f2478OooO0Oo
            android.util.SparseIntArray r3 = (android.util.SparseIntArray) r3
            int r3 = r3.get(r0)
            int r4 = r0 + 1
            int r0 = r8.OooO0O0(r0, r10)
            int r0 = r0 + r1
            if (r0 != r10) goto L4b
            int r3 = r3 + 1
            r0 = r2
            goto L4b
        L48:
            r0 = r2
            r3 = r0
            r4 = r3
        L4b:
            if (r4 >= r9) goto L5d
            int r0 = r0 + 1
            if (r0 != r10) goto L55
            int r3 = r3 + 1
            r0 = r2
            goto L5a
        L55:
            if (r0 <= r10) goto L5a
            int r3 = r3 + 1
            r0 = r1
        L5a:
            int r4 = r4 + 1
            goto L4b
        L5d:
            int r0 = r0 + r1
            if (r0 <= r10) goto L62
            int r3 = r3 + 1
        L62:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.o0O0o00O.OooO0OO(int, int):int");
    }

    public final void OooO0Oo() {
        ((SparseIntArray) this.f2477OooO0OO).clear();
    }
}