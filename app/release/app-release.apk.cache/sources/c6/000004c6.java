package com.google.gson.internal;

import OooooOo.oO00OO0O;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0Oo0oo f3923OooO00o;

    static {
        o0Oo0oo o0ooo0o;
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            o0ooo0o = new oo000o(cls.getMethod("allocateInstance", Class.class), declaredField.get(null));
        } catch (Exception unused) {
            try {
                try {
                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                    declaredMethod.setAccessible(true);
                    int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                    declaredMethod2.setAccessible(true);
                    o0ooo0o = new o00oO0o(intValue, declaredMethod2);
                } catch (Exception unused2) {
                    o0ooo0o = new o0OOO0o();
                }
            } catch (Exception unused3) {
                Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
                declaredMethod3.setAccessible(true);
                o0ooo0o = new o0ooOOo(declaredMethod3);
            }
        }
        f3923OooO00o = o0ooo0o;
    }

    public static void OooO00o(Class cls) {
        String OooO00o2 = oO00OO0O.OooO00o(cls);
        if (OooO00o2 == null) {
            return;
        }
        throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(OooO00o2));
    }

    public abstract Object OooO0O0(Class cls);
}