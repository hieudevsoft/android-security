package OooOooo;

import OooOooO.o0000oo;
import android.view.DisplayCutout;

/* loaded from: classes.dex */
public final class o000O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final DisplayCutout f1274OooO00o;

    public o000O0(DisplayCutout displayCutout) {
        this.f1274OooO00o = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o000O0.class == obj.getClass()) {
            return o0000oo.OooO00o(this.f1274OooO00o, ((o000O0) obj).f1274OooO00o);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        DisplayCutout displayCutout = this.f1274OooO00o;
        if (displayCutout == null) {
            return 0;
        }
        hashCode = displayCutout.hashCode();
        return hashCode;
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f1274OooO00o + "}";
    }
}