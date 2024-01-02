package o00000oo;

import java.io.Serializable;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class o00O0O implements Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f4100OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f4101OooO0O0;

    public o00O0O(Object obj, Object obj2) {
        this.f4100OooO00o = obj;
        this.f4101OooO0O0 = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O0O) {
            o00O0O o00o0o = (o00O0O) obj;
            return OooO00o.OooOOO0(this.f4100OooO00o, o00o0o.f4100OooO00o) && OooO00o.OooOOO0(this.f4101OooO0O0, o00o0o.f4101OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f4100OooO00o;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4101OooO0O0;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4100OooO00o + ", " + this.f4101OooO0O0 + ')';
    }
}