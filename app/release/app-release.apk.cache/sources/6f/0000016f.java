package OooOooo;

import OooOoo.o00Ooo;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class o0O0oo0o extends o0oO0O0o {
    public o0O0oo0o(o0O0OOOo o0o0oooo, WindowInsets windowInsets) {
        super(o0o0oooo, windowInsets);
    }

    @Override // OooOooo.o0O0OO0
    public o0O0OOOo OooO00o() {
        return o0O0OOOo.OooO0oo(null, o00Ooo.OooOOO0(this.f1343OooO0OO));
    }

    @Override // OooOooo.o0O0OO0
    public o000O0 OooO0o0() {
        DisplayCutout OooOO0o2 = o00Ooo.OooOO0o(this.f1343OooO0OO);
        if (OooOO0o2 == null) {
            return null;
        }
        return new o000O0(OooOO0o2);
    }

    @Override // OooOooo.o0O0O0O, OooOooo.o0O0OO0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0O0oo0o) {
            o0O0oo0o o0o0oo0o = (o0O0oo0o) obj;
            return Objects.equals(this.f1343OooO0OO, o0o0oo0o.f1343OooO0OO) && Objects.equals(this.f1347OooO0oO, o0o0oo0o.f1347OooO0oO);
        }
        return false;
    }

    @Override // OooOooo.o0O0OO0
    public int hashCode() {
        return this.f1343OooO0OO.hashCode();
    }
}