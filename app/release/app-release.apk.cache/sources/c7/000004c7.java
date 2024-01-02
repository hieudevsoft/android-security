package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class o0OoOo0 extends o00Oo0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Method f3924OooO0O0;

    public o0OoOo0(Method method) {
        this.f3924OooO0O0 = method;
    }

    @Override // com.google.gson.internal.o00Oo0
    public final boolean OooO00o(Object obj, AccessibleObject accessibleObject) {
        try {
            return ((Boolean) this.f3924OooO0O0.invoke(accessibleObject, obj)).booleanValue();
        } catch (Exception e) {
            throw new RuntimeException("Failed invoking canAccess", e);
        }
    }
}