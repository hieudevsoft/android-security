package o000OO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o0000O0O.OooOo;
import o0000O0O.OooOo00;
import o0000O0O.Oooo0;
import o0000O0O.Oooo000;
import o0000O0O.o000oOoO;
import o0000O0O.o00O0O;
import o0000O0O.o00Oo0;
import o0000O0O.o00Ooo;
import o0000O0O.o00oO0o;
import o0000O0O.o0OOO0o;
import o0000O0O.o0OoOo0;
import o0000O0O.o0ooOOo;
import o0000O0O.oo000o;

/* loaded from: classes.dex */
public final class OooO0O0 implements o0000OOO.OooO00o, OooO00o {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Map f4863OooO0O0;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Class f4864OooO00o;

    static {
        int i = 0;
        List asList = Arrays.asList(o0000O0O.OooO00o.class, OooOo.class, o0OoOo0.class, o00O0O.class, o00Oo0.class, o00Ooo.class, oo000o.class, o00oO0o.class, o0ooOOo.class, o0OOO0o.class, o0000O0O.OooO0O0.class, o0000O0O.OooO0OO.class, o0000O0O.OooO0o.class, o0000O0O.OooO.class, o0000O0O.OooOO0.class, o0000O0O.OooOO0O.class, o0000O0O.OooOOO0.class, o0000O0O.OooOOO.class, o0000O0O.OooOOOO.class, OooOo00.class, Oooo000.class, Oooo0.class, o000oOoO.class);
        o0000O00.OooO00o.OooOoOO(asList, "asList(this)");
        ArrayList arrayList = new ArrayList(o0000.OooOOOO.o00O0O0o(asList));
        for (Object obj : asList) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new o00000oo.o00O0O((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        f4863OooO0O0 = o0000.OooOOOO.o00O0Oo0(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        o0000O00.OooO00o.OooOoOO(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            o0000O00.OooO00o.OooOoOO(str, "kotlinName");
            sb.append(o0000Oo0.OooOOOO.o00O0oOO(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f4863OooO0O0.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o0000O00.OooO00o.o0000o0o(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), o0000Oo0.OooOOOO.o00O0oOO((String) entry2.getValue()));
        }
    }

    public OooO0O0(Class cls) {
        o0000O00.OooO00o.OooOoo0(cls, "jClass");
        this.f4864OooO00o = cls;
    }

    @Override // o000OO.OooO00o
    public final Class OooO00o() {
        return this.f4864OooO00o;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof OooO0O0) && o0000O00.OooO00o.OooOOO0(o0000O00.OooO00o.oo0o0Oo(this), o0000O00.OooO00o.oo0o0Oo((o0000OOO.OooO00o) obj));
    }

    public final int hashCode() {
        return o0000O00.OooO00o.oo0o0Oo(this).hashCode();
    }

    public final String toString() {
        return this.f4864OooO00o.toString() + " (Kotlin reflection is not available)";
    }
}