package OooOoo0;

import OooO0O0.OooO0O0;
import OooO0Oo.o0000OO0;
import OooooOo.oO00OOOo;
import android.graphics.Typeface;
import android.os.Handler;
import android.view.View;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class o000OOo implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1263OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f1264OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f1265OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Object f1266OooO0Oo;

    public /* synthetic */ o000OOo(Object obj, Object obj2, Object obj3, int i) {
        this.f1263OooO00o = i;
        this.f1266OooO0Oo = obj;
        this.f1264OooO0O0 = obj2;
        this.f1265OooO0OO = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = this.f1263OooO00o;
        Object obj2 = this.f1266OooO0Oo;
        Object obj3 = this.f1265OooO0OO;
        Object obj4 = this.f1264OooO0O0;
        switch (i) {
            case 0:
                Typeface typeface = (Typeface) obj3;
                OooO0O0 oooO0O0 = (OooO0O0) ((o0000OO0) obj4).f183OooO0O0;
                if (oooO0O0 != null) {
                    oooO0O0.OooOO0o(typeface);
                    return;
                }
                return;
            case 1:
                ((o00000O) ((OooOooO.o0000O00) obj4)).OooO0O0(obj3);
                return;
            case 2:
                try {
                    obj = ((Callable) obj4).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) obj2).post(new o000OOo(this, (OooOooO.o0000O00) obj3, obj, 1));
                return;
            default:
                if (((View) obj3) != null) {
                    ((oO00OOOo) obj2).getClass();
                    return;
                }
                return;
        }
    }
}