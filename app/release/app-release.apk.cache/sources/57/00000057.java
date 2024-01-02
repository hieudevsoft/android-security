package OooO0oO;

import OooOooo.o0o0Oo;
import Oooo000.OooO0OO;
import Oooo000.OooO0o;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import o0OOO0o.Oooo0;

/* loaded from: classes.dex */
public final class o000OO00 implements View.OnAttachStateChangeListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f349OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f350OooO0O0;

    public /* synthetic */ o000OO00(int i, Object obj) {
        this.f349OooO00o = i;
        this.f350OooO0O0 = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f349OooO00o) {
            case 0:
            case 1:
                return;
            default:
                Oooo0 oooo0 = (Oooo0) this.f350OooO0O0;
                int i = Oooo0.f5351OooOo0o;
                if (oooo0.f5370OooOo0 != null && (accessibilityManager = oooo0.f5371OooOo00) != null) {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    if (OooOooo.oo0o0O0.OooO0O0(oooo0)) {
                        OooO0OO.OooO00o(accessibilityManager, oooo0.f5370OooOo0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.f349OooO00o;
        Object obj = this.f350OooO0O0;
        switch (i) {
            case 0:
                o00O0000 o00o0000 = (o00O0000) obj;
                ViewTreeObserver viewTreeObserver = o00o0000.f386OooOoO0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        o00o0000.f386OooOoO0 = view.getViewTreeObserver();
                    }
                    o00o0000.f386OooOoO0.removeGlobalOnLayoutListener(o00o0000.f371OooOO0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                oo0O oo0o = (oo0O) obj;
                ViewTreeObserver viewTreeObserver2 = oo0o.f489OooOOOo;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        oo0o.f489OooOOOo = view.getViewTreeObserver();
                    }
                    oo0o.f489OooOOOo.removeGlobalOnLayoutListener(oo0o.f484OooOO0);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                Oooo0 oooo0 = (Oooo0) obj;
                int i2 = Oooo0.f5351OooOo0o;
                OooO0o oooO0o = oooo0.f5370OooOo0;
                if (oooO0o != null && (accessibilityManager = oooo0.f5371OooOo00) != null) {
                    OooO0OO.OooO0O0(accessibilityManager, oooO0o);
                    return;
                }
                return;
        }
    }
}