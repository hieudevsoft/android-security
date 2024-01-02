package o0000oOO;

/* loaded from: classes.dex */
public final class o0000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f4673OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int[] f4674OooO0O0 = new int[10];

    public final int OooO00o() {
        if ((this.f4673OooO00o & 128) != 0) {
            return this.f4674OooO0O0[7];
        }
        return 65535;
    }

    public final void OooO0O0(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f4674OooO0O0;
            if (i >= iArr.length) {
                return;
            }
            this.f4673OooO00o = (1 << i) | this.f4673OooO00o;
            iArr[i] = i2;
        }
    }
}