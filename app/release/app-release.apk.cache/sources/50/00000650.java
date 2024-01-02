package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00000O0 f4894OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0OO f4895OooO0O0 = new OooO0OO();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4896OooO0OO = new ArrayList();

    public OooO0o(o00000O0 o00000o02) {
        this.f4894OooO00o = o00000o02;
    }

    public final void OooO(View view) {
        this.f4896OooO0OO.add(view);
        o00000O0 o00000o02 = this.f4894OooO00o;
        o00000o02.getClass();
        o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
        if (Oooo02 != null) {
            int i = Oooo02.f5046OooOOo0;
            View view2 = Oooo02.f5031OooO00o;
            if (i == -1) {
                WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                i = o00O0O0.OooO0OO(view2);
            }
            Oooo02.f5044OooOOOo = i;
            RecyclerView recyclerView = o00000o02.f4953OooO00o;
            if (recyclerView.Oooo0OO()) {
                Oooo02.f5046OooOOo0 = 4;
                recyclerView.f3203o00O0O.add(Oooo02);
                return;
            }
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOoo(view2, 4);
        }
    }

    public final void OooO00o(View view, int i, boolean z) {
        int OooO0o2;
        o00000O0 o00000o02 = this.f4894OooO00o;
        if (i < 0) {
            OooO0o2 = o00000o02.OooO0OO();
        } else {
            OooO0o2 = OooO0o(i);
        }
        this.f4895OooO0O0.OooO0o0(OooO0o2, z);
        if (z) {
            OooO(view);
        }
        o00000o02.f4953OooO00o.addView(view, OooO0o2);
        RecyclerView.Oooo0(view);
    }

    public final void OooO0O0(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int OooO0o2;
        o00000O0 o00000o02 = this.f4894OooO00o;
        if (i < 0) {
            OooO0o2 = o00000o02.OooO0OO();
        } else {
            OooO0o2 = OooO0o(i);
        }
        this.f4895OooO0O0.OooO0o0(OooO0o2, z);
        if (z) {
            OooO(view);
        }
        o00000o02.getClass();
        o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
        RecyclerView recyclerView = o00000o02.f4953OooO00o;
        if (Oooo02 != null) {
            if (!Oooo02.OooOO0O() && !Oooo02.OooOOOO()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + Oooo02 + recyclerView.OooOoO0());
            }
            Oooo02.f5039OooOO0 &= -257;
        }
        recyclerView.attachViewToParent(view, OooO0o2, layoutParams);
    }

    public final void OooO0OO(int i) {
        o000OOo0 Oooo02;
        int OooO0o2 = OooO0o(i);
        this.f4895OooO0O0.OooO0o(OooO0o2);
        o00000O0 o00000o02 = this.f4894OooO00o;
        View childAt = o00000o02.f4953OooO00o.getChildAt(OooO0o2);
        RecyclerView recyclerView = o00000o02.f4953OooO00o;
        if (childAt != null && (Oooo02 = RecyclerView.Oooo0(childAt)) != null) {
            if (Oooo02.OooOO0O() && !Oooo02.OooOOOO()) {
                throw new IllegalArgumentException("called detach on an already detached child " + Oooo02 + recyclerView.OooOoO0());
            }
            Oooo02.OooO0O0(256);
        }
        recyclerView.detachViewFromParent(OooO0o2);
    }

    public final View OooO0Oo(int i) {
        return this.f4894OooO00o.f4953OooO00o.getChildAt(OooO0o(i));
    }

    public final int OooO0o(int i) {
        if (i < 0) {
            return -1;
        }
        int OooO0OO2 = this.f4894OooO00o.OooO0OO();
        int i2 = i;
        while (i2 < OooO0OO2) {
            OooO0OO oooO0OO = this.f4895OooO0O0;
            int OooO0O02 = i - (i2 - oooO0OO.OooO0O0(i2));
            if (OooO0O02 == 0) {
                while (oooO0OO.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += OooO0O02;
        }
        return -1;
    }

    public final int OooO0o0() {
        return this.f4894OooO00o.OooO0OO() - this.f4896OooO0OO.size();
    }

    public final View OooO0oO(int i) {
        return this.f4894OooO00o.f4953OooO00o.getChildAt(i);
    }

    public final int OooO0oo() {
        return this.f4894OooO00o.OooO0OO();
    }

    public final boolean OooOO0(View view) {
        return this.f4896OooO0OO.contains(view);
    }

    public final void OooOO0O(View view) {
        if (this.f4896OooO0OO.remove(view)) {
            o00000O0 o00000o02 = this.f4894OooO00o;
            o00000o02.getClass();
            o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
            if (Oooo02 != null) {
                int i = Oooo02.f5044OooOOOo;
                RecyclerView recyclerView = o00000o02.f4953OooO00o;
                if (recyclerView.Oooo0OO()) {
                    Oooo02.f5046OooOOo0 = i;
                    recyclerView.f3203o00O0O.add(Oooo02);
                } else {
                    WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                    o00O0O0.OooOOoo(Oooo02.f5031OooO00o, i);
                }
                Oooo02.f5044OooOOOo = 0;
            }
        }
    }

    public final String toString() {
        return this.f4895OooO0O0.toString() + ", hidden list:" + this.f4896OooO0OO.size();
    }
}