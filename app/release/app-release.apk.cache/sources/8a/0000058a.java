package o0000OO;

/* loaded from: classes.dex */
public final class OooO0OO extends OooO00o {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final OooO0OO f4163OooO0Oo = new OooO0OO(1, 0);

    public OooO0OO(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // o0000OO.OooO00o
    public final boolean equals(Object obj) {
        if (obj instanceof OooO0OO) {
            if (!isEmpty() || !((OooO0OO) obj).isEmpty()) {
                OooO0OO oooO0OO = (OooO0OO) obj;
                if (this.f4156OooO00o == oooO0OO.f4156OooO00o) {
                    if (this.f4157OooO0O0 == oooO0OO.f4157OooO0O0) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // o0000OO.OooO00o
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f4156OooO00o * 31) + this.f4157OooO0O0;
    }

    @Override // o0000OO.OooO00o
    public final boolean isEmpty() {
        return this.f4156OooO00o > this.f4157OooO0O0;
    }

    @Override // o0000OO.OooO00o
    public final String toString() {
        return this.f4156OooO00o + ".." + this.f4157OooO0O0;
    }
}