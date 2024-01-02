package OooOooo;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class o00O0OO {
    public static WindowInsets OooO00o(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets OooO0O0(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static void OooO0OO(View view) {
        view.requestApplyInsets();
    }
}