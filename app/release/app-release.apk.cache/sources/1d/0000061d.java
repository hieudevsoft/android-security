package o0000oo0;

import android.net.http.X509TrustManagerExtensions;
import com.google.gson.internal.OooO0o;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00oO0o extends OooO0o {

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final X509TrustManager f4791OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final X509TrustManagerExtensions f4792OooOO0o;

    public o00oO0o(X509TrustManager x509TrustManager, X509TrustManagerExtensions x509TrustManagerExtensions) {
        this.f4791OooOO0O = x509TrustManager;
        this.f4792OooOO0o = x509TrustManagerExtensions;
    }

    @Override // com.google.gson.internal.OooO0o
    public final List OooO(String str, List list) {
        OooO00o.OooOoo0(list, "chain");
        OooO00o.OooOoo0(str, "hostname");
        try {
            List<X509Certificate> checkServerTrusted = this.f4792OooOO0o.checkServerTrusted((X509Certificate[]) list.toArray(new X509Certificate[0]), "RSA", str);
            OooO00o.OooOoOO(checkServerTrusted, "x509TrustManagerExtensio…ficates, \"RSA\", hostname)");
            return checkServerTrusted;
        } catch (CertificateException e) {
            SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
            sSLPeerUnverifiedException.initCause(e);
            throw sSLPeerUnverifiedException;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof o00oO0o) && ((o00oO0o) obj).f4791OooOO0O == this.f4791OooOO0O;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f4791OooOO0O);
    }
}