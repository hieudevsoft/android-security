package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0OOO0o f3752OooO00o = null;

    @Override // com.google.gson.o0OOO0o
    public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
        o0OOO0o o0ooo0o = this.f3752OooO00o;
        if (o0ooo0o != null) {
            return o0ooo0o.OooO0O0(oooOOO0);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.o0OOO0o
    public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
        o0OOO0o o0ooo0o = this.f3752OooO00o;
        if (o0ooo0o != null) {
            o0ooo0o.OooO0OO(oooOOO, obj);
            return;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final o0OOO0o OooO0Oo() {
        o0OOO0o o0ooo0o = this.f3752OooO00o;
        if (o0ooo0o != null) {
            return o0ooo0o;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}