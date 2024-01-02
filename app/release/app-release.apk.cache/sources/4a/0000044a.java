package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract class o00O0OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Logger f3715OooO00o = Logger.getLogger(o00O0OO0.class.getName());

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Unsafe f3716OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Class f3717OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o00O0O0O f3718OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final boolean f3719OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final boolean f3720OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final long f3721OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final boolean f3722OooO0oo;

    /* JADX WARN: Removed duplicated region for block: B:124:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0105 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ff  */
    static {
        /*
            Method dump skipped, instructions count: 664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.o00O0OO0.<clinit>():void");
    }

    public static byte OooO(long j, Object obj) {
        return (byte) ((OooOO0o((-4) & j, obj) >>> ((int) ((j & 3) << 3))) & 255);
    }

    public static Object OooO00o(Class cls) {
        try {
            return f3716OooO0O0.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    public static int OooO0O0(Class cls) {
        if (f3719OooO0o) {
            return f3718OooO0Oo.OooO00o(cls);
        }
        return -1;
    }

    public static void OooO0OO(Class cls) {
        if (f3719OooO0o) {
            f3718OooO0Oo.OooO0O0(cls);
        }
    }

    public static Field OooO0Oo() {
        Field field;
        Field field2;
        if (OooO0o.OooO00o()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean OooO0o(long j, Object obj) {
        return f3718OooO0Oo.OooO0OO(j, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean OooO0o0(Class cls) {
        if (OooO0o.OooO00o()) {
            try {
                Class cls2 = f3717OooO0OO;
                Class cls3 = Boolean.TYPE;
                cls2.getMethod("peekLong", cls, cls3);
                cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
                Class cls4 = Integer.TYPE;
                cls2.getMethod("pokeInt", cls, cls4, cls3);
                cls2.getMethod("peekInt", cls, cls3);
                cls2.getMethod("pokeByte", cls, Byte.TYPE);
                cls2.getMethod("peekByte", cls);
                cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
                cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        return false;
    }

    public static byte OooO0oO(byte[] bArr, long j) {
        return f3718OooO0Oo.OooO0Oo(f3721OooO0oO + j, bArr);
    }

    public static byte OooO0oo(long j, Object obj) {
        return (byte) ((OooOO0o((-4) & j, obj) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    public static double OooOO0(long j, Object obj) {
        return f3718OooO0Oo.OooO0o0(j, obj);
    }

    public static float OooOO0O(long j, Object obj) {
        return f3718OooO0Oo.OooO0o(j, obj);
    }

    public static int OooOO0o(long j, Object obj) {
        return f3718OooO0Oo.OooO0oO(j, obj);
    }

    public static Object OooOOO(long j, Object obj) {
        return f3718OooO0Oo.OooO(j, obj);
    }

    public static long OooOOO0(long j, Object obj) {
        return f3718OooO0Oo.OooO0oo(j, obj);
    }

    public static Unsafe OooOOOO() {
        try {
            return (Unsafe) AccessController.doPrivileged(new o00O0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void OooOOOo(Object obj, long j, boolean z) {
        f3718OooO0Oo.OooOO0O(obj, j, z);
    }

    public static void OooOOo(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int OooOO0o2 = OooOO0o(j2, obj);
        int i = ((~((int) j)) & 3) << 3;
        OooOo0O(((255 & b) << i) | (OooOO0o2 & (~(255 << i))), j2, obj);
    }

    public static void OooOOo0(byte[] bArr, long j, byte b) {
        f3718OooO0Oo.OooOO0o(bArr, f3721OooO0oO + j, b);
    }

    public static void OooOOoo(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        OooOo0O(((255 & b) << i) | (OooOO0o(j2, obj) & (~(255 << i))), j2, obj);
    }

    public static void OooOo(long j, Object obj, Object obj2) {
        f3718OooO0Oo.OooOOo0(j, obj, obj2);
    }

    public static void OooOo0(Object obj, long j, float f) {
        f3718OooO0Oo.OooOOO(obj, j, f);
    }

    public static void OooOo00(Object obj, long j, double d) {
        f3718OooO0Oo.OooOOO0(obj, j, d);
    }

    public static void OooOo0O(int i, long j, Object obj) {
        f3718OooO0Oo.OooOOOO(i, j, obj);
    }

    public static void OooOo0o(Object obj, long j, long j2) {
        f3718OooO0Oo.OooOOOo(obj, j, j2);
    }
}