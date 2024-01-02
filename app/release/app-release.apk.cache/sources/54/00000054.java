package OooO0oO;

import OooOo0.Oooo000;
import OooOo0O.o00Ooo;
import OooOoO.o000oOoO;
import OooOoO0.o0OOO0o;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class o000O0 implements o000oOoO {

    /* renamed from: OooO  reason: collision with root package name */
    public final Context f330OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public CharSequence f331OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public CharSequence f332OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Intent f333OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public char f334OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public char f335OooO0o;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public Drawable f338OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public CharSequence f339OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public CharSequence f340OooOO0O;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f336OooO0o0 = 4096;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f337OooO0oO = 4096;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public ColorStateList f341OooOO0o = null;
    public PorterDuff.Mode OooOOO0 = null;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f342OooOOO = false;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f343OooOOOO = false;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f344OooOOOo = 16;

    public o000O0(Context context, CharSequence charSequence) {
        this.f330OooO = context;
        this.f331OooO00o = charSequence;
    }

    @Override // OooOoO.o000oOoO
    public final o00O00o0 OooO00o() {
        return null;
    }

    @Override // OooOoO.o000oOoO
    public final o000oOoO OooO0O0(o00O00o0 o00o00o0) {
        throw new UnsupportedOperationException();
    }

    public final void OooO0OO() {
        Drawable drawable = this.f338OooO0oo;
        if (drawable != null) {
            if (this.f342OooOOO || this.f343OooOOOO) {
                this.f338OooO0oo = drawable;
                Drawable mutate = drawable.mutate();
                this.f338OooO0oo = mutate;
                if (this.f342OooOOO) {
                    o0OOO0o.OooO0oo(mutate, this.f341OooOO0o);
                }
                if (this.f343OooOOOO) {
                    o0OOO0o.OooO(this.f338OooO0oo, this.OooOOO0);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f337OooO0oO;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f335OooO0o;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f339OooOO0;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f338OooO0oo;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f341OooOO0o;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.OooOOO0;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f333OooO0OO;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return 16908332;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f336OooO0o0;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f334OooO0Oo;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f331OooO00o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f332OooO0O0;
        return charSequence != null ? charSequence : this.f331OooO00o;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f340OooOO0O;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f344OooOOOo & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f344OooOOOo & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f344OooOOOo & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f344OooOOOo & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f335OooO0o = Character.toLowerCase(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f344OooOOOo = (z ? 1 : 0) | (this.f344OooOOOo & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f344OooOOOo = (z ? 2 : 0) | (this.f344OooOOOo & (-3));
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final o000oOoO setContentDescription(CharSequence charSequence) {
        this.f339OooOO0 = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f344OooOOOo = (z ? 16 : 0) | (this.f344OooOOOo & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        Object obj = Oooo000.f1139OooO00o;
        this.f338OooO0oo = o00Ooo.OooO0O0(this.f330OooO, i);
        OooO0OO();
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f341OooOO0o = colorStateList;
        this.f342OooOOO = true;
        OooO0OO();
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.OooOOO0 = mode;
        this.f343OooOOOO = true;
        OooO0OO();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f333OooO0OO = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f334OooO0Oo = c;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f334OooO0Oo = c;
        this.f335OooO0o = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f331OooO00o = this.f330OooO.getResources().getString(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f332OooO0O0 = charSequence;
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final o000oOoO setTooltipText(CharSequence charSequence) {
        this.f340OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        this.f344OooOOOo = (this.f344OooOOOo & 8) | (z ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f335OooO0o = Character.toLowerCase(c);
        this.f337OooO0oO = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f339OooOO0 = charSequence;
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f334OooO0Oo = c;
        this.f336OooO0o0 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // OooOoO.o000oOoO, android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f334OooO0Oo = c;
        this.f336OooO0o0 = KeyEvent.normalizeMetaState(i);
        this.f335OooO0o = Character.toLowerCase(c2);
        this.f337OooO0oO = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f331OooO00o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f340OooOO0O = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f338OooO0oo = drawable;
        OooO0OO();
        return this;
    }
}