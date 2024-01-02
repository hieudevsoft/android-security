package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import o00000o0.o00oO0o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TypeAdapters$32 implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Class f3907OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Class f3908OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f3909OooO0OO;

    public TypeAdapters$32(Class cls, Class cls2, o0OOO0o o0ooo0o) {
        this.f3907OooO00o = cls;
        this.f3908OooO0O0 = cls2;
        this.f3909OooO0OO = o0ooo0o;
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        Class cls = o00oo0o.f4065OooO00o;
        if (cls != this.f3907OooO00o && cls != this.f3908OooO0O0) {
            return null;
        }
        return this.f3909OooO0OO;
    }

    public final String toString() {
        return "Factory[type=" + this.f3908OooO0O0.getName() + "+" + this.f3907OooO00o.getName() + ",adapter=" + this.f3909OooO0OO + "]";
    }
}