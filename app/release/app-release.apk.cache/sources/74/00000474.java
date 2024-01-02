package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooO00o implements GenericArrayType, Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Type f3778OooO00o;

    public OooO00o(Type type) {
        Objects.requireNonNull(type);
        this.f3778OooO00o = OooO0o.OooO0OO(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && OooO0o.OooOO0(this, (GenericArrayType) obj);
    }

    @Override // java.lang.reflect.GenericArrayType
    public final Type getGenericComponentType() {
        return this.f3778OooO00o;
    }

    public final int hashCode() {
        return this.f3778OooO00o.hashCode();
    }

    public final String toString() {
        return OooO0o.OooOo0O(this.f3778OooO00o) + "[]";
    }
}