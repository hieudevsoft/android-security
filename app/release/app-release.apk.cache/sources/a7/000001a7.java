package Oooo000;

import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.time.Duration;

/* loaded from: classes.dex */
public abstract class Oooo000 {
    public static void OooO(AccessibilityNodeInfo accessibilityNodeInfo, long j) {
        accessibilityNodeInfo.setMinDurationBetweenContentChanges(Duration.ofMillis(j));
    }

    public static void OooO00o(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static long OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
    }

    public static boolean OooO0Oo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
    }

    public static void OooO0o(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setAccessibilityDataSensitive(z);
    }

    public static boolean OooO0o0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.setBoundsInWindow(rect);
    }

    public static void OooO0oo(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setContainerTitle(charSequence);
    }

    public static void OooOO0(AccessibilityNodeInfo accessibilityNodeInfo, View view, boolean z) {
        accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
    }

    public static void OooOO0O(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
    }
}