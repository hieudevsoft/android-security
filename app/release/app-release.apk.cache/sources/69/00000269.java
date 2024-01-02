package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class o00Ooo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o00Ooo f1957OooO00o = new o00Ooo();

    public final OnBackInvokedCallback OooO00o(o0000O0O.OooO00o oooO00o) {
        o0000O00.OooO00o.OooOoo0(oooO00o, "onBackInvoked");
        return new o00Oo0(0, oooO00o);
    }

    public final void OooO0O0(Object obj, int i, Object obj2) {
        o0000O00.OooO00o.OooOoo0(obj, "dispatcher");
        o0000O00.OooO00o.OooOoo0(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) obj2);
    }

    public final void OooO0OO(Object obj, Object obj2) {
        o0000O00.OooO00o.OooOoo0(obj, "dispatcher");
        o0000O00.OooO00o.OooOoo0(obj2, "callback");
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}