package OooooOo;

import OooOooo.o0o0Oo;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oO00Oo00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final View f1842OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1843OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1844OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1845OooO0Oo;

    public oO00Oo00(View view) {
        this.f1842OooO00o = view;
    }

    public final void OooO00o() {
        int i = this.f1845OooO0Oo;
        View view = this.f1842OooO00o;
        int top = i - (view.getTop() - this.f1843OooO0O0);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f1844OooO0OO));
    }
}