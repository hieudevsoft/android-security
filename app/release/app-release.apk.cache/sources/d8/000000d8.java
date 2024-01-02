package OooOo;

import OooO0Oo.o0000OO0;
import OooOo0o.o0O0O00;
import OooOo0o.oo0o0Oo;
import OooOoo0.o0000;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class OooOOO0 extends o0000OO0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static Class f1122OooO0OO = null;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static Constructor f1123OooO0Oo = null;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static Method f1124OooO0o = null;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static Method f1125OooO0o0 = null;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static boolean f1126OooO0oO = false;

    public OooOOO0() {
        super(9);
    }

    public static void OooOoo() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (f1126OooO0oO) {
            return;
        }
        f1126OooO0oO = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1123OooO0Oo = constructor;
        f1122OooO0OO = cls;
        f1125OooO0o0 = method2;
        f1124OooO0o = method;
    }

    public static boolean OooOoo0(int i, Object obj, String str, boolean z) {
        OooOoo();
        try {
            return ((Boolean) f1125OooO0o0.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // OooO0Oo.o0000OO0
    public Typeface OooOOo(Context context, oo0o0Oo oo0o0oo, Resources resources, int i) {
        o0O0O00[] o0o0o00Arr;
        OooOoo();
        try {
            Object newInstance = f1123OooO0Oo.newInstance(new Object[0]);
            for (o0O0O00 o0o0o00 : oo0o0oo.f1200OooO00o) {
                File o00000OO2 = o0000O00.OooO00o.o00000OO(context);
                if (o00000OO2 == null) {
                    return null;
                }
                try {
                    if (!o0000O00.OooO00o.OoooO0O(o00000OO2, resources, o0o0o00.f1194OooO0o)) {
                        return null;
                    }
                    if (!OooOoo0(o0o0o00.f1191OooO0O0, newInstance, o00000OO2.getPath(), o0o0o00.f1192OooO0OO)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    o00000OO2.delete();
                }
            }
            OooOoo();
            try {
                Object newInstance2 = Array.newInstance(f1122OooO0OO, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1124OooO0o.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // OooO0Oo.o0000OO0
    public Typeface OooOOoo(Context context, o0000[] o0000VarArr, int i) {
        File file;
        String readlink;
        if (o0000VarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(OooOo0o(i, o0000VarArr).f1238OooO00o, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
            } catch (ErrnoException unused) {
            }
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                file = new File(readlink);
                if (file != null && file.canRead()) {
                    Typeface createFromFile = Typeface.createFromFile(file);
                    openFileDescriptor.close();
                    return createFromFile;
                }
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface OooOo002 = OooOo00(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return OooOo002;
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface OooOo0022 = OooOo00(context, fileInputStream2);
            fileInputStream2.close();
            openFileDescriptor.close();
            return OooOo0022;
        } catch (IOException unused2) {
            return null;
        }
    }
}