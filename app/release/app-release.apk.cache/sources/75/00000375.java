package androidx.fragment.app;

import OoooOOO.o0OO000;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class o00Ooo implements o0OO000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f2992OooO00o;

    public o00Ooo(OooO0Oo.Oooo000 oooo000) {
        this.f2992OooO00o = oooo000;
    }

    @Override // OoooOOO.o0OO000
    public final Bundle OooO00o() {
        o0ooOOo o0ooooo;
        Bundle bundle = new Bundle();
        do {
            o0ooooo = this.f2992OooO00o;
        } while (o0ooOOo.OooOO0o(((o00oO0o) o0ooooo.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO));
        o0ooooo.f3035OooOOo0.OooO0o0(androidx.lifecycle.OooOo.ON_STOP);
        o0000O0 OoooO002 = ((o00oO0o) o0ooooo.f3033OooOOOo.f2791OooO0O0).f2995OoooOOO.OoooO00();
        if (OoooO002 != null) {
            bundle.putParcelable("android:support:fragments", OoooO002);
        }
        return bundle;
    }
}