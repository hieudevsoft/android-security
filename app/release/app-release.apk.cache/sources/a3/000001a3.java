package Oooo000;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class OooOOOO {
    public static Oooo0 OooO00o(int i, int i2, int i3, int i4, boolean z) {
        return new Oooo0(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
    }

    public static Object OooO0O0(int i, float f, float f2, float f3) {
        return AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
    }

    public static Bundle OooO0OO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtras();
    }
}