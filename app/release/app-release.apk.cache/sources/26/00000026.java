package OooO0Oo;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public final /* synthetic */ class o0000O0O implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f179OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f180OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f181OooO0OO;

    public /* synthetic */ o0000O0O(Object obj, int i, Object obj2) {
        this.f179OooO00o = i;
        this.f180OooO0O0 = obj;
        this.f181OooO0OO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        int i = this.f179OooO00o;
        Object obj = this.f181OooO0OO;
        Object obj2 = this.f180OooO0O0;
        switch (i) {
            case 0:
                o000OO o000oo = (o000OO) obj2;
                Runnable runnable = (Runnable) obj;
                o000oo.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    o000oo.OooO00o();
                }
            case 1:
                ((OooO0O0.OooO0O0) obj2).OooOO0o((Typeface) obj);
                return;
            case 2:
                Context context = (Context) obj;
                ((ProfileInstallerInitializer) obj2).getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = OoooO.o00oO0o.OooO00o(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new OoooO.o00Oo0(context, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
                return;
            default:
                Context context2 = (Context) obj2;
                String str = (String) obj;
                OooO00o.OooOoo0(context2, "$this_showToast");
                OooO00o.OooOoo0(str, "$message");
                Toast.makeText(context2, str, 0).show();
                return;
        }
    }
}