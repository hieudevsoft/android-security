package OooOooo;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oo00o implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final WeakHashMap f1377OooO00o = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            WeakHashMap weakHashMap = this.f1377OooO00o;
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (booleanValue != z) {
                    if (z) {
                        i = 16;
                    } else {
                        i = 32;
                    }
                    o0o0Oo.OooO0oO(view, i);
                    weakHashMap.put(view, Boolean.valueOf(z));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}