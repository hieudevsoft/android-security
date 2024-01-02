package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o00oO0o extends o0Oo0oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Method f3921OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ int f3922OooO0OO;

    public o00oO0o(int i, Method method) {
        this.f3921OooO0O0 = method;
        this.f3922OooO0OO = i;
    }

    @Override // com.google.gson.internal.o0Oo0oo
    public final Object OooO0O0(Class cls) {
        o0Oo0oo.OooO00o(cls);
        return this.f3921OooO0O0.invoke(null, cls, Integer.valueOf(this.f3922OooO0OO));
    }
}