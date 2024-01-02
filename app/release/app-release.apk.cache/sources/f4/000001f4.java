package OoooOOO;

import OooO.OooO0o;
import OooO.OooOO0O;
import android.os.Bundle;
import androidx.lifecycle.Oooo000;
import androidx.lifecycle.o00oO0o;
import androidx.savedstate.Recreator;
import java.util.Map;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class oo0oO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo0ooO f1575OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OO000o f1576OooO0O0 = new o0OO000o();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1577OooO0OO;

    public oo0oO0(oo0ooO oo0ooo) {
        this.f1575OooO00o = oo0ooo;
    }

    public final void OooO00o() {
        boolean z;
        oo0ooO oo0ooo = this.f1575OooO00o;
        o00oO0o OooO0oO2 = oo0ooo.OooO0oO();
        if (OooO0oO2.f3092OooO0OO == Oooo000.INITIALIZED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            OooO0oO2.OooO00o(new Recreator(oo0ooo));
            this.f1576OooO0O0.OooO0O0(OooO0oO2);
            this.f1577OooO0OO = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void OooO0O0(Bundle bundle) {
        o00oO0o OooO0oO2;
        boolean z;
        Bundle bundle2;
        if (!this.f1577OooO0OO) {
            OooO00o();
        }
        if (this.f1575OooO00o.OooO0oO().f3092OooO0OO.compareTo(Oooo000.STARTED) >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o0OO000o o0oo000o = this.f1576OooO0O0;
            if (o0oo000o.f1570OooO0O0) {
                if (!o0oo000o.f1572OooO0Oo) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    o0oo000o.f1571OooO0OO = bundle2;
                    o0oo000o.f1572OooO0Oo = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + OooO0oO2.f3092OooO0OO).toString());
    }

    public final void OooO0OO(Bundle bundle) {
        OooO00o.OooOoo0(bundle, "outBundle");
        o0OO000o o0oo000o = this.f1576OooO0O0;
        o0oo000o.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = o0oo000o.f1571OooO0OO;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        OooOO0O oooOO0O = o0oo000o.f1569OooO00o;
        oooOO0O.getClass();
        OooO0o oooO0o = new OooO0o(oooOO0O);
        oooOO0O.f13OooO0OO.put(oooO0o, Boolean.FALSE);
        while (oooO0o.hasNext()) {
            Map.Entry entry = (Map.Entry) oooO0o.next();
            bundle2.putBundle((String) entry.getKey(), ((o0OO000) entry.getValue()).OooO00o());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}