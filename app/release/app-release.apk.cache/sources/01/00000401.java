package com.google.android.material.timepicker;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class OooO0O0 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ClockFaceView f3599OooO00o;

    public OooO0O0(ClockFaceView clockFaceView) {
        this.f3599OooO00o = clockFaceView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ClockFaceView clockFaceView = this.f3599OooO00o;
        if (!clockFaceView.isShown()) {
            return true;
        }
        clockFaceView.getViewTreeObserver().removeOnPreDrawListener(this);
        int height = ((clockFaceView.getHeight() / 2) - clockFaceView.f3572OooOo00.f3589OooO0Oo) - clockFaceView.f3579OooOoo0;
        if (height != clockFaceView.f3601OooOOo) {
            clockFaceView.f3601OooOOo = height;
            clockFaceView.OooOO0o();
            int i = clockFaceView.f3601OooOOo;
            ClockHandView clockHandView = clockFaceView.f3572OooOo00;
            clockHandView.f3596OooOO0o = i;
            clockHandView.invalidate();
        }
        return true;
    }
}