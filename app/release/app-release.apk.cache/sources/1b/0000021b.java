package OoooOoo;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class oO0Ooooo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final oO000OOo f1692OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0OO0oO0 f1693OooO0O0;

    static {
        f1692OooO00o = Build.VERSION.SDK_INT >= 29 ? new ooOOOOoo() : new oO000OOo();
        f1693OooO0O0 = new o0OO0oO0(Float.class, "translationAlpha", 5);
        new o0OO0oO0(Rect.class, "clipBounds", 6);
    }

    public static void OooO00o(View view, int i, int i2, int i3, int i4) {
        f1692OooO00o.OooOooo(view, i, i2, i3, i4);
    }
}