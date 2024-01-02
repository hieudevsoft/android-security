package o000oOoO;

import android.view.View;
import java.util.List;

/* loaded from: classes.dex */
public final class o0Oo0oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5120OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5121OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f5122OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f5123OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f5124OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f5125OooO0oO;

    /* renamed from: OooOO0  reason: collision with root package name */
    public int f5127OooOO0;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public boolean f5129OooOO0o;

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f5119OooO00o = true;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f5126OooO0oo = 0;

    /* renamed from: OooO  reason: collision with root package name */
    public int f5118OooO = 0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public List f5128OooOO0O = null;

    public final void OooO00o(View view) {
        int OooO00o2;
        int OooO00o3;
        int size = this.f5128OooOO0O.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((o000OOo0) this.f5128OooOO0O.get(i2)).f5031OooO00o;
            o0000O o0000o2 = (o0000O) view3.getLayoutParams();
            if (view3 != view && !o0000o2.OooO0OO() && (OooO00o3 = (o0000o2.OooO00o() - this.f5122OooO0Oo) * this.f5124OooO0o0) >= 0 && OooO00o3 < i) {
                view2 = view3;
                if (OooO00o3 == 0) {
                    break;
                }
                i = OooO00o3;
            }
        }
        if (view2 == null) {
            OooO00o2 = -1;
        } else {
            OooO00o2 = ((o0000O) view2.getLayoutParams()).OooO00o();
        }
        this.f5122OooO0Oo = OooO00o2;
    }

    public final View OooO0O0(o000O00 o000o00) {
        List list = this.f5128OooOO0O;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((o000OOo0) this.f5128OooOO0O.get(i)).f5031OooO00o;
                o0000O o0000o2 = (o0000O) view.getLayoutParams();
                if (!o0000o2.OooO0OO() && this.f5122OooO0Oo == o0000o2.OooO00o()) {
                    OooO00o(view);
                    return view;
                }
            }
            return null;
        }
        View OooO0Oo2 = o000o00.OooO0Oo(this.f5122OooO0Oo);
        this.f5122OooO0Oo += this.f5124OooO0o0;
        return OooO0Oo2;
    }
}