package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OooOo00 extends OooOo implements Iterable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ArrayList f3761OooO00o = new ArrayList();

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof OooOo00) && ((OooOo00) obj).f3761OooO00o.equals(this.f3761OooO00o));
    }

    public final int hashCode() {
        return this.f3761OooO00o.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f3761OooO00o.iterator();
    }
}