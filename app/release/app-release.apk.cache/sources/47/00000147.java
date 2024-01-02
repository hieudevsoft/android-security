package OooOooo;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

/* loaded from: classes.dex */
public abstract class o00O0O0O {
    public static void OooO(View view, Paint paint) {
        view.setLayerPaint(paint);
    }

    public static int OooO00o() {
        return View.generateViewId();
    }

    public static Display OooO0O0(View view) {
        return view.getDisplay();
    }

    public static int OooO0OO(View view) {
        return view.getLabelFor();
    }

    public static int OooO0Oo(View view) {
        return view.getLayoutDirection();
    }

    public static int OooO0o(View view) {
        return view.getPaddingStart();
    }

    public static int OooO0o0(View view) {
        return view.getPaddingEnd();
    }

    public static boolean OooO0oO(View view) {
        return view.isPaddingRelative();
    }

    public static void OooO0oo(View view, int i) {
        view.setLabelFor(i);
    }

    public static void OooOO0(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static void OooOO0O(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }
}