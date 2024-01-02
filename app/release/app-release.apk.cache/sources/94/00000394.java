package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements OoooOo0.o000OO {
    @Override // OoooOo0.o000OO
    public final List OooO00o() {
        return o0000.o0OoOo0.f3970OooO00o;
    }

    @Override // OoooOo0.o000OO
    public final Object OooO0O0(Context context) {
        o0000O00.OooO00o.OooOoo0(context, "context");
        OoooOo0.o0000O0O OooO0OO2 = OoooOo0.o0000O0O.OooO0OO(context);
        o0000O00.OooO00o.OooOoOO(OooO0OO2, "getInstance(context)");
        if (OooO0OO2.f1597OooO0O0.contains(ProcessLifecycleInitializer.class)) {
            if (!o0OoOo0.f3112OooO00o.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                o0000O00.OooO00o.OooOoO0(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new o000oOoO());
            }
            o00000 o00000Var = o00000.f3068OooO;
            o00000Var.getClass();
            o00000Var.f3074OooO0o0 = new Handler();
            o00000Var.f3073OooO0o.OooO0o0(OooOo.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            o0000O00.OooO00o.OooOoO0(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new o000000(o00000Var));
            return o00000Var;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}