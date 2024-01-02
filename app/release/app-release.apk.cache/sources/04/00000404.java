package com.google.android.material.timepicker;

import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o0ooOO0.Oooo0;
import o0ooOO0.Oooo000;

/* loaded from: classes.dex */
public abstract class OooOO0 extends ConstraintLayout {

    /* renamed from: OooOOo  reason: collision with root package name */
    public int f3601OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final OooO f3602OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public o0ooOO0.OooOOOO f3603OooOOoo;

    /* JADX WARN: Type inference failed for: r7v2, types: [com.google.android.material.timepicker.OooO] */
    public OooOO0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        LayoutInflater.from(context).inflate(R.layout.material_radial_view_group, this);
        o0ooOO0.OooOOOO oooOOOO = new o0ooOO0.OooOOOO();
        this.f3603OooOOoo = oooOOOO;
        o0ooOO0.OooOo00 oooOo00 = new o0ooOO0.OooOo00(0.5f);
        Oooo0 oooo0 = oooOOOO.f5494OooO00o.f5468OooO00o;
        oooo0.getClass();
        Oooo000 oooo000 = new Oooo000(oooo0);
        oooo000.f5533OooO0o0 = oooOo00;
        oooo000.f5532OooO0o = oooOo00;
        oooo000.f5534OooO0oO = oooOo00;
        oooo000.f5535OooO0oo = oooOo00;
        oooOOOO.setShapeAppearanceModel(new Oooo0(oooo000));
        this.f3603OooOOoo.OooOO0(ColorStateList.valueOf(-1));
        o0ooOO0.OooOOOO oooOOOO2 = this.f3603OooOOoo;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOo0(this, oooOOOO2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1806OooOo00, R.attr.materialClockStyle, 0);
        this.f3601OooOOo = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f3602OooOOo0 = new Runnable() { // from class: com.google.android.material.timepicker.OooO
            @Override // java.lang.Runnable
            public final void run() {
                OooOO0.this.OooOO0o();
            }
        };
        obtainStyledAttributes.recycle();
    }

    public abstract void OooOO0o();

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            view.setId(o00O0O0O.OooO00o());
        }
        Handler handler = getHandler();
        if (handler != null) {
            OooO oooO = this.f3602OooOOo0;
            handler.removeCallbacks(oooO);
            handler.post(oooO);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        OooOO0o();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            OooO oooO = this.f3602OooOOo0;
            handler.removeCallbacks(oooO);
            handler.post(oooO);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        this.f3603OooOOoo.OooOO0(ColorStateList.valueOf(i));
    }
}