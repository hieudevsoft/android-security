package o0000;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class OooO0O0 implements Collection {
    public abstract int OooO0o();

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        for (Object obj2 : this) {
            if (o0000O00.OooO00o.OooOOO0(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        o0000O00.OooO00o.OooOoo0(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (OooO0o() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return OooO0o();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return com.google.gson.internal.OooO0o.OooOo00(this);
    }

    public final String toString() {
        OooO00o oooO00o = new OooO00o(0, this);
        StringBuilder sb = new StringBuilder();
        Oooo0.o00O0OoO(this, sb, ", ", "[", "]", -1, "...", oooO00o);
        String sb2 = sb.toString();
        o0000O00.OooO00o.OooOoOO(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o0000O00.OooO00o.OooOoo0(objArr, "array");
        return com.google.gson.internal.OooO0o.OooOo0(this, objArr);
    }
}