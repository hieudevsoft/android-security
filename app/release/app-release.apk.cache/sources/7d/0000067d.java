package o000oOoO;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o00O00O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f5067OooO00o = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5068OooO0O0 = Integer.MIN_VALUE;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5069OooO0OO = Integer.MIN_VALUE;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5070OooO0Oo = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f5071OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f5072OooO0o0;

    public o00O00O(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f5071OooO0o = staggeredGridLayoutManager;
        this.f5072OooO0o0 = i;
    }

    public static o00O000 OooO0oo(View view) {
        return (o00O000) view.getLayoutParams();
    }

    public final int OooO(int i) {
        int i2 = this.f5068OooO0O0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f5067OooO00o;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        o00O000 OooO0oo2 = OooO0oo(view);
        this.f5068OooO0O0 = this.f5071OooO0o.f3208OooOOo.OooO0Oo(view);
        OooO0oo2.getClass();
        return this.f5068OooO0O0;
    }

    public final void OooO00o() {
        ArrayList arrayList = this.f5067OooO00o;
        View view = (View) arrayList.get(arrayList.size() - 1);
        o00O000 OooO0oo2 = OooO0oo(view);
        this.f5069OooO0OO = this.f5071OooO0o.f3208OooOOo.OooO0O0(view);
        OooO0oo2.getClass();
    }

    public final void OooO0O0() {
        this.f5067OooO00o.clear();
        this.f5068OooO0O0 = Integer.MIN_VALUE;
        this.f5069OooO0OO = Integer.MIN_VALUE;
        this.f5070OooO0Oo = 0;
    }

    public final int OooO0OO() {
        boolean z = this.f5071OooO0o.f3215OooOo0o;
        ArrayList arrayList = this.f5067OooO00o;
        return z ? OooO0o0(arrayList.size() - 1, -1) : OooO0o0(0, arrayList.size());
    }

    public final int OooO0Oo() {
        boolean z = this.f5071OooO0o.f3215OooOo0o;
        ArrayList arrayList = this.f5067OooO00o;
        return z ? OooO0o0(0, arrayList.size()) : OooO0o0(arrayList.size() - 1, -1);
    }

    public final int OooO0o(int i) {
        int i2 = this.f5069OooO0OO;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f5067OooO00o.size() == 0) {
            return i;
        }
        OooO00o();
        return this.f5069OooO0OO;
    }

    public final int OooO0o0(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5071OooO0o;
        int OooO0oo2 = staggeredGridLayoutManager.f3208OooOOo.OooO0oo();
        int OooO0o2 = staggeredGridLayoutManager.f3208OooOOo.OooO0o();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) this.f5067OooO00o.get(i);
            int OooO0Oo2 = staggeredGridLayoutManager.f3208OooOOo.OooO0Oo(view);
            int OooO0O02 = staggeredGridLayoutManager.f3208OooOOo.OooO0O0(view);
            boolean z2 = false;
            if (OooO0Oo2 <= OooO0o2) {
                z = true;
            } else {
                z = false;
            }
            if (OooO0O02 >= OooO0oo2) {
                z2 = true;
            }
            if (z && z2 && (OooO0Oo2 < OooO0oo2 || OooO0O02 > OooO0o2)) {
                return o000OO.Oooo000(view);
            }
            i += i3;
        }
        return -1;
    }

    public final View OooO0oO(int i, int i2) {
        ArrayList arrayList = this.f5067OooO00o;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f5071OooO0o;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f3215OooOo0o && o000OO.Oooo000(view2) >= i) || ((!staggeredGridLayoutManager.f3215OooOo0o && o000OO.Oooo000(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f3215OooOo0o && o000OO.Oooo000(view3) <= i) || ((!staggeredGridLayoutManager.f3215OooOo0o && o000OO.Oooo000(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }
}