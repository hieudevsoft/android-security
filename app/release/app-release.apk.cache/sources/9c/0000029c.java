package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o00 {

    /* renamed from: OooO  reason: collision with root package name */
    public final oo00o f2244OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final TextView f2245OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0o00O f2246OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o0O0o00O f2247OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public o0O0o00O f2248OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public o0O0o00O f2249OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public o0O0o00O f2250OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public o0O0o00O f2251OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public o0O0o00O f2252OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f2253OooOO0 = 0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public int f2254OooOO0O = -1;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public Typeface f2255OooOO0o;
    public boolean OooOOO0;

    public o00(TextView textView) {
        this.f2245OooO00o = textView;
        this.f2244OooO = new oo00o(textView);
    }

    public static o0O0o00O OooO0OO(Context context, o0Oo0oo o0oo0oo, int i) {
        ColorStateList OooO0oo2;
        synchronized (o0oo0oo) {
            OooO0oo2 = o0oo0oo.f2534OooO00o.OooO0oo(context, i);
        }
        if (OooO0oo2 != null) {
            o0O0o00O o0o0o00o = new o0O0o00O(0);
            o0o0o00o.f2476OooO0O0 = true;
            o0o0o00o.f2477OooO0OO = OooO0oo2;
            return o0o0o00o;
        }
        return null;
    }

    public static void OooO0oo(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        boolean z;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                Oooo00o.OooO.OooO00o(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                Oooo00o.OooO.OooO00o(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6 + 0;
            } else {
                i = i5 + 0;
            }
            if (i5 > i6) {
                i2 = i5 - 0;
            } else {
                i2 = i6 + 0;
            }
            int length = text.length();
            if (i >= 0 && i2 <= length) {
                int i7 = editorInfo.inputType & 4095;
                if (i7 != 129 && i7 != 225 && i7 != 18) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    if (length <= 2048) {
                        o0000O00.OooO00o.o000o0OO(editorInfo, text, i, i2);
                        return;
                    }
                    int i8 = i2 - i;
                    if (i8 > 1024) {
                        i3 = 0;
                    } else {
                        i3 = i8;
                    }
                    int i9 = 2048 - i3;
                    int min = Math.min(text.length() - i2, i9 - Math.min(i, (int) (i9 * 0.8d)));
                    int min2 = Math.min(i, i9 - min);
                    int i10 = i - min2;
                    if (Character.isLowSurrogate(text.charAt(i10))) {
                        i10++;
                        min2--;
                    }
                    if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
                        min--;
                    }
                    int i11 = min2 + i3 + min;
                    if (i3 != i8) {
                        subSequence = TextUtils.concat(text.subSequence(i10, i10 + min2), text.subSequence(i2, min + i2));
                    } else {
                        subSequence = text.subSequence(i10, i11 + i10);
                    }
                    int i12 = min2 + 0;
                    o0000O00.OooO00o.o000o0OO(editorInfo, subSequence, i12, i3 + i12);
                    return;
                }
            }
            o0000O00.OooO00o.o000o0OO(editorInfo, null, 0, 0);
        }
    }

    public final void OooO(int i, int i2, int i3, int i4) {
        oo00o oo00oVar = this.f2244OooO;
        if (oo00oVar.OooO0oo()) {
            DisplayMetrics displayMetrics = oo00oVar.f2565OooOO0.getResources().getDisplayMetrics();
            oo00oVar.OooO(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (oo00oVar.OooO0o()) {
                oo00oVar.OooO00o();
            }
        }
    }

    public final void OooO00o(Drawable drawable, o0O0o00O o0o0o00o) {
        if (drawable == null || o0o0o00o == null) {
            return;
        }
        o0Oo0oo.OooO0o0(drawable, o0o0o00o, this.f2245OooO00o.getDrawableState());
    }

    public final void OooO0O0() {
        o0O0o00O o0o0o00o = this.f2246OooO0O0;
        TextView textView = this.f2245OooO00o;
        if (o0o0o00o != null || this.f2247OooO0OO != null || this.f2248OooO0Oo != null || this.f2250OooO0o0 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.f2246OooO0O0);
            OooO00o(compoundDrawables[1], this.f2247OooO0OO);
            OooO00o(compoundDrawables[2], this.f2248OooO0Oo);
            OooO00o(compoundDrawables[3], this.f2250OooO0o0);
        }
        if (this.f2249OooO0o == null && this.f2251OooO0oO == null) {
            return;
        }
        Drawable[] OooO00o2 = o000O0O0.OooO00o(textView);
        OooO00o(OooO00o2[0], this.f2249OooO0o);
        OooO00o(OooO00o2[2], this.f2251OooO0oO);
    }

    public final ColorStateList OooO0Oo() {
        o0O0o00O o0o0o00o = this.f2252OooO0oo;
        if (o0o0o00o != null) {
            return (ColorStateList) o0o0o00o.f2477OooO0OO;
        }
        return null;
    }

    public final void OooO0o(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int fontMetricsInt2;
        int i3;
        int resourceId;
        int i4;
        TextView textView = this.f2245OooO00o;
        Context context = textView.getContext();
        o0Oo0oo OooO00o2 = o0Oo0oo.OooO00o();
        int[] iArr = OooO0OO.OooO00o.f25OooO0oo;
        o0oO0O0o OooOOO0 = o0oO0O0o.OooOOO0(context, attributeSet, iArr, i);
        OooOooo.o0o0Oo.OooOO0O(textView, textView.getContext(), iArr, attributeSet, (TypedArray) OooOOO0.f2540OooO0O0, i);
        int OooO2 = OooOOO0.OooO(0, -1);
        if (OooOOO0.OooOO0o(3)) {
            this.f2246OooO0O0 = OooO0OO(context, OooO00o2, OooOOO0.OooO(3, 0));
        }
        if (OooOOO0.OooOO0o(1)) {
            this.f2247OooO0OO = OooO0OO(context, OooO00o2, OooOOO0.OooO(1, 0));
        }
        if (OooOOO0.OooOO0o(4)) {
            this.f2248OooO0Oo = OooO0OO(context, OooO00o2, OooOOO0.OooO(4, 0));
        }
        if (OooOOO0.OooOO0o(2)) {
            this.f2250OooO0o0 = OooO0OO(context, OooO00o2, OooOOO0.OooO(2, 0));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (OooOOO0.OooOO0o(5)) {
            this.f2249OooO0o = OooO0OO(context, OooO00o2, OooOOO0.OooO(5, 0));
        }
        if (OooOOO0.OooOO0o(6)) {
            this.f2251OooO0oO = OooO0OO(context, OooO00o2, OooOOO0.OooO(6, 0));
        }
        OooOOO0.OooOOOO();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = OooO0OO.OooO00o.f39OooOo0o;
        if (OooO2 != -1) {
            o0oO0O0o o0oo0o0o = new o0oO0O0o(context, context.obtainStyledAttributes(OooO2, iArr2));
            if (!z3 && o0oo0o0o.OooOO0o(14)) {
                z = o0oo0o0o.OooO00o(14, false);
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            OooOOO(context, o0oo0o0o);
            if (o0oo0o0o.OooOO0o(15)) {
                str = o0oo0o0o.OooOO0(15);
                i4 = 26;
            } else {
                i4 = 26;
                str = null;
            }
            if (i5 >= i4 && o0oo0o0o.OooOO0o(13)) {
                str2 = o0oo0o0o.OooOO0(13);
            } else {
                str2 = null;
            }
            o0oo0o0o.OooOOOO();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        o0oO0O0o o0oo0o0o2 = new o0oO0O0o(context, context.obtainStyledAttributes(attributeSet, iArr2, i, 0));
        if (!z3 && o0oo0o0o2.OooOO0o(14)) {
            z = o0oo0o0o2.OooO00o(14, false);
            z2 = true;
        }
        if (o0oo0o0o2.OooOO0o(15)) {
            str = o0oo0o0o2.OooOO0(15);
        }
        if (i5 >= 26 && o0oo0o0o2.OooOO0o(13)) {
            str2 = o0oo0o0o2.OooOO0(13);
        }
        String str3 = str2;
        if (i5 >= 28 && o0oo0o0o2.OooOO0o(0) && o0oo0o0o2.OooO0Oo(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO(context, o0oo0o0o2);
        o0oo0o0o2.OooOOOO();
        if (!z3 && z2) {
            textView.setAllCaps(z);
        }
        Typeface typeface = this.f2255OooOO0o;
        if (typeface != null) {
            if (this.f2254OooOO0O == -1) {
                textView.setTypeface(typeface, this.f2253OooOO0);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str3 != null) {
            o000OO00.OooO0Oo(textView, str3);
        }
        if (str != null) {
            o000O.OooO0O0(textView, o000O.OooO00o(str));
        }
        int[] iArr3 = OooO0OO.OooO00o.f17OooO;
        oo00o oo00oVar = this.f2244OooO;
        Context context2 = oo00oVar.f2565OooOO0;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = oo00oVar.f2556OooO;
        OooOooo.o0o0Oo.OooOO0O(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i);
        if (obtainStyledAttributes.hasValue(5)) {
            oo00oVar.f2557OooO00o = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr4[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                oo00oVar.f2561OooO0o = oo00o.OooO0O0(iArr4);
                oo00oVar.OooO0oO();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (oo00oVar.OooO0oo()) {
            if (oo00oVar.f2557OooO00o == 1) {
                if (!oo00oVar.f2563OooO0oO) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f2 == -1.0f) {
                        i3 = 2;
                        f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i3 = 2;
                    }
                    if (f3 == -1.0f) {
                        f3 = TypedValue.applyDimension(i3, 112.0f, displayMetrics);
                    }
                    if (f == -1.0f) {
                        f = 1.0f;
                    }
                    oo00oVar.OooO(f2, f3, f);
                }
                oo00oVar.OooO0o();
            }
        } else {
            oo00oVar.f2557OooO00o = 0;
        }
        if (o0OO0oO0.f2517OooO0O0 && oo00oVar.f2557OooO00o != 0) {
            int[] iArr5 = oo00oVar.f2561OooO0o;
            if (iArr5.length > 0) {
                if (o000OO00.OooO00o(textView) != -1.0f) {
                    o000OO00.OooO0O0(textView, Math.round(oo00oVar.f2560OooO0Oo), Math.round(oo00oVar.f2562OooO0o0), Math.round(oo00oVar.f2559OooO0OO), 0);
                } else {
                    o000OO00.OooO0OO(textView, iArr5, 0);
                }
            }
        }
        o0oO0O0o o0oo0o0o3 = new o0oO0O0o(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int OooO3 = o0oo0o0o3.OooO(8, -1);
        if (OooO3 != -1) {
            drawable = OooO00o2.OooO0O0(context, OooO3);
        } else {
            drawable = null;
        }
        int OooO4 = o0oo0o0o3.OooO(13, -1);
        if (OooO4 != -1) {
            drawable2 = OooO00o2.OooO0O0(context, OooO4);
        } else {
            drawable2 = null;
        }
        int OooO5 = o0oo0o0o3.OooO(9, -1);
        if (OooO5 != -1) {
            drawable3 = OooO00o2.OooO0O0(context, OooO5);
        } else {
            drawable3 = null;
        }
        int OooO6 = o0oo0o0o3.OooO(6, -1);
        if (OooO6 != -1) {
            drawable4 = OooO00o2.OooO0O0(context, OooO6);
        } else {
            drawable4 = null;
        }
        int OooO7 = o0oo0o0o3.OooO(10, -1);
        if (OooO7 != -1) {
            drawable5 = OooO00o2.OooO0O0(context, OooO7);
        } else {
            drawable5 = null;
        }
        int OooO8 = o0oo0o0o3.OooO(7, -1);
        if (OooO8 != -1) {
            drawable6 = OooO00o2.OooO0O0(context, OooO8);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] OooO00o3 = o000O0O0.OooO00o(textView);
                Drawable drawable7 = OooO00o3[0];
                if (drawable7 == null && OooO00o3[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = OooO00o3[1];
                    }
                    Drawable drawable8 = OooO00o3[2];
                    if (drawable4 == null) {
                        drawable4 = OooO00o3[3];
                    }
                    o000O0O0.OooO0O0(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] OooO00o4 = o000O0O0.OooO00o(textView);
            if (drawable5 == null) {
                drawable5 = OooO00o4[0];
            }
            if (drawable2 == null) {
                drawable2 = OooO00o4[1];
            }
            if (drawable6 == null) {
                drawable6 = OooO00o4[2];
            }
            if (drawable4 == null) {
                drawable4 = OooO00o4[3];
            }
            o000O0O0.OooO0O0(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (o0oo0o0o3.OooOO0o(11)) {
            Oooo0.o00O0O.OooO0o(textView, o0oo0o0o3.OooO0O0(11));
        }
        if (o0oo0o0o3.OooOO0o(12)) {
            i2 = -1;
            fontMetricsInt = null;
            Oooo0.o00O0O.OooO0oO(textView, o00O0OO0.OooO0O0(o0oo0o0o3.OooO0oo(12, -1), null));
        } else {
            i2 = -1;
            fontMetricsInt = null;
        }
        int OooO0Oo2 = o0oo0o0o3.OooO0Oo(15, i2);
        int OooO0Oo3 = o0oo0o0o3.OooO0Oo(18, i2);
        int OooO0Oo4 = o0oo0o0o3.OooO0Oo(19, i2);
        o0oo0o0o3.OooOOOO();
        if (OooO0Oo2 != i2) {
            o0000O00.OooO00o.o000o00o(textView, OooO0Oo2);
        }
        if (OooO0Oo3 != i2) {
            o0000O00.OooO00o.o000o0O0(textView, OooO0Oo3);
        }
        if (OooO0Oo4 != i2) {
            o0000O00.OooO00o.OooOo0O(OooO0Oo4);
            if (OooO0Oo4 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(OooO0Oo4 - fontMetricsInt2, 1.0f);
            }
        }
    }

    public final PorterDuff.Mode OooO0o0() {
        o0O0o00O o0o0o00o = this.f2252OooO0oo;
        if (o0o0o00o != null) {
            return (PorterDuff.Mode) o0o0o00o.f2478OooO0Oo;
        }
        return null;
    }

    public final void OooO0oO(Context context, int i) {
        String OooOO02;
        o0oO0O0o o0oo0o0o = new o0oO0O0o(context, context.obtainStyledAttributes(i, OooO0OO.OooO00o.f39OooOo0o));
        boolean OooOO0o2 = o0oo0o0o.OooOO0o(14);
        TextView textView = this.f2245OooO00o;
        if (OooOO0o2) {
            textView.setAllCaps(o0oo0o0o.OooO00o(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (o0oo0o0o.OooOO0o(0) && o0oo0o0o.OooO0Oo(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO(context, o0oo0o0o);
        if (i2 >= 26 && o0oo0o0o.OooOO0o(13) && (OooOO02 = o0oo0o0o.OooOO0(13)) != null) {
            o000OO00.OooO0Oo(textView, OooOO02);
        }
        o0oo0o0o.OooOOOO();
        Typeface typeface = this.f2255OooOO0o;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2253OooOO0);
        }
    }

    public final void OooOO0(int[] iArr, int i) {
        oo00o oo00oVar = this.f2244OooO;
        if (oo00oVar.OooO0oo()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = oo00oVar.f2565OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                oo00oVar.f2561OooO0o = oo00o.OooO0O0(iArr2);
                if (!oo00oVar.OooO0oO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                oo00oVar.f2563OooO0oO = false;
            }
            if (oo00oVar.OooO0o()) {
                oo00oVar.OooO00o();
            }
        }
    }

    public final void OooOO0O(int i) {
        oo00o oo00oVar = this.f2244OooO;
        if (oo00oVar.OooO0oo()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = oo00oVar.f2565OooOO0.getResources().getDisplayMetrics();
                    oo00oVar.OooO(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (oo00oVar.OooO0o()) {
                        oo00oVar.OooO00o();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("Unknown auto-size text type: ", i));
            }
            oo00oVar.f2557OooO00o = 0;
            oo00oVar.f2560OooO0Oo = -1.0f;
            oo00oVar.f2562OooO0o0 = -1.0f;
            oo00oVar.f2559OooO0OO = -1.0f;
            oo00oVar.f2561OooO0o = new int[0];
            oo00oVar.f2558OooO0O0 = false;
        }
    }

    public final void OooOO0o(ColorStateList colorStateList) {
        boolean z = false;
        if (this.f2252OooO0oo == null) {
            this.f2252OooO0oo = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = this.f2252OooO0oo;
        o0o0o00o.f2477OooO0OO = colorStateList;
        if (colorStateList != null) {
            z = true;
        }
        o0o0o00o.f2476OooO0O0 = z;
        this.f2246OooO0O0 = o0o0o00o;
        this.f2247OooO0OO = o0o0o00o;
        this.f2248OooO0Oo = o0o0o00o;
        this.f2250OooO0o0 = o0o0o00o;
        this.f2249OooO0o = o0o0o00o;
        this.f2251OooO0oO = o0o0o00o;
    }

    public final void OooOOO(Context context, o0oO0O0o o0oo0o0o) {
        String OooOO02;
        Typeface create;
        Typeface typeface;
        this.f2253OooOO0 = o0oo0o0o.OooO0oo(2, this.f2253OooOO0);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            int OooO0oo2 = o0oo0o0o.OooO0oo(11, -1);
            this.f2254OooOO0O = OooO0oo2;
            if (OooO0oo2 != -1) {
                this.f2253OooOO0 = (this.f2253OooOO0 & 2) | 0;
            }
        }
        if (!o0oo0o0o.OooOO0o(10) && !o0oo0o0o.OooOO0o(12)) {
            if (o0oo0o0o.OooOO0o(1)) {
                this.OooOOO0 = false;
                int OooO0oo3 = o0oo0o0o.OooO0oo(1, 1);
                if (OooO0oo3 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (OooO0oo3 == 2) {
                    typeface = Typeface.SERIF;
                } else if (OooO0oo3 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.f2255OooOO0o = typeface;
                return;
            }
            return;
        }
        this.f2255OooOO0o = null;
        int i2 = o0oo0o0o.OooOO0o(12) ? 12 : 10;
        int i3 = this.f2254OooOO0O;
        int i4 = this.f2253OooOO0;
        if (!context.isRestricted()) {
            try {
                Typeface OooO0oO2 = o0oo0o0o.OooO0oO(i2, this.f2253OooOO0, new o000O0Oo(this, i3, i4, new WeakReference(this.f2245OooO00o)));
                if (OooO0oO2 != null) {
                    if (i >= 28 && this.f2254OooOO0O != -1) {
                        OooO0oO2 = o000OOo0.OooO00o(Typeface.create(OooO0oO2, 0), this.f2254OooOO0O, (this.f2253OooOO0 & 2) != 0);
                    }
                    this.f2255OooOO0o = OooO0oO2;
                }
                this.OooOOO0 = this.f2255OooOO0o == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f2255OooOO0o != null || (OooOO02 = o0oo0o0o.OooOO0(i2)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2254OooOO0O == -1) {
            create = Typeface.create(OooOO02, this.f2253OooOO0);
        } else {
            create = o000OOo0.OooO00o(Typeface.create(OooOO02, 0), this.f2254OooOO0O, (this.f2253OooOO0 & 2) != 0);
        }
        this.f2255OooOO0o = create;
    }

    public final void OooOOO0(PorterDuff.Mode mode) {
        boolean z = false;
        if (this.f2252OooO0oo == null) {
            this.f2252OooO0oo = new o0O0o00O(0);
        }
        o0O0o00O o0o0o00o = this.f2252OooO0oo;
        o0o0o00o.f2478OooO0Oo = mode;
        if (mode != null) {
            z = true;
        }
        o0o0o00o.f2475OooO00o = z;
        this.f2246OooO0O0 = o0o0o00o;
        this.f2247OooO0OO = o0o0o00o;
        this.f2248OooO0Oo = o0o0o00o;
        this.f2250OooO0o0 = o0o0o00o;
        this.f2249OooO0o = o0o0o00o;
        this.f2251OooO0oO = o0o0o00o;
    }
}