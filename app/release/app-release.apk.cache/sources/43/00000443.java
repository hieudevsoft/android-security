package com.google.crypto.tink.shaded.protobuf;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o00O00OO implements ListIterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ListIterator f3710OooO00o;

    public o00O00OO(oo00o oo00oVar, int i) {
        this.f3710OooO00o = oo00oVar.f3741OooO00o.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f3710OooO00o.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f3710OooO00o.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f3710OooO00o.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f3710OooO00o.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f3710OooO00o.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f3710OooO00o.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}