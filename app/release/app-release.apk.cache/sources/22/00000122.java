package OooOoo0;

import android.os.Process;

/* loaded from: classes.dex */
public final class o0000O00 extends Thread {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1256OooO00o;

    public o0000O00(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.f1256OooO00o = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f1256OooO00o);
        super.run();
    }
}