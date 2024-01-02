package com.google.android.material.timepicker;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import OooooO0.o0000O;
import OooooOO.oO00O0o0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockHandView extends View {

    /* renamed from: OooO  reason: collision with root package name */
    public float f3585OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ValueAnimator f3586OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3587OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f3588OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3589OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final Paint f3590OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f3591OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final RectF f3592OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final int f3593OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f3594OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public double f3595OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f3596OooOO0o;
    public int OooOOO0;

    public ClockHandView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.materialClockStyle);
        this.f3586OooO00o = new ValueAnimator();
        this.f3588OooO0OO = new ArrayList();
        Paint paint = new Paint();
        this.f3590OooO0o = paint;
        this.f3592OooO0oO = new RectF();
        this.OooOOO0 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1792OooO0o0, R.attr.materialClockStyle, 2131756112);
        o0000O00.OooO00o.o000OooO(context, R.attr.motionDurationLong2, 200);
        o0000O00.OooO00o.o000Oooo(context, R.attr.motionEasingEmphasizedInterpolator, oO00O0o0.f1816OooO0O0);
        this.f3596OooOO0o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f3589OooO0Oo = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        Resources resources = getResources();
        this.f3593OooO0oo = resources.getDimensionPixelSize(R.dimen.material_clock_hand_stroke_width);
        this.f3591OooO0o0 = resources.getDimensionPixelSize(R.dimen.material_clock_hand_center_dot_radius);
        int color = obtainStyledAttributes.getColor(0, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        OooO0O0(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOoo(this, 2);
        obtainStyledAttributes.recycle();
    }

    public final int OooO00o(int i) {
        return i == 2 ? Math.round(this.f3596OooOO0o * 0.66f) : this.f3596OooOO0o;
    }

    public final void OooO0O0(float f) {
        ValueAnimator valueAnimator = this.f3586OooO00o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        OooO0OO(f);
    }

    public final void OooO0OO(float f) {
        float f2 = f % 360.0f;
        this.f3585OooO = f2;
        this.f3595OooOO0O = Math.toRadians(f2 - 90.0f);
        float OooO00o2 = OooO00o(this.OooOOO0);
        float cos = (((float) Math.cos(this.f3595OooOO0O)) * OooO00o2) + (getWidth() / 2);
        float sin = (OooO00o2 * ((float) Math.sin(this.f3595OooOO0O))) + (getHeight() / 2);
        float f3 = this.f3589OooO0Oo;
        this.f3592OooO0oO.set(cos - f3, sin - f3, cos + f3, sin + f3);
        Iterator it = this.f3588OooO0OO.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((OooO0o) it.next());
            if (Math.abs(clockFaceView.f3583Oooo00O - f2) > 0.001f) {
                clockFaceView.f3583Oooo00O = f2;
                clockFaceView.OooOOO0();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int OooO00o2;
        int i;
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float OooO00o3 = OooO00o(this.OooOOO0);
        float f2 = height;
        Paint paint = this.f3590OooO0o;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle((((float) Math.cos(this.f3595OooOO0O)) * OooO00o3) + f, (OooO00o3 * ((float) Math.sin(this.f3595OooOO0O))) + f2, this.f3589OooO0Oo, paint);
        double sin = Math.sin(this.f3595OooOO0O);
        paint.setStrokeWidth(this.f3593OooO0oo);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.f3595OooOO0O) * r12)), height + ((int) (r12 * sin)), paint);
        canvas.drawCircle(f, f2, this.f3591OooO0o0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f3586OooO00o.isRunning()) {
            OooO0O0(this.f3585OooO);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z4 = false;
        if (actionMasked != 0) {
            if (actionMasked != 1 && actionMasked != 2) {
                z2 = false;
                z = false;
            } else {
                z2 = this.f3594OooOO0;
                if (this.f3587OooO0O0) {
                    if (((float) Math.hypot(x - (getWidth() / 2), y - (getHeight() / 2))) <= OooO00o(2) + TypedValue.applyDimension(1, 12, getContext().getResources().getDisplayMetrics())) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    this.OooOOO0 = i;
                }
                z = false;
            }
        } else {
            this.f3594OooOO0 = false;
            z = true;
            z2 = false;
        }
        boolean z5 = this.f3594OooOO0;
        int degrees = ((int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)))) + 90;
        if (degrees < 0) {
            degrees += 360;
        }
        float f = degrees;
        if (this.f3585OooO != f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z || !z3) {
            if (z3 || z2) {
                OooO0O0(f);
            }
            this.f3594OooOO0 = z5 | z4;
            return true;
        }
        z4 = true;
        this.f3594OooOO0 = z5 | z4;
        return true;
    }
}