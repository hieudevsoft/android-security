package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class OooOo implements Executor, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Runnable f1930OooO0O0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f1932OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final long f1929OooO00o = SystemClock.uptimeMillis() + 10000;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1931OooO0OO = false;

    public OooOo(androidx.fragment.app.o0ooOOo o0ooooo) {
        this.f1932OooO0Oo = o0ooooo;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f1930OooO0O0 = runnable;
        View decorView = this.f1932OooO0Oo.getWindow().getDecorView();
        if (!this.f1931OooO0OO) {
            decorView.postOnAnimation(new OooO0o(1, this));
        } else if (Looper.myLooper() == Looper.getMainLooper()) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f1930OooO0O0;
        if (runnable != null) {
            runnable.run();
            this.f1930OooO0O0 = null;
            o000oOoO o000oooo = this.f1932OooO0Oo.f1937OooO;
            synchronized (o000oooo.f1950OooO00o) {
                z = o000oooo.f1951OooO0O0;
            }
            if (!z) {
                return;
            }
        } else if (SystemClock.uptimeMillis() <= this.f1929OooO00o) {
            return;
        }
        this.f1931OooO0OO = false;
        this.f1932OooO0Oo.getWindow().getDecorView().post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1932OooO0Oo.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}