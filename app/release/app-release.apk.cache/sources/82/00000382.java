package androidx.lifecycle;

import o00000.o000;

/* loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f3045OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O0O f3046OooO0O0;

    public DefaultLifecycleObserverAdapter(OooO0o oooO0o, o00O0O o00o0o) {
        o0000O00.OooO00o.OooOoo0(oooO0o, "defaultLifecycleObserver");
        this.f3045OooO00o = oooO0o;
        this.f3046OooO0O0 = o00o0o;
    }

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
        int i = OooO.f3047OooO00o[oooOo.ordinal()];
        OooO0o oooO0o = this.f3045OooO00o;
        switch (i) {
            case 1:
            case 2:
            case 4:
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
                oooO0o.getClass();
                break;
            case 3:
                oooO0o.OooO00o();
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        o00O0O o00o0o = this.f3046OooO0O0;
        if (o00o0o != null) {
            o00o0o.OooO0O0(o00ooo2, oooOo);
        }
    }
}