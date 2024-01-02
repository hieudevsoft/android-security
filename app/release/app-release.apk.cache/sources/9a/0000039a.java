package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class o00000 implements o00Ooo {

    /* renamed from: OooO  reason: collision with root package name */
    public static final o00000 f3068OooO = new o00000();

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3069OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f3070OooO0O0;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Handler f3074OooO0o0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f3071OooO0OO = true;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f3072OooO0Oo = true;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o00oO0o f3073OooO0o = new o00oO0o(this);

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final androidx.activity.OooO0o f3075OooO0oO = new androidx.activity.OooO0o(6, this);

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final o000000O f3076OooO0oo = new o000000O(this);

    public final void OooO00o() {
        int i = this.f3070OooO0O0 + 1;
        this.f3070OooO0O0 = i;
        if (i == 1) {
            if (this.f3071OooO0OO) {
                this.f3073OooO0o.OooO0o0(OooOo.ON_RESUME);
                this.f3071OooO0OO = false;
                return;
            }
            Handler handler = this.f3074OooO0o0;
            o0000O00.OooO00o.OooOo(handler);
            handler.removeCallbacks(this.f3075OooO0oO);
        }
    }

    @Override // androidx.lifecycle.o00Ooo
    public final o00oO0o OooO0oO() {
        return this.f3073OooO0o;
    }
}