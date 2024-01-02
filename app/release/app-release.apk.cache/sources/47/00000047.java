package OooO0o;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class OooOOOO implements MenuItem.OnMenuItemClickListener {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Class[] f273OooO0OO = {MenuItem.class};

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Object f274OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Method f275OooO0O0;

    public OooOOOO(Object obj, String str) {
        this.f274OooO00o = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f275OooO0O0 = cls.getMethod(str, f273OooO0OO);
        } catch (Exception e) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Method method = this.f275OooO0O0;
        try {
            Class<?> returnType = method.getReturnType();
            Class<?> cls = Boolean.TYPE;
            Object obj = this.f274OooO00o;
            if (returnType == cls) {
                return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
            }
            method.invoke(obj, menuItem);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}