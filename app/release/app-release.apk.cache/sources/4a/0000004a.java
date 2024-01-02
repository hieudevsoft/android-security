package OooO0o;

import OooOooo.o0;
import OooOooo.o0O00000;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Interpolator f314OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0O00000 f315OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f317OooO0o0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f313OooO0O0 = -1;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Oooo000 f316OooO0o = new Oooo000(this);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f312OooO00o = new ArrayList();

    public final void OooO00o() {
        if (this.f317OooO0o0) {
            Iterator it = this.f312OooO00o.iterator();
            while (it.hasNext()) {
                ((o0) it.next()).OooO0O0();
            }
            this.f317OooO0o0 = false;
        }
    }

    public final void OooO0O0() {
        View view;
        if (this.f317OooO0o0) {
            return;
        }
        Iterator it = this.f312OooO00o.iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            long j = this.f313OooO0O0;
            if (j >= 0) {
                o0Var.OooO0OO(j);
            }
            Interpolator interpolator = this.f314OooO0OO;
            if (interpolator != null && (view = (View) o0Var.f1268OooO00o.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f315OooO0Oo != null) {
                o0Var.OooO0Oo(this.f316OooO0o);
            }
            View view2 = (View) o0Var.f1268OooO00o.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f317OooO0o0 = true;
    }
}