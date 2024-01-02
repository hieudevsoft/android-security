package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleController implements o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f3065OooO00o;

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
        if (oooOo == OooOo.ON_DESTROY) {
            this.f3065OooO00o = false;
            o00ooo2.OooO0oO().OooO0O0(this);
        }
    }
}