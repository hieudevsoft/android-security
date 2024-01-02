package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import o000oOoO.o00O00OO;

/* loaded from: classes.dex */
public final class OooOo implements OooOoOO.o000OOo, o00O00OO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2790OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f2791OooO0O0;

    public /* synthetic */ OooOo(int i, Object obj) {
        this.f2790OooO00o = i;
        this.f2791OooO0O0 = obj;
    }

    public int OooO00o(View view) {
        int bottom;
        int i;
        int i2 = this.f2790OooO00o;
        Object obj = this.f2791OooO0O0;
        switch (i2) {
            case 0:
                ((o000oOoO.o000OO) obj).getClass();
                bottom = view.getRight() + ((o000oOoO.o0000O) view.getLayoutParams()).f4955OooO0O0.right;
                i = ((ViewGroup.MarginLayoutParams) ((o000oOoO.o0000O) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((o000oOoO.o000OO) obj).getClass();
                bottom = view.getBottom() + ((o000oOoO.o0000O) view.getLayoutParams()).f4955OooO0O0.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((o000oOoO.o0000O) view.getLayoutParams())).bottomMargin;
                break;
        }
        return bottom + i;
    }

    public int OooO0O0(View view) {
        int top;
        int i;
        int i2 = this.f2790OooO00o;
        Object obj = this.f2791OooO0O0;
        switch (i2) {
            case 0:
                ((o000oOoO.o000OO) obj).getClass();
                top = view.getLeft() - ((o000oOoO.o0000O) view.getLayoutParams()).f4955OooO0O0.left;
                i = ((ViewGroup.MarginLayoutParams) ((o000oOoO.o0000O) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((o000oOoO.o000OO) obj).getClass();
                top = view.getTop() - ((o000oOoO.o0000O) view.getLayoutParams()).f4955OooO0O0.top;
                i = ((ViewGroup.MarginLayoutParams) ((o000oOoO.o0000O) view.getLayoutParams())).topMargin;
                break;
        }
        return top - i;
    }

    @Override // OooOoOO.o000OOo
    public void OooO0OO() {
        View view;
        View view2;
        int i = this.f2790OooO00o;
        Object obj = this.f2791OooO0O0;
        switch (i) {
            case 1:
                o00Oo0 o00oo0 = (o00Oo0) obj;
                o0OoOo0 o0oooo0 = o00oo0.f2984Oooo00o;
                if (o0oooo0 == null) {
                    view = null;
                } else {
                    view = o0oooo0.f3020OooO00o;
                }
                if (view != null) {
                    if (o0oooo0 == null) {
                        view2 = null;
                    } else {
                        view2 = o0oooo0.f3020OooO00o;
                    }
                    o00oo0.OooO0o().f3020OooO00o = null;
                    view2.clearAnimation();
                }
                o00oo0.OooO0o().f3021OooO0O0 = null;
                return;
            default:
                ((o00O0000) obj).OooO00o();
                return;
        }
    }

    public int OooO0Oo() {
        int i;
        int OooOoo02;
        int i2 = this.f2790OooO00o;
        Object obj = this.f2791OooO0O0;
        switch (i2) {
            case 0:
                o000oOoO.o000OO o000oo = (o000oOoO.o000OO) obj;
                i = o000oo.f5017OooOOO;
                OooOoo02 = o000oo.OooOooO();
                break;
            default:
                o000oOoO.o000OO o000oo2 = (o000oOoO.o000OO) obj;
                i = o000oo2.f5018OooOOOO;
                OooOoo02 = o000oo2.OooOoo0();
                break;
        }
        return i - OooOoo02;
    }

    public void OooO0o0() {
        ((o00oO0o) this.f2791OooO0O0).f2995OoooOOO.Oooo0OO();
    }
}