package com.google.android.material.timepicker;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* loaded from: classes.dex */
public final class OooOo00 implements View.OnTouchListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ GestureDetector f3611OooO00o;

    public OooOo00(GestureDetector gestureDetector) {
        this.f3611OooO00o = gestureDetector;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (((Checkable) view).isChecked()) {
            return this.f3611OooO00o.onTouchEvent(motionEvent);
        }
        return false;
    }
}