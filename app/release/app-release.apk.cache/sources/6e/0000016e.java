package OooOooo;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class o0O0o00O extends o0O0o000 {
    @Override // o0ooOO0.OooOOO0
    public final void OooOo0(boolean z) {
        if (z) {
            Window window = this.f1379OooO0o;
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
            return;
        }
        OooOoOO(16);
    }
}