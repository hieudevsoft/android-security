package o0000oOo;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o0000O00.OooO00o;
import o0000oOO.o00000OO;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* loaded from: classes.dex */
public final class o000Oo0 extends o000OO00 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o00000OO f4780OooO0Oo = new o00000OO(5, 0);

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final boolean f4781OooO0o0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Provider f4782OooO0OO = new BouncyCastleJsseProvider();

    static {
        boolean z = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, o00000OO.class.getClassLoader());
            z = true;
        } catch (ClassNotFoundException unused) {
        }
        f4781OooO0o0 = z;
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        if (!(sSLSocket instanceof BCSSLSocket)) {
            super.OooO0Oo(sSLSocket, str, list);
            return;
        }
        BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
        BCSSLParameters parameters = bCSSLSocket.getParameters();
        parameters.setApplicationProtocols((String[]) o00000OO.OooO0Oo(list).toArray(new String[0]));
        bCSSLSocket.setParameters(parameters);
    }

    @Override // o0000oOo.o000OO00
    public final String OooO0o(SSLSocket sSLSocket) {
        if (sSLSocket instanceof BCSSLSocket) {
            String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
            if (!(applicationProtocol == null ? true : OooO00o.OooOOO0(applicationProtocol, ""))) {
                return applicationProtocol;
            }
        }
        return null;
    }

    @Override // o0000oOo.o000OO00
    public final SSLContext OooOO0O() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f4782OooO0OO);
        OooO00o.OooOoOO(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // o0000oOo.o000OO00
    public final X509TrustManager OooOOO0() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        OooO00o.OooOo(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (z) {
            TrustManager trustManager = trustManagers[0];
            OooO00o.OooOoO0(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            return (X509TrustManager) trustManager;
        }
        String arrays = Arrays.toString(trustManagers);
        OooO00o.OooOoOO(arrays, "toString(this)");
        throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
    }
}