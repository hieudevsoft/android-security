package OooOooo;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o0oOo0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f1374OooO00o;

    public o0oOo0O0(Window window, View view) {
        OooO0Oo.o0000OO0 o0000oo02 = new OooO0Oo.o0000OO0(view, 12);
        int i = Build.VERSION.SDK_INT;
        this.f1374OooO00o = i >= 30 ? new o0O0o0(window, o0000oo02) : i >= 26 ? new o0O0o00O(window, o0000oo02) : new o0O0o000(window, o0000oo02);
    }

    public o0oOo0O0(WindowInsetsController windowInsetsController) {
        this.f1374OooO00o = new o0O0o0(windowInsetsController, new OooO0Oo.o0000OO0(windowInsetsController));
    }
}