package OoooO;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public abstract class o00oO0o {
    public static Handler OooO00o(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}