package androidx.lifecycle;

import android.app.Activity;

/* loaded from: classes.dex */
public final class o000OOo extends OooOO0 {
    final /* synthetic */ o00000 this$0;

    public o000OOo(o00000 o00000Var) {
        this.this$0 = o00000Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        this.this$0.OooO00o();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        o0000O00.OooO00o.OooOoo0(activity, "activity");
        o00000 o00000Var = this.this$0;
        int i = o00000Var.f3069OooO00o + 1;
        o00000Var.f3069OooO00o = i;
        if (i == 1 && o00000Var.f3072OooO0Oo) {
            o00000Var.f3073OooO0o.OooO0o0(OooOo.ON_START);
            o00000Var.f3072OooO0Oo = false;
        }
    }
}