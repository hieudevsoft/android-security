package com.google.android.material.datepicker;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public final class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.appcompat.widget.o00Oo0 f3372OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final androidx.appcompat.widget.o00Oo0 f3373OooO0O0;

    public OooO0o(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(o0000O00.OooO00o.o000o000(context, R.attr.materialCalendarStyle, Oooo000.class.getCanonicalName()).data, o0000O.f1797OooOO0o);
        androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(4, 0));
        androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(2, 0));
        androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(3, 0));
        androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(5, 0));
        ColorStateList o00oO0o = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 7);
        this.f3372OooO00o = androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(9, 0));
        androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3373OooO0O0 = androidx.appcompat.widget.o00Oo0.OooO0O0(context, obtainStyledAttributes.getResourceId(10, 0));
        new Paint().setColor(o00oO0o.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}