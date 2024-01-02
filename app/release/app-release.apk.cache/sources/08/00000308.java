package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.AutoCompleteTextView;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o0oO0O0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f2539OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2540OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object f2541OooO0OO;

    public o0oO0O0o() {
        this.f2539OooO00o = null;
        this.f2540OooO0O0 = null;
        this.f2541OooO0OO = null;
        OooOOO();
        try {
            Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
            this.f2539OooO00o = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        try {
            Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
            this.f2540OooO0O0 = declaredMethod2;
            declaredMethod2.setAccessible(true);
        } catch (NoSuchMethodException unused2) {
        }
        try {
            Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
            this.f2541OooO0OO = method;
            method.setAccessible(true);
        } catch (NoSuchMethodException unused3) {
        }
    }

    public static void OooOOO() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }

    public static o0oO0O0o OooOOO0(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new o0oO0O0o(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    public final int OooO(int i, int i2) {
        return ((TypedArray) this.f2540OooO0O0).getResourceId(i, i2);
    }

    public final boolean OooO00o(int i, boolean z) {
        return ((TypedArray) this.f2540OooO0O0).getBoolean(i, z);
    }

    public final ColorStateList OooO0O0(int i) {
        int resourceId;
        ColorStateList OooO00o2;
        Object obj = this.f2540OooO0O0;
        if (((TypedArray) obj).hasValue(i) && (resourceId = ((TypedArray) obj).getResourceId(i, 0)) != 0 && (OooO00o2 = OooOo0.Oooo000.OooO00o((Context) this.f2539OooO00o, resourceId)) != null) {
            return OooO00o2;
        }
        return ((TypedArray) obj).getColorStateList(i);
    }

    public final int OooO0OO(int i, int i2) {
        return ((TypedArray) this.f2540OooO0O0).getDimensionPixelOffset(i, i2);
    }

    public final int OooO0Oo(int i, int i2) {
        return ((TypedArray) this.f2540OooO0O0).getDimensionPixelSize(i, i2);
    }

    public final Drawable OooO0o(int i) {
        int resourceId;
        Drawable OooO0o2;
        if (((TypedArray) this.f2540OooO0O0).hasValue(i) && (resourceId = ((TypedArray) this.f2540OooO0O0).getResourceId(i, 0)) != 0) {
            o0Oo0oo OooO00o2 = o0Oo0oo.OooO00o();
            Context context = (Context) this.f2539OooO00o;
            synchronized (OooO00o2) {
                OooO0o2 = OooO00o2.f2534OooO00o.OooO0o(context, resourceId, true);
            }
            return OooO0o2;
        }
        return null;
    }

    public final Drawable OooO0o0(int i) {
        int resourceId;
        Object obj = this.f2540OooO0O0;
        return (!((TypedArray) obj).hasValue(i) || (resourceId = ((TypedArray) obj).getResourceId(i, 0)) == 0) ? ((TypedArray) obj).getDrawable(i) : o0000O00.OooO00o.o0ooOoO((Context) this.f2539OooO00o, resourceId);
    }

    public final Typeface OooO0oO(int i, int i2, o000O0Oo o000o0oo) {
        int resourceId = ((TypedArray) this.f2540OooO0O0).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f2541OooO0OO) == null) {
            this.f2541OooO0OO = new TypedValue();
        }
        Context context = (Context) this.f2539OooO00o;
        TypedValue typedValue = (TypedValue) this.f2541OooO0OO;
        ThreadLocal threadLocal = OooOo0o.o0000.f1155OooO00o;
        if (context.isRestricted()) {
            return null;
        }
        return OooOo0o.o0000.OooO0O0(context, resourceId, typedValue, i2, o000o0oo, true, false);
    }

    public final int OooO0oo(int i, int i2) {
        return ((TypedArray) this.f2540OooO0O0).getInt(i, i2);
    }

    public final String OooOO0(int i) {
        return ((TypedArray) this.f2540OooO0O0).getString(i);
    }

    public final CharSequence OooOO0O(int i) {
        return ((TypedArray) this.f2540OooO0O0).getText(i);
    }

    public final boolean OooOO0o(int i) {
        return ((TypedArray) this.f2540OooO0O0).hasValue(i);
    }

    public final void OooOOOO() {
        ((TypedArray) this.f2540OooO0O0).recycle();
    }

    public o0oO0O0o(Context context, TypedArray typedArray) {
        this.f2539OooO00o = context;
        this.f2540OooO0O0 = typedArray;
    }
}