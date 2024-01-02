package androidx.fragment.app;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class o00000O0 {

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final OooOO0.OooOOOO f2824OooO0O0 = new OooOO0.OooOOOO();

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o0000oo f2825OooO00o;

    public o00000O0(o0000oo o0000ooVar) {
        this.f2825OooO00o = o0000ooVar;
    }

    public static Class OooO0O0(ClassLoader classLoader, String str) {
        OooOO0.OooOOOO oooOOOO = f2824OooO0O0;
        OooOO0.OooOOOO oooOOOO2 = (OooOO0.OooOOOO) oooOOOO.getOrDefault(classLoader, null);
        if (oooOOOO2 == null) {
            oooOOOO2 = new OooOO0.OooOOOO();
            oooOOOO.put(classLoader, oooOOOO2);
        }
        Class cls = (Class) oooOOOO2.getOrDefault(str, null);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            oooOOOO2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    public static Class OooO0OO(ClassLoader classLoader, String str) {
        try {
            return OooO0O0(classLoader, str);
        } catch (ClassCastException e) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e);
        } catch (ClassNotFoundException e2) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": make sure class name exists"), e2);
        }
    }

    public final o00Oo0 OooO00o(String str) {
        Context context = this.f2825OooO00o.f2877OooOOOo.f2994OoooOO0;
        Object obj = o00Oo0.f2949OoooO0;
        try {
            return (o00Oo0) OooO0OO(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
        } catch (InstantiationException e2) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (NoSuchMethodException e3) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3);
        } catch (InvocationTargetException e4) {
            throw new o00O0O(OooO0O0.OooO00o.OooO0Oo("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4);
        }
    }
}