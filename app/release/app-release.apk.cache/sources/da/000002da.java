package androidx.appcompat.widget;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o0O {
    public static OnBackInvokedDispatcher OooO00o(View view) {
        return view.findOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback OooO0O0(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new androidx.activity.o00Oo0(1, runnable);
    }

    public static void OooO0OO(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
    }

    public static void OooO0Oo(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}