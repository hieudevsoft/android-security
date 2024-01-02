package OooOooo;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final WeakReference f1268OooO00o;

    public o0(View view) {
        this.f1268OooO00o = new WeakReference(view);
    }

    public final void OooO00o(float f) {
        View view = (View) this.f1268OooO00o.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void OooO0O0() {
        View view = (View) this.f1268OooO00o.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void OooO0OO(long j) {
        View view = (View) this.f1268OooO00o.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void OooO0Oo(o0O00000 o0o00000) {
        View view = (View) this.f1268OooO00o.get();
        if (view != null) {
            if (o0o00000 != null) {
                view.animate().setListener(new o0oOOo(this, o0o00000, view, 0));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void OooO0o0(float f) {
        View view = (View) this.f1268OooO00o.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}