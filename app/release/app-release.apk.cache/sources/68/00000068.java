package OooO0oO;

import OooOooo.o0o0Oo;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class o00O0OOO {

    /* renamed from: OooO  reason: collision with root package name */
    public oo0oOO0 f449OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Context f450OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O00O f451OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f452OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f453OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public View f454OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f455OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f456OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f457OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public o00O0OO0 f458OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public PopupWindow.OnDismissListener f459OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final oo0o0O0 f460OooOO0o;

    public o00O0OOO(int i, int i2, Context context, View view, o00O00O o00o00o, boolean z) {
        this.f456OooO0oO = 8388611;
        this.f460OooOO0o = new oo0o0O0(this);
        this.f450OooO00o = context;
        this.f451OooO0O0 = o00o00o;
        this.f454OooO0o = view;
        this.f452OooO0OO = z;
        this.f453OooO0Oo = i;
        this.f455OooO0o0 = i2;
    }

    public final o00O0OO0 OooO00o() {
        boolean z;
        o00O0OO0 oo0o;
        if (this.f458OooOO0 == null) {
            Context context = this.f450OooO00o;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            o00O0OO.OooO00o(defaultDisplay, point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                oo0o = new o00O0000(this.f450OooO00o, this.f454OooO0o, this.f453OooO0Oo, this.f455OooO0o0, this.f452OooO0OO);
            } else {
                Context context2 = this.f450OooO00o;
                o00O00O o00o00o = this.f451OooO0O0;
                oo0o = new oo0O(this.f453OooO0Oo, this.f455OooO0o0, context2, this.f454OooO0o, o00o00o, this.f452OooO0OO);
            }
            oo0o.OooOO0o(this.f451OooO0O0);
            oo0o.OooOOo(this.f460OooOO0o);
            oo0o.OooOOO(this.f454OooO0o);
            oo0o.OooOO0(this.f449OooO);
            oo0o.OooOOOO(this.f457OooO0oo);
            oo0o.OooOOOo(this.f456OooO0oO);
            this.f458OooOO0 = oo0o;
        }
        return this.f458OooOO0;
    }

    public final boolean OooO0O0() {
        o00O0OO0 o00o0oo0 = this.f458OooOO0;
        return o00o0oo0 != null && o00o0oo0.OooO0O0();
    }

    public void OooO0OO() {
        this.f458OooOO0 = null;
        PopupWindow.OnDismissListener onDismissListener = this.f459OooOO0O;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void OooO0Oo(int i, int i2, boolean z, boolean z2) {
        o00O0OO0 OooO00o2 = OooO00o();
        OooO00o2.OooOOoo(z2);
        if (z) {
            int i3 = this.f456OooO0oO;
            View view = this.f454OooO0o;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            if ((Gravity.getAbsoluteGravity(i3, OooOooo.o00O0O0O.OooO0Oo(view)) & 7) == 5) {
                i -= this.f454OooO0o.getWidth();
            }
            OooO00o2.OooOOo0(i);
            OooO00o2.OooOo00(i2);
            int i4 = (int) ((this.f450OooO00o.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            OooO00o2.f448OooO00o = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        OooO00o2.OooO();
    }

    public o00O0OOO(Context context, o00O00O o00o00o, View view, boolean z) {
        this(R.attr.actionOverflowMenuStyle, 0, context, view, o00o00o, z);
    }
}