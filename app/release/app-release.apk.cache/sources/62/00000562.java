package o00000oO;

import o00000O.OooO0O0;
import o0000O00.OooO00o;
import o000OO.OooO0OO;

/* loaded from: classes.dex */
public final class Oooo0 {
    @OooO0O0("encrypted_data")

    /* renamed from: OooO00o  reason: collision with root package name */
    private final String f4088OooO00o;

    public Oooo0() {
        this(null, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Oooo0) && OooO00o.OooOOO0(this.f4088OooO00o, ((Oooo0) obj).f4088OooO00o);
    }

    public final int hashCode() {
        return this.f4088OooO00o.hashCode();
    }

    public final String toString() {
        return "PostProfileUserUpdate(data=" + this.f4088OooO00o + ')';
    }

    public Oooo0(String str) {
        OooO00o.OooOoo0(str, "data");
        this.f4088OooO00o = str;
    }

    public /* synthetic */ Oooo0(String str, int i, OooO0OO oooO0OO) {
        this((i & 1) != 0 ? "" : str);
    }
}