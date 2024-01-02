package oo000o;

import OooOo0o.o0000;
import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class OooO0o {

    /* renamed from: OooO  reason: collision with root package name */
    public final float f5611OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ColorStateList f5612OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f5613OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f5614OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f5615OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final float f5616OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float f5617OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final float f5618OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final boolean f5619OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public ColorStateList f5620OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public float f5621OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final int f5622OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public Typeface f5623OooOOO;
    public boolean OooOOO0 = false;

    public OooO0o(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, o0000O.f1810OooOoO0);
        this.f5621OooOO0O = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f5620OooOO0 = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 3);
        o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 4);
        o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 5);
        this.f5614OooO0OO = obtainStyledAttributes.getInt(2, 0);
        this.f5615OooO0Oo = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f5622OooOO0o = obtainStyledAttributes.getResourceId(i2, 0);
        this.f5613OooO0O0 = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f5612OooO00o = o0000O00.OooO00o.o00oO0o(context, obtainStyledAttributes, 6);
        this.f5617OooO0o0 = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f5616OooO0o = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f5618OooO0oO = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, o0000O.f1802OooOOo0);
        this.f5619OooO0oo = obtainStyledAttributes2.hasValue(0);
        this.f5611OooO = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void OooO00o() {
        String str;
        Typeface typeface = this.f5623OooOOO;
        int i = this.f5614OooO0OO;
        if (typeface == null && (str = this.f5613OooO0O0) != null) {
            this.f5623OooOOO = Typeface.create(str, i);
        }
        if (this.f5623OooOOO == null) {
            int i2 = this.f5615OooO0Oo;
            this.f5623OooOOO = i2 != 1 ? i2 != 2 ? i2 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f5623OooOOO = Typeface.create(this.f5623OooOOO, i);
        }
    }

    public final Typeface OooO0O0(Context context) {
        if (this.OooOOO0) {
            return this.f5623OooOOO;
        }
        if (!context.isRestricted()) {
            try {
                Typeface OooO00o2 = o0000.OooO00o(context, this.f5622OooOO0o);
                this.f5623OooOOO = OooO00o2;
                if (OooO00o2 != null) {
                    this.f5623OooOOO = Typeface.create(OooO00o2, this.f5614OooO0OO);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        OooO00o();
        this.OooOOO0 = true;
        return this.f5623OooOOO;
    }

    public final void OooO0OO(Context context, OooO0O0.OooO0O0 oooO0O0) {
        if (OooO0Oo(context)) {
            OooO0O0(context);
        } else {
            OooO00o();
        }
        int i = this.f5622OooOO0o;
        if (i == 0) {
            this.OooOOO0 = true;
        }
        if (this.OooOOO0) {
            oooO0O0.OooOOO0(this.f5623OooOOO, true);
            return;
        }
        try {
            OooO0O0 oooO0O02 = new OooO0O0(this, oooO0O0);
            ThreadLocal threadLocal = o0000.f1155OooO00o;
            if (context.isRestricted()) {
                oooO0O02.OooO00o(-4);
            } else {
                o0000.OooO0O0(context, i, new TypedValue(), 0, oooO0O02, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.OooOOO0 = true;
            oooO0O0.OooOO0O(1);
        } catch (Exception unused2) {
            this.OooOOO0 = true;
            oooO0O0.OooOO0O(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f5622OooOO0o
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal r0 = OooOo0o.o0000.f1155OooO00o
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = OooOo0o.o0000.OooO0O0(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oo000o.OooO0o.OooO0Oo(android.content.Context):boolean");
    }

    public final void OooO0o(Context context, TextPaint textPaint, OooO0O0.OooO0O0 oooO0O0) {
        if (OooO0Oo(context)) {
            OooO0oO(context, textPaint, OooO0O0(context));
            return;
        }
        OooO00o();
        OooO0oO(context, textPaint, this.f5623OooOOO);
        OooO0OO(context, new OooO0OO(this, context, textPaint, oooO0O0));
    }

    public final void OooO0o0(Context context, TextPaint textPaint, OooO0O0.OooO0O0 oooO0O0) {
        OooO0o(context, textPaint, oooO0O0);
        ColorStateList colorStateList = this.f5620OooOO0;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f5612OooO00o;
        textPaint.setShadowLayer(this.f5618OooO0oO, this.f5617OooO0o0, this.f5616OooO0o, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void OooO0oO(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z;
        float f;
        Typeface o0000o2 = o0000O00.OooO00o.o0000o(context.getResources().getConfiguration(), typeface);
        if (o0000o2 != null) {
            typeface = o0000o2;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f5614OooO0OO;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        textPaint.setFakeBoldText(z);
        if ((i & 2) != 0) {
            f = -0.25f;
        } else {
            f = 0.0f;
        }
        textPaint.setTextSkewX(f);
        textPaint.setTextSize(this.f5621OooOO0O);
        if (this.f5619OooO0oo) {
            textPaint.setLetterSpacing(this.f5611OooO);
        }
    }
}