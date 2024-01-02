package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0OOO0o implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3012OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f3013OooO0O0;

    public /* synthetic */ o0OOO0o(int i, Object obj) {
        this.f3012OooO00o = i;
        this.f3013OooO0O0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.f3012OooO00o;
        Object obj = this.f3013OooO0O0;
        switch (i) {
            case 0:
                OooO0o oooO0o = (OooO0o) obj;
                Object obj2 = oooO0o.f2777OooO0OO;
                o0OoOo0 o0oooo0 = ((o00Oo0) obj2).f2984Oooo00o;
                if (o0oooo0 == null) {
                    view = null;
                } else {
                    view = o0oooo0.f3020OooO00o;
                }
                if (view != null) {
                    ((o00Oo0) obj2).OooO0o().f3020OooO00o = null;
                    ((o000000O) oooO0o.f2778OooO0Oo).OooO0OO((o00Oo0) oooO0o.f2777OooO0OO, (OooOoOO.o000000) oooO0o.f2779OooO0o0);
                    return;
                }
                return;
            case 1:
                OooO0o oooO0o2 = (OooO0o) obj;
                oooO0o2.f2776OooO0O0.endViewTransition((View) oooO0o2.f2777OooO0OO);
                ((OooOO0O) oooO0o2.f2778OooO0Oo).OooO0O0();
                return;
            case 2:
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.f2806o000oOoO.onDismiss(oooo0.f2802OooooO0);
                return;
            case 3:
                ((o0000oo) obj).OooOo(true);
                return;
            default:
                o000Oo0.OooO0O0((ArrayList) obj, 4);
                return;
        }
    }
}