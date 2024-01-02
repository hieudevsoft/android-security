package OooOooo;

import OooOo.OooO0OO;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class o0O0O0o0 extends o0O0O0Oo {

    /* renamed from: OooOOo0  reason: collision with root package name */
    public static final o0O0OOOo f1351OooOOo0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f1351OooOOo0 = o0O0OOOo.OooO0oo(null, windowInsets);
    }

    public o0O0O0o0(o0O0OOOo o0o0oooo, WindowInsets windowInsets) {
        super(o0o0oooo, windowInsets);
    }

    @Override // OooOooo.o0O0O0O, OooOooo.o0O0OO0
    public final void OooO0Oo(View view) {
    }

    @Override // OooOooo.o0O0O0O, OooOooo.o0O0OO0
    public OooO0OO OooO0o(int i) {
        Insets insets;
        insets = this.f1343OooO0OO.getInsets(o0O0OOO0.OooO00o(i));
        return OooO0OO.OooO0OO(insets);
    }
}