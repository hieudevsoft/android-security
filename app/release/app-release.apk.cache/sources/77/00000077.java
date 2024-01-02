package OooO0oo;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o00OOO0O implements ThreadFactory {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final AtomicInteger f499OooO00o = new AtomicInteger(0);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f499OooO00o.getAndIncrement());
        return thread;
    }
}