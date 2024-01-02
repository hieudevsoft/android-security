package OooO0Oo;

import OooO0oO.o00O00O;
import OooOooo.o0;
import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import android.view.MenuItem;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0ooOOo implements OooO0o.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o.OooO0O0 f246OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00000OO f247OooO0O0;

    public o0ooOOo(o00000OO o00000oo2, OooO0o.OooOOO0 oooOOO0) {
        this.f247OooO0O0 = o00000oo2;
        this.f246OooO00o = oooOOO0;
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO00o(OooO0o.OooO0OO oooO0OO, o00O00O o00o00o) {
        ViewGroup viewGroup = this.f247OooO0O0.f138OooOoOO;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0OO.OooO0OO(viewGroup);
        return this.f246OooO00o.OooO00o(oooO0OO, o00o00o);
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO0O0(OooO0o.OooO0OO oooO0OO, o00O00O o00o00o) {
        return this.f246OooO00o.OooO0O0(oooO0OO, o00o00o);
    }

    @Override // OooO0o.OooO0O0
    public final void OooO0Oo(OooO0o.OooO0OO oooO0OO) {
        this.f246OooO00o.OooO0Oo(oooO0OO);
        o00000OO o00000oo2 = this.f247OooO0O0;
        if (o00000oo2.f135OooOo0o != null) {
            o00000oo2.f124OooOO0o.getDecorView().removeCallbacks(o00000oo2.f131OooOo);
        }
        if (o00000oo2.f134OooOo0O != null) {
            o0 o0Var = o00000oo2.f137OooOoO0;
            if (o0Var != null) {
                o0Var.OooO0O0();
            }
            o0 OooO00o2 = o0o0Oo.OooO00o(o00000oo2.f134OooOo0O);
            OooO00o2.OooO00o(0.0f);
            o00000oo2.f137OooOoO0 = OooO00o2;
            OooO00o2.OooO0Oo(new o00oO0o(2, this));
        }
        Oooo0 oooo0 = o00000oo2.f125OooOOO;
        if (oooo0 != null) {
            oooo0.OooO0o0();
        }
        o00000oo2.f132OooOo0 = null;
        ViewGroup viewGroup = o00000oo2.f138OooOoOO;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0OO.OooO0OO(viewGroup);
        o00000oo2.Oooo0();
    }

    @Override // OooO0o.OooO0O0
    public final boolean OooO0o0(OooO0o.OooO0OO oooO0OO, MenuItem menuItem) {
        return this.f246OooO00o.OooO0o0(oooO0OO, menuItem);
    }
}