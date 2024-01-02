package com.google.gson.internal.bind;

import com.google.gson.OooOOOO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import o00000o0.o00oO0o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TypeAdapters$31 implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ Class f3905OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f3906OooO0O0;

    public TypeAdapters$31(Class cls, o0OOO0o o0ooo0o) {
        this.f3905OooO00o = cls;
        this.f3906OooO0O0 = o0ooo0o;
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        if (o00oo0o.f4065OooO00o == this.f3905OooO00o) {
            return this.f3906OooO0O0;
        }
        return null;
    }

    public final String toString() {
        return "Factory[type=" + this.f3905OooO00o.getName() + ",adapter=" + this.f3906OooO0O0 + "]";
    }
}