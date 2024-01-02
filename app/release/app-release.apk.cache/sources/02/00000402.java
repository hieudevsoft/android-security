package com.google.android.material.timepicker;

import OooOooo.o0000O;
import Oooo000.Oooo0;
import Oooo000.o000oOoO;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooO0OO extends o0000O {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3600OooO0Oo;

    public OooO0OO(ClockFaceView clockFaceView) {
        this.f3600OooO0Oo = clockFaceView;
    }

    @Override // OooOooo.o0000O
    public final void OooO0Oo(View view, o000oOoO o000oooo) {
        View.AccessibilityDelegate accessibilityDelegate = this.f1271OooO00o;
        AccessibilityNodeInfo accessibilityNodeInfo = o000oooo.f1437OooO00o;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(R.id.material_value_index)).intValue();
        if (intValue > 0) {
            accessibilityNodeInfo.setTraversalAfter((View) this.f3600OooO0Oo.f3570OooOo.get(intValue - 1));
        }
        o000oooo.OooO(Oooo0.OooO00o(0, 1, intValue, 1, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        o000oooo.OooO0O0(Oooo000.OooOOO.f1425OooO0o0);
    }

    @Override // OooOooo.o0000O
    public final boolean OooO0oO(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.f3600OooO0Oo;
            view.getHitRect(clockFaceView.f3571OooOo0);
            float centerX = clockFaceView.f3571OooOo0.centerX();
            float centerY = clockFaceView.f3571OooOo0.centerY();
            clockFaceView.f3572OooOo00.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.f3572OooOo00.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.OooO0oO(view, i, bundle);
    }
}