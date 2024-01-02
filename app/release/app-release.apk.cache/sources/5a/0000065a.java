package o000oOoO;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00 extends OooOooo.o0000O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00O0000 f4942OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final WeakHashMap f4943OooO0o0 = new WeakHashMap();

    public o00(o00O0000 o00o0000) {
        this.f4942OooO0Oo = o00o0000;
    }

    @Override // OooOooo.o0000O
    public final void OooO(View view, AccessibilityEvent accessibilityEvent) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        if (o0000o2 != null) {
            o0000o2.OooO(view, accessibilityEvent);
        } else {
            super.OooO(view, accessibilityEvent);
        }
    }

    @Override // OooOooo.o0000O
    public final boolean OooO00o(View view, AccessibilityEvent accessibilityEvent) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        return o0000o2 != null ? o0000o2.OooO00o(view, accessibilityEvent) : super.OooO00o(view, accessibilityEvent);
    }

    @Override // OooOooo.o0000O
    public final OooO0Oo.o0000OO0 OooO0O0(View view) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        return o0000o2 != null ? o0000o2.OooO0O0(view) : super.OooO0O0(view);
    }

    @Override // OooOooo.o0000O
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        if (o0000o2 != null) {
            o0000o2.OooO0OO(view, accessibilityEvent);
        } else {
            super.OooO0OO(view, accessibilityEvent);
        }
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, Oooo000.o000oOoO o000oooo) {
        boolean z;
        o00O0000 o00o0000 = this.f4942OooO0Oo;
        RecyclerView recyclerView = o00o0000.f5061OooO0Oo;
        if (recyclerView.f3158OooOOo && !recyclerView.f3167OooOoO0 && !recyclerView.f3147OooO0Oo.OooO0oO()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RecyclerView recyclerView2 = o00o0000.f5061OooO0Oo;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().OoooO0O(view, o000oooo);
                OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
                if (o0000o2 != null) {
                    o0000o2.OooO0Oo(view, o000oooo);
                    return;
                }
            }
        }
        this.f1271OooO00o.onInitializeAccessibilityNodeInfo(view, o000oooo.f1437OooO00o);
    }

    @Override // OooOooo.o0000O
    public final boolean OooO0o(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(viewGroup);
        return o0000o2 != null ? o0000o2.OooO0o(viewGroup, view, accessibilityEvent) : super.OooO0o(viewGroup, view, accessibilityEvent);
    }

    @Override // OooOooo.o0000O
    public final void OooO0o0(View view, AccessibilityEvent accessibilityEvent) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        if (o0000o2 != null) {
            o0000o2.OooO0o0(view, accessibilityEvent);
        } else {
            super.OooO0o0(view, accessibilityEvent);
        }
    }

    @Override // OooOooo.o0000O
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        boolean z;
        o00O0000 o00o0000 = this.f4942OooO0Oo;
        RecyclerView recyclerView = o00o0000.f5061OooO0Oo;
        if (recyclerView.f3158OooOOo && !recyclerView.f3167OooOoO0 && !recyclerView.f3147OooO0Oo.OooO0oO()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            RecyclerView recyclerView2 = o00o0000.f5061OooO0Oo;
            if (recyclerView2.getLayoutManager() != null) {
                OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
                if (o0000o2 != null) {
                    if (o0000o2.OooO0oO(view, i, bundle)) {
                        return true;
                    }
                } else if (super.OooO0oO(view, i, bundle)) {
                    return true;
                }
                o000O00 o000o00 = recyclerView2.getLayoutManager().f5007OooO0O0.f3145OooO0O0;
                return false;
            }
        }
        return super.OooO0oO(view, i, bundle);
    }

    @Override // OooOooo.o0000O
    public final void OooO0oo(View view, int i) {
        OooOooo.o0000O o0000o2 = (OooOooo.o0000O) this.f4943OooO0o0.get(view);
        if (o0000o2 != null) {
            o0000o2.OooO0oo(view, i);
        } else {
            super.OooO0oo(view, i);
        }
    }
}