package o000oOoO;

import android.view.View;

/* loaded from: classes.dex */
public final class o0000O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f4958OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4959OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4960OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4961OooO0Oo;

    public o0000O00(int i, int i2, int i3, int i4) {
        this.f4958OooO00o = i;
        this.f4959OooO0O0 = i2;
        this.f4960OooO0OO = i3;
        this.f4961OooO0Oo = i4;
    }

    public final void OooO00o(o000OOo0 o000ooo0) {
        View view = o000ooo0.f5031OooO00o;
        this.f4958OooO00o = view.getLeft();
        this.f4959OooO0O0 = view.getTop();
        this.f4960OooO0OO = view.getRight();
        this.f4961OooO0Oo = view.getBottom();
    }
}