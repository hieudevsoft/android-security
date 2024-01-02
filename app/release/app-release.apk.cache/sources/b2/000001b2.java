package Oooo000;

import OooO0Oo.o0000OO0;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o0OoOo0 extends AccessibilityNodeProvider {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000OO0 f1440OooO00o;

    public o0OoOo0(o0000OO0 o0000oo02) {
        this.f1440OooO00o = o0000oo02;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        o000oOoO OooOOo02 = this.f1440OooO00o.OooOOo0(i);
        if (OooOOo02 == null) {
            return null;
        }
        return OooOOo02.f1437OooO00o;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f1440OooO00o.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f1440OooO00o.OooOoO0(i, i2, bundle);
    }
}