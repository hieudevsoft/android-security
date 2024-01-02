package Oooo000;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class OooOo00 {
    public static Object OooO00o(int i, float f, float f2, float f3) {
        return new AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
    }

    public static CharSequence OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getStateDescription();
    }

    public static void OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
        accessibilityNodeInfo.setStateDescription(charSequence);
    }
}