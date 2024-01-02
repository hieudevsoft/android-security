package OooO0Oo;

import android.view.LayoutInflater;
import hieubui.eup.android_app_security.MainActivity;

/* loaded from: classes.dex */
public final class OooOo implements OooO00o.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f88OooO00o;

    public OooOo(MainActivity mainActivity) {
        this.f88OooO00o = mainActivity;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o() {
        Oooo000 oooo000 = this.f88OooO00o;
        o00Oo0 OooOOO0 = oooo000.OooOOO0();
        o00000OO o00000oo2 = (o00000OO) OooOOO0;
        LayoutInflater from = LayoutInflater.from(o00000oo2.f123OooOO0O);
        if (from.getFactory() == null) {
            from.setFactory2(o00000oo2);
        } else {
            boolean z = from.getFactory2() instanceof o00000OO;
        }
        oooo000.f1942OooO0o0.f1576OooO0O0.OooO00o("androidx:appcompat");
        OooOOO0.OooO0Oo();
    }
}