package Oooo000;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class OooO0OO {
    public static boolean OooO00o(AccessibilityManager accessibilityManager, OooO0o oooO0o) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new OooO(oooO0o));
    }

    public static boolean OooO0O0(AccessibilityManager accessibilityManager, OooO0o oooO0o) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new OooO(oooO0o));
    }
}