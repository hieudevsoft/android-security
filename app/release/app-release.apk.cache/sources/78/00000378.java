package androidx.fragment.app;

import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O0O00 implements View.OnAttachStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3003OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0000OO0 f3004OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f3005OooO0OO;

    public o0O0O00(o000OOo o000ooo, o0000OO0 o0000oo02) {
        this.f3005OooO0OO = o000ooo;
        this.f3004OooO0O0 = o0000oo02;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f3003OooO00o;
        Object obj = this.f3005OooO0OO;
        switch (i) {
            case 0:
                o0000OO0 o0000oo02 = this.f3004OooO0O0;
                o00Oo0 o00oo0 = o0000oo02.f2858OooO0OO;
                o0000oo02.OooOO0O();
                o00O000.OooO0o((ViewGroup) o00oo0.f2979OooOooo.getParent(), ((o000OOo) obj).f2929OooO00o.OooOooO()).OooO0o0();
                return;
            default:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0OO.OooO0OO(view2);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    public o0O0O00(o0000OO0 o0000oo02, View view) {
        this.f3004OooO0O0 = o0000oo02;
        this.f3005OooO0OO = view;
    }
}