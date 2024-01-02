package com.google.android.material.textview;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.o00oOoo;
import com.google.gson.internal.OooO0o;
import hieubui.eup.android_app_security.R;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class MaterialTextView extends o00oOoo {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(OooO0o.OooOo0o(context, attributeSet, 16842884, 0), attributeSet, 16842884);
        Context context2 = getContext();
        if (OooO00o.o000Ooo0(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = o0000O.f1801OooOOo;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
            int OooOOO0 = OooOOO0(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (!(OooOOO0 != -1)) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, 16842884, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    OooOO0o(resourceId, theme);
                }
            }
        }
    }

    public static int OooOOO0(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    public final void OooOO0o(int i, Resources.Theme theme) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, o0000O.f1802OooOOo0);
        int OooOOO0 = OooOOO0(getContext(), obtainStyledAttributes, 1, 2);
        obtainStyledAttributes.recycle();
        if (OooOOO0 >= 0) {
            setLineHeight(OooOOO0);
        }
    }

    @Override // androidx.appcompat.widget.o00oOoo, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (OooO00o.o000Ooo0(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            OooOO0o(i, context.getTheme());
        }
    }
}