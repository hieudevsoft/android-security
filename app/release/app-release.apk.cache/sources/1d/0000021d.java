package OoooOoo;

import android.graphics.Matrix;
import android.view.View;

/* loaded from: classes.dex */
public final class ooOOOOoo extends oO000OOo {
    @Override // OoooOoo.oO000OOo, o0ooOO0.OooOOO0
    public final void OooOo(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // OoooOoo.oO0o0o
    public final float OooOoOO(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // OoooOoo.oO0OoOO0
    public final void OooOoo(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // OoooOoo.oO0o0o
    public final void OooOoo0(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // OoooOoo.oO0OoOO0
    public final void OooOooO(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // OoooOoo.oO0Oo0oo
    public final void OooOooo(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }
}