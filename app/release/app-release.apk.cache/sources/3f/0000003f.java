package OooO0o;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class OooO00o implements androidx.emoji2.text.OooOo00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f251OooO00o;

    public OooO00o(Context context, int i) {
        if (i != 1) {
            this.f251OooO00o = context;
        } else {
            this.f251OooO00o = context.getApplicationContext();
        }
    }

    @Override // androidx.emoji2.text.OooOo00
    public final void OooO00o(final o0000O00.OooO00o oooO00o) {
        final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.OooO00o("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new Runnable() { // from class: androidx.emoji2.text.Oooo0
            @Override // java.lang.Runnable
            public final void run() {
                OooO0o.OooO00o oooO00o2 = OooO0o.OooO00o.this;
                o0000O00.OooO00o oooO00o3 = oooO00o;
                ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
                oooO00o2.getClass();
                try {
                    Oooo000 OoooOO02 = o0000O00.OooO00o.OoooOO0(oooO00o2.f251OooO00o);
                    if (OoooOO02 != null) {
                        o00oO0o o00oo0o = (o00oO0o) OoooOO02.f2676OooO00o;
                        synchronized (o00oo0o.f2714OooO0Oo) {
                            o00oo0o.f2715OooO0o = threadPoolExecutor2;
                        }
                        OoooOO02.f2676OooO00o.OooO00o(new o000oOoO(oooO00o3, threadPoolExecutor2));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    oooO00o3.o000O000(th);
                    threadPoolExecutor2.shutdown();
                }
            }
        });
    }
}