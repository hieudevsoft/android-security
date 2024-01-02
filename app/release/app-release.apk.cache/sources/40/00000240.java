package Oooooo0;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0000OO0 extends OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public int f1866OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public int f1867OoooOO0 = -1;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f1868o000oOoO;

    public o0000OO0(SwipeDismissBehavior swipeDismissBehavior) {
        this.f1868o000oOoO = swipeDismissBehavior;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0017, code lost:
        if (r0 != false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0019, code lost:
        r0 = r3.f1866OoooO;
        r4 = r4.getWidth() + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
        r0 = r3.f1866OoooO - r4.getWidth();
        r4 = r3.f1866OoooO;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        if (r0 != false) goto L11;
     */
    @Override // o0000O00.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int Oooo000(android.view.View r4, int r5) {
        /*
            r3 = this;
            java.util.WeakHashMap r0 = OooOooo.o0o0Oo.f1363OooO00o
            int r0 = OooOooo.o00O0O0O.OooO0Oo(r4)
            r1 = 1
            if (r0 != r1) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r3.f1868o000oOoO
            int r2 = r2.f3249OooO0Oo
            if (r2 != 0) goto L15
            if (r0 == 0) goto L19
            goto L21
        L15:
            if (r2 != r1) goto L2b
            if (r0 == 0) goto L21
        L19:
            int r0 = r3.f1866OoooO
            int r4 = r4.getWidth()
            int r4 = r4 + r0
            goto L39
        L21:
            int r0 = r3.f1866OoooO
            int r4 = r4.getWidth()
            int r0 = r0 - r4
            int r4 = r3.f1866OoooO
            goto L39
        L2b:
            int r0 = r3.f1866OoooO
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r3.f1866OoooO
            int r4 = r4.getWidth()
            int r4 = r4 + r1
        L39:
            int r5 = java.lang.Math.max(r0, r5)
            int r4 = java.lang.Math.min(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooooo0.o0000OO0.Oooo000(android.view.View, int):int");
    }

    @Override // o0000O00.OooO00o
    public final int Oooo00O(View view, int i) {
        return view.getTop();
    }

    @Override // o0000O00.OooO00o
    public final int o00000o0(View view) {
        return view.getWidth();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (java.lang.Math.abs(r9.getLeft() - r8.f1866OoooO) >= java.lang.Math.round(r9.getWidth() * r3.f3251OooO0o0)) goto L33;
     */
    @Override // o0000O00.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o000O0(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f1867OoooOO0 = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f1868o000oOoO
            r4 = 0
            if (r1 == 0) goto L39
            java.util.WeakHashMap r5 = OooOooo.o0o0Oo.f1363OooO00o
            int r5 = OooOooo.o00O0O0O.OooO0Oo(r9)
            if (r5 != r2) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r6 = r3.f3249OooO0Oo
            r7 = 2
            if (r6 != r7) goto L21
            goto L52
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L2a:
            if (r1 <= 0) goto L54
            goto L52
        L2d:
            if (r6 != r2) goto L54
            if (r5 == 0) goto L34
            if (r1 <= 0) goto L54
            goto L52
        L34:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L54
            goto L52
        L39:
            int r1 = r9.getLeft()
            int r5 = r8.f1866OoooO
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f3251OooO0o0
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L54
        L52:
            r1 = r2
            goto L55
        L54:
            r1 = r4
        L55:
            if (r1 == 0) goto L6b
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L66
            int r10 = r9.getLeft()
            int r0 = r8.f1866OoooO
            if (r10 >= r0) goto L64
            goto L66
        L64:
            int r0 = r0 + r11
            goto L6e
        L66:
            int r10 = r8.f1866OoooO
            int r0 = r10 - r11
            goto L6e
        L6b:
            int r0 = r8.f1866OoooO
            r2 = r4
        L6e:
            Oooo0o0.o000oOoO r10 = r3.f3246OooO00o
            int r11 = r9.getTop()
            boolean r10 = r10.OooOOOo(r0, r11)
            if (r10 == 0) goto L84
            Oooooo0.o000 r10 = new Oooooo0.o000
            r10.<init>(r3, r9, r2)
            java.util.WeakHashMap r11 = OooOooo.o0o0Oo.f1363OooO00o
            OooOooo.o00O0O0.OooOOO0(r9, r10)
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooooo0.o0000OO0.o000O0(android.view.View, float, float):void");
    }

    @Override // o0000O00.OooO00o
    public final void o000O00(int i) {
        this.f1868o000oOoO.getClass();
    }

    @Override // o0000O00.OooO00o
    public final void o000O00O(View view, int i, int i2) {
        SwipeDismissBehavior swipeDismissBehavior = this.f1868o000oOoO;
        float width = view.getWidth() * swipeDismissBehavior.f3250OooO0o;
        float width2 = view.getWidth() * swipeDismissBehavior.f3252OooO0oO;
        float abs = Math.abs(i - this.f1866OoooO);
        if (abs <= width) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - width) / (width2 - width))), 1.0f));
        }
    }

    @Override // o0000O00.OooO00o
    public final void o000Oo0(View view, int i) {
        this.f1867OoooOO0 = i;
        this.f1866OoooO = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f1868o000oOoO;
            swipeDismissBehavior.f3248OooO0OO = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f3248OooO0OO = false;
        }
    }

    @Override // o0000O00.OooO00o
    public final boolean o0O0ooO(View view, int i) {
        int i2 = this.f1867OoooOO0;
        return (i2 == -1 || i2 == i) && this.f1868o000oOoO.OooOOo(view);
    }
}