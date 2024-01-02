package o0000o0o;

import OooOoo.o0ooOOo;
import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import o0000.o0OoOo0;
import o0000O00.OooO00o;
import o0000Oo.OooO0o;
import o0000Oo.OooOO0O;
import o0OO00O.OooO0OO;

/* loaded from: classes.dex */
public final class o000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f4478OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0OO f4479OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOO0O f4480OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0ooOOo f4481OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4482OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public List f4483OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public List f4484OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ArrayList f4485OooO0oo;

    public o000(OooO0o oooO0o, OooO0OO oooO0OO, o0000O0 o0000o02, o0ooOOo o0ooooo) {
        boolean z;
        List OooOo0o2;
        OooO00o.OooOoo0(oooO0o, "address");
        OooO00o.OooOoo0(oooO0OO, "routeDatabase");
        OooO00o.OooOoo0(o0000o02, "call");
        OooO00o.OooOoo0(o0ooooo, "eventListener");
        this.f4478OooO00o = oooO0o;
        this.f4479OooO0O0 = oooO0OO;
        this.f4480OooO0OO = o0000o02;
        this.f4481OooO0Oo = o0ooooo;
        o0OoOo0 o0oooo0 = o0OoOo0.f3970OooO00o;
        this.f4483OooO0o0 = o0oooo0;
        this.f4484OooO0oO = o0oooo0;
        this.f4485OooO0oo = new ArrayList();
        o0000Oo.o0ooOOo o0ooooo2 = oooO0o.f4168OooO;
        OooO00o.OooOoo0(o0ooooo2, "url");
        Proxy proxy = oooO0o.f4175OooO0oO;
        if (proxy != null) {
            OooOo0o2 = OooO00o.o0000Oo(proxy);
        } else {
            URI OooO0oO2 = o0ooooo2.OooO0oO();
            if (OooO0oO2.getHost() == null) {
                OooOo0o2 = o0000OoO.OooOO0O.OooOO0O(Proxy.NO_PROXY);
            } else {
                List<Proxy> select = oooO0o.f4176OooO0oo.select(OooO0oO2);
                if (select != null && !select.isEmpty()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    OooOo0o2 = o0000OoO.OooOO0O.OooOO0O(Proxy.NO_PROXY);
                } else {
                    OooO00o.OooOoOO(select, "proxiesOrNull");
                    OooOo0o2 = o0000OoO.OooOO0O.OooOo0o(select);
                }
            }
        }
        this.f4483OooO0o0 = OooOo0o2;
        this.f4482OooO0o = 0;
    }

    public final boolean OooO00o() {
        boolean z;
        if (this.f4482OooO0o < this.f4483OooO0o0.size()) {
            z = true;
        } else {
            z = false;
        }
        if (z || (!this.f4485OooO0oo.isEmpty())) {
            return true;
        }
        return false;
    }
}