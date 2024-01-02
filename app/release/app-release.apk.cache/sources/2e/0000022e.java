package Ooooo0o;

import OooOO0.OooO0O0;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class o0000OO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0O0 f1783OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooO0O0 f1784OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooO0O0 f1785OooO0OO;

    public o0000OO0(OooO0O0 oooO0O0, OooO0O0 oooO0O02, OooO0O0 oooO0O03) {
        this.f1783OooO00o = oooO0O0;
        this.f1784OooO0O0 = oooO0O02;
        this.f1785OooO0OO = oooO0O03;
    }

    public abstract void OooO(int i);

    public abstract o000 OooO00o();

    public final Class OooO0O0(Class cls) {
        String name = cls.getName();
        OooO0O0 oooO0O0 = this.f1785OooO0OO;
        Class cls2 = (Class) oooO0O0.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            oooO0O0.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method OooO0OO(String str) {
        OooO0O0 oooO0O0 = this.f1783OooO00o;
        Method method = (Method) oooO0O0.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, o0000OO0.class.getClassLoader()).getDeclaredMethod("read", o0000OO0.class);
            oooO0O0.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method OooO0Oo(Class cls) {
        String name = cls.getName();
        OooO0O0 oooO0O0 = this.f1784OooO0O0;
        Method method = (Method) oooO0O0.getOrDefault(name, null);
        if (method == null) {
            Class OooO0O02 = OooO0O0(cls);
            System.currentTimeMillis();
            Method declaredMethod = OooO0O02.getDeclaredMethod("write", cls, o0000OO0.class);
            oooO0O0.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final int OooO0o(int i, int i2) {
        if (!OooO0o0(i2)) {
            return i;
        }
        return ((o000) this).f1778OooO0o0.readInt();
    }

    public abstract boolean OooO0o0(int i);

    public final Parcelable OooO0oO(Parcelable parcelable, int i) {
        if (!OooO0o0(i)) {
            return parcelable;
        }
        return ((o000) this).f1778OooO0o0.readParcelable(o000.class.getClassLoader());
    }

    public final o000O000 OooO0oo() {
        String readString = ((o000) this).f1778OooO0o0.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (o000O000) OooO0OO(readString).invoke(null, OooO00o());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public final void OooOO0(o000O000 o000o000) {
        if (o000o000 == null) {
            ((o000) this).f1778OooO0o0.writeString(null);
            return;
        }
        try {
            ((o000) this).f1778OooO0o0.writeString(OooO0O0(o000o000.getClass()).getName());
            o000 OooO00o2 = OooO00o();
            try {
                OooO0Oo(o000o000.getClass()).invoke(null, o000o000, OooO00o2);
                int i = OooO00o2.f1775OooO;
                if (i >= 0) {
                    int i2 = OooO00o2.f1776OooO0Oo.get(i);
                    Parcel parcel = OooO00o2.f1778OooO0o0;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(o000o000.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}