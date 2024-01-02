package OoooO00;

import androidx.lifecycle.o0000O0;
import androidx.lifecycle.o0000O0O;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO0o implements o0000O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0[] f1554OooO00o;

    public OooO0o(OooOO0... oooOO0Arr) {
        OooO00o.OooOoo0(oooOO0Arr, "initializers");
        this.f1554OooO00o = oooOO0Arr;
    }

    @Override // androidx.lifecycle.o0000O0O
    public final o0000O0 OooO0O0(Class cls, OooO oooO) {
        OooOO0[] oooOO0Arr;
        o0000O0 o0000o02 = null;
        for (OooOO0 oooOO0 : this.f1554OooO00o) {
            if (OooO00o.OooOOO0(oooOO0.f1555OooO00o, cls)) {
                Object OooO0O02 = oooOO0.f1556OooO0O0.OooO0O0(oooO);
                if (OooO0O02 instanceof o0000O0) {
                    o0000o02 = (o0000O0) OooO0O02;
                } else {
                    o0000o02 = null;
                }
            }
        }
        if (o0000o02 != null) {
            return o0000o02;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}