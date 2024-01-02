package OooooOO;

import Oooo.OooOOO;
import Oooo.OooOOO0;
import Oooo.OooOOOO;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class oO00O0o0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final LinearInterpolator f1815OooO00o = new LinearInterpolator();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooOOO f1816OooO0O0 = new OooOOO();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final OooOOO0 f1817OooO0OO = new OooOOO0();

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final OooOOOO f1818OooO0Oo = new OooOOOO();

    static {
        new DecelerateInterpolator();
    }

    public static float OooO00o(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return ((f2 - f) * ((f5 - f3) / (f4 - f3))) + f;
    }
}