package o0000Oo;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class OooO0o {

    /* renamed from: OooO  reason: collision with root package name */
    public final o0ooOOo f4168OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00O0O f4169OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final SocketFactory f4170OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final SSLSocketFactory f4171OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final HostnameVerifier f4172OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final OooO f4173OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final OooOOO f4174OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Proxy f4175OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final ProxySelector f4176OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final List f4177OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final List f4178OooOO0O;

    public OooO0o(String str, int i, o00O0O o00o0o, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, OooOOO oooOOO, OooO oooO, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        OooO00o.OooOoo0(str, "uriHost");
        OooO00o.OooOoo0(o00o0o, "dns");
        OooO00o.OooOoo0(socketFactory, "socketFactory");
        OooO00o.OooOoo0(oooO, "proxyAuthenticator");
        OooO00o.OooOoo0(list, "protocols");
        OooO00o.OooOoo0(list2, "connectionSpecs");
        OooO00o.OooOoo0(proxySelector, "proxySelector");
        this.f4169OooO00o = o00o0o;
        this.f4170OooO0O0 = socketFactory;
        this.f4171OooO0OO = sSLSocketFactory;
        this.f4172OooO0Oo = hostnameVerifier;
        this.f4174OooO0o0 = oooOOO;
        this.f4173OooO0o = oooO;
        this.f4175OooO0oO = proxy;
        this.f4176OooO0oo = proxySelector;
        o00oO0o o00oo0o = new o00oO0o();
        String str2 = "https";
        String str3 = sSLSocketFactory != null ? "https" : "http";
        if (o0000Oo0.OooOOOO.oo0o0O0(str3, "http")) {
            str2 = "http";
        } else if (!o0000Oo0.OooOOOO.oo0o0O0(str3, "https")) {
            throw new IllegalArgumentException("unexpected scheme: ".concat(str3));
        }
        o00oo0o.f4291OooO00o = str2;
        char[] cArr = o0ooOOo.f4343OooOO0;
        boolean z = false;
        String o000oooO = OooO00o.o000oooO(OooOOOO.OooOo00(str, 0, 0, false, 7));
        if (o000oooO == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        o00oo0o.f4294OooO0Oo = o000oooO;
        if (1 <= i && i < 65536) {
            z = true;
        }
        if (z) {
            o00oo0o.f4296OooO0o0 = i;
            this.f4168OooO = o00oo0o.OooO00o();
            this.f4177OooOO0 = o0000OoO.OooOO0O.OooOo0o(list);
            this.f4178OooOO0O = o0000OoO.OooOO0O.OooOo0o(list2);
            return;
        }
        throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("unexpected port: ", i).toString());
    }

    public final boolean OooO00o(OooO0o oooO0o) {
        OooO00o.OooOoo0(oooO0o, "that");
        if (OooO00o.OooOOO0(this.f4169OooO00o, oooO0o.f4169OooO00o) && OooO00o.OooOOO0(this.f4173OooO0o, oooO0o.f4173OooO0o) && OooO00o.OooOOO0(this.f4177OooOO0, oooO0o.f4177OooOO0) && OooO00o.OooOOO0(this.f4178OooOO0O, oooO0o.f4178OooOO0O) && OooO00o.OooOOO0(this.f4176OooO0oo, oooO0o.f4176OooO0oo) && OooO00o.OooOOO0(this.f4175OooO0oO, oooO0o.f4175OooO0oO) && OooO00o.OooOOO0(this.f4171OooO0OO, oooO0o.f4171OooO0OO) && OooO00o.OooOOO0(this.f4172OooO0Oo, oooO0o.f4172OooO0Oo) && OooO00o.OooOOO0(this.f4174OooO0o0, oooO0o.f4174OooO0o0) && this.f4168OooO.f4350OooO0o0 == oooO0o.f4168OooO.f4350OooO0o0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooO0o) {
            OooO0o oooO0o = (OooO0o) obj;
            if (OooO00o.OooOOO0(this.f4168OooO, oooO0o.f4168OooO) && OooO00o(oooO0o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f4169OooO00o.hashCode();
        int hashCode2 = this.f4173OooO0o.hashCode();
        int hashCode3 = this.f4177OooOO0.hashCode();
        int hashCode4 = this.f4178OooOO0O.hashCode();
        int hashCode5 = this.f4176OooO0oo.hashCode();
        int hashCode6 = Objects.hashCode(this.f4175OooO0oO);
        int hashCode7 = Objects.hashCode(this.f4171OooO0OO);
        int hashCode8 = Objects.hashCode(this.f4172OooO0Oo);
        return Objects.hashCode(this.f4174OooO0o0) + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + ((this.f4168OooO.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Address{");
        o0ooOOo o0ooooo = this.f4168OooO;
        sb.append(o0ooooo.f4348OooO0Oo);
        sb.append(':');
        sb.append(o0ooooo.f4350OooO0o0);
        sb.append(", ");
        Proxy proxy = this.f4175OooO0oO;
        if (proxy != null) {
            str = "proxy=" + proxy;
        } else {
            str = "proxySelector=" + this.f4176OooO0oo;
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}