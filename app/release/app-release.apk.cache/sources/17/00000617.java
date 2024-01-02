package o0000oo0;

import javax.net.ssl.SSLSocket;
import o0000oOo.o000O0;
import o0000oOo.o000O00;
import org.conscrypt.Conscrypt;

/* loaded from: classes.dex */
public final class o000000 implements o00000 {
    @Override // o0000oo0.o00000
    public final boolean OooO00o(SSLSocket sSLSocket) {
        boolean z = o000O0.f4759OooO0Oo;
        return o000O00.OooO0O0() && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // o0000oo0.o00000
    public final o00000O OooO0O0(SSLSocket sSLSocket) {
        return new o000000O();
    }
}