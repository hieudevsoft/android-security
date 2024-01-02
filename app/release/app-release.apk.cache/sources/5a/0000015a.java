package OooOooo;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class o0O0000O {
    public static void OooO00o(Window window, boolean z) {
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }
}