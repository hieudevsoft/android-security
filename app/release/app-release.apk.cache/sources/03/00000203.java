package OoooOoo;

import android.view.ViewGroup;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0OOO00 extends oO00000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f1608OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1609OooO0O0;

    public o0OOO00(ViewGroup viewGroup) {
        this.f1609OooO0O0 = viewGroup;
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO00o() {
        OooO00o.o000ooOO(this.f1609OooO0O0, false);
        this.f1608OooO00o = true;
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO0O0() {
        OooO00o.o000ooOO(this.f1609OooO0O0, false);
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO0Oo() {
        OooO00o.o000ooOO(this.f1609OooO0O0, true);
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        if (!this.f1608OooO00o) {
            OooO00o.o000ooOO(this.f1609OooO0O0, false);
        }
        oo00000.OooOo0O(this);
    }
}