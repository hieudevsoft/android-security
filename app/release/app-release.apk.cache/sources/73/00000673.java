package o000oOoO;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o000OO00 implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5019OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5020OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public OverScroller f5021OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public Interpolator f5022OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f5023OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f5024OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f5025OooO0oO;

    public o000OO00(RecyclerView recyclerView) {
        this.f5025OooO0oO = recyclerView;
        Oooo0o0.Oooo0 oooo0 = RecyclerView.f3142oo000o;
        this.f5022OooO0Oo = oooo0;
        this.f5024OooO0o0 = false;
        this.f5023OooO0o = false;
        this.f5021OooO0OO = new OverScroller(recyclerView.getContext(), oooo0);
    }

    public final void OooO00o() {
        if (this.f5024OooO0o0) {
            this.f5023OooO0o = true;
            return;
        }
        RecyclerView recyclerView = this.f5025OooO0oO;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        o00O0O0.OooOOO0(recyclerView, this);
    }

    public final void OooO0O0(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        int i4;
        RecyclerView recyclerView = this.f5025OooO0oO;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i5 = height / 2;
            float f = height;
            float f2 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.f3142oo000o;
        }
        if (this.f5022OooO0Oo != interpolator) {
            this.f5022OooO0Oo = interpolator;
            this.f5021OooO0OO = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5020OooO0O0 = 0;
        this.f5019OooO00o = 0;
        recyclerView.setScrollState(2);
        this.f5021OooO0OO.startScroll(0, 0, i, i2, i6);
        OooO00o();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        RecyclerView recyclerView = this.f5025OooO0oO;
        if (recyclerView.f3154OooOO0o == null) {
            recyclerView.removeCallbacks(this);
            this.f5021OooO0OO.abortAnimation();
            return;
        }
        this.f5023OooO0o = false;
        this.f5024OooO0o0 = true;
        recyclerView.OooOOO0();
        OverScroller overScroller = this.f5021OooO0OO;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f5019OooO00o;
            int i7 = currY - this.f5020OooO0O0;
            this.f5019OooO00o = currX;
            this.f5020OooO0O0 = currY;
            int[] iArr = recyclerView.f3206ooOO;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean OooOOo2 = recyclerView.OooOOo(i6, i7, iArr, null, 1);
            int[] iArr2 = recyclerView.f3206ooOO;
            if (OooOOo2) {
                i6 -= iArr2[0];
                i7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.OooOO0o(i6, i7);
            }
            if (recyclerView.f3153OooOO0O != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.OoooOo0(i6, i7, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = i6 - i8;
                int i11 = i7 - i9;
                oo0o0Oo oo0o0oo = recyclerView.f3154OooOO0o.f5011OooO0o0;
                if (oo0o0oo != null && !oo0o0oo.f5178OooO0Oo && oo0o0oo.f5180OooO0o0) {
                    int OooO0O02 = recyclerView.OoooOoO.OooO0O0();
                    if (OooO0O02 == 0) {
                        oo0o0oo.OooO();
                    } else {
                        if (oo0o0oo.f5175OooO00o >= OooO0O02) {
                            oo0o0oo.f5175OooO00o = OooO0O02 - 1;
                        }
                        oo0o0oo.OooO0oO(i8, i9);
                    }
                }
                i4 = i8;
                i = i10;
                i2 = i11;
                i3 = i9;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.OooOOO0.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f3206ooOO;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i3;
            recyclerView.OooOOoo(i4, i3, i, i2, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i2 - iArr2[1];
            if (i4 != 0 || i12 != 0) {
                recyclerView.OooOo00(i4, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i13 == 0) || (!z2 && i14 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            oo0o0Oo oo0o0oo2 = recyclerView.f3154OooOO0o.f5011OooO0o0;
            if (oo0o0oo2 != null && oo0o0oo2.f5178OooO0Oo) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else if (i13 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.OooOo0O();
                        if (recyclerView.f3171OooOooO.isFinished()) {
                            recyclerView.f3171OooOooO.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.OooOo0o();
                        if (recyclerView.f3175Oooo000.isFinished()) {
                            recyclerView.f3175Oooo000.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.OooOo();
                        if (recyclerView.f3172OooOooo.isFinished()) {
                            recyclerView.f3172OooOooo.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.OooOo0();
                        if (recyclerView.f3176Oooo00O.isFinished()) {
                            recyclerView.f3176Oooo00O.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOO0O(recyclerView);
                    }
                }
                o00O0O o00o0o = recyclerView.f3191OoooOo0;
                int[] iArr4 = (int[]) o00o0o.f5080OooO0Oo;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                o00o0o.f5079OooO0OO = 0;
            } else {
                OooO00o();
                o00Ooo o00ooo2 = recyclerView.f3190OoooOOo;
                if (o00ooo2 != null) {
                    o00ooo2.OooO00o(recyclerView, i4, i12);
                }
            }
        }
        oo0o0Oo oo0o0oo3 = recyclerView.f3154OooOO0o.f5011OooO0o0;
        if (oo0o0oo3 != null && oo0o0oo3.f5178OooO0Oo) {
            oo0o0oo3.OooO0oO(0, 0);
        }
        this.f5024OooO0o0 = false;
        if (this.f5023OooO0o) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
            o00O0O0.OooOOO0(recyclerView, this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.OooooO0(1);
    }
}