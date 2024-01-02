package OooO0oO;

import OooO0Oo.o0000OO0;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public final class oo00o extends o00O00o0 implements ActionProvider.VisibilityListener {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0000OO0 f475OooO0OO;

    @Override // OooO0oO.o00O00o0
    public final boolean OooO00o() {
        return this.f440OooO00o.isVisible();
    }

    @Override // OooO0oO.o00O00o0
    public final View OooO0O0(MenuItem menuItem) {
        return this.f440OooO00o.onCreateActionView(menuItem);
    }

    @Override // OooO0oO.o00O00o0
    public final boolean OooO0OO() {
        return this.f440OooO00o.overridesItemVisibility();
    }

    @Override // OooO0oO.o00O00o0
    public final void OooO0Oo(o0000OO0 o0000oo02) {
        this.f475OooO0OO = o0000oo02;
        this.f440OooO00o.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        o0000OO0 o0000oo02 = this.f475OooO0OO;
        if (o0000oo02 != null) {
            o00O00O o00o00o = ((o00O00OO) o0000oo02.f183OooO0O0).f424OooOOO;
            o00o00o.f397OooO0oo = true;
            o00o00o.OooOOOo(true);
        }
    }
}