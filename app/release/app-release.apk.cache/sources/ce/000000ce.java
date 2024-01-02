package OooOOoo;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class o0ooOOo implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1105OooO00o;

    public o0ooOOo(CoordinatorLayout coordinatorLayout) {
        this.f1105OooO00o = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f1105OooO00o.OooOOOO(0);
        return true;
    }
}