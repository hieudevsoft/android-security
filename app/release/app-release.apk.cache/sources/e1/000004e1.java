package o000;

import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes.dex */
public final class OooO0O0 implements OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final LinkedHashMap f3949OooO00o;

    public OooO0O0(X509Certificate... x509CertificateArr) {
        o0000O00.OooO00o.OooOoo0(x509CertificateArr, "caCerts");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            o0000O00.OooO00o.OooOoOO(subjectX500Principal, "caCert.subjectX500Principal");
            Object obj = linkedHashMap.get(subjectX500Principal);
            if (obj == null) {
                obj = new LinkedHashSet();
                linkedHashMap.put(subjectX500Principal, obj);
            }
            ((Set) obj).add(x509Certificate);
        }
        this.f3949OooO00o = linkedHashMap;
    }

    @Override // o000.OooO0o
    public final X509Certificate OooO00o(X509Certificate x509Certificate) {
        boolean z;
        Set set = (Set) this.f3949OooO00o.get(x509Certificate.getIssuerX500Principal());
        Object obj = null;
        if (set == null) {
            return null;
        }
        Iterator it = set.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            try {
                x509Certificate.verify(((X509Certificate) next).getPublicKey());
                z = true;
                continue;
            } catch (Exception unused) {
                z = false;
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        return (X509Certificate) obj;
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof OooO0O0) && o0000O00.OooO00o.OooOOO0(((OooO0O0) obj).f3949OooO00o, this.f3949OooO00o));
    }

    public final int hashCode() {
        return this.f3949OooO00o.hashCode();
    }
}