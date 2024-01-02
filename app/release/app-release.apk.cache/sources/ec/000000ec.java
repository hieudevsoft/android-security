package OooOo0o;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class o000000 {
    public static Drawable OooO00o(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    public static Drawable OooO0O0(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}