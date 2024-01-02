package o0000oo0;

import android.net.ssl.SSLSockets;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000oOo.o000OO00;

/* loaded from: classes.dex */
public final class oo000o implements o00000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0000oOO.o00000OO f4805OooO00o = new o0000oOO.o00000OO(10, 0);

    @Override // o0000oo0.o00000O
    public final boolean OooO00o(SSLSocket sSLSocket) {
        boolean isSupportedSocket;
        isSupportedSocket = SSLSockets.isSupportedSocket(sSLSocket);
        return isSupportedSocket;
    }

    @Override // o0000oo0.o00000O
    public final String OooO0O0(SSLSocket sSLSocket) {
        String applicationProtocol;
        applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : OooO00o.OooOOO0(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // o0000oo0.o00000O
    public final boolean OooO0OO() {
        return f4805OooO00o.OooOOO0();
    }

    @Override // o0000oo0.o00000O
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            o000OO00 o000oo00 = o000OO00.f4772OooO00o;
            sSLParameters.setApplicationProtocols((String[]) o0000oOO.o00000OO.OooO0Oo(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e) {
            throw new IOException("Android internal error", e);
        }
    }
}