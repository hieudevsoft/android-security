package OooO0oO;

import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.OooOOO;
import androidx.appcompat.widget.OooOOO0;

/* loaded from: classes.dex */
public final class o000O0Oo extends androidx.appcompat.widget.o00OO0OO {

    /* renamed from: OooOO0  reason: collision with root package name */
    public final /* synthetic */ ActionMenuItemView f348OooOO0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f348OooOO0 = actionMenuItemView;
    }

    @Override // androidx.appcompat.widget.o00OO0OO
    public final o00OO0OO OooO0O0() {
        OooOOO0 oooOOO0;
        o000OO0O o000oo0o = this.f348OooOO0.OooOOO0;
        if (o000oo0o == null || (oooOOO0 = ((OooOOO) o000oo0o).f2121OooO00o.f2149OooOo00) == null) {
            return null;
        }
        return oooOOO0.OooO00o();
    }

    @Override // androidx.appcompat.widget.o00OO0OO
    public final boolean OooO0OO() {
        o00OO0OO OooO0O02;
        ActionMenuItemView actionMenuItemView = this.f348OooOO0;
        o00O00 o00o00 = actionMenuItemView.f1990OooOO0O;
        return o00o00 != null && o00o00.OooO0O0(actionMenuItemView.f1988OooO0oo) && (OooO0O02 = OooO0O0()) != null && OooO0O02.OooO0O0();
    }
}