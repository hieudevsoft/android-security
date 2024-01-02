package androidx.activity;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final float f1912OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final float f1913OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final float f1914OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1915OooO0Oo;

    public OooO0O0(BackEvent backEvent) {
        o0000O00.OooO00o.OooOoo0(backEvent, "backEvent");
        OooO00o oooO00o = OooO00o.f1911OooO00o;
        float OooO0Oo2 = oooO00o.OooO0Oo(backEvent);
        float OooO0o02 = oooO00o.OooO0o0(backEvent);
        float OooO0O02 = oooO00o.OooO0O0(backEvent);
        int OooO0OO2 = oooO00o.OooO0OO(backEvent);
        this.f1912OooO00o = OooO0Oo2;
        this.f1913OooO0O0 = OooO0o02;
        this.f1914OooO0OO = OooO0O02;
        this.f1915OooO0Oo = OooO0OO2;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1912OooO00o + ", touchY=" + this.f1913OooO0O0 + ", progress=" + this.f1914OooO0OO + ", swipeEdge=" + this.f1915OooO0Oo + '}';
    }
}