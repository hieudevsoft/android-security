package OooOoO0;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;

/* loaded from: classes.dex */
public abstract class o0ooOOo {
    public static int OooO00o(Drawable drawable) {
        return drawable.getAlpha();
    }

    public static Drawable OooO0O0(DrawableContainer.DrawableContainerState drawableContainerState, int i) {
        return drawableContainerState.getChild(i);
    }

    public static Drawable OooO0OO(InsetDrawable insetDrawable) {
        return insetDrawable.getDrawable();
    }

    public static boolean OooO0Oo(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void OooO0o0(Drawable drawable, boolean z) {
        drawable.setAutoMirrored(z);
    }
}