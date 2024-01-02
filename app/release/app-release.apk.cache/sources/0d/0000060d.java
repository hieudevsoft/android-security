package o0000oOo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import o000.OooO0o;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000O000 implements OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final X509TrustManager f4761OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Method f4762OooO0O0;

    public o000O000(X509TrustManager x509TrustManager, Method method) {
        this.f4761OooO00o = x509TrustManager;
        this.f4762OooO0O0 = method;
    }

    @Override // o000.OooO0o
    public final X509Certificate OooO00o(X509Certificate x509Certificate) {
        try {
            Object invoke = this.f4762OooO0O0.invoke(this.f4761OooO00o, x509Certificate);
            OooO00o.OooOoO0(invoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
            return ((TrustAnchor) invoke).getTrustedCert();
        } catch (IllegalAccessException e) {
            throw new AssertionError("unable to get issues and signature", e);
        } catch (InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000O000) {
            o000O000 o000o000 = (o000O000) obj;
            return OooO00o.OooOOO0(this.f4761OooO00o, o000o000.f4761OooO00o) && OooO00o.OooOOO0(this.f4762OooO0O0, o000o000.f4762OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4762OooO0O0.hashCode() + (this.f4761OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return "CustomTrustRootIndex(trustManager=" + this.f4761OooO00o + ", findByIssuerAndSignatureMethod=" + this.f4762OooO0O0 + ')';
    }
}