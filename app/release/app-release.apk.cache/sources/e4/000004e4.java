package o0000;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class OooO extends OooOO0 implements RandomAccess {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0 f3951OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f3952OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3953OooO0OO;

    public OooO(OooOO0 oooOO0, int i, int i2) {
        o0000O00.OooO00o.OooOoo0(oooOO0, "list");
        this.f3951OooO00o = oooOO0;
        this.f3952OooO0O0 = i;
        int OooO0o2 = oooOO0.OooO0o();
        if (i >= 0 && i2 <= OooO0o2) {
            if (i <= i2) {
                this.f3953OooO0OO = i2 - i;
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + OooO0o2);
    }

    @Override // o0000.OooO0O0
    public final int OooO0o() {
        return this.f3953OooO0OO;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.f3953OooO0OO;
        if (i >= 0 && i < i2) {
            return this.f3951OooO00o.get(this.f3952OooO0O0 + i);
        }
        throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
    }
}