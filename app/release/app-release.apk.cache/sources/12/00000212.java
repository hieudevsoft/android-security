package OoooOoo;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class oO000OOo extends oO0Oo0oo {

    /* renamed from: OooOO0  reason: collision with root package name */
    public static boolean f1671OooOO0 = true;

    @Override // o0ooOO0.OooOOO0
    public void OooOo(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooOo(view, i);
        } else if (f1671OooOO0) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f1671OooOO0 = false;
            }
        }
    }
}