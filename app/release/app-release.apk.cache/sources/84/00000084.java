package OooOO0O;

/* loaded from: classes.dex */
public final class OooO extends OooO0O0.OooO0O0 {
    public OooO() {
        super((Object) null);
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0OO(OooOO0O oooOO0O, OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = OooO0OO.f550OooO0O0;
        synchronized (oooOO0O) {
            if (oooOO0O.f565OooO0O0 == oooO0OO) {
                oooOO0O.f565OooO0O0 = oooO0OO2;
                return true;
            }
            return false;
        }
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0Oo(OooOO0O oooOO0O, Object obj, Object obj2) {
        synchronized (oooOO0O) {
            if (oooOO0O.f564OooO00o == obj) {
                oooOO0O.f564OooO00o = obj2;
                return true;
            }
            return false;
        }
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooO0o0(OooOO0O oooOO0O, OooOO0 oooOO0, OooOO0 oooOO02) {
        synchronized (oooOO0O) {
            if (oooOO0O.f566OooO0OO == oooOO0) {
                oooOO0O.f566OooO0OO = oooOO02;
                return true;
            }
            return false;
        }
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOOO(OooOO0 oooOO0, OooOO0 oooOO02) {
        oooOO0.f559OooO0O0 = oooOO02;
    }

    @Override // OooO0O0.OooO0O0
    public final void OooOOOo(OooOO0 oooOO0, Thread thread) {
        oooOO0.f558OooO00o = thread;
    }
}