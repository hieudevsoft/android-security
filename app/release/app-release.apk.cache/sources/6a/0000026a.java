package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class o00oO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o00oO0o f1958OooO00o = new o00oO0o();

    public final OnBackInvokedCallback OooO00o(o0000O0O.OooOo oooOo, o0000O0O.OooOo oooOo2, o0000O0O.OooO00o oooO00o, o0000O0O.OooO00o oooO00o2) {
        o0000O00.OooO00o.OooOoo0(oooOo, "onBackStarted");
        o0000O00.OooO00o.OooOoo0(oooOo2, "onBackProgressed");
        o0000O00.OooO00o.OooOoo0(oooO00o, "onBackInvoked");
        o0000O00.OooO00o.OooOoo0(oooO00o2, "onBackCancelled");
        return new oo000o(oooOo, oooOo2, oooO00o, oooO00o2);
    }
}