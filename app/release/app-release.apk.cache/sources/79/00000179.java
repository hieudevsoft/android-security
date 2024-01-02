package OooOooo;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class oOO00O extends o00O00 {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final View f1375OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final WindowInsetsController f1376OooO0oo;

    public oOO00O(View view) {
        super(view);
        this.f1375OooO0oO = view;
    }

    @Override // OooOooo.o00O00, o0ooOO0.OooOOO0
    public final void OooOoO0() {
        int ime;
        View view = this.f1375OooO0oO;
        if (view != null && Build.VERSION.SDK_INT < 33) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
        }
        WindowInsetsController windowInsetsController = this.f1376OooO0oo;
        if (windowInsetsController == null) {
            windowInsetsController = view != null ? view.getWindowInsetsController() : null;
        }
        if (windowInsetsController == null) {
            super.OooOoO0();
            return;
        }
        ime = WindowInsets.Type.ime();
        windowInsetsController.show(ime);
    }

    public oOO00O(WindowInsetsController windowInsetsController) {
        super(null);
        this.f1376OooO0oo = windowInsetsController;
    }
}