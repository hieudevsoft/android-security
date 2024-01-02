package OooooOO;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class oOo00OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final long f1819OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f1820OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final TimeInterpolator f1821OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1822OooO0Oo = 0;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f1823OooO0o0 = 1;

    public oOo00OO0(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1819OooO00o = 0L;
        this.f1820OooO0O0 = 300L;
        this.f1821OooO0OO = null;
        this.f1819OooO00o = j;
        this.f1820OooO0O0 = j2;
        this.f1821OooO0OO = timeInterpolator;
    }

    public final TimeInterpolator OooO00o() {
        TimeInterpolator timeInterpolator = this.f1821OooO0OO;
        return timeInterpolator != null ? timeInterpolator : oO00O0o0.f1816OooO0O0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oOo00OO0)) {
            return false;
        }
        oOo00OO0 ooo00oo0 = (oOo00OO0) obj;
        if (this.f1819OooO00o != ooo00oo0.f1819OooO00o || this.f1820OooO0O0 != ooo00oo0.f1820OooO0O0 || this.f1822OooO0Oo != ooo00oo0.f1822OooO0Oo || this.f1823OooO0o0 != ooo00oo0.f1823OooO0o0) {
            return false;
        }
        return OooO00o().getClass().equals(ooo00oo0.OooO00o().getClass());
    }

    public final int hashCode() {
        long j = this.f1819OooO00o;
        long j2 = this.f1820OooO0O0;
        return ((((OooO00o().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.f1822OooO0Oo) * 31) + this.f1823OooO0o0;
    }

    public final String toString() {
        return "\n" + oOo00OO0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f1819OooO00o + " duration: " + this.f1820OooO0O0 + " interpolator: " + OooO00o().getClass() + " repeatCount: " + this.f1822OooO0Oo + " repeatMode: " + this.f1823OooO0o0 + "}\n";
    }
}