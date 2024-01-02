package androidx.fragment.app;

import OoooOOO.o0OO000o;
import OoooOOO.oo0oO0;
import OoooOOO.oo0ooO;

/* loaded from: classes.dex */
public final class o000OO00 implements androidx.lifecycle.OooOOO0, oo0ooO, androidx.lifecycle.o0000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.lifecycle.o000OO f2926OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public androidx.lifecycle.o00oO0o f2927OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public oo0oO0 f2928OooO0OO = null;

    public o000OO00(androidx.lifecycle.o000OO o000oo) {
        this.f2926OooO00o = o000oo;
    }

    @Override // OoooOOO.oo0ooO
    public final o0OO000o OooO0O0() {
        OooO0o0();
        return this.f2928OooO0OO.f1576OooO0O0;
    }

    @Override // androidx.lifecycle.o0000O
    public final androidx.lifecycle.o000OO OooO0OO() {
        OooO0o0();
        return this.f2926OooO00o;
    }

    public final void OooO0Oo(androidx.lifecycle.OooOo oooOo) {
        this.f2927OooO0O0.OooO0o0(oooOo);
    }

    public final void OooO0o0() {
        if (this.f2927OooO0O0 == null) {
            this.f2927OooO0O0 = new androidx.lifecycle.o00oO0o(this);
            this.f2928OooO0OO = o0ooOO0.OooOOO0.OooO0o0(this);
        }
    }

    @Override // androidx.lifecycle.o00Ooo
    public final androidx.lifecycle.o00oO0o OooO0oO() {
        OooO0o0();
        return this.f2927OooO0O0;
    }
}