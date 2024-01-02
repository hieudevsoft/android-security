package Oooooo;

import OooOOoo.o00Oo0;
import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import android.view.View;
import androidx.activity.OooO0o;
import androidx.activity.OooOOO;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class o00000O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1859OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f1860OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1861OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final Runnable f1862OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o00Oo0 f1863OooO0o0;

    public o00000O0(BottomSheetBehavior bottomSheetBehavior) {
        this.f1859OooO00o = 0;
        this.f1863OooO0o0 = bottomSheetBehavior;
        this.f1862OooO0Oo = new OooOOO(7, this);
    }

    public final void OooO00o(int i) {
        int i2 = this.f1859OooO00o;
        Runnable runnable = this.f1862OooO0Oo;
        o00Oo0 o00oo0 = this.f1863OooO0o0;
        switch (i2) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) o00oo0;
                WeakReference weakReference = bottomSheetBehavior.f3299OoooOO0;
                if (weakReference != null && weakReference.get() != null) {
                    this.f1860OooO0O0 = i;
                    if (!this.f1861OooO0OO) {
                        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOO0((View) bottomSheetBehavior.f3299OoooOO0.get(), runnable);
                        this.f1861OooO0OO = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) o00oo0;
                WeakReference weakReference2 = sideSheetBehavior.f3483OooOOOo;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f1860OooO0O0 = i;
                    if (!this.f1861OooO0OO) {
                        WeakHashMap weakHashMap2 = o0o0Oo.f1363OooO00o;
                        o00O0O0.OooOOO0((View) sideSheetBehavior.f3483OooOOOo.get(), runnable);
                        this.f1861OooO0OO = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o00000O0(BottomSheetBehavior bottomSheetBehavior, int i) {
        this(bottomSheetBehavior);
        this.f1859OooO00o = 0;
    }

    public o00000O0(SideSheetBehavior sideSheetBehavior) {
        this.f1859OooO00o = 1;
        this.f1863OooO0o0 = sideSheetBehavior;
        this.f1862OooO0Oo = new OooO0o(9, this);
    }
}