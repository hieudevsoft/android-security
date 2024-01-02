package o0ooOOo;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class OooO0OO extends o0000O00.OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f5582OoooO;

    public OooO0OO(SideSheetBehavior sideSheetBehavior) {
        this.f5582OoooO = sideSheetBehavior;
    }

    @Override // o0000O00.OooO00o
    public final int Oooo000(View view, int i) {
        int OooOOoo2;
        int i2;
        SideSheetBehavior sideSheetBehavior = this.f5582OoooO;
        OooO00o oooO00o = sideSheetBehavior.f3470OooO00o;
        switch (oooO00o.f5578OooO00o) {
            case 0:
                OooOOoo2 = -oooO00o.f5579OooO0O0.f3480OooOO0o;
                break;
            default:
                OooOOoo2 = oooO00o.OooOOoo();
                break;
        }
        OooO00o oooO00o2 = sideSheetBehavior.f3470OooO00o;
        int i3 = oooO00o2.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior2 = oooO00o2.f5579OooO0O0;
        switch (i3) {
            case 0:
                i2 = sideSheetBehavior2.f3482OooOOOO;
                break;
            default:
                i2 = sideSheetBehavior2.OooOOO0;
                break;
        }
        return o0000O00.OooO00o.OooOooo(i, OooOOoo2, i2);
    }

    @Override // o0000O00.OooO00o
    public final int Oooo00O(View view, int i) {
        return view.getTop();
    }

    @Override // o0000O00.OooO00o
    public final int o00000o0(View view) {
        SideSheetBehavior sideSheetBehavior = this.f5582OoooO;
        return sideSheetBehavior.f3480OooOO0o + sideSheetBehavior.f3482OooOOOO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0.f3470OooO00o.OooOoO0(r4) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r5 == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (java.lang.Math.abs(r5 - r0.f3470OooO00o.OooOOoo()) < java.lang.Math.abs(r5 - r0.f3470OooO00o.OooOo00())) goto L22;
     */
    @Override // o0000O00.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000O0(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.f5582OoooO
            o0ooOOo.OooO00o r1 = r0.f3470OooO00o
            boolean r1 = r1.OooOo(r5)
            r2 = 1
            if (r1 == 0) goto Lc
            goto L58
        Lc:
            o0ooOOo.OooO00o r1 = r0.f3470OooO00o
            boolean r1 = r1.OooOoOO(r4, r5)
            if (r1 == 0) goto L25
            o0ooOOo.OooO00o r1 = r0.f3470OooO00o
            boolean r5 = r1.OooOoO(r5, r6)
            if (r5 != 0) goto L5a
            o0ooOOo.OooO00o r5 = r0.f3470OooO00o
            boolean r5 = r5.OooOoO0(r4)
            if (r5 == 0) goto L58
            goto L5a
        L25:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L3b
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            r5 = r2
            goto L39
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L5a
        L3b:
            int r5 = r4.getLeft()
            o0ooOOo.OooO00o r6 = r0.f3470OooO00o
            int r6 = r6.OooOOoo()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            o0ooOOo.OooO00o r1 = r0.f3470OooO00o
            int r1 = r1.OooOo00()
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L5a
        L58:
            r5 = 3
            goto L5b
        L5a:
            r5 = 5
        L5b:
            r0.OooOo00(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o0ooOOo.OooO0OO.o000O0(android.view.View, float, float):void");
    }

    @Override // o0000O00.OooO00o
    public final void o000O00(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.f5582OoooO;
            if (sideSheetBehavior.f3476OooO0oO) {
                sideSheetBehavior.OooOOoo(1);
            }
        }
    }

    @Override // o0000O00.OooO00o
    public final void o000O00O(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.f5582OoooO;
        WeakReference weakReference = sideSheetBehavior.f3485OooOOo0;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            OooO00o oooO00o = sideSheetBehavior.f3470OooO00o;
            int left = view.getLeft();
            int right = view.getRight();
            int i3 = oooO00o.f5578OooO00o;
            SideSheetBehavior sideSheetBehavior2 = oooO00o.f5579OooO0O0;
            switch (i3) {
                case 0:
                    if (left <= sideSheetBehavior2.OooOOO0) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i4 = sideSheetBehavior2.OooOOO0;
                    if (left <= i4) {
                        marginLayoutParams.rightMargin = i4 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.f3487OooOo0;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f3470OooO00o.OooOOo(i);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                OooO0O0.OooO00o.OooO0oO(it.next());
                throw null;
            }
        }
    }

    @Override // o0000O00.OooO00o
    public final boolean o0O0ooO(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.f5582OoooO;
        if (sideSheetBehavior.f3477OooO0oo == 1 || (weakReference = sideSheetBehavior.f3483OooOOOo) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }
}