package o0000o0o;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import o0000O00.OooO00o;
import o0000Oo.OooOOO0;
import o0000Oo.o0ooOOo;
import o0000Oo.oo0o0Oo;
import o0000oOo.o000OO00;

/* loaded from: classes.dex */
public final class o0000 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4486OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public volatile AtomicInteger f4487OooO0O0 = new AtomicInteger(0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0000O0 f4488OooO0OO;

    public o0000(o0000O0 o0000o02, OooOOO0 oooOOO0) {
        this.f4488OooO0OO = o0000o02;
        this.f4486OooO00o = oooOOO0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oo0o0Oo oo0o0oo;
        o0000O0 o0000o02 = this.f4488OooO0OO;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName("OkHttp " + ((o0ooOOo) this.f4488OooO0OO.f4521OooO0O0.f2519OooO0O0).OooO0o());
        try {
            o0000o02.f4524OooO0o.OooO0oo();
            boolean z = false;
            try {
            } catch (IOException e) {
                e = e;
            } catch (Throwable th) {
                th = th;
            }
            try {
                this.f4486OooO00o.OooO0O0(o0000o02, o0000o02.OooO0oO());
                oo0o0oo = o0000o02.f4520OooO00o;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    o000OO00 o000oo00 = o000OO00.f4772OooO00o;
                    o000OO00.f4772OooO00o.getClass();
                    o000OO00.OooO("Callback failure for " + o0000O0.OooO00o(o0000o02), 4, e);
                } else {
                    this.f4486OooO00o.OooO00o(o0000o02, e);
                }
                oo0o0oo = o0000o02.f4520OooO00o;
                oo0o0oo.f4357OooO00o.OooO00o(this);
            } catch (Throwable th2) {
                th = th2;
                z = true;
                o0000o02.OooO0Oo();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    OooO00o.OooO(iOException, th);
                    this.f4486OooO00o.OooO00o(o0000o02, iOException);
                }
                throw th;
            }
            oo0o0oo.f4357OooO00o.OooO00o(this);
        } finally {
            currentThread.setName(name);
        }
    }
}