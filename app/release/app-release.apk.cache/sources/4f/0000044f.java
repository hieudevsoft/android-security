package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class o00oOoo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Class f3731OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final oOO00O f3732OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final oOO00O f3733OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final oOO00O f3734OooO0Oo;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            cls = null;
        }
        f3731OooO00o = cls;
        f3732OooO0O0 = OooOoOO(false);
        f3733OooO0OO = OooOoOO(true);
        f3734OooO0Oo = new oOO00O();
    }

    public static int OooO(List list) {
        return list.size() * 8;
    }

    public static int OooO00o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Oooo0.OoooO0(i) * size;
    }

    public static int OooO0O0(List list) {
        return list.size();
    }

    public static int OooO0OO(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int OoooooO2 = Oooo0.OoooooO(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            int size2 = ((OooOo) list.get(i2)).size();
            OoooooO2 += Oooo0.o0OoOo0(size2) + size2;
        }
        return OoooooO2;
    }

    public static int OooO0Oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooO0o0(list);
    }

    public static int OooO0o(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Oooo0.o000oOoO(i) * size;
    }

    public static int OooO0o0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o000OOo) {
            o000OOo o000ooo = (o000OOo) list;
            if (size <= 0) {
                return 0;
            }
            o000ooo.OooO(0);
            o000ooo.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Oooo0.OoooOoo(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int OooO0oO(List list) {
        return list.size() * 4;
    }

    public static int OooO0oo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return Oooo0.OoooOOO(i) * size;
    }

    public static int OooOO0(int i, List list, o0O0ooO o0o0ooo) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += Oooo0.OoooOo0(i, (OooO0O0) list.get(i3), o0o0ooo);
        }
        return i2;
    }

    public static int OooOO0O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooOO0o(list);
    }

    public static int OooOO0o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o000OOo) {
            o000OOo o000ooo = (o000OOo) list;
            if (size <= 0) {
                return 0;
            }
            o000ooo.OooO(0);
            o000ooo.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Oooo0.OoooOoo(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static int OooOOO(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000O0O) {
            o0000O0O o0000o0o2 = (o0000O0O) list;
            if (size <= 0) {
                return 0;
            }
            o0000o0o2.OooO(0);
            o0000o0o2.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Oooo0.o00O0O(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int OooOOO0(int i, List list) {
        if (list.size() == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * list.size()) + OooOOO(list);
    }

    public static int OooOOOO(int i, o0O0ooO o0o0ooo, Object obj) {
        int OoooooO2 = Oooo0.OoooooO(i);
        int OooO0O02 = ((OooO0O0) obj).OooO0O0(o0o0ooo);
        return Oooo0.o0OoOo0(OooO0O02) + OooO0O02 + OoooooO2;
    }

    public static int OooOOOo(int i, List list, o0O0ooO o0o0ooo) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int OoooooO2 = Oooo0.OoooooO(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            int OooO0O02 = ((OooO0O0) list.get(i2)).OooO0O0(o0o0ooo);
            OoooooO2 += Oooo0.o0OoOo0(OooO0O02) + OooO0O02;
        }
        return OoooooO2;
    }

    public static int OooOOo(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o000OOo) {
            o000OOo o000ooo = (o000OOo) list;
            if (size <= 0) {
                return 0;
            }
            o000ooo.OooO(0);
            o000ooo.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            int intValue = ((Integer) list.get(i2)).intValue();
            i += Oooo0.o0OoOo0((intValue >> 31) ^ (intValue << 1));
        }
        return i;
    }

    public static int OooOOo0(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooOOo(list);
    }

    public static int OooOOoo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooOo00(list);
    }

    public static int OooOo(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooOoO0(list);
    }

    public static int OooOo0(int i, List list) {
        int Oooooo2;
        int Oooooo3;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int OoooooO2 = Oooo0.OoooooO(i) * size;
        if (list instanceof o0000) {
            o0000 o0000Var = (o0000) list;
            while (i2 < size) {
                Object OooO00o2 = o0000Var.OooO00o(i2);
                if (OooO00o2 instanceof OooOo) {
                    int size2 = ((OooOo) OooO00o2).size();
                    Oooooo3 = Oooo0.o0OoOo0(size2) + size2;
                } else {
                    Oooooo3 = Oooo0.Oooooo((String) OooO00o2);
                }
                OoooooO2 += Oooooo3;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                if (obj instanceof OooOo) {
                    int size3 = ((OooOo) obj).size();
                    Oooooo2 = Oooo0.o0OoOo0(size3) + size3;
                } else {
                    Oooooo2 = Oooo0.Oooooo((String) obj);
                }
                OoooooO2 += Oooooo2;
                i2++;
            }
        }
        return OoooooO2;
    }

    public static int OooOo00(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000O0O) {
            o0000O0O o0000o0o2 = (o0000O0O) list;
            if (size <= 0) {
                return 0;
            }
            o0000o0o2.OooO(0);
            o0000o0o2.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += Oooo0.o00O0O((longValue >> 63) ^ (longValue << 1));
        }
        return i;
    }

    public static int OooOo0O(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (Oooo0.OoooooO(i) * size) + OooOo0o(list);
    }

    public static int OooOo0o(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o000OOo) {
            o000OOo o000ooo = (o000OOo) list;
            if (size <= 0) {
                return 0;
            }
            o000ooo.OooO(0);
            o000ooo.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Oooo0.o0OoOo0(((Integer) list.get(i2)).intValue());
        }
        return i;
    }

    public static Object OooOoO(int i, List list, Object obj, oOO00O ooo00o) {
        return obj;
    }

    public static int OooOoO0(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (list instanceof o0000O0O) {
            o0000O0O o0000o0o2 = (o0000O0O) list;
            if (size <= 0) {
                return 0;
            }
            o0000o0o2.OooO(0);
            o0000o0o2.getClass();
            throw null;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += Oooo0.o00O0O(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static oOO00O OooOoOO(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (oOO00O) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean OooOoo(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static void OooOoo0(oOO00O ooo00o, Object obj, Object obj2) {
        ooo00o.getClass();
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        o00O00O o00o00o = o0o0o00.unknownFields;
        o00O00O o00o00o2 = ((o0O0O00) obj2).unknownFields;
        if (!o00o00o2.equals(o00O00O.f3704OooO0o)) {
            int i = o00o00o.f3705OooO00o + o00o00o2.f3705OooO00o;
            int[] copyOf = Arrays.copyOf(o00o00o.f3706OooO0O0, i);
            System.arraycopy(o00o00o2.f3706OooO0O0, 0, copyOf, o00o00o.f3705OooO00o, o00o00o2.f3705OooO00o);
            Object[] copyOf2 = Arrays.copyOf(o00o00o.f3707OooO0OO, i);
            System.arraycopy(o00o00o2.f3707OooO0OO, 0, copyOf2, o00o00o.f3705OooO00o, o00o00o2.f3705OooO00o);
            o00o00o = new o00O00O(i, copyOf, copyOf2, true);
        }
        o0o0o00.unknownFields = o00o00o;
    }

    public static void OooOooO(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    ((Boolean) list.get(i3)).booleanValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i2++;
                }
                oooo0.o0ooOoO(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    oooo0.o00Oo0(((Boolean) list.get(i4)).booleanValue() ? (byte) 1 : (byte) 0);
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                Oooo0 oooo02 = (Oooo0) obj;
                boolean booleanValue = ((Boolean) list.get(i5)).booleanValue();
                oooo02.o0ooOOo(i, 0);
                oooo02.o00Oo0(booleanValue ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static void OooOooo(int i, List list, o0OO00O.OooO0OO oooO0OO) {
        if (list != null && !list.isEmpty()) {
            oooO0OO.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Oooo0 oooo0 = (Oooo0) oooO0OO.f5302OooO0O0;
                OooOo oooOo = (OooOo) list.get(i2);
                oooo0.o0ooOOo(i, 2);
                oooo0.o0ooOoO(oooOo.size());
                OooOo00 oooOo00 = (OooOo00) oooOo;
                oooo0.o00Ooo(oooOo00.f3628OooO0Oo, oooOo00.OooOOO0(), oooOo00.size());
            }
        }
    }

    public static void Oooo(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 8;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00oO0o(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).oo000o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void Oooo0(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Long) list.get(i4)).longValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 8;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00oO0o(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).oo000o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void Oooo000(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Double) list.get(i4)).doubleValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 8;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00oO0o(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Oooo0 oooo02 = (Oooo0) obj;
                double doubleValue = ((Double) list.get(i2)).doubleValue();
                oooo02.getClass();
                oooo02.oo000o(i, Double.doubleToRawLongBits(doubleValue));
                i2++;
            }
        }
    }

    public static void Oooo00O(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += Oooo0.OoooOoo(((Integer) list.get(i3)).intValue());
                }
                oooo0.o0ooOoO(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    oooo0.o00oO0O(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                Oooo0 oooo02 = (Oooo0) obj;
                int intValue = ((Integer) list.get(i5)).intValue();
                oooo02.o0ooOOo(i, 0);
                oooo02.o00oO0O(intValue);
            }
        }
    }

    public static void Oooo00o(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 4;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00ooo(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).o00o0O(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void Oooo0O0(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Float) list.get(i4)).floatValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 4;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00ooo(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Oooo0 oooo02 = (Oooo0) obj;
                float floatValue = ((Float) list.get(i2)).floatValue();
                oooo02.getClass();
                oooo02.o00o0O(i, Float.floatToRawIntBits(floatValue));
                i2++;
            }
        }
    }

    public static void Oooo0OO(int i, List list, o0OO00O.OooO0OO oooO0OO, o0O0ooO o0o0ooo) {
        if (list != null && !list.isEmpty()) {
            oooO0OO.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                oooO0OO.OooOOOO(i, o0o0ooo, list.get(i2));
            }
        }
    }

    public static void Oooo0o(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += Oooo0.o00O0O(((Long) list.get(i4)).longValue());
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o0Oo0oo(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).o0OOO0o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }

    public static void Oooo0o0(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += Oooo0.OoooOoo(((Integer) list.get(i3)).intValue());
                }
                oooo0.o0ooOoO(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    oooo0.o00oO0O(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                Oooo0 oooo02 = (Oooo0) obj;
                int intValue = ((Integer) list.get(i5)).intValue();
                oooo02.o0ooOOo(i, 0);
                oooo02.o00oO0O(intValue);
            }
        }
    }

    public static void Oooo0oO(int i, List list, o0OO00O.OooO0OO oooO0OO, o0O0ooO o0o0ooo) {
        if (list != null && !list.isEmpty()) {
            oooO0OO.getClass();
            for (int i2 = 0; i2 < list.size(); i2++) {
                oooO0OO.OooOOo(i, o0o0ooo, list.get(i2));
            }
        }
    }

    public static void Oooo0oo(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    ((Integer) list.get(i4)).intValue();
                    Logger logger = Oooo0.f3630OooO0o0;
                    i3 += 4;
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o00ooo(((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).o00o0O(i, ((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
    }

    public static void OoooO(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    i2 += Oooo0.o0OoOo0(((Integer) list.get(i3)).intValue());
                }
                oooo0.o0ooOoO(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    oooo0.o0ooOoO(((Integer) list.get(i4)).intValue());
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                Oooo0 oooo02 = (Oooo0) obj;
                int intValue = ((Integer) list.get(i5)).intValue();
                oooo02.o0ooOOo(i, 0);
                oooo02.o0ooOoO(intValue);
            }
        }
    }

    public static void OoooO0(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    long longValue = ((Long) list.get(i4)).longValue();
                    i3 += Oooo0.o00O0O((longValue >> 63) ^ (longValue << 1));
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    long longValue2 = ((Long) list.get(i2)).longValue();
                    oooo0.o0Oo0oo((longValue2 >> 63) ^ (longValue2 << 1));
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                long longValue3 = ((Long) list.get(i2)).longValue();
                ((Oooo0) obj).o0OOO0o(i, (longValue3 >> 63) ^ (longValue3 << 1));
                i2++;
            }
        }
    }

    public static void OoooO00(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    int intValue = ((Integer) list.get(i3)).intValue();
                    i2 += Oooo0.o0OoOo0((intValue >> 31) ^ (intValue << 1));
                }
                oooo0.o0ooOoO(i2);
                for (int i4 = 0; i4 < list.size(); i4++) {
                    int intValue2 = ((Integer) list.get(i4)).intValue();
                    oooo0.o0ooOoO((intValue2 >> 31) ^ (intValue2 << 1));
                }
                return;
            }
            for (int i5 = 0; i5 < list.size(); i5++) {
                Oooo0 oooo02 = (Oooo0) obj;
                int intValue3 = ((Integer) list.get(i5)).intValue();
                oooo02.o0ooOOo(i, 0);
                oooo02.o0ooOoO((intValue3 >> 31) ^ (intValue3 << 1));
            }
        }
    }

    public static void OoooO0O(int i, List list, o0OO00O.OooO0OO oooO0OO) {
        if (list != null && !list.isEmpty()) {
            oooO0OO.getClass();
            boolean z = list instanceof o0000;
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                o0000 o0000Var = (o0000) list;
                while (i2 < list.size()) {
                    Object OooO00o2 = o0000Var.OooO00o(i2);
                    Oooo0 oooo0 = (Oooo0) obj;
                    if (OooO00o2 instanceof String) {
                        oooo0.o0ooOOo(i, 2);
                        oooo0.o0ooOO0((String) OooO00o2);
                    } else {
                        OooOo oooOo = (OooOo) OooO00o2;
                        oooo0.o0ooOOo(i, 2);
                        oooo0.o0ooOoO(oooOo.size());
                        OooOo00 oooOo00 = (OooOo00) oooOo;
                        oooo0.o00Ooo(oooOo00.f3628OooO0Oo, oooOo00.OooOOO0(), oooOo00.size());
                    }
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                Oooo0 oooo02 = (Oooo0) obj;
                oooo02.o0ooOOo(i, 2);
                oooo02.o0ooOO0((String) list.get(i2));
                i2++;
            }
        }
    }

    public static void OoooOO0(int i, List list, o0OO00O.OooO0OO oooO0OO, boolean z) {
        if (list != null && !list.isEmpty()) {
            Object obj = oooO0OO.f5302OooO0O0;
            int i2 = 0;
            if (z) {
                Oooo0 oooo0 = (Oooo0) obj;
                oooo0.o0ooOOo(i, 2);
                int i3 = 0;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    i3 += Oooo0.o00O0O(((Long) list.get(i4)).longValue());
                }
                oooo0.o0ooOoO(i3);
                while (i2 < list.size()) {
                    oooo0.o0Oo0oo(((Long) list.get(i2)).longValue());
                    i2++;
                }
                return;
            }
            while (i2 < list.size()) {
                ((Oooo0) obj).o0OOO0o(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
        }
    }
}