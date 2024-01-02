package OooO0Oo;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class o000OO implements Executor {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f221OooO00o = new Object();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ArrayDeque f222OooO0O0 = new ArrayDeque();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Executor f223OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Runnable f224OooO0Oo;

    public o000OO(o0000O o0000o2) {
        this.f223OooO0OO = o0000o2;
    }

    public final void OooO00o() {
        synchronized (this.f221OooO00o) {
            Runnable runnable = (Runnable) this.f222OooO0O0.poll();
            this.f224OooO0Oo = runnable;
            if (runnable != null) {
                this.f223OooO0OO.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f221OooO00o) {
            this.f222OooO0O0.add(new o0000O0O(this, 0, runnable));
            if (this.f224OooO0Oo == null) {
                OooO00o();
            }
        }
    }
}