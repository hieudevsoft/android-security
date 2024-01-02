package o0000oOO;

import java.io.IOException;
import java.net.SocketTimeoutException;
import o000O000.OooO;

/* loaded from: classes.dex */
public final class o0000O00 extends OooO {
    public final /* synthetic */ o0000oo OooOOO0;

    public o0000O00(o0000oo o0000ooVar) {
        this.OooOOO0 = o0000ooVar;
    }

    @Override // o000O000.OooO
    public final IOException OooOO0(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o000O000.OooO
    public final void OooOO0O() {
        this.OooOOO0.OooO0o0(OooOo.CANCEL);
        o000000O o000000o2 = this.OooOOO0.f4692OooO0O0;
        synchronized (o000000o2) {
            long j = o000000o2.f4648OooOOOo;
            long j2 = o000000o2.f4647OooOOOO;
            if (j >= j2) {
                o000000o2.f4647OooOOOO = j2 + 1;
                o000000o2.f4650OooOOo0 = System.nanoTime() + 1000000000;
                o0000o0O.oo0o0Oo oo0o0oo = o000000o2.f4634OooO;
                oo0o0oo.OooO0OO(new o0000o0O.o0OO00O(2, o000000o2, o000000o2.f4638OooO0Oo + " ping"), 0L);
            }
        }
    }

    public final void OooOO0o() {
        if (OooO()) {
            throw OooOO0(null);
        }
    }
}