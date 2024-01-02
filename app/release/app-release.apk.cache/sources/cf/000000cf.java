package OooOOoo;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class oo000o implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f1106OooO00o;

    public oo000o(CoordinatorLayout coordinatorLayout) {
        this.f1106OooO00o = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f1106OooO00o.f2620OooOOo0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        CoordinatorLayout coordinatorLayout = this.f1106OooO00o;
        coordinatorLayout.OooOOOO(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f2620OooOOo0;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}