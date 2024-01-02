package OooOooo;

import OooOo.OooO0OO;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0oO0O0o extends o0O0O0O {
    public OooO0OO OooOOO0;

    public o0oO0O0o(o0O0OOOo o0o0oooo, WindowInsets windowInsets) {
        super(o0o0oooo, windowInsets);
        this.OooOOO0 = null;
    }

    @Override // OooOooo.o0O0OO0
    public o0O0OOOo OooO0O0() {
        return o0O0OOOo.OooO0oo(null, this.f1343OooO0OO.consumeStableInsets());
    }

    @Override // OooOooo.o0O0OO0
    public o0O0OOOo OooO0OO() {
        return o0O0OOOo.OooO0oo(null, this.f1343OooO0OO.consumeSystemWindowInsets());
    }

    @Override // OooOooo.o0O0OO0
    public final OooO0OO OooO0oo() {
        if (this.OooOOO0 == null) {
            WindowInsets windowInsets = this.f1343OooO0OO;
            this.OooOOO0 = OooO0OO.OooO0O0(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.OooOOO0;
    }

    @Override // OooOooo.o0O0OO0
    public boolean OooOOO0() {
        return this.f1343OooO0OO.isConsumed();
    }

    @Override // OooOooo.o0O0OO0
    public void OooOOo0(OooO0OO oooO0OO) {
        this.OooOOO0 = oooO0OO;
    }
}