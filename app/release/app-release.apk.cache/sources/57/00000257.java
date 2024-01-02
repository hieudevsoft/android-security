package androidx.activity;

import androidx.fragment.app.o00000;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.o00O0O, OooO0OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.lifecycle.Oooo0 f1906OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00000 f1907OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0ooOOo f1908OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f1909OooO0Oo;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(o0Oo0oo o0oo0oo, androidx.lifecycle.Oooo0 oooo0, o00000 o00000Var) {
        o0000O00.OooO00o.OooOoo0(o00000Var, "onBackPressedCallback");
        this.f1909OooO0Oo = o0oo0oo;
        this.f1906OooO00o = oooo0;
        this.f1907OooO0O0 = o00000Var;
        oooo0.OooO00o(this);
    }

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo) {
        if (oooOo == androidx.lifecycle.OooOo.ON_START) {
            o0Oo0oo o0oo0oo = this.f1909OooO0Oo;
            o0oo0oo.getClass();
            o00000 o00000Var = this.f1907OooO0O0;
            o0000O00.OooO00o.OooOoo0(o00000Var, "onBackPressedCallback");
            o0oo0oo.f1961OooO0O0.OooO0o(o00000Var);
            o0ooOOo o0ooooo = new o0ooOOo(o0oo0oo, o00000Var);
            o00000Var.f2816OooO0O0.add(o0ooooo);
            o0oo0oo.OooO0Oo();
            o00000Var.f2817OooO0OO = new o0OOO0o(1, o0oo0oo);
            this.f1908OooO0OO = o0ooooo;
        } else if (oooOo == androidx.lifecycle.OooOo.ON_STOP) {
            o0ooOOo o0ooooo2 = this.f1908OooO0OO;
            if (o0ooooo2 != null) {
                o0ooooo2.cancel();
            }
        } else if (oooOo == androidx.lifecycle.OooOo.ON_DESTROY) {
            cancel();
        }
    }

    @Override // androidx.activity.OooO0OO
    public final void cancel() {
        this.f1906OooO00o.OooO0O0(this);
        o00000 o00000Var = this.f1907OooO0O0;
        o00000Var.getClass();
        o00000Var.f2816OooO0O0.remove(this);
        o0ooOOo o0ooooo = this.f1908OooO0OO;
        if (o0ooooo != null) {
            o0ooooo.cancel();
        }
        this.f1908OooO0OO = null;
    }
}