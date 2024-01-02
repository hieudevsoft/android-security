package OooOo0;

import OooOo0o.o0000;
import OooOo0o.o00000;
import OooOo0o.o000000O;
import OooOo0o.o00000O0;
import OooOo0o.o0ooOOo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class Oooo000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Object f1139OooO00o = new Object();

    public static ColorStateList OooO00o(Context context, int i) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        o00000 o00000Var;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        o00000O0 o00000o02 = new o00000O0(resources, theme);
        synchronized (o0000.f1157OooO0OO) {
            SparseArray sparseArray = (SparseArray) o0000.f1156OooO0O0.get(o00000o02);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (o00000Var = (o00000) sparseArray.get(i)) != null) {
                if (o00000Var.f1159OooO0O0.equals(resources.getConfiguration()) && ((theme == null && o00000Var.f1160OooO0OO == 0) || (theme != null && o00000Var.f1160OooO0OO == theme.hashCode()))) {
                    colorStateList2 = o00000Var.f1158OooO00o;
                } else {
                    sparseArray.remove(i);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = o0000.f1155OooO00o;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z = true;
            resources.getValue(i, typedValue, true);
            int i2 = typedValue.type;
            if (!((i2 < 28 || i2 > 31) ? false : false)) {
                try {
                    colorStateList = o0ooOOo.OooO00o(resources, resources.getXml(i), theme);
                } catch (Exception unused) {
                }
            }
            if (colorStateList != null) {
                synchronized (o0000.f1157OooO0OO) {
                    WeakHashMap weakHashMap = o0000.f1156OooO0O0;
                    SparseArray sparseArray2 = (SparseArray) weakHashMap.get(o00000o02);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        weakHashMap.put(o00000o02, sparseArray2);
                    }
                    sparseArray2.append(i, new o00000(colorStateList, o00000o02.f1164OooO00o.getConfiguration(), theme));
                }
                return colorStateList;
            }
            return o000000O.OooO0O0(resources, i, theme);
        }
        return colorStateList2;
    }
}