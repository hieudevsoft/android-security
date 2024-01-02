package OooOo0;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class OooOo {
    public static void OooO00o(Activity activity) {
        activity.finishAffinity();
    }

    public static void OooO0O0(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    public static void OooO0OO(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}