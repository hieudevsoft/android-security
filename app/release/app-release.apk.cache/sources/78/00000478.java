package com.google.gson.internal;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.EnumSet;

/* loaded from: classes.dex */
public final class OooOO0 implements o000oOoO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3794OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Type f3795OooO0O0;

    public /* synthetic */ OooOO0(Type type, int i) {
        this.f3794OooO00o = i;
        this.f3795OooO0O0 = type;
    }

    @Override // com.google.gson.internal.o000oOoO
    public final Object OooO0O0() {
        int i = this.f3794OooO00o;
        Type type = this.f3795OooO0O0;
        switch (i) {
            case 0:
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new com.google.gson.Oooo000("Invalid EnumSet type: " + type.toString());
                }
                throw new com.google.gson.Oooo000("Invalid EnumSet type: " + type.toString());
            default:
                if (type instanceof ParameterizedType) {
                    Type type3 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type3 instanceof Class) {
                        return new EnumMap((Class) type3);
                    }
                    throw new com.google.gson.Oooo000("Invalid EnumMap type: " + type.toString());
                }
                throw new com.google.gson.Oooo000("Invalid EnumMap type: " + type.toString());
        }
    }
}