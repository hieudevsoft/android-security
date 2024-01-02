package o0000O00;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class OooO0OO implements Comparator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooO0OO f4155OooO00o = new OooO0OO();

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        OooO00o.OooOoo0(comparable, "a");
        OooO00o.OooOoo0(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return OooO0O0.f4154OooO00o;
    }
}