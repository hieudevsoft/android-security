package androidx.profileinstaller;

import OooO0Oo.o0000OO0;
import OooO0oo.o00OOO00;
import OoooO.Oooo0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import java.io.File;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        int i;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            OooO00o.o00O00o(context, new o00OOO00(2), new o0000OO0(21, this), true);
        } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                if ("WRITE_SKIP_FILE".equals(string)) {
                    o0000OO0 o0000oo02 = new o0000OO0(21, this);
                    try {
                        OooO00o.o0000oo0(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                        new Oooo0(10, 1, o0000oo02, null).run();
                    } catch (PackageManager.NameNotFoundException e) {
                        new Oooo0(7, 1, o0000oo02, e).run();
                    }
                } else if ("DELETE_SKIP_FILE".equals(string)) {
                    o0000OO0 o0000oo03 = new o0000OO0(21, this);
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new Oooo0(11, 1, o0000oo03, null).run();
                }
            }
        } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
            Process.sendSignal(Process.myPid(), 10);
            setResultCode(12);
        } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
            if ("DROP_SHADER_CACHE".equals(extras.getString("EXTRA_BENCHMARK_OPERATION"))) {
                if (OooO00o.OooooOO(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    i = 14;
                } else {
                    i = 15;
                }
                setResultCode(i);
                return;
            }
            setResultCode(16);
        }
    }
}