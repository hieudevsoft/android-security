package o00000Oo;

import OooO0O0.OooO00o;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class OooO0OO extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Method f4060OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Method f4061OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Method f4062OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Method f4063OooO0Oo;

    public OooO0OO() {
        super((OooO00o) null);
        this.f4060OooO00o = Class.class.getMethod("isRecord", new Class[0]);
        Method method = Class.class.getMethod("getRecordComponents", new Class[0]);
        this.f4061OooO0O0 = method;
        Class<?> componentType = method.getReturnType().getComponentType();
        this.f4062OooO0OO = componentType.getMethod("getName", new Class[0]);
        this.f4063OooO0Oo = componentType.getMethod("getType", new Class[0]);
    }

    @Override // OooO0O0.OooO0O0
    public final String[] OooO(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f4061OooO0O0.invoke(cls, new Object[0]);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) this.f4062OooO0OO.invoke(objArr[i], new Object[0]);
            }
            return strArr;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // OooO0O0.OooO0O0
    public final Method OooO0o(Class cls, Field field) {
        try {
            return cls.getMethod(field.getName(), new Class[0]);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // OooO0O0.OooO0O0
    public final Constructor OooO0oO(Class cls) {
        try {
            Object[] objArr = (Object[]) this.f4061OooO0O0.invoke(cls, new Object[0]);
            Class<?>[] clsArr = new Class[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = (Class) this.f4063OooO0Oo.invoke(objArr[i], new Object[0]);
            }
            return cls.getDeclaredConstructor(clsArr);
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }

    @Override // OooO0O0.OooO0O0
    public final boolean OooOO0(Class cls) {
        try {
            return ((Boolean) this.f4060OooO00o.invoke(cls, new Object[0])).booleanValue();
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Unexpected ReflectiveOperationException occurred (Gson 2.10.1). To support Java records, reflection is utilized to read out information about records. All these invocations happens after it is established that records exist in the JVM. This exception is unexpected behavior.", e);
        }
    }
}