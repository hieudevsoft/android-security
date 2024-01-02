package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o0OO0oO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Method f2516OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final boolean f2517OooO0O0;

    static {
        f2517OooO0O0 = Build.VERSION.SDK_INT >= 27;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f2516OooO00o = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            declaredMethod.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean OooO00o(View view) {
        WeakHashMap weakHashMap = OooOooo.o0o0Oo.f1363OooO00o;
        if (OooOooo.o00O0O0O.OooO0Oo(view) == 1) {
            return true;
        }
        return false;
    }
}