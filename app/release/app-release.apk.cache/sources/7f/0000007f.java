package OooOO0;

import OooO0oO.o000O0O0;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class OooOO0O implements Set {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f529OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o000O0O0 f530OooO0O0;

    public /* synthetic */ OooOO0O(o000O0O0 o000o0o0, int i) {
        this.f529OooO00o = i;
        this.f530OooO0O0 = o000o0o0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.f529OooO00o) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.f529OooO00o) {
            case 0:
                o000O0O0 o000o0o0 = this.f530OooO0O0;
                int OooO0o2 = o000o0o0.OooO0o();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    o000o0o0.OooO(entry.getKey(), entry.getValue());
                }
                if (OooO0o2 != o000o0o0.OooO0o()) {
                    return true;
                }
                return false;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        int i = this.f529OooO00o;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                o000o0o0.OooO0OO();
                return;
            default:
                o000o0o0.OooO0OO();
                return;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        int i = this.f529OooO00o;
        boolean z = true;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int OooO0oO2 = o000o0o0.OooO0oO(entry.getKey());
                if (OooO0oO2 < 0) {
                    return false;
                }
                Object OooO0Oo2 = o000o0o0.OooO0Oo(OooO0oO2, 1);
                Object value = entry.getValue();
                if (OooO0Oo2 != value && (OooO0Oo2 == null || !OooO0Oo2.equals(value))) {
                    z = false;
                }
                return z;
            default:
                if (o000o0o0.OooO0oO(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.f529OooO00o) {
            case 0:
                for (Object obj : collection) {
                    if (!contains(obj)) {
                        return false;
                    }
                }
                return true;
            default:
                OooO0O0 OooO0o02 = this.f530OooO0O0.OooO0o0();
                for (Object obj2 : collection) {
                    if (!OooO0o02.containsKey(obj2)) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        switch (this.f529OooO00o) {
            case 0:
                return o000O0O0.OooOO0o(this, obj);
            default:
                return o000O0O0.OooOO0o(this, obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i = this.f529OooO00o;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                int i2 = 0;
                for (int OooO0o2 = o000o0o0.OooO0o() - 1; OooO0o2 >= 0; OooO0o2--) {
                    Object OooO0Oo2 = o000o0o0.OooO0Oo(OooO0o2, 0);
                    Object OooO0Oo3 = o000o0o0.OooO0Oo(OooO0o2, 1);
                    if (OooO0Oo2 == null) {
                        hashCode2 = 0;
                    } else {
                        hashCode2 = OooO0Oo2.hashCode();
                    }
                    if (OooO0Oo3 == null) {
                        hashCode3 = 0;
                    } else {
                        hashCode3 = OooO0Oo3.hashCode();
                    }
                    i2 += hashCode2 ^ hashCode3;
                }
                return i2;
            default:
                int i3 = 0;
                for (int OooO0o3 = o000o0o0.OooO0o() - 1; OooO0o3 >= 0; OooO0o3--) {
                    Object OooO0Oo4 = o000o0o0.OooO0Oo(OooO0o3, 0);
                    if (OooO0Oo4 == null) {
                        hashCode = 0;
                    } else {
                        hashCode = OooO0Oo4.hashCode();
                    }
                    i3 += hashCode;
                }
                return i3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        int i = this.f529OooO00o;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                if (o000o0o0.OooO0o() == 0) {
                    return true;
                }
                return false;
            default:
                if (o000o0o0.OooO0o() == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f529OooO00o;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                return new OooOOO0(o000o0o0);
            default:
                return new OooOO0(o000o0o0, 0);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f529OooO00o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                o000O0O0 o000o0o0 = this.f530OooO0O0;
                int OooO0oO2 = o000o0o0.OooO0oO(obj);
                if (OooO0oO2 >= 0) {
                    o000o0o0.OooOO0(OooO0oO2);
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f529OooO00o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                OooO0O0 OooO0o02 = this.f530OooO0O0.OooO0o0();
                int i = OooO0o02.f542OooO0OO;
                for (Object obj : collection) {
                    OooO0o02.remove(obj);
                }
                if (i != OooO0o02.f542OooO0OO) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f529OooO00o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return o000O0O0.OooOOoo(this.f530OooO0O0.OooO0o0(), collection);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        int i = this.f529OooO00o;
        o000O0O0 o000o0o0 = this.f530OooO0O0;
        switch (i) {
            case 0:
                return o000o0o0.OooO0o();
            default:
                return o000o0o0.OooO0o();
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f529OooO00o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                o000O0O0 o000o0o0 = this.f530OooO0O0;
                int OooO0o2 = o000o0o0.OooO0o();
                Object[] objArr = new Object[OooO0o2];
                for (int i = 0; i < OooO0o2; i++) {
                    objArr[i] = o000o0o0.OooO0Oo(i, 0);
                }
                return objArr;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.f529OooO00o) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                return this.f530OooO0O0.OooOo00(0, objArr);
        }
    }
}