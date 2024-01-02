package OooOooo;

import OooOo.OooO0OO;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import hieubui.eup.android_app_security.R;

/* loaded from: classes.dex */
public abstract class oo0oOO0 {
    public static float OooO(View view) {
        return view.getElevation();
    }

    public static void OooO00o(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static o0O0OOOo OooO0O0(View view, o0O0OOOo o0o0oooo, Rect rect) {
        WindowInsets OooO0oO2 = o0o0oooo.OooO0oO();
        if (OooO0oO2 != null) {
            return o0O0OOOo.OooO0oo(view, view.computeSystemWindowInsets(OooO0oO2, rect));
        }
        rect.setEmpty();
        return o0o0oooo;
    }

    public static boolean OooO0OO(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean OooO0Oo(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static boolean OooO0o(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static boolean OooO0o0(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static ColorStateList OooO0oO(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode OooO0oo(View view) {
        return view.getBackgroundTintMode();
    }

    public static o0O0OOOo OooOO0(View view) {
        if (o0O00OO.f1329OooO0Oo && view.isAttachedToWindow()) {
            try {
                Object obj = o0O00OO.f1326OooO00o.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) o0O00OO.f1327OooO0O0.get(obj);
                    Rect rect2 = (Rect) o0O00OO.f1328OooO0OO.get(obj);
                    if (rect != null && rect2 != null) {
                        Object obj2 = new OooO0Oo.o0000OO0(13).f183OooO0O0;
                        ((o0O00oO0) obj2).OooO0o0(OooO0OO.OooO0O0(rect.left, rect.top, rect.right, rect.bottom));
                        ((o0O00oO0) obj2).OooO0oO(OooO0OO.OooO0O0(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        o0O0OOOo OooO0O02 = ((o0O00oO0) obj2).OooO0O0();
                        OooO0O02.f1355OooO00o.OooOOOo(OooO0O02);
                        OooO0O02.f1355OooO00o.OooO0Oo(view.getRootView());
                        return OooO0O02;
                    }
                }
            } catch (IllegalAccessException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static String OooOO0O(View view) {
        return view.getTransitionName();
    }

    public static float OooOO0o(View view) {
        return view.getTranslationZ();
    }

    public static boolean OooOOO(View view) {
        return view.hasNestedScrollingParent();
    }

    public static float OooOOO0(View view) {
        return view.getZ();
    }

    public static boolean OooOOOO(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean OooOOOo(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void OooOOo(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void OooOOo0(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void OooOOoo(View view, float f) {
        view.setElevation(f);
    }

    public static void OooOo(View view, float f) {
        view.setZ(f);
    }

    public static void OooOo0(View view, o0O0ooO o0o0ooo) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, o0o0ooo);
        }
        if (o0o0ooo == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new o00O0OOO(view, o0o0ooo));
        }
    }

    public static void OooOo00(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static void OooOo0O(View view, String str) {
        view.setTransitionName(str);
    }

    public static void OooOo0o(View view, float f) {
        view.setTranslationZ(f);
    }

    public static void OooOoO(View view) {
        view.stopNestedScroll();
    }

    public static boolean OooOoO0(View view, int i) {
        return view.startNestedScroll(i);
    }
}