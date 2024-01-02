package OooOooo;

import OooOo.OooO0OO;
import Oooooo.o00000O;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.o0O0O00;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o0O000Oo implements View.OnApplyWindowInsetsListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000O f1316OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o0O0OOOo f1317OooO0O0;

    public o0O000Oo(View view, o00000O o00000o) {
        o0O0OOOo o0o0oooo;
        o0O00oO0 o0o00ooo;
        this.f1316OooO00o = o00000o;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o0O0OOOo OooO00o2 = o00O.OooO00o(view);
        if (OooO00o2 != null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                o0o00ooo = new o0O00o00(OooO00o2);
            } else if (i >= 29) {
                o0o00ooo = new o0oO0Ooo(OooO00o2);
            } else {
                o0o00ooo = new o0O00OOO(OooO00o2);
            }
            o0o0oooo = o0o00ooo.OooO0O0();
        } else {
            o0o0oooo = null;
        }
        this.f1317OooO0O0 = o0o0oooo;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Interpolator interpolator;
        if (!view.isLaidOut()) {
            this.f1317OooO0O0 = o0O0OOOo.OooO0oo(view, windowInsets);
        } else {
            o0O0OOOo OooO0oo2 = o0O0OOOo.OooO0oo(view, windowInsets);
            if (this.f1317OooO0O0 == null) {
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                this.f1317OooO0O0 = o00O.OooO00o(view);
            }
            if (this.f1317OooO0O0 == null) {
                this.f1317OooO0O0 = OooO0oo2;
            } else {
                o00000O OooOO02 = o0O000o0.OooOO0(view);
                if (OooOO02 != null && Objects.equals(OooOO02.f1854OooO00o, windowInsets)) {
                    return o0O000o0.OooO(view, windowInsets);
                }
                o0O0OOOo o0o0oooo = this.f1317OooO0O0;
                int i = 0;
                for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                    if (!OooO0oo2.OooO00o(i2).equals(o0o0oooo.OooO00o(i2))) {
                        i |= i2;
                    }
                }
                if (i == 0) {
                    return o0O000o0.OooO(view, windowInsets);
                }
                o0O0OOOo o0o0oooo2 = this.f1317OooO0O0;
                if ((i & 8) != 0) {
                    if (OooO0oo2.OooO00o(8).f1113OooO0Oo > o0o0oooo2.OooO00o(8).f1113OooO0Oo) {
                        interpolator = o0O000o0.f1319OooO0o0;
                    } else {
                        interpolator = o0O000o0.f1318OooO0o;
                    }
                } else {
                    interpolator = o0O000o0.f1320OooO0oO;
                }
                o0O00O o0o00o = new o0O00O(i, interpolator, 160L);
                o0O00O0o o0o00o0o = o0o00o.f1321OooO00o;
                o0o00o0o.OooO0Oo(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(o0o00o0o.OooO00o());
                OooO0OO OooO00o2 = OooO0oo2.OooO00o(i);
                OooO0OO OooO00o3 = o0o0oooo2.OooO00o(i);
                int min = Math.min(OooO00o2.f1110OooO00o, OooO00o3.f1110OooO00o);
                int i3 = OooO00o2.f1111OooO0O0;
                int i4 = OooO00o3.f1111OooO0O0;
                int min2 = Math.min(i3, i4);
                int i5 = OooO00o2.f1112OooO0OO;
                int i6 = OooO00o3.f1112OooO0OO;
                int min3 = Math.min(i5, i6);
                int i7 = OooO00o2.f1113OooO0Oo;
                int i8 = i;
                int i9 = OooO00o3.f1113OooO0Oo;
                o0O0O00 o0o0o00 = new o0O0O00(OooO0OO.OooO0O0(min, min2, min3, Math.min(i7, i9)), 4, OooO0OO.OooO0O0(Math.max(OooO00o2.f1110OooO00o, OooO00o3.f1110OooO00o), Math.max(i3, i4), Math.max(i5, i6), Math.max(i7, i9)));
                o0O000o0.OooO0o(view, windowInsets, false);
                duration.addUpdateListener(new o0O000O(o0o00o, OooO0oo2, o0o0oooo2, i8, view));
                duration.addListener(new o0oOOo(this, o0o00o, view, 1));
                o00O000o.OooO00o(view, new o0OoOoOo(view, o0o00o, o0o0o00, duration));
                this.f1317OooO0O0 = OooO0oo2;
                return o0O000o0.OooO(view, windowInsets);
            }
        }
        return o0O000o0.OooO(view, windowInsets);
    }
}