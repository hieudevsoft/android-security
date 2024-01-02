package o000OO;

/* loaded from: classes.dex */
public final class OooOO0O implements OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f4873OooO00o;

    public OooOO0O(Class cls) {
        o0000O00.OooO00o.OooOoo0(cls, "jClass");
        this.f4873OooO00o = cls;
    }

    @Override // o000OO.OooO00o
    public final Class OooO00o() {
        return this.f4873OooO00o;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OooOO0O) {
            if (o0000O00.OooO00o.OooOOO0(this.f4873OooO00o, ((OooOO0O) obj).f4873OooO00o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f4873OooO00o.hashCode();
    }

    public final String toString() {
        return this.f4873OooO00o.toString() + " (Kotlin reflection is not available)";
    }
}