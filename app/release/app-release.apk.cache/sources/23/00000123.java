package OooOoo0;

import OooO0Oo.OooOOO;
import OooOO0.OooO;
import OooOO0.OooOOOO;
import OooOo.OooOO0O;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.appcompat.widget.o00Oo0;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;

/* loaded from: classes.dex */
public abstract class o0000Ooo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooO f1257OooO00o = new OooO(16);

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final ThreadPoolExecutor f1258OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final Object f1259OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final OooOOOO f1260OooO0Oo;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new o0000oo());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1258OooO0O0 = threadPoolExecutor;
        f1259OooO0OO = new Object();
        f1260OooO0Oo = new OooOOOO();
    }

    public static o00000OO OooO00o(String str, Context context, o00Oo0 o00oo0, int i) {
        int i2;
        OooO oooO = f1257OooO00o;
        Typeface typeface = (Typeface) oooO.OooO00o(str);
        if (typeface != null) {
            return new o00000OO(typeface);
        }
        try {
            OooOOO o0OO00O2 = OooO00o.o0OO00O(context, o00oo0);
            int i3 = o0OO00O2.f60OooO00o;
            int i4 = 1;
            Object obj = o0OO00O2.f61OooO0O0;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                }
                i2 = -3;
            } else {
                o0000[] o0000VarArr = (o0000[]) obj;
                if (o0000VarArr != null && o0000VarArr.length != 0) {
                    for (o0000 o0000Var : o0000VarArr) {
                        int i5 = o0000Var.f1242OooO0o0;
                        if (i5 != 0) {
                            if (i5 >= 0) {
                                i2 = i5;
                            }
                            i2 = -3;
                        }
                    }
                    i4 = 0;
                }
                i2 = i4;
            }
            if (i2 != 0) {
                return new o00000OO(i2);
            }
            Typeface OooOOoo2 = OooOO0O.f1116OooO00o.OooOOoo(context, (o0000[]) obj, i);
            if (OooOOoo2 != null) {
                oooO.OooO0O0(str, OooOOoo2);
                return new o00000OO(OooOOoo2);
            }
            return new o00000OO(-3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new o00000OO(-1);
        }
    }
}