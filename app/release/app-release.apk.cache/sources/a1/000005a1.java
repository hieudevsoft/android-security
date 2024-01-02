package o0000Oo;

import java.net.InetSocketAddress;
import java.net.Proxy;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00000OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f4269OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Proxy f4270OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final InetSocketAddress f4271OooO0OO;

    public o00000OO(OooO0o oooO0o, Proxy proxy, InetSocketAddress inetSocketAddress) {
        OooO00o.OooOoo0(oooO0o, "address");
        OooO00o.OooOoo0(inetSocketAddress, "socketAddress");
        this.f4269OooO00o = oooO0o;
        this.f4270OooO0O0 = proxy;
        this.f4271OooO0OO = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00000OO) {
            o00000OO o00000oo2 = (o00000OO) obj;
            if (OooO00o.OooOOO0(o00000oo2.f4269OooO00o, this.f4269OooO00o) && OooO00o.OooOOO0(o00000oo2.f4270OooO0O0, this.f4270OooO0O0) && OooO00o.OooOOO0(o00000oo2.f4271OooO0OO, this.f4271OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4270OooO0O0.hashCode();
        return this.f4271OooO0OO.hashCode() + ((hashCode + ((this.f4269OooO00o.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Route{" + this.f4271OooO0OO + '}';
    }
}