package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import java.lang.reflect.Type;
import o0000Ooo.OooOOO0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f3902OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OOO0o f3903OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Type f3904OooO0OO;

    public TypeAdapterRuntimeTypeWrapper(OooOOOO oooOOOO, o0OOO0o o0ooo0o, Type type) {
        this.f3902OooO00o = oooOOOO;
        this.f3903OooO0O0 = o0ooo0o;
        this.f3904OooO0OO = type;
    }

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(OooOOO0 oooOOO0) {
        return this.f3903OooO0O0.OooO0O0(oooOOO0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0039, code lost:
        if ((r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) == false) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.o0OOO0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0OO(o0000Ooo.OooOOO r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.reflect.Type r0 = r4.f3904OooO0OO
            if (r6 == 0) goto L11
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 != 0) goto Lc
            boolean r1 = r0 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L11
        Lc:
            java.lang.Class r1 = r6.getClass()
            goto L12
        L11:
            r1 = r0
        L12:
            com.google.gson.o0OOO0o r2 = r4.f3903OooO0O0
            if (r1 == r0) goto L3d
            o00000o0.o00oO0o r0 = new o00000o0.o00oO0o
            r0.<init>(r1)
            com.google.gson.OooOOOO r1 = r4.f3902OooO00o
            com.google.gson.o0OOO0o r0 = r1.OooO0OO(r0)
            boolean r1 = r0 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L26
            goto L3c
        L26:
            r1 = r2
        L27:
            boolean r3 = r1 instanceof com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
            if (r3 == 0) goto L37
            r3 = r1
            com.google.gson.internal.bind.SerializationDelegatingTypeAdapter r3 = (com.google.gson.internal.bind.SerializationDelegatingTypeAdapter) r3
            com.google.gson.o0OOO0o r3 = r3.OooO0Oo()
            if (r3 != r1) goto L35
            goto L37
        L35:
            r1 = r3
            goto L27
        L37:
            boolean r1 = r1 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
            if (r1 != 0) goto L3c
            goto L3d
        L3c:
            r2 = r0
        L3d:
            r2.OooO0OO(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper.OooO0OO(o0000Ooo.OooOOO, java.lang.Object):void");
    }
}