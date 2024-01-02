package androidx.appcompat.widget;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public abstract class o00O0OOO {
    public static boolean OooO00o(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void OooO0O0(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}