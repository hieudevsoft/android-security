package androidx.recyclerview.widget;

import OooO0O0.OooO00o;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo000.Oooo0;
import Oooo000.o000oOoO;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o0O0o00O;
import java.util.WeakHashMap;
import o000oOoO.o0000O;
import o000oOoO.o000O00;
import o000oOoO.o000O0O0;
import o000oOoO.o000OO;
import o000oOoO.o00O0O;
import o000oOoO.o0Oo0oo;
import o000oOoO.o0ooOOo;
import o000oOoO.oo000o;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: OooOooo  reason: collision with root package name */
    public boolean f3117OooOooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public final SparseIntArray f3118Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public int f3119Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public int[] f3120Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public View[] f3121Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public final SparseIntArray f3122Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public final o0O0o00O f3123Oooo0OO;

    /* renamed from: Oooo0o0  reason: collision with root package name */
    public final Rect f3124Oooo0o0;

    public GridLayoutManager(int i) {
        super(1);
        this.f3117OooOooo = false;
        this.f3119Oooo000 = -1;
        this.f3118Oooo0 = new SparseIntArray();
        this.f3122Oooo0O0 = new SparseIntArray();
        this.f3123Oooo0OO = new o0O0o00O(1);
        this.f3124Oooo0o0 = new Rect();
        o0000oOO(i);
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0o(o0000O o0000o2) {
        return o0000o2 instanceof oo000o;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int OooOO0O(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int OooOO0o(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int OooOOO(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int OooOOOO(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final o0000O OooOOo() {
        return this.f3125OooOOOo == 0 ? new oo000o(-2, -1) : new oo000o(-1, -2);
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOOoo(Context context, AttributeSet attributeSet) {
        return new oo000o(context, attributeSet);
    }

    @Override // o000oOoO.o000OO
    public final int OooOo(o000O00 o000o00, o000O0O0 o000o0o0) {
        if (this.f3125OooOOOo == 1) {
            return this.f3119Oooo000;
        }
        if (o000o0o0.OooO0O0() < 1) {
            return 0;
        }
        return o0000o0O(o000o0o0.OooO0O0() - 1, o000o00, o000o0o0) + 1;
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOo00(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new oo000o((ViewGroup.MarginLayoutParams) layoutParams) : new oo000o(layoutParams);
    }

    @Override // o000oOoO.o000OO
    public final int Oooo00o(o000O00 o000o00, o000O0O0 o000o0o0) {
        if (this.f3125OooOOOo == 0) {
            return this.f3119Oooo000;
        }
        if (o000o0o0.OooO0O0() < 1) {
            return 0;
        }
        return o0000o0O(o000o0o0.OooO0O0() - 1, o000o00, o000o0o0) + 1;
    }

    @Override // o000oOoO.o000OO
    public final void OoooO(o000O00 o000o00, o000O0O0 o000o0o0, View view, o000oOoO o000oooo) {
        int i;
        int i2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof oo000o)) {
            OoooO0O(view, o000oooo);
            return;
        }
        oo000o oo000oVar = (oo000o) layoutParams;
        int o0000o0O2 = o0000o0O(oo000oVar.OooO00o(), o000o00, o000o0o0);
        int i3 = 1;
        if (this.f3125OooOOOo == 0) {
            int i4 = oo000oVar.f5170OooO0o0;
            int i5 = oo000oVar.f5169OooO0o;
            i = o0000o0O2;
            o0000o0O2 = i4;
            i2 = 1;
            i3 = i5;
        } else {
            i = oo000oVar.f5170OooO0o0;
            i2 = oo000oVar.f5169OooO0o;
        }
        o000oooo.OooO(Oooo0.OooO00o(o0000o0O2, i3, i, i2, false));
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00df, code lost:
        if (r13 == r5) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010f, code lost:
        if (r13 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011b  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View OoooO00(android.view.View r23, int r24, o000oOoO.o000O00 r25, o000oOoO.o000O0O0 r26) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.OoooO00(android.view.View, int, o000oOoO.o000O00, o000oOoO.o000O0O0):android.view.View");
    }

    @Override // o000oOoO.o000OO
    public final void OoooOO0(int i, int i2) {
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        o0o0o00o.OooO0Oo();
        ((SparseIntArray) o0o0o00o.f2478OooO0Oo).clear();
    }

    @Override // o000oOoO.o000OO
    public final void OoooOOO(int i, int i2) {
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        o0o0o00o.OooO0Oo();
        ((SparseIntArray) o0o0o00o.f2478OooO0Oo).clear();
    }

    @Override // o000oOoO.o000OO
    public final void OoooOOo(int i, int i2) {
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        o0o0o00o.OooO0Oo();
        ((SparseIntArray) o0o0o00o.f2478OooO0Oo).clear();
    }

    @Override // o000oOoO.o000OO
    public final void OoooOo0(int i, int i2) {
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        o0o0o00o.OooO0Oo();
        ((SparseIntArray) o0o0o00o.f2478OooO0Oo).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final void OoooOoO(o000O00 o000o00, o000O0O0 o000o0o0) {
        boolean z = o000o0o0.f4988OooO0oO;
        SparseIntArray sparseIntArray = this.f3122Oooo0O0;
        SparseIntArray sparseIntArray2 = this.f3118Oooo0;
        if (z) {
            int OooOo0O2 = OooOo0O();
            for (int i = 0; i < OooOo0O2; i++) {
                oo000o oo000oVar = (oo000o) OooOo0(i).getLayoutParams();
                int OooO00o2 = oo000oVar.OooO00o();
                sparseIntArray2.put(OooO00o2, oo000oVar.f5169OooO0o);
                sparseIntArray.put(OooO00o2, oo000oVar.f5170OooO0o0);
            }
        }
        super.OoooOoO(o000o00, o000o0o0);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final void OoooOoo(o000O0O0 o000o0o0) {
        super.OoooOoo(o000o0o0);
        this.f3117OooOooo = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000O0(o000O00 o000o00, o000O0O0 o000o0o0, o0ooOOo o0ooooo, int i) {
        boolean z;
        o0000oOo();
        if (o000o0o0.OooO0O0() > 0 && !o000o0o0.f4988OooO0oO) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int o0000o0o2 = o0000o0o(o0ooooo.f5160OooO0O0, o000o00, o000o0o0);
            if (z) {
                while (o0000o0o2 > 0) {
                    int i2 = o0ooooo.f5160OooO0O0;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    o0ooooo.f5160OooO0O0 = i3;
                    o0000o0o2 = o0000o0o(i3, o000o00, o000o0o0);
                }
            } else {
                int OooO0O02 = o000o0o0.OooO0O0() - 1;
                int i4 = o0ooooo.f5160OooO0O0;
                while (i4 < OooO0O02) {
                    int i5 = i4 + 1;
                    int o0000o0o3 = o0000o0o(i5, o000o00, o000o0o0);
                    if (o0000o0o3 <= o0000o0o2) {
                        break;
                    }
                    i4 = i5;
                    o0000o0o2 = o0000o0o3;
                }
                o0ooooo.f5160OooO0O0 = i4;
            }
        }
        View[] viewArr = this.f3121Oooo00o;
        if (viewArr == null || viewArr.length != this.f3119Oooo000) {
            this.f3121Oooo00o = new View[this.f3119Oooo000];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0000OOO(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.o0000OOO(false);
    }

    public final void o0000OoO(int i) {
        int i2;
        int[] iArr = this.f3120Oooo00O;
        int i3 = this.f3119Oooo000;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f3120Oooo00O = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View o0000Ooo(o000O00 o000o00, o000O0O0 o000o0o0, int i, int i2, int i3) {
        o000000O();
        int OooO0oo2 = this.f3126OooOOo.OooO0oo();
        int OooO0o2 = this.f3126OooOOo.OooO0o();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View OooOo02 = OooOo0(i);
            int Oooo0002 = o000OO.Oooo000(OooOo02);
            if (Oooo0002 >= 0 && Oooo0002 < i3 && o0000o0o(Oooo0002, o000o00, o000o0o0) == 0) {
                if (((o0000O) OooOo02.getLayoutParams()).OooO0OO()) {
                    if (view2 == null) {
                        view2 = OooOo02;
                    }
                } else if (this.f3126OooOOo.OooO0Oo(OooOo02) < OooO0o2 && this.f3126OooOOo.OooO0O0(OooOo02) >= OooO0oo2) {
                    return OooOo02;
                } else {
                    if (view == null) {
                        view = OooOo02;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public final int o0000o(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        boolean z = o000o0o0.f4988OooO0oO;
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        if (!z) {
            o0o0o00o.getClass();
            return 1;
        }
        int i2 = this.f3118Oooo0.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (o000o00.OooO0O0(i) == -1) {
            return 1;
        }
        o0o0o00o.getClass();
        return 1;
    }

    public final int o0000o0(int i, int i2) {
        if (this.f3125OooOOOo != 1 || !o0000oo()) {
            int[] iArr = this.f3120Oooo00O;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f3120Oooo00O;
        int i3 = this.f3119Oooo000;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    public final int o0000o0O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        boolean z = o000o0o0.f4988OooO0oO;
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        if (!z || (i = o000o00.OooO0O0(i)) != -1) {
            return o0o0o00o.OooO00o(i, this.f3119Oooo000);
        }
        return 0;
    }

    public final int o0000o0o(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        boolean z = o000o0o0.f4988OooO0oO;
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        if (z) {
            int i2 = this.f3122Oooo0O0.get(i, -1);
            if (i2 != -1) {
                return i2;
            }
            i = o000o00.OooO0O0(i);
            if (i == -1) {
                return 0;
            }
        }
        return o0o0o00o.OooO0O0(i, this.f3119Oooo000);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b0  */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v42 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000oO(o000oOoO.o000O00 r20, o000oOoO.o000O0O0 r21, o000oOoO.o0Oo0oo r22, o000oOoO.o0OOO0o r23) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.o0000oO(o000oOoO.o000O00, o000oOoO.o000O0O0, o000oOoO.o0Oo0oo, o000oOoO.o0OOO0o):void");
    }

    public final void o0000oO0(View view, int i, boolean z) {
        int i2;
        int i3;
        boolean o00oO0o;
        oo000o oo000oVar = (oo000o) view.getLayoutParams();
        Rect rect = oo000oVar.f4955OooO0O0;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) oo000oVar).topMargin + ((ViewGroup.MarginLayoutParams) oo000oVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) oo000oVar).leftMargin + ((ViewGroup.MarginLayoutParams) oo000oVar).rightMargin;
        int o0000o02 = o0000o0(oo000oVar.f5170OooO0o0, oo000oVar.f5169OooO0o);
        if (this.f3125OooOOOo == 1) {
            i3 = o000OO.OooOo0o(o0000o02, i, i5, ((ViewGroup.MarginLayoutParams) oo000oVar).width, false);
            i2 = o000OO.OooOo0o(this.f3126OooOOo.OooO(), this.OooOOO0, i4, ((ViewGroup.MarginLayoutParams) oo000oVar).height, true);
        } else {
            int OooOo0o2 = o000OO.OooOo0o(o0000o02, i, i4, ((ViewGroup.MarginLayoutParams) oo000oVar).height, false);
            int OooOo0o3 = o000OO.OooOo0o(this.f3126OooOOo.OooO(), this.f5016OooOO0o, i5, ((ViewGroup.MarginLayoutParams) oo000oVar).width, true);
            i2 = OooOo0o2;
            i3 = OooOo0o3;
        }
        o0000O o0000o2 = (o0000O) view.getLayoutParams();
        if (z) {
            o00oO0o = o0ooOO0(view, i3, i2, o0000o2);
        } else {
            o00oO0o = o00oO0o(view, i3, i2, o0000o2);
        }
        if (o00oO0o) {
            view.measure(i3, i2);
        }
    }

    public final void o0000oOO(int i) {
        if (i == this.f3119Oooo000) {
            return;
        }
        this.f3117OooOooo = true;
        if (i >= 1) {
            this.f3119Oooo000 = i;
            this.f3123Oooo0OO.OooO0Oo();
            Ooooooo();
            return;
        }
        throw new IllegalArgumentException(OooO00o.OooO0O0("Span count should be at least 1. Provided ", i));
    }

    public final void o0000oOo() {
        int OooOoo02;
        int OooOooo2;
        if (this.f3125OooOOOo == 1) {
            OooOoo02 = this.f5017OooOOO - OooOooO();
            OooOooo2 = OooOoo();
        } else {
            OooOoo02 = this.f5018OooOOOO - OooOoo0();
            OooOooo2 = OooOooo();
        }
        o0000OoO(OooOoo02 - OooOooo2);
    }

    @Override // o000oOoO.o000OO
    public final void o000oOoO() {
        o0O0o00O o0o0o00o = this.f3123Oooo0OO;
        o0o0o00o.OooO0Oo();
        ((SparseIntArray) o0o0o00o.f2478OooO0Oo).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int o00O0O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        o0000oOo();
        View[] viewArr = this.f3121Oooo00o;
        if (viewArr == null || viewArr.length != this.f3119Oooo000) {
            this.f3121Oooo00o = new View[this.f3119Oooo000];
        }
        return super.o00O0O(i, o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final void o00o0O(Rect rect, int i, int i2) {
        int OooO0oO2;
        int OooO0oO3;
        if (this.f3120Oooo00O == null) {
            super.o00o0O(rect, i, i2);
        }
        int OooOooO2 = OooOooO() + OooOoo();
        int OooOoo02 = OooOoo0() + OooOooo();
        if (this.f3125OooOOOo == 1) {
            int height = rect.height() + OooOoo02;
            RecyclerView recyclerView = this.f5007OooO0O0;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            OooO0oO3 = o000OO.OooO0oO(i2, height, o00O0O0.OooO0Oo(recyclerView));
            int[] iArr = this.f3120Oooo00O;
            OooO0oO2 = o000OO.OooO0oO(i, iArr[iArr.length - 1] + OooOooO2, o00O0O0.OooO0o0(this.f5007OooO0O0));
        } else {
            int width = rect.width() + OooOooO2;
            RecyclerView recyclerView2 = this.f5007OooO0O0;
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            OooO0oO2 = o000OO.OooO0oO(i, width, o00O0O0.OooO0o0(recyclerView2));
            int[] iArr2 = this.f3120Oooo00O;
            OooO0oO3 = o000OO.OooO0oO(i2, iArr2[iArr2.length - 1] + OooOoo02, o00O0O0.OooO0Oo(this.f5007OooO0O0));
        }
        this.f5007OooO0O0.setMeasuredDimension(OooO0oO2, OooO0oO3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void o0OO00O(o000O0O0 o000o0o0, o0Oo0oo o0oo0oo, o00O0O o00o0o) {
        boolean z;
        int i = this.f3119Oooo000;
        for (int i2 = 0; i2 < this.f3119Oooo000; i2++) {
            int i3 = o0oo0oo.f5122OooO0Oo;
            if (i3 >= 0 && i3 < o000o0o0.OooO0O0()) {
                z = true;
            } else {
                z = false;
            }
            if (z && i > 0) {
                o00o0o.Oooo0oo(o0oo0oo.f5122OooO0Oo, Math.max(0, o0oo0oo.f5125OooO0oO));
                this.f3123Oooo0OO.getClass();
                i--;
                o0oo0oo.f5122OooO0Oo += o0oo0oo.f5124OooO0o0;
            } else {
                return;
            }
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final boolean o0OOO0o() {
        return this.f3134OooOoO == null && !this.f3117OooOooo;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o000oOoO.o000OO
    public final int o0OoOo0(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        o0000oOo();
        View[] viewArr = this.f3121Oooo00o;
        if (viewArr == null || viewArr.length != this.f3119Oooo000) {
            this.f3121Oooo00o = new View[this.f3119Oooo000];
        }
        return super.o0OoOo0(i, o000o00, o000o0o0);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f3117OooOooo = false;
        this.f3119Oooo000 = -1;
        this.f3118Oooo0 = new SparseIntArray();
        this.f3122Oooo0O0 = new SparseIntArray();
        this.f3123Oooo0OO = new o0O0o00O(1);
        this.f3124Oooo0o0 = new Rect();
        o0000oOO(o000OO.Oooo00O(context, attributeSet, i, i2).f4963OooO0O0);
    }
}