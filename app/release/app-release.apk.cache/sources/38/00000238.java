package OooooOo;

import OooOOoo.o00Oo0;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public abstract class oO00OOo0 extends o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public oO00Oo00 f1840OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1841OooO0O0;

    public oO00OOo0() {
        this.f1841OooO0O0 = 0;
    }

    @Override // OooOOoo.o00Oo0
    public boolean OooO0oO(CoordinatorLayout coordinatorLayout, View view, int i) {
        OooOOo(coordinatorLayout, view, i);
        if (this.f1840OooO00o == null) {
            this.f1840OooO00o = new oO00Oo00(view);
        }
        oO00Oo00 oo00oo00 = this.f1840OooO00o;
        View view2 = oo00oo00.f1842OooO00o;
        oo00oo00.f1843OooO0O0 = view2.getTop();
        oo00oo00.f1844OooO0OO = view2.getLeft();
        this.f1840OooO00o.OooO00o();
        int i2 = this.f1841OooO0O0;
        if (i2 != 0) {
            oO00Oo00 oo00oo002 = this.f1840OooO00o;
            if (oo00oo002.f1845OooO0Oo != i2) {
                oo00oo002.f1845OooO0Oo = i2;
                oo00oo002.OooO00o();
            }
            this.f1841OooO0O0 = 0;
            return true;
        }
        return true;
    }

    public void OooOOo(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.OooOOOo(view, i);
    }

    public oO00OOo0(int i) {
        super(0);
        this.f1841OooO0O0 = 0;
    }
}