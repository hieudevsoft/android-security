package OooOooo;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class o00O000o implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f1294OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ViewTreeObserver f1295OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Runnable f1296OooO0OO;

    public o00O000o(View view, Runnable runnable) {
        this.f1294OooO00o = view;
        this.f1295OooO0O0 = view.getViewTreeObserver();
        this.f1296OooO0OO = runnable;
    }

    public static void OooO00o(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        o00O000o o00o000o = new o00O000o(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(o00o000o);
        view.addOnAttachStateChangeListener(o00o000o);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f1295OooO0O0.isAlive();
        View view = this.f1294OooO00o;
        if (isAlive) {
            viewTreeObserver = this.f1295OooO0O0;
        } else {
            viewTreeObserver = view.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
        this.f1296OooO0OO.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1295OooO0O0 = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive = this.f1295OooO0O0.isAlive();
        View view2 = this.f1294OooO00o;
        if (isAlive) {
            viewTreeObserver = this.f1295OooO0O0;
        } else {
            viewTreeObserver = view2.getViewTreeObserver();
        }
        viewTreeObserver.removeOnPreDrawListener(this);
        view2.removeOnAttachStateChangeListener(this);
    }
}