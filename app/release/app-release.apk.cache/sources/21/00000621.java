package o0000oo0;

import javax.net.ssl.SSLSocket;
import o0000O00.OooO00o;
import o0000Oo0.OooOOOO;

/* loaded from: classes.dex */
public final class o0Oo0oo implements o00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ String f4802OooO00o = "com.google.android.gms.org.conscrypt";

    @Override // o0000oo0.o00000
    public final boolean OooO00o(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return OooOOOO.o00O0o(name, this.f4802OooO00o + '.', false);
    }

    @Override // o0000oo0.o00000
    public final o00000O OooO0O0(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!OooO00o.OooOOO0(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new o0OO00O(cls2);
    }
}