package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class OooOOO implements Iterator {
    @Override // java.util.Iterator
    public final Object next() {
        OooOOO0 oooOOO0 = (OooOOO0) this;
        int i = oooOOO0.f3620OooO00o;
        if (i < oooOOO0.f3621OooO0O0) {
            oooOOO0.f3620OooO00o = i + 1;
            return Byte.valueOf(oooOOO0.f3622OooO0OO.OooOO0(i));
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}