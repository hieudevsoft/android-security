package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class oo0OOoo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final ThreadLocal f2567OooO00o = new ThreadLocal();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final int[] f2568OooO0O0 = {-16842910};

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final int[] f2569OooO0OO = {16842908};

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f2570OooO0Oo = {16842919};

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final int[] f2572OooO0o0 = {16842912};

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final int[] f2571OooO0o = new int[0];

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final int[] f2573OooO0oO = new int[1];

    public static void OooO00o(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(OooO0OO.OooO00o.f26OooOO0);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                view.getClass().toString();
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int OooO0O0(Context context, int i) {
        ColorStateList OooO0Oo2 = OooO0Oo(context, i);
        if (OooO0Oo2 != null && OooO0Oo2.isStateful()) {
            return OooO0Oo2.getColorForState(f2568OooO0O0, OooO0Oo2.getDefaultColor());
        }
        ThreadLocal threadLocal = f2567OooO00o;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int OooO0OO2 = OooO0OO(context, i);
        return OooOo.OooO00o.OooO0OO(OooO0OO2, Math.round(Color.alpha(OooO0OO2) * f));
    }

    public static int OooO0OO(Context context, int i) {
        int[] iArr = f2573OooO0oO;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList OooO0Oo(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f2573OooO0oO;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = OooOo0.Oooo000.OooO00o(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}