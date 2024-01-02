package OoooOoo;

import android.view.View;
import o0ooOO0.OooOOO0;

/* loaded from: classes.dex */
public abstract class oO0o0o extends OooOOO0 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static boolean f1694OooO0o = true;

    public oO0o0o() {
        super(0);
    }

    public float OooOoOO(View view) {
        float transitionAlpha;
        if (f1694OooO0o) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f1694OooO0o = false;
            }
        }
        return view.getAlpha();
    }

    public void OooOoo0(View view, float f) {
        if (f1694OooO0o) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                f1694OooO0o = false;
            }
        }
        view.setAlpha(f);
    }
}