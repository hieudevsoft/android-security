package o00o0O;

import OooOooo.o00O0OO;
import OooOooo.o0o0Oo;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Oooo000 implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0OO.OooO0OO(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}