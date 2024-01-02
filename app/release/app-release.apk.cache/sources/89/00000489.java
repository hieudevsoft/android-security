package com.google.gson.internal.bind;

import OooooOo.oO00OO0O;
import com.google.gson.OooOOOO;
import com.google.gson.OooOo;
import com.google.gson.OooOo00;
import com.google.gson.Oooo0;
import com.google.gson.Oooo000;
import com.google.gson.internal.o000oOoO;
import com.google.gson.o0OOO0o;
import com.google.gson.o0Oo0oo;
import com.google.gson.o0OoOo0;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
import java.util.Properties;
import o00000o0.o00oO0o;
import o0000Ooo.OooOOO;
import o0000Ooo.OooOOO0;

/* loaded from: classes.dex */
public final class MapTypeAdapterFactory implements o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oO00OO0O f3834OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f3835OooO0O0 = false;

    /* loaded from: classes.dex */
    public final class Adapter<K, V> extends o0OOO0o {

        /* renamed from: OooO00o  reason: collision with root package name */
        public final o0OOO0o f3836OooO00o;

        /* renamed from: OooO0O0  reason: collision with root package name */
        public final o0OOO0o f3837OooO0O0;

        /* renamed from: OooO0OO  reason: collision with root package name */
        public final o000oOoO f3838OooO0OO;

        public Adapter(OooOOOO oooOOOO, Type type, o0OOO0o o0ooo0o, Type type2, o0OOO0o o0ooo0o2, o000oOoO o000oooo) {
            this.f3836OooO00o = new TypeAdapterRuntimeTypeWrapper(oooOOOO, o0ooo0o, type);
            this.f3837OooO0O0 = new TypeAdapterRuntimeTypeWrapper(oooOOOO, o0ooo0o2, type2);
            this.f3838OooO0OO = o000oooo;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.o0OOO0o
        public final Object OooO0O0(OooOOO0 oooOOO0) {
            int i;
            int OoooO0O2 = oooOOO0.OoooO0O();
            if (OoooO0O2 == 9) {
                oooOOO0.Oooo0oo();
                return null;
            }
            Map map = (Map) this.f3838OooO0OO.OooO0O0();
            o0OOO0o o0ooo0o = this.f3837OooO0O0;
            o0OOO0o o0ooo0o2 = this.f3836OooO00o;
            if (OoooO0O2 == 1) {
                oooOOO0.OooOo();
                while (oooOOO0.Oooo000()) {
                    oooOOO0.OooOo();
                    Object OooO0O02 = o0ooo0o2.OooO0O0(oooOOO0);
                    if (map.put(OooO0O02, o0ooo0o.OooO0O0(oooOOO0)) == null) {
                        oooOOO0.OooOoo0();
                    } else {
                        throw new Oooo000("duplicate key: " + OooO0O02);
                    }
                }
                oooOOO0.OooOoo0();
            } else {
                oooOOO0.OooOoO0();
                while (oooOOO0.Oooo000()) {
                    o0ooOO0.OooOOO0.f5490OooO0o0.getClass();
                    int i2 = oooOOO0.f4429OooO0oo;
                    if (i2 == 0) {
                        i2 = oooOOO0.OooOoOO();
                    }
                    if (i2 == 13) {
                        oooOOO0.f4429OooO0oo = 9;
                    } else {
                        if (i2 == 12) {
                            i = 8;
                        } else if (i2 == 14) {
                            i = 10;
                        } else {
                            throw new IllegalStateException("Expected a name but was " + OooO0O0.OooO00o.OooOO0(oooOOO0.OoooO0O()) + oooOOO0.Oooo00o());
                        }
                        oooOOO0.f4429OooO0oo = i;
                    }
                    Object OooO0O03 = o0ooo0o2.OooO0O0(oooOOO0);
                    if (map.put(OooO0O03, o0ooo0o.OooO0O0(oooOOO0)) != null) {
                        throw new Oooo000("duplicate key: " + OooO0O03);
                    }
                }
                oooOOO0.OooOoo();
            }
            return map;
        }

        @Override // com.google.gson.o0OOO0o
        public final void OooO0OO(OooOOO oooOOO, Object obj) {
            String str;
            boolean parseBoolean;
            boolean z;
            Map map = (Map) obj;
            if (map == null) {
                oooOOO.Oooo000();
                return;
            }
            boolean z2 = MapTypeAdapterFactory.this.f3835OooO0O0;
            o0OOO0o o0ooo0o = this.f3837OooO0O0;
            if (!z2) {
                oooOOO.OooOoO();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    oooOOO.OooOooO(String.valueOf(entry.getKey()));
                    o0ooo0o.OooO0OO(oooOOO, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z3 = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    o0OOO0o o0ooo0o2 = this.f3836OooO00o;
                    K key = entry2.getKey();
                    o0ooo0o2.getClass();
                    try {
                        OooO0O0 oooO0O0 = new OooO0O0();
                        o0ooo0o2.OooO0OO(oooO0O0, key);
                        ArrayList arrayList3 = oooO0O0.f3876OooOO0o;
                        if (arrayList3.isEmpty()) {
                            OooOo oooOo = oooO0O0.f3877OooOOO;
                            arrayList.add(oooOo);
                            arrayList2.add(entry2.getValue());
                            oooOo.getClass();
                            if (!(oooOo instanceof OooOo00) && !(oooOo instanceof com.google.gson.o000oOoO)) {
                                z = false;
                            } else {
                                z = true;
                            }
                            z3 |= z;
                        } else {
                            throw new IllegalStateException("Expected one JSON element but was " + arrayList3);
                        }
                    } catch (IOException e) {
                        throw new Oooo000(e);
                    }
                }
                if (z3) {
                    oooOOO.OooOoO0();
                    int size = arrayList.size();
                    while (i < size) {
                        oooOOO.OooOoO0();
                        OooO.f3870OooOoO.OooO0OO(oooOOO, (OooOo) arrayList.get(i));
                        o0ooo0o.OooO0OO(oooOOO, arrayList2.get(i));
                        oooOOO.OooOoo0();
                        i++;
                    }
                    oooOOO.OooOoo0();
                    return;
                }
                oooOOO.OooOoO();
                int size2 = arrayList.size();
                while (i < size2) {
                    OooOo oooOo2 = (OooOo) arrayList.get(i);
                    oooOo2.getClass();
                    boolean z4 = oooOo2 instanceof o0OoOo0;
                    if (z4) {
                        if (z4) {
                            o0OoOo0 o0oooo0 = (o0OoOo0) oooOo2;
                            Serializable serializable = o0oooo0.f3942OooO00o;
                            if (serializable instanceof Number) {
                                str = String.valueOf(o0oooo0.OooO0o());
                            } else if (serializable instanceof Boolean) {
                                if (serializable instanceof Boolean) {
                                    parseBoolean = ((Boolean) serializable).booleanValue();
                                } else {
                                    parseBoolean = Boolean.parseBoolean(o0oooo0.OooO0oO());
                                }
                                str = Boolean.toString(parseBoolean);
                            } else if (serializable instanceof String) {
                                str = o0oooo0.OooO0oO();
                            } else {
                                throw new AssertionError();
                            }
                        } else {
                            throw new IllegalStateException("Not a JSON Primitive: " + oooOo2);
                        }
                    } else if (oooOo2 instanceof Oooo0) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    oooOOO.OooOooO(str);
                    o0ooo0o.OooO0OO(oooOOO, arrayList2.get(i));
                    i++;
                }
            }
            oooOOO.OooOoo();
        }
    }

    public MapTypeAdapterFactory(oO00OO0O oo00oo0o) {
        this.f3834OooO00o = oo00oo0o;
    }

    @Override // com.google.gson.o0Oo0oo
    public final o0OOO0o OooO00o(OooOOOO oooOOOO, o00oO0o o00oo0o) {
        Type[] actualTypeArguments;
        o0OOO0o o0ooo0o;
        Type type = o00oo0o.f4066OooO0O0;
        Class cls = o00oo0o.f4065OooO00o;
        if (!Map.class.isAssignableFrom(cls)) {
            return null;
        }
        if (type == Properties.class) {
            actualTypeArguments = new Type[]{String.class, String.class};
        } else {
            Type OooOOO0 = com.google.gson.internal.OooO0o.OooOOO0(type, cls, Map.class);
            actualTypeArguments = OooOOO0 instanceof ParameterizedType ? ((ParameterizedType) OooOOO0).getActualTypeArguments() : new Type[]{Object.class, Object.class};
        }
        Type type2 = actualTypeArguments[0];
        if (type2 != Boolean.TYPE && type2 != Boolean.class) {
            o0ooo0o = oooOOOO.OooO0OO(new o00oO0o(type2));
        } else {
            o0ooo0o = OooO.f3850OooO0OO;
        }
        return new Adapter(oooOOOO, actualTypeArguments[0], o0ooo0o, actualTypeArguments[1], oooOOOO.OooO0OO(new o00oO0o(actualTypeArguments[1])), this.f3834OooO00o.OooO0O0(o00oo0o));
    }
}