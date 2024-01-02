package o000oOoO;

import android.view.View;

/* loaded from: classes.dex */
public final class o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0O0O00 f5159OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5160OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5161OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5162OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f5163OooO0o0;

    public o0ooOOo() {
        OooO0OO();
    }

    public final void OooO00o(View view, int i) {
        int OooO2;
        if (this.f5162OooO0Oo) {
            int OooO0O02 = this.f5159OooO00o.OooO0O0(view);
            o0O0O00 o0o0o00 = this.f5159OooO00o;
            if (Integer.MIN_VALUE == o0o0o00.f5027OooO0O0) {
                OooO2 = 0;
            } else {
                OooO2 = o0o0o00.OooO() - o0o0o00.f5027OooO0O0;
            }
            this.f5161OooO0OO = OooO2 + OooO0O02;
        } else {
            this.f5161OooO0OO = this.f5159OooO00o.OooO0Oo(view);
        }
        this.f5160OooO0O0 = i;
    }

    public final void OooO0O0(View view, int i) {
        int OooO2;
        int min;
        o0O0O00 o0o0o00 = this.f5159OooO00o;
        if (Integer.MIN_VALUE == o0o0o00.f5027OooO0O0) {
            OooO2 = 0;
        } else {
            OooO2 = o0o0o00.OooO() - o0o0o00.f5027OooO0O0;
        }
        if (OooO2 >= 0) {
            OooO00o(view, i);
            return;
        }
        this.f5160OooO0O0 = i;
        if (this.f5162OooO0Oo) {
            int OooO0o2 = (this.f5159OooO00o.OooO0o() - OooO2) - this.f5159OooO00o.OooO0O0(view);
            this.f5161OooO0OO = this.f5159OooO00o.OooO0o() - OooO0o2;
            if (OooO0o2 > 0) {
                int OooO0OO2 = this.f5161OooO0OO - this.f5159OooO00o.OooO0OO(view);
                int OooO0oo2 = this.f5159OooO00o.OooO0oo();
                int min2 = OooO0OO2 - (Math.min(this.f5159OooO00o.OooO0Oo(view) - OooO0oo2, 0) + OooO0oo2);
                if (min2 < 0) {
                    min = Math.min(OooO0o2, -min2) + this.f5161OooO0OO;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int OooO0Oo2 = this.f5159OooO00o.OooO0Oo(view);
            int OooO0oo3 = OooO0Oo2 - this.f5159OooO00o.OooO0oo();
            this.f5161OooO0OO = OooO0Oo2;
            if (OooO0oo3 > 0) {
                int OooO0o3 = (this.f5159OooO00o.OooO0o() - Math.min(0, (this.f5159OooO00o.OooO0o() - OooO2) - this.f5159OooO00o.OooO0O0(view))) - (this.f5159OooO00o.OooO0OO(view) + OooO0Oo2);
                if (OooO0o3 < 0) {
                    min = this.f5161OooO0OO - Math.min(OooO0oo3, -OooO0o3);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f5161OooO0OO = min;
    }

    public final void OooO0OO() {
        this.f5160OooO0O0 = -1;
        this.f5161OooO0OO = Integer.MIN_VALUE;
        this.f5162OooO0Oo = false;
        this.f5163OooO0o0 = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f5160OooO0O0 + ", mCoordinate=" + this.f5161OooO0OO + ", mLayoutFromEnd=" + this.f5162OooO0Oo + ", mValid=" + this.f5163OooO0o0 + '}';
    }
}