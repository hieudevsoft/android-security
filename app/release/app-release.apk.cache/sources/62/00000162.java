package OooOooo;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class o0O00o0 {
    public static boolean OooO00o(ViewParent viewParent, View view, float f, float f2, boolean z) {
        return viewParent.onNestedFling(view, f, f2, z);
    }

    public static boolean OooO0O0(ViewParent viewParent, View view, float f, float f2) {
        return viewParent.onNestedPreFling(view, f, f2);
    }

    public static void OooO0OO(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i2, iArr);
    }

    public static void OooO0Oo(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
        viewParent.onNestedScroll(view, i, i2, i3, i4);
    }

    public static boolean OooO0o(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void OooO0o0(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static void OooO0oO(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}