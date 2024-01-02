package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o00O00o0 implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Iterator f3711OooO00o;

    public o00O00o0(oo00o oo00oVar) {
        this.f3711OooO00o = oo00oVar.f3741OooO00o.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3711OooO00o.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f3711OooO00o.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}