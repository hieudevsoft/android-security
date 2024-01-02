package OooOO0O;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class OooOO0O implements Future {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooO0O0.OooO0O0 f561OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final Object f563OooO0oO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public volatile Object f564OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public volatile OooO0OO f565OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public volatile OooOO0 f566OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final boolean f560OooO0Oo = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Logger f562OooO0o0 = Logger.getLogger(OooOO0O.class.getName());

    static {
        OooO0O0.OooO0O0 oooO;
        try {
            oooO = new OooO0o(AtomicReferenceFieldUpdater.newUpdater(OooOO0.class, Thread.class, "OooO00o"), AtomicReferenceFieldUpdater.newUpdater(OooOO0.class, OooOO0.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(OooOO0O.class, OooOO0.class, "OooO0OO"), AtomicReferenceFieldUpdater.newUpdater(OooOO0O.class, OooO0OO.class, "OooO0O0"), AtomicReferenceFieldUpdater.newUpdater(OooOO0O.class, Object.class, "OooO00o"));
            th = null;
        } catch (Throwable th) {
            th = th;
            oooO = new OooO();
        }
        f561OooO0o = oooO;
        if (th != null) {
            f562OooO0o0.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f563OooO0oO = new Object();
    }

    public static void OooO0O0(OooOO0O oooOO0O) {
        OooOO0 oooOO0;
        OooO0OO oooO0OO;
        do {
            oooOO0 = oooOO0O.f566OooO0OO;
        } while (!f561OooO0o.OooO0o0(oooOO0O, oooOO0, OooOO0.f557OooO0OO));
        while (oooOO0 != null) {
            Thread thread = oooOO0.f558OooO00o;
            if (thread != null) {
                oooOO0.f558OooO00o = null;
                LockSupport.unpark(thread);
            }
            oooOO0 = oooOO0.f559OooO0O0;
        }
        do {
            oooO0OO = oooOO0O.f565OooO0O0;
        } while (!f561OooO0o.OooO0OO(oooOO0O, oooO0OO));
        OooO0OO oooO0OO2 = null;
        while (oooO0OO != null) {
            OooO0OO oooO0OO3 = oooO0OO.f551OooO00o;
            oooO0OO.f551OooO00o = oooO0OO2;
            oooO0OO2 = oooO0OO;
            oooO0OO = oooO0OO3;
        }
        while (oooO0OO2 != null) {
            oooO0OO2 = oooO0OO2.f551OooO00o;
            try {
                throw null;
                break;
            } catch (RuntimeException e) {
                f562OooO0o0.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e);
            }
        }
    }

    public static Object OooO0OO(Object obj) {
        if (!(obj instanceof OooO00o)) {
            if (!(obj instanceof OooO0O0)) {
                if (obj == f563OooO0oO) {
                    return null;
                }
                return obj;
            }
            ((OooO0O0) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        Throwable th = ((OooO00o) obj).f549OooO00o;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public final void OooO00o(StringBuilder sb) {
        Object obj;
        String valueOf;
        String str = "]";
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (CancellationException unused) {
                    str = "CANCELLED";
                    sb.append(str);
                    return;
                } catch (RuntimeException e) {
                    sb.append("UNKNOWN, cause=[");
                    sb.append(e.getClass());
                    str = " thrown from get()]";
                    sb.append(str);
                    return;
                } catch (ExecutionException e2) {
                    sb.append("FAILURE, cause=[");
                    sb.append(e2.getCause());
                    sb.append(str);
                    return;
                }
            } catch (InterruptedException unused2) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        if (obj == this) {
            valueOf = "this future";
        } else {
            valueOf = String.valueOf(obj);
        }
        sb.append(valueOf);
        sb.append("]");
    }

    public final void OooO0Oo(OooOO0 oooOO0) {
        oooOO0.f558OooO00o = null;
        while (true) {
            OooOO0 oooOO02 = this.f566OooO0OO;
            if (oooOO02 == OooOO0.f557OooO0OO) {
                return;
            }
            OooOO0 oooOO03 = null;
            while (oooOO02 != null) {
                OooOO0 oooOO04 = oooOO02.f559OooO0O0;
                if (oooOO02.f558OooO00o != null) {
                    oooOO03 = oooOO02;
                } else if (oooOO03 != null) {
                    oooOO03.f559OooO0O0 = oooOO04;
                    if (oooOO03.f558OooO00o == null) {
                        break;
                    }
                } else if (!f561OooO0o.OooO0o0(this, oooOO02, oooOO04)) {
                    break;
                }
                oooOO02 = oooOO04;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f564OooO00o;
        if ((obj == null) | false) {
            if (f561OooO0o.OooO0Oo(this, obj, f560OooO0Oo ? new OooO00o(z, new CancellationException("Future.cancel() was called.")) : z ? OooO00o.f547OooO0O0 : OooO00o.f548OooO0OO)) {
                OooO0O0(this);
                return true;
            }
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f564OooO00o;
        if ((obj2 != null) && true) {
            return OooO0OO(obj2);
        }
        OooOO0 oooOO0 = this.f566OooO0OO;
        OooOO0 oooOO02 = OooOO0.f557OooO0OO;
        if (oooOO0 != oooOO02) {
            OooOO0 oooOO03 = new OooOO0();
            do {
                OooO0O0.OooO0O0 oooO0O0 = f561OooO0o;
                oooO0O0.OooOOOO(oooOO03, oooOO0);
                if (oooO0O0.OooO0o0(this, oooOO0, oooOO03)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            OooO0Oo(oooOO03);
                            throw new InterruptedException();
                        }
                        obj = this.f564OooO00o;
                    } while (!((obj != null) & true));
                    return OooO0OO(obj);
                }
                oooOO0 = this.f566OooO0OO;
            } while (oooOO0 != oooOO02);
            return OooO0OO(this.f564OooO00o);
        }
        return OooO0OO(this.f564OooO00o);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f564OooO00o instanceof OooO00o;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f564OooO00o != null) & true;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f564OooO00o instanceof OooO00o) {
            str2 = "CANCELLED";
        } else {
            if (!isDone()) {
                try {
                    if (this instanceof ScheduledFuture) {
                        str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                    } else {
                        str = null;
                    }
                } catch (RuntimeException e) {
                    str = "Exception thrown from implementation: " + e.getClass();
                }
                if (str != null && !str.isEmpty()) {
                    sb.append("PENDING, info=[");
                    sb.append(str);
                    sb.append("]");
                    sb.append("]");
                    return sb.toString();
                }
                str2 = isDone() ? "PENDING" : "PENDING";
            }
            OooO00o(sb);
            sb.append("]");
            return sb.toString();
        }
        sb.append(str2);
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x00a4 -> B:56:0x00aa). Please submit an issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOO0O.OooOO0O.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }
}