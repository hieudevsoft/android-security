package o000O000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class o0Oo0oo {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o0OOO0o f4856OooO0Oo = new o0OOO0o();

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f4857OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f4858OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public long f4859OooO0OO;

    public o0Oo0oo OooO00o() {
        this.f4857OooO00o = false;
        return this;
    }

    public o0Oo0oo OooO0O0() {
        this.f4859OooO0OO = 0L;
        return this;
    }

    public long OooO0OO() {
        if (this.f4857OooO00o) {
            return this.f4858OooO0O0;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public o0Oo0oo OooO0Oo(long j) {
        this.f4857OooO00o = true;
        this.f4858OooO0O0 = j;
        return this;
    }

    public void OooO0o() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4857OooO00o && this.f4858OooO0O0 - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public boolean OooO0o0() {
        return this.f4857OooO00o;
    }

    public o0Oo0oo OooO0oO(long j, TimeUnit timeUnit) {
        o0000O00.OooO00o.OooOoo0(timeUnit, "unit");
        if (j >= 0) {
            this.f4859OooO0OO = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }
}