package OooOooo;

import android.view.View;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public abstract class oo0O {
    public static int OooO00o(View view) {
        return view.getImportantForContentCapture();
    }

    public static CharSequence OooO0O0(View view) {
        return view.getStateDescription();
    }

    public static o0oOo0O0 OooO0OO(View view) {
        WindowInsetsController windowInsetsController = view.getWindowInsetsController();
        if (windowInsetsController != null) {
            return new o0oOo0O0(windowInsetsController);
        }
        return null;
    }

    public static boolean OooO0Oo(View view) {
        return view.isImportantForContentCapture();
    }

    public static void OooO0o(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }

    public static void OooO0o0(View view, int i) {
        view.setImportantForContentCapture(i);
    }
}