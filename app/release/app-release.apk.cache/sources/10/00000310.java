package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class oo00o {

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static final RectF f2555OooOO0o = new RectF();
    public static final ConcurrentHashMap OooOOO0 = new ConcurrentHashMap();

    /* renamed from: OooO  reason: collision with root package name */
    public final TextView f2556OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public TextPaint f2564OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Context f2565OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o00O00O f2566OooOO0O;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f2557OooO00o = 0;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f2558OooO0O0 = false;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public float f2559OooO0OO = -1.0f;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public float f2560OooO0Oo = -1.0f;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public float f2562OooO0o0 = -1.0f;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int[] f2561OooO0o = new int[0];

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2563OooO0oO = false;

    static {
        new ConcurrentHashMap();
    }

    public oo00o(TextView textView) {
        this.f2556OooO = textView;
        this.f2565OooOO0 = textView.getContext();
        this.f2566OooOO0O = Build.VERSION.SDK_INT >= 29 ? new o00O00OO() : new o00O00O();
    }

    public static int[] OooO0O0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static Method OooO0Oo(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = OooOOO0;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public final void OooO(float f, float f2, float f3) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        } else if (f2 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        } else if (f3 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
        } else {
            this.f2557OooO00o = 1;
            this.f2560OooO0Oo = f;
            this.f2562OooO0o0 = f2;
            this.f2559OooO0OO = f3;
            this.f2563OooO0oO = false;
        }
    }

    public final void OooO00o() {
        boolean z;
        int measuredWidth;
        if (OooO0oo() && this.f2557OooO00o != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        if (this.f2558OooO0O0) {
            if (this.f2556OooO.getMeasuredHeight() > 0 && this.f2556OooO.getMeasuredWidth() > 0) {
                if (this.f2566OooOO0O.OooO0O0(this.f2556OooO)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.f2556OooO.getMeasuredWidth() - this.f2556OooO.getTotalPaddingLeft()) - this.f2556OooO.getTotalPaddingRight();
                }
                int height = (this.f2556OooO.getHeight() - this.f2556OooO.getCompoundPaddingBottom()) - this.f2556OooO.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = f2555OooOO0o;
                    synchronized (rectF) {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float OooO0OO2 = OooO0OO(rectF);
                        if (OooO0OO2 != this.f2556OooO.getTextSize()) {
                            OooO0o0(0, OooO0OO2);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f2558OooO0O0 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5 */
    public final int OooO0OO(RectF rectF) {
        boolean z;
        CharSequence transformation;
        int length = this.f2561OooO0o.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f2561OooO0o[i4];
                TextView textView = this.f2556OooO;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int OooO0O02 = o00O000.OooO0O0(textView);
                TextPaint textPaint = this.f2564OooO0oo;
                if (textPaint == null) {
                    this.f2564OooO0oo = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f2564OooO0oo.set(textView.getPaint());
                this.f2564OooO0oo.setTextSize(i5);
                Object obj = Layout.Alignment.ALIGN_NORMAL;
                try {
                    obj = OooO0Oo("getLayoutAlignment").invoke(textView, new Object[0]);
                } catch (Exception unused) {
                }
                StaticLayout OooO00o2 = o00O00.OooO00o(text, obj, Math.round(rectF.right), OooO0O02, this.f2556OooO, this.f2564OooO0oo, this.f2566OooOO0O);
                if ((OooO0O02 != -1 && (OooO00o2.getLineCount() > OooO0O02 || OooO00o2.getLineEnd(OooO00o2.getLineCount() - 1) != text.length())) || OooO00o2.getHeight() > rectF.bottom) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f2561OooO0o[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean OooO0o() {
        if (OooO0oo() && this.f2557OooO00o == 1) {
            if (!this.f2563OooO0oO || this.f2561OooO0o.length == 0) {
                int floor = ((int) Math.floor((this.f2562OooO0o0 - this.f2560OooO0Oo) / this.f2559OooO0OO)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f2559OooO0OO) + this.f2560OooO0Oo);
                }
                this.f2561OooO0o = OooO0O0(iArr);
            }
            this.f2558OooO0O0 = true;
        } else {
            this.f2558OooO0O0 = false;
        }
        return this.f2558OooO0O0;
    }

    public final void OooO0o0(int i, float f) {
        Resources resources;
        Context context = this.f2565OooOO0;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.f2556OooO;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean OooO00o2 = o00O000o.OooO00o(textView);
            if (textView.getLayout() != null) {
                this.f2558OooO0O0 = false;
                try {
                    Method OooO0Oo2 = OooO0Oo("nullLayouts");
                    if (OooO0Oo2 != null) {
                        OooO0Oo2.invoke(textView, new Object[0]);
                    }
                } catch (Exception unused) {
                }
                if (!OooO00o2) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean OooO0oO() {
        int[] iArr = this.f2561OooO0o;
        int length = iArr.length;
        boolean z = length > 0;
        this.f2563OooO0oO = z;
        if (z) {
            this.f2557OooO00o = 1;
            this.f2560OooO0Oo = iArr[0];
            this.f2562OooO0o0 = iArr[length - 1];
            this.f2559OooO0OO = -1.0f;
        }
        return z;
    }

    public final boolean OooO0oo() {
        return !(this.f2556OooO instanceof oo0o0Oo);
    }
}