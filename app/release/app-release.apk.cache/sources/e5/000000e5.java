package OooOo0;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class oo000o {
    public static Intent OooO00o(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static boolean OooO0O0(Activity activity, Intent intent) {
        return activity.navigateUpTo(intent);
    }

    public static boolean OooO0OO(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }
}