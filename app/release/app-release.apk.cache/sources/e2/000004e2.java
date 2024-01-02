package o000;

import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import o0000.o0OoOo0;

/* loaded from: classes.dex */
public final class OooO0OO implements HostnameVerifier {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooO0OO f3950OooO00o = new OooO0OO();

    public static List OooO00o(X509Certificate x509Certificate, int i) {
        Object obj;
        o0OoOo0 o0oooo0 = o0OoOo0.f3970OooO00o;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return o0oooo0;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && o0000O00.OooO00o.OooOOO0(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return o0oooo0;
        }
    }

    public static boolean OooO0O0(String str) {
        boolean z;
        boolean z2;
        int i;
        char c;
        int length = str.length();
        int length2 = str.length();
        if (length2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (length2 <= str.length()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                long j = 0;
                int i2 = 0;
                while (i2 < length2) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt >= 55296 && charAt <= 57343) {
                            int i3 = i2 + 1;
                            if (i3 < length2) {
                                c = str.charAt(i3);
                            } else {
                                c = 0;
                            }
                            if (charAt <= 56319 && c >= 56320 && c <= 57343) {
                                j += 4;
                                i2 += 2;
                            } else {
                                j++;
                                i2 = i3;
                            }
                        } else {
                            i = 3;
                        }
                        j += i;
                    }
                    i2++;
                }
                if (length != ((int) j)) {
                    return false;
                }
                return true;
            }
            StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("endIndex > string.length: ", length2, " > ");
            OooO0o02.append(str.length());
            throw new IllegalArgumentException(OooO0o02.toString().toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + length2 + " < 0").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0138 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean OooO0OO(java.lang.String r11, java.security.cert.X509Certificate r12) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000.OooO0OO.OooO0OO(java.lang.String, java.security.cert.X509Certificate):boolean");
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        Certificate certificate;
        o0000O00.OooO00o.OooOoo0(str, "host");
        o0000O00.OooO00o.OooOoo0(sSLSession, "session");
        if (OooO0O0(str)) {
            try {
                certificate = sSLSession.getPeerCertificates()[0];
                o0000O00.OooO00o.OooOoO0(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            } catch (SSLException unused) {
                return false;
            }
        }
        return OooO0OO(str, (X509Certificate) certificate);
    }
}