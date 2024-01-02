package o000O000;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public class OooO extends o0Oo0oo {

    /* renamed from: OooO  reason: collision with root package name */
    public static final Condition f4807OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final ReentrantLock f4808OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final long f4809OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final long f4810OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static OooO f4811OooOO0o;

    /* renamed from: OooO0o  reason: collision with root package name */
    public OooO f4812OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4813OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public long f4814OooO0oO;

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f4808OooO0oo = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        o0000O00.OooO00o.OooOoOO(newCondition, "newCondition(...)");
        f4807OooO = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f4809OooOO0 = millis;
        f4810OooOO0O = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final boolean OooO() {
        ReentrantLock reentrantLock = f4808OooO0oo;
        reentrantLock.lock();
        try {
            if (this.f4813OooO0o0) {
                this.f4813OooO0o0 = false;
                OooO oooO = f4811OooOO0o;
                while (oooO != null) {
                    OooO oooO2 = oooO.f4812OooO0o;
                    if (oooO2 == this) {
                        oooO.f4812OooO0o = this.f4812OooO0o;
                        this.f4812OooO0o = null;
                    } else {
                        oooO = oooO2;
                    }
                }
                reentrantLock.unlock();
                return true;
            }
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x0082, TRY_LEAVE, TryCatch #0 {all -> 0x0082, blocks: (B:7:0x0012, B:9:0x0018, B:11:0x001e, B:12:0x002d, B:15:0x0035, B:17:0x0041, B:20:0x0049, B:21:0x004e, B:23:0x0055, B:27:0x005f, B:29:0x0067, B:19:0x0045, B:32:0x0070, B:33:0x0075, B:34:0x0076, B:35:0x0081), top: B:39:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0oo() {
        /*
            r9 = this;
            long r0 = r9.f4859OooO0OO
            boolean r2 = r9.f4857OooO00o
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto Ld
            if (r2 != 0) goto Ld
            return
        Ld:
            java.util.concurrent.locks.ReentrantLock r4 = o000O000.OooO.f4808OooO0oo
            r4.lock()
            boolean r5 = r9.f4813OooO0o0     // Catch: java.lang.Throwable -> L82
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L76
            r9.f4813OooO0o0 = r6     // Catch: java.lang.Throwable -> L82
            o000O000.OooO r5 = o000O000.OooO.f4811OooOO0o     // Catch: java.lang.Throwable -> L82
            if (r5 != 0) goto L2d
            o000O000.OooO r5 = new o000O000.OooO     // Catch: java.lang.Throwable -> L82
            r5.<init>()     // Catch: java.lang.Throwable -> L82
            o000O000.OooO.f4811OooOO0o = r5     // Catch: java.lang.Throwable -> L82
            o000O000.OooO0O0 r5 = new o000O000.OooO0O0     // Catch: java.lang.Throwable -> L82
            r5.<init>()     // Catch: java.lang.Throwable -> L82
            r5.start()     // Catch: java.lang.Throwable -> L82
        L2d:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L3f
            if (r2 == 0) goto L3f
            long r2 = r9.OooO0OO()     // Catch: java.lang.Throwable -> L82
            long r2 = r2 - r5
            long r0 = java.lang.Math.min(r0, r2)     // Catch: java.lang.Throwable -> L82
            goto L41
        L3f:
            if (r3 == 0) goto L43
        L41:
            long r0 = r0 + r5
            goto L49
        L43:
            if (r2 == 0) goto L70
            long r0 = r9.OooO0OO()     // Catch: java.lang.Throwable -> L82
        L49:
            r9.f4814OooO0oO = r0     // Catch: java.lang.Throwable -> L82
            long r0 = r0 - r5
            o000O000.OooO r2 = o000O000.OooO.f4811OooOO0o     // Catch: java.lang.Throwable -> L82
        L4e:
            o0000O00.OooO00o.OooOo(r2)     // Catch: java.lang.Throwable -> L82
            o000O000.OooO r3 = r2.f4812OooO0o     // Catch: java.lang.Throwable -> L82
            if (r3 == 0) goto L5f
            long r7 = r3.f4814OooO0oO     // Catch: java.lang.Throwable -> L82
            long r7 = r7 - r5
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5d
            goto L5f
        L5d:
            r2 = r3
            goto L4e
        L5f:
            r9.f4812OooO0o = r3     // Catch: java.lang.Throwable -> L82
            r2.f4812OooO0o = r9     // Catch: java.lang.Throwable -> L82
            o000O000.OooO r0 = o000O000.OooO.f4811OooOO0o     // Catch: java.lang.Throwable -> L82
            if (r2 != r0) goto L6c
            java.util.concurrent.locks.Condition r0 = o000O000.OooO.f4807OooO     // Catch: java.lang.Throwable -> L82
            r0.signal()     // Catch: java.lang.Throwable -> L82
        L6c:
            r4.unlock()
            return
        L70:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L82
        L76:
            java.lang.String r0 = "Unbalanced enter/exit"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L82
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> L82
        L82:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.OooO.OooO0oo():void");
    }

    public IOException OooOO0(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void OooOO0O() {
    }
}