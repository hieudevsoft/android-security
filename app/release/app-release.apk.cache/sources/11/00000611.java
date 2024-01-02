package o0000oOo;

import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import com.google.gson.internal.OooO0o;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.X509Certificate;
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
import o0000oo0.o000OOo;
import o0000oo0.o00oO0o;
import o0000oo0.o0O0O00;
import o0000oo0.o0OO00O;

/* loaded from: classes.dex */
public final class o000O0o extends o000OO00 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final boolean f4768OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final o00000OO f4769OooO0o0 = new o00000OO(4, 0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4770OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o000OOo f4771OooO0Oo;

    static {
        boolean z = false;
        if (o00000OO.OooOO0o() && Build.VERSION.SDK_INT < 30) {
            z = true;
        }
        f4768OooO0o = z;
    }

    public o000O0o() {
        o0000oo0.o00000OO o00000oo2;
        Method method;
        Method method2;
        o00000O[] o00000oArr = new o00000O[4];
        Method method3 = null;
        try {
            o00000oo2 = new o0000oo0.o00000OO(Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketImpl")), Class.forName("com.android.org.conscrypt".concat(".OpenSSLSocketFactoryImpl")), Class.forName("com.android.org.conscrypt".concat(".SSLParametersImpl")));
        } catch (Exception e) {
            o000OO00.f4772OooO00o.getClass();
            o000OO00.OooO("unable to load android socket classes", 5, e);
            o00000oo2 = null;
        }
        o00000oArr[0] = o00000oo2;
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
        this.f4770OooO0OO = arrayList;
        try {
            Class<?> cls = Class.forName("dalvik.system.CloseGuard");
            Method method4 = cls.getMethod("get", new Class[0]);
            method2 = cls.getMethod("open", String.class);
            method = cls.getMethod("warnIfOpen", new Class[0]);
            method3 = method4;
        } catch (Exception unused) {
            method = null;
            method2 = null;
        }
        this.f4771OooO0Oo = new o000OOo(method3, method2, method);
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
    public final o000.OooO0o OooO0OO(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new o000O000(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.OooO0OO(x509TrustManager);
        }
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        Object obj;
        o0000O00.OooO00o.OooOoo0(list, "protocols");
        Iterator it = this.f4770OooO0OO.iterator();
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
        Iterator it = this.f4770OooO0OO.iterator();
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
    public final void OooO0o0(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        o0000O00.OooO00o.OooOoo0(inetSocketAddress, "address");
        try {
            socket.connect(inetSocketAddress, i);
        } catch (ClassCastException e) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e;
            }
            throw new IOException("Exception in connect", e);
        }
    }

    @Override // o0000oOo.o000OO00
    public final Object OooO0oO() {
        o000OOo o000ooo = this.f4771OooO0Oo;
        o000ooo.getClass();
        Method method = o000ooo.f4788OooO00o;
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, new Object[0]);
            Method method2 = o000ooo.f4789OooO0O0;
            o0000O00.OooO00o.OooOo(method2);
            method2.invoke(invoke, "response.body().close()");
            return invoke;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // o0000oOo.o000OO00
    public final boolean OooO0oo(String str) {
        o0000O00.OooO00o.OooOoo0(str, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // o0000oOo.o000OO00
    public final void OooOO0(Object obj, String str) {
        o0000O00.OooO00o.OooOoo0(str, "message");
        o000OOo o000ooo = this.f4771OooO0Oo;
        o000ooo.getClass();
        boolean z = false;
        if (obj != null) {
            try {
                Method method = o000ooo.f4790OooO0OO;
                o0000O00.OooO00o.OooOo(method);
                method.invoke(obj, new Object[0]);
                z = true;
            } catch (Exception unused) {
            }
        }
        if (!z) {
            o000OO00.OooO(str, 5, null);
        }
    }
}