package androidx.activity;

import androidx.fragment.app.o00000;

/* loaded from: classes.dex */
public final class o0ooOOo implements OooO0OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000 f1969OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f1970OooO0O0;

    public o0ooOOo(o0Oo0oo o0oo0oo, o00000 o00000Var) {
        this.f1970OooO0O0 = o0oo0oo;
        this.f1969OooO00o = o00000Var;
    }

    @Override // androidx.activity.OooO0OO
    public final void cancel() {
        o0Oo0oo o0oo0oo = this.f1970OooO0O0;
        o0000.OooOOO oooOOO = o0oo0oo.f1961OooO0O0;
        o00000 o00000Var = this.f1969OooO00o;
        oooOOO.remove(o00000Var);
        if (o0000O00.OooO00o.OooOOO0(o0oo0oo.f1962OooO0OO, o00000Var)) {
            o00000Var.getClass();
            o0oo0oo.f1962OooO0OO = null;
        }
        o00000Var.getClass();
        o00000Var.f2816OooO0O0.remove(this);
        o0000O0O.OooO00o oooO00o = o00000Var.f2817OooO0OO;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        o00000Var.f2817OooO0OO = null;
    }
}