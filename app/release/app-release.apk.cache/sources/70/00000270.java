package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class oo000o implements OnBackAnimationCallback {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooOo f1971OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooOo f1972OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO00o f1973OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o0000O0O.OooO00o f1974OooO0Oo;

    public oo000o(o0000O0O.OooOo oooOo, o0000O0O.OooOo oooOo2, o0000O0O.OooO00o oooO00o, o0000O0O.OooO00o oooO00o2) {
        this.f1971OooO00o = oooOo;
        this.f1972OooO0O0 = oooOo2;
        this.f1973OooO0OO = oooO00o;
        this.f1974OooO0Oo = oooO00o2;
    }

    public final void onBackCancelled() {
        this.f1974OooO0Oo.OooO00o();
    }

    public final void onBackInvoked() {
        this.f1973OooO0OO.OooO00o();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        o0000O00.OooO00o.OooOoo0(backEvent, "backEvent");
        this.f1972OooO0O0.OooO0O0(new OooO0O0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        o0000O00.OooO00o.OooOoo0(backEvent, "backEvent");
        this.f1971OooO00o.OooO0O0(new OooO0O0(backEvent));
    }
}