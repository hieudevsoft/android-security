package o000O000;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class Oooo0 extends o0000.OooOO0 implements RandomAccess {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO[] f4838OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int[] f4839OooO0O0;

    public Oooo0(OooOOO[] oooOOOArr, int[] iArr) {
        this.f4838OooO00o = oooOOOArr;
        this.f4839OooO0O0 = iArr;
    }

    @Override // o0000.OooO0O0
    public final int OooO0o() {
        return this.f4838OooO00o.length;
    }

    @Override // o0000.OooO0O0, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        return super.contains((OooOOO) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.f4838OooO00o[i];
    }

    @Override // o0000.OooOO0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return -1;
        }
        return super.indexOf((OooOOO) obj);
    }

    @Override // o0000.OooOO0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return -1;
        }
        return super.lastIndexOf((OooOOO) obj);
    }
}