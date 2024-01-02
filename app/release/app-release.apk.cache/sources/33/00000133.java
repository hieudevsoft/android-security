package OooOooo;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o000O00O {
    public static DisplayCutout OooO00o(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    public static List<Rect> OooO0O0(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static int OooO0OO(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int OooO0Oo(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int OooO0o(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int OooO0o0(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }
}