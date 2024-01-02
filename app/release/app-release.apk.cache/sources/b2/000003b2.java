package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public abstract class o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final HashMap f3113OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final HashMap f3114OooO0O0 = new HashMap();

    public static void OooO00o(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            o0000O00.OooO00o.OooOoOO(newInstance, "{\n            constructo…tance(`object`)\n        }");
            OooO0O0.OooO00o.OooO0oo(newInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int OooO0O0(Class cls) {
        Constructor constructor;
        boolean z;
        boolean z2;
        List list;
        boolean z3;
        String str;
        boolean z4;
        boolean z5;
        HashMap hashMap = f3113OooO00o;
        Integer num = (Integer) hashMap.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r4 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                if (r4 != null) {
                    str = r4.getName();
                } else {
                    str = "";
                }
                o0000O00.OooO00o.OooOoOO(str, "fullPackage");
                if (str.length() == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    o0000O00.OooO00o.OooOoOO(canonicalName, "name");
                    canonicalName = canonicalName.substring(str.length() + 1);
                    o0000O00.OooO00o.OooOoOO(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                o0000O00.OooO00o.OooOoOO(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String concat = o0000Oo0.OooOOOO.o00oOOo(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (str.length() == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5) {
                    concat = str + '.' + concat;
                }
                constructor = Class.forName(concat).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap hashMap2 = f3114OooO0O0;
            if (constructor != null) {
                list = o0000O00.OooO00o.o0000Oo(constructor);
            } else {
                OooO0OO oooO0OO = OooO0OO.f3052OooO0OO;
                HashMap hashMap3 = oooO0OO.f3054OooO0O0;
                Boolean bool = (Boolean) hashMap3.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (((oo0o0Oo) declaredMethods[i2].getAnnotation(oo0o0Oo.class)) != null) {
                                    oooO0OO.OooO00o(cls, declaredMethods);
                                    z = true;
                                    break;
                                }
                                i2++;
                            } else {
                                hashMap3.put(cls, Boolean.FALSE);
                                z = false;
                                break;
                            }
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!z) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && o00Oo0.class.isAssignableFrom(superclass)) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        o0000O00.OooO00o.OooOoOO(superclass, "superclass");
                        if (OooO0O0(superclass) != 1) {
                            Object obj = hashMap2.get(superclass);
                            o0000O00.OooO00o.OooOo(obj);
                            arrayList = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    o0000O00.OooO00o.OooOoOO(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && o00Oo0.class.isAssignableFrom(cls2)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                o0000O00.OooO00o.OooOoOO(cls2, "intrface");
                                if (OooO0O0(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj2 = hashMap2.get(cls2);
                                o0000O00.OooO00o.OooOo(obj2);
                                arrayList.addAll((Collection) obj2);
                            }
                            i3++;
                        } else if (arrayList != null) {
                            list = arrayList;
                        }
                    }
                }
            }
            hashMap2.put(cls, list);
            i = 2;
        }
        hashMap.put(cls, Integer.valueOf(i));
        return i;
    }
}