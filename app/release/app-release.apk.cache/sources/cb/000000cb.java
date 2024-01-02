package OooOOoo;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public abstract class o0OO00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final ThreadLocal f1101OooO00o = new ThreadLocal();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final ThreadLocal f1102OooO0O0 = new ThreadLocal();

    public static void OooO00o(ViewParent viewParent, View view, Matrix matrix) {
        ViewParent parent = view.getParent();
        if ((parent instanceof View) && parent != viewParent) {
            View view2 = (View) parent;
            OooO00o(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}