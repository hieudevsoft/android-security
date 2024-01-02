package OoooOoo;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;
import o000oOoO.Oooo0;

/* loaded from: classes.dex */
public final class o0OOOO0o extends oO00000 {

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final String[] f1619OooOoO0 = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: OooOo  reason: collision with root package name */
    public int f1620OooOo;

    public o0OOOO0o() {
        this.f1620OooOo = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006d, code lost:
        if (r9 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r0.f1677OooO0o0 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
        if (r0.f1674OooO0OO == 0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static OoooOoo.oO000Oo Oooo0O0(OoooOoo.oO000O0O r8, OoooOoo.oO000O0O r9) {
        /*
            OoooOoo.oO000Oo r0 = new OoooOoo.oO000Oo
            r0.<init>()
            r1 = 0
            r0.f1672OooO00o = r1
            r0.f1673OooO0O0 = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1668OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f1674OooO0OO = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1677OooO0o0 = r6
            goto L33
        L2f:
            r0.f1674OooO0OO = r4
            r0.f1677OooO0o0 = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1668OooO00o
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f1675OooO0Oo = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1676OooO0o = r2
            goto L56
        L52:
            r0.f1675OooO0Oo = r4
            r0.f1676OooO0o = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L7a
            if (r9 == 0) goto L7a
            int r8 = r0.f1674OooO0OO
            int r9 = r0.f1675OooO0Oo
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f1677OooO0o0
            android.view.ViewGroup r4 = r0.f1676OooO0o
            if (r3 != r4) goto L68
            goto L8d
        L68:
            if (r8 == r9) goto L70
            if (r8 != 0) goto L6d
            goto L89
        L6d:
            if (r9 != 0) goto L8d
            goto L80
        L70:
            android.view.ViewGroup r8 = r0.f1676OooO0o
            if (r8 != 0) goto L75
            goto L89
        L75:
            android.view.ViewGroup r8 = r0.f1677OooO0o0
            if (r8 != 0) goto L8d
            goto L80
        L7a:
            if (r8 != 0) goto L83
            int r8 = r0.f1675OooO0Oo
            if (r8 != 0) goto L83
        L80:
            r0.f1673OooO0O0 = r2
            goto L8b
        L83:
            if (r9 != 0) goto L8d
            int r8 = r0.f1674OooO0OO
            if (r8 != 0) goto L8d
        L89:
            r0.f1673OooO0O0 = r1
        L8b:
            r0.f1672OooO00o = r2
        L8d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOoo.o0OOOO0o.Oooo0O0(OoooOoo.oO000O0O, OoooOoo.oO000O0O):OoooOoo.oO000Oo");
    }

    @Override // OoooOoo.oO00000
    public final void OooO0Oo(oO000O0O oo000o0o) {
        Oooo00o(oo000o0o);
    }

    @Override // OoooOoo.oO00000
    public final void OooO0oO(oO000O0O oo000o0o) {
        Oooo00o(oo000o0o);
        oo000o0o.f1668OooO00o.put("android:fade:transitionAlpha", Float.valueOf(oO0Ooooo.f1692OooO00o.OooOoOO(oo000o0o.f1669OooO0O0)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (Oooo0O0(OooOOO(r3, false), OooOOo0(r3, false)).f1672OooO00o != false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ee  */
    @Override // OoooOoo.oO00000
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator OooOO0O(android.view.ViewGroup r23, OoooOoo.oO000O0O r24, OoooOoo.oO000O0O r25) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: OoooOoo.o0OOOO0o.OooOO0O(android.view.ViewGroup, OoooOoo.oO000O0O, OoooOoo.oO000O0O):android.animation.Animator");
    }

    @Override // OoooOoo.oO00000
    public final /* bridge */ /* synthetic */ String[] OooOOOo() {
        return f1619OooOoO0;
    }

    @Override // OoooOoo.oO00000
    public final boolean OooOOo(oO000O0O oo000o0o, oO000O0O oo000o0o2) {
        if ((oo000o0o != null || oo000o0o2 != null) && (oo000o0o == null || oo000o0o2 == null || oo000o0o2.f1668OooO00o.containsKey("android:visibility:visibility") == oo000o0o.f1668OooO00o.containsKey("android:visibility:visibility"))) {
            oO000Oo Oooo0O02 = Oooo0O0(oo000o0o, oo000o0o2);
            if (Oooo0O02.f1672OooO00o && (Oooo0O02.f1674OooO0OO == 0 || Oooo0O02.f1675OooO0Oo == 0)) {
                return true;
            }
        }
        return false;
    }

    public final ObjectAnimator Oooo0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        oO0Ooooo.f1692OooO00o.OooOoo0(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, oO0Ooooo.f1693OooO0O0, f2);
        ofFloat.addListener(new Oooo0(view));
        OooO00o(new o0OOOO00(this, 0, view));
        return ofFloat;
    }

    public final void Oooo00o(oO000O0O oo000o0o) {
        View view = oo000o0o.f1669OooO0O0;
        int visibility = view.getVisibility();
        HashMap hashMap = oo000o0o.f1668OooO00o;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public o0OOOO0o(int i) {
        this.f1620OooOo = 3;
        if ((i & (-4)) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.f1620OooOo = i;
    }
}