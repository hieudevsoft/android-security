package OooOoO;

import OooO0oO.o00O00o0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: classes.dex */
public interface o000oOoO extends MenuItem {
    o00O00o0 OooO00o();

    o000oOoO OooO0O0(o00O00o0 o00o00o0);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c, int i);

    @Override // android.view.MenuItem
    o000oOoO setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c, char c2, int i, int i2);

    @Override // android.view.MenuItem
    o000oOoO setTooltipText(CharSequence charSequence);
}