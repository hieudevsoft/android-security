package androidx.fragment.app;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes.dex */
public final class Oooo000 extends o0000O00.OooO00o {

    /* renamed from: OoooO  reason: collision with root package name */
    public final /* synthetic */ o0000O00.OooO00o f2807OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public final /* synthetic */ Oooo0 f2808OoooOO0;

    public Oooo000(Oooo0 oooo0, o000oOoO o000oooo) {
        this.f2808OoooOO0 = oooo0;
        this.f2807OoooO = o000oooo;
    }

    @Override // o0000O00.OooO00o
    public final boolean o000O0o() {
        if (!this.f2807OoooO.o000O0o() && !this.f2808OoooOO0.f2805Oooooo0) {
            return false;
        }
        return true;
    }

    @Override // o0000O00.OooO00o
    public final View o000OoO(int i) {
        o0000O00.OooO00o oooO00o = this.f2807OoooO;
        if (oooO00o.o000O0o()) {
            return oooO00o.o000OoO(i);
        }
        Dialog dialog = this.f2808OoooOO0.f2802OooooO0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }
}