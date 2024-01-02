package com.google.gson.internal.bind;

import OooOO0o.o0OoOo0;
import com.google.gson.OooOOOO;
import com.google.gson.OooOo;
import com.google.gson.OooOo00;
import com.google.gson.Oooo0;
import com.google.gson.Oooo000;
import com.google.gson.o000oOoO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public abstract class OooO {

    /* renamed from: OooO  reason: collision with root package name */
    public static final o0Oo0oo f3847OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0Oo0oo f3848OooO00o = new TypeAdapters$31(Class.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.o0OOO0o
        public final Object OooO0O0(OooOOO0 oooOOO0) {
            throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.o0OOO0o
        public final void OooO0OO(OooOOO oooOOO, Object obj) {
            throw new UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.OooO00o());

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o0Oo0oo f3849OooO0O0 = new TypeAdapters$31(BitSet.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        @Override // com.google.gson.o0OOO0o
        public final Object OooO0O0(OooOOO0 oooOOO0) {
            boolean z;
            BitSet bitSet = new BitSet();
            oooOOO0.OooOo();
            int OoooO0O2 = oooOOO0.OoooO0O();
            int i = 0;
            while (OoooO0O2 != 2) {
                int OooO00o2 = o0OoOo0.OooO00o(OoooO0O2);
                if (OooO00o2 != 5 && OooO00o2 != 6) {
                    if (OooO00o2 == 7) {
                        z = oooOOO0.Oooo0();
                    } else {
                        throw new Oooo000("Invalid bitset value type: " + OooO0O0.OooO00o.OooOO0(OoooO0O2) + "; at path " + oooOOO0.OooOooo(false));
                    }
                } else {
                    int Oooo0OO2 = oooOOO0.Oooo0OO();
                    if (Oooo0OO2 == 0) {
                        z = false;
                    } else if (Oooo0OO2 == 1) {
                        z = true;
                    } else {
                        StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Invalid bitset value ", Oooo0OO2, ", expected 0 or 1; at path ");
                        OooO0o02.append(oooOOO0.OooOooo(true));
                        throw new Oooo000(OooO0o02.toString());
                    }
                }
                if (z) {
                    bitSet.set(i);
                }
                i++;
                OoooO0O2 = oooOOO0.OoooO0O();
            }
            oooOOO0.OooOoo0();
            return bitSet;
        }

        @Override // com.google.gson.o0OOO0o
        public final void OooO0OO(OooOOO oooOOO, Object obj) {
            BitSet bitSet = (BitSet) obj;
            oooOOO.OooOoO0();
            int length = bitSet.length();
            for (int i = 0; i < length; i++) {
                oooOOO.Oooo0O0(bitSet.get(i) ? 1L : 0L);
            }
            oooOOO.OooOoo0();
        }
    }.OooO00o());

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final o0OOO0o f3850OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final o0Oo0oo f3851OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o0Oo0oo f3852OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final o0Oo0oo f3853OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final o0Oo0oo f3854OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final o0Oo0oo f3855OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final o0Oo0oo f3856OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public static final o0OOO0o f3857OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public static final o0Oo0oo f3858OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public static final o0OOO0o f3859OooOOO;
    public static final o0OOO0o OooOOO0;

    /* renamed from: OooOOOO  reason: collision with root package name */
    public static final o0OOO0o f3860OooOOOO;

    /* renamed from: OooOOOo  reason: collision with root package name */
    public static final o0Oo0oo f3861OooOOOo;

    /* renamed from: OooOOo  reason: collision with root package name */
    public static final o0Oo0oo f3862OooOOo;

    /* renamed from: OooOOo0  reason: collision with root package name */
    public static final o0Oo0oo f3863OooOOo0;

    /* renamed from: OooOOoo  reason: collision with root package name */
    public static final o0Oo0oo f3864OooOOoo;

    /* renamed from: OooOo  reason: collision with root package name */
    public static final o0Oo0oo f3865OooOo;

    /* renamed from: OooOo0  reason: collision with root package name */
    public static final o0Oo0oo f3866OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public static final o0Oo0oo f3867OooOo00;

    /* renamed from: OooOo0O  reason: collision with root package name */
    public static final o0Oo0oo f3868OooOo0O;

    /* renamed from: OooOo0o  reason: collision with root package name */
    public static final o0Oo0oo f3869OooOo0o;

    /* renamed from: OooOoO  reason: collision with root package name */
    public static final o0OOO0o f3870OooOoO;

    /* renamed from: OooOoO0  reason: collision with root package name */
    public static final o0Oo0oo f3871OooOoO0;

    /* renamed from: OooOoOO  reason: collision with root package name */
    public static final o0Oo0oo f3872OooOoOO;

    /* renamed from: OooOoo0  reason: collision with root package name */
    public static final o0Oo0oo f3873OooOoo0;

    static {
        o0OOO0o o0ooo0o = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                boolean Oooo02;
                int OoooO0O2 = oooOOO0.OoooO0O();
                if (OoooO0O2 == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                if (OoooO0O2 == 6) {
                    Oooo02 = Boolean.parseBoolean(oooOOO0.OoooO00());
                } else {
                    Oooo02 = oooOOO0.Oooo0();
                }
                return Boolean.valueOf(Oooo02);
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0OO((Boolean) obj);
            }
        };
        f3850OooO0OO = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return Boolean.valueOf(oooOOO0.OoooO00());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String bool;
                Boolean bool2 = (Boolean) obj;
                if (bool2 == null) {
                    bool = "null";
                } else {
                    bool = bool2.toString();
                }
                oooOOO.Oooo0o(bool);
            }
        };
        f3851OooO0Oo = new TypeAdapters$32(Boolean.TYPE, Boolean.class, o0ooo0o);
        f3853OooO0o0 = new TypeAdapters$32(Byte.TYPE, Byte.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                try {
                    int Oooo0OO2 = oooOOO0.Oooo0OO();
                    if (Oooo0OO2 <= 255 && Oooo0OO2 >= -128) {
                        return Byte.valueOf((byte) Oooo0OO2);
                    }
                    StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Lossy conversion from ", Oooo0OO2, " to byte; at path ");
                    OooO0o02.append(oooOOO0.OooOooo(true));
                    throw new Oooo000(OooO0o02.toString());
                } catch (NumberFormatException e) {
                    throw new Oooo000(e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                } else {
                    oooOOO.Oooo0O0(number.byteValue());
                }
            }
        });
        f3852OooO0o = new TypeAdapters$32(Short.TYPE, Short.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                try {
                    int Oooo0OO2 = oooOOO0.Oooo0OO();
                    if (Oooo0OO2 <= 65535 && Oooo0OO2 >= -32768) {
                        return Short.valueOf((short) Oooo0OO2);
                    }
                    StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Lossy conversion from ", Oooo0OO2, " to short; at path ");
                    OooO0o02.append(oooOOO0.OooOooo(true));
                    throw new Oooo000(OooO0o02.toString());
                } catch (NumberFormatException e) {
                    throw new Oooo000(e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                } else {
                    oooOOO.Oooo0O0(number.shortValue());
                }
            }
        });
        f3854OooO0oO = new TypeAdapters$32(Integer.TYPE, Integer.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                try {
                    return Integer.valueOf(oooOOO0.Oooo0OO());
                } catch (NumberFormatException e) {
                    throw new Oooo000(e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                } else {
                    oooOOO.Oooo0O0(number.intValue());
                }
            }
        });
        f3855OooO0oo = new TypeAdapters$31(AtomicInteger.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                try {
                    return new AtomicInteger(oooOOO0.Oooo0OO());
                } catch (NumberFormatException e) {
                    throw new Oooo000(e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0O0(((AtomicInteger) obj).get());
            }
        }.OooO00o());
        f3847OooO = new TypeAdapters$31(AtomicBoolean.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                return new AtomicBoolean(oooOOO0.Oooo0());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0oO(((AtomicBoolean) obj).get());
            }
        }.OooO00o());
        f3856OooOO0 = new TypeAdapters$31(AtomicIntegerArray.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                ArrayList arrayList = new ArrayList();
                oooOOO0.OooOo();
                while (oooOOO0.Oooo000()) {
                    try {
                        arrayList.add(Integer.valueOf(oooOOO0.Oooo0OO()));
                    } catch (NumberFormatException e) {
                        throw new Oooo000(e);
                    }
                }
                oooOOO0.OooOoo0();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i = 0; i < size; i++) {
                    atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                oooOOO.OooOoO0();
                int length = atomicIntegerArray.length();
                for (int i = 0; i < length; i++) {
                    oooOOO.Oooo0O0(atomicIntegerArray.get(i));
                }
                oooOOO.OooOoo0();
            }
        }.OooO00o());
        f3857OooOO0O = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                try {
                    return Long.valueOf(oooOOO0.Oooo0o0());
                } catch (NumberFormatException e) {
                    throw new Oooo000(e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                } else {
                    oooOOO.Oooo0O0(number.longValue());
                }
            }
        };
        new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$12
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return Float.valueOf((float) oooOOO0.Oooo0O0());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                    return;
                }
                if (!(number instanceof Float)) {
                    number = Float.valueOf(number.floatValue());
                }
                oooOOO.Oooo0o0(number);
            }
        };
        new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$13
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return Double.valueOf(oooOOO0.Oooo0O0());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Number number = (Number) obj;
                if (number == null) {
                    oooOOO.Oooo000();
                } else {
                    oooOOO.Oooo0(number.doubleValue());
                }
            }
        };
        f3858OooOO0o = new TypeAdapters$32(Character.TYPE, Character.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                String OoooO002 = oooOOO0.OoooO00();
                if (OoooO002.length() == 1) {
                    return Character.valueOf(OoooO002.charAt(0));
                }
                throw new Oooo000("Expecting character, got: " + OoooO002 + "; at " + oooOOO0.OooOooo(true));
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String valueOf;
                Character ch = (Character) obj;
                if (ch == null) {
                    valueOf = null;
                } else {
                    valueOf = String.valueOf(ch);
                }
                oooOOO.Oooo0o(valueOf);
            }
        });
        o0OOO0o o0ooo0o2 = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                int OoooO0O2 = oooOOO0.OoooO0O();
                if (OoooO0O2 == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                } else if (OoooO0O2 == 8) {
                    return Boolean.toString(oooOOO0.Oooo0());
                } else {
                    return oooOOO0.OoooO00();
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0o((String) obj);
            }
        };
        OooOOO0 = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return new BigDecimal(OoooO002);
                } catch (NumberFormatException e) {
                    throw new Oooo000("Failed parsing '" + OoooO002 + "' as BigDecimal; at path " + oooOOO0.OooOooo(true), e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0o0((BigDecimal) obj);
            }
        };
        f3859OooOOO = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return new BigInteger(OoooO002);
                } catch (NumberFormatException e) {
                    throw new Oooo000("Failed parsing '" + OoooO002 + "' as BigInteger; at path " + oooOOO0.OooOooo(true), e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0o0((BigInteger) obj);
            }
        };
        f3860OooOOOO = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return new com.google.gson.internal.OooOOO(oooOOO0.OoooO00());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0o0((com.google.gson.internal.OooOOO) obj);
            }
        };
        f3861OooOOOo = new TypeAdapters$31(String.class, o0ooo0o2);
        f3863OooOOo0 = new TypeAdapters$31(StringBuilder.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return new StringBuilder(oooOOO0.OoooO00());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String sb;
                StringBuilder sb2 = (StringBuilder) obj;
                if (sb2 == null) {
                    sb = null;
                } else {
                    sb = sb2.toString();
                }
                oooOOO.Oooo0o(sb);
            }
        });
        f3862OooOOo = new TypeAdapters$31(StringBuffer.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return new StringBuffer(oooOOO0.OoooO00());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String stringBuffer;
                StringBuffer stringBuffer2 = (StringBuffer) obj;
                if (stringBuffer2 == null) {
                    stringBuffer = null;
                } else {
                    stringBuffer = stringBuffer2.toString();
                }
                oooOOO.Oooo0o(stringBuffer);
            }
        });
        f3864OooOOoo = new TypeAdapters$31(URL.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                } else {
                    String OoooO002 = oooOOO0.OoooO00();
                    if (!"null".equals(OoooO002)) {
                        return new URL(OoooO002);
                    }
                }
                return null;
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String externalForm;
                URL url = (URL) obj;
                if (url == null) {
                    externalForm = null;
                } else {
                    externalForm = url.toExternalForm();
                }
                oooOOO.Oooo0o(externalForm);
            }
        });
        f3867OooOo00 = new TypeAdapters$31(URI.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                } else {
                    try {
                        String OoooO002 = oooOOO0.OoooO00();
                        if (!"null".equals(OoooO002)) {
                            return new URI(OoooO002);
                        }
                    } catch (URISyntaxException e) {
                        throw new Oooo000(e);
                    }
                }
                return null;
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String aSCIIString;
                URI uri = (URI) obj;
                if (uri == null) {
                    aSCIIString = null;
                } else {
                    aSCIIString = uri.toASCIIString();
                }
                oooOOO.Oooo0o(aSCIIString);
            }
        });
        final o0OOO0o o0ooo0o3 = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                return InetAddress.getByName(oooOOO0.OoooO00());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String hostAddress;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    hostAddress = null;
                } else {
                    hostAddress = inetAddress.getHostAddress();
                }
                oooOOO.Oooo0o(hostAddress);
            }
        };
        f3866OooOo0 = new o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.o0Oo0oo
            public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
                final Class<?> cls = o00oo0o.f4065OooO00o;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                    @Override // com.google.gson.o0OOO0o
                    public final Object OooO0O0(OooOOO0 oooOOO0) {
                        Object OooO0O02 = o0ooo0o3.OooO0O0(oooOOO0);
                        if (OooO0O02 != null) {
                            Class cls2 = cls;
                            if (!cls2.isInstance(OooO0O02)) {
                                throw new Oooo000("Expected a " + cls2.getName() + " but was " + OooO0O02.getClass().getName() + "; at path " + oooOOO0.OooOooo(true));
                            }
                        }
                        return OooO0O02;
                    }

                    @Override // com.google.gson.o0OOO0o
                    public final void OooO0OO(OooOOO oooOOO, Object obj) {
                        o0ooo0o3.OooO0OO(oooOOO, obj);
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + o0ooo0o3 + "]";
            }
        };
        f3868OooOo0O = new TypeAdapters$31(UUID.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return UUID.fromString(OoooO002);
                } catch (IllegalArgumentException e) {
                    throw new Oooo000("Failed parsing '" + OoooO002 + "' as UUID; at path " + oooOOO0.OooOooo(true), e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String uuid;
                UUID uuid2 = (UUID) obj;
                if (uuid2 == null) {
                    uuid = null;
                } else {
                    uuid = uuid2.toString();
                }
                oooOOO.Oooo0o(uuid);
            }
        });
        f3869OooOo0o = new TypeAdapters$31(Currency.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                String OoooO002 = oooOOO0.OoooO00();
                try {
                    return Currency.getInstance(OoooO002);
                } catch (IllegalArgumentException e) {
                    throw new Oooo000("Failed parsing '" + OoooO002 + "' as Currency; at path " + oooOOO0.OooOooo(true), e);
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                oooOOO.Oooo0o(((Currency) obj).getCurrencyCode());
            }
        }.OooO00o());
        final o0OOO0o o0ooo0o4 = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                oooOOO0.OooOoO0();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (oooOOO0.OoooO0O() != 4) {
                    String Oooo0o2 = oooOOO0.Oooo0o();
                    int Oooo0OO2 = oooOOO0.Oooo0OO();
                    if ("year".equals(Oooo0o2)) {
                        i = Oooo0OO2;
                    } else if ("month".equals(Oooo0o2)) {
                        i2 = Oooo0OO2;
                    } else if ("dayOfMonth".equals(Oooo0o2)) {
                        i3 = Oooo0OO2;
                    } else if ("hourOfDay".equals(Oooo0o2)) {
                        i4 = Oooo0OO2;
                    } else if ("minute".equals(Oooo0o2)) {
                        i5 = Oooo0OO2;
                    } else if ("second".equals(Oooo0o2)) {
                        i6 = Oooo0OO2;
                    }
                }
                oooOOO0.OooOoo();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    oooOOO.Oooo000();
                    return;
                }
                oooOOO.OooOoO();
                oooOOO.OooOooO("year");
                oooOOO.Oooo0O0(calendar.get(1));
                oooOOO.OooOooO("month");
                oooOOO.Oooo0O0(calendar.get(2));
                oooOOO.OooOooO("dayOfMonth");
                oooOOO.Oooo0O0(calendar.get(5));
                oooOOO.OooOooO("hourOfDay");
                oooOOO.Oooo0O0(calendar.get(11));
                oooOOO.OooOooO("minute");
                oooOOO.Oooo0O0(calendar.get(12));
                oooOOO.OooOooO("second");
                oooOOO.Oooo0O0(calendar.get(13));
                oooOOO.OooOoo();
            }
        };
        f3865OooOo = new o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters$33

            /* renamed from: OooO00o  reason: collision with root package name */
            public final /* synthetic */ Class f3910OooO00o = Calendar.class;

            /* renamed from: OooO0O0  reason: collision with root package name */
            public final /* synthetic */ Class f3911OooO0O0 = GregorianCalendar.class;

            @Override // com.google.gson.o0Oo0oo
            public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
                Class cls = o00oo0o.f4065OooO00o;
                if (cls != this.f3910OooO00o && cls != this.f3911OooO0O0) {
                    return null;
                }
                return o0OOO0o.this;
            }

            public final String toString() {
                return "Factory[type=" + this.f3910OooO00o.getName() + "+" + this.f3911OooO0O0.getName() + ",adapter=" + o0OOO0o.this + "]";
            }
        };
        f3871OooOoO0 = new TypeAdapters$31(Locale.class, new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                String str;
                String str2;
                Locale locale;
                String str3 = null;
                if (oooOOO0.OoooO0O() == 9) {
                    oooOOO0.Oooo0oo();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(oooOOO0.OoooO00(), "_");
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                } else {
                    str = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str2 = stringTokenizer.nextToken();
                } else {
                    str2 = null;
                }
                if (stringTokenizer.hasMoreElements()) {
                    str3 = stringTokenizer.nextToken();
                }
                if (str2 == null && str3 == null) {
                    return new Locale(str);
                }
                if (str3 == null) {
                    locale = new Locale(str, str2);
                } else {
                    locale = new Locale(str, str2, str3);
                }
                return locale;
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(OooOOO oooOOO, Object obj) {
                String locale;
                Locale locale2 = (Locale) obj;
                if (locale2 == null) {
                    locale = null;
                } else {
                    locale = locale2.toString();
                }
                oooOOO.Oooo0o(locale);
            }
        });
        final o0OOO0o o0ooo0o5 = new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            public static OooOo OooO0Oo(OooOOO0 oooOOO0, int i) {
                if (i != 0) {
                    int i2 = i - 1;
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                if (i2 == 8) {
                                    oooOOO0.Oooo0oo();
                                    return Oooo0.f3762OooO00o;
                                }
                                throw new IllegalStateException("Unexpected token: ".concat(OooO0O0.OooO00o.OooOO0(i)));
                            }
                            return new com.google.gson.o0OoOo0(Boolean.valueOf(oooOOO0.Oooo0()));
                        }
                        return new com.google.gson.o0OoOo0(new com.google.gson.internal.OooOOO(oooOOO0.OoooO00()));
                    }
                    return new com.google.gson.o0OoOo0(oooOOO0.OoooO00());
                }
                throw null;
            }

            public static void OooO0o(OooOo oooOo, OooOOO oooOOO) {
                boolean parseBoolean;
                if (oooOo != null && !(oooOo instanceof Oooo0)) {
                    boolean z = oooOo instanceof com.google.gson.o0OoOo0;
                    if (z) {
                        if (z) {
                            com.google.gson.o0OoOo0 o0oooo0 = (com.google.gson.o0OoOo0) oooOo;
                            Serializable serializable = o0oooo0.f3942OooO00o;
                            if (serializable instanceof Number) {
                                oooOOO.Oooo0o0(o0oooo0.OooO0o());
                                return;
                            } else if (serializable instanceof Boolean) {
                                if (serializable instanceof Boolean) {
                                    parseBoolean = ((Boolean) serializable).booleanValue();
                                } else {
                                    parseBoolean = Boolean.parseBoolean(o0oooo0.OooO0oO());
                                }
                                oooOOO.Oooo0oO(parseBoolean);
                                return;
                            } else {
                                oooOOO.Oooo0o(o0oooo0.OooO0oO());
                                return;
                            }
                        }
                        throw new IllegalStateException("Not a JSON Primitive: " + oooOo);
                    }
                    boolean z2 = oooOo instanceof OooOo00;
                    if (z2) {
                        oooOOO.OooOoO0();
                        if (z2) {
                            Iterator it = ((OooOo00) oooOo).iterator();
                            while (it.hasNext()) {
                                OooO0o((OooOo) it.next(), oooOOO);
                            }
                            oooOOO.OooOoo0();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Array: " + oooOo);
                    }
                    boolean z3 = oooOo instanceof o000oOoO;
                    if (z3) {
                        oooOOO.OooOoO();
                        if (z3) {
                            for (Map.Entry entry : ((o000oOoO) oooOo).f3938OooO00o.entrySet()) {
                                oooOOO.OooOooO((String) entry.getKey());
                                OooO0o((OooOo) entry.getValue(), oooOOO);
                            }
                            oooOOO.OooOoo();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Object: " + oooOo);
                    }
                    throw new IllegalArgumentException("Couldn't write " + oooOo.getClass());
                }
                oooOOO.Oooo000();
            }

            public static OooOo OooO0o0(OooOOO0 oooOOO0, int i) {
                if (i != 0) {
                    int i2 = i - 1;
                    if (i2 == 0) {
                        oooOOO0.OooOo();
                        return new OooOo00();
                    } else if (i2 != 2) {
                        return null;
                    } else {
                        oooOOO0.OooOoO0();
                        return new o000oOoO();
                    }
                }
                throw null;
            }

            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(OooOOO0 oooOOO0) {
                String str;
                boolean z;
                OooOo oooOo;
                int OoooO0O2 = oooOOO0.OoooO0O();
                OooOo OooO0o02 = OooO0o0(oooOOO0, OoooO0O2);
                if (OooO0o02 == null) {
                    return OooO0Oo(oooOOO0, OoooO0O2);
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                while (true) {
                    if (oooOOO0.Oooo000()) {
                        if (OooO0o02 instanceof o000oOoO) {
                            str = oooOOO0.Oooo0o();
                        } else {
                            str = null;
                        }
                        int OoooO0O3 = oooOOO0.OoooO0O();
                        OooOo OooO0o03 = OooO0o0(oooOOO0, OoooO0O3);
                        if (OooO0o03 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (OooO0o03 == null) {
                            oooOo = OooO0Oo(oooOOO0, OoooO0O3);
                        } else {
                            oooOo = OooO0o03;
                        }
                        if (OooO0o02 instanceof OooOo00) {
                            ((OooOo00) OooO0o02).f3761OooO00o.add(oooOo);
                        } else {
                            ((o000oOoO) OooO0o02).f3938OooO00o.put(str, oooOo);
                        }
                        if (z) {
                            arrayDeque.addLast(OooO0o02);
                            OooO0o02 = oooOo;
                        }
                    } else {
                        if (OooO0o02 instanceof OooOo00) {
                            oooOOO0.OooOoo0();
                        } else {
                            oooOOO0.OooOoo();
                        }
                        if (arrayDeque.isEmpty()) {
                            return OooO0o02;
                        }
                        OooO0o02 = (OooOo) arrayDeque.removeLast();
                    }
                }
            }

            @Override // com.google.gson.o0OOO0o
            public final /* bridge */ /* synthetic */ void OooO0OO(OooOOO oooOOO, Object obj) {
                OooO0o((OooOo) obj, oooOOO);
            }
        };
        f3870OooOoO = o0ooo0o5;
        f3872OooOoOO = new o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.o0Oo0oo
            public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
                final Class cls = o00oo0o.f4065OooO00o;
                if (!r1.isAssignableFrom(cls)) {
                    return null;
                }
                return new o0OOO0o() { // from class: com.google.gson.internal.bind.TypeAdapters$34.1
                    @Override // com.google.gson.o0OOO0o
                    public final Object OooO0O0(OooOOO0 oooOOO0) {
                        Object OooO0O02 = o0ooo0o5.OooO0O0(oooOOO0);
                        if (OooO0O02 != null) {
                            Class cls2 = cls;
                            if (!cls2.isInstance(OooO0O02)) {
                                throw new Oooo000("Expected a " + cls2.getName() + " but was " + OooO0O02.getClass().getName() + "; at path " + oooOOO0.OooOooo(true));
                            }
                        }
                        return OooO0O02;
                    }

                    @Override // com.google.gson.o0OOO0o
                    public final void OooO0OO(OooOOO oooOOO, Object obj) {
                        o0ooo0o5.OooO0OO(oooOOO, obj);
                    }
                };
            }

            public final String toString() {
                return "Factory[typeHierarchy=" + r1.getName() + ",adapter=" + o0ooo0o5 + "]";
            }
        };
        f3873OooOoo0 = new o0Oo0oo() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // com.google.gson.o0Oo0oo
            public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
                Class cls = o00oo0o.f4065OooO00o;
                if (Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
                    if (!cls.isEnum()) {
                        cls = cls.getSuperclass();
                    }
                    return new o0OOO0o(cls) { // from class: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter

                        /* renamed from: OooO00o  reason: collision with root package name */
                        public final HashMap f3917OooO00o = new HashMap();

                        /* renamed from: OooO0O0  reason: collision with root package name */
                        public final HashMap f3918OooO0O0 = new HashMap();

                        /* renamed from: OooO0OO  reason: collision with root package name */
                        public final HashMap f3919OooO0OO = new HashMap();

                        {
                            Field[] fieldArr;
                            try {
                                for (Field field : (Field[]) AccessController.doPrivileged(new OooO0o(cls))) {
                                    Enum r4 = (Enum) field.get(null);
                                    String name = r4.name();
                                    String str = r4.toString();
                                    o00000O.OooO0O0 oooO0O0 = (o00000O.OooO0O0) field.getAnnotation(o00000O.OooO0O0.class);
                                    if (oooO0O0 != null) {
                                        name = oooO0O0.value();
                                        for (String str2 : oooO0O0.alternate()) {
                                            this.f3917OooO00o.put(str2, r4);
                                        }
                                    }
                                    this.f3917OooO00o.put(name, r4);
                                    this.f3918OooO0O0.put(str, r4);
                                    this.f3919OooO0OO.put(r4, name);
                                }
                            } catch (IllegalAccessException e) {
                                throw new AssertionError(e);
                            }
                        }

                        @Override // com.google.gson.o0OOO0o
                        public final Object OooO0O0(OooOOO0 oooOOO0) {
                            if (oooOOO0.OoooO0O() == 9) {
                                oooOOO0.Oooo0oo();
                                return null;
                            }
                            String OoooO002 = oooOOO0.OoooO00();
                            Enum r0 = (Enum) this.f3917OooO00o.get(OoooO002);
                            if (r0 == null) {
                                return (Enum) this.f3918OooO0O0.get(OoooO002);
                            }
                            return r0;
                        }

                        @Override // com.google.gson.o0OOO0o
                        public final void OooO0OO(OooOOO oooOOO, Object obj) {
                            String str;
                            Enum r3 = (Enum) obj;
                            if (r3 == null) {
                                str = null;
                            } else {
                                str = (String) this.f3919OooO0OO.get(r3);
                            }
                            oooOOO.Oooo0o(str);
                        }
                    };
                }
                return null;
            }
        };
    }

    public static o0Oo0oo OooO00o(Class cls, o0OOO0o o0ooo0o) {
        return new TypeAdapters$31(cls, o0ooo0o);
    }

    public static o0Oo0oo OooO0O0(Class cls, Class cls2, o0OOO0o o0ooo0o) {
        return new TypeAdapters$32(cls, cls2, o0ooo0o);
    }
}