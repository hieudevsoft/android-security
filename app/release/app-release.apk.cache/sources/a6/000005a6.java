package o0000Oo;

import androidx.lifecycle.o0000;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import o0000O0O.OooO00o;

/* loaded from: classes.dex */
public final class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000Ooo f4286OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOo00 f4287OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final List f4288OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00000oo.o00Oo0 f4289OooO0Oo;

    public o00Oo0(o0000Ooo o0000ooo, OooOo00 oooOo00, List list, OooO00o oooO00o) {
        o0000O00.OooO00o.OooOoo0(o0000ooo, "tlsVersion");
        o0000O00.OooO00o.OooOoo0(oooOo00, "cipherSuite");
        o0000O00.OooO00o.OooOoo0(list, "localCertificates");
        this.f4286OooO00o = o0000ooo;
        this.f4287OooO0O0 = oooOo00;
        this.f4288OooO0OO = list;
        this.f4289OooO0Oo = new o00000oo.o00Oo0(new o0000(3, oooO00o));
    }

    public final List OooO00o() {
        return (List) this.f4289OooO0Oo.OooO00o();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o00Oo0) {
            o00Oo0 o00oo0 = (o00Oo0) obj;
            if (o00oo0.f4286OooO00o == this.f4286OooO00o && o0000O00.OooO00o.OooOOO0(o00oo0.f4287OooO0O0, this.f4287OooO0O0) && o0000O00.OooO00o.OooOOO0(o00oo0.OooO00o(), OooO00o()) && o0000O00.OooO00o.OooOOO0(o00oo0.f4288OooO0OO, this.f4288OooO0OO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4287OooO0O0.hashCode();
        int hashCode2 = OooO00o().hashCode();
        return this.f4288OooO0OO.hashCode() + ((hashCode2 + ((hashCode + ((this.f4286OooO00o.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> OooO00o2 = OooO00o();
        ArrayList arrayList = new ArrayList(o0000.OooOOOO.o00O0O0o(OooO00o2));
        for (Certificate certificate : OooO00o2) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                o0000O00.OooO00o.OooOoOO(type2, "type");
            }
            arrayList.add(type2);
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4286OooO00o);
        sb.append(" cipherSuite=");
        sb.append(this.f4287OooO0O0);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list = this.f4288OooO0OO;
        ArrayList arrayList2 = new ArrayList(o0000.OooOOOO.o00O0O0o(list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                o0000O00.OooO00o.OooOoOO(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}