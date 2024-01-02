package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooO0O0 implements ParameterizedType, Serializable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Type f3779OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Type f3780OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Type[] f3781OooO0OO;

    public OooO0O0(Type type, Type type2, Type... typeArr) {
        Objects.requireNonNull(type2);
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            o0000O00.OooO00o.OooOo0(z);
        }
        this.f3779OooO00o = type == null ? null : OooO0o.OooO0OO(type);
        this.f3780OooO0O0 = OooO0o.OooO0OO(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.f3781OooO0OO = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Objects.requireNonNull(this.f3781OooO0OO[i]);
            OooO0o.OooO0o0(this.f3781OooO0OO[i]);
            Type[] typeArr3 = this.f3781OooO0OO;
            typeArr3[i] = OooO0o.OooO0OO(typeArr3[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && OooO0o.OooOO0(this, (ParameterizedType) obj);
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.f3781OooO0OO.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.f3779OooO00o;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.f3780OooO0O0;
    }

    public final int hashCode() {
        int i;
        int hashCode = Arrays.hashCode(this.f3781OooO0OO) ^ this.f3780OooO0O0.hashCode();
        Type type = this.f3779OooO00o;
        if (type != null) {
            i = type.hashCode();
        } else {
            i = 0;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        Type[] typeArr = this.f3781OooO0OO;
        int length = typeArr.length;
        Type type = this.f3780OooO0O0;
        if (length == 0) {
            return OooO0o.OooOo0O(type);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(OooO0o.OooOo0O(type));
        sb.append("<");
        sb.append(OooO0o.OooOo0O(typeArr[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(OooO0o.OooOo0O(typeArr[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}