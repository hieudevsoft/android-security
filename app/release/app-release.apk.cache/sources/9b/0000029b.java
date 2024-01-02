package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o0 extends o00Oo00 implements o0oOO {

    /* renamed from: OooOooO  reason: collision with root package name */
    public static final Method f2242OooOooO;

    /* renamed from: OooOoo  reason: collision with root package name */
    public o0oOO f2243OooOoo;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2242OooOooO = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public o0(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // androidx.appcompat.widget.o0oOO
    public final void OooO0oO(OooO0oO.o00O00O o00o00o, MenuItem menuItem) {
        o0oOO o0ooo = this.f2243OooOoo;
        if (o0ooo != null) {
            o0ooo.OooO0oO(o00o00o, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.o0oOO
    public final void OooOO0O(OooO0oO.o00O00O o00o00o, OooO0oO.o00O00OO o00o00oo) {
        o0oOO o0ooo = this.f2243OooOoo;
        if (o0ooo != null) {
            o0ooo.OooOO0O(o00o00o, o00o00oo);
        }
    }

    @Override // androidx.appcompat.widget.o00Oo00
    public final o00OO000 OooOOo0(Context context, boolean z) {
        o0O0o o0o0o = new o0O0o(context, z);
        o0o0o.setHoverListener(this);
        return o0o0o;
    }
}