package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class OooO0OO {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final OooO0OO f3052OooO0OO = new OooO0OO();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final HashMap f3053OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final HashMap f3054OooO0O0 = new HashMap();

    public static void OooO0OO(HashMap hashMap, OooO0O0 oooO0O0, OooOo oooOo, Class cls) {
        OooOo oooOo2 = (OooOo) hashMap.get(oooO0O0);
        if (oooOo2 == null || oooOo == oooOo2) {
            if (oooOo2 == null) {
                hashMap.put(oooO0O0, oooOo);
                return;
            }
            return;
        }
        Method method = oooO0O0.f3051OooO0O0;
        throw new IllegalArgumentException("Method " + method.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + oooOo2 + ", new value " + oooOo);
    }

    public final OooO00o OooO00o(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(OooO0O0(superclass).f3049OooO0O0);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : OooO0O0(cls2).f3049OooO0O0.entrySet()) {
                OooO0OO(hashMap, (OooO0O0) entry.getKey(), (OooOo) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            oo0o0Oo oo0o0oo = (oo0o0Oo) method.getAnnotation(oo0o0Oo.class);
            if (oo0o0oo != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length > 0) {
                    if (o00Ooo.class.isAssignableFrom(parameterTypes[0])) {
                        i = 1;
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                } else {
                    i = 0;
                }
                OooOo value = oo0o0oo.value();
                if (parameterTypes.length > 1) {
                    if (OooOo.class.isAssignableFrom(parameterTypes[1])) {
                        if (value == OooOo.ON_ANY) {
                            i = 2;
                        } else {
                            throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                        }
                    } else {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                }
                if (parameterTypes.length <= 2) {
                    OooO0OO(hashMap, new OooO0O0(i, method), value, cls);
                    z = true;
                } else {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
            }
        }
        OooO00o oooO00o = new OooO00o(hashMap);
        this.f3053OooO00o.put(cls, oooO00o);
        this.f3054OooO0O0.put(cls, Boolean.valueOf(z));
        return oooO00o;
    }

    public final OooO00o OooO0O0(Class cls) {
        OooO00o oooO00o = (OooO00o) this.f3053OooO00o.get(cls);
        return oooO00o != null ? oooO00o : OooO00o(cls, null);
    }
}