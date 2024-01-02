package OooOo0o;

import OooO0O0.OooO0O0;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final /* synthetic */ class o00000O implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1161OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ int f1162OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Object f1163OooO0OO;

    public /* synthetic */ o00000O(int i, int i2, Object obj) {
        this.f1161OooO00o = i2;
        this.f1163OooO0OO = obj;
        this.f1162OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1161OooO00o;
        int i2 = this.f1162OooO0O0;
        Object obj = this.f1163OooO0OO;
        switch (i) {
            case 0:
                ((OooO0O0) obj).OooOO0O(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.f3483OooOOOo.get();
                if (view != null) {
                    sideSheetBehavior.OooOo00(view, i2, false);
                    return;
                }
                return;
        }
    }
}