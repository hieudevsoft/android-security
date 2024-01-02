package o0000oOo;

import com.google.gson.internal.OooO0o;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import o000.OooO0O0;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class o000OO00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static volatile o000OO00 f4772OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Logger f4773OooO0O0;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (r0 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d8, code lost:
        if (r0 != null) goto L24;
     */
    static {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOo.o000OO00.<clinit>():void");
    }

    public static void OooO(String str, int i, Throwable th) {
        OooO00o.OooOoo0(str, "message");
        f4773OooO0O0.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void OooO00o(SSLSocket sSLSocket) {
    }

    public OooO0o OooO0O0(X509TrustManager x509TrustManager) {
        return new o000.OooO00o(OooO0OO(x509TrustManager));
    }

    public o000.OooO0o OooO0OO(X509TrustManager x509TrustManager) {
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        OooO00o.OooOoOO(acceptedIssuers, "trustManager.acceptedIssuers");
        return new OooO0O0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
    }

    public String OooO0o(SSLSocket sSLSocket) {
        return null;
    }

    public void OooO0o0(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        OooO00o.OooOoo0(inetSocketAddress, "address");
        socket.connect(inetSocketAddress, i);
    }

    public Object OooO0oO() {
        if (f4773OooO0O0.isLoggable(Level.FINE)) {
            return new Throwable("response.body().close()");
        }
        return null;
    }

    public boolean OooO0oo(String str) {
        OooO00o.OooOoo0(str, "hostname");
        return true;
    }

    public void OooOO0(Object obj, String str) {
        OooO00o.OooOoo0(str, "message");
        if (obj == null) {
            str = str.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        OooO(str, 5, (Throwable) obj);
    }

    public SSLContext OooOO0O() {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        OooO00o.OooOoOO(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory OooOO0o(X509TrustManager x509TrustManager) {
        try {
            SSLContext OooOO0O2 = OooOO0O();
            OooOO0O2.init(null, new TrustManager[]{x509TrustManager}, null);
            SSLSocketFactory socketFactory = OooOO0O2.getSocketFactory();
            OooO00o.OooOoOO(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS: " + e, e);
        }
    }

    public X509TrustManager OooOOO0() {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public final String toString() {
        return getClass().getSimpleName();
    }
}