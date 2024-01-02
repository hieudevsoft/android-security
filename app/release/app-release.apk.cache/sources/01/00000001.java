package OooO;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class OooO00o extends OooOO0O {

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final HashMap f2OooO0o0 = new HashMap();

    @Override // OooO.OooOO0O
    public final OooO0OO OooO0o(Object obj) {
        return (OooO0OO) this.f2OooO0o0.get(obj);
    }

    @Override // OooO.OooOO0O
    public final Object OooO0oO(Object obj) {
        Object OooO0oO2 = super.OooO0oO(obj);
        this.f2OooO0o0.remove(obj);
        return OooO0oO2;
    }

    public final Object OooO0oo(Object obj, Object obj2) {
        OooO0OO OooO0o2 = OooO0o(obj);
        if (OooO0o2 != null) {
            return OooO0o2.f5OooO0O0;
        }
        HashMap hashMap = this.f2OooO0o0;
        OooO0OO oooO0OO = new OooO0OO(obj, obj2);
        this.f14OooO0Oo++;
        OooO0OO oooO0OO2 = this.f12OooO0O0;
        if (oooO0OO2 == null) {
            this.f11OooO00o = oooO0OO;
        } else {
            oooO0OO2.f6OooO0OO = oooO0OO;
            oooO0OO.f7OooO0Oo = oooO0OO2;
        }
        this.f12OooO0O0 = oooO0OO;
        hashMap.put(obj, oooO0OO);
        return null;
    }
}