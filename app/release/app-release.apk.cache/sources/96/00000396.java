package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000O00 f3064OooO00o;

    public SavedStateHandleAttacher(o0000O00 o0000o00) {
        this.f3064OooO00o = o0000o00;
    }

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
        boolean z;
        if (oooOo == OooOo.ON_CREATE) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            o00ooo2.OooO0oO().OooO0O0(this);
            o0000O00 o0000o00 = this.f3064OooO00o;
            if (!o0000o00.f3083OooO0O0) {
                o0000o00.f3084OooO0OO = o0000o00.f3082OooO00o.OooO00o("androidx.lifecycle.internal.SavedStateHandlesProvider");
                o0000o00.f3083OooO0O0 = true;
                o0000oo o0000ooVar = (o0000oo) o0000o00.f3085OooO0Oo.OooO00o();
                return;
            }
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oooOo).toString());
    }
}