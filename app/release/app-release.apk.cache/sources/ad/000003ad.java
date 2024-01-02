package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;

/* loaded from: classes.dex */
public abstract class o0O0O00 {
    public static final void OooO00o(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o0000O00.OooO00o.OooOoo0(activityLifecycleCallbacks, "callback");
        activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
    }
}