package OooOo;

import OooO0Oo.o0000OO0;
import OooOoo0.o0000;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public final class OooOOO extends o0000OO0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Class f1118OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final Constructor f1119OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final Method f1120OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Method f1121OooO0o0;

    static {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
        }
        f1119OooO0Oo = constructor;
        f1118OooO0OO = cls;
        f1121OooO0o0 = method2;
        f1120OooO0o = method;
    }

    public OooOOO() {
        super(9);
    }

    public static boolean OooOoo0(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1121OooO0o0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005b A[SYNTHETIC] */
    @Override // OooO0Oo.o0000OO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Typeface OooOOo(android.content.Context r18, OooOo0o.oo0o0Oo r19, android.content.res.Resources r20, int r21) {
        /*
            r17 = this;
            r1 = 0
            r2 = 0
            java.lang.reflect.Constructor r0 = OooOo.OooOOO.f1119OooO0Oo     // Catch: java.lang.Throwable -> Lc
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r0 = r0.newInstance(r3)     // Catch: java.lang.Throwable -> Lc
            r3 = r0
            goto Ld
        Lc:
            r3 = r1
        Ld:
            if (r3 != 0) goto L10
            return r1
        L10:
            r0 = r19
            OooOo0o.o0O0O00[] r4 = r0.f1200OooO00o
            int r5 = r4.length
            r6 = r2
        L16:
            if (r6 >= r5) goto L71
            r7 = r4[r6]
            int r0 = r7.f1194OooO0o
            java.io.File r8 = o0000O00.OooO00o.o00000OO(r18)
            r9 = r20
            if (r8 != 0) goto L25
            goto L2e
        L25:
            boolean r0 = o0000O00.OooO00o.OoooO0O(r8, r9, r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L30
            r8.delete()
        L2e:
            r0 = r1
            goto L59
        L30:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            r10.<init>(r8)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            java.nio.channels.FileChannel r11 = r10.getChannel()     // Catch: java.lang.Throwable -> L49
            long r15 = r11.size()     // Catch: java.lang.Throwable -> L49
            java.nio.channels.FileChannel$MapMode r12 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L49
            r13 = 0
            java.nio.MappedByteBuffer r0 = r11.map(r12, r13, r15)     // Catch: java.lang.Throwable -> L49
            r10.close()     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
            goto L56
        L49:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch: java.lang.Throwable -> L4f
            goto L54
        L4f:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L54:
            throw r11     // Catch: java.io.IOException -> L55 java.lang.Throwable -> L6c
        L55:
            r0 = r1
        L56:
            r8.delete()
        L59:
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r8 = r7.f1191OooO0O0
            boolean r10 = r7.f1192OooO0OO
            int r7 = r7.f1195OooO0o0
            boolean r0 = OooOoo0(r3, r0, r7, r8, r10)
            if (r0 != 0) goto L69
            return r1
        L69:
            int r6 = r6 + 1
            goto L16
        L6c:
            r0 = move-exception
            r8.delete()
            throw r0
        L71:
            java.lang.Class r0 = OooOo.OooOOO.f1118OooO0OO     // Catch: java.lang.Throwable -> L88
            r4 = 1
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r4)     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Array.set(r0, r2, r3)     // Catch: java.lang.Throwable -> L88
            java.lang.reflect.Method r2 = OooOo.OooOOO.f1120OooO0o     // Catch: java.lang.Throwable -> L88
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r2.invoke(r1, r0)     // Catch: java.lang.Throwable -> L88
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0     // Catch: java.lang.Throwable -> L88
            r1 = r0
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: OooOo.OooOOO.OooOOo(android.content.Context, OooOo0o.oo0o0Oo, android.content.res.Resources, int):android.graphics.Typeface");
    }

    @Override // OooO0Oo.o0000OO0
    public final Typeface OooOOoo(Context context, o0000[] o0000VarArr, int i) {
        Object obj;
        Typeface typeface;
        try {
            obj = f1119OooO0Oo.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        OooOO0.OooOOOO oooOOOO = new OooOO0.OooOOOO();
        for (o0000 o0000Var : o0000VarArr) {
            Uri uri = o0000Var.f1238OooO00o;
            ByteBuffer byteBuffer = (ByteBuffer) oooOOOO.getOrDefault(uri, null);
            if (byteBuffer == null) {
                byteBuffer = o0000O00.OooO00o.o0000oOo(context, uri);
                oooOOOO.put(uri, byteBuffer);
            }
            if (byteBuffer == null) {
                return null;
            }
            if (!OooOoo0(obj, byteBuffer, o0000Var.f1239OooO0O0, o0000Var.f1240OooO0OO, o0000Var.f1241OooO0Oo)) {
                return null;
            }
        }
        try {
            Object newInstance = Array.newInstance(f1118OooO0OO, 1);
            Array.set(newInstance, 0, obj);
            typeface = (Typeface) f1120OooO0o.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused2) {
            typeface = null;
        }
        if (typeface == null) {
            return null;
        }
        return Typeface.create(typeface, i);
    }
}