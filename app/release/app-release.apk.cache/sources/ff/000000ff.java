package OooOoO0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class o0OOO0o {
    public static void OooO(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static void OooO00o(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static boolean OooO0O0(Drawable drawable) {
        return drawable.canApplyTheme();
    }

    public static ColorFilter OooO0OO(Drawable drawable) {
        return drawable.getColorFilter();
    }

    public static void OooO0Oo(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }

    public static void OooO0o(Drawable drawable, int i, int i2, int i3, int i4) {
        drawable.setHotspotBounds(i, i2, i3, i4);
    }

    public static void OooO0o0(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void OooO0oO(Drawable drawable, int i) {
        drawable.setTint(i);
    }

    public static void OooO0oo(Drawable drawable, ColorStateList colorStateList) {
        drawable.setTintList(colorStateList);
    }
}