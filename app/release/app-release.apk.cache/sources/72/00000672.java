package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o00O0O0O;
import OooOooo.o0o0Oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class o000OO {

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f5005OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public OooO0o f5006OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public RecyclerView f5007OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final oo00o f5008OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final oo00o f5009OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f5010OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public oo0o0Oo f5011OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f5012OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final boolean f5013OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f5014OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f5015OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f5016OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f5017OooOOO;
    public int OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f5018OooOOOO;

    public o000OO() {
        androidx.fragment.app.OooOo oooOo = new androidx.fragment.app.OooOo(0, this);
        androidx.fragment.app.OooOo oooOo2 = new androidx.fragment.app.OooOo(1, this);
        this.f5008OooO0OO = new oo00o(oooOo);
        this.f5009OooO0Oo = new oo00o(oooOo2);
        this.f5010OooO0o = false;
        this.f5012OooO0oO = false;
        this.f5013OooO0oo = true;
        this.f5005OooO = true;
    }

    public static int OooO0oO(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == 1073741824) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooOo0o(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L20
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L20
            goto L2f
        L1a:
            if (r7 < 0) goto L1e
        L1c:
            r5 = r3
            goto L31
        L1e:
            if (r7 != r1) goto L22
        L20:
            r7 = r4
            goto L31
        L22:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L29
            goto L2c
        L29:
            r7 = r4
            r5 = r6
            goto L31
        L2c:
            r7 = r4
            r5 = r2
            goto L31
        L2f:
            r5 = r6
            r7 = r5
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.o000OO.OooOo0o(int, int, int, int, boolean):int");
    }

    public static int Oooo000(View view) {
        return ((o0000O) view.getLayoutParams()).OooO00o();
    }

    public static o0000O0O Oooo00O(Context context, AttributeSet attributeSet, int i, int i2) {
        o0000O0O o0000o0o2 = new o0000O0O();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OoooOO0.o0000O0.f1567OooO00o, i, i2);
        o0000o0o2.f4962OooO00o = obtainStyledAttributes.getInt(0, 1);
        o0000o0o2.f4963OooO0O0 = obtainStyledAttributes.getInt(10, 1);
        o0000o0o2.f4964OooO0OO = obtainStyledAttributes.getBoolean(9, false);
        o0000o0o2.f4965OooO0Oo = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return o0000o0o2;
    }

    public static boolean Oooo0OO(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode != 0) {
                return mode == 1073741824 && size == i;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void Oooo0o0(View view, int i, int i2, int i3, int i4) {
        o0000O o0000o2 = (o0000O) view.getLayoutParams();
        Rect rect = o0000o2.f4955OooO0O0;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) o0000o2).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) o0000o2).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) o0000o2).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) o0000o2).bottomMargin);
    }

    public void OooO(int i, o00O0O o00o0o) {
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0O0(android.view.View r7, int r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.o000OO.OooO0O0(android.view.View, int, boolean):void");
    }

    public void OooO0OO(String str) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            recyclerView.OooO(str);
        }
    }

    public abstract boolean OooO0Oo();

    public boolean OooO0o(o0000O o0000o2) {
        return o0000o2 != null;
    }

    public abstract boolean OooO0o0();

    public void OooO0oo(int i, int i2, o000O0O0 o000o0o0, o00O0O o00o0o) {
    }

    public abstract int OooOO0(o000O0O0 o000o0o0);

    public abstract int OooOO0O(o000O0O0 o000o0o0);

    public abstract int OooOO0o(o000O0O0 o000o0o0);

    public abstract int OooOOO(o000O0O0 o000o0o0);

    public abstract int OooOOO0(o000O0O0 o000o0o0);

    public abstract int OooOOOO(o000O0O0 o000o0o0);

    public final void OooOOOo(o000O00 o000o00) {
        int OooOo0O2 = OooOo0O();
        while (true) {
            OooOo0O2--;
            if (OooOo0O2 >= 0) {
                View OooOo02 = OooOo0(OooOo0O2);
                o000OOo0 Oooo02 = RecyclerView.Oooo0(OooOo02);
                if (!Oooo02.OooOOOO()) {
                    if (Oooo02.OooO0oO() && !Oooo02.OooO() && !this.f5007OooO0O0.f3153OooOO0O.f4952OooO0O0) {
                        Oooooo(OooOo0O2);
                        o000o00.OooO0oo(Oooo02);
                    } else {
                        OooOo0(OooOo0O2);
                        this.f5006OooO00o.OooO0OO(OooOo0O2);
                        o000o00.OooO(OooOo02);
                        this.f5007OooO0O0.f3148OooO0o.OooOO0o(Oooo02);
                    }
                }
            } else {
                return;
            }
        }
    }

    public abstract o0000O OooOOo();

    public View OooOOo0(int i) {
        int OooOo0O2 = OooOo0O();
        for (int i2 = 0; i2 < OooOo0O2; i2++) {
            View OooOo02 = OooOo0(i2);
            o000OOo0 Oooo02 = RecyclerView.Oooo0(OooOo02);
            if (Oooo02 != null && Oooo02.OooO0OO() == i && !Oooo02.OooOOOO() && (this.f5007OooO0O0.OoooOoO.f4988OooO0oO || !Oooo02.OooO())) {
                return OooOo02;
            }
        }
        return null;
    }

    public o0000O OooOOoo(Context context, AttributeSet attributeSet) {
        return new o0000O(context, attributeSet);
    }

    public int OooOo(o000O00 o000o00, o000O0O0 o000o0o0) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView == null || recyclerView.f3153OooOO0O == null || !OooO0Oo()) {
            return 1;
        }
        return this.f5007OooO0O0.f3153OooOO0O.OooO00o();
    }

    public final View OooOo0(int i) {
        OooO0o oooO0o = this.f5006OooO00o;
        if (oooO0o != null) {
            return oooO0o.OooO0Oo(i);
        }
        return null;
    }

    public o0000O OooOo00(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof o0000O ? new o0000O((o0000O) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o0000O((ViewGroup.MarginLayoutParams) layoutParams) : new o0000O(layoutParams);
    }

    public final int OooOo0O() {
        OooO0o oooO0o = this.f5006OooO00o;
        if (oooO0o != null) {
            return oooO0o.OooO0o0();
        }
        return 0;
    }

    public final int OooOoO() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        o00000O adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.OooO00o();
        }
        return 0;
    }

    public void OooOoO0(View view, Rect rect) {
        int[] iArr = RecyclerView.f3140o00o0O;
        o0000O o0000o2 = (o0000O) view.getLayoutParams();
        Rect rect2 = o0000o2.f4955OooO0O0;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) o0000o2).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) o0000o2).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) o0000o2).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) o0000o2).bottomMargin);
    }

    public final int OooOoOO() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        return o00O0O0O.OooO0Oo(recyclerView);
    }

    public final int OooOoo() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int OooOoo0() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int OooOooO() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int OooOooo() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public abstract void Oooo(RecyclerView recyclerView);

    public final void Oooo0(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((o0000O) view.getLayoutParams()).f4955OooO0O0;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f5007OooO0O0 != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f5007OooO0O0.f3152OooOO0;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public int Oooo00o(o000O00 o000o00, o000O0O0 o000o0o0) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView == null || recyclerView.f3153OooOO0O == null || !OooO0o0()) {
            return 1;
        }
        return this.f5007OooO0O0.f3153OooOO0O.OooO00o();
    }

    public boolean Oooo0O0() {
        return false;
    }

    public void Oooo0o(int i) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            int OooO0o02 = recyclerView.f3149OooO0o0.OooO0o0();
            for (int i2 = 0; i2 < OooO0o02; i2++) {
                recyclerView.f3149OooO0o0.OooO0Oo(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void Oooo0oO(int i) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            int OooO0o02 = recyclerView.f3149OooO0o0.OooO0o0();
            for (int i2 = 0; i2 < OooO0o02; i2++) {
                recyclerView.f3149OooO0o0.OooO0Oo(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Oooo0oo(RecyclerView recyclerView) {
    }

    public void OoooO(o000O00 o000o00, o000O0O0 o000o0o0, View view, Oooo000.o000oOoO o000oooo) {
        o000oooo.OooO(Oooo000.Oooo0.OooO00o(OooO0o0() ? Oooo000(view) : 0, 1, OooO0Oo() ? Oooo000(view) : 0, 1, false));
    }

    public void OoooO0(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f5007OooO0O0;
        o000O00 o000o00 = recyclerView.f3145OooO0O0;
        o000O0O0 o000o0o0 = recyclerView.OoooOoO;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5007OooO0O0.canScrollVertically(-1) && !this.f5007OooO0O0.canScrollHorizontally(-1) && !this.f5007OooO0O0.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            o00000O o00000o = this.f5007OooO0O0.f3153OooOO0O;
            if (o00000o != null) {
                accessibilityEvent.setItemCount(o00000o.OooO00o());
            }
        }
    }

    public abstract View OoooO00(View view, int i, o000O00 o000o00, o000O0O0 o000o0o0);

    public final void OoooO0O(View view, Oooo000.o000oOoO o000oooo) {
        o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
        if (Oooo02 == null || Oooo02.OooO() || this.f5006OooO00o.OooOO0(Oooo02.f5031OooO00o)) {
            return;
        }
        RecyclerView recyclerView = this.f5007OooO0O0;
        OoooO(recyclerView.f3145OooO0O0, recyclerView.OoooOoO, view, o000oooo);
    }

    public void OoooOO0(int i, int i2) {
    }

    public void OoooOOO(int i, int i2) {
    }

    public void OoooOOo(int i, int i2) {
    }

    public void OoooOo0(int i, int i2) {
    }

    public abstract void OoooOoO(o000O00 o000o00, o000O0O0 o000o0o0);

    public abstract void OoooOoo(o000O0O0 o000o0o0);

    public void Ooooo00(Parcelable parcelable) {
    }

    public Parcelable Ooooo0o() {
        return null;
    }

    public void OooooO0(int i) {
    }

    public final void OooooOO(o000O00 o000o00) {
        int OooOo0O2 = OooOo0O();
        while (true) {
            OooOo0O2--;
            if (OooOo0O2 >= 0) {
                if (!RecyclerView.Oooo0(OooOo0(OooOo0O2)).OooOOOO()) {
                    View OooOo02 = OooOo0(OooOo0O2);
                    Oooooo(OooOo0O2);
                    o000o00.OooO0oO(OooOo02);
                }
            } else {
                return;
            }
        }
    }

    public final void OooooOo(o000O00 o000o00) {
        ArrayList arrayList;
        int size = o000o00.f4973OooO00o.size();
        int i = size - 1;
        while (true) {
            arrayList = o000o00.f4973OooO00o;
            if (i < 0) {
                break;
            }
            View view = ((o000OOo0) arrayList.get(i)).f5031OooO00o;
            o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
            if (!Oooo02.OooOOOO()) {
                Oooo02.OooOOO(false);
                if (Oooo02.OooOO0O()) {
                    this.f5007OooO0O0.removeDetachedView(view, false);
                }
                o0000oo o0000ooVar = this.f5007OooO0O0.f3177Oooo00o;
                if (o0000ooVar != null) {
                    o0000ooVar.OooO0Oo(Oooo02);
                }
                Oooo02.OooOOO(true);
                o000OOo0 Oooo03 = RecyclerView.Oooo0(view);
                Oooo03.f5042OooOOO = null;
                Oooo03.f5043OooOOOO = false;
                Oooo03.f5039OooOO0 &= -33;
                o000o00.OooO0oo(Oooo03);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = o000o00.f4974OooO0O0;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f5007OooO0O0.invalidate();
        }
    }

    public final void Oooooo(int i) {
        if (OooOo0(i) != null) {
            OooO0o oooO0o = this.f5006OooO00o;
            int OooO0o2 = oooO0o.OooO0o(i);
            o00000O0 o00000o02 = oooO0o.f4894OooO00o;
            View childAt = o00000o02.f4953OooO00o.getChildAt(OooO0o2);
            if (childAt != null) {
                if (oooO0o.f4895OooO0O0.OooO0o(OooO0o2)) {
                    oooO0o.OooOO0O(childAt);
                }
                o00000o02.OooO0oO(OooO0o2);
            }
        }
    }

    public final void Oooooo0(View view, o000O00 o000o00) {
        OooO0o oooO0o = this.f5006OooO00o;
        o00000O0 o00000o02 = oooO0o.f4894OooO00o;
        int indexOfChild = o00000o02.f4953OooO00o.indexOfChild(view);
        if (indexOfChild >= 0) {
            if (oooO0o.f4895OooO0O0.OooO0o(indexOfChild)) {
                oooO0o.OooOO0O(view);
            }
            o00000o02.OooO0oO(indexOfChild);
        }
        o000o00.OooO0oO(view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
        if (r10 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean OoooooO(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.OooOoo()
            int r1 = r8.OooOooo()
            int r2 = r8.f5017OooOOO
            int r3 = r8.OooOooO()
            int r2 = r2 - r3
            int r3 = r8.f5018OooOOOO
            int r4 = r8.OooOoo0()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.OooOoOO()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto Lab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto La8
        L74:
            int r11 = r8.OooOoo()
            int r13 = r8.OooOooo()
            int r3 = r8.f5017OooOOO
            int r4 = r8.OooOooO()
            int r3 = r3 - r4
            int r4 = r8.f5018OooOOOO
            int r5 = r8.OooOoo0()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f5007OooO0O0
            android.graphics.Rect r5 = r5.f3151OooO0oo
            r8.OooOoO0(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto La8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto La8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto La8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto La8
        La6:
            r10 = r7
            goto La9
        La8:
            r10 = r0
        La9:
            if (r10 == 0) goto Lb0
        Lab:
            if (r2 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r2, r1)
            goto Lba
        Lb7:
            r9.OoooOoo(r2, r1, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: o000oOoO.o000OO.OoooooO(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public final void Ooooooo() {
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public void o000oOoO() {
    }

    public abstract int o00O0O(int i, o000O00 o000o00, o000O0O0 o000o0o0);

    public final void o00Oo0(RecyclerView recyclerView) {
        o00Ooo(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void o00Ooo(int i, int i2) {
        this.f5017OooOOO = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f5016OooOO0o = mode;
        if (mode == 0) {
            int[] iArr = RecyclerView.f3140o00o0O;
        }
        this.f5018OooOOOO = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.OooOOO0 = mode2;
        if (mode2 == 0) {
            int[] iArr2 = RecyclerView.f3140o00o0O;
        }
    }

    public void o00o0O(Rect rect, int i, int i2) {
        int OooOooO2 = OooOooO() + OooOoo() + rect.width();
        int OooOoo02 = OooOoo0() + OooOooo() + rect.height();
        RecyclerView recyclerView = this.f5007OooO0O0;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        this.f5007OooO0O0.setMeasuredDimension(OooO0oO(i, OooOooO2, o00O0O0.OooO0o0(recyclerView)), OooO0oO(i2, OooOoo02, o00O0O0.OooO0Oo(this.f5007OooO0O0)));
    }

    public boolean o00oO0O() {
        return false;
    }

    public final boolean o00oO0o(View view, int i, int i2, o0000O o0000o2) {
        return (!view.isLayoutRequested() && this.f5013OooO0oo && Oooo0OO(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) o0000o2).width) && Oooo0OO(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) o0000o2).height)) ? false : true;
    }

    public final void o00ooo(int i, int i2) {
        int OooOo0O2 = OooOo0O();
        if (OooOo0O2 == 0) {
            this.f5007OooO0O0.OooOOO(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < OooOo0O2; i7++) {
            View OooOo02 = OooOo0(i7);
            Rect rect = this.f5007OooO0O0.f3151OooO0oo;
            OooOoO0(OooOo02, rect);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.f5007OooO0O0.f3151OooO0oo.set(i6, i4, i3, i5);
        o00o0O(this.f5007OooO0O0.f3151OooO0oo, i, i2);
    }

    public boolean o0OOO0o() {
        return false;
    }

    public abstract int o0OoOo0(int i, o000O00 o000o00, o000O0O0 o000o0o0);

    public final boolean o0ooOO0(View view, int i, int i2, o0000O o0000o2) {
        return (this.f5013OooO0oo && Oooo0OO(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) o0000o2).width) && Oooo0OO(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) o0000o2).height)) ? false : true;
    }

    public abstract void o0ooOOo(RecyclerView recyclerView, int i);

    public final void o0ooOoO(oo0o0Oo oo0o0oo) {
        oo0o0Oo oo0o0oo2 = this.f5011OooO0o0;
        if (oo0o0oo2 != null && oo0o0oo != oo0o0oo2 && oo0o0oo2.f5180OooO0o0) {
            oo0o0oo2.OooO();
        }
        this.f5011OooO0o0 = oo0o0oo;
        RecyclerView recyclerView = this.f5007OooO0O0;
        o000OO00 o000oo00 = recyclerView.f3189OoooOOO;
        o000oo00.f5025OooO0oO.removeCallbacks(o000oo00);
        o000oo00.f5021OooO0OO.abortAnimation();
        oo0o0oo.f5176OooO0O0 = recyclerView;
        oo0o0oo.f5177OooO0OO = this;
        int i = oo0o0oo.f5175OooO00o;
        if (i != -1) {
            recyclerView.OoooOoO.f4982OooO00o = i;
            oo0o0oo.f5180OooO0o0 = true;
            oo0o0oo.f5178OooO0Oo = true;
            oo0o0oo.f5179OooO0o = recyclerView.f3154OooOO0o.OooOOo0(i);
            oo0o0oo.f5176OooO0O0.f3189OoooOOO.OooO00o();
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final void oo000o(RecyclerView recyclerView) {
        int height;
        if (recyclerView == null) {
            this.f5007OooO0O0 = null;
            this.f5006OooO00o = null;
            height = 0;
            this.f5017OooOOO = 0;
        } else {
            this.f5007OooO0O0 = recyclerView;
            this.f5006OooO00o = recyclerView.f3149OooO0o0;
            this.f5017OooOOO = recyclerView.getWidth();
            height = recyclerView.getHeight();
        }
        this.f5018OooOOOO = height;
        this.f5016OooOO0o = 1073741824;
        this.OooOOO0 = 1073741824;
    }

    public abstract void ooOO(int i);
}