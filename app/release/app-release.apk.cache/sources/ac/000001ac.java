package Oooo000;

import android.view.accessibility.AccessibilityRecord;

/* loaded from: classes.dex */
public abstract class o00Ooo {
    public static int OooO00o(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollX();
    }

    public static int OooO0O0(AccessibilityRecord accessibilityRecord) {
        return accessibilityRecord.getMaxScrollY();
    }

    public static void OooO0OO(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    public static void OooO0Oo(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }
}