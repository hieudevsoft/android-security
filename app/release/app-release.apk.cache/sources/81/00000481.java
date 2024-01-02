package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class ArrayTypeAdapter<E> extends o0OOO0o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o0Oo0oo f3825OooO0OO = new o0Oo0oo() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.o0Oo0oo
        public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
            Type componentType;
            Type type = o00oo0o.f4066OooO0O0;
            boolean z = type instanceof GenericArrayType;
            if (!z && (!(type instanceof Class) || !((Class) type).isArray())) {
                return null;
            }
            if (z) {
                componentType = ((GenericArrayType) type).getGenericComponentType();
            } else {
                componentType = ((Class) type).getComponentType();
            }
            return new ArrayTypeAdapter(oooOOOO, oooOOOO.OooO0OO(new o00oO0o(componentType)), com.google.gson.internal.OooO0o.OooOO0o(componentType));
        }
    };

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f3826OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OOO0o f3827OooO0O0;

    public ArrayTypeAdapter(OooOOOO oooOOOO, o0OOO0o o0ooo0o, Class cls) {
        this.f3827OooO0O0 = new TypeAdapterRuntimeTypeWrapper(oooOOOO, o0ooo0o, cls);
        this.f3826OooO00o = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        if (oooOOO0.OoooO0O() == 9) {
            oooOOO0.Oooo0oo();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        oooOOO0.OooOo();
        while (oooOOO0.Oooo000()) {
            arrayList.add(this.f3827OooO0O0.OooO0O0(oooOOO0));
        }
        oooOOO0.OooOoo0();
        int size = arrayList.size();
        Class cls = this.f3826OooO00o;
        if (cls.isPrimitive()) {
            Object newInstance = Array.newInstance(cls, size);
            for (int i = 0; i < size; i++) {
                Array.set(newInstance, i, arrayList.get(i));
            }
            return newInstance;
        }
        return arrayList.toArray((Object[]) Array.newInstance(cls, size));
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(OooOOO oooOOO, Object obj) {
        if (obj == null) {
            oooOOO.Oooo000();
            return;
        }
        oooOOO.OooOoO0();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.f3827OooO0O0.OooO0OO(oooOOO, Array.get(obj, i));
        }
        oooOOO.OooOoo0();
    }
}