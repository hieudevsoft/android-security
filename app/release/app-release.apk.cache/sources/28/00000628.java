package o000O000;

import java.util.concurrent.locks.ReentrantLock;
import o0000oOO.o00000OO;

/* loaded from: classes.dex */
public final class OooO0O0 extends Thread {
    public OooO0O0() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        OooO OooO0o02;
        while (true) {
            try {
                reentrantLock = OooO.f4808OooO0oo;
                reentrantLock.lock();
                OooO0o02 = o00000OO.OooO0o0();
            } catch (InterruptedException unused) {
            }
            if (OooO0o02 == OooO.f4811OooOO0o) {
                OooO.f4811OooOO0o = null;
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            if (OooO0o02 != null) {
                OooO0o02.OooOO0O();
            }
        }
    }
}