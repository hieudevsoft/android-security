package androidx.activity;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
final class ImmLeaksCleaner implements androidx.lifecycle.o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static int f1905OooO00o;

    @Override // androidx.lifecycle.o00O0O
    public final void OooO0O0(androidx.lifecycle.o00Ooo o00ooo2, androidx.lifecycle.OooOo oooOo) {
        if (oooOo != androidx.lifecycle.OooOo.ON_DESTROY) {
            return;
        }
        if (f1905OooO00o == 0) {
            try {
                f1905OooO00o = 2;
                InputMethodManager.class.getDeclaredField("mServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mNextServedView").setAccessible(true);
                InputMethodManager.class.getDeclaredField("mH").setAccessible(true);
                f1905OooO00o = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f1905OooO00o != 1) {
            return;
        }
        throw null;
    }
}