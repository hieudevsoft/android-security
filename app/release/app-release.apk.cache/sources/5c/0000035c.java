package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0000O00 implements o0000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f2846OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f2847OooO0O0 = 1;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0000oo f2848OooO0OO;

    public o0000O00(o0000oo o0000ooVar, int i) {
        this.f2848OooO0OO = o0000ooVar;
        this.f2846OooO00o = i;
    }

    @Override // androidx.fragment.app.o0000
    public final boolean OooO00o(ArrayList arrayList, ArrayList arrayList2) {
        o0000oo o0000ooVar = this.f2848OooO0OO;
        o00Oo0 o00oo0 = o0000ooVar.f2880OooOOoo;
        int i = this.f2846OooO00o;
        if (o00oo0 == null || i >= 0 || !o00oo0.OooO0oo().Oooo0o0()) {
            return o0000ooVar.Oooo0o(arrayList, arrayList2, i, this.f2847OooO0O0);
        }
        return false;
    }
}