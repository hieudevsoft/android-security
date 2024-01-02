package o0000;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOOO0 implements Collection {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object[] f3964OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f3965OooO0O0;

    public OooOOO0(Object[] objArr, boolean z) {
        this.f3964OooO00o = objArr;
        this.f3965OooO0O0 = z;
    }

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
    public final boolean contains(Object obj) {
        int i;
        Object[] objArr = this.f3964OooO00o;
        o0000O00.OooO00o.OooOoo0(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i = 0;
            while (i < length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            int length2 = objArr.length;
            for (int i2 = 0; i2 < length2; i2++) {
                if (o0000O00.OooO00o.OooOOO0(obj, objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        if (i < 0) {
            return false;
        }
        return true;
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
        return this.f3964OooO00o.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f3964OooO00o;
        o0000O00.OooO00o.OooOoo0(objArr, "array");
        return new OooO0OO(objArr);
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
    public final int size() {
        return this.f3964OooO00o.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f3964OooO00o;
        o0000O00.OooO00o.OooOoo0(objArr, "<this>");
        if (this.f3965OooO0O0 && o0000O00.OooO00o.OooOOO0(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        o0000O00.OooO00o.OooOoOO(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        o0000O00.OooO00o.OooOoo0(objArr, "array");
        return com.google.gson.internal.OooO0o.OooOo0(this, objArr);
    }
}