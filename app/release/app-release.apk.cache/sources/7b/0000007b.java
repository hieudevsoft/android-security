package OooOO0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class OooO0O0 extends OooOOOO implements Map {

    /* renamed from: OooO0oo  reason: collision with root package name */
    public OooO00o f508OooO0oo;

    public OooO0O0(OooO0O0 oooO0O0) {
        if (oooO0O0 != null) {
            int i = oooO0O0.f542OooO0OO;
            OooO0O0(this.f542OooO0OO + i);
            if (this.f542OooO0OO == 0) {
                if (i > 0) {
                    System.arraycopy(oooO0O0.f540OooO00o, 0, this.f540OooO00o, 0, i);
                    System.arraycopy(oooO0O0.f541OooO0O0, 0, this.f541OooO0O0, 0, i << 1);
                    this.f542OooO0OO = i;
                    return;
                }
                return;
            }
            for (int i2 = 0; i2 < i; i2++) {
                put(oooO0O0.OooO0oo(i2), oooO0O0.OooOO0(i2));
            }
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        if (this.f508OooO0oo == null) {
            this.f508OooO0oo = new OooO00o(0, this);
        }
        OooO00o oooO00o = this.f508OooO0oo;
        if (((OooOO0O) oooO00o.f345OooO00o) == null) {
            oooO00o.f345OooO00o = new OooOO0O(oooO00o, 0);
        }
        return (OooOO0O) oooO00o.f345OooO00o;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.f508OooO0oo == null) {
            this.f508OooO0oo = new OooO00o(0, this);
        }
        OooO00o oooO00o = this.f508OooO0oo;
        if (((OooOO0O) oooO00o.f346OooO0O0) == null) {
            oooO00o.f346OooO0O0 = new OooOO0O(oooO00o, 1);
        }
        return (OooOO0O) oooO00o.f346OooO0O0;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        OooO0O0(map.size() + this.f542OooO0OO);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.f508OooO0oo == null) {
            this.f508OooO0oo = new OooO00o(0, this);
        }
        OooO00o oooO00o = this.f508OooO0oo;
        if (((OooOOO) oooO00o.f347OooO0OO) == null) {
            oooO00o.f347OooO0OO = new OooOOO(oooO00o);
        }
        return (OooOOO) oooO00o.f347OooO0OO;
    }
}