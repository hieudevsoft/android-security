package o0000o0O;

import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0000OoO.OooOO0;

/* loaded from: classes.dex */
public final class o0O0O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ThreadPoolExecutor f4465OooO00o;

    public o0O0O00(OooOO0 oooOO0) {
        this.f4465OooO00o = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), oooOO0);
    }
}