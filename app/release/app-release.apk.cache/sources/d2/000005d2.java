package o0000o0o;

import OooOOoo.o0Oo0oo;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000O00.OooO0O0;
import o0000Oo.OooOo;
import o0000Oo.OooOo00;
import o0000Oo.Oooo000;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class o00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final List f4489OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4490OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4491OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4492OooO0Oo;

    public o00000(List list) {
        OooO00o.OooOoo0(list, "connectionSpecs");
        this.f4489OooO00o = list;
    }

    public final Oooo000 OooO00o(SSLSocket sSLSocket) {
        Oooo000 oooo000;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        boolean z2;
        int i = this.f4490OooO0O0;
        List list = this.f4489OooO00o;
        int size = list.size();
        while (true) {
            if (i < size) {
                oooo000 = (Oooo000) list.get(i);
                if (oooo000.OooO0O0(sSLSocket)) {
                    this.f4490OooO0O0 = i + 1;
                    break;
                }
                i++;
            } else {
                oooo000 = null;
                break;
            }
        }
        if (oooo000 != null) {
            int i2 = this.f4490OooO0O0;
            int size2 = list.size();
            while (true) {
                if (i2 < size2) {
                    if (((Oooo000) list.get(i2)).OooO0O0(sSLSocket)) {
                        z = true;
                        break;
                    }
                    i2++;
                } else {
                    z = false;
                    break;
                }
            }
            this.f4491OooO0OO = z;
            boolean z3 = this.f4492OooO0Oo;
            String[] strArr = oooo000.f4235OooO0OO;
            if (strArr != null) {
                String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
                OooO00o.OooOoOO(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
                enabledCipherSuites = OooOO0O.OooOOOO(enabledCipherSuites2, strArr, OooOo00.f4202OooO0OO);
            } else {
                enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            }
            String[] strArr2 = oooo000.f4236OooO0Oo;
            if (strArr2 != null) {
                String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
                OooO00o.OooOoOO(enabledProtocols2, "sslSocket.enabledProtocols");
                enabledProtocols = OooOO0O.OooOOOO(enabledProtocols2, strArr2, OooO0O0.f4154OooO00o);
            } else {
                enabledProtocols = sSLSocket.getEnabledProtocols();
            }
            String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
            OooO00o.OooOoOO(supportedCipherSuites, "supportedCipherSuites");
            o0Oo0oo o0oo0oo = OooOo00.f4202OooO0OO;
            byte[] bArr = OooOO0O.f4403OooO00o;
            int length = supportedCipherSuites.length;
            int i3 = 0;
            while (true) {
                if (i3 < length) {
                    if (o0oo0oo.compare(supportedCipherSuites[i3], "TLS_FALLBACK_SCSV") == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        break;
                    }
                    i3++;
                } else {
                    i3 = -1;
                    break;
                }
            }
            if (z3 && i3 != -1) {
                OooO00o.OooOoOO(enabledCipherSuites, "cipherSuitesIntersection");
                String str = supportedCipherSuites[i3];
                OooO00o.OooOoOO(str, "supportedCipherSuites[indexOfFallbackScsv]");
                Object[] copyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
                OooO00o.OooOoOO(copyOf, "copyOf(this, newSize)");
                enabledCipherSuites = (String[]) copyOf;
                enabledCipherSuites[enabledCipherSuites.length - 1] = str;
            }
            OooOo oooOo = new OooOo(oooo000);
            OooO00o.OooOoOO(enabledCipherSuites, "cipherSuitesIntersection");
            oooOo.OooO0O0((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
            OooO00o.OooOoOO(enabledProtocols, "tlsVersionsIntersection");
            oooOo.OooO0o0((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
            Oooo000 OooO00o2 = oooOo.OooO00o();
            if (OooO00o2.OooO0OO() != null) {
                sSLSocket.setEnabledProtocols(OooO00o2.f4236OooO0Oo);
            }
            if (OooO00o2.OooO00o() != null) {
                sSLSocket.setEnabledCipherSuites(OooO00o2.f4235OooO0OO);
            }
            return oooo000;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f4492OooO0Oo);
        sb.append(", modes=");
        sb.append(list);
        sb.append(", supported protocols=");
        String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
        OooO00o.OooOo(enabledProtocols3);
        String arrays = Arrays.toString(enabledProtocols3);
        OooO00o.OooOoOO(arrays, "toString(this)");
        sb.append(arrays);
        throw new UnknownServiceException(sb.toString());
    }
}