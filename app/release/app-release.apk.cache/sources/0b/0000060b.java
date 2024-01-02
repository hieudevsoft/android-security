package o0000oOo;

import java.security.KeyStore;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o0000O00.OooO00o;
import o0000oOO.o00000OO;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class o000O0 extends o000OO00 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final boolean f4759OooO0Oo;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Provider f4760OooO0OO;

    static {
        boolean z = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, o000O00.class.getClassLoader());
            if (Conscrypt.isAvailable()) {
                if (o000O00.OooO00o()) {
                    z = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f4759OooO0Oo = z;
    }

    public o000O0() {
        Provider newProvider = Conscrypt.newProvider();
        OooO00o.OooOoOO(newProvider, "newProvider()");
        this.f4760OooO0OO = newProvider;
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        if (!Conscrypt.isConscrypt(sSLSocket)) {
            super.OooO0Oo(sSLSocket, str, list);
            return;
        }
        Conscrypt.setUseSessionTickets(sSLSocket, true);
        Conscrypt.setApplicationProtocols(sSLSocket, (String[]) o00000OO.OooO0Oo(list).toArray(new String[0]));
    }

    @Override // o0000oOo.o000OO00
    public final String OooO0o(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // o0000oOo.o000OO00
    public final SSLContext OooOO0O() {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f4760OooO0OO);
        OooO00o.OooOoOO(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // o0000oOo.o000OO00
    public final SSLSocketFactory OooOO0o(X509TrustManager x509TrustManager) {
        SSLContext OooOO0O2 = OooOO0O();
        OooOO0O2.init(null, new TrustManager[]{x509TrustManager}, null);
        SSLSocketFactory socketFactory = OooOO0O2.getSocketFactory();
        OooO00o.OooOoOO(socketFactory, "newSSLContext().apply {\n…null)\n    }.socketFactory");
        return socketFactory;
    }

    @Override // o0000oOo.o000OO00
    public final X509TrustManager OooOOO0() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        OooO00o.OooOo(trustManagers);
        boolean z = true;
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            z = false;
        }
        if (!z) {
            String arrays = Arrays.toString(trustManagers);
            OooO00o.OooOoOO(arrays, "toString(this)");
            throw new IllegalStateException("Unexpected default trust managers: ".concat(arrays).toString());
        }
        TrustManager trustManager = trustManagers[0];
        OooO00o.OooOoO0(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
        X509TrustManager x509TrustManager = (X509TrustManager) trustManager;
        Conscrypt.setHostnameVerifier(x509TrustManager, o000O00O.f4763OooO00o);
        return x509TrustManager;
    }
}