package OooOOoo;

import OooOOo.Oooo000;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class o00oO0o extends ViewGroup.MarginLayoutParams {

    /* renamed from: OooO  reason: collision with root package name */
    public int f1086OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00Oo0 f1087OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f1088OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1089OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1090OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f1091OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f1092OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f1093OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f1094OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f1095OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public View f1096OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public View f1097OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f1098OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f1099OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public final Rect f1100OooOOOo;

    public o00oO0o() {
        super(-2, -2);
        this.f1088OooO0O0 = false;
        this.f1089OooO0OO = 0;
        this.f1090OooO0Oo = 0;
        this.f1092OooO0o0 = -1;
        this.f1091OooO0o = -1;
        this.f1093OooO0oO = 0;
        this.f1094OooO0oo = 0;
        this.f1100OooOOOo = new Rect();
    }

    public final boolean OooO00o(int i) {
        if (i != 0) {
            if (i != 1) {
                return false;
            }
            return this.f1099OooOOOO;
        }
        return this.f1098OooOOO;
    }

    public o00oO0o(o00oO0o o00oo0o) {
        super((ViewGroup.MarginLayoutParams) o00oo0o);
        this.f1088OooO0O0 = false;
        this.f1089OooO0OO = 0;
        this.f1090OooO0Oo = 0;
        this.f1092OooO0o0 = -1;
        this.f1091OooO0o = -1;
        this.f1093OooO0oO = 0;
        this.f1094OooO0oo = 0;
        this.f1100OooOOOo = new Rect();
    }

    public o00oO0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        o00Oo0 o00oo0;
        this.f1088OooO0O0 = false;
        this.f1089OooO0OO = 0;
        this.f1090OooO0Oo = 0;
        this.f1092OooO0o0 = -1;
        this.f1091OooO0o = -1;
        this.f1093OooO0oO = 0;
        this.f1094OooO0oo = 0;
        this.f1100OooOOOo = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Oooo000.f862OooO0O0);
        this.f1089OooO0OO = obtainStyledAttributes.getInteger(0, 0);
        this.f1091OooO0o = obtainStyledAttributes.getResourceId(1, -1);
        this.f1090OooO0Oo = obtainStyledAttributes.getInteger(2, 0);
        this.f1092OooO0o0 = obtainStyledAttributes.getInteger(6, -1);
        this.f1093OooO0oO = obtainStyledAttributes.getInt(5, 0);
        this.f1094OooO0oo = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f1088OooO0O0 = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f2601OooOo00;
            if (TextUtils.isEmpty(string)) {
                o00oo0 = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f2601OooOo00;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f2602OooOo0O;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f2600OooOo0);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    o00oo0 = (o00Oo0) constructor.newInstance(context, attributeSet);
                } catch (Exception e) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e);
                }
            }
            this.f1087OooO00o = o00oo0;
        }
        obtainStyledAttributes.recycle();
        o00Oo0 o00oo02 = this.f1087OooO00o;
        if (o00oo02 != null) {
            o00oo02.OooO0OO(this);
        }
    }

    public o00oO0o(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1088OooO0O0 = false;
        this.f1089OooO0OO = 0;
        this.f1090OooO0Oo = 0;
        this.f1092OooO0o0 = -1;
        this.f1091OooO0o = -1;
        this.f1093OooO0oO = 0;
        this.f1094OooO0oo = 0;
        this.f1100OooOOOo = new Rect();
    }

    public o00oO0o(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1088OooO0O0 = false;
        this.f1089OooO0OO = 0;
        this.f1090OooO0Oo = 0;
        this.f1092OooO0o0 = -1;
        this.f1091OooO0o = -1;
        this.f1093OooO0oO = 0;
        this.f1094OooO0oo = 0;
        this.f1100OooOOOo = new Rect();
    }
}