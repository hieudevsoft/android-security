package OooOo0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class Oooo0 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Object f1133OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Activity f1134OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1135OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f1136OooO0Oo = false;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f1138OooO0o0 = false;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1137OooO0o = false;

    public Oooo0(Activity activity) {
        this.f1134OooO0O0 = activity;
        this.f1135OooO0OO = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f1134OooO0O0 == activity) {
            this.f1134OooO0O0 = null;
            this.f1138OooO0o0 = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityPaused(android.app.Activity r6) {
        /*
            r5 = this;
            boolean r0 = r5.f1138OooO0o0
            if (r0 == 0) goto L3b
            boolean r0 = r5.f1137OooO0o
            if (r0 != 0) goto L3b
            boolean r0 = r5.f1136OooO0Oo
            if (r0 != 0) goto L3b
            java.lang.Object r0 = r5.f1133OooO00o
            r1 = 1
            java.lang.reflect.Field r2 = OooOo0.o000oOoO.f1142OooO0OO     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L33
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
            int r3 = r5.f1135OooO0OO
            if (r0 == r3) goto L20
            goto L33
        L20:
            java.lang.reflect.Field r0 = OooOo0.o000oOoO.f1141OooO0O0     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
            android.os.Handler r0 = OooOo0.o000oOoO.f1146OooO0oO     // Catch: java.lang.Throwable -> L33
            androidx.appcompat.widget.OooOOOO r3 = new androidx.appcompat.widget.OooOOOO     // Catch: java.lang.Throwable -> L33
            r4 = 3
            r3.<init>(r6, r4, r2)     // Catch: java.lang.Throwable -> L33
            r0.postAtFrontOfQueue(r3)     // Catch: java.lang.Throwable -> L33
            r6 = r1
            goto L34
        L33:
            r6 = 0
        L34:
            if (r6 == 0) goto L3b
            r5.f1137OooO0o = r1
            r6 = 0
            r5.f1133OooO00o = r6
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo0.Oooo0.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f1134OooO0O0 == activity) {
            this.f1136OooO0Oo = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}