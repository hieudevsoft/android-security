package androidx.emoji2.text;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final SparseArray f2721OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o00O0O f2722OooO0O0;

    public o0OOO0o(int i) {
        this.f2721OooO00o = new SparseArray(i);
    }

    public final void OooO00o(o00O0O o00o0o, int i, int i2) {
        o0OOO0o o0ooo0o;
        int OooO00o2 = o00o0o.OooO00o(i);
        SparseArray sparseArray = this.f2721OooO00o;
        if (sparseArray == null) {
            o0ooo0o = null;
        } else {
            o0ooo0o = (o0OOO0o) sparseArray.get(OooO00o2);
        }
        if (o0ooo0o == null) {
            o0ooo0o = new o0OOO0o(1);
            sparseArray.put(o00o0o.OooO00o(i), o0ooo0o);
        }
        if (i2 > i) {
            o0ooo0o.OooO00o(o00o0o, i + 1, i2);
        } else {
            o0ooo0o.f2722OooO0O0 = o00o0o;
        }
    }
}