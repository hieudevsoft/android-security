package androidx.emoji2.text;

import OooOoOO.o0000Ooo;
import OooOoo0.o0000;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Handler;
import java.nio.MappedByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class o00oO0o implements OooOo00 {

    /* renamed from: OooO  reason: collision with root package name */
    public Oooo0O0.OooOOO0 f2710OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f2711OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final androidx.appcompat.widget.o00Oo0 f2712OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o0ooOO0.OooOOO0 f2713OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f2714OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Executor f2715OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Handler f2716OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public ThreadPoolExecutor f2717OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o0000O00.OooO00o f2718OooO0oo;

    public o00oO0o(Context context, androidx.appcompat.widget.o00Oo0 o00oo0) {
        o0ooOO0.OooOOO0 oooOOO0 = Oooo000.f2692OooO0Oo;
        this.f2714OooO0Oo = new Object();
        if (context != null) {
            this.f2711OooO00o = context.getApplicationContext();
            this.f2712OooO0O0 = o00oo0;
            this.f2713OooO0OO = oooOOO0;
            return;
        }
        throw new NullPointerException("Context cannot be null");
    }

    @Override // androidx.emoji2.text.OooOo00
    public final void OooO00o(o0000O00.OooO00o oooO00o) {
        synchronized (this.f2714OooO0Oo) {
            this.f2718OooO0oo = oooO00o;
        }
        OooO0OO();
    }

    public final void OooO0O0() {
        synchronized (this.f2714OooO0Oo) {
            this.f2718OooO0oo = null;
            Oooo0O0.OooOOO0 oooOOO0 = this.f2710OooO;
            if (oooOOO0 != null) {
                o0ooOO0.OooOOO0 oooOOO02 = this.f2713OooO0OO;
                Context context = this.f2711OooO00o;
                oooOOO02.getClass();
                context.getContentResolver().unregisterContentObserver(oooOOO0);
                this.f2710OooO = null;
            }
            Handler handler = this.f2716OooO0o0;
            if (handler != null) {
                handler.removeCallbacks(null);
            }
            this.f2716OooO0o0 = null;
            ThreadPoolExecutor threadPoolExecutor = this.f2717OooO0oO;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.f2715OooO0o = null;
            this.f2717OooO0oO = null;
        }
    }

    public final void OooO0OO() {
        synchronized (this.f2714OooO0Oo) {
            if (this.f2718OooO0oo == null) {
                return;
            }
            if (this.f2715OooO0o == null) {
                ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new OooO00o("emojiCompat"));
                threadPoolExecutor.allowCoreThreadTimeOut(true);
                this.f2717OooO0oO = threadPoolExecutor;
                this.f2715OooO0o = threadPoolExecutor;
            }
            this.f2715OooO0o.execute(new Runnable(this) { // from class: androidx.emoji2.text.oo000o

                /* renamed from: OooO0O0  reason: collision with root package name */
                public final /* synthetic */ o00oO0o f2728OooO0O0;

                {
                    this.f2728OooO0O0 = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (r2) {
                        case 0:
                            o00oO0o o00oo0o = this.f2728OooO0O0;
                            synchronized (o00oo0o.f2714OooO0Oo) {
                                if (o00oo0o.f2718OooO0oo != null) {
                                    try {
                                        o0000 OooO0Oo2 = o00oo0o.OooO0Oo();
                                        int i = OooO0Oo2.f1242OooO0o0;
                                        if (i == 2) {
                                            synchronized (o00oo0o.f2714OooO0Oo) {
                                            }
                                        }
                                        if (i == 0) {
                                            int i2 = OooOoOO.o0000.f1201OooO00o;
                                            o0000Ooo.OooO00o("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                            o0ooOO0.OooOOO0 oooOOO0 = o00oo0o.f2713OooO0OO;
                                            Context context = o00oo0o.f2711OooO00o;
                                            oooOOO0.getClass();
                                            Typeface OooOOoo2 = OooOo.OooOO0O.f1116OooO00o.OooOOoo(context, new o0000[]{OooO0Oo2}, 0);
                                            MappedByteBuffer o0000oOo2 = o0000O00.OooO00o.o0000oOo(o00oo0o.f2711OooO00o, OooO0Oo2.f1238OooO00o);
                                            if (o0000oOo2 != null && OooOOoo2 != null) {
                                                try {
                                                    o0000Ooo.OooO00o("EmojiCompat.MetadataRepo.create");
                                                    OooO0o.OooOOO0 oooOOO02 = new OooO0o.OooOOO0(OooOOoo2, o0000O00.OooO00o.o000O0oO(o0000oOo2));
                                                    o0000Ooo.OooO0O0();
                                                    o0000Ooo.OooO0O0();
                                                    synchronized (o00oo0o.f2714OooO0Oo) {
                                                        o0000O00.OooO00o oooO00o = o00oo0o.f2718OooO0oo;
                                                        if (oooO00o != null) {
                                                            oooO00o.o000Ooo(oooOOO02);
                                                        }
                                                    }
                                                    o00oo0o.OooO0O0();
                                                    return;
                                                } catch (Throwable th) {
                                                    int i3 = OooOoOO.o0000.f1201OooO00o;
                                                    o0000Ooo.OooO0O0();
                                                    throw th;
                                                }
                                            }
                                            throw new RuntimeException("Unable to open file.");
                                        }
                                        throw new RuntimeException("fetchFonts result is not OK. (" + i + ")");
                                    } catch (Throwable th2) {
                                        synchronized (o00oo0o.f2714OooO0Oo) {
                                            o0000O00.OooO00o oooO00o2 = o00oo0o.f2718OooO0oo;
                                            if (oooO00o2 != null) {
                                                oooO00o2.o000O000(th2);
                                            }
                                            o00oo0o.OooO0O0();
                                            return;
                                        }
                                    }
                                }
                                return;
                            }
                        default:
                            this.f2728OooO0O0.OooO0OO();
                            return;
                    }
                }
            });
        }
    }

    public final o0000 OooO0Oo() {
        try {
            o0ooOO0.OooOOO0 oooOOO0 = this.f2713OooO0OO;
            Context context = this.f2711OooO00o;
            androidx.appcompat.widget.o00Oo0 o00oo0 = this.f2712OooO0O0;
            oooOOO0.getClass();
            OooO0Oo.OooOOO o0OO00O2 = o0000O00.OooO00o.o0OO00O(context, o00oo0);
            if (o0OO00O2.f60OooO00o == 0) {
                o0000[] o0000VarArr = (o0000[]) o0OO00O2.f61OooO0O0;
                if (o0000VarArr != null && o0000VarArr.length != 0) {
                    return o0000VarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException("fetchFonts failed (" + o0OO00O2.f60OooO00o + ")");
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}