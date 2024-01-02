package OooOooo;

import OooOo.OooO0OO;
import OooOooO.o0000oo;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O0OOOo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0O0OOOo f1354OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O0OO0 f1355OooO00o;

    static {
        f1354OooO0O0 = Build.VERSION.SDK_INT >= 30 ? o0O0O0o0.f1351OooOOo0 : o0O0OO0.f1352OooO0O0;
    }

    public o0O0OOOo() {
        this.f1355OooO00o = new o0O0OO0(this);
    }

    public static OooO0OO OooO0o(OooO0OO oooO0OO, int i, int i2, int i3, int i4) {
        int max = Math.max(0, oooO0OO.f1110OooO00o - i);
        int max2 = Math.max(0, oooO0OO.f1111OooO0O0 - i2);
        int max3 = Math.max(0, oooO0OO.f1112OooO0OO - i3);
        int max4 = Math.max(0, oooO0OO.f1113OooO0Oo - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? oooO0OO : OooO0OO.OooO0O0(max, max2, max3, max4);
    }

    public static o0O0OOOo OooO0oo(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        o0O0OOOo o0o0oooo = new o0O0OOOo(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if (oo0o0O0.OooO0O0(view)) {
                o0O0OOOo OooO00o2 = o00O.OooO00o(view);
                o0O0OO0 o0o0oo0 = o0o0oooo.f1355OooO00o;
                o0o0oo0.OooOOOo(OooO00o2);
                o0o0oo0.OooO0Oo(view.getRootView());
            }
        }
        return o0o0oooo;
    }

    public final OooO0OO OooO00o(int i) {
        return this.f1355OooO00o.OooO0o(i);
    }

    public final int OooO0O0() {
        return this.f1355OooO00o.OooOO0().f1113OooO0Oo;
    }

    public final int OooO0OO() {
        return this.f1355OooO00o.OooOO0().f1110OooO00o;
    }

    public final int OooO0Oo() {
        return this.f1355OooO00o.OooOO0().f1112OooO0OO;
    }

    public final int OooO0o0() {
        return this.f1355OooO00o.OooOO0().f1111OooO0O0;
    }

    public final WindowInsets OooO0oO() {
        o0O0OO0 o0o0oo0 = this.f1355OooO00o;
        if (o0o0oo0 instanceof o0O0O0O) {
            return ((o0O0O0O) o0o0oo0).f1343OooO0OO;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0O0OOOo)) {
            return false;
        }
        return o0000oo.OooO00o(this.f1355OooO00o, ((o0O0OOOo) obj).f1355OooO00o);
    }

    public final int hashCode() {
        o0O0OO0 o0o0oo0 = this.f1355OooO00o;
        if (o0o0oo0 == null) {
            return 0;
        }
        return o0o0oo0.hashCode();
    }

    public o0O0OOOo(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        this.f1355OooO00o = i >= 30 ? new o0O0O0o0(this, windowInsets) : i >= 29 ? new o0O0O0Oo(this, windowInsets) : i >= 28 ? new o0O0oo0o(this, windowInsets) : new o0oO0O0o(this, windowInsets);
    }
}