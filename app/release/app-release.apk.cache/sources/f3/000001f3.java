package OoooOOO;

import OooO.OooO0OO;
import OooO.OooOO0O;
import OooO0Oo.OooOo00;
import android.os.Bundle;
import androidx.lifecycle.OooOOO;
import androidx.lifecycle.OooOo;
import androidx.lifecycle.Oooo0;
import androidx.lifecycle.o00O0O;
import androidx.lifecycle.o00Ooo;
import java.util.Set;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o0OO000o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f1570OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Bundle f1571OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f1572OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OooOo00 f1574OooO0o0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0O f1569OooO00o = new OooOO0O();

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1573OooO0o = true;

    public final Bundle OooO00o(String str) {
        if (this.f1572OooO0Oo) {
            Bundle bundle = this.f1571OooO0OO;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                Bundle bundle3 = this.f1571OooO0OO;
                if (bundle3 != null) {
                    bundle3.remove(str);
                }
                Bundle bundle4 = this.f1571OooO0OO;
                if (!((bundle4 == null || bundle4.isEmpty()) ? false : true)) {
                    this.f1571OooO0OO = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final void OooO0O0(Oooo0 oooo0) {
        if (!(!this.f1570OooO0O0)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        oooo0.OooO00o(new o00O0O() { // from class: OoooOOO.o0O0oo00
            @Override // androidx.lifecycle.o00O0O
            public final void OooO0O0(o00Ooo o00ooo2, OooOo oooOo) {
                boolean z;
                o0OO000o o0oo000o = o0OO000o.this;
                OooO00o.OooOoo0(o0oo000o, "this$0");
                if (oooOo == OooOo.ON_START) {
                    z = true;
                } else if (oooOo == OooOo.ON_STOP) {
                    z = false;
                } else {
                    return;
                }
                o0oo000o.f1573OooO0o = z;
            }
        });
        this.f1570OooO0O0 = true;
    }

    public final void OooO0OO(String str, o0OO000 o0oo000) {
        Object obj;
        OooO00o.OooOoo0(o0oo000, "provider");
        OooOO0O oooOO0O = this.f1569OooO00o;
        OooO0OO OooO0o2 = oooOO0O.OooO0o(str);
        boolean z = true;
        if (OooO0o2 != null) {
            obj = OooO0o2.f5OooO0O0;
        } else {
            OooO0OO oooO0OO = new OooO0OO(str, o0oo000);
            oooOO0O.f14OooO0Oo++;
            OooO0OO oooO0OO2 = oooOO0O.f12OooO0O0;
            if (oooO0OO2 == null) {
                oooOO0O.f11OooO00o = oooO0OO;
            } else {
                oooO0OO2.f6OooO0OO = oooO0OO;
                oooO0OO.f7OooO0Oo = oooO0OO2;
            }
            oooOO0O.f12OooO0O0 = oooO0OO;
            obj = null;
        }
        if (((o0OO000) obj) != null) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void OooO0Oo() {
        if (this.f1573OooO0o) {
            OooOo00 oooOo00 = this.f1574OooO0o0;
            if (oooOo00 == null) {
                oooOo00 = new OooOo00(this);
            }
            this.f1574OooO0o0 = oooOo00;
            try {
                OooOOO.class.getDeclaredConstructor(new Class[0]);
                OooOo00 oooOo002 = this.f1574OooO0o0;
                if (oooOo002 != null) {
                    ((Set) oooOo002.f90OooO0O0).add(OooOOO.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + OooOOO.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}