package o0000oo0;

import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000oOo.o000OO00;
import o0000oOo.o000Oo0;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* loaded from: classes.dex */
public final class o0O0O00 implements o00000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0000oOO.o00000OO f4793OooO00o = new o0000oOO.o00000OO(13, 0);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final oo0o0Oo f4794OooO0O0 = new oo0o0Oo();

    @Override // o0000oo0.o00000O
    public final boolean OooO00o(SSLSocket sSLSocket) {
        return sSLSocket instanceof BCSSLSocket;
    }

    @Override // o0000oo0.o00000O
    public final String OooO0O0(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : OooO00o.OooOOO0(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO0OO() {
        return o000Oo0.f4780OooO0Oo.OooOOO0();
    }

    @Override // o0000oo0.o00000O
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        if (OooO00o(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            o000OO00 o000oo00 = o000OO00.f4772OooO00o;
            parameters.setApplicationProtocols((String[]) o0000oOO.o00000OO.OooO0Oo(list).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}