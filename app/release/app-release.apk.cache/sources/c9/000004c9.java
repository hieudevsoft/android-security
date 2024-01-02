package com.google.gson.internal;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class oo000o extends o0Oo0oo {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Method f3926OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f3927OooO0OO;

    public oo000o(Method method, Object obj) {
        this.f3926OooO0O0 = method;
        this.f3927OooO0OO = obj;
    }

    @Override // com.google.gson.internal.o0Oo0oo
    public final Object OooO0O0(Class cls) {
        o0Oo0oo.OooO00o(cls);
        return this.f3926OooO0O0.invoke(this.f3927OooO0OO, cls);
    }
}