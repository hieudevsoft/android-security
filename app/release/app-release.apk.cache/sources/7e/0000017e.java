package OooOooo;

import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* loaded from: classes.dex */
public abstract class oo0o0O0 {
    public static int OooO00o(View view) {
        return view.getAccessibilityLiveRegion();
    }

    public static boolean OooO0O0(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean OooO0OO(View view) {
        return view.isLaidOut();
    }

    public static boolean OooO0Oo(View view) {
        return view.isLayoutDirectionResolved();
    }

    public static void OooO0o(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static void OooO0o0(ViewParent viewParent, View view, View view2, int i) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i);
    }

    public static void OooO0oO(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }
}