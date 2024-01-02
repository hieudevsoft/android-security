package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class o00OOOO0 implements AbsListView.OnScrollListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o00Oo00 f2363OooO00o;

    public o00OOOO0(o00Oo00 o00oo00) {
        this.f2363OooO00o = o00oo00;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z = true;
        if (i == 1) {
            o00Oo00 o00oo00 = this.f2363OooO00o;
            if (o00oo00.f2397OooOoO.getInputMethodMode() != 2) {
                z = false;
            }
            if (!z && o00oo00.f2397OooOoO.getContentView() != null) {
                Handler handler = o00oo00.f2395OooOo0O;
                o00OO o00oo = o00oo00.f2389OooOOo;
                handler.removeCallbacks(o00oo);
                o00oo.run();
            }
        }
    }
}