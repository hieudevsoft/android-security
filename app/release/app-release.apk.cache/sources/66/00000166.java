package OooOooo;

import OooOo.OooO0OO;
import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class o0O0O0Oo extends o0O0oo0o {

    /* renamed from: OooOOO  reason: collision with root package name */
    public OooO0OO f1348OooOOO;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public OooO0OO f1349OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public OooO0OO f1350OooOOOo;

    public o0O0O0Oo(o0O0OOOo o0o0oooo, WindowInsets windowInsets) {
        super(o0o0oooo, windowInsets);
        this.f1348OooOOO = null;
        this.f1349OooOOOO = null;
        this.f1350OooOOOo = null;
    }

    @Override // OooOooo.o0O0OO0
    public OooO0OO OooO() {
        Insets systemGestureInsets;
        if (this.f1348OooOOO == null) {
            systemGestureInsets = this.f1343OooO0OO.getSystemGestureInsets();
            this.f1348OooOOO = OooO0OO.OooO0OO(systemGestureInsets);
        }
        return this.f1348OooOOO;
    }

    @Override // OooOooo.o0O0OO0
    public OooO0OO OooO0oO() {
        Insets mandatorySystemGestureInsets;
        if (this.f1349OooOOOO == null) {
            mandatorySystemGestureInsets = this.f1343OooO0OO.getMandatorySystemGestureInsets();
            this.f1349OooOOOO = OooO0OO.OooO0OO(mandatorySystemGestureInsets);
        }
        return this.f1349OooOOOO;
    }

    @Override // OooOooo.o0O0OO0
    public OooO0OO OooOO0O() {
        Insets tappableElementInsets;
        if (this.f1350OooOOOo == null) {
            tappableElementInsets = this.f1343OooO0OO.getTappableElementInsets();
            this.f1350OooOOOo = OooO0OO.OooO0OO(tappableElementInsets);
        }
        return this.f1350OooOOOo;
    }

    @Override // OooOooo.o0O0O0O, OooOooo.o0O0OO0
    public o0O0OOOo OooOO0o(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f1343OooO0OO.inset(i, i2, i3, i4);
        return o0O0OOOo.OooO0oo(null, inset);
    }

    @Override // OooOooo.o0oO0O0o, OooOooo.o0O0OO0
    public void OooOOo0(OooO0OO oooO0OO) {
    }
}