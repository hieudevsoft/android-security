package OooOo0O;

import android.content.Context;

/* loaded from: classes.dex */
public abstract class oo000o {
    public static int OooO00o(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T OooO0O0(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String OooO0OO(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}