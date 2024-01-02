package com.google.android.material.carousel;

import OooO0O0.OooO00o;
import OooooOO.oO00O0o0;
import Ooooooo.oO00o0;
import Ooooooo.oO00o00O;
import Ooooooo.oO0OO00o;
import Ooooooo.oO0OOO00;
import Ooooooo.oOo00ooO;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.activity.OooO0o;
import androidx.appcompat.widget.o0O0O00;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.List;
import o000oOoO.o000000;
import o000oOoO.o0000O;
import o000oOoO.o000O00;
import o000oOoO.o000O0O0;
import o000oOoO.o000OO;
import o000oOoO.o000OO0O;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends o000OO implements o000OO0O {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public oO00o0 f3334OooOOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public final oO0OOO00 f3335OooOOo0;

    /* JADX WARN: Type inference failed for: r0v2, types: [Ooooooo.oO0OOO00] */
    public CarouselLayoutManager() {
        new oO0OO00o();
        new oO00o00O();
        this.f3335OooOOo0 = new View.OnLayoutChangeListener(this) { // from class: Ooooooo.oO0OOO00

            /* renamed from: OooO0O0  reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f1899OooO0O0;

            {
                this.f1899OooO0O0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = r2;
                CarouselLayoutManager carouselLayoutManager = this.f1899OooO0O0;
                switch (i9) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                            view.post(new OooO0o(7, carouselLayoutManager));
                            return;
                        }
                        return;
                    default:
                        carouselLayoutManager.getClass();
                        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                            view.post(new OooO0o(7, carouselLayoutManager));
                            return;
                        }
                        return;
                }
            }
        };
        Ooooooo();
        o000000O(0);
    }

    public static o0O0O00 o0O0O00(float f, List list, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            ((oOo00ooO) list.get(i5)).getClass();
            float abs = Math.abs(0.0f - f);
            if (0.0f <= f && abs <= f2) {
                i = i5;
                f2 = abs;
            }
            if (0.0f > f && abs <= f4) {
                i3 = i5;
                f4 = abs;
            }
            if (0.0f <= f5) {
                i2 = i5;
                f5 = 0.0f;
            }
            if (0.0f > f3) {
                i4 = i5;
                f3 = 0.0f;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        return new o0O0O00((oOo00ooO) list.get(i), (oOo00ooO) list.get(i3));
    }

    public static float oo0o0Oo(float f, o0O0O00 o0o0o00) {
        oOo00ooO ooo00ooo = (oOo00ooO) o0o0o00.f2440OooO0O0;
        ooo00ooo.getClass();
        oOo00ooO ooo00ooo2 = (oOo00ooO) o0o0o00.f2441OooO0OO;
        ooo00ooo2.getClass();
        ooo00ooo.getClass();
        ooo00ooo2.getClass();
        return oO00O0o0.OooO00o(0.0f, 0.0f, 0.0f, 0.0f, f);
    }

    @Override // o000oOoO.o000OO0O
    public final PointF OooO00o(int i) {
        return null;
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0Oo() {
        return o000OOo();
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0o0() {
        return !o000OOo();
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0(o000O0O0 o000o0o0) {
        OooOo0O();
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0O(o000O0O0 o000o0o0) {
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0o(o000O0O0 o000o0o0) {
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final int OooOOO(o000O0O0 o000o0o0) {
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final int OooOOO0(o000O0O0 o000o0o0) {
        OooOo0O();
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final int OooOOOO(o000O0O0 o000o0o0) {
        return 0;
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOOo() {
        return new o0000O(-2, -2);
    }

    @Override // o000oOoO.o000OO
    public final void OooOoO0(View view, Rect rect) {
        super.OooOoO0(view, rect);
        rect.centerY();
        if (o000OOo()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // o000oOoO.o000OO
    public final void Oooo(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3335OooOOo0);
    }

    @Override // o000oOoO.o000OO
    public final void Oooo0oo(RecyclerView recyclerView) {
        Ooooooo();
        recyclerView.addOnLayoutChangeListener(this.f3335OooOOo0);
    }

    @Override // o000oOoO.o000OO
    public final void OoooO0(AccessibilityEvent accessibilityEvent) {
        super.OoooO0(accessibilityEvent);
        if (OooOo0O() > 0) {
            accessibilityEvent.setFromIndex(o000OO.Oooo000(OooOo0(0)));
            accessibilityEvent.setToIndex(o000OO.Oooo000(OooOo0(OooOo0O() - 1)));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
        if (r9 != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002f, code lost:
        if (o000000() != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
        if (r9 == 1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (o000000() != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    @Override // o000oOoO.o000OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View OoooO00(android.view.View r6, int r7, o000oOoO.o000O00 r8, o000oOoO.o000O0O0 r9) {
        /*
            r5 = this;
            int r9 = r5.OooOo0O()
            r0 = 0
            if (r9 != 0) goto L8
            return r0
        L8:
            Ooooooo.oO00o0 r9 = r5.f3334OooOOOo
            int r9 = r9.f1900OooO00o
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r7 == r3) goto L42
            r4 = 2
            if (r7 == r4) goto L40
            r4 = 17
            if (r7 == r4) goto L35
            r4 = 33
            if (r7 == r4) goto L32
            r4 = 66
            if (r7 == r4) goto L29
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L26
            goto L3e
        L26:
            if (r9 != r3) goto L3e
            goto L40
        L29:
            if (r9 != 0) goto L3e
            boolean r7 = r5.o000000()
            if (r7 == 0) goto L40
            goto L42
        L32:
            if (r9 != r3) goto L3e
            goto L42
        L35:
            if (r9 != 0) goto L3e
            boolean r7 = r5.o000000()
            if (r7 == 0) goto L42
            goto L40
        L3e:
            r7 = r2
            goto L43
        L40:
            r7 = r3
            goto L43
        L42:
            r7 = r1
        L43:
            if (r7 != r2) goto L46
            return r0
        L46:
            int r6 = o000oOoO.o000OO.Oooo000(r6)
            java.lang.String r9 = "All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup."
            r2 = 0
            if (r7 != r1) goto L81
            if (r6 != 0) goto L52
            return r0
        L52:
            android.view.View r6 = r5.OooOo0(r2)
            int r6 = o000oOoO.o000OO.Oooo000(r6)
            int r6 = r6 - r3
            if (r6 < 0) goto L70
            int r7 = r5.OooOoO()
            if (r6 < r7) goto L64
            goto L70
        L64:
            r5.o0Oo0oo(r6)
            r8.OooO0Oo(r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r9)
            throw r6
        L70:
            boolean r6 = r5.o000000()
            if (r6 == 0) goto L7c
            int r6 = r5.OooOo0O()
            int r2 = r6 + (-1)
        L7c:
            android.view.View r6 = r5.OooOo0(r2)
            goto Lbd
        L81:
            int r7 = r5.OooOoO()
            int r7 = r7 - r3
            if (r6 != r7) goto L89
            return r0
        L89:
            int r6 = r5.OooOo0O()
            int r6 = r6 - r3
            android.view.View r6 = r5.OooOo0(r6)
            int r6 = o000oOoO.o000OO.Oooo000(r6)
            int r6 = r6 + r3
            if (r6 < 0) goto Lac
            int r7 = r5.OooOoO()
            if (r6 < r7) goto La0
            goto Lac
        La0:
            r5.o0Oo0oo(r6)
            r8.OooO0Oo(r6)
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r6.<init>(r9)
            throw r6
        Lac:
            boolean r6 = r5.o000000()
            if (r6 == 0) goto Lb3
            goto Lb9
        Lb3:
            int r6 = r5.OooOo0O()
            int r2 = r6 + (-1)
        Lb9:
            android.view.View r6 = r5.OooOo0(r2)
        Lbd:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.OoooO00(android.view.View, int, o000oOoO.o000O00, o000oOoO.o000O0O0):android.view.View");
    }

    @Override // o000oOoO.o000OO
    public final void OoooOO0(int i, int i2) {
        OooOoO();
    }

    @Override // o000oOoO.o000OO
    public final void OoooOOo(int i, int i2) {
        OooOoO();
    }

    @Override // o000oOoO.o000OO
    public final void OoooOoO(o000O00 o000o00, o000O0O0 o000o0o0) {
        if (o000o0o0.OooO0O0() > 0 && o0OO00O() > 0.0f) {
            o000000();
            o000o00.OooO0Oo(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        OooooOO(o000o00);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOoo(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return;
        }
        o000OO.Oooo000(OooOo0(0));
    }

    @Override // o000oOoO.o000OO
    public final boolean OoooooO(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    public final boolean o000000() {
        return o000OOo() && OooOoOO() == 1;
    }

    public final void o000000O(int i) {
        oO00o0 oo00o0;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(OooO00o.OooO0O0("invalid orientation:", i));
        }
        OooO0OO(null);
        oO00o0 oo00o02 = this.f3334OooOOOo;
        if (oo00o02 == null || i != oo00o02.f1900OooO00o) {
            if (i != 0) {
                if (i == 1) {
                    oo00o0 = new oO00o0(1, this, 0);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
            } else {
                oo00o0 = new oO00o0(0, this, 1);
            }
            this.f3334OooOOOo = oo00o0;
            Ooooooo();
        }
    }

    public final boolean o000OOo() {
        return this.f3334OooOOOo.f1900OooO00o == 0;
    }

    @Override // o000oOoO.o000OO
    public final int o00O0O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (!OooO0o0() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o000o00.OooO0Oo(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final int o0OO00O() {
        if (o000OOo()) {
            return this.f5017OooOOO;
        }
        return this.f5018OooOOOO;
    }

    public final float o0Oo0oo(int i) {
        oO00o0 oo00o0 = this.f3334OooOOOo;
        switch (oo00o0.f1894OooO0O0) {
            case 0:
                oo00o0.OooO0OO();
                break;
            default:
                if (oo00o0.f1895OooO0OO.o000000()) {
                    oo00o0.OooO0O0();
                    break;
                } else {
                    oo00o0.OooO00o();
                    break;
                }
        }
        throw null;
    }

    @Override // o000oOoO.o000OO
    public final int o0OoOo0(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (!o000OOo() || OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o000o00.OooO0Oo(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // o000oOoO.o000OO
    public final void o0ooOOo(RecyclerView recyclerView, int i) {
        o000000 o000000Var = new o000000(this, recyclerView.getContext(), 1);
        o000000Var.f5175OooO00o = i;
        o0ooOoO(o000000Var);
    }

    @Override // o000oOoO.o000OO
    public final void ooOO(int i) {
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [Ooooooo.oO0OOO00] */
    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new oO00o00O();
        this.f3335OooOOo0 = new View.OnLayoutChangeListener(this) { // from class: Ooooooo.oO0OOO00

            /* renamed from: OooO0O0  reason: collision with root package name */
            public final /* synthetic */ CarouselLayoutManager f1899OooO0O0;

            {
                this.f1899OooO0O0 = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i22, int i32, int i4, int i5, int i6, int i7, int i8) {
                int i9 = r2;
                CarouselLayoutManager carouselLayoutManager = this.f1899OooO0O0;
                switch (i9) {
                    case 0:
                        carouselLayoutManager.getClass();
                        if (i3 != i5 || i22 != i6 || i32 != i7 || i4 != i8) {
                            view.post(new OooO0o(7, carouselLayoutManager));
                            return;
                        }
                        return;
                    default:
                        carouselLayoutManager.getClass();
                        if (i3 != i5 || i22 != i6 || i32 != i7 || i4 != i8) {
                            view.post(new OooO0o(7, carouselLayoutManager));
                            return;
                        }
                        return;
                }
            }
        };
        new oO0OO00o();
        Ooooooo();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooooO0.o0000O.f1788OooO0O0);
            obtainStyledAttributes.getInt(0, 0);
            Ooooooo();
            o000000O(obtainStyledAttributes.getInt(0, 0));
            obtainStyledAttributes.recycle();
        }
    }
}