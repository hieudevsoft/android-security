package o0000oo0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000oOo.o000O0;
import o0000oOo.o000OO00;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class o000000O implements o00000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0000oOO.o00000OO f4784OooO00o = new o0000oOO.o00000OO(15, 0);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o000000 f4785OooO0O0 = new o000000();

    @Override // o0000oo0.o00000O
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o0000oo0.o00000O
    public final String OooO0O0(SSLSocket sSLSocket) {
        if (OooO00o(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO0OO() {
        boolean z = o000O0.f4759OooO0Oo;
        return o000O0.f4759OooO0Oo;
    }

    @Override // o0000oo0.o00000O
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        if (OooO00o(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            o000OO00 o000oo00 = o000OO00.f4772OooO00o;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) o0000oOO.o00000OO.OooO0Oo(list).toArray(new String[0]));
        }
    }
}