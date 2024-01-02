package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;

/* loaded from: classes.dex */
public final class o000000 extends OooOO0 {
    final /* synthetic */ o00000 this$0;

    public o000000(o00000 o00000Var) {
        this.this$0 = o00000Var;
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i = o00000OO.f3078OooO0O0;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            o0000O00.OooO00o.OooOoO0(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((o00000OO) findFragmentByTag).f3079OooO00o = this.this$0.f3076OooO0oo;
        }
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o00000 o00000Var = this.this$0;
        int i = o00000Var.f3070OooO0O0 - 1;
        o00000Var.f3070OooO0O0 = i;
        if (i == 0) {
            Handler handler = o00000Var.f3074OooO0o0;
            o0000O00.OooO00o.OooOo(handler);
            handler.postDelayed(o00000Var.f3075OooO0oO, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o0O0O00.OooO00o(activity, new o000OOo(this.this$0));
    }

    @Override // androidx.lifecycle.OooOO0, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o00000 o00000Var = this.this$0;
        int i = o00000Var.f3069OooO00o - 1;
        o00000Var.f3069OooO00o = i;
        if (i == 0 && o00000Var.f3071OooO0OO) {
            o00000Var.f3073OooO0o.OooO0o0(OooOo.ON_STOP);
            o00000Var.f3072OooO0Oo = true;
        }
    }
}