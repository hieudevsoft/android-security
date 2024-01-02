package o000oOoO;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class oo0o0Oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public RecyclerView f5176OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o000OO f5177OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5178OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public View f5179OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f5180OooO0o0;

    /* renamed from: OooOO0  reason: collision with root package name */
    public PointF f5183OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final DisplayMetrics f5184OooOO0O;
    public float OooOOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5175OooO00o = -1;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final o000O0Oo f5181OooO0oO = new o000O0Oo();

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final LinearInterpolator f5182OooO0oo = new LinearInterpolator();

    /* renamed from: OooO  reason: collision with root package name */
    public final DecelerateInterpolator f5174OooO = new DecelerateInterpolator();

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f5185OooOO0o = false;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f5186OooOOO = 0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public int f5187OooOOOO = 0;

    public oo0o0Oo(Context context) {
        this.f5184OooOO0O = context.getResources().getDisplayMetrics();
    }

    public static int OooO00o(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public final void OooO() {
        if (this.f5180OooO0o0) {
            this.f5180OooO0o0 = false;
            this.f5187OooOOOO = 0;
            this.f5186OooOOO = 0;
            this.f5183OooOO0 = null;
            this.f5176OooO0O0.OoooOoO.f4982OooO00o = -1;
            this.f5179OooO0o = null;
            this.f5175OooO00o = -1;
            this.f5178OooO0Oo = false;
            o000OO o000oo = this.f5177OooO0OO;
            if (o000oo.f5011OooO0o0 == this) {
                o000oo.f5011OooO0o0 = null;
            }
            this.f5177OooO0OO = null;
            this.f5176OooO0O0 = null;
        }
    }

    public int OooO0O0(View view, int i) {
        o000OO o000oo = this.f5177OooO0OO;
        if (o000oo != null && o000oo.OooO0Oo()) {
            o0000O o0000o2 = (o0000O) view.getLayoutParams();
            return OooO00o((view.getLeft() - ((o0000O) view.getLayoutParams()).f4955OooO0O0.left) - ((ViewGroup.MarginLayoutParams) o0000o2).leftMargin, view.getRight() + ((o0000O) view.getLayoutParams()).f4955OooO0O0.right + ((ViewGroup.MarginLayoutParams) o0000o2).rightMargin, o000oo.OooOoo(), o000oo.f5017OooOOO - o000oo.OooOooO(), i);
        }
        return 0;
    }

    public int OooO0OO(View view, int i) {
        o000OO o000oo = this.f5177OooO0OO;
        if (o000oo != null && o000oo.OooO0o0()) {
            o0000O o0000o2 = (o0000O) view.getLayoutParams();
            return OooO00o((view.getTop() - ((o0000O) view.getLayoutParams()).f4955OooO0O0.top) - ((ViewGroup.MarginLayoutParams) o0000o2).topMargin, view.getBottom() + ((o0000O) view.getLayoutParams()).f4955OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) o0000o2).bottomMargin, o000oo.OooOooo(), o000oo.f5018OooOOOO - o000oo.OooOoo0(), i);
        }
        return 0;
    }

    public float OooO0Oo(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public PointF OooO0o(int i) {
        o000OO o000oo = this.f5177OooO0OO;
        if (o000oo instanceof o000OO0O) {
            return ((o000OO0O) o000oo).OooO00o(i);
        }
        return null;
    }

    public int OooO0o0(int i) {
        float abs = Math.abs(i);
        if (!this.f5185OooOO0o) {
            this.OooOOO0 = OooO0Oo(this.f5184OooOO0O);
            this.f5185OooOO0o = true;
        }
        return (int) Math.ceil(abs * this.OooOOO0);
    }

    public final void OooO0oO(int i, int i2) {
        float f;
        PointF OooO0o2;
        RecyclerView recyclerView = this.f5176OooO0O0;
        int i3 = -1;
        if (this.f5175OooO00o == -1 || recyclerView == null) {
            OooO();
        }
        if (this.f5178OooO0Oo && this.f5179OooO0o == null && this.f5177OooO0OO != null && (OooO0o2 = OooO0o(this.f5175OooO00o)) != null) {
            float f2 = OooO0o2.x;
            if (f2 != 0.0f || OooO0o2.y != 0.0f) {
                recyclerView.OoooOo0((int) Math.signum(f2), (int) Math.signum(OooO0o2.y), null);
            }
        }
        boolean z = false;
        this.f5178OooO0Oo = false;
        View view = this.f5179OooO0o;
        o000O0Oo o000o0oo = this.f5181OooO0oO;
        if (view != null) {
            this.f5176OooO0O0.getClass();
            o000OOo0 Oooo02 = RecyclerView.Oooo0(view);
            if (Oooo02 != null) {
                i3 = Oooo02.OooO0OO();
            }
            if (i3 == this.f5175OooO00o) {
                OooO0oo(this.f5179OooO0o, recyclerView.OoooOoO, o000o0oo);
                o000o0oo.Ooooo00(recyclerView);
                OooO();
            } else {
                this.f5179OooO0o = null;
            }
        }
        if (this.f5180OooO0o0) {
            o000O0O0 o000o0o0 = recyclerView.OoooOoO;
            if (this.f5176OooO0O0.f3154OooOO0o.OooOo0O() == 0) {
                OooO();
            } else {
                int i4 = this.f5186OooOOO;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.f5186OooOOO = i5;
                int i6 = this.f5187OooOOOO;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.f5187OooOOOO = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF OooO0o3 = OooO0o(this.f5175OooO00o);
                    if (OooO0o3 != null) {
                        if (OooO0o3.x != 0.0f || OooO0o3.y != 0.0f) {
                            float f3 = OooO0o3.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (f * f));
                            float f4 = OooO0o3.x / sqrt;
                            OooO0o3.x = f4;
                            float f5 = OooO0o3.y / sqrt;
                            OooO0o3.y = f5;
                            this.f5183OooOO0 = OooO0o3;
                            this.f5186OooOOO = (int) (f4 * 10000.0f);
                            this.f5187OooOOOO = (int) (f5 * 10000.0f);
                            int OooO0o02 = OooO0o0(10000);
                            LinearInterpolator linearInterpolator = this.f5182OooO0oo;
                            o000o0oo.f4995OooO0O0 = (int) (this.f5186OooOOO * 1.2f);
                            o000o0oo.f4996OooO0OO = (int) (this.f5187OooOOOO * 1.2f);
                            o000o0oo.f4997OooO0Oo = (int) (OooO0o02 * 1.2f);
                            o000o0oo.f5000OooO0oO = linearInterpolator;
                            o000o0oo.f4994OooO00o = true;
                        }
                    }
                    o000o0oo.f4999OooO0o0 = this.f5175OooO00o;
                    OooO();
                }
            }
            if (o000o0oo.f4999OooO0o0 >= 0) {
                z = true;
            }
            o000o0oo.Ooooo00(recyclerView);
            if (z && this.f5180OooO0o0) {
                this.f5178OooO0Oo = true;
                recyclerView.f3189OoooOOO.OooO00o();
            }
        }
    }

    public void OooO0oo(View view, o000O0O0 o000o0o0, o000O0Oo o000o0oo) {
        int i;
        int i2;
        int i3;
        PointF pointF = this.f5183OooOO0;
        int i4 = -1;
        if (pointF != null && pointF.x != 0.0f) {
            if (i3 > 0) {
                i = 1;
            } else {
                i = -1;
            }
        } else {
            i = 0;
        }
        int OooO0O02 = OooO0O0(view, i);
        PointF pointF2 = this.f5183OooOO0;
        if (pointF2 != null && pointF2.y != 0.0f) {
            if (i2 > 0) {
                i4 = 1;
            }
        } else {
            i4 = 0;
        }
        int OooO0OO2 = OooO0OO(view, i4);
        int ceil = (int) Math.ceil(OooO0o0((int) Math.sqrt((OooO0OO2 * OooO0OO2) + (OooO0O02 * OooO0O02))) / 0.3356d);
        if (ceil > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f5174OooO;
            o000o0oo.f4995OooO0O0 = -OooO0O02;
            o000o0oo.f4996OooO0OO = -OooO0OO2;
            o000o0oo.f4997OooO0Oo = ceil;
            o000o0oo.f5000OooO0oO = decelerateInterpolator;
            o000o0oo.f4994OooO00o = true;
        }
    }
}