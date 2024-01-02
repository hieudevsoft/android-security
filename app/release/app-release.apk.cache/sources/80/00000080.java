package OooOO0;

import OooO0oO.o000O0O0;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOOO implements Collection {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f531OooO00o;

    public OooOOO(o000O0O0 o000o0o0) {
        this.f531OooO00o = o000o0o0;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f531OooO00o.OooO0OO();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f531OooO00o.OooO0oo(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f531OooO00o.OooO0o() == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new OooOO0(this.f531OooO00o, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        o000O0O0 o000o0o0 = this.f531OooO00o;
        int OooO0oo2 = o000o0o0.OooO0oo(obj);
        if (OooO0oo2 >= 0) {
            o000o0o0.OooOO0(OooO0oo2);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        o000O0O0 o000o0o0 = this.f531OooO00o;
        int OooO0o2 = o000o0o0.OooO0o();
        int i = 0;
        boolean z = false;
        while (i < OooO0o2) {
            if (collection.contains(o000o0o0.OooO0Oo(i, 1))) {
                o000o0o0.OooOO0(i);
                i--;
                OooO0o2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        o000O0O0 o000o0o0 = this.f531OooO00o;
        int OooO0o2 = o000o0o0.OooO0o();
        int i = 0;
        boolean z = false;
        while (i < OooO0o2) {
            if (!collection.contains(o000o0o0.OooO0Oo(i, 1))) {
                o000o0o0.OooOO0(i);
                i--;
                OooO0o2--;
                z = true;
            }
            i++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f531OooO00o.OooO0o();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        o000O0O0 o000o0o0 = this.f531OooO00o;
        int OooO0o2 = o000o0o0.OooO0o();
        Object[] objArr = new Object[OooO0o2];
        for (int i = 0; i < OooO0o2; i++) {
            objArr[i] = o000o0o0.OooO0Oo(i, 1);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f531OooO00o.OooOo00(1, objArr);
    }
}