package OooO0oO;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class o00O0O0 implements MenuItem.OnMenuItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f442OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00O0O0O f443OooO0O0;

    public o00O0O0(o00O0O0O o00o0o0o, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f443OooO0O0 = o00o0o0o;
        this.f442OooO00o = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f442OooO00o.onMenuItemClick(this.f443OooO0O0.OooOOO(menuItem));
    }
}