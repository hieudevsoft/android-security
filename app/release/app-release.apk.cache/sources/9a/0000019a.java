package Oooo000;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class OooO implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f1419OooO00o;

    public OooO(OooO0o oooO0o) {
        this.f1419OooO00o = oooO0o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooO) {
            return this.f1419OooO00o.equals(((OooO) obj).f1419OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1419OooO00o.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z) {
        boolean z2;
        o0OOO0o.OooOo00 oooOo00 = (o0OOO0o.OooOo00) ((Oooo00o.OooOO0) this.f1419OooO00o).f1441OooO00o;
        AutoCompleteTextView autoCompleteTextView = oooOo00.f5342OooO0oo;
        if (autoCompleteTextView != null) {
            int i = 1;
            if (autoCompleteTextView.getInputType() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (z) {
                    i = 2;
                }
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                o00O0O0.OooOOoo(oooOo00.f5377OooO0Oo, i);
            }
        }
    }
}