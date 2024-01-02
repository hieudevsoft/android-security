package com.google.gson.internal;

import OooooO0.o0000O;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import hieubui.eup.android_app_security.R;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Type[] f3785OooO00o = new Type[0];

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final Object[] f3786OooO0O0 = new Object[0];

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final char[] f3787OooO0OO = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int[] f3788OooO0Oo = {R.attr.colorPrimary};

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final int[] f3790OooO0o0 = {R.attr.colorPrimaryVariant};

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final OooOOoo.o0Oo0oo f3789OooO0o = new OooOOoo.o0Oo0oo(2);

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final int[] f3791OooO0oO = {16842910, 16842919};

    /* renamed from: OooO0oo  reason: collision with root package name */
    public static final byte[] f3792OooO0oo = new byte[0];

    /* renamed from: OooO  reason: collision with root package name */
    public static final int[] f3784OooO = {16842752, R.attr.theme};

    /* renamed from: OooOO0  reason: collision with root package name */
    public static final int[] f3793OooOO0 = {R.attr.materialThemeOverlay};

    public static final int OooO00o(char c) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if ('0' <= c && c < ':') {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return c - '0';
        }
        char c2 = 'a';
        if ('a' <= c && c < 'g') {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            c2 = 'A';
            if ('A' > c || c >= 'G') {
                z3 = false;
            }
            if (!z3) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public static final boolean OooO0O0(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        o0000O00.OooO00o.OooOoo0(bArr, "a");
        o0000O00.OooO00o.OooOoo0(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static Type OooO0OO(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new OooO00o(OooO0OO(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new OooO0O0(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new OooO00o(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new OooO0OO(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static void OooO0Oo(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o0000O.f1812OooOoo0, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(R.attr.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                OooO0oo(context, f3790OooO0o0, "Theme.MaterialComponents");
            }
        }
        OooO0oo(context, f3788OooO0Oo, "Theme.AppCompat");
    }

    public static final void OooO0o(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException("size=" + j + " offset=" + j2 + " byteCount=" + j3);
        }
    }

    public static void OooO0o0(Type type) {
        o0000O00.OooO00o.OooOo0(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001a, code lost:
        if (r0.getResourceId(0, -1) != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OooO0oO(android.content.Context r4, android.util.AttributeSet r5, int[] r6, int r7, int r8, int... r9) {
        /*
            int[] r0 = OooooO0.o0000O.f1812OooOoo0
            android.content.res.TypedArray r0 = r4.obtainStyledAttributes(r5, r0, r7, r8)
            r1 = 2
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 != 0) goto L12
            r0.recycle()
            return
        L12:
            int r1 = r9.length
            r3 = -1
            if (r1 != 0) goto L1d
            int r4 = r0.getResourceId(r2, r3)
            if (r4 == r3) goto L38
            goto L37
        L1d:
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r6, r7, r8)
            int r5 = r9.length
            r6 = r2
        L23:
            if (r6 >= r5) goto L34
            r7 = r9[r6]
            int r7 = r4.getResourceId(r7, r3)
            if (r7 != r3) goto L31
            r4.recycle()
            goto L38
        L31:
            int r6 = r6 + 1
            goto L23
        L34:
            r4.recycle()
        L37:
            r2 = 1
        L38:
            r0.recycle()
            if (r2 == 0) goto L3e
            return
        L3e:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.OooO0o.OooO0oO(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
    }

    public static void OooO0oo(Context context, int[] iArr, String str) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < iArr.length) {
                if (!obtainStyledAttributes.hasValue(i)) {
                    obtainStyledAttributes.recycle();
                    break;
                }
                i++;
            } else {
                obtainStyledAttributes.recycle();
                z = true;
                break;
            }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0Oo("The style on this component requires your app theme to be ", str, " (or a descendant)."));
    }

    public static boolean OooOO0(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return OooOO0(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return true;
            }
            return false;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName())) {
                return true;
            }
            return false;
        }
    }

    public static Type OooOO0O(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return OooOO0O(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return OooOO0O(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Class OooOO0o(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            o0000O00.OooO00o.OooOo0(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(OooOO0o(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return OooOO0o(((WildcardType) type).getUpperBounds()[0]);
            }
            String name = type == null ? "null" : type.getClass().getName();
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
        }
    }

    public static ArrayList OooOOO(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static Type OooOOO0(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        o0000O00.OooO00o.OooOo0(cls2.isAssignableFrom(cls));
        return OooOOo0(type, cls, OooOO0O(type, cls, cls2), new HashMap());
    }

    public static TypedArray OooOOOO(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        OooO0Oo(context, attributeSet, i, i2);
        OooO0oO(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    public static final boolean OooOOOo(String str) {
        o0000O00.OooO00o.OooOoo0(str, "method");
        return (o0000O00.OooO00o.OooOOO0(str, "GET") || o0000O00.OooO00o.OooOOO0(str, "HEAD")) ? false : true;
    }

    public static ColorStateList OooOOo(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
                Color.alpha(colorStateList.getColorForState(f3791OooO0oO, 0));
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x013f, code lost:
        if (r1 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0141, code lost:
        r12.put(r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0144, code lost:
        return r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[EDGE_INSN: B:86:0x013f->B:81:0x013f ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3, types: [com.google.gson.internal.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v4, types: [com.google.gson.internal.OooO0OO] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.reflect.Type OooOOo0(java.lang.reflect.Type r9, java.lang.Class r10, java.lang.reflect.Type r11, java.util.HashMap r12) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.OooO0o.OooOOo0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static boolean OooOOoo(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842910) {
                z = true;
            } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static final Object[] OooOo0(Collection collection, Object[] objArr) {
        Object[] objArr2;
        o0000O00.OooO00o.OooOoo0(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            o0000O00.OooO00o.OooOoO0(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                o0000O00.OooO00o.OooOoOO(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i2] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                o0000O00.OooO00o.OooOoOO(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    public static final Object[] OooOo00(Collection collection) {
        o0000O00.OooO00o.OooOoo0(collection, "collection");
        int size = collection.size();
        Object[] objArr = f3786OooO0O0;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
                o0000O00.OooO00o.OooOoOO(objArr2, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] copyOf = Arrays.copyOf(objArr2, i2);
                o0000O00.OooO00o.OooOoOO(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i = i2;
        }
    }

    public static String OooOo0O(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Context OooOo0o(Context context, AttributeSet attributeSet, int i, int i2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f3793OooOO0, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        if ((context instanceof OooO0o.OooOO0) && ((OooO0o.OooOO0) context).f255OooO00o == resourceId) {
            z = true;
        } else {
            z = false;
        }
        if (resourceId != 0 && !z) {
            OooO0o.OooOO0 oooOO0 = new OooO0o.OooOO0(context, resourceId);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f3784OooO);
            int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
            obtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                oooOO0.getTheme().applyStyle(resourceId2, true);
            }
            return oooOO0;
        }
        return context;
    }

    public abstract List OooO(String str, List list);
}