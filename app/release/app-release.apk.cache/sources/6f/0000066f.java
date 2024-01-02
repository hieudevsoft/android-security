package o000oOoO;

/* loaded from: classes.dex */
public final class o000O0O0 {

    /* renamed from: OooOO0o  reason: collision with root package name */
    public int f4992OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public int f4993OooOOO;
    public long OooOOO0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f4982OooO00o = -1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4983OooO0O0 = 0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4984OooO0OO = 0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4985OooO0Oo = 1;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4987OooO0o0 = 0;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4986OooO0o = false;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f4988OooO0oO = false;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f4989OooO0oo = false;

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f4981OooO = false;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f4990OooOO0 = false;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public boolean f4991OooOO0O = false;

    public final void OooO00o(int i) {
        if ((this.f4985OooO0Oo & i) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f4985OooO0Oo));
    }

    public final int OooO0O0() {
        return this.f4988OooO0oO ? this.f4983OooO0O0 - this.f4984OooO0OO : this.f4987OooO0o0;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f4982OooO00o + ", mData=null, mItemCount=" + this.f4987OooO0o0 + ", mIsMeasuring=" + this.f4981OooO + ", mPreviousLayoutItemCount=" + this.f4983OooO0O0 + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f4984OooO0OO + ", mStructureChanged=" + this.f4986OooO0o + ", mInPreLayout=" + this.f4988OooO0oO + ", mRunSimpleAnimations=" + this.f4990OooOO0 + ", mRunPredictiveAnimations=" + this.f4991OooOO0O + '}';
    }
}