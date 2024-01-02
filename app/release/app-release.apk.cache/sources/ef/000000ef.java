package OooOo0o;

import OooOooO.o0000oo;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class o00000O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Resources f1164OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Resources.Theme f1165OooO0O0;

    public o00000O0(Resources resources, Resources.Theme theme) {
        this.f1164OooO00o = resources;
        this.f1165OooO0O0 = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o00000O0.class != obj.getClass()) {
            return false;
        }
        o00000O0 o00000o02 = (o00000O0) obj;
        if (this.f1164OooO00o.equals(o00000o02.f1164OooO00o) && o0000oo.OooO00o(this.f1165OooO0O0, o00000o02.f1165OooO0O0)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return o0000oo.OooO0O0(this.f1164OooO00o, this.f1165OooO0O0);
    }
}