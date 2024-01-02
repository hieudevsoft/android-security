package OooOooo;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class o0O0o000 extends oo0OOoo {
    @Override // o0ooOO0.OooOOO0
    public final void OooOo0O(boolean z) {
        if (z) {
            Window window = this.f1379OooO0o;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        OooOoOO(8192);
    }
}