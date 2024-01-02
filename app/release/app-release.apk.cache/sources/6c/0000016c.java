package OooOooo;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public final class o0O0o0 extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final WindowInsetsController f1356OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final OooO0Oo.o0000OO0 f1357OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Window f1358OooO0oo;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0O0o0(android.view.Window r2, OooO0Oo.o0000OO0 r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = OooOooo.o00O00O.OooOO0o(r2)
            r1.<init>(r0, r3)
            r1.f1358OooO0oo = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOooo.o0O0o0.<init>(android.view.Window, OooO0Oo.o0000OO0):void");
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo0(boolean z) {
        WindowInsetsController windowInsetsController = this.f1356OooO0o;
        Window window = this.f1358OooO0oo;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOo0O(boolean z) {
        WindowInsetsController windowInsetsController = this.f1356OooO0o;
        Window window = this.f1358OooO0oo;
        if (z) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOoO() {
        ((OooOOO0) this.f1357OooO0oO.f183OooO0O0).OooOoO0();
        this.f1356OooO0o.show(0);
    }

    public o0O0o0(WindowInsetsController windowInsetsController, OooO0Oo.o0000OO0 o0000oo02) {
        super(6, (Object) null);
        this.f1356OooO0o = windowInsetsController;
        this.f1357OooO0oO = o0000oo02;
    }
}