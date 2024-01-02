package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements OnBackInvokedCallback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1955OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1956OooO0O0;

    public /* synthetic */ o00Oo0(int i, Object obj) {
        this.f1955OooO00o = i;
        this.f1956OooO0O0 = obj;
    }

    public final void onBackInvoked() {
        switch (this.f1955OooO00o) {
            case 0:
                o0000O0O.OooO00o oooO00o = (o0000O0O.OooO00o) this.f1956OooO0O0;
                o0000O00.OooO00o.OooOoo0(oooO00o, "$onBackInvoked");
                oooO00o.OooO00o();
                return;
            default:
                ((Runnable) this.f1956OooO0O0).run();
                return;
        }
    }
}