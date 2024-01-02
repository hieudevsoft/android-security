package com.google.gson;

import OooooOo.oO00OO0O;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.NumberTypeAdapter;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class OooOOOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final ThreadLocal f3755OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final ConcurrentHashMap f3756OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final oO00OO0O f3757OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final JsonAdapterAnnotationTypeAdapterFactory f3758OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f3759OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final List f3760OooO0o0;

    public OooOOOO() {
        Excluder excluder = Excluder.f3764OooO0o;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.f3755OooO00o = new ThreadLocal();
        this.f3756OooO0O0 = new ConcurrentHashMap();
        oO00OO0O oo00oo0o = new oO00OO0O(emptyMap, emptyList2);
        this.f3757OooO0OO = oo00oo0o;
        this.f3759OooO0o = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.google.gson.internal.bind.OooO.f3872OooOoOO);
        arrayList.add(ObjectTypeAdapter.f3843OooO0OO);
        arrayList.add(excluder);
        arrayList.addAll(emptyList);
        arrayList.add(com.google.gson.internal.bind.OooO.f3861OooOOOo);
        arrayList.add(com.google.gson.internal.bind.OooO.f3854OooO0oO);
        arrayList.add(com.google.gson.internal.bind.OooO.f3851OooO0Oo);
        arrayList.add(com.google.gson.internal.bind.OooO.f3853OooO0o0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3852OooO0o);
        final o0OOO0o o0ooo0o = com.google.gson.internal.bind.OooO.f3857OooOO0O;
        arrayList.add(com.google.gson.internal.bind.OooO.OooO0O0(Long.TYPE, Long.class, o0ooo0o));
        arrayList.add(com.google.gson.internal.bind.OooO.OooO0O0(Double.TYPE, Double.class, new Gson$1()));
        arrayList.add(com.google.gson.internal.bind.OooO.OooO0O0(Float.TYPE, Float.class, new Gson$2()));
        arrayList.add(NumberTypeAdapter.f3840OooO0O0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3855OooO0oo);
        arrayList.add(com.google.gson.internal.bind.OooO.f3847OooO);
        arrayList.add(com.google.gson.internal.bind.OooO.OooO00o(AtomicLong.class, new TypeAdapter$1(new o0OOO0o() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
                return new AtomicLong(((Number) o0OOO0o.this.OooO0O0(oooOOO0)).longValue());
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
                o0OOO0o.this.OooO0OO(oooOOO, Long.valueOf(((AtomicLong) obj).get()));
            }
        })));
        arrayList.add(com.google.gson.internal.bind.OooO.OooO00o(AtomicLongArray.class, new TypeAdapter$1(new o0OOO0o() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.o0OOO0o
            public final Object OooO0O0(o0000Ooo.OooOOO0 oooOOO0) {
                ArrayList arrayList2 = new ArrayList();
                oooOOO0.OooOo();
                while (oooOOO0.Oooo000()) {
                    arrayList2.add(Long.valueOf(((Number) o0OOO0o.this.OooO0O0(oooOOO0)).longValue()));
                }
                oooOOO0.OooOoo0();
                int size = arrayList2.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i = 0; i < size; i++) {
                    atomicLongArray.set(i, ((Long) arrayList2.get(i)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.o0OOO0o
            public final void OooO0OO(o0000Ooo.OooOOO oooOOO, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                oooOOO.OooOoO0();
                int length = atomicLongArray.length();
                for (int i = 0; i < length; i++) {
                    o0OOO0o.this.OooO0OO(oooOOO, Long.valueOf(atomicLongArray.get(i)));
                }
                oooOOO.OooOoo0();
            }
        })));
        arrayList.add(com.google.gson.internal.bind.OooO.f3856OooOO0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3858OooOO0o);
        arrayList.add(com.google.gson.internal.bind.OooO.f3863OooOOo0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3862OooOOo);
        arrayList.add(com.google.gson.internal.bind.OooO.OooO00o(BigDecimal.class, com.google.gson.internal.bind.OooO.OooOOO0));
        arrayList.add(com.google.gson.internal.bind.OooO.OooO00o(BigInteger.class, com.google.gson.internal.bind.OooO.f3859OooOOO));
        arrayList.add(com.google.gson.internal.bind.OooO.OooO00o(com.google.gson.internal.OooOOO.class, com.google.gson.internal.bind.OooO.f3860OooOOOO));
        arrayList.add(com.google.gson.internal.bind.OooO.f3864OooOOoo);
        arrayList.add(com.google.gson.internal.bind.OooO.f3867OooOo00);
        arrayList.add(com.google.gson.internal.bind.OooO.f3868OooOo0O);
        arrayList.add(com.google.gson.internal.bind.OooO.f3869OooOo0o);
        arrayList.add(com.google.gson.internal.bind.OooO.f3871OooOoO0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3866OooOo0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3849OooO0O0);
        arrayList.add(DateTypeAdapter.f3831OooO0O0);
        arrayList.add(com.google.gson.internal.bind.OooO.f3865OooOo);
        if (com.google.gson.internal.sql.OooO0O0.f3928OooO00o) {
            arrayList.add(com.google.gson.internal.sql.OooO0O0.f3930OooO0OO);
            arrayList.add(com.google.gson.internal.sql.OooO0O0.f3929OooO0O0);
            arrayList.add(com.google.gson.internal.sql.OooO0O0.f3931OooO0Oo);
        }
        arrayList.add(ArrayTypeAdapter.f3825OooO0OO);
        arrayList.add(com.google.gson.internal.bind.OooO.f3848OooO00o);
        arrayList.add(new CollectionTypeAdapterFactory(oo00oo0o));
        arrayList.add(new MapTypeAdapterFactory(oo00oo0o));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(oo00oo0o);
        this.f3758OooO0Oo = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.OooO.f3873OooOoo0);
        arrayList.add(new ReflectiveTypeAdapterFactory(oo00oo0o, excluder, jsonAdapterAnnotationTypeAdapterFactory, emptyList2));
        this.f3760OooO0o0 = Collections.unmodifiableList(arrayList);
    }

    public static void OooO00o(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            throw new IllegalArgumentException(d + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object OooO0O0(java.lang.Class r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.OooOOOO.OooO0O0(java.lang.Class, java.lang.String):java.lang.Object");
    }

    public final o0OOO0o OooO0OO(o00000o0.o00oO0o o00oo0o) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = this.f3756OooO0O0;
        o0OOO0o o0ooo0o = (o0OOO0o) concurrentHashMap.get(o00oo0o);
        if (o0ooo0o != null) {
            return o0ooo0o;
        }
        ThreadLocal threadLocal = this.f3755OooO00o;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z = true;
        } else {
            o0OOO0o o0ooo0o2 = (o0OOO0o) map.get(o00oo0o);
            if (o0ooo0o2 != null) {
                return o0ooo0o2;
            }
            z = false;
        }
        try {
            Gson$FutureTypeAdapter gson$FutureTypeAdapter = new Gson$FutureTypeAdapter();
            map.put(o00oo0o, gson$FutureTypeAdapter);
            Iterator it = this.f3760OooO0o0.iterator();
            o0OOO0o o0ooo0o3 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o0ooo0o3 = ((o0Oo0oo) it.next()).OooO00o(this, o00oo0o);
                if (o0ooo0o3 != null) {
                    if (gson$FutureTypeAdapter.f3752OooO00o == null) {
                        gson$FutureTypeAdapter.f3752OooO00o = o0ooo0o3;
                        map.put(o00oo0o, o0ooo0o3);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (o0ooo0o3 != null) {
                if (z) {
                    concurrentHashMap.putAll(map);
                }
                return o0ooo0o3;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + o00oo0o);
        } finally {
            if (z) {
                threadLocal.remove();
            }
        }
    }

    public final o0OOO0o OooO0Oo(o0Oo0oo o0oo0oo, o00000o0.o00oO0o o00oo0o) {
        List<o0Oo0oo> list = this.f3760OooO0o0;
        if (!list.contains(o0oo0oo)) {
            o0oo0oo = this.f3758OooO0Oo;
        }
        boolean z = false;
        for (o0Oo0oo o0oo0oo2 : list) {
            if (z) {
                o0OOO0o OooO00o2 = o0oo0oo2.OooO00o(this, o00oo0o);
                if (OooO00o2 != null) {
                    return OooO00o2;
                }
            } else if (o0oo0oo2 == o0oo0oo) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + o00oo0o);
    }

    public final String OooO0o(Object obj) {
        Class cls = obj.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            OooO0oO(obj, cls, OooO0o0(stringWriter));
            return stringWriter.toString();
        } catch (IOException e) {
            throw new Oooo000(e);
        }
    }

    public final o0000Ooo.OooOOO OooO0o0(Writer writer) {
        o0000Ooo.OooOOO oooOOO = new o0000Ooo.OooOOO(writer);
        oooOOO.f4417OooO0o = this.f3759OooO0o;
        oooOOO.f4418OooO0o0 = false;
        oooOOO.f4420OooO0oo = false;
        return oooOOO;
    }

    public final void OooO0oO(Object obj, Class cls, o0000Ooo.OooOOO oooOOO) {
        o0OOO0o OooO0OO2 = OooO0OO(new o00000o0.o00oO0o(cls));
        boolean z = oooOOO.f4418OooO0o0;
        oooOOO.f4418OooO0o0 = true;
        boolean z2 = oooOOO.f4417OooO0o;
        oooOOO.f4417OooO0o = this.f3759OooO0o;
        boolean z3 = oooOOO.f4420OooO0oo;
        oooOOO.f4420OooO0oo = false;
        try {
            try {
                try {
                    OooO0OO2.OooO0OO(oooOOO, obj);
                } catch (AssertionError e) {
                    throw new AssertionError("AssertionError (GSON 2.10.1): " + e.getMessage(), e);
                }
            } catch (IOException e2) {
                throw new Oooo000(e2);
            }
        } finally {
            oooOOO.f4418OooO0o0 = z;
            oooOOO.f4417OooO0o = z2;
            oooOOO.f4420OooO0oo = z3;
        }
    }

    public final String toString() {
        return "{serializeNulls:false,factories:" + this.f3760OooO0o0 + ",instanceCreators:" + this.f3757OooO0OO + "}";
    }
}