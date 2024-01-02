package OooO0oO;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class o00O0O00 implements MenuItem.OnActionExpandListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f444OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00O0O0O f445OooO0O0;

    public o00O0O00(o00O0O0O o00o0o0o, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f445OooO0O0 = o00o0o0o;
        this.f444OooO00o = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f444OooO00o.onMenuItemActionCollapse(this.f445OooO0O0.OooOOO(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f444OooO00o.onMenuItemActionExpand(this.f445OooO0O0.OooOOO(menuItem));
    }
}