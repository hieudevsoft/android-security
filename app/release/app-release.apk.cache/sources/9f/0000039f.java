package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class o00000OO extends Fragment {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final /* synthetic */ int f3078OooO0O0 = 0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public o000000O f3079OooO00o;

    public final void OooO00o(OooOo oooOo) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            o0000O00.OooO00o.OooOoOO(activity, "activity");
            o0ooOO0.OooOOO0.OooO0o(activity, oooOo);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooO00o(OooOo.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OooO00o(OooOo.ON_DESTROY);
        this.f3079OooO00o = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        OooO00o(OooOo.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        o000000O o000000o2 = this.f3079OooO00o;
        if (o000000o2 != null) {
            o000000o2.f3077OooO00o.OooO00o();
        }
        OooO00o(OooOo.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        o000000O o000000o2 = this.f3079OooO00o;
        if (o000000o2 != null) {
            o00000 o00000Var = o000000o2.f3077OooO00o;
            int i = o00000Var.f3069OooO00o + 1;
            o00000Var.f3069OooO00o = i;
            if (i == 1 && o00000Var.f3072OooO0Oo) {
                o00000Var.f3073OooO0o.OooO0o0(OooOo.ON_START);
                o00000Var.f3072OooO0Oo = false;
            }
        }
        OooO00o(OooOo.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        OooO00o(OooOo.ON_STOP);
    }
}