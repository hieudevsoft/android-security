package OooOo;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class OooOo00 extends OooOOOO {
    @Override // OooOo.OooOOOO
    public final Typeface OooOooo(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f1128OooO0oo, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f1132OooOOO.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // OooOo.OooOOOO
    public final Method Oooo0(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}