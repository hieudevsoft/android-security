package OoooOoo;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public abstract class oO0OoOO0 extends oO0o0o {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static boolean f1690OooO0oO = true;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static boolean f1691OooO0oo = true;

    public void OooOoo(View view, Matrix matrix) {
        if (f1690OooO0oO) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f1690OooO0oO = false;
            }
        }
    }

    public void OooOooO(View view, Matrix matrix) {
        if (f1691OooO0oo) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f1691OooO0oo = false;
            }
        }
    }
}