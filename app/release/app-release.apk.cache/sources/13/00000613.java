package o0000oOo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000oOO.o00000OO;

/* loaded from: classes.dex */
public final class o000OO0O extends o000OO00 {

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final o00000OO f4774OooO0oo = new o00000OO(6, 0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Method f4775OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Method f4776OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Class f4777OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final Method f4778OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final Class f4779OooO0oO;

    public o000OO0O(Method method, Method method2, Method method3, Class cls, Class cls2) {
        this.f4775OooO0OO = method;
        this.f4776OooO0Oo = method2;
        this.f4778OooO0o0 = method3;
        this.f4777OooO0o = cls;
        this.f4779OooO0oO = cls2;
    }

    @Override // o0000oOo.o000OO00
    public final void OooO00o(SSLSocket sSLSocket) {
        try {
            this.f4778OooO0o0.invoke(null, sSLSocket);
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to remove ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to remove ALPN", e2);
        }
    }

    @Override // o0000oOo.o000OO00
    public final void OooO0Oo(SSLSocket sSLSocket, String str, List list) {
        OooO00o.OooOoo0(list, "protocols");
        try {
            this.f4775OooO0OO.invoke(null, sSLSocket, Proxy.newProxyInstance(o000OO00.class.getClassLoader(), new Class[]{this.f4777OooO0o, this.f4779OooO0oO}, new o000O0Oo(o00000OO.OooO0Oo(list))));
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to set ALPN", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to set ALPN", e2);
        }
    }

    @Override // o0000oOo.o000OO00
    public final String OooO0o(SSLSocket sSLSocket) {
        try {
            InvocationHandler invocationHandler = Proxy.getInvocationHandler(this.f4776OooO0Oo.invoke(null, sSLSocket));
            OooO00o.OooOoO0(invocationHandler, "null cannot be cast to non-null type okhttp3.internal.platform.Jdk8WithJettyBootPlatform.AlpnProvider");
            o000O0Oo o000o0oo = (o000O0Oo) invocationHandler;
            boolean z = o000o0oo.f4766OooO0O0;
            if (!z && o000o0oo.f4767OooO0OO == null) {
                o000OO00.OooO("ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", 4, null);
                return null;
            } else if (z) {
                return null;
            } else {
                return o000o0oo.f4767OooO0OO;
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError("failed to get ALPN selected protocol", e);
        } catch (InvocationTargetException e2) {
            throw new AssertionError("failed to get ALPN selected protocol", e2);
        }
    }
}