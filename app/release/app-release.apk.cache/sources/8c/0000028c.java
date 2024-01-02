package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class OooO0OO implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2116OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2117OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f2118OooO0OO;

    public OooO0OO(ActionBarContextView actionBarContextView, OooO0o.OooO0OO oooO0OO) {
        this.f2118OooO0OO = actionBarContextView;
        this.f2117OooO0O0 = oooO0OO;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f2116OooO00o;
        Object obj = this.f2117OooO0O0;
        switch (i) {
            case 0:
                ((OooO0o.OooO0OO) obj).OooO00o();
                return;
            default:
                o0OO00OO o0oo00oo = (o0OO00OO) this.f2118OooO0OO;
                Window.Callback callback = o0oo00oo.f2499OooOO0O;
                if (callback != null && o0oo00oo.f2500OooOO0o) {
                    callback.onMenuItemSelected(0, (OooO0oO.o000O0) obj);
                    return;
                }
                return;
        }
    }

    public OooO0OO(o0OO00OO o0oo00oo) {
        this.f2118OooO0OO = o0oo00oo;
        this.f2117OooO0O0 = new OooO0oO.o000O0(o0oo00oo.f2490OooO00o.getContext(), o0oo00oo.f2497OooO0oo);
    }
}