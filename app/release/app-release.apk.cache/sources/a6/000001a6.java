package Oooo000;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f1435OooO00o;

    public Oooo0(AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo) {
        this.f1435OooO00o = collectionItemInfo;
    }

    public static Oooo0 OooO00o(int i, int i2, int i3, int i4, boolean z) {
        return new Oooo0(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}