package o000oOoO;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o000Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SparseArray f5047OooO00o = new SparseArray();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5048OooO0O0 = 0;

    public final o000O0o OooO00o(int i) {
        SparseArray sparseArray = this.f5047OooO00o;
        o000O0o o000o0o = (o000O0o) sparseArray.get(i);
        if (o000o0o == null) {
            o000O0o o000o0o2 = new o000O0o();
            sparseArray.put(i, o000o0o2);
            return o000o0o2;
        }
        return o000o0o;
    }
}