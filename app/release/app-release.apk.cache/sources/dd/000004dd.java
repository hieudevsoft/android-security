package hieubui.eup.android_app_security;

import OoooO0O.o0000O0;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Debug;
import java.io.File;
import o00000oO.OooOOO;
import o00000oo.o00Oo0;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final class MyApplication extends Application {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00Oo0 f3947OooO00o = OooO00o.o0000OOo(OooOOO.f4075OooO0OO);

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        ApplicationInfo applicationInfo;
        super.attachBaseContext(context);
        if (!o0000O0.f1564OooO0O0) {
            try {
                try {
                    applicationInfo = getApplicationInfo();
                } catch (RuntimeException unused) {
                    applicationInfo = null;
                }
                if (applicationInfo != null) {
                    o0000O0.OooO0O0(this, new File(applicationInfo.sourceDir), new File(applicationInfo.dataDir));
                }
            } catch (Exception e) {
                throw new RuntimeException("MultiDex installation failed (" + e.getMessage() + ").");
            }
        }
        ((NativeLib) this.f3947OooO00o.OooO00o()).getClass();
        System.loadLibrary("native-lib");
    }

    @Override // android.app.Application
    public final void onCreate() {
        boolean z;
        String installerPackageName;
        InstallSourceInfo installSourceInfo;
        super.onCreate();
        if ((getApplicationInfo().flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            boolean isDebuggerConnected = Debug.isDebuggerConnected();
            Context applicationContext = getApplicationContext();
            OooO00o.OooOoOO(applicationContext, "getApplicationContext(...)");
            PackageManager packageManager = applicationContext.getPackageManager();
            OooO00o.OooOoOO(packageManager, "getPackageManager(...)");
            int i = Build.VERSION.SDK_INT;
            String packageName = applicationContext.getPackageName();
            if (i >= 30) {
                installSourceInfo = packageManager.getInstallSourceInfo(packageName);
                OooO00o.OooOoOO(installSourceInfo, "getInstallSourceInfo(...)");
                installerPackageName = installSourceInfo.getInstallingPackageName();
            } else {
                installerPackageName = packageManager.getInstallerPackageName(packageName);
            }
            boolean OooOOO0 = true ^ OooO00o.OooOOO0(installerPackageName, "com.android.vending");
            if (!isDebuggerConnected) {
                if (OooOOO0) {
                    throw new IllegalArgumentException("Not bypass security vendor");
                }
                return;
            }
            throw new IllegalArgumentException("Not bypass security debugger attached");
        }
    }
}