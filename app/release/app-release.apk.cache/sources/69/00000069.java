package OooO0oO;

import OooO0O0.OooO00o;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class o00OO extends o00O00O implements SubMenu {

    /* renamed from: OooOoO  reason: collision with root package name */
    public final o00O00O f461OooOoO;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public final o00O00OO f462OooOoOO;

    public o00OO(Context context, o00O00O o00o00o, o00O00OO o00o00oo) {
        super(context);
        this.f461OooOoO = o00o00o;
        this.f462OooOoOO = o00o00oo;
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooO0Oo(o00O00OO o00o00oo) {
        return this.f461OooOoO.OooO0Oo(o00o00oo);
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooO0o(o00O00OO o00o00oo) {
        return this.f461OooOoO.OooO0o(o00o00oo);
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooO0o0(o00O00O o00o00o, MenuItem menuItem) {
        return super.OooO0o0(o00o00o, menuItem) || this.f461OooOoO.OooO0o0(o00o00o, menuItem);
    }

    @Override // OooO0oO.o00O00O
    public final String OooOO0() {
        int i;
        o00O00OO o00o00oo = this.f462OooOoOO;
        if (o00o00oo != null) {
            i = o00o00oo.f413OooO00o;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return OooO00o.OooO0O0("android:menu:actionviewstates:", i);
    }

    @Override // OooO0oO.o00O00O
    public final o00O00O OooOO0O() {
        return this.f461OooOoO.OooOO0O();
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooOOO() {
        return this.f461OooOoO.OooOOO();
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooOOO0() {
        return this.f461OooOoO.OooOOO0();
    }

    @Override // OooO0oO.o00O00O
    public final boolean OooOOOO() {
        return this.f461OooOoO.OooOOOO();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f462OooOoOO;
    }

    @Override // OooO0oO.o00O00O, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.f461OooOoO.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        OooOo0(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        OooOo0(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        OooOo0(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f462OooOoOO.setIcon(i);
        return this;
    }

    @Override // OooO0oO.o00O00O, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f461OooOoO.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        OooOo0(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        OooOo0(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f462OooOoOO.setIcon(drawable);
        return this;
    }
}