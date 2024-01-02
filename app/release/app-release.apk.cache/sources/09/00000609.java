package o0000oOo;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.gson.internal.OooO0o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import o000.OooO00o;
import o0000.OooOOOO;
import o0000oOO.o00000OO;
import o0000oo0.o000000O;
import o0000oo0.o00000O;
import o0000oo0.o00000O0;
import o0000oo0.o00oO0o;
import o0000oo0.o0O0O00;
import o0000oo0.o0OO00O;
import o0000oo0.oo000o;

/* loaded from: classes.dex */
public final class o000 extends o000OO00 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o00000OO f4753OooO0Oo = new o00000OO(3, 0);

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final boolean f4754OooO0o0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4755OooO0OO;

    static {
        boolean z = false;
        if (o00000OO.OooOO0o() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        f4754OooO0o0 = z;
    }

    public o000() {
        oo000o oo000oVar;
        o00000O[] o00000oArr = new o00000O[4];
        if (oo000o.f4805OooO00o.OooOOO0()) {
            oo000oVar = new oo000o();
        } else {
            oo000oVar = null;
        }
        o00000oArr[0] = oo000oVar;
        o00000oArr[1] = new o00000O0(o0OO00O.f4795OooO0o);
        o00000oArr[2] = new o00000O0(o000000O.f4784OooO00o.OooOO0O());
        o00000oArr[3] = new o00000O0(o0O0O00.f4793OooO00o.OooOO0O());
        ArrayList o00O0OOO = OooOOOO.o00O0OOO(o00000oArr);
        ArrayList arrayList = new ArrayList();
        Iterator it = o00O0OOO.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((o00000O) next).OooO0OO()) {
                arrayList.add(next);
            }
        }
        this.f4755OooO0OO = arrayList;
    }

    @Override // o0000oOo.o000OO00
    public final OooO0o OooO0O0(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        o00oO0o o00oo0o = null;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        if (x509TrustManagerExtensions != null) {
            o00oo0o = new o00oO0o(x509TrustManager, x509TrustManagerExtensions);
        }
        if (o00oo0o == null) {
            return new OooO00o(OooO0OO(x509TrustManager));
        }
        return o00oo0o;
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o0000O00.OooO00o.OooOoo0(list, "protocols");
        Iterator it = this.f4755OooO0OO.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o00000O) obj).OooO00o(sSLSocket)) {
                break;
            }
        }
        o00000O o00000o = (o00000O) obj;
        if (o00000o != null) {
            o00000o.OooO0Oo(sSLSocket, str, list);
        }
    }

    @Override // o0000oOo.o000OO00
    public final String OooO0o(SSLSocket sSLSocket) {
        Object obj;
        Iterator it = this.f4755OooO0OO.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((o00000O) obj).OooO00o(sSLSocket)) {
                break;
            }
        }
        o00000O o00000o = (o00000O) obj;
        if (o00000o != null) {
            return o00000o.OooO0O0(sSLSocket);
        }
        return null;
    }

    @Override // o0000oOo.o000OO00
    public final boolean OooO0oo(String str) {
        o0000O00.OooO00o.OooOoo0(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}