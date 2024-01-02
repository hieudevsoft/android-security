package OoooOoo;

import android.view.View;

/* loaded from: classes.dex */
public abstract class oO0Oo0oo extends oO0OoOO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public static boolean f1689OooO = true;

    public void OooOooo(View view, int i, int i2, int i3, int i4) {
        if (f1689OooO) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f1689OooO = false;
            }
        }
    }
}