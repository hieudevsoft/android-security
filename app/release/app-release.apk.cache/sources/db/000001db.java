package OoooO;

import OooO0oo.o00OOO00;
import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1528OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Context f1529OooO0O0;

    public /* synthetic */ o00Oo0(Context context, int i) {
        this.f1528OooO00o = i;
        this.f1529OooO0O0 = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1528OooO00o;
        Context context = this.f1529OooO0O0;
        switch (i) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new o00Oo0(context, 1));
                return;
            default:
                OooO00o.o00O00o(context, new o00OOO00(5), OooO00o.f4125OooOOo, false);
                return;
        }
    }
}