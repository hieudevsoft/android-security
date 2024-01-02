package OooO0oo;

import OooO0O0.OooO0O0;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class o0o0Oo extends OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f500OooO00o = new Object();

    public o0o0Oo() {
        Executors.newFixedThreadPool(4, new o00OOO0O());
    }

    public final boolean OooOOo0() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}