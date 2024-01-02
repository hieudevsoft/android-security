package o0000ooO;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000OOo0 extends ProxySelector {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o000OOo0 f4806OooO00o = new o000OOo0();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return OooO00o.o0000Oo(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null".toString());
    }
}