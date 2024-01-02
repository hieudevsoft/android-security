package OooOooo;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public abstract class o00O0O0 {
    public static boolean OooO(View view) {
        return view.hasTransientState();
    }

    public static AccessibilityNodeProvider OooO00o(View view) {
        return view.getAccessibilityNodeProvider();
    }

    public static boolean OooO0O0(View view) {
        return view.getFitsSystemWindows();
    }

    public static int OooO0OO(View view) {
        return view.getImportantForAccessibility();
    }

    public static int OooO0Oo(View view) {
        return view.getMinimumHeight();
    }

    public static ViewParent OooO0o(View view) {
        return view.getParentForAccessibility();
    }

    public static int OooO0o0(View view) {
        return view.getMinimumWidth();
    }

    public static int OooO0oO(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean OooO0oo(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean OooOO0(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void OooOO0O(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void OooOO0o(View view, int i, int i2, int i3, int i4) {
        view.postInvalidateOnAnimation(i, i2, i3, i4);
    }

    public static void OooOOO(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static void OooOOO0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void OooOOOO(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
    }

    public static void OooOOOo(View view) {
        view.requestFitSystemWindows();
    }

    public static void OooOOo(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void OooOOo0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void OooOOoo(View view, int i) {
        view.setImportantForAccessibility(i);
    }
}