package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class o00OO0O0 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2350OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00OO0OO f2351OooO0O0;

    public /* synthetic */ o00OO0O0(o00OO0OO o00oo0oo, int i) {
        this.f2350OooO00o = i;
        this.f2351OooO0O0 = o00oo0oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2350OooO00o;
        o00OO0OO o00oo0oo = this.f2351OooO0O0;
        switch (i) {
            case 0:
                ViewParent parent = o00oo0oo.f2356OooO0Oo.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                o00oo0oo.OooO00o();
                View view = o00oo0oo.f2356OooO0Oo;
                if (view.isEnabled() && !view.isLongClickable() && o00oo0oo.OooO0OO()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    o00oo0oo.f2359OooO0oO = true;
                    return;
                }
                return;
        }
    }
}