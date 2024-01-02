package o0000oOO;

import o0000O00.OooO00o;
import o000O000.OooOOO;

/* loaded from: classes.dex */
public final class Oooo000 {

    /* renamed from: OooO  reason: collision with root package name */
    public static final OooOOO f4607OooO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final OooOOO f4608OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooOOO f4609OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final OooOOO f4610OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final OooOOO f4611OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final OooOOO f4612OooO0oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO f4613OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO f4614OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4615OooO0OO;

    static {
        OooOOO oooOOO = OooOOO.f4824OooO0Oo;
        f4608OooO0Oo = o00000OO.OooOO0(":");
        f4610OooO0o0 = o00000OO.OooOO0(":status");
        f4609OooO0o = o00000OO.OooOO0(":method");
        f4611OooO0oO = o00000OO.OooOO0(":path");
        f4612OooO0oo = o00000OO.OooOO0(":scheme");
        f4607OooO = o00000OO.OooOO0(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Oooo000(String str, String str2) {
        this(o00000OO.OooOO0(str), o00000OO.OooOO0(str2));
        OooO00o.OooOoo0(str, "name");
        OooO00o.OooOoo0(str2, "value");
        OooOOO oooOOO = OooOOO.f4824OooO0Oo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Oooo000) {
            Oooo000 oooo000 = (Oooo000) obj;
            return OooO00o.OooOOO0(this.f4613OooO00o, oooo000.f4613OooO00o) && OooO00o.OooOOO0(this.f4614OooO0O0, oooo000.f4614OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4614OooO0O0.hashCode() + (this.f4613OooO00o.hashCode() * 31);
    }

    public final String toString() {
        return this.f4613OooO00o.OooOO0() + ": " + this.f4614OooO0O0.OooOO0();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Oooo000(OooOOO oooOOO, String str) {
        this(oooOOO, o00000OO.OooOO0(str));
        OooO00o.OooOoo0(oooOOO, "name");
        OooO00o.OooOoo0(str, "value");
        OooOOO oooOOO2 = OooOOO.f4824OooO0Oo;
    }

    public Oooo000(OooOOO oooOOO, OooOOO oooOOO2) {
        OooO00o.OooOoo0(oooOOO, "name");
        OooO00o.OooOoo0(oooOOO2, "value");
        this.f4613OooO00o = oooOOO;
        this.f4614OooO0O0 = oooOOO2;
        this.f4615OooO0OO = oooOOO2.OooO0OO() + oooOOO.OooO0OO() + 32;
    }
}