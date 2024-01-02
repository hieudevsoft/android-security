package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import hieubui.eup.android_app_security.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: OooOOo  reason: collision with root package name */
    public static final /* synthetic */ int f3612OooOOo = 0;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final Chip f3613OooOOo0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        OooOOO oooOOO = new OooOOO(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).f3327OooO0OO.add(new OooOOO0(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.f3613OooOOo0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        OooOo00 oooOo00 = new OooOo00(new GestureDetector(getContext(), new OooOOOO(this)));
        chip.setOnTouchListener(oooOo00);
        chip2.setOnTouchListener(oooOo00);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(oooOOO);
        chip2.setOnClickListener(oooOOO);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.f3613OooOOo0.sendAccessibilityEvent(8);
        }
    }
}