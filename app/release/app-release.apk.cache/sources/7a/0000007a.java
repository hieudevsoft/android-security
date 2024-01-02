package OooOO0;

import OooO0oO.o000O0O0;

/* loaded from: classes.dex */
public final class OooO00o extends o000O0O0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f506OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ Object f507OooO0o0;

    public /* synthetic */ OooO00o(int i, Object obj) {
        this.f506OooO0Oo = i;
        this.f507OooO0o0 = obj;
    }

    @Override // OooO0oO.o000O0O0
    public final void OooO(Object obj, Object obj2) {
        int i = this.f506OooO0Oo;
        Object obj3 = this.f507OooO0o0;
        switch (i) {
            case 0:
                ((OooO0O0) obj3).put(obj, obj2);
                return;
            default:
                ((OooO0OO) obj3).add(obj);
                return;
        }
    }

    @Override // OooO0oO.o000O0O0
    public final void OooO0OO() {
        int i = this.f506OooO0Oo;
        Object obj = this.f507OooO0o0;
        switch (i) {
            case 0:
                ((OooO0O0) obj).clear();
                return;
            default:
                ((OooO0OO) obj).clear();
                return;
        }
    }

    @Override // OooO0oO.o000O0O0
    public final Object OooO0Oo(int i, int i2) {
        int i3 = this.f506OooO0Oo;
        Object obj = this.f507OooO0o0;
        switch (i3) {
            case 0:
                return ((OooO0O0) obj).f541OooO0O0[(i << 1) + i2];
            default:
                return ((OooO0OO) obj).f516OooO0O0[i];
        }
    }

    @Override // OooO0oO.o000O0O0
    public final int OooO0o() {
        int i = this.f506OooO0Oo;
        Object obj = this.f507OooO0o0;
        switch (i) {
            case 0:
                return ((OooO0O0) obj).f542OooO0OO;
            default:
                return ((OooO0OO) obj).f517OooO0OO;
        }
    }

    @Override // OooO0oO.o000O0O0
    public final OooO0O0 OooO0o0() {
        switch (this.f506OooO0Oo) {
            case 0:
                return (OooO0O0) this.f507OooO0o0;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }

    @Override // OooO0oO.o000O0O0
    public final int OooO0oO(Object obj) {
        int i = this.f506OooO0Oo;
        Object obj2 = this.f507OooO0o0;
        switch (i) {
            case 0:
                return ((OooO0O0) obj2).OooO0o0(obj);
            default:
                return ((OooO0OO) obj2).indexOf(obj);
        }
    }

    @Override // OooO0oO.o000O0O0
    public final int OooO0oo(Object obj) {
        int i = this.f506OooO0Oo;
        Object obj2 = this.f507OooO0o0;
        switch (i) {
            case 0:
                return ((OooO0O0) obj2).OooO0oO(obj);
            default:
                return ((OooO0OO) obj2).indexOf(obj);
        }
    }

    @Override // OooO0oO.o000O0O0
    public final void OooOO0(int i) {
        int i2 = this.f506OooO0Oo;
        Object obj = this.f507OooO0o0;
        switch (i2) {
            case 0:
                ((OooO0O0) obj).OooO(i);
                return;
            default:
                ((OooO0OO) obj).OooOO0(i);
                return;
        }
    }

    @Override // OooO0oO.o000O0O0
    public final Object OooOO0O(int i, Object obj) {
        switch (this.f506OooO0Oo) {
            case 0:
                int i2 = (i << 1) + 1;
                Object[] objArr = ((OooO0O0) this.f507OooO0o0).f541OooO0O0;
                Object obj2 = objArr[i2];
                objArr[i2] = obj;
                return obj2;
            default:
                throw new UnsupportedOperationException("not a map");
        }
    }
}