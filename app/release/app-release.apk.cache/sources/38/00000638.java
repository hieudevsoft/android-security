package o000O000;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class o00oO0o extends OooO {
    public final Socket OooOOO0;

    public o00oO0o(Socket socket) {
        this.OooOOO0 = socket;
    }

    @Override // o000O000.OooO
    public final IOException OooOO0(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o000O000.OooO
    public final void OooOO0O() {
        Level level;
        StringBuilder sb;
        Logger logger;
        Exception exc;
        Socket socket = this.OooOOO0;
        try {
            socket.close();
        } catch (AssertionError e) {
            if (o0000O00.OooO00o.o0000oo(e)) {
                Logger logger2 = Oooo000.f4840OooO00o;
                level = Level.WARNING;
                sb = new StringBuilder("Failed to close timed out socket ");
                exc = e;
                logger = logger2;
                sb.append(socket);
                logger.log(level, sb.toString(), (Throwable) exc);
            }
            throw e;
        } catch (Exception e2) {
            Logger logger3 = Oooo000.f4840OooO00o;
            level = Level.WARNING;
            sb = new StringBuilder("Failed to close timed out socket ");
            exc = e2;
            logger = logger3;
            sb.append(socket);
            logger.log(level, sb.toString(), (Throwable) exc);
        }
    }
}