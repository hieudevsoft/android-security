package o00000Oo;

import OooO0O0.OooO00o;
import com.google.gson.Oooo000;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooO0O0.OooO0O0 f4064OooO00o;

    static {
        OooO0O0.OooO0O0 oooO0O0;
        try {
            oooO0O0 = new OooO0OO();
        } catch (NoSuchMethodException unused) {
            oooO0O0 = new OooO0O0();
        }
        f4064OooO00o = oooO0O0;
    }

    public static void OooO00o(AccessibleObject accessibleObject, StringBuilder sb) {
        sb.append('(');
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(parameterTypes[i].getSimpleName());
        }
        sb.append(')');
    }

    public static String OooO0O0(Constructor constructor) {
        StringBuilder sb = new StringBuilder(constructor.getDeclaringClass().getName());
        OooO00o(constructor, sb);
        return sb.toString();
    }

    public static String OooO0OO(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String OooO0Oo(java.lang.reflect.AccessibleObject r4, boolean r5) {
        /*
            boolean r0 = r4 instanceof java.lang.reflect.Field
            java.lang.String r1 = "'"
            if (r0 == 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "field '"
            r0.<init>(r2)
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            java.lang.String r4 = OooO0OO(r4)
            goto L5d
        L14:
            boolean r0 = r4 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L4c
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = r4.getName()
            r0.<init>(r2)
            OooO00o(r4, r0)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "method '"
            r2.<init>(r3)
            java.lang.Class r4 = r4.getDeclaringClass()
            java.lang.String r4 = r4.getName()
            r2.append(r4)
            java.lang.String r4 = "#"
            r2.append(r4)
            r2.append(r0)
            r2.append(r1)
            java.lang.String r4 = r2.toString()
            goto L76
        L4c:
            boolean r0 = r4 instanceof java.lang.reflect.Constructor
            if (r0 == 0) goto L64
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "constructor '"
            r0.<init>(r2)
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.String r4 = OooO0O0(r4)
        L5d:
            r0.append(r4)
            r0.append(r1)
            goto L72
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<unknown AccessibleObject> "
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
        L72:
            java.lang.String r4 = r0.toString()
        L76:
            if (r5 == 0) goto L9f
            r5 = 0
            char r0 = r4.charAt(r5)
            boolean r0 = java.lang.Character.isLowerCase(r0)
            if (r0 == 0) goto L9f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            char r5 = r4.charAt(r5)
            char r5 = java.lang.Character.toUpperCase(r5)
            r0.append(r5)
            r5 = 1
            java.lang.String r4 = r4.substring(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L9f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o00000Oo.OooO0o.OooO0Oo(java.lang.reflect.AccessibleObject, boolean):java.lang.String");
    }

    public static void OooO0o0(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            throw new Oooo000(OooO00o.OooO0Oo("Failed making ", OooO0Oo(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type."), e);
        }
    }
}