package androidx.fragment.app;

import android.view.View;

/* loaded from: classes.dex */
public final class o000oOoO extends o0000O00.OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f2935OoooO;

    public o000oOoO(o00Oo0 o00oo0) {
        this.f2935OoooO = o00oo0;
    }

    @Override // o0000O00.OooO00o
    public final boolean o000O0o() {
        return this.f2935OoooO.f2979OooOooo != null;
    }

    @Override // o0000O00.OooO00o
    public final View o000OoO(int i) {
        o00Oo0 o00oo0 = this.f2935OoooO;
        View view = o00oo0.f2979OooOooo;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + o00oo0 + " does not have a view");
    }
}