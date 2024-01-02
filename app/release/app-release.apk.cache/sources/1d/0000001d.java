package OooO0Oo;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import androidx.fragment.app.o00O0000;
import androidx.fragment.app.o00oOoo;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class o00000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Object f96OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f97OooO0O0;

    public o00000(o00000OO o00000oo2) {
        this.f97OooO0O0 = o00000oo2;
    }

    public final void OooO00o() {
        Object obj = this.f96OooO00o;
        if (((BroadcastReceiver) obj) != null) {
            try {
                ((o00000OO) this.f97OooO0O0).f123OooOO0O.unregisterReceiver((BroadcastReceiver) obj);
            } catch (IllegalArgumentException unused) {
            }
            this.f96OooO00o = null;
        }
    }

    public final void OooO0O0() {
        o00O0000 o00o0000 = (o00O0000) this.f96OooO00o;
        HashSet hashSet = o00o0000.f2946OooO0o0;
        if (hashSet.remove((OooOoOO.o000000) this.f97OooO0O0) && hashSet.isEmpty()) {
            o00o0000.OooO0O0();
        }
    }

    public abstract IntentFilter OooO0OO();

    public abstract int OooO0Oo();

    public abstract void OooO0o();

    public final boolean OooO0o0() {
        o00oOoo o00oooo;
        o00oOoo OooO0OO2 = o00oOoo.OooO0OO(((o00O0000) this.f96OooO00o).f2943OooO0OO.f2979OooOooo);
        o00oOoo o00oooo2 = ((o00O0000) this.f96OooO00o).f2941OooO00o;
        if (OooO0OO2 != o00oooo2 && (OooO0OO2 == (o00oooo = o00oOoo.VISIBLE) || o00oooo2 == o00oooo)) {
            return false;
        }
        return true;
    }

    public final void OooO0oO() {
        OooO00o();
        IntentFilter OooO0OO2 = OooO0OO();
        if (OooO0OO2 == null || OooO0OO2.countActions() == 0) {
            return;
        }
        if (((BroadcastReceiver) this.f96OooO00o) == null) {
            this.f96OooO00o = new o000000O(this);
        }
        ((o00000OO) this.f97OooO0O0).f123OooOO0O.registerReceiver((BroadcastReceiver) this.f96OooO00o, OooO0OO2);
    }

    public o00000(o00O0000 o00o0000, OooOoOO.o000000 o000000Var) {
        this.f96OooO00o = o00o0000;
        this.f97OooO0O0 = o000000Var;
    }
}