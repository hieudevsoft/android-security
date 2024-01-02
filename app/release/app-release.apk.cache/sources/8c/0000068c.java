package o000oOoO;

/* loaded from: classes.dex */
public final class oOO00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5164OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5165OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5166OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5167OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f5168OooO0o0;

    public final boolean OooO00o() {
        int i = this.f5164OooO00o;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f5167OooO0Oo;
            int i4 = this.f5165OooO0O0;
            if ((((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) << 0) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f5167OooO0Oo;
            int i6 = this.f5166OooO0OO;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f5168OooO0o0;
            int i8 = this.f5165OooO0O0;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f5168OooO0o0;
            int i10 = this.f5166OooO0OO;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}