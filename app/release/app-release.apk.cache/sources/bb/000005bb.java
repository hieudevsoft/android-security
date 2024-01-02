package o0000OoO;

import java.util.concurrent.ThreadFactory;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final /* synthetic */ class OooOO0 implements ThreadFactory {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ String f4401OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ boolean f4402OooO0O0;

    public /* synthetic */ OooOO0(String str, boolean z) {
        this.f4401OooO00o = str;
        this.f4402OooO0O0 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.f4401OooO00o;
        OooO00o.OooOoo0(str, "$name");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(this.f4402OooO0O0);
        return thread;
    }
}