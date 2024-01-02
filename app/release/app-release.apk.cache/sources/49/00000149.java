package OooOooo;

import android.graphics.Rect;
import android.view.View;

/* loaded from: classes.dex */
public abstract class o00O0OO0 {
    public static Rect OooO00o(View view) {
        return view.getClipBounds();
    }

    public static boolean OooO0O0(View view) {
        return view.isInLayout();
    }

    public static void OooO0OO(View view, Rect rect) {
        view.setClipBounds(rect);
    }
}