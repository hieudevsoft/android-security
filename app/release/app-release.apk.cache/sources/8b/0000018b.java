package Oooo0;

import OooOooo.o0000O;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class OooOOO extends o0000O {
    @Override // OooOooo.o0000O
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.OooO0OO(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.getScrollRange() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        Oooo000.o00Ooo.OooO0OO(accessibilityEvent, nestedScrollView.getScrollX());
        Oooo000.o00Ooo.OooO0Oo(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, Oooo000.o000oOoO o000oooo) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            accessibilityNodeInfo.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                o000oooo.OooO0O0(Oooo000.OooOOO.f1426OooO0oO);
                o000oooo.OooO0O0(Oooo000.OooOOO.f1429OooOO0O);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                o000oooo.OooO0O0(Oooo000.OooOOO.f1424OooO0o);
                o000oooo.OooO0O0(Oooo000.OooOOO.f1430OooOO0o);
            }
        }
    }

    @Override // OooOooo.o0000O
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i != 8192 && i != 16908344) {
                if (i != 16908346) {
                    return false;
                }
            } else {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.OooOo0O(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.OooOo0O(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }
}