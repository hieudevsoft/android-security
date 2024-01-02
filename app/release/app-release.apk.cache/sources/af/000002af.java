package androidx.appcompat.widget;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class o000O000 implements PopupWindow.OnDismissListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2290OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000O0o f2291OooO0O0;

    public o000O000(o000O0o o000o0o, OooO0oO.o000O o000o) {
        this.f2291OooO0O0 = o000o0o;
        this.f2290OooO00o = o000o;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2291OooO0O0.f2309Oooo00O.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2290OooO00o);
        }
    }
}