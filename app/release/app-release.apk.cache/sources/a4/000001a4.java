package Oooo000;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public abstract class OooOo {
    public static void OooO(AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
        accessibilityNodeInfo.setTextSelectable(z);
    }

    public static Oooo0 OooO00o(boolean z, int i, int i2, int i3, int i4, boolean z2, String str, String str2) {
        return new Oooo0(new AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
    }

    public static o000oOoO OooO0O0(AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
        AccessibilityNodeInfo child = accessibilityNodeInfo.getChild(i, i2);
        if (child != null) {
            return new o000oOoO(child, 0);
        }
        return null;
    }

    public static String OooO0OO(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
    }

    public static String OooO0Oo(Object obj) {
        return ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
    }

    public static o000oOoO OooO0o(AccessibilityNodeInfo accessibilityNodeInfo, int i) {
        AccessibilityNodeInfo parent = accessibilityNodeInfo.getParent(i);
        if (parent != null) {
            return new o000oOoO(parent, 0);
        }
        return null;
    }

    public static AccessibilityNodeInfo.ExtraRenderingInfo OooO0o0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getExtraRenderingInfo();
    }

    public static String OooO0oO(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean OooO0oo(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static void OooOO0(AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        accessibilityNodeInfo.setUniqueId(str);
    }
}