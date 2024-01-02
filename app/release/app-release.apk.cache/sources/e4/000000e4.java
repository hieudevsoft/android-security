package OooOo0;

import android.app.AppOpsManager;
import android.content.Context;

/* loaded from: classes.dex */
public abstract class o0OoOo0 {
    public static <T> T OooO00o(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static int OooO0O0(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOp(str, str2);
    }

    public static int OooO0OO(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }

    public static String OooO0Oo(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}