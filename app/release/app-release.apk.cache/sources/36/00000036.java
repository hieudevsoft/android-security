package OooO0Oo;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o0O0O00 {
    public static OnBackInvokedDispatcher OooO00o(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.window.OnBackInvokedCallback, OooO0Oo.oo0o0Oo] */
    public static OnBackInvokedCallback OooO0O0(Object obj, final o00000OO o00000oo2) {
        Objects.requireNonNull(o00000oo2);
        ?? r0 = new OnBackInvokedCallback() { // from class: OooO0Oo.oo0o0Oo
            public final void onBackInvoked() {
                o00000OO.this.OooOooO();
            }
        };
        o0OO00O.OooO0o0(obj).registerOnBackInvokedCallback(1000000, r0);
        return r0;
    }

    public static void OooO0OO(Object obj, Object obj2) {
        o0OO00O.OooO0o0(obj).unregisterOnBackInvokedCallback(o0OO00O.OooO0O0(obj2));
    }
}