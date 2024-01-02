package com.google.android.material.datepicker;

import OooOooo.o0000O;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooOOO extends o0000O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f3381OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f3382OooO0o0;

    public /* synthetic */ OooOOO(int i, Object obj) {
        this.f3381OooO0Oo = i;
        this.f3382OooO0o0 = obj;
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, Oooo000.o000oOoO o000oooo) {
        int i;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        int i2 = this.f3381OooO0Oo;
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        switch (i2) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                Oooo000 oooo000 = (Oooo000) this.f3382OooO0o0;
                if (oooo000.f3402OooooO0.getVisibility() == 0) {
                    i = R.string.mtrl_picker_toggle_to_year_selection;
                } else {
                    i = R.string.mtrl_picker_toggle_to_day_selection;
                }
                o000oooo.OooOO0(oooo000.OooOoo0().getResources().getString(i));
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
        }
    }
}