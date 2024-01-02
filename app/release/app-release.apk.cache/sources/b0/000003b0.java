package androidx.lifecycle;

/* loaded from: classes.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.fragment.app.OooOo f3108OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3109OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3110OooO0OO = -1;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o0OO00O f3111OooO0Oo;

    public o0Oo0oo(o0OO00O o0oo00o, androidx.fragment.app.OooOo oooOo) {
        this.f3111OooO0Oo = o0oo00o;
        this.f3108OooO00o = oooOo;
    }

    public final void OooO0OO(boolean z) {
        int i;
        if (z == this.f3109OooO0O0) {
            return;
        }
        this.f3109OooO0O0 = z;
        if (z) {
            i = 1;
        } else {
            i = -1;
        }
        o0OO00O o0oo00o = this.f3111OooO0Oo;
        int i2 = o0oo00o.f3102OooO0OO;
        o0oo00o.f3102OooO0OO = i + i2;
        if (!o0oo00o.f3103OooO0Oo) {
            o0oo00o.f3103OooO0Oo = true;
            while (true) {
                try {
                    int i3 = o0oo00o.f3102OooO0OO;
                    if (i2 == i3) {
                        break;
                    }
                    i2 = i3;
                } finally {
                    o0oo00o.f3103OooO0Oo = false;
                }
            }
        }
        if (this.f3109OooO0O0) {
            o0oo00o.OooO0OO(this);
        }
    }

    public void OooO0Oo() {
    }

    public abstract boolean OooO0o0();
}