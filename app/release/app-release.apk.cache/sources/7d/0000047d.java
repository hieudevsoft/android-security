package com.google.gson.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class OooOo implements Iterator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public Oooo000 f3801OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public Oooo000 f3802OooO0O0 = null;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f3803OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ Oooo0 f3804OooO0Oo;

    public OooOo(Oooo0 oooo0) {
        this.f3804OooO0Oo = oooo0;
        this.f3801OooO00o = oooo0.f3812OooO0o.f3820OooO0Oo;
        this.f3803OooO0OO = oooo0.f3813OooO0o0;
    }

    public final Oooo000 OooO00o() {
        Oooo000 oooo000 = this.f3801OooO00o;
        Oooo0 oooo0 = this.f3804OooO0Oo;
        if (oooo000 != oooo0.f3812OooO0o) {
            if (oooo0.f3813OooO0o0 == this.f3803OooO0OO) {
                this.f3801OooO00o = oooo000.f3820OooO0Oo;
                this.f3802OooO0O0 = oooo000;
                return oooo000;
            }
            throw new ConcurrentModificationException();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f3801OooO00o != this.f3804OooO0Oo.f3812OooO0o;
    }

    @Override // java.util.Iterator
    public final void remove() {
        Oooo000 oooo000 = this.f3802OooO0O0;
        if (oooo000 == null) {
            throw new IllegalStateException();
        }
        Oooo0 oooo0 = this.f3804OooO0Oo;
        oooo0.OooO0Oo(oooo000, true);
        this.f3802OooO0O0 = null;
        this.f3803OooO0OO = oooo0.f3813OooO0o0;
    }
}