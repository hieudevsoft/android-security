package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class oo00o extends AbstractList implements o0000, RandomAccess {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000 f3741OooO00o;

    public oo00o(o0000 o0000Var) {
        this.f3741OooO00o = o0000Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final Object OooO00o(int i) {
        return this.f3741OooO00o.OooO00o(i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final o0000 OooO0O0() {
        return this;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final List OooO0Oo() {
        return this.f3741OooO00o.OooO0Oo();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0000
    public final void OooO0o0(OooOo00 oooOo00) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f3741OooO00o.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new o00O00o0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new o00O00OO(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3741OooO00o.size();
    }
}