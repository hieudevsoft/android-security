package o0000oo0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00000O0 implements o00000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000 f4786OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o00000O f4787OooO0O0;

    public o00000O0(o00000 o00000Var) {
        this.f4786OooO00o = o00000Var;
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return this.f4786OooO00o.OooO00o(sSLSocket);
    }

    @Override // o0000oo0.o00000O
    public final String OooO0O0(SSLSocket sSLSocket) {
        o00000O o00000o;
        synchronized (this) {
            if (this.f4787OooO0O0 == null && this.f4786OooO00o.OooO00o(sSLSocket)) {
                this.f4787OooO0O0 = this.f4786OooO00o.OooO0O0(sSLSocket);
            }
            o00000o = this.f4787OooO0O0;
        }
        if (o00000o != null) {
            return o00000o.OooO0O0(sSLSocket);
        }
        return null;
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO0OO() {
        return true;
    }

    @Override // o0000oo0.o00000O
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        o00000O o00000o;
        OooO00o.OooOoo0(list, "protocols");
        synchronized (this) {
            if (this.f4787OooO0O0 == null && this.f4786OooO00o.OooO00o(sSLSocket)) {
                this.f4787OooO0O0 = this.f4786OooO00o.OooO0O0(sSLSocket);
            }
            o00000o = this.f4787OooO0O0;
        }
        if (o00000o != null) {
            o00000o.OooO0Oo(sSLSocket, str, list);
        }
    }
}