package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class o00O000o implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3701OooO00o = -1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f3702OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Iterator f3703OooO0OO;

    public o00O000o(o00O000 o00o000) {
    }

    public final Iterator OooO00o() {
        if (this.f3703OooO0OO != null) {
            return this.f3703OooO0OO;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        this.f3702OooO0O0 = true;
        this.f3701OooO00o++;
        throw null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f3702OooO0O0) {
            this.f3702OooO0O0 = false;
            int i = o00O000.f3700OooO00o;
            throw null;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}