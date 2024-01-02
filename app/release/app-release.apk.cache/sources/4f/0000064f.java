package o000oOoO;

/* loaded from: classes.dex */
public final class OooO0OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public long f4892OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0OO f4893OooO0O0;

    public final void OooO00o(int i) {
        if (i < 64) {
            this.f4892OooO00o &= ~(1 << i);
            return;
        }
        OooO0OO oooO0OO = this.f4893OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO00o(i - 64);
        }
    }

    public final int OooO0O0(int i) {
        long j;
        OooO0OO oooO0OO = this.f4893OooO0O0;
        if (oooO0OO == null) {
            if (i >= 64) {
                j = this.f4892OooO00o;
                return Long.bitCount(j);
            }
        } else if (i >= 64) {
            return Long.bitCount(this.f4892OooO00o) + oooO0OO.OooO0O0(i - 64);
        }
        j = this.f4892OooO00o & ((1 << i) - 1);
        return Long.bitCount(j);
    }

    public final void OooO0OO() {
        if (this.f4893OooO0O0 == null) {
            this.f4893OooO0O0 = new OooO0OO();
        }
    }

    public final boolean OooO0Oo(int i) {
        if (i < 64) {
            return (this.f4892OooO00o & (1 << i)) != 0;
        }
        OooO0OO();
        return this.f4893OooO0O0.OooO0Oo(i - 64);
    }

    public final boolean OooO0o(int i) {
        if (i >= 64) {
            OooO0OO();
            return this.f4893OooO0O0.OooO0o(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f4892OooO00o;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.f4892OooO00o = j3;
        long j4 = j - 1;
        this.f4892OooO00o = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        OooO0OO oooO0OO = this.f4893OooO0O0;
        if (oooO0OO != null) {
            if (oooO0OO.OooO0Oo(0)) {
                OooO0oo(63);
            }
            this.f4893OooO0O0.OooO0o(0);
        }
        return z;
    }

    public final void OooO0o0(int i, boolean z) {
        if (i >= 64) {
            OooO0OO();
            this.f4893OooO0O0.OooO0o0(i - 64, z);
            return;
        }
        long j = this.f4892OooO00o;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.f4892OooO00o = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            OooO0oo(i);
        } else {
            OooO00o(i);
        }
        if (z2 || this.f4893OooO0O0 != null) {
            OooO0OO();
            this.f4893OooO0O0.OooO0o0(0, z2);
        }
    }

    public final void OooO0oO() {
        this.f4892OooO00o = 0L;
        OooO0OO oooO0OO = this.f4893OooO0O0;
        if (oooO0OO != null) {
            oooO0OO.OooO0oO();
        }
    }

    public final void OooO0oo(int i) {
        if (i < 64) {
            this.f4892OooO00o |= 1 << i;
            return;
        }
        OooO0OO();
        this.f4893OooO0O0.OooO0oo(i - 64);
    }

    public final String toString() {
        if (this.f4893OooO0O0 == null) {
            return Long.toBinaryString(this.f4892OooO00o);
        }
        return this.f4893OooO0O0.toString() + "xx" + Long.toBinaryString(this.f4892OooO00o);
    }
}