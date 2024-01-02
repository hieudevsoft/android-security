package androidx.recyclerview.widget;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooo000.Oooo0;
import Oooo000.o000oOoO;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;
import o0000O00.OooO00o;
import o000oOoO.OooOo;
import o000oOoO.o0000O;
import o000oOoO.o0000O0O;
import o000oOoO.o000O00;
import o000oOoO.o000O0O0;
import o000oOoO.o000OO;
import o000oOoO.o000OO0O;
import o000oOoO.o000OOo;
import o000oOoO.o00O00;
import o000oOoO.o00O000;
import o000oOoO.o00O00O;
import o000oOoO.o00O0O;
import o000oOoO.o00oO0o;
import o000oOoO.o00oOoo;
import o000oOoO.oo00o;
import o000oOoO.oo0o0Oo;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends o000OO implements o000OO0O {

    /* renamed from: OooOOOo  reason: collision with root package name */
    public int f3207OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public o000OOo f3208OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public o00O00O[] f3209OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public o000OOo f3210OooOOoo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public int f3212OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public int f3213OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public final o00oO0o f3214OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public boolean f3215OooOo0o;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public BitSet f3217OooOoO0;

    /* renamed from: OooOoo  reason: collision with root package name */
    public final int f3219OooOoo;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public final oo00o f3220OooOoo0;

    /* renamed from: OooOooO  reason: collision with root package name */
    public boolean f3221OooOooO;

    /* renamed from: OooOooo  reason: collision with root package name */
    public boolean f3222OooOooo;

    /* renamed from: Oooo0  reason: collision with root package name */
    public final boolean f3223Oooo0;

    /* renamed from: Oooo000  reason: collision with root package name */
    public o00O00 f3224Oooo000;

    /* renamed from: Oooo00O  reason: collision with root package name */
    public final Rect f3225Oooo00O;

    /* renamed from: Oooo00o  reason: collision with root package name */
    public final o00oOoo f3226Oooo00o;

    /* renamed from: Oooo0O0  reason: collision with root package name */
    public int[] f3227Oooo0O0;

    /* renamed from: Oooo0OO  reason: collision with root package name */
    public final OooOo f3228Oooo0OO;

    /* renamed from: OooOo  reason: collision with root package name */
    public boolean f3211OooOo = false;

    /* renamed from: OooOoO  reason: collision with root package name */
    public int f3216OooOoO = -1;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public int f3218OooOoOO = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f3207OooOOOo = -1;
        this.f3215OooOo0o = false;
        oo00o oo00oVar = new oo00o(1);
        this.f3220OooOoo0 = oo00oVar;
        this.f3219OooOoo = 2;
        this.f3225Oooo00O = new Rect();
        this.f3226Oooo00o = new o00oOoo(this);
        this.f3223Oooo0 = true;
        this.f3228Oooo0OO = new OooOo(1, this);
        o0000O0O Oooo00O2 = o000OO.Oooo00O(context, attributeSet, i, i2);
        int i3 = Oooo00O2.f4962OooO00o;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        OooO0OO(null);
        if (i3 != this.f3213OooOo00) {
            this.f3213OooOo00 = i3;
            o000OOo o000ooo = this.f3208OooOOo;
            this.f3208OooOOo = this.f3210OooOOoo;
            this.f3210OooOOoo = o000ooo;
            Ooooooo();
        }
        int i4 = Oooo00O2.f4963OooO0O0;
        OooO0OO(null);
        if (i4 != this.f3207OooOOOo) {
            oo00oVar.OooO0Oo();
            Ooooooo();
            this.f3207OooOOOo = i4;
            this.f3217OooOoO0 = new BitSet(this.f3207OooOOOo);
            this.f3209OooOOo0 = new o00O00O[this.f3207OooOOOo];
            for (int i5 = 0; i5 < this.f3207OooOOOo; i5++) {
                this.f3209OooOOo0[i5] = new o00O00O(this, i5);
            }
            Ooooooo();
        }
        boolean z = Oooo00O2.f4964OooO0OO;
        OooO0OO(null);
        o00O00 o00o00 = this.f3224Oooo000;
        if (o00o00 != null && o00o00.f5058OooO0oo != z) {
            o00o00.f5058OooO0oo = z;
        }
        this.f3215OooOo0o = z;
        Ooooooo();
        this.f3214OooOo0O = new o00oO0o();
        this.f3208OooOOo = o000OOo.OooO00o(this, this.f3213OooOo00);
        this.f3210OooOOoo = o000OOo.OooO00o(this, 1 - this.f3213OooOo00);
    }

    public static int o0000OOo(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // o000oOoO.o000OO0O
    public final PointF OooO00o(int i) {
        int o0Oo0oo = o0Oo0oo(i);
        PointF pointF = new PointF();
        if (o0Oo0oo == 0) {
            return null;
        }
        if (this.f3213OooOo00 == 0) {
            pointF.x = o0Oo0oo;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = o0Oo0oo;
        }
        return pointF;
    }

    @Override // o000oOoO.o000OO
    public final void OooO0OO(String str) {
        if (this.f3224Oooo000 == null) {
            super.OooO0OO(str);
        }
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0Oo() {
        return this.f3213OooOo00 == 0;
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0o(o0000O o0000o2) {
        return o0000o2 instanceof o00O000;
    }

    @Override // o000oOoO.o000OO
    public final boolean OooO0o0() {
        return this.f3213OooOo00 == 1;
    }

    @Override // o000oOoO.o000OO
    public final void OooO0oo(int i, int i2, o000O0O0 o000o0o0, o00O0O o00o0o) {
        o00oO0o o00oo0o;
        boolean z;
        int OooO0o2;
        int i3;
        if (this.f3213OooOo00 != 0) {
            i = i2;
        }
        if (OooOo0O() != 0 && i != 0) {
            o0000oo(i, o000o0o0);
            int[] iArr = this.f3227Oooo0O0;
            if (iArr == null || iArr.length < this.f3207OooOOOo) {
                this.f3227Oooo0O0 = new int[this.f3207OooOOOo];
            }
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = this.f3207OooOOOo;
                o00oo0o = this.f3214OooOo0O;
                if (i4 >= i6) {
                    break;
                }
                if (o00oo0o.f5096OooO0Oo == -1) {
                    OooO0o2 = o00oo0o.f5097OooO0o;
                    i3 = this.f3209OooOOo0[i4].OooO(OooO0o2);
                } else {
                    OooO0o2 = this.f3209OooOOo0[i4].OooO0o(o00oo0o.f5099OooO0oO);
                    i3 = o00oo0o.f5099OooO0oO;
                }
                int i7 = OooO0o2 - i3;
                if (i7 >= 0) {
                    this.f3227Oooo0O0[i5] = i7;
                    i5++;
                }
                i4++;
            }
            Arrays.sort(this.f3227Oooo0O0, 0, i5);
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = o00oo0o.f5095OooO0OO;
                if (i9 >= 0 && i9 < o000o0o0.OooO0O0()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    o00o0o.Oooo0oo(o00oo0o.f5095OooO0OO, this.f3227Oooo0O0[i8]);
                    o00oo0o.f5095OooO0OO += o00oo0o.f5096OooO0Oo;
                } else {
                    return;
                }
            }
        }
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0(o000O0O0 o000o0o0) {
        return oo0o0Oo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0O(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOO0o(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOOO(o000O0O0 o000o0o0) {
        return o0O0O00(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOOO0(o000O0O0 o000o0o0) {
        return oo0o0Oo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final int OooOOOO(o000O0O0 o000o0o0) {
        return o000OOo(o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOOo() {
        return this.f3213OooOo00 == 0 ? new o00O000(-2, -1) : new o00O000(-1, -2);
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOOoo(Context context, AttributeSet attributeSet) {
        return new o00O000(context, attributeSet);
    }

    @Override // o000oOoO.o000OO
    public final int OooOo(o000O00 o000o00, o000O0O0 o000o0o0) {
        return this.f3213OooOo00 == 1 ? this.f3207OooOOOo : super.OooOo(o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final o0000O OooOo00(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new o00O000((ViewGroup.MarginLayoutParams) layoutParams) : new o00O000(layoutParams);
    }

    @Override // o000oOoO.o000OO
    public final void Oooo(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f5007OooO0O0;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.f3228Oooo0OO);
        }
        for (int i = 0; i < this.f3207OooOOOo; i++) {
            this.f3209OooOOo0[i].OooO0O0();
        }
        recyclerView.requestLayout();
    }

    @Override // o000oOoO.o000OO
    public final int Oooo00o(o000O00 o000o00, o000O0O0 o000o0o0) {
        return this.f3213OooOo00 == 0 ? this.f3207OooOOOo : super.Oooo00o(o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final boolean Oooo0O0() {
        return this.f3219OooOoo != 0;
    }

    @Override // o000oOoO.o000OO
    public final void Oooo0o(int i) {
        super.Oooo0o(i);
        for (int i2 = 0; i2 < this.f3207OooOOOo; i2++) {
            o00O00O o00o00o = this.f3209OooOOo0[i2];
            int i3 = o00o00o.f5068OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                o00o00o.f5068OooO0O0 = i3 + i;
            }
            int i4 = o00o00o.f5069OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                o00o00o.f5069OooO0OO = i4 + i;
            }
        }
    }

    @Override // o000oOoO.o000OO
    public final void Oooo0oO(int i) {
        super.Oooo0oO(i);
        for (int i2 = 0; i2 < this.f3207OooOOOo; i2++) {
            o00O00O o00o00o = this.f3209OooOOo0[i2];
            int i3 = o00o00o.f5068OooO0O0;
            if (i3 != Integer.MIN_VALUE) {
                o00o00o.f5068OooO0O0 = i3 + i;
            }
            int i4 = o00o00o.f5069OooO0OO;
            if (i4 != Integer.MIN_VALUE) {
                o00o00o.f5069OooO0OO = i4 + i;
            }
        }
    }

    @Override // o000oOoO.o000OO
    public final void OoooO(o000O00 o000o00, o000O0O0 o000o0o0, View view, o000oOoO o000oooo) {
        int i;
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof o00O000)) {
            OoooO0O(view, o000oooo);
            return;
        }
        o00O000 o00o000 = (o00O000) layoutParams;
        int i4 = 1;
        int i5 = -1;
        if (this.f3213OooOo00 == 0) {
            o00O00O o00o00o = o00o000.f5060OooO0o0;
            if (o00o00o == null) {
                i3 = -1;
            } else {
                i3 = o00o00o.f5072OooO0o0;
            }
            i2 = -1;
        } else {
            o00O00O o00o00o2 = o00o000.f5060OooO0o0;
            if (o00o00o2 == null) {
                i = -1;
            } else {
                i = o00o00o2.f5072OooO0o0;
            }
            i2 = i;
            i3 = -1;
            i5 = 1;
            i4 = -1;
        }
        o000oooo.OooO(Oooo0.OooO00o(i3, i4, i2, i5, false));
    }

    @Override // o000oOoO.o000OO
    public final void OoooO0(AccessibilityEvent accessibilityEvent) {
        super.OoooO0(accessibilityEvent);
        if (OooOo0O() > 0) {
            View o000000o2 = o000000o(false);
            View o000000O2 = o000000O(false);
            if (o000000o2 == null || o000000O2 == null) {
                return;
            }
            int Oooo0002 = o000OO.Oooo000(o000000o2);
            int Oooo0003 = o000OO.Oooo000(o000000O2);
            if (Oooo0002 < Oooo0003) {
                accessibilityEvent.setFromIndex(Oooo0002);
                accessibilityEvent.setToIndex(Oooo0003);
                return;
            }
            accessibilityEvent.setFromIndex(Oooo0003);
            accessibilityEvent.setToIndex(Oooo0002);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004a, code lost:
        if (r8.f3213OooOo00 == 1) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x004f, code lost:
        if (r8.f3213OooOo00 == 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x005d, code lost:
        if (o00000oo() == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0069, code lost:
        if (o00000oo() == false) goto L115;
     */
    @Override // o000oOoO.o000OO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View OoooO00(android.view.View r9, int r10, o000oOoO.o000O00 r11, o000oOoO.o000O0O0 r12) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.OoooO00(android.view.View, int, o000oOoO.o000O00, o000oOoO.o000O0O0):android.view.View");
    }

    @Override // o000oOoO.o000OO
    public final void OoooOO0(int i, int i2) {
        o0000Ooo(i, i2, 1);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOOO(int i, int i2) {
        o0000Ooo(i, i2, 8);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOOo(int i, int i2) {
        o0000Ooo(i, i2, 2);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOo0(int i, int i2) {
        o0000Ooo(i, i2, 4);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOoO(o000O00 o000o00, o000O0O0 o000o0o0) {
        o0000(o000o00, o000o0o0, true);
    }

    @Override // o000oOoO.o000OO
    public final void OoooOoo(o000O0O0 o000o0o0) {
        this.f3216OooOoO = -1;
        this.f3218OooOoOO = Integer.MIN_VALUE;
        this.f3224Oooo000 = null;
        this.f3226Oooo00o.OooO00o();
    }

    @Override // o000oOoO.o000OO
    public final void Ooooo00(Parcelable parcelable) {
        if (parcelable instanceof o00O00) {
            this.f3224Oooo000 = (o00O00) parcelable;
            Ooooooo();
        }
    }

    @Override // o000oOoO.o000OO
    public final Parcelable Ooooo0o() {
        int o00000O2;
        View o000000o2;
        int OooO2;
        int OooO0oo2;
        int[] iArr;
        o00O00 o00o00 = this.f3224Oooo000;
        if (o00o00 != null) {
            return new o00O00(o00o00);
        }
        o00O00 o00o002 = new o00O00();
        o00o002.f5058OooO0oo = this.f3215OooOo0o;
        o00o002.f5050OooO = this.f3221OooOooO;
        o00o002.f5059OooOO0 = this.f3222OooOooo;
        oo00o oo00oVar = this.f3220OooOoo0;
        if (oo00oVar != null && (iArr = (int[]) oo00oVar.f5172OooO0O0) != null) {
            o00o002.f5055OooO0o = iArr;
            o00o002.f5056OooO0o0 = iArr.length;
            o00o002.f5057OooO0oO = (List) oo00oVar.f5173OooO0OO;
        } else {
            o00o002.f5056OooO0o0 = 0;
        }
        int i = -1;
        if (OooOo0O() > 0) {
            if (this.f3221OooOooO) {
                o00000O2 = o00000OO();
            } else {
                o00000O2 = o00000O();
            }
            o00o002.f5051OooO00o = o00000O2;
            if (this.f3211OooOo) {
                o000000o2 = o000000O(true);
            } else {
                o000000o2 = o000000o(true);
            }
            if (o000000o2 != null) {
                i = o000OO.Oooo000(o000000o2);
            }
            o00o002.f5052OooO0O0 = i;
            int i2 = this.f3207OooOOOo;
            o00o002.f5053OooO0OO = i2;
            o00o002.f5054OooO0Oo = new int[i2];
            for (int i3 = 0; i3 < this.f3207OooOOOo; i3++) {
                if (this.f3221OooOooO) {
                    OooO2 = this.f3209OooOOo0[i3].OooO0o(Integer.MIN_VALUE);
                    if (OooO2 != Integer.MIN_VALUE) {
                        OooO0oo2 = this.f3208OooOOo.OooO0o();
                        OooO2 -= OooO0oo2;
                        o00o002.f5054OooO0Oo[i3] = OooO2;
                    } else {
                        o00o002.f5054OooO0Oo[i3] = OooO2;
                    }
                } else {
                    OooO2 = this.f3209OooOOo0[i3].OooO(Integer.MIN_VALUE);
                    if (OooO2 != Integer.MIN_VALUE) {
                        OooO0oo2 = this.f3208OooOOo.OooO0oo();
                        OooO2 -= OooO0oo2;
                        o00o002.f5054OooO0Oo[i3] = OooO2;
                    } else {
                        o00o002.f5054OooO0Oo[i3] = OooO2;
                    }
                }
            }
        } else {
            o00o002.f5051OooO00o = -1;
            o00o002.f5052OooO0O0 = -1;
            o00o002.f5053OooO0OO = 0;
        }
        return o00o002;
    }

    @Override // o000oOoO.o000OO
    public final void OooooO0(int i) {
        if (i == 0) {
            o0OO00O();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:253:0x03eb, code lost:
        if (o0OO00O() != false) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000(o000oOoO.o000O00 r17, o000oOoO.o000O0O0 r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000(o000oOoO.o000O00, o000oOoO.o000O0O0, boolean):void");
    }

    public final void o00000(o000O00 o000o00, o000O0O0 o000o0o0, boolean z) {
        int OooO0o2;
        int o00000Oo2 = o00000Oo(Integer.MIN_VALUE);
        if (o00000Oo2 != Integer.MIN_VALUE && (OooO0o2 = this.f3208OooOOo.OooO0o() - o00000Oo2) > 0) {
            int i = OooO0o2 - (-o0000O(-OooO0o2, o000o00, o000o0o0));
            if (!z || i <= 0) {
                return;
            }
            this.f3208OooOOo.OooOO0o(i);
        }
    }

    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r8v31 */
    public final int o000000(o000O00 o000o00, o00oO0o o00oo0o, o000O0O0 o000o0o0) {
        int i;
        int OooO0oo2;
        int i2;
        int o00000Oo2;
        int i3;
        int i4;
        o00O00O o00o00o;
        ?? r8;
        int OooOo0o2;
        int i5;
        int OooOo0o3;
        int OooO2;
        int OooO0OO2;
        int OooO0oo3;
        int OooO0OO3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 1;
        this.f3217OooOoO0.set(0, this.f3207OooOOOo, true);
        o00oO0o o00oo0o2 = this.f3214OooOo0O;
        if (o00oo0o2.f5092OooO) {
            if (o00oo0o.f5098OooO0o0 == 1) {
                i = Integer.MAX_VALUE;
            } else {
                i = Integer.MIN_VALUE;
            }
        } else if (o00oo0o.f5098OooO0o0 == 1) {
            i = o00oo0o.f5099OooO0oO + o00oo0o.f5094OooO0O0;
        } else {
            i = o00oo0o.f5097OooO0o - o00oo0o.f5094OooO0O0;
        }
        int i12 = o00oo0o.f5098OooO0o0;
        for (int i13 = 0; i13 < this.f3207OooOOOo; i13++) {
            if (!this.f3209OooOOo0[i13].f5067OooO00o.isEmpty()) {
                o0000OOO(this.f3209OooOOo0[i13], i12, i);
            }
        }
        if (this.f3211OooOo) {
            OooO0oo2 = this.f3208OooOOo.OooO0o();
        } else {
            OooO0oo2 = this.f3208OooOOo.OooO0oo();
        }
        boolean z = false;
        while (true) {
            int i14 = o00oo0o.f5095OooO0OO;
            if (i14 >= 0 && i14 < o000o0o0.OooO0O0()) {
                i2 = i11;
            } else {
                i2 = i10;
            }
            if (i2 == 0 || (!o00oo0o2.f5092OooO && this.f3217OooOoO0.isEmpty())) {
                break;
            }
            View OooO0Oo2 = o000o00.OooO0Oo(o00oo0o.f5095OooO0OO);
            o00oo0o.f5095OooO0OO += o00oo0o.f5096OooO0Oo;
            o00O000 o00o000 = (o00O000) OooO0Oo2.getLayoutParams();
            int OooO00o2 = o00o000.OooO00o();
            oo00o oo00oVar = this.f3220OooOoo0;
            int[] iArr = (int[]) oo00oVar.f5172OooO0O0;
            if (iArr != null && OooO00o2 < iArr.length) {
                i3 = iArr[OooO00o2];
            } else {
                i3 = -1;
            }
            if (i3 == -1) {
                i4 = i11;
            } else {
                i4 = i10;
            }
            if (i4 != 0) {
                if (o0000O00(o00oo0o.f5098OooO0o0)) {
                    i9 = this.f3207OooOOOo - i11;
                    i8 = -1;
                    i7 = -1;
                } else {
                    i7 = i11;
                    i8 = this.f3207OooOOOo;
                    i9 = i10;
                }
                o00O00O o00o00o2 = null;
                if (o00oo0o.f5098OooO0o0 == i11) {
                    int OooO0oo4 = this.f3208OooOOo.OooO0oo();
                    int i15 = Integer.MAX_VALUE;
                    while (i9 != i8) {
                        o00O00O o00o00o3 = this.f3209OooOOo0[i9];
                        int OooO0o2 = o00o00o3.OooO0o(OooO0oo4);
                        if (OooO0o2 < i15) {
                            i15 = OooO0o2;
                            o00o00o2 = o00o00o3;
                        }
                        i9 += i7;
                    }
                } else {
                    int OooO0o3 = this.f3208OooOOo.OooO0o();
                    int i16 = Integer.MIN_VALUE;
                    while (i9 != i8) {
                        o00O00O o00o00o4 = this.f3209OooOOo0[i9];
                        int OooO3 = o00o00o4.OooO(OooO0o3);
                        if (OooO3 > i16) {
                            o00o00o2 = o00o00o4;
                            i16 = OooO3;
                        }
                        i9 += i7;
                    }
                }
                o00o00o = o00o00o2;
                oo00oVar.OooO0o0(OooO00o2);
                ((int[]) oo00oVar.f5172OooO0O0)[OooO00o2] = o00o00o.f5072OooO0o0;
            } else {
                o00o00o = this.f3209OooOOo0[i3];
            }
            o00o000.f5060OooO0o0 = o00o00o;
            if (o00oo0o.f5098OooO0o0 == 1) {
                r8 = 0;
                OooO0O0(OooO0Oo2, -1, false);
            } else {
                r8 = 0;
                OooO0O0(OooO0Oo2, 0, false);
            }
            if (this.f3213OooOo00 == 1) {
                OooOo0o2 = o000OO.OooOo0o(this.f3212OooOo0, this.f5016OooOO0o, r8, ((ViewGroup.MarginLayoutParams) o00o000).width, r8);
                OooOo0o3 = o000OO.OooOo0o(this.f5018OooOOOO, this.OooOOO0, OooOoo0() + OooOooo(), ((ViewGroup.MarginLayoutParams) o00o000).height, true);
                i5 = 0;
            } else {
                OooOo0o2 = o000OO.OooOo0o(this.f5017OooOOO, this.f5016OooOO0o, OooOooO() + OooOoo(), ((ViewGroup.MarginLayoutParams) o00o000).width, true);
                i5 = 0;
                OooOo0o3 = o000OO.OooOo0o(this.f3212OooOo0, this.OooOOO0, 0, ((ViewGroup.MarginLayoutParams) o00o000).height, false);
            }
            RecyclerView recyclerView = this.f5007OooO0O0;
            Rect rect = this.f3225Oooo00O;
            if (recyclerView == null) {
                rect.set(i5, i5, i5, i5);
            } else {
                rect.set(recyclerView.Oooo0O0(OooO0Oo2));
            }
            o00O000 o00o0002 = (o00O000) OooO0Oo2.getLayoutParams();
            int o0000OOo2 = o0000OOo(OooOo0o2, ((ViewGroup.MarginLayoutParams) o00o0002).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) o00o0002).rightMargin + rect.right);
            int o0000OOo3 = o0000OOo(OooOo0o3, ((ViewGroup.MarginLayoutParams) o00o0002).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) o00o0002).bottomMargin + rect.bottom);
            if (o00oO0o(OooO0Oo2, o0000OOo2, o0000OOo3, o00o0002)) {
                OooO0Oo2.measure(o0000OOo2, o0000OOo3);
            }
            if (o00oo0o.f5098OooO0o0 == 1) {
                OooO0OO2 = o00o00o.OooO0o(OooO0oo2);
                OooO2 = this.f3208OooOOo.OooO0OO(OooO0Oo2) + OooO0OO2;
            } else {
                OooO2 = o00o00o.OooO(OooO0oo2);
                OooO0OO2 = OooO2 - this.f3208OooOOo.OooO0OO(OooO0Oo2);
            }
            int i17 = o00oo0o.f5098OooO0o0;
            o00O00O o00o00o5 = o00o000.f5060OooO0o0;
            o00o00o5.getClass();
            if (i17 == 1) {
                o00O000 o00o0003 = (o00O000) OooO0Oo2.getLayoutParams();
                o00o0003.f5060OooO0o0 = o00o00o5;
                ArrayList arrayList = o00o00o5.f5067OooO00o;
                arrayList.add(OooO0Oo2);
                o00o00o5.f5069OooO0OO = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    o00o00o5.f5068OooO0O0 = Integer.MIN_VALUE;
                }
                if (o00o0003.OooO0OO() || o00o0003.OooO0O0()) {
                    o00o00o5.f5070OooO0Oo = o00o00o5.f5071OooO0o.f3208OooOOo.OooO0OO(OooO0Oo2) + o00o00o5.f5070OooO0Oo;
                }
            } else {
                o00O000 o00o0004 = (o00O000) OooO0Oo2.getLayoutParams();
                o00o0004.f5060OooO0o0 = o00o00o5;
                ArrayList arrayList2 = o00o00o5.f5067OooO00o;
                arrayList2.add(0, OooO0Oo2);
                o00o00o5.f5068OooO0O0 = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    o00o00o5.f5069OooO0OO = Integer.MIN_VALUE;
                }
                if (o00o0004.OooO0OO() || o00o0004.OooO0O0()) {
                    o00o00o5.f5070OooO0Oo = o00o00o5.f5071OooO0o.f3208OooOOo.OooO0OO(OooO0Oo2) + o00o00o5.f5070OooO0Oo;
                }
            }
            if (o00000oo() && this.f3213OooOo00 == 1) {
                OooO0OO3 = this.f3210OooOOoo.OooO0o() - (((this.f3207OooOOOo - 1) - o00o00o.f5072OooO0o0) * this.f3212OooOo0);
                OooO0oo3 = OooO0OO3 - this.f3210OooOOoo.OooO0OO(OooO0Oo2);
            } else {
                OooO0oo3 = this.f3210OooOOoo.OooO0oo() + (o00o00o.f5072OooO0o0 * this.f3212OooOo0);
                OooO0OO3 = this.f3210OooOOoo.OooO0OO(OooO0Oo2) + OooO0oo3;
            }
            if (this.f3213OooOo00 == 1) {
                int i18 = OooO0oo3;
                OooO0oo3 = OooO0OO2;
                OooO0OO2 = i18;
                int i19 = OooO0OO3;
                OooO0OO3 = OooO2;
                OooO2 = i19;
            }
            o000OO.Oooo0o0(OooO0Oo2, OooO0OO2, OooO0oo3, OooO2, OooO0OO3);
            o0000OOO(o00o00o, o00oo0o2.f5098OooO0o0, i);
            o0000oO(o000o00, o00oo0o2);
            if (o00oo0o2.f5100OooO0oo && OooO0Oo2.hasFocusable()) {
                i6 = 0;
                this.f3217OooOoO0.set(o00o00o.f5072OooO0o0, false);
            } else {
                i6 = 0;
            }
            i10 = i6;
            i11 = 1;
            z = true;
        }
        int i20 = i10;
        if (!z) {
            o0000oO(o000o00, o00oo0o2);
        }
        if (o00oo0o2.f5098OooO0o0 == -1) {
            o00000Oo2 = this.f3208OooOOo.OooO0oo() - o00000o0(this.f3208OooOOo.OooO0oo());
        } else {
            o00000Oo2 = o00000Oo(this.f3208OooOOo.OooO0o()) - this.f3208OooOOo.OooO0o();
        }
        if (o00000Oo2 > 0) {
            return Math.min(o00oo0o.f5094OooO0O0, o00000Oo2);
        }
        return i20;
    }

    public final View o000000O(boolean z) {
        int OooO0oo2 = this.f3208OooOOo.OooO0oo();
        int OooO0o2 = this.f3208OooOOo.OooO0o();
        View view = null;
        for (int OooOo0O2 = OooOo0O() - 1; OooOo0O2 >= 0; OooOo0O2--) {
            View OooOo02 = OooOo0(OooOo0O2);
            int OooO0Oo2 = this.f3208OooOOo.OooO0Oo(OooOo02);
            int OooO0O02 = this.f3208OooOOo.OooO0O0(OooOo02);
            if (OooO0O02 > OooO0oo2 && OooO0Oo2 < OooO0o2) {
                if (OooO0O02 <= OooO0o2 || !z) {
                    return OooOo02;
                }
                if (view == null) {
                    view = OooOo02;
                }
            }
        }
        return view;
    }

    public final View o000000o(boolean z) {
        int OooO0oo2 = this.f3208OooOOo.OooO0oo();
        int OooO0o2 = this.f3208OooOOo.OooO0o();
        int OooOo0O2 = OooOo0O();
        View view = null;
        for (int i = 0; i < OooOo0O2; i++) {
            View OooOo02 = OooOo0(i);
            int OooO0Oo2 = this.f3208OooOOo.OooO0Oo(OooOo02);
            if (this.f3208OooOOo.OooO0O0(OooOo02) > OooO0oo2 && OooO0Oo2 < OooO0o2) {
                if (OooO0Oo2 >= OooO0oo2 || !z) {
                    return OooOo02;
                }
                if (view == null) {
                    view = OooOo02;
                }
            }
        }
        return view;
    }

    public final int o00000O() {
        if (OooOo0O() == 0) {
            return 0;
        }
        return o000OO.Oooo000(OooOo0(0));
    }

    public final void o00000O0(o000O00 o000o00, o000O0O0 o000o0o0, boolean z) {
        int OooO0oo2;
        int o00000o02 = o00000o0(Integer.MAX_VALUE);
        if (o00000o02 != Integer.MAX_VALUE && (OooO0oo2 = o00000o02 - this.f3208OooOOo.OooO0oo()) > 0) {
            int o0000O2 = OooO0oo2 - o0000O(OooO0oo2, o000o00, o000o0o0);
            if (!z || o0000O2 <= 0) {
                return;
            }
            this.f3208OooOOo.OooOO0o(-o0000O2);
        }
    }

    public final int o00000OO() {
        int OooOo0O2 = OooOo0O();
        if (OooOo0O2 == 0) {
            return 0;
        }
        return o000OO.Oooo000(OooOo0(OooOo0O2 - 1));
    }

    public final int o00000Oo(int i) {
        int OooO0o2 = this.f3209OooOOo0[0].OooO0o(i);
        for (int i2 = 1; i2 < this.f3207OooOOOo; i2++) {
            int OooO0o3 = this.f3209OooOOo0[i2].OooO0o(i);
            if (OooO0o3 > OooO0o2) {
                OooO0o2 = OooO0o3;
            }
        }
        return OooO0o2;
    }

    public final int o00000o0(int i) {
        int OooO2 = this.f3209OooOOo0[0].OooO(i);
        for (int i2 = 1; i2 < this.f3207OooOOOo; i2++) {
            int OooO3 = this.f3209OooOOo0[i2].OooO(i);
            if (OooO3 < OooO2) {
                OooO2 = OooO3;
            }
        }
        return OooO2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cb, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r10 == r11) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View o00000oO() {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o00000oO():android.view.View");
    }

    public final boolean o00000oo() {
        return OooOoOO() == 1;
    }

    public final int o0000O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        if (OooOo0O() == 0 || i == 0) {
            return 0;
        }
        o0000oo(i, o000o0o0);
        o00oO0o o00oo0o = this.f3214OooOo0O;
        int o0000002 = o000000(o000o00, o00oo0o, o000o0o0);
        if (o00oo0o.f5094OooO0O0 >= o0000002) {
            i = i < 0 ? -o0000002 : o0000002;
        }
        this.f3208OooOOo.OooOO0o(-i);
        this.f3221OooOooO = this.f3211OooOo;
        o00oo0o.f5094OooO0O0 = 0;
        o0000oO(o000o00, o00oo0o);
        return i;
    }

    public final void o0000O0(int i, o000O00 o000o00) {
        for (int OooOo0O2 = OooOo0O() - 1; OooOo0O2 >= 0; OooOo0O2--) {
            View OooOo02 = OooOo0(OooOo0O2);
            if (this.f3208OooOOo.OooO0Oo(OooOo02) >= i && this.f3208OooOOo.OooOO0O(OooOo02) >= i) {
                o00O000 o00o000 = (o00O000) OooOo02.getLayoutParams();
                o00o000.getClass();
                if (o00o000.f5060OooO0o0.f5067OooO00o.size() == 1) {
                    return;
                }
                o00O00O o00o00o = o00o000.f5060OooO0o0;
                ArrayList arrayList = o00o00o.f5067OooO00o;
                int size = arrayList.size();
                View view = (View) arrayList.remove(size - 1);
                o00O000 OooO0oo2 = o00O00O.OooO0oo(view);
                OooO0oo2.f5060OooO0o0 = null;
                if (OooO0oo2.OooO0OO() || OooO0oo2.OooO0O0()) {
                    o00o00o.f5070OooO0Oo -= o00o00o.f5071OooO0o.f3208OooOOo.OooO0OO(view);
                }
                if (size == 1) {
                    o00o00o.f5068OooO0O0 = Integer.MIN_VALUE;
                }
                o00o00o.f5069OooO0OO = Integer.MIN_VALUE;
                Oooooo0(OooOo02, o000o00);
            } else {
                return;
            }
        }
    }

    public final boolean o0000O00(int i) {
        if (this.f3213OooOo00 == 0) {
            return (i == -1) != this.f3211OooOo;
        }
        return ((i == -1) == this.f3211OooOo) == o00000oo();
    }

    public final void o0000O0O(int i, o000O00 o000o00) {
        while (OooOo0O() > 0) {
            View OooOo02 = OooOo0(0);
            if (this.f3208OooOOo.OooO0O0(OooOo02) <= i && this.f3208OooOOo.OooOO0(OooOo02) <= i) {
                o00O000 o00o000 = (o00O000) OooOo02.getLayoutParams();
                o00o000.getClass();
                if (o00o000.f5060OooO0o0.f5067OooO00o.size() == 1) {
                    return;
                }
                o00O00O o00o00o = o00o000.f5060OooO0o0;
                ArrayList arrayList = o00o00o.f5067OooO00o;
                View view = (View) arrayList.remove(0);
                o00O000 OooO0oo2 = o00O00O.OooO0oo(view);
                OooO0oo2.f5060OooO0o0 = null;
                if (arrayList.size() == 0) {
                    o00o00o.f5069OooO0OO = Integer.MIN_VALUE;
                }
                if (OooO0oo2.OooO0OO() || OooO0oo2.OooO0O0()) {
                    o00o00o.f5070OooO0Oo -= o00o00o.f5071OooO0o.f3208OooOOo.OooO0OO(view);
                }
                o00o00o.f5068OooO0O0 = Integer.MIN_VALUE;
                Oooooo0(OooOo02, o000o00);
            } else {
                return;
            }
        }
    }

    public final void o0000OO(int i, o000O0O0 o000o0o0) {
        boolean z;
        int i2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        o00oO0o o00oo0o = this.f3214OooOo0O;
        boolean z4 = false;
        o00oo0o.f5094OooO0O0 = 0;
        o00oo0o.f5095OooO0OO = i;
        oo0o0Oo oo0o0oo = this.f5011OooO0o0;
        if (oo0o0oo != null && oo0o0oo.f5180OooO0o0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (i4 = o000o0o0.f4982OooO00o) != -1) {
            boolean z5 = this.f3211OooOo;
            if (i4 < i) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z5 == z3) {
                i2 = this.f3208OooOOo.OooO();
                i3 = 0;
            } else {
                i3 = this.f3208OooOOo.OooO();
                i2 = 0;
            }
        } else {
            i2 = 0;
            i3 = 0;
        }
        RecyclerView recyclerView = this.f5007OooO0O0;
        if (recyclerView != null && recyclerView.f3150OooO0oO) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            o00oo0o.f5097OooO0o = this.f3208OooOOo.OooO0oo() - i3;
            o00oo0o.f5099OooO0oO = this.f3208OooOOo.OooO0o() + i2;
        } else {
            o00oo0o.f5099OooO0oO = this.f3208OooOOo.OooO0o0() + i2;
            o00oo0o.f5097OooO0o = -i3;
        }
        o00oo0o.f5100OooO0oo = false;
        o00oo0o.f5093OooO00o = true;
        if (this.f3208OooOOo.OooO0oO() == 0 && this.f3208OooOOo.OooO0o0() == 0) {
            z4 = true;
        }
        o00oo0o.f5092OooO = z4;
    }

    public final void o0000OO0(int i) {
        o00oO0o o00oo0o = this.f3214OooOo0O;
        o00oo0o.f5098OooO0o0 = i;
        o00oo0o.f5096OooO0Oo = this.f3211OooOo != (i == -1) ? -1 : 1;
    }

    public final void o0000OOO(o00O00O o00o00o, int i, int i2) {
        int i3 = o00o00o.f5070OooO0Oo;
        if (i == -1) {
            int i4 = o00o00o.f5068OooO0O0;
            if (i4 == Integer.MIN_VALUE) {
                View view = (View) o00o00o.f5067OooO00o.get(0);
                o00O000 OooO0oo2 = o00O00O.OooO0oo(view);
                o00o00o.f5068OooO0O0 = o00o00o.f5071OooO0o.f3208OooOOo.OooO0Oo(view);
                OooO0oo2.getClass();
                i4 = o00o00o.f5068OooO0O0;
            }
            if (i4 + i3 > i2) {
                return;
            }
        } else {
            int i5 = o00o00o.f5069OooO0OO;
            if (i5 == Integer.MIN_VALUE) {
                o00o00o.OooO00o();
                i5 = o00o00o.f5069OooO0OO;
            }
            if (i5 - i3 < i2) {
                return;
            }
        }
        this.f3217OooOoO0.set(o00o00o.f5072OooO0o0, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000Ooo(int r8, int r9, int r10) {
        /*
            r7 = this;
            boolean r0 = r7.f3211OooOo
            if (r0 == 0) goto L9
            int r0 = r7.o00000OO()
            goto Ld
        L9:
            int r0 = r7.o00000O()
        Ld:
            r1 = 8
            if (r10 != r1) goto L1a
            if (r8 >= r9) goto L16
            int r2 = r9 + 1
            goto L1c
        L16:
            int r2 = r8 + 1
            r3 = r9
            goto L1d
        L1a:
            int r2 = r8 + r9
        L1c:
            r3 = r8
        L1d:
            o000oOoO.oo00o r4 = r7.f3220OooOoo0
            r4.OooO0oO(r3)
            r5 = 1
            if (r10 == r5) goto L36
            r6 = 2
            if (r10 == r6) goto L32
            if (r10 == r1) goto L2b
            goto L39
        L2b:
            r4.OooOO0(r8, r5)
            r4.OooO(r9, r5)
            goto L39
        L32:
            r4.OooOO0(r8, r9)
            goto L39
        L36:
            r4.OooO(r8, r9)
        L39:
            if (r2 > r0) goto L3c
            return
        L3c:
            boolean r8 = r7.f3211OooOo
            if (r8 == 0) goto L45
            int r8 = r7.o00000O()
            goto L49
        L45:
            int r8 = r7.o00000OO()
        L49:
            if (r3 > r8) goto L4e
            r7.Ooooooo()
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000Ooo(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0011, code lost:
        if (r6.f5098OooO0o0 == (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o0000oO(o000oOoO.o000O00 r5, o000oOoO.o00oO0o r6) {
        /*
            r4 = this;
            boolean r0 = r6.f5093OooO00o
            if (r0 == 0) goto L7c
            boolean r0 = r6.f5092OooO
            if (r0 == 0) goto La
            goto L7c
        La:
            int r0 = r6.f5094OooO0O0
            r1 = -1
            if (r0 != 0) goto L1f
            int r0 = r6.f5098OooO0o0
            if (r0 != r1) goto L19
        L13:
            int r6 = r6.f5099OooO0oO
        L15:
            r4.o0000O0(r6, r5)
            goto L7c
        L19:
            int r6 = r6.f5097OooO0o
        L1b:
            r4.o0000O0O(r6, r5)
            goto L7c
        L1f:
            int r0 = r6.f5098OooO0o0
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L50
            int r0 = r6.f5097OooO0o
            o000oOoO.o00O00O[] r1 = r4.f3209OooOOo0
            r1 = r1[r2]
            int r1 = r1.OooO(r0)
        L2f:
            int r2 = r4.f3207OooOOOo
            if (r3 >= r2) goto L41
            o000oOoO.o00O00O[] r2 = r4.f3209OooOOo0
            r2 = r2[r3]
            int r2 = r2.OooO(r0)
            if (r2 <= r1) goto L3e
            r1 = r2
        L3e:
            int r3 = r3 + 1
            goto L2f
        L41:
            int r0 = r0 - r1
            if (r0 >= 0) goto L45
            goto L13
        L45:
            int r1 = r6.f5099OooO0oO
            int r6 = r6.f5094OooO0O0
            int r6 = java.lang.Math.min(r0, r6)
            int r6 = r1 - r6
            goto L15
        L50:
            int r0 = r6.f5099OooO0oO
            o000oOoO.o00O00O[] r1 = r4.f3209OooOOo0
            r1 = r1[r2]
            int r1 = r1.OooO0o(r0)
        L5a:
            int r2 = r4.f3207OooOOOo
            if (r3 >= r2) goto L6c
            o000oOoO.o00O00O[] r2 = r4.f3209OooOOo0
            r2 = r2[r3]
            int r2 = r2.OooO0o(r0)
            if (r2 >= r1) goto L69
            r1 = r2
        L69:
            int r3 = r3 + 1
            goto L5a
        L6c:
            int r0 = r6.f5099OooO0oO
            int r1 = r1 - r0
            if (r1 >= 0) goto L72
            goto L19
        L72:
            int r0 = r6.f5097OooO0o
            int r6 = r6.f5094OooO0O0
            int r6 = java.lang.Math.min(r1, r6)
            int r6 = r6 + r0
            goto L1b
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.o0000oO(o000oOoO.o000O00, o000oOoO.o00oO0o):void");
    }

    public final void o0000oo(int i, o000O0O0 o000o0o0) {
        int o00000O2;
        int i2;
        if (i > 0) {
            o00000O2 = o00000OO();
            i2 = 1;
        } else {
            o00000O2 = o00000O();
            i2 = -1;
        }
        o00oO0o o00oo0o = this.f3214OooOo0O;
        o00oo0o.f5093OooO00o = true;
        o0000OO(o00000O2, o000o0o0);
        o0000OO0(i2);
        o00oo0o.f5095OooO0OO = o00000O2 + o00oo0o.f5096OooO0Oo;
        o00oo0o.f5094OooO0O0 = Math.abs(i);
    }

    public final void o000OO() {
        this.f3211OooOo = (this.f3213OooOo00 == 1 || !o00000oo()) ? this.f3215OooOo0o : !this.f3215OooOo0o;
    }

    public final int o000OOo(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000OOo o000ooo = this.f3208OooOOo;
        boolean z = this.f3223Oooo0;
        return OooO00o.Oooo0oo(o000o0o0, o000ooo, o000000o(!z), o000000O(!z), this, this.f3223Oooo0);
    }

    @Override // o000oOoO.o000OO
    public final void o000oOoO() {
        this.f3220OooOoo0.OooO0Oo();
        Ooooooo();
    }

    @Override // o000oOoO.o000OO
    public final int o00O0O(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        return o0000O(i, o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final void o00o0O(Rect rect, int i, int i2) {
        int OooO0oO2;
        int OooO0oO3;
        int OooOooO2 = OooOooO() + OooOoo();
        int OooOoo02 = OooOoo0() + OooOooo();
        if (this.f3213OooOo00 == 1) {
            int height = rect.height() + OooOoo02;
            RecyclerView recyclerView = this.f5007OooO0O0;
            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
            OooO0oO3 = o000OO.OooO0oO(i2, height, o00O0O0.OooO0Oo(recyclerView));
            OooO0oO2 = o000OO.OooO0oO(i, (this.f3212OooOo0 * this.f3207OooOOOo) + OooOooO2, o00O0O0.OooO0o0(this.f5007OooO0O0));
        } else {
            int width = rect.width() + OooOooO2;
            RecyclerView recyclerView2 = this.f5007OooO0O0;
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            OooO0oO2 = o000OO.OooO0oO(i, width, o00O0O0.OooO0o0(recyclerView2));
            OooO0oO3 = o000OO.OooO0oO(i2, (this.f3212OooOo0 * this.f3207OooOOOo) + OooOoo02, o00O0O0.OooO0Oo(this.f5007OooO0O0));
        }
        this.f5007OooO0O0.setMeasuredDimension(OooO0oO2, OooO0oO3);
    }

    public final int o0O0O00(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000OOo o000ooo = this.f3208OooOOo;
        boolean z = this.f3223Oooo0;
        return OooO00o.Oooo0oO(o000o0o0, o000ooo, o000000o(!z), o000000O(!z), this, this.f3223Oooo0, this.f3211OooOo);
    }

    public final boolean o0OO00O() {
        int o00000O2;
        if (OooOo0O() != 0 && this.f3219OooOoo != 0 && this.f5012OooO0oO) {
            if (this.f3211OooOo) {
                o00000O2 = o00000OO();
                o00000O();
            } else {
                o00000O2 = o00000O();
                o00000OO();
            }
            if (o00000O2 == 0 && o00000oO() != null) {
                this.f3220OooOoo0.OooO0Oo();
                this.f5010OooO0o = true;
                Ooooooo();
                return true;
            }
        }
        return false;
    }

    @Override // o000oOoO.o000OO
    public final boolean o0OOO0o() {
        return this.f3224Oooo000 == null;
    }

    public final int o0Oo0oo(int i) {
        if (OooOo0O() == 0) {
            return this.f3211OooOo ? 1 : -1;
        }
        return (i < o00000O()) != this.f3211OooOo ? -1 : 1;
    }

    @Override // o000oOoO.o000OO
    public final int o0OoOo0(int i, o000O00 o000o00, o000O0O0 o000o0o0) {
        return o0000O(i, o000o00, o000o0o0);
    }

    @Override // o000oOoO.o000OO
    public final void o0ooOOo(RecyclerView recyclerView, int i) {
        oo0o0Oo oo0o0oo = new oo0o0Oo(recyclerView.getContext());
        oo0o0oo.f5175OooO00o = i;
        o0ooOoO(oo0o0oo);
    }

    public final int oo0o0Oo(o000O0O0 o000o0o0) {
        if (OooOo0O() == 0) {
            return 0;
        }
        o000OOo o000ooo = this.f3208OooOOo;
        boolean z = this.f3223Oooo0;
        return OooO00o.Oooo0o(o000o0o0, o000ooo, o000000o(!z), o000000O(!z), this, this.f3223Oooo0);
    }

    @Override // o000oOoO.o000OO
    public final void ooOO(int i) {
        o00O00 o00o00 = this.f3224Oooo000;
        if (o00o00 != null && o00o00.f5051OooO00o != i) {
            o00o00.f5054OooO0Oo = null;
            o00o00.f5053OooO0OO = 0;
            o00o00.f5051OooO00o = -1;
            o00o00.f5052OooO0O0 = -1;
        }
        this.f3216OooOoO = i;
        this.f3218OooOoOO = Integer.MIN_VALUE;
        Ooooooo();
    }
}