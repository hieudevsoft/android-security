package com.google.gson.internal;

import java.lang.reflect.AccessibleObject;

/* loaded from: classes.dex */
public abstract class o00Oo0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o00Oo0 f3920OooO00o;

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    static {
        /*
            int r0 = com.google.gson.internal.OooOOO0.f3799OooO00o
            r1 = 9
            r2 = 1
            r3 = 0
            if (r0 < r1) goto La
            r0 = r2
            goto Lb
        La:
            r0 = r3
        Lb:
            if (r0 == 0) goto L21
            java.lang.Class<java.lang.reflect.AccessibleObject> r0 = java.lang.reflect.AccessibleObject.class
            java.lang.String r1 = "canAccess"
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r2[r3] = r4     // Catch: java.lang.NoSuchMethodException -> L21
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L21
            com.google.gson.internal.o0OoOo0 r1 = new com.google.gson.internal.o0OoOo0     // Catch: java.lang.NoSuchMethodException -> L21
            r1.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L21
            goto L22
        L21:
            r1 = 0
        L22:
            if (r1 != 0) goto L29
            com.google.gson.internal.o00O0O r1 = new com.google.gson.internal.o00O0O
            r1.<init>()
        L29:
            com.google.gson.internal.o00Oo0.f3920OooO00o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.o00Oo0.<clinit>():void");
    }

    public abstract boolean OooO00o(Object obj, AccessibleObject accessibleObject);
}