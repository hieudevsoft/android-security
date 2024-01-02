package OooOooo;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeProvider;

/* loaded from: classes.dex */
public abstract class o000OO {
    public static AccessibilityNodeProvider OooO00o(View.AccessibilityDelegate accessibilityDelegate, View view) {
        return accessibilityDelegate.getAccessibilityNodeProvider(view);
    }

    public static boolean OooO0O0(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
        return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
    }
}