package com.google.gson.internal.bind;

import OooooOo.oO00OO0O;
import androidx.fragment.app.o00O0O;
import com.google.gson.OooOOO;
import com.google.gson.OooOOOO;
import com.google.gson.Oooo000;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.o000oOoO;
import com.google.gson.internal.o00Oo0;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class ReflectiveTypeAdapterFactory implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO00OO0O f3891OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO f3892OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Excluder f3893OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3894OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final List f3895OooO0o0;

    /* loaded from: classes.dex */
    public static abstract class Adapter<T, A> extends o0OOO0o {

        /* renamed from: OooO00o  reason: collision with root package name */
        public final Map f3896OooO00o;

        public Adapter(LinkedHashMap linkedHashMap) {
            this.f3896OooO00o = linkedHashMap;
        }

        @Override // com.google.gson.o0OOO0o
        public final Object OooO0O0(OooOOO0 oooOOO0) {
            if (oooOOO0.OoooO0O() == 9) {
                oooOOO0.Oooo0oo();
                return null;
            }
            Object OooO0Oo2 = OooO0Oo();
            try {
                oooOOO0.OooOoO0();
                while (oooOOO0.Oooo000()) {
                    OooO0OO oooO0OO = (OooO0OO) this.f3896OooO00o.get(oooOOO0.Oooo0o());
                    if (oooO0OO != null && oooO0OO.f3884OooO0o0) {
                        OooO0o(OooO0Oo2, oooOOO0, oooO0OO);
                    }
                    oooOOO0.OoooOo0();
                }
                oooOOO0.OooOoo();
                return OooO0o0(OooO0Oo2);
            } catch (IllegalAccessException e) {
                OooO0O0.OooO0O0 oooO0O0 = o00000Oo.OooO0o.f4064OooO00o;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalStateException e2) {
                throw new Oooo000(e2);
            }
        }

        @Override // com.google.gson.o0OOO0o
        public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
            if (obj == null) {
                oooOOO.Oooo000();
                return;
            }
            oooOOO.OooOoO();
            try {
                for (OooO0OO oooO0OO : this.f3896OooO00o.values()) {
                    oooO0OO.OooO00o(oooOOO, obj);
                }
                oooOOO.OooOoo();
            } catch (IllegalAccessException e) {
                OooO0O0.OooO0O0 oooO0O0 = o00000Oo.OooO0o.f4064OooO00o;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            }
        }

        public abstract Object OooO0Oo();

        public abstract void OooO0o(Object obj, OooOOO0 oooOOO0, OooO0OO oooO0OO);

        public abstract Object OooO0o0(Object obj);
    }

    /* loaded from: classes.dex */
    public static final class FieldReflectionAdapter<T> extends Adapter<T, T> {

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final o000oOoO f3897OooO0O0;

        public FieldReflectionAdapter(o000oOoO o000oooo, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f3897OooO0O0 = o000oooo;
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object OooO0Oo() {
            return this.f3897OooO0O0.OooO0O0();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void OooO0o(Object obj, OooOOO0 oooOOO0, OooO0OO oooO0OO) {
            Object OooO0O02 = oooO0OO.f3878OooO.OooO0O0(oooOOO0);
            if (OooO0O02 != null || !oooO0OO.f3889OooOO0o) {
                boolean z = oooO0OO.f3883OooO0o;
                Field field = oooO0OO.f3880OooO0O0;
                if (z) {
                    ReflectiveTypeAdapterFactory.OooO0O0(obj, field);
                } else if (oooO0OO.OooOOO0) {
                    String OooO0Oo2 = o00000Oo.OooO0o.OooO0Oo(field, false);
                    throw new Oooo000("Cannot set value of 'static final' " + OooO0Oo2);
                }
                field.set(obj, OooO0O02);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object OooO0o0(Object obj) {
            return obj;
        }
    }

    /* loaded from: classes.dex */
    public static final class RecordAdapter<T> extends Adapter<T, Object[]> {

        /* renamed from: OooO0o0  reason: collision with root package name */
        public static final HashMap f3898OooO0o0;

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final Constructor f3899OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        public final Object[] f3900OooO0OO;

        /* renamed from: OooO0Oo  reason: collision with root package name */
        public final HashMap f3901OooO0Oo;

        static {
            HashMap hashMap = new HashMap();
            hashMap.put(Byte.TYPE, (byte) 0);
            hashMap.put(Short.TYPE, (short) 0);
            hashMap.put(Integer.TYPE, 0);
            hashMap.put(Long.TYPE, 0L);
            hashMap.put(Float.TYPE, Float.valueOf(0.0f));
            hashMap.put(Double.TYPE, Double.valueOf(0.0d));
            hashMap.put(Character.TYPE, (char) 0);
            hashMap.put(Boolean.TYPE, Boolean.FALSE);
            f3898OooO0o0 = hashMap;
        }

        public RecordAdapter(Class cls, LinkedHashMap linkedHashMap) {
            super(linkedHashMap);
            this.f3901OooO0Oo = new HashMap();
            OooO0O0.OooO0O0 oooO0O0 = o00000Oo.OooO0o.f4064OooO00o;
            Constructor OooO0oO2 = oooO0O0.OooO0oO(cls);
            this.f3899OooO0O0 = OooO0oO2;
            o00000Oo.OooO0o.OooO0o0(OooO0oO2);
            String[] OooO2 = oooO0O0.OooO(cls);
            for (int i = 0; i < OooO2.length; i++) {
                this.f3901OooO0Oo.put(OooO2[i], Integer.valueOf(i));
            }
            Class<?>[] parameterTypes = this.f3899OooO0O0.getParameterTypes();
            this.f3900OooO0OO = new Object[parameterTypes.length];
            for (int i2 = 0; i2 < parameterTypes.length; i2++) {
                this.f3900OooO0OO[i2] = f3898OooO0o0.get(parameterTypes[i2]);
            }
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object OooO0Oo() {
            return (Object[]) this.f3900OooO0OO.clone();
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final void OooO0o(Object obj, OooOOO0 oooOOO0, OooO0OO oooO0OO) {
            Object[] objArr = (Object[]) obj;
            HashMap hashMap = this.f3901OooO0Oo;
            String str = oooO0OO.f3881OooO0OO;
            Integer num = (Integer) hashMap.get(str);
            if (num != null) {
                int intValue = num.intValue();
                Object OooO0O02 = oooO0OO.f3878OooO.OooO0O0(oooOOO0);
                if (OooO0O02 == null && oooO0OO.f3889OooOO0o) {
                    throw new o00O0O("null is not allowed as value for record component '" + str + "' of primitive type; at path " + oooOOO0.OooOooo(false));
                }
                objArr[intValue] = OooO0O02;
                return;
            }
            throw new IllegalStateException("Could not find the index in the constructor '" + o00000Oo.OooO0o.OooO0O0(this.f3899OooO0O0) + "' for field with name '" + str + "', unable to determine which argument in the constructor the field corresponds to. This is unexpected behavior, as we expect the RecordComponents to have the same names as the fields in the Java class, and that the order of the RecordComponents is the same as the order of the canonical constructor parameters.");
        }

        @Override // com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter
        public final Object OooO0o0(Object obj) {
            Object[] objArr = (Object[]) obj;
            Constructor constructor = this.f3899OooO0O0;
            try {
                return constructor.newInstance(objArr);
            } catch (IllegalAccessException e) {
                OooO0O0.OooO0O0 oooO0O0 = o00000Oo.OooO0o.f4064OooO00o;
                throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
            } catch (IllegalArgumentException e2) {
                e = e2;
                throw new RuntimeException("Failed to invoke constructor '" + o00000Oo.OooO0o.OooO0O0(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InstantiationException e3) {
                e = e3;
                throw new RuntimeException("Failed to invoke constructor '" + o00000Oo.OooO0o.OooO0O0(constructor) + "' with args " + Arrays.toString(objArr), e);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("Failed to invoke constructor '" + o00000Oo.OooO0o.OooO0O0(constructor) + "' with args " + Arrays.toString(objArr), e4.getCause());
            }
        }
    }

    public ReflectiveTypeAdapterFactory(oO00OO0O oo00oo0o, Excluder excluder, JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory, List list) {
        com.google.gson.OooO00o oooO00o = com.google.gson.OooOOO0.f3753OooO00o;
        this.f3891OooO00o = oo00oo0o;
        this.f3892OooO0O0 = oooO00o;
        this.f3893OooO0OO = excluder;
        this.f3894OooO0Oo = jsonAdapterAnnotationTypeAdapterFactory;
        this.f3895OooO0o0 = list;
    }

    public static void OooO0O0(Object obj, AccessibleObject accessibleObject) {
        if (Modifier.isStatic(((Member) accessibleObject).getModifiers())) {
            obj = null;
        }
        if (o00Oo0.f3920OooO00o.OooO00o(obj, accessibleObject)) {
            return;
        }
        throw new Oooo000(OooO0O0.OooO00o.OooO0OO(o00000Oo.OooO0o.OooO0Oo(accessibleObject, true), " is not accessible and ReflectionAccessFilter does not permit making it accessible. Register a TypeAdapter for the declaring type, adjust the access filter or increase the visibility of the element and its declaring type."));
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        Class cls = o00oo0o.f4065OooO00o;
        if (!Object.class.isAssignableFrom(cls)) {
            return null;
        }
        o0000O00.OooO00o.o0Oo0oo(this.f3895OooO0o0);
        if (o00000Oo.OooO0o.f4064OooO00o.OooOO0(cls)) {
            return new RecordAdapter(cls, OooO0OO(oooOOOO, o00oo0o, cls, true));
        }
        return new FieldReflectionAdapter(this.f3891OooO00o.OooO0O0(o00oo0o), OooO0OO(oooOOOO, o00oo0o, cls, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01b7 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.LinkedHashMap OooO0OO(com.google.gson.OooOOOO r36, o00000o0.o00oO0o r37, java.lang.Class r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0OO(com.google.gson.OooOOOO, o00000o0.o00oO0o, java.lang.Class, boolean):java.util.LinkedHashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        if (r0 == false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean OooO0Oo(java.lang.reflect.Field r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Class r0 = r9.getType()
            com.google.gson.internal.Excluder r1 = r8.f3893OooO0OO
            boolean r0 = r1.OooO0O0(r0)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L13
            r1.OooO0OO(r10)
            r0 = r2
            goto L14
        L13:
            r0 = r3
        L14:
            if (r0 != 0) goto L98
            int r0 = r9.getModifiers()
            int r4 = r1.f3766OooO0O0
            r0 = r0 & r4
            if (r0 == 0) goto L20
            goto L71
        L20:
            double r4 = r1.f3765OooO00o
            r6 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 == 0) goto L3f
            java.lang.Class<o00000O.OooO0OO> r0 = o00000O.OooO0OO.class
            java.lang.annotation.Annotation r0 = r9.getAnnotation(r0)
            o00000O.OooO0OO r0 = (o00000O.OooO0OO) r0
            java.lang.Class<o00000O.OooO0o> r4 = o00000O.OooO0o.class
            java.lang.annotation.Annotation r4 = r9.getAnnotation(r4)
            o00000O.OooO0o r4 = (o00000O.OooO0o) r4
            boolean r0 = r1.OooO0o0(r0, r4)
            if (r0 != 0) goto L3f
            goto L71
        L3f:
            boolean r0 = r9.isSynthetic()
            if (r0 == 0) goto L46
            goto L71
        L46:
            boolean r0 = r1.f3767OooO0OO
            if (r0 != 0) goto L67
            java.lang.Class r0 = r9.getType()
            boolean r4 = r0.isMemberClass()
            if (r4 == 0) goto L63
            int r0 = r0.getModifiers()
            r0 = r0 & 8
            if (r0 == 0) goto L5e
            r0 = r3
            goto L5f
        L5e:
            r0 = r2
        L5f:
            if (r0 != 0) goto L63
            r0 = r3
            goto L64
        L63:
            r0 = r2
        L64:
            if (r0 == 0) goto L67
            goto L71
        L67:
            java.lang.Class r9 = r9.getType()
            boolean r9 = com.google.gson.internal.Excluder.OooO0Oo(r9)
            if (r9 == 0) goto L73
        L71:
            r9 = r3
            goto L95
        L73:
            if (r10 == 0) goto L78
            java.util.List r9 = r1.f3768OooO0Oo
            goto L7a
        L78:
            java.util.List r9 = r1.f3769OooO0o0
        L7a:
            boolean r10 = r9.isEmpty()
            if (r10 != 0) goto L94
            java.util.Iterator r9 = r9.iterator()
            boolean r10 = r9.hasNext()
            if (r10 != 0) goto L8b
            goto L94
        L8b:
            java.lang.Object r9 = r9.next()
            OooO0O0.OooO00o.OooO0oO(r9)
            r9 = 0
            throw r9
        L94:
            r9 = r2
        L95:
            if (r9 != 0) goto L98
            r2 = r3
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.OooO0Oo(java.lang.reflect.Field, boolean):boolean");
    }
}