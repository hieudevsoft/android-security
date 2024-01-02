package OooOoo0;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes.dex */
public final class o0000oo implements ThreadFactory {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f1261OooO00o = "fonts-androidx";

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f1262OooO0O0 = 10;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new o0000O00(runnable, this.f1261OooO00o, this.f1262OooO0O0);
    }
}