package o000O000;

/* loaded from: classes.dex */
public final class o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final byte[] f4844OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4845OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4846OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4847OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o00O0O f4848OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f4849OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o00O0O f4850OooO0oO;

    public o00O0O() {
        this.f4844OooO00o = new byte[8192];
        this.f4849OooO0o0 = true;
        this.f4847OooO0Oo = false;
    }

    public final o00O0O OooO00o() {
        o00O0O o00o0o = this.f4848OooO0o;
        if (o00o0o == this) {
            o00o0o = null;
        }
        o00O0O o00o0o2 = this.f4850OooO0oO;
        o0000O00.OooO00o.OooOo(o00o0o2);
        o00o0o2.f4848OooO0o = this.f4848OooO0o;
        o00O0O o00o0o3 = this.f4848OooO0o;
        o0000O00.OooO00o.OooOo(o00o0o3);
        o00o0o3.f4850OooO0oO = this.f4850OooO0oO;
        this.f4848OooO0o = null;
        this.f4850OooO0oO = null;
        return o00o0o;
    }

    public final void OooO0O0(o00O0O o00o0o) {
        o00o0o.f4850OooO0oO = this;
        o00o0o.f4848OooO0o = this.f4848OooO0o;
        o00O0O o00o0o2 = this.f4848OooO0o;
        o0000O00.OooO00o.OooOo(o00o0o2);
        o00o0o2.f4850OooO0oO = o00o0o;
        this.f4848OooO0o = o00o0o;
    }

    public final o00O0O OooO0OO() {
        this.f4847OooO0Oo = true;
        return new o00O0O(this.f4844OooO00o, this.f4845OooO0O0, this.f4846OooO0OO, true);
    }

    public final void OooO0Oo(o00O0O o00o0o, int i) {
        if (o00o0o.f4849OooO0o0) {
            int i2 = o00o0o.f4846OooO0OO;
            int i3 = i2 + i;
            byte[] bArr = o00o0o.f4844OooO00o;
            if (i3 > 8192) {
                if (!o00o0o.f4847OooO0Oo) {
                    int i4 = o00o0o.f4845OooO0O0;
                    if (i3 - i4 <= 8192) {
                        o0000.OooOOOO.o00O0OO0(0, i4, i2, bArr, bArr);
                        o00o0o.f4846OooO0OO -= o00o0o.f4845OooO0O0;
                        o00o0o.f4845OooO0O0 = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i5 = o00o0o.f4846OooO0OO;
            int i6 = this.f4845OooO0O0;
            o0000.OooOOOO.o00O0OO0(i5, i6, i6 + i, this.f4844OooO00o, bArr);
            o00o0o.f4846OooO0OO += i;
            this.f4845OooO0O0 += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public o00O0O(byte[] bArr, int i, int i2, boolean z) {
        o0000O00.OooO00o.OooOoo0(bArr, "data");
        this.f4844OooO00o = bArr;
        this.f4845OooO0O0 = i;
        this.f4846OooO0OO = i2;
        this.f4847OooO0Oo = z;
        this.f4849OooO0o0 = false;
    }
}