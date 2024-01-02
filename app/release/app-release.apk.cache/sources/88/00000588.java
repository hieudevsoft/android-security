package o0000OO;

import java.util.Iterator;

/* loaded from: classes.dex */
public class OooO00o implements Iterable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4156OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4157OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f4158OooO0OO;

    public OooO00o(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f4156OooO00o = i;
        this.f4157OooO0O0 = o0000O00.OooO00o.o00000O(i, i2, i3);
        this.f4158OooO0OO = i3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof OooO00o) {
            if (!isEmpty() || !((OooO00o) obj).isEmpty()) {
                OooO00o oooO00o = (OooO00o) obj;
                if (this.f4156OooO00o != oooO00o.f4156OooO00o || this.f4157OooO0O0 != oooO00o.f4157OooO0O0 || this.f4158OooO0OO != oooO00o.f4158OooO0OO) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f4156OooO00o * 31) + this.f4157OooO0O0) * 31) + this.f4158OooO0OO;
    }

    public boolean isEmpty() {
        int i = this.f4158OooO0OO;
        int i2 = this.f4157OooO0O0;
        int i3 = this.f4156OooO00o;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new OooO0O0(this.f4156OooO00o, this.f4157OooO0O0, this.f4158OooO0OO);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f4157OooO0O0;
        int i2 = this.f4156OooO00o;
        int i3 = this.f4158OooO0OO;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}