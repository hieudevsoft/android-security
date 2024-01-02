package OooOo;

import OooOo0o.o0O0O00;
import OooOo0o.oo0o0Oo;
import OooOoo0.o0000;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class OooOOOO extends OooOOO0 {

    /* renamed from: OooO  reason: collision with root package name */
    public final Constructor f1127OooO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final Class f1128OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Method f1129OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final Method f1130OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final Method f1131OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public final Method f1132OooOOO;
    public final Method OooOOO0;

    public OooOOOO() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = Oooo00O(cls);
            method3 = Oooo00o(cls);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = Oooo0(cls);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f1128OooO0oo = cls;
        this.f1127OooO = constructor;
        this.f1129OooOO0 = method2;
        this.f1130OooOO0O = method3;
        this.f1131OooOO0o = method4;
        this.OooOOO0 = method;
        this.f1132OooOOO = method5;
    }

    public static Method Oooo00O(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public static Method Oooo00o(Class cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    @Override // OooOo.OooOOO0, OooO0Oo.o0000OO0
    public final Typeface OooOOo(Context context, oo0o0Oo oo0o0oo, Resources resources, int i) {
        boolean z;
        Object obj;
        o0O0O00[] o0o0o00Arr;
        if (this.f1129OooOO0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.OooOOo(context, oo0o0oo, resources, i);
        }
        try {
            obj = this.f1127OooO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (o0O0O00 o0o0o00 : oo0o0oo.f1200OooO00o) {
            if (!OooOooO(context, obj, o0o0o00.f1190OooO00o, o0o0o00.f1195OooO0o0, o0o0o00.f1191OooO0O0, o0o0o00.f1192OooO0OO ? 1 : 0, FontVariationAxis.fromFontVariationSettings(o0o0o00.f1193OooO0Oo))) {
                try {
                    this.OooOOO0.invoke(obj, new Object[0]);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
                return null;
            }
        }
        if (!Oooo000(obj)) {
            return null;
        }
        return OooOooo(obj);
    }

    @Override // OooOo.OooOOO0, OooO0Oo.o0000OO0
    public final Typeface OooOOoo(Context context, o0000[] o0000VarArr, int i) {
        boolean z;
        Object obj;
        Typeface OooOooo2;
        boolean z2;
        if (o0000VarArr.length < 1) {
            return null;
        }
        if (this.f1129OooOO0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            o0000 OooOo0o2 = OooOo0o(i, o0000VarArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(OooOo0o2.f1238OooO00o, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(OooOo0o2.f1240OooO0OO).setItalic(OooOo0o2.f1241OooO0Oo).build();
                openFileDescriptor.close();
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (o0000 o0000Var : o0000VarArr) {
            if (o0000Var.f1242OooO0o0 == 0) {
                Uri uri = o0000Var.f1238OooO00o;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, o0000O00.OooO00o.o0000oOo(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        try {
            obj = this.f1127OooO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused2) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        int length = o0000VarArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            Method method = this.OooOOO0;
            if (i2 < length) {
                o0000 o0000Var2 = o0000VarArr[i2];
                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(o0000Var2.f1238OooO00o);
                if (byteBuffer != null) {
                    try {
                        z2 = ((Boolean) this.f1130OooOO0O.invoke(obj, byteBuffer, Integer.valueOf(o0000Var2.f1239OooO0O0), null, Integer.valueOf(o0000Var2.f1240OooO0OO), Integer.valueOf(o0000Var2.f1241OooO0Oo ? 1 : 0))).booleanValue();
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                        z2 = false;
                    }
                    if (!z2) {
                        try {
                            method.invoke(obj, new Object[0]);
                            return null;
                        } catch (IllegalAccessException | InvocationTargetException unused4) {
                            return null;
                        }
                    }
                    z3 = true;
                }
                i2++;
                z3 = z3;
            } else if (!z3) {
                try {
                    method.invoke(obj, new Object[0]);
                    return null;
                } catch (IllegalAccessException | InvocationTargetException unused5) {
                    return null;
                }
            } else if (!Oooo000(obj) || (OooOooo2 = OooOooo(obj)) == null) {
                return null;
            } else {
                return Typeface.create(OooOooo2, i);
            }
        }
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOo0(Context context, Resources resources, int i, String str, int i2) {
        boolean z;
        Object obj;
        if (this.f1129OooOO0 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.OooOo0(context, resources, i, str, i2);
        }
        try {
            obj = this.f1127OooO.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        if (!OooOooO(context, obj, str, 0, -1, -1, null)) {
            try {
                this.OooOOO0.invoke(obj, new Object[0]);
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
            return null;
        } else if (!Oooo000(obj)) {
            return null;
        } else {
            return OooOooo(obj);
        }
    }

    public final boolean OooOooO(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f1129OooOO0.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface OooOooo(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1128OooO0oo, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1132OooOOO.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method Oooo0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public final boolean Oooo000(Object obj) {
        try {
            return ((Boolean) this.f1131OooOO0o.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}