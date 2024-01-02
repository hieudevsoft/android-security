package OooO;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class OooO extends OooOO0 implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0OO f0OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0OO f1OooO0O0;

    public OooO(OooO0OO oooO0OO, OooO0OO oooO0OO2) {
        this.f0OooO00o = oooO0OO2;
        this.f1OooO0O0 = oooO0OO;
    }

    @Override // OooO.OooOO0
    public final void OooO00o(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2;
        if (this.f0OooO00o == oooO0OO && oooO0OO == this.f1OooO0O0) {
            this.f1OooO0O0 = null;
            this.f0OooO00o = null;
        }
        OooO0OO oooO0OO3 = this.f0OooO00o;
        if (oooO0OO3 == oooO0OO) {
            switch (((OooO0O0) this).f3OooO0OO) {
                case 0:
                    oooO0OO2 = oooO0OO3.f7OooO0Oo;
                    break;
                default:
                    oooO0OO2 = oooO0OO3.f6OooO0OO;
                    break;
            }
            this.f0OooO00o = oooO0OO2;
        }
        if (this.f1OooO0O0 == oooO0OO) {
            this.f1OooO0O0 = OooO0O0();
        }
    }

    public final OooO0OO OooO0O0() {
        OooO0OO oooO0OO = this.f1OooO0O0;
        OooO0OO oooO0OO2 = this.f0OooO00o;
        if (oooO0OO != oooO0OO2 && oooO0OO2 != null) {
            switch (((OooO0O0) this).f3OooO0OO) {
                case 0:
                    return oooO0OO.f6OooO0OO;
                default:
                    return oooO0OO.f7OooO0Oo;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1OooO0O0 != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        OooO0OO oooO0OO = this.f1OooO0O0;
        this.f1OooO0O0 = OooO0O0();
        return oooO0OO;
    }
}