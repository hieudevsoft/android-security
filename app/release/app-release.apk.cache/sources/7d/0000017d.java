package OooOooo;

import android.view.View;
import android.view.Window;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public abstract class oo0OOoo extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Window f1379OooO0o;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final OooO0Oo.o0000OO0 f1380OooO0oO;

    public oo0OOoo(Window window, OooO0Oo.o0000OO0 o0000oo02) {
        super(6, (Object) null);
        this.f1379OooO0o = window;
        this.f1380OooO0oO = o0000oo02;
    }

    @Override // o0ooOO0.OooOOO0
    public final void OooOoO() {
        for (int i = 1; i <= 256; i <<= 1) {
            if ((8 & i) != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 8) {
                            ((OooOOO0) this.f1380OooO0oO.f183OooO0O0).OooOoO0();
                        }
                    } else {
                        OooOoOO(2);
                    }
                } else {
                    OooOoOO(4);
                    this.f1379OooO0o.clearFlags(1024);
                }
            }
        }
    }

    public final void OooOoOO(int i) {
        View decorView = this.f1379OooO0o.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}