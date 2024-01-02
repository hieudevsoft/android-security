package OooOooo;

import OooOOoo.o00O0O;
import OooOo.OooO0OO;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0oO0Ooo extends o0O00oO0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final WindowInsets.Builder f1369OooO0OO;

    public o0oO0Ooo() {
        this.f1369OooO0OO = o00O0O.OooO0Oo();
    }

    @Override // OooOooo.o0O00oO0
    public o0O0OOOo OooO0O0() {
        WindowInsets build;
        OooO00o();
        build = this.f1369OooO0OO.build();
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, build);
        OooO0oo2.f1355OooO00o.OooOOOO(this.f1337OooO0O0);
        return OooO0oo2;
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0Oo(OooO0OO oooO0OO) {
        this.f1369OooO0OO.setMandatorySystemGestureInsets(oooO0OO.OooO0Oo());
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0o(OooO0OO oooO0OO) {
        this.f1369OooO0OO.setSystemGestureInsets(oooO0OO.OooO0Oo());
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0o0(OooO0OO oooO0OO) {
        this.f1369OooO0OO.setStableInsets(oooO0OO.OooO0Oo());
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0oO(OooO0OO oooO0OO) {
        this.f1369OooO0OO.setSystemWindowInsets(oooO0OO.OooO0Oo());
    }

    @Override // OooOooo.o0O00oO0
    public void OooO0oo(OooO0OO oooO0OO) {
        this.f1369OooO0OO.setTappableElementInsets(oooO0OO.OooO0Oo());
    }

    public o0oO0Ooo(o0O0OOOo o0o0oooo) {
        super(o0o0oooo);
        WindowInsets OooO0oO2 = o0o0oooo.OooO0oO();
        this.f1369OooO0OO = OooO0oO2 != null ? o00O0O.OooO0o0(OooO0oO2) : o00O0O.OooO0Oo();
    }
}