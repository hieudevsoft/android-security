package androidx.appcompat.widget;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class o00O0OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final int[] f2334OooO00o = {16842912};

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final int[] f2335OooO0O0 = new int[0];

    static {
        new Rect();
    }

    public static void OooO00o(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29 && i < 31 && "android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            int[] state = drawable.getState();
            if (state != null && state.length != 0) {
                drawable.setState(f2335OooO0O0);
            } else {
                drawable.setState(f2334OooO00o);
            }
            drawable.setState(state);
        }
    }

    public static PorterDuff.Mode OooO0O0(int i, PorterDuff.Mode mode) {
        if (i != 3) {
            if (i != 5) {
                if (i != 9) {
                    switch (i) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }
}