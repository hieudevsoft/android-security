package androidx.coordinatorlayout.widget;

import OooO0Oo.o0000OO0;
import OooO0o.OooOOO0;
import OooOO0.OooOOOO;
import OooOOo.Oooo000;
import OooOOoo.o00Oo0;
import OooOOoo.o00Ooo;
import OooOOoo.o00oO0o;
import OooOOoo.o0OO00O;
import OooOOoo.o0OOO0o;
import OooOOoo.o0Oo0oo;
import OooOOoo.o0ooOOo;
import OooOOoo.oo000o;
import OooOooO.o0000O0;
import OooOooo.o00;
import OooOooo.o000O0Oo;
import OooOooo.o000OOo0;
import OooOooo.o00O0000;
import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o00O0OO;
import OooOooo.o0O0OOOo;
import OooOooo.o0o0Oo;
import OooOooo.oo0oOO0;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements o000OOo0, o00 {

    /* renamed from: OooOo  reason: collision with root package name */
    public static final o0000O0 f2599OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public static final Class[] f2600OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public static final String f2601OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public static final ThreadLocal f2602OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final o0Oo0oo f2603OooOo0o;

    /* renamed from: OooO  reason: collision with root package name */
    public final int[] f2604OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f2605OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO0 f2606OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f2607OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final ArrayList f2608OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int[] f2609OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int[] f2610OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f2611OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f2612OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public View f2613OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public View f2614OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public o0ooOOo f2615OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public o0O0OOOo f2616OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f2617OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public Drawable f2618OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o0000OO0 f2619OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f2620OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public final o00O0000 f2621OooOOoo;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        f2601OooOo00 = r0 != null ? r0.getName() : null;
        f2603OooOo0o = new o0Oo0oo(0);
        f2600OooOo0 = new Class[]{Context.class, AttributeSet.class};
        f2602OooOo0O = new ThreadLocal();
        f2599OooOo = new o0000O0();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f2605OooO00o = new ArrayList();
        this.f2606OooO0O0 = new OooOOO0(2);
        this.f2607OooO0OO = new ArrayList();
        this.f2608OooO0Oo = new ArrayList();
        this.f2610OooO0o0 = new int[2];
        this.f2609OooO0o = new int[2];
        this.f2621OooOOoo = new o00O0000();
        int[] iArr = Oooo000.f861OooO00o;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f2604OooO = intArray;
            float f = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i = 0; i < length; i++) {
                int[] iArr2 = this.f2604OooO;
                iArr2[i] = (int) (iArr2[i] * f);
            }
        }
        this.f2618OooOOOo = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        OooOo0O();
        super.setOnHierarchyChangeListener(new oo000o(this));
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0.OooO0OO(this) == 0) {
            o00O0O0.OooOOoo(this, 1);
        }
    }

    public static Rect OooO0oO() {
        Rect rect = (Rect) f2599OooOo.OooO00o();
        return rect == null ? new Rect() : rect;
    }

    public static void OooOO0o(int i, Rect rect, Rect rect2, o00oO0o o00oo0o, int i2, int i3) {
        int width;
        int height;
        int i4 = o00oo0o.f1089OooO0OO;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = o00oo0o.f1090OooO0Oo;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public static o00oO0o OooOOO0(View view) {
        o00oO0o o00oo0o = (o00oO0o) view.getLayoutParams();
        if (!o00oo0o.f1088OooO0O0) {
            o00Ooo o00ooo2 = null;
            for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                o00ooo2 = (o00Ooo) cls.getAnnotation(o00Ooo.class);
                if (o00ooo2 != null) {
                    break;
                }
            }
            if (o00ooo2 != null) {
                try {
                    o00Oo0 o00oo0 = (o00Oo0) o00ooo2.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    o00Oo0 o00oo02 = o00oo0o.f1087OooO00o;
                    if (o00oo02 != o00oo0) {
                        if (o00oo02 != null) {
                            o00oo02.OooO0o0();
                        }
                        o00oo0o.f1087OooO00o = o00oo0;
                        o00oo0o.f1088OooO0O0 = true;
                        if (o00oo0 != null) {
                            o00oo0.OooO0OO(o00oo0o);
                        }
                    }
                } catch (Exception unused) {
                    o00ooo2.value().getClass();
                }
            }
            o00oo0o.f1088OooO0O0 = true;
        }
        return o00oo0o;
    }

    public static void OooOo0(View view, int i) {
        o00oO0o o00oo0o = (o00oO0o) view.getLayoutParams();
        int i2 = o00oo0o.f1095OooOO0;
        if (i2 != i) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            view.offsetTopAndBottom(i - i2);
            o00oo0o.f1095OooOO0 = i;
        }
    }

    public static void OooOo00(View view, int i) {
        o00oO0o o00oo0o = (o00oO0o) view.getLayoutParams();
        int i2 = o00oo0o.f1086OooO;
        if (i2 != i) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            view.offsetLeftAndRight(i - i2);
            o00oo0o.f1086OooO = i;
        }
    }

    public final void OooO(View view, Rect rect, boolean z) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            OooOO0O(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    @Override // OooOooo.o000OOo0
    public final void OooO00o(View view, View view2, int i, int i2) {
        o00O0000 o00o0000 = this.f2621OooOOoo;
        if (i2 == 1) {
            o00o0000.f1293OooO0O0 = i;
        } else {
            o00o0000.f1292OooO00o = i;
        }
        this.f2614OooOO0O = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((o00oO0o) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    @Override // OooOooo.o00
    public final void OooO0O0(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        o00Oo0 o00oo0;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
                if (o00oo0o.OooO00o(i5) && (o00oo0 = o00oo0o.f1087OooO00o) != null) {
                    int[] iArr2 = this.f2610OooO0o0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    o00oo0.OooOO0O(this, childAt, i2, i3, i4, iArr2);
                    i6 = i3 > 0 ? Math.max(i6, iArr2[0]) : Math.min(i6, iArr2[0]);
                    i7 = i4 > 0 ? Math.max(i7, iArr2[1]) : Math.min(i7, iArr2[1]);
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            OooOOOO(1);
        }
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0OO(View view, int i, int i2, int i3, int i4, int i5) {
        OooO0O0(view, i, i2, i3, i4, 0, this.f2609OooO0o);
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0Oo(View view, int i) {
        o00O0000 o00o0000 = this.f2621OooOOoo;
        if (i == 1) {
            o00o0000.f1293OooO0O0 = 0;
        } else {
            o00o0000.f1292OooO00o = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
            if (o00oo0o.OooO00o(i)) {
                o00Oo0 o00oo0 = o00oo0o.f1087OooO00o;
                if (o00oo0 != null) {
                    o00oo0.OooOOOo(childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        o00oo0o.f1099OooOOOO = false;
                    }
                } else {
                    o00oo0o.f1098OooOOO = false;
                }
                o00oo0o.getClass();
            }
        }
        this.f2614OooOO0O = null;
    }

    @Override // OooOooo.o000OOo0
    public final boolean OooO0o(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
                o00Oo0 o00oo0 = o00oo0o.f1087OooO00o;
                if (o00oo0 != null) {
                    boolean OooOOOO2 = o00oo0.OooOOOO(childAt, i, i2);
                    z |= OooOOOO2;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            o00oo0o.f1099OooOOOO = OooOOOO2;
                        }
                    } else {
                        o00oo0o.f1098OooOOO = OooOOOO2;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        o00oo0o.f1099OooOOOO = false;
                    }
                } else {
                    o00oo0o.f1098OooOOO = false;
                }
            }
        }
        return z;
    }

    @Override // OooOooo.o000OOo0
    public final void OooO0o0(View view, int i, int i2, int[] iArr, int i3) {
        o00Oo0 o00oo0;
        int childCount = getChildCount();
        int i4 = 0;
        int i5 = 0;
        boolean z = false;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
                if (o00oo0o.OooO00o(i3) && (o00oo0 = o00oo0o.f1087OooO00o) != null) {
                    int[] iArr2 = this.f2610OooO0o0;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    o00oo0.OooOO0(childAt, view, i2, iArr2, i3);
                    if (i > 0) {
                        i4 = Math.max(i4, iArr2[0]);
                    } else {
                        i4 = Math.min(i4, iArr2[0]);
                    }
                    if (i2 > 0) {
                        i5 = Math.max(i5, iArr2[1]);
                    } else {
                        i5 = Math.min(i5, iArr2[1]);
                    }
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            OooOOOO(1);
        }
    }

    public final void OooO0oo(o00oO0o o00oo0o, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0o).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) o00oo0o).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0o).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) o00oo0o).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final ArrayList OooOO0(View view) {
        OooOOO0 oooOOO0 = this.f2606OooO0O0;
        int i = ((OooOOOO) oooOOO0.f272OooO0Oo).f542OooO0OO;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((OooOOOO) oooOOO0.f272OooO0Oo).OooOO0(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((OooOOOO) oooOOO0.f272OooO0Oo).OooO0oo(i2));
            }
        }
        ArrayList arrayList3 = this.f2608OooO0Oo;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    public final void OooOO0O(View view, Rect rect) {
        ThreadLocal threadLocal = o0OO00O.f1101OooO00o;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = o0OO00O.f1101OooO00o;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        o0OO00O.OooO00o(this, view, matrix);
        ThreadLocal threadLocal3 = o0OO00O.f1102OooO0O0;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final boolean OooOOO(View view, int i, int i2) {
        o0000O0 o0000o02 = f2599OooOo;
        Rect OooO0oO2 = OooO0oO();
        OooOO0O(view, OooO0oO2);
        try {
            return OooO0oO2.contains(i, i2);
        } finally {
            OooO0oO2.setEmpty();
            o0000o02.OooO0O0(OooO0oO2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c1 A[EDGE_INSN: B:130:0x02c1->B:119:0x02c1 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOOO(int r25) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOOO(int):void");
    }

    public final void OooOOOo(View view, int i) {
        boolean z;
        Rect OooO0oO2;
        Rect OooO0oO3;
        int i2;
        o00oO0o o00oo0o = (o00oO0o) view.getLayoutParams();
        View view2 = o00oo0o.f1096OooOO0O;
        int i3 = 0;
        if (view2 == null && o00oo0o.f1091OooO0o != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o0000O0 o0000o02 = f2599OooOo;
            if (view2 != null) {
                OooO0oO2 = OooO0oO();
                OooO0oO3 = OooO0oO();
                try {
                    OooOO0O(view2, OooO0oO2);
                    o00oO0o o00oo0o2 = (o00oO0o) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    OooOO0o(i, OooO0oO2, OooO0oO3, o00oo0o2, measuredWidth, measuredHeight);
                    OooO0oo(o00oo0o2, OooO0oO3, measuredWidth, measuredHeight);
                    view.layout(OooO0oO3.left, OooO0oO3.top, OooO0oO3.right, OooO0oO3.bottom);
                    return;
                } finally {
                    OooO0oO2.setEmpty();
                    o0000o02.OooO0O0(OooO0oO2);
                    OooO0oO3.setEmpty();
                    o0000o02.OooO0O0(OooO0oO3);
                }
            }
            int i4 = o00oo0o.f1092OooO0o0;
            if (i4 >= 0) {
                o00oO0o o00oo0o3 = (o00oO0o) view.getLayoutParams();
                int i5 = o00oo0o3.f1089OooO0OO;
                if (i5 == 0) {
                    i5 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i5, i);
                int i6 = absoluteGravity & 7;
                int i7 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i4 = width - i4;
                }
                int[] iArr = this.f2604OooO;
                if (iArr == null || i4 < 0 || i4 >= iArr.length) {
                    toString();
                    i2 = 0;
                } else {
                    i2 = iArr[i4];
                }
                int i8 = i2 - measuredWidth2;
                if (i6 != 1) {
                    if (i6 == 5) {
                        i8 += measuredWidth2;
                    }
                } else {
                    i8 += measuredWidth2 / 2;
                }
                if (i7 != 16) {
                    if (i7 == 80) {
                        i3 = measuredHeight2 + 0;
                    }
                } else {
                    i3 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0o3).leftMargin, Math.min(i8, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) o00oo0o3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0o3).topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) o00oo0o3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            o00oO0o o00oo0o4 = (o00oO0o) view.getLayoutParams();
            OooO0oO2 = OooO0oO();
            OooO0oO2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) o00oo0o4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) o00oo0o4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) o00oo0o4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) o00oo0o4).bottomMargin);
            if (this.f2616OooOOO != null) {
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                if (o00O0O0.OooO0O0(this) && !o00O0O0.OooO0O0(view)) {
                    OooO0oO2.left = this.f2616OooOOO.OooO0OO() + OooO0oO2.left;
                    OooO0oO2.top = this.f2616OooOOO.OooO0o0() + OooO0oO2.top;
                    OooO0oO2.right -= this.f2616OooOOO.OooO0Oo();
                    OooO0oO2.bottom -= this.f2616OooOOO.OooO0O0();
                }
            }
            OooO0oO3 = OooO0oO();
            int i9 = o00oo0o4.f1089OooO0OO;
            if ((i9 & 7) == 0) {
                i9 |= 8388611;
            }
            if ((i9 & 112) == 0) {
                i9 |= 48;
            }
            o000O0Oo.OooO0O0(i9, view.getMeasuredWidth(), view.getMeasuredHeight(), OooO0oO2, OooO0oO3, i);
            view.layout(OooO0oO3.left, OooO0oO3.top, OooO0oO3.right, OooO0oO3.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r10 != false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooOOo() {
        /*
            Method dump skipped, instructions count: 458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.OooOOo():void");
    }

    public final boolean OooOOo0(MotionEvent motionEvent, int i) {
        boolean z;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.f2607OooO0OO;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        o0Oo0oo o0oo0oo = f2603OooOo0o;
        if (o0oo0oo != null) {
            Collections.sort(arrayList, o0oo0oo);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            o00oO0o o00oo0o = (o00oO0o) view.getLayoutParams();
            o00Oo0 o00oo0 = o00oo0o.f1087OooO00o;
            if ((z2 || z3) && actionMasked != 0) {
                if (o00oo0 != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            o00oo0.OooOOo0(view, motionEvent2);
                        }
                    } else {
                        o00oo0.OooO0o(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && o00oo0 != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z2 = o00oo0.OooOOo0(view, motionEvent);
                        }
                    } else {
                        z2 = o00oo0.OooO0o(this, view, motionEvent);
                    }
                    if (z2) {
                        this.f2613OooOO0 = view;
                    }
                }
                if (o00oo0o.f1087OooO00o == null) {
                    o00oo0o.OooOOO0 = false;
                }
                boolean z4 = o00oo0o.OooOOO0;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    o00oo0o.OooOOO0 = z;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    public final void OooOOoo(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            o00Oo0 o00oo0 = ((o00oO0o) childAt.getLayoutParams()).f1087OooO00o;
            if (o00oo0 != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    o00oo0.OooO0o(this, childAt, obtain);
                } else {
                    o00oo0.OooOOo0(childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((o00oO0o) getChildAt(i2).getLayoutParams()).OooOOO0 = false;
        }
        this.f2613OooOO0 = null;
        this.f2611OooO0oO = false;
    }

    public final void OooOo0O() {
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        if (o00O0O0.OooO0O0(this)) {
            if (this.f2619OooOOo == null) {
                this.f2619OooOOo = new o0000OO0(7, this);
            }
            oo0oOO0.OooOo0(this, this.f2619OooOOo);
            setSystemUiVisibility(1280);
            return;
        }
        oo0oOO0.OooOo0(this, null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o00oO0o) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        o00Oo0 o00oo0 = ((o00oO0o) view.getLayoutParams()).f1087OooO00o;
        if (o00oo0 != null) {
            o00oo0.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f2618OooOOOo;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new o00oO0o();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new o00oO0o(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        OooOOo();
        return Collections.unmodifiableList(this.f2605OooO00o);
    }

    public final o0O0OOOo getLastWindowInsets() {
        return this.f2616OooOOO;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        o00O0000 o00o0000 = this.f2621OooOOoo;
        return o00o0000.f1293OooO0O0 | o00o0000.f1292OooO00o;
    }

    public Drawable getStatusBarBackground() {
        return this.f2618OooOOOo;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        OooOOoo(false);
        if (this.OooOOO0) {
            if (this.f2615OooOO0o == null) {
                this.f2615OooOO0o = new o0ooOOo(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f2615OooOO0o);
        }
        if (this.f2616OooOOO == null) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (o00O0O0.OooO0O0(this)) {
                o00O0OO.OooO0OO(this);
            }
        }
        this.f2612OooO0oo = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        OooOOoo(false);
        if (this.OooOOO0 && this.f2615OooOO0o != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f2615OooOO0o);
        }
        View view = this.f2614OooOO0O;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f2612OooO0oo = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f2617OooOOOO || this.f2618OooOOOo == null) {
            return;
        }
        o0O0OOOo o0o0oooo = this.f2616OooOOO;
        int OooO0o02 = o0o0oooo != null ? o0o0oooo.OooO0o0() : 0;
        if (OooO0o02 > 0) {
            this.f2618OooOOOo.setBounds(0, 0, getWidth(), OooO0o02);
            this.f2618OooOOOo.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            OooOOoo(true);
        }
        boolean OooOOo02 = OooOOo0(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            OooOOoo(true);
        }
        return OooOOo02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        o00Oo0 o00oo0;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        int OooO0Oo2 = o00O0O0O.OooO0Oo(this);
        ArrayList arrayList = this.f2605OooO00o;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((o00oo0 = ((o00oO0o) view.getLayoutParams()).f1087OooO00o) == null || !o00oo0.OooO0oO(this, view, OooO0Oo2))) {
                OooOOOo(view, OooO0Oo2);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ab, code lost:
        if (r0.OooO0oo(r32, r19, r25, r20, r26) == false) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
                if (o00oo0o.OooO00o(0)) {
                    o00Oo0 o00oo0 = o00oo0o.f1087OooO00o;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        o00Oo0 o00oo0;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                o00oO0o o00oo0o = (o00oO0o) childAt.getLayoutParams();
                if (o00oo0o.OooO00o(0) && (o00oo0 = o00oo0o.f1087OooO00o) != null) {
                    z |= o00oo0.OooO(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        OooO0o0(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        OooO0OO(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        OooO00o(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof o0OOO0o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o0OOO0o o0ooo0o = (o0OOO0o) parcelable;
        super.onRestoreInstanceState(o0ooo0o.f1456OooO00o);
        SparseArray sparseArray = o0ooo0o.f1103OooO0OO;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            o00Oo0 o00oo0 = OooOOO0(childAt).f1087OooO00o;
            if (id != -1 && o00oo0 != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                o00oo0.OooOOO0(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable OooOOO2;
        o0OOO0o o0ooo0o = new o0OOO0o(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            o00Oo0 o00oo0 = ((o00oO0o) childAt.getLayoutParams()).f1087OooO00o;
            if (id != -1 && o00oo0 != null && (OooOOO2 = o00oo0.OooOOO(childAt)) != null) {
                sparseArray.append(id, OooOOO2);
            }
        }
        o0ooo0o.f1103OooO0OO = sparseArray;
        return o0ooo0o;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return OooO0o(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        OooO0Oo(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.f2613OooOO0
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.OooOOo0(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = r5
        L16:
            android.view.View r6 = r0.f2613OooOO0
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            OooOOoo.o00oO0o r6 = (OooOOoo.o00oO0o) r6
            OooOOoo.o00Oo0 r6 = r6.f1087OooO00o
            if (r6 == 0) goto L29
            android.view.View r7 = r0.f2613OooOO0
            boolean r6 = r6.OooOOo0(r7, r1)
            goto L2a
        L29:
            r6 = r5
        L2a:
            android.view.View r7 = r0.f2613OooOO0
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.OooOOoo(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        o00Oo0 o00oo0 = ((o00oO0o) view.getLayoutParams()).f1087OooO00o;
        if (o00oo0 != null) {
            o00oo0.OooOO0o(this, view);
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.f2611OooO0oO) {
            return;
        }
        OooOOoo(false);
        this.f2611OooO0oO = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        OooOo0O();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f2620OooOOo0 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.f2618OooOOOo;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.f2618OooOOOo = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.f2618OooOOOo.setState(getDrawableState());
                }
                Drawable drawable4 = this.f2618OooOOOo;
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                OooOoO0.o0Oo0oo.OooO0O0(drawable4, o00O0O0O.OooO0Oo(this));
                Drawable drawable5 = this.f2618OooOOOo;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.f2618OooOOOo.setCallback(this);
            }
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOO0O(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = OooOo0.Oooo000.f1139OooO00o;
            drawable = OooOo0O.o00Ooo.OooO0O0(context, i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.f2618OooOOOo;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.f2618OooOOOo.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f2618OooOOOo;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o00oO0o ? new o00oO0o((o00oO0o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00oO0o((ViewGroup.MarginLayoutParams) layoutParams) : new o00oO0o(layoutParams);
    }
}