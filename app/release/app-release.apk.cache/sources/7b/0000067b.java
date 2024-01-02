package o000oOoO;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class o00O0000 extends OooOooo.o0000O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final RecyclerView f5061OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final o00 f5062OooO0o0;

    public o00O0000(RecyclerView recyclerView) {
        this.f5061OooO0Oo = recyclerView;
        o00 o00Var = this.f5062OooO0o0;
        this.f5062OooO0o0 = o00Var == null ? new o00(this) : o00Var;
    }

    @Override // OooOooo.o0000O
    public final void OooO0OO(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.OooO0OO(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f5061OooO0Oo;
            if (recyclerView.f3158OooOOo && !recyclerView.f3167OooOoO0 && !recyclerView.f3147OooO0Oo.OooO0oO()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().OoooO0(accessibilityEvent);
                }
            }
        }
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, Oooo000.o000oOoO o000oooo) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        RecyclerView recyclerView = this.f5061OooO0Oo;
        if (recyclerView.f3158OooOOo && !recyclerView.f3167OooOoO0 && !recyclerView.f3147OooO0Oo.OooO0oO()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && recyclerView.getLayoutManager() != null) {
            o000OO layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5007OooO0O0;
            o000O00 o000o00 = recyclerView2.f3145OooO0O0;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f5007OooO0O0.canScrollHorizontally(-1)) {
                o000oooo.OooO00o(8192);
                accessibilityNodeInfo.setScrollable(true);
            }
            if (layoutManager.f5007OooO0O0.canScrollVertically(1) || layoutManager.f5007OooO0O0.canScrollHorizontally(1)) {
                o000oooo.OooO00o(4096);
                accessibilityNodeInfo.setScrollable(true);
            }
            o000O0O0 o000o0o0 = recyclerView2.OoooOoO;
            accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.Oooo00o(o000o00, o000o0o0), layoutManager.OooOo(o000o00, o000o0o0), false, 0));
        }
    }

    @Override // OooOooo.o0000O
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        boolean z;
        int i2;
        int OooOoo2;
        if (super.OooO0oO(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f5061OooO0Oo;
        if (recyclerView.f3158OooOOo && !recyclerView.f3167OooOoO0 && !recyclerView.f3147OooO0Oo.OooO0oO()) {
            z = false;
        } else {
            z = true;
        }
        if (z || recyclerView.getLayoutManager() == null) {
            return false;
        }
        o000OO layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f5007OooO0O0;
        o000O00 o000o00 = recyclerView2.f3145OooO0O0;
        if (i != 4096) {
            if (i != 8192) {
                OooOoo2 = 0;
                i2 = 0;
            } else {
                if (recyclerView2.canScrollVertically(-1)) {
                    i2 = -((layoutManager.f5018OooOOOO - layoutManager.OooOooo()) - layoutManager.OooOoo0());
                } else {
                    i2 = 0;
                }
                if (layoutManager.f5007OooO0O0.canScrollHorizontally(-1)) {
                    OooOoo2 = -((layoutManager.f5017OooOOO - layoutManager.OooOoo()) - layoutManager.OooOooO());
                }
                OooOoo2 = 0;
            }
        } else {
            if (recyclerView2.canScrollVertically(1)) {
                i2 = (layoutManager.f5018OooOOOO - layoutManager.OooOooo()) - layoutManager.OooOoo0();
            } else {
                i2 = 0;
            }
            if (layoutManager.f5007OooO0O0.canScrollHorizontally(1)) {
                OooOoo2 = (layoutManager.f5017OooOOO - layoutManager.OooOoo()) - layoutManager.OooOooO();
            }
            OooOoo2 = 0;
        }
        if (i2 == 0 && OooOoo2 == 0) {
            return false;
        }
        layoutManager.f5007OooO0O0.OoooOoo(OooOoo2, i2, true);
        return true;
    }
}