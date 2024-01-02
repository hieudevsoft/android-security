package Oooo0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class OooOO0O implements View.OnTouchListener {

    /* renamed from: OooOOo  reason: collision with root package name */
    public static final int f1395OooOOo = ViewConfiguration.getTapTimeout();

    /* renamed from: OooO  reason: collision with root package name */
    public final float[] f1396OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO00o f1397OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final AccelerateInterpolator f1398OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final View f1399OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public androidx.activity.OooOOO f1400OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final float[] f1401OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final float[] f1402OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f1403OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f1404OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final float[] f1405OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final float[] f1406OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f1407OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public boolean f1408OooOOO;
    public boolean OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public boolean f1409OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public boolean f1410OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final ListView f1411OooOOo0;

    public OooOO0O(ListView listView) {
        OooO00o oooO00o = new OooO00o();
        this.f1397OooO00o = oooO00o;
        this.f1398OooO0O0 = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f1402OooO0o0 = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1401OooO0o = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f1396OooO = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f1405OooOO0 = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f1406OooOO0O = fArr5;
        this.f1399OooO0OO = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.f1403OooO0oO = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f1404OooO0oo = f1395OooOOo;
        oooO00o.f1387OooO00o = 500;
        oooO00o.f1388OooO0O0 = 500;
        this.f1411OooOOo0 = listView;
    }

    public static float OooO0O0(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float OooO00o(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f1402OooO0o0
            r0 = r0[r7]
            float[] r1 = r3.f1401OooO0o
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = OooO0O0(r0, r2, r1)
            float r1 = r3.OooO0OO(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.OooO0OO(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            android.view.animation.AccelerateInterpolator r0 = r3.f1398OooO0O0
            if (r5 >= 0) goto L25
            float r4 = -r4
            float r4 = r0.getInterpolation(r4)
            float r4 = -r4
            goto L2d
        L25:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L36
            float r4 = r0.getInterpolation(r4)
        L2d:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = OooO0O0(r4, r5, r0)
            goto L37
        L36:
            r4 = r2
        L37:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3c
            goto L58
        L3c:
            float[] r0 = r3.f1396OooO
            r0 = r0[r7]
            float[] r1 = r3.f1405OooOO0
            r1 = r1[r7]
            float[] r2 = r3.f1406OooOO0O
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L51
            float r4 = r4 * r0
            float r2 = OooO0O0(r4, r1, r7)
            goto L58
        L51:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = OooO0O0(r4, r1, r7)
            float r2 = -r4
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0.OooOO0O.OooO00o(float, float, float, int):float");
    }

    public final float OooO0OO(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f1403OooO0oO;
        if (i != 0 && i != 1) {
            if (i != 2 || f >= 0.0f) {
                return 0.0f;
            }
            return f / (-f2);
        } else if (f >= f2) {
            return 0.0f;
        } else {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (!this.f1409OooOOOO || i != 1) {
                return 0.0f;
            }
            return 1.0f;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 != 3) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.f1410OooOOOo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.OooO0o0()
            goto L7c
        L1a:
            r7.f1408OooOOO = r2
            r7.f1407OooOO0o = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.f1399OooO0OO
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.OooO00o(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.OooO00o(r9, r8, r3, r2)
            Oooo0.OooO00o r9 = r7.f1397OooO00o
            r9.f1389OooO0OO = r0
            r9.f1390OooO0Oo = r8
            boolean r8 = r7.f1409OooOOOO
            if (r8 != 0) goto L7c
            boolean r8 = r7.OooO0o()
            if (r8 == 0) goto L7c
            androidx.activity.OooOOO r8 = r7.f1400OooO0Oo
            if (r8 != 0) goto L60
            androidx.activity.OooOOO r8 = new androidx.activity.OooOOO
            r9 = 4
            r8.<init>(r9, r7)
            r7.f1400OooO0Oo = r8
        L60:
            r7.f1409OooOOOO = r2
            r7.OooOOO0 = r2
            boolean r8 = r7.f1407OooOO0o
            if (r8 != 0) goto L75
            int r8 = r7.f1404OooO0oo
            if (r8 <= 0) goto L75
            androidx.activity.OooOOO r9 = r7.f1400OooO0Oo
            long r5 = (long) r8
            java.util.WeakHashMap r8 = OooOooo.o0o0Oo.f1363OooO00o
            OooOooo.o00O0O0.OooOOO(r4, r9, r5)
            goto L7a
        L75:
            androidx.activity.OooOOO r8 = r7.f1400OooO0Oo
            r8.run()
        L7a:
            r7.f1407OooOO0o = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0.OooOO0O.OooO0Oo(android.view.View, android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0o() {
        /*
            r8 = this;
            Oooo0.OooO00o r0 = r8.f1397OooO00o
            float r1 = r0.f1390OooO0Oo
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f1389OooO0OO
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r2 = r8.f1411OooOOo0
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r3) goto L49
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = r4
            goto L4c
        L4b:
            r1 = r0
        L4c:
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r0 = r4
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Oooo0.OooOO0O.OooO0o():boolean");
    }

    public final void OooO0o0() {
        int i = 0;
        if (this.OooOOO0) {
            this.f1409OooOOOO = false;
            return;
        }
        OooO00o oooO00o = this.f1397OooO00o;
        oooO00o.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - oooO00o.f1392OooO0o0);
        int i3 = oooO00o.f1388OooO0O0;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        oooO00o.f1386OooO = i;
        oooO00o.f1394OooO0oo = oooO00o.OooO00o(currentAnimationTimeMillis);
        oooO00o.f1393OooO0oO = currentAnimationTimeMillis;
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        OooO0Oo(view, motionEvent);
        return false;
    }
}