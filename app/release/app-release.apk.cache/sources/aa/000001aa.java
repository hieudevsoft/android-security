package Oooo000;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class o00O0O extends o0OoOo0 {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        o000oOoO OooOo2 = this.f1440OooO00o.OooOo(i);
        if (OooOo2 == null) {
            return null;
        }
        return OooOo2.f1437OooO00o;
    }
}