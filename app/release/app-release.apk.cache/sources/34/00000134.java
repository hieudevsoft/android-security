package OooOooo;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class o000O0O0 {
    public static int OooO00o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getLayoutDirection();
    }

    public static int OooO0O0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int OooO0OO(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static boolean OooO0Oo(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.isMarginRelative();
    }

    public static void OooO0o(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setLayoutDirection(i);
    }

    public static void OooO0o0(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.resolveLayoutDirection(i);
    }

    public static void OooO0oO(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginEnd(i);
    }

    public static void OooO0oo(ViewGroup.MarginLayoutParams marginLayoutParams, int i) {
        marginLayoutParams.setMarginStart(i);
    }
}