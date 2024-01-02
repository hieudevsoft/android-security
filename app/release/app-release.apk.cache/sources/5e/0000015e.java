package OooOooo;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class o0O00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0O00O0o f1321OooO00o;

    public o0O00O(int i, Interpolator interpolator, long j) {
        this.f1321OooO00o = Build.VERSION.SDK_INT >= 30 ? new o0OoO00O(o00O00O.OooO(i, interpolator, j)) : new o0O000o0(i, interpolator, j);
    }

    public o0O00O(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f1321OooO00o = new o0OoO00O(windowInsetsAnimation);
        }
    }
}