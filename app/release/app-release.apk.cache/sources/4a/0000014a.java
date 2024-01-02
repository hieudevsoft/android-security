package OooOooo;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00O0OOO implements View.OnApplyWindowInsetsListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0O0OOOo f1298OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ View f1299OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0O0ooO f1300OooO0OO;

    public o00O0OOO(View view, o0O0ooO o0o0ooo) {
        this.f1299OooO0O0 = view;
        this.f1300OooO0OO = o0o0ooo;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        o0O0ooO o0o0ooo = this.f1300OooO0OO;
        if (i < 30) {
            oo0oOO0.OooO00o(windowInsets, this.f1299OooO0O0);
            if (OooO0oo2.equals(this.f1298OooO00o)) {
                return o0o0ooo.OooO0oo(view, OooO0oo2).OooO0oO();
            }
        }
        this.f1298OooO00o = OooO0oo2;
        o0O0OOOo OooO0oo3 = o0o0ooo.OooO0oo(view, OooO0oo2);
        if (i >= 30) {
            return OooO0oo3.OooO0oO();
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0OO.OooO0OO(view);
        return OooO0oo3.OooO0oO();
    }
}