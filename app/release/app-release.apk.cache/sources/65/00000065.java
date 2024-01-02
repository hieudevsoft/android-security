package OooO0oO;

import OooOoO.o000oOoO;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o00O0O0O extends o000O0O0 implements MenuItem {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o000oOoO f446OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Method f447OooO0o0;

    public o00O0O0O(Context context, o000oOoO o000oooo) {
        super(context);
        if (o000oooo == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f446OooO0Oo = o000oooo;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return this.f446OooO0Oo.collapseActionView();
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return this.f446OooO0Oo.expandActionView();
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        o00O00o0 OooO00o2 = this.f446OooO0Oo.OooO00o();
        if (OooO00o2 instanceof o00O00o0) {
            return OooO00o2.f440OooO00o;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View actionView = this.f446OooO0Oo.getActionView();
        if (actionView instanceof o00O0) {
            return (View) ((o00O0) actionView).f356OooO00o;
        }
        return actionView;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f446OooO0Oo.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f446OooO0Oo.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f446OooO0Oo.getContentDescription();
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f446OooO0Oo.getGroupId();
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f446OooO0Oo.getIcon();
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f446OooO0Oo.getIconTintList();
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f446OooO0Oo.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f446OooO0Oo.getIntent();
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f446OooO0Oo.getItemId();
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f446OooO0Oo.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f446OooO0Oo.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f446OooO0Oo.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f446OooO0Oo.getOrder();
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f446OooO0Oo.getSubMenu();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f446OooO0Oo.getTitle();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        return this.f446OooO0Oo.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f446OooO0Oo.getTooltipText();
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f446OooO0Oo.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f446OooO0Oo.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return this.f446OooO0Oo.isCheckable();
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return this.f446OooO0Oo.isChecked();
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return this.f446OooO0Oo.isEnabled();
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return this.f446OooO0Oo.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        oo00o oo00oVar = new oo00o(this, actionProvider);
        if (actionProvider == null) {
            oo00oVar = null;
        }
        this.f446OooO0Oo.OooO0O0(oo00oVar);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        o000oOoO o000oooo = this.f446OooO0Oo;
        o000oooo.setActionView(i);
        View actionView = o000oooo.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            o000oooo.setActionView(new o00O0(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c) {
        this.f446OooO0Oo.setAlphabeticShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z) {
        this.f446OooO0Oo.setCheckable(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z) {
        this.f446OooO0Oo.setChecked(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f446OooO0Oo.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z) {
        this.f446OooO0Oo.setEnabled(z);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f446OooO0Oo.setIcon(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f446OooO0Oo.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f446OooO0Oo.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f446OooO0Oo.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c) {
        this.f446OooO0Oo.setNumericShortcut(c);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f446OooO0Oo.setOnActionExpandListener(onActionExpandListener != null ? new o00O0O00(this, onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f446OooO0Oo.setOnMenuItemClickListener(onMenuItemClickListener != null ? new o00O0O0(this, onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2) {
        this.f446OooO0Oo.setShortcut(c, c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        this.f446OooO0Oo.setShowAsAction(i);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        this.f446OooO0Oo.setShowAsActionFlags(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f446OooO0Oo.setTitle(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f446OooO0Oo.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f446OooO0Oo.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z) {
        return this.f446OooO0Oo.setVisible(z);
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new o00O0(view);
        }
        this.f446OooO0Oo.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.f446OooO0Oo.setAlphabeticShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f446OooO0Oo.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c, int i) {
        this.f446OooO0Oo.setNumericShortcut(c, i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.f446OooO0Oo.setShortcut(c, c2, i, i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f446OooO0Oo.setTitle(charSequence);
        return this;
    }
}