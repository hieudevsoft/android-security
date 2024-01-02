package OooO;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooO0o extends OooOO0 implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0OO f8OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f9OooO0O0 = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ OooOO0O f10OooO0OO;

    public OooO0o(OooOO0O oooOO0O) {
        this.f10OooO0OO = oooOO0O;
    }

    @Override // OooO.OooOO0
    public final void OooO00o(OooO0OO oooO0OO) {
        OooO0OO oooO0OO2 = this.f8OooO00o;
        if (oooO0OO == oooO0OO2) {
            OooO0OO oooO0OO3 = oooO0OO2.f7OooO0Oo;
            this.f8OooO00o = oooO0OO3;
            this.f9OooO0O0 = oooO0OO3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f9OooO0O0) {
            return this.f10OooO0OO.f11OooO00o != null;
        }
        OooO0OO oooO0OO = this.f8OooO00o;
        return (oooO0OO == null || oooO0OO.f6OooO0OO == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        OooO0OO oooO0OO;
        if (this.f9OooO0O0) {
            this.f9OooO0O0 = false;
            oooO0OO = this.f10OooO0OO.f11OooO00o;
        } else {
            OooO0OO oooO0OO2 = this.f8OooO00o;
            if (oooO0OO2 != null) {
                oooO0OO = oooO0OO2.f6OooO0OO;
            } else {
                oooO0OO = null;
            }
        }
        this.f8OooO00o = oooO0OO;
        return oooO0OO;
    }
}