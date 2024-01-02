package OoooOoo;

/* loaded from: classes.dex */
public final class oO0000o0 extends oO00000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO000 f1664OooO00o;

    public oO0000o0(oO000 oo000) {
        this.f1664OooO00o = oo000;
    }

    @Override // OoooOoo.oO00000o, OoooOoo.o
    public final void OooO0OO() {
        oO000 oo000 = this.f1664OooO00o;
        if (oo000.f1635OooOoOO) {
            return;
        }
        oo000.Oooo000();
        oo000.f1635OooOoOO = true;
    }

    @Override // OoooOoo.o
    public final void OooO0o0(oO00000 oo00000) {
        oO000 oo000 = this.f1664OooO00o;
        int i = oo000.f1633OooOoO - 1;
        oo000.f1633OooOoO = i;
        if (i == 0) {
            oo000.f1635OooOoOO = false;
            oo000.OooOOO0();
        }
        oo00000.OooOo0O(this);
    }
}