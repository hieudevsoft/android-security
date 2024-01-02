package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class o00O0O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Unsafe f3714OooO00o;

    public o00O0O0O(Unsafe unsafe) {
        this.f3714OooO00o = unsafe;
    }

    public final Object OooO(long j, Object obj) {
        return this.f3714OooO00o.getObject(obj, j);
    }

    public final int OooO00o(Class cls) {
        return this.f3714OooO00o.arrayBaseOffset(cls);
    }

    public final int OooO0O0(Class cls) {
        return this.f3714OooO00o.arrayIndexScale(cls);
    }

    public abstract boolean OooO0OO(long j, Object obj);

    public abstract byte OooO0Oo(long j, Object obj);

    public abstract float OooO0o(long j, Object obj);

    public abstract double OooO0o0(long j, Object obj);

    public final int OooO0oO(long j, Object obj) {
        return this.f3714OooO00o.getInt(obj, j);
    }

    public final long OooO0oo(long j, Object obj) {
        return this.f3714OooO00o.getLong(obj, j);
    }

    public final long OooOO0(Field field) {
        return this.f3714OooO00o.objectFieldOffset(field);
    }

    public abstract void OooOO0O(Object obj, long j, boolean z);

    public abstract void OooOO0o(Object obj, long j, byte b);

    public abstract void OooOOO(Object obj, long j, float f);

    public abstract void OooOOO0(Object obj, long j, double d);

    public final void OooOOOO(int i, long j, Object obj) {
        this.f3714OooO00o.putInt(obj, j, i);
    }

    public final void OooOOOo(Object obj, long j, long j2) {
        this.f3714OooO00o.putLong(obj, j, j2);
    }

    public final void OooOOo0(long j, Object obj, Object obj2) {
        this.f3714OooO00o.putObject(obj, j, obj2);
    }
}