package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class o00000O implements Application.ActivityLifecycleCallbacks {
    public static final o00000O0 Companion = new o00000O0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new o00000O());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        int i = o00000OO.f3078OooO0O0;
        o0ooOO0.OooOOO0.OooO0o(activity, OooOo.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o0000O00.OooO00o.OooOoo0(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
    }
}