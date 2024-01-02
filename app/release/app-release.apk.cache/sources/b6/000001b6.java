package Oooo00O;

import android.graphics.Path;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;

/* loaded from: classes.dex */
public abstract class OooO0OO {
    public static Interpolator OooO00o(float f, float f2) {
        return new PathInterpolator(f, f2);
    }

    public static Interpolator OooO0O0(float f, float f2, float f3, float f4) {
        return new PathInterpolator(f, f2, f3, f4);
    }

    public static Interpolator OooO0OO(Path path) {
        return new PathInterpolator(path);
    }
}