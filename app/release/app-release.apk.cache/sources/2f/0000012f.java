package OooOooo;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* loaded from: classes.dex */
public abstract class o000O {
    public static MenuItem OooO(MenuItem menuItem, ColorStateList colorStateList) {
        return menuItem.setIconTintList(colorStateList);
    }

    public static int OooO00o(MenuItem menuItem) {
        return menuItem.getAlphabeticModifiers();
    }

    public static CharSequence OooO0O0(MenuItem menuItem) {
        return menuItem.getContentDescription();
    }

    public static ColorStateList OooO0OO(MenuItem menuItem) {
        return menuItem.getIconTintList();
    }

    public static PorterDuff.Mode OooO0Oo(MenuItem menuItem) {
        return menuItem.getIconTintMode();
    }

    public static CharSequence OooO0o(MenuItem menuItem) {
        return menuItem.getTooltipText();
    }

    public static int OooO0o0(MenuItem menuItem) {
        return menuItem.getNumericModifiers();
    }

    public static MenuItem OooO0oO(MenuItem menuItem, char c, int i) {
        return menuItem.setAlphabeticShortcut(c, i);
    }

    public static MenuItem OooO0oo(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setContentDescription(charSequence);
    }

    public static MenuItem OooOO0(MenuItem menuItem, PorterDuff.Mode mode) {
        return menuItem.setIconTintMode(mode);
    }

    public static MenuItem OooOO0O(MenuItem menuItem, char c, int i) {
        return menuItem.setNumericShortcut(c, i);
    }

    public static MenuItem OooOO0o(MenuItem menuItem, char c, char c2, int i, int i2) {
        return menuItem.setShortcut(c, c2, i, i2);
    }

    public static MenuItem OooOOO0(MenuItem menuItem, CharSequence charSequence) {
        return menuItem.setTooltipText(charSequence);
    }
}