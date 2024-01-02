package Oooooo;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o000000O extends OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f1853OoooO;

    public o000000O(BottomSheetBehavior bottomSheetBehavior) {
        this.f1853OoooO = bottomSheetBehavior;
    }

    @Override // o0000O00.OooO00o
    public final int Oooo000(View view, int i) {
        return view.getLeft();
    }

    @Override // o0000O00.OooO00o
    public final int Oooo00O(View view, int i) {
        return OooO00o.OooOooo(i, this.f1853OoooO.OooOo(), o0000Ooo());
    }

    @Override // o0000O00.OooO00o
    public final int o0000Ooo() {
        BottomSheetBehavior bottomSheetBehavior = this.f1853OoooO;
        if (bottomSheetBehavior.f3285Oooo0) {
            return bottomSheetBehavior.f3295OoooO;
        }
        return bottomSheetBehavior.f3287Oooo00O;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (java.lang.Math.abs(r5.getTop() - r3.OooOo()) < java.lang.Math.abs(r5.getTop() - r3.f3283OooOooo)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
        if (java.lang.Math.abs(r6 - r3.f3283OooOooo) < java.lang.Math.abs(r6 - r3.f3287Oooo00O)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
        if (java.lang.Math.abs(r6 - r3.f3282OooOooO) < java.lang.Math.abs(r6 - r3.f3287Oooo00O)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
        if (r6 < java.lang.Math.abs(r6 - r3.f3287Oooo00O)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d3, code lost:
        if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r3.f3287Oooo00O)) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0017, code lost:
        if (r6 > r3.f3283OooOooo) goto L7;
     */
    @Override // o0000O00.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000O0(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.f1853OoooO
            if (r1 >= 0) goto L1b
            boolean r6 = r3.f3256OooO0O0
            if (r6 == 0) goto Le
            goto Lc4
        Le:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r3.f3283OooOooo
            if (r6 <= r7) goto Lc4
            goto Ld5
        L1b:
            boolean r1 = r3.f3285Oooo0
            if (r1 == 0) goto L70
            boolean r1 = r3.Oooo000(r5, r7)
            if (r1 == 0) goto L70
            float r6 = java.lang.Math.abs(r6)
            float r0 = java.lang.Math.abs(r7)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 >= 0) goto L38
            int r6 = r3.f3258OooO0Oo
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L4c
        L38:
            int r6 = r5.getTop()
            int r7 = r3.f3295OoooO
            int r0 = r3.OooOo()
            int r0 = r0 + r7
            int r0 = r0 / 2
            if (r6 <= r0) goto L49
            r6 = r2
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L4f
        L4c:
            r6 = 5
            goto Ld8
        L4f:
            boolean r6 = r3.f3256OooO0O0
            if (r6 == 0) goto L55
            goto Lc4
        L55:
            int r6 = r5.getTop()
            int r7 = r3.OooOo()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r0 = r3.f3283OooOooo
            int r7 = r7 - r0
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
            goto Lc4
        L70:
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 == 0) goto L9c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L81
            goto L9c
        L81:
            boolean r6 = r3.f3256OooO0O0
            if (r6 == 0) goto L86
            goto Ld7
        L86:
            int r6 = r5.getTop()
            int r7 = r3.f3283OooOooo
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f3287Oooo00O
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Ld5
        L9c:
            int r6 = r5.getTop()
            boolean r7 = r3.f3256OooO0O0
            if (r7 == 0) goto Lb6
            int r7 = r3.f3282OooOooO
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f3287Oooo00O
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Lc4
        Lb6:
            int r7 = r3.f3283OooOooo
            if (r6 >= r7) goto Lc6
            int r7 = r3.f3287Oooo00O
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
        Lc4:
            r6 = 3
            goto Ld8
        Lc6:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r0 = r3.f3287Oooo00O
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
        Ld5:
            r6 = 6
            goto Ld8
        Ld7:
            r6 = 4
        Ld8:
            r3.getClass()
            r3.Oooo00O(r5, r6, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooooo.o000000O.o000O0(android.view.View, float, float):void");
    }

    @Override // o0000O00.OooO00o
    public final void o000O00(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f1853OoooO;
            if (bottomSheetBehavior.f3290Oooo0OO) {
                bottomSheetBehavior.OooOooo(1);
            }
        }
    }

    @Override // o0000O00.OooO00o
    public final void o000O00O(View view, int i, int i2) {
        this.f1853OoooO.OooOo0(i2);
    }

    @Override // o0000O00.OooO00o
    public final boolean o0O0ooO(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f1853OoooO;
        int i2 = bottomSheetBehavior.f3292Oooo0o0;
        if (i2 == 1 || bottomSheetBehavior.f3303OoooOoo) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f3302OoooOo0 == i) {
            WeakReference weakReference = bottomSheetBehavior.f3307o000oOoO;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.f3299OoooOO0;
        return weakReference2 != null && weakReference2.get() == view;
    }
}