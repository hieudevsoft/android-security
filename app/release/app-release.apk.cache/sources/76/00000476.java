package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooO0OO implements WildcardType, Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Type f3782OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Type f3783OooO0O0;

    public OooO0OO(Type[] typeArr, Type[] typeArr2) {
        o0000O00.OooO00o.OooOo0(typeArr2.length <= 1);
        o0000O00.OooO00o.OooOo0(typeArr.length == 1);
        if (typeArr2.length != 1) {
            Objects.requireNonNull(typeArr[0]);
            OooO0o.OooO0o0(typeArr[0]);
            this.f3783OooO0O0 = null;
            this.f3782OooO00o = OooO0o.OooO0OO(typeArr[0]);
            return;
        }
        Objects.requireNonNull(typeArr2[0]);
        OooO0o.OooO0o0(typeArr2[0]);
        o0000O00.OooO00o.OooOo0(typeArr[0] == Object.class);
        this.f3783OooO0O0 = OooO0o.OooO0OO(typeArr2[0]);
        this.f3782OooO00o = Object.class;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && OooO0o.OooOO0(this, (WildcardType) obj);
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getLowerBounds() {
        Type type = this.f3783OooO0O0;
        return type != null ? new Type[]{type} : OooO0o.f3785OooO00o;
    }

    @Override // java.lang.reflect.WildcardType
    public final Type[] getUpperBounds() {
        return new Type[]{this.f3782OooO00o};
    }

    public final int hashCode() {
        Type type = this.f3783OooO0O0;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.f3782OooO00o.hashCode() + 31);
    }

    public final String toString() {
        Type type = this.f3783OooO0O0;
        if (type != null) {
            return "? super " + OooO0o.OooOo0O(type);
        }
        Type type2 = this.f3782OooO00o;
        if (type2 == Object.class) {
            return "?";
        }
        return "? extends " + OooO0o.OooOo0O(type2);
    }
}