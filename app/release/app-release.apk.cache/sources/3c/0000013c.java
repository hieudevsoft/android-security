package OooOooo;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class o00O {
    public static o0O0OOOo OooO00o(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(null, rootWindowInsets);
        o0O0OO0 o0o0oo0 = OooO0oo2.f1355OooO00o;
        o0o0oo0.OooOOOo(OooO0oo2);
        o0o0oo0.OooO0Oo(view.getRootView());
        return OooO0oo2;
    }

    public static int OooO0O0(View view) {
        return view.getScrollIndicators();
    }

    public static void OooO0OO(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void OooO0Oo(View view, int i, int i2) {
        view.setScrollIndicators(i, i2);
    }
}