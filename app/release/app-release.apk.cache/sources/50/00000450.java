package com.google.crypto.tink.shaded.protobuf;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class o0O0O00 extends OooO0O0 {
    private static Map<Object, o0O0O00> defaultInstanceMap = new ConcurrentHashMap();
    protected o00O00O unknownFields = o00O00O.f3704OooO0o;
    protected int memoizedSerializedSize = -1;

    public static Object OooO(Object obj, Method method, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static o0O0O00 OooO0oo(Class cls) {
        o0O0O00 o0o0o00 = defaultInstanceMap.get(cls);
        if (o0o0o00 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o0o0o00 = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (o0o0o00 == null) {
            o0o0o00 = (o0O0O00) ((o0O0O00) o00O0OO0.OooO00o(cls)).OooO0oO(oo0o0Oo.GET_DEFAULT_INSTANCE);
            if (o0o0o00 != null) {
                defaultInstanceMap.put(cls, o0o0o00);
            } else {
                throw new IllegalStateException();
            }
        }
        return o0o0o00;
    }

    public static o0O0O00 OooOO0O(o0O0O00 o0o0o00, OooOo oooOo, o00Oo0 o00oo0) {
        OooOo00 oooOo00 = (OooOo00) oooOo;
        int OooOOO0 = oooOo00.OooOOO0();
        int size = oooOo00.size();
        Oooo000 oooo000 = new Oooo000(oooOo00.f3628OooO0Oo, OooOOO0, size, true);
        try {
            oooo000.OooO0Oo(size);
            o0O0O00 OooOOO02 = OooOOO0(o0o0o00, oooo000, o00oo0);
            if (oooo000.f3643OooO0oo == 0) {
                if (OooOOO02.OooOO0()) {
                    return OooOOO02;
                }
                throw new o00000O(new o00O00().getMessage());
            }
            throw new o00000O("Protocol message end-group tag did not match expected tag.");
        } catch (o00000O e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static o0O0O00 OooOO0o(o0O0O00 o0o0o00, byte[] bArr, o00Oo0 o00oo0) {
        int length = bArr.length;
        o0O0O00 o0o0o002 = (o0O0O00) o0o0o00.OooO0oO(oo0o0Oo.NEW_MUTABLE_INSTANCE);
        try {
            o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
            o000oo00.getClass();
            o0O0ooO OooO00o2 = o000oo00.OooO00o(o0o0o002.getClass());
            OooO00o2.OooO00o(o0o0o002, bArr, 0, length + 0, new OooO(o00oo0));
            OooO00o2.OooO0oO(o0o0o002);
            if (o0o0o002.memoizedHashCode == 0) {
                if (o0o0o002.OooOO0()) {
                    return o0o0o002;
                }
                throw new o00000O(new o00O00().getMessage());
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof o00000O) {
                throw ((o00000O) e.getCause());
            }
            throw new o00000O(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw o00000O.OooO0o();
        }
    }

    public static void OooOOO(Class cls, o0O0O00 o0o0o00) {
        defaultInstanceMap.put(cls, o0o0o00);
    }

    public static o0O0O00 OooOOO0(o0O0O00 o0o0o00, Oooo000 oooo000, o00Oo0 o00oo0) {
        o0O0O00 o0o0o002 = (o0O0O00) o0o0o00.OooO0oO(oo0o0Oo.NEW_MUTABLE_INSTANCE);
        try {
            o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
            o000oo00.getClass();
            o0O0ooO OooO00o2 = o000oo00.OooO00o(o0o0o002.getClass());
            o000oOoO.o00O0O o00o0o = oooo000.f3637OooO0O0;
            if (o00o0o == null) {
                o00o0o = new o000oOoO.o00O0O(oooo000);
            }
            OooO00o2.OooO0o(o0o0o002, o00o0o, o00oo0);
            OooO00o2.OooO0oO(o0o0o002);
            return o0o0o002;
        } catch (IOException e) {
            if (e.getCause() instanceof o00000O) {
                throw ((o00000O) e.getCause());
            }
            throw new o00000O(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof o00000O) {
                throw ((o00000O) e2.getCause());
            }
            throw e2;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0
    public final int OooO00o() {
        if (this.memoizedSerializedSize == -1) {
            o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
            o000oo00.getClass();
            this.memoizedSerializedSize = o000oo00.OooO00o(getClass()).OooO0OO(this);
        }
        return this.memoizedSerializedSize;
    }

    public final o0Oo0oo OooO0o() {
        return (o0Oo0oo) OooO0oO(oo0o0Oo.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooO0O0
    public final void OooO0o0(Oooo0 oooo0) {
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        o0O0ooO OooO00o2 = o000oo00.OooO00o(getClass());
        o0OO00O.OooO0OO oooO0OO = oooo0.f3631OooO00o;
        if (oooO0OO == null) {
            oooO0OO = new o0OO00O.OooO0OO(oooo0);
        }
        OooO00o2.OooO0oo(this, oooO0OO);
    }

    public abstract Object OooO0oO(oo0o0Oo oo0o0oo);

    public final boolean OooOO0() {
        byte byteValue = ((Byte) OooO0oO(oo0o0Oo.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        boolean OooO0O02 = o000oo00.OooO00o(getClass()).OooO0O0(this);
        OooO0oO(oo0o0Oo.SET_MEMOIZED_IS_INITIALIZED);
        return OooO0O02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((o0O0O00) OooO0oO(oo0o0Oo.GET_DEFAULT_INSTANCE)).getClass().isInstance(obj)) {
            return false;
        }
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        return o000oo00.OooO00o(getClass()).OooOO0(this, (o0O0O00) obj);
    }

    public final int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        o000OO00 o000oo00 = o000OO00.f3692OooO0OO;
        o000oo00.getClass();
        int OooO2 = o000oo00.OooO00o(getClass()).OooO(this);
        this.memoizedHashCode = OooO2;
        return OooO2;
    }

    public final String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        OooOO0.OoooO00(this, sb, 0);
        return sb.toString();
    }
}