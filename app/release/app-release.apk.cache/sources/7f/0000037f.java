package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class oo000o implements OooO00o.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0ooOOo f3038OooO00o;

    public oo000o(OooO0Oo.Oooo000 oooo000) {
        this.f3038OooO00o = oooo000;
    }

    @Override // OooO00o.OooO0O0
    public final void OooO00o() {
        o0ooOOo o0ooooo = this.f3038OooO00o;
        o00oO0o o00oo0o = (o00oO0o) o0ooooo.f3033OooOOOo.f2791OooO0O0;
        o00oo0o.f2995OoooOOO.OooO0O0(o00oo0o, o00oo0o, null);
        Bundle OooO00o2 = o0ooooo.f1942OooO0o0.f1576OooO0O0.OooO00o("android:support:fragments");
        if (OooO00o2 != null) {
            Parcelable parcelable = OooO00o2.getParcelable("android:support:fragments");
            o00oO0o o00oo0o2 = (o00oO0o) o0ooooo.f3033OooOOOo.f2791OooO0O0;
            if (o00oo0o2 instanceof androidx.lifecycle.o0000O) {
                o00oo0o2.f2995OoooOOO.Oooo(parcelable);
                return;
            }
            throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
        }
    }
}