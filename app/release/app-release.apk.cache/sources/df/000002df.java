package androidx.appcompat.widget;

/* loaded from: classes.dex */
public final class o0O000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2422OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f2423OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2424OooO0OO = Integer.MIN_VALUE;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2425OooO0Oo = Integer.MIN_VALUE;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f2427OooO0o0 = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f2426OooO0o = 0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2428OooO0oO = false;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2429OooO0oo = false;

    public final void OooO00o(int i, int i2) {
        this.f2424OooO0OO = i;
        this.f2425OooO0Oo = i2;
        this.f2429OooO0oo = true;
        if (this.f2428OooO0oO) {
            if (i2 != Integer.MIN_VALUE) {
                this.f2422OooO00o = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f2423OooO0O0 = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f2422OooO00o = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f2423OooO0O0 = i2;
        }
    }
}