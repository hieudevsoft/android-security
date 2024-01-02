package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class OooO0OO extends AbstractList implements o000000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f3617OooO00o = true;

    public final void OooO0o() {
        if (!this.f3617OooO00o) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean OooO0oO() {
        return this.f3617OooO00o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        OooO0o();
        return super.add(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        OooO0o();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        OooO0o();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (obj instanceof RandomAccess) {
                List list = (List) obj;
                int size = size();
                if (size != list.size()) {
                    return false;
                }
                for (int i = 0; i < size; i++) {
                    if (!get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
            return super.equals(obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        OooO0o();
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        OooO0o();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        OooO0o();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        OooO0o();
        return super.addAll(collection);
    }
}