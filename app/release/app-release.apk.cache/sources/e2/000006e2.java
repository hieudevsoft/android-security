package o0ooOOo;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class OooO00o extends OooO0O0.OooO0O0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f5578OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final SideSheetBehavior f5579OooO0O0;

    public /* synthetic */ OooO00o(SideSheetBehavior sideSheetBehavior, int i) {
        this.f5578OooO00o = i;
        this.f5579OooO0O0 = sideSheetBehavior;
    }

    public final float OooOOo(int i) {
        switch (this.f5578OooO00o) {
            case 0:
                float OooOo002 = OooOo00();
                return (i - OooOo002) / (OooOOoo() - OooOo002);
            default:
                float OooOo003 = OooOo00();
                return (OooOo003 - i) / (OooOo003 - OooOOoo());
        }
    }

    public final int OooOOo0(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f5578OooO00o) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final int OooOOoo() {
        int i = this.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior = this.f5579OooO0O0;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f3481OooOOO + sideSheetBehavior.f3482OooOOOO);
            default:
                return Math.max(0, (OooOo00() - sideSheetBehavior.f3480OooOO0o) - sideSheetBehavior.f3482OooOOOO);
        }
    }

    public final boolean OooOo(float f) {
        switch (this.f5578OooO00o) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    public final int OooOo0(View view) {
        int i = this.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior = this.f5579OooO0O0;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f3482OooOOOO;
            default:
                return view.getLeft() - sideSheetBehavior.f3482OooOOOO;
        }
    }

    public final int OooOo00() {
        int i = this.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior = this.f5579OooO0O0;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f3480OooOO0o) - sideSheetBehavior.f3482OooOOOO;
            default:
                return sideSheetBehavior.OooOOO0;
        }
    }

    public final int OooOo0O(CoordinatorLayout coordinatorLayout) {
        switch (this.f5578OooO00o) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int OooOo0o() {
        switch (this.f5578OooO00o) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean OooOoO(float f, float f2) {
        boolean z;
        boolean z2;
        int i = this.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior = this.f5579OooO0O0;
        switch (i) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    float abs = Math.abs(f);
                    sideSheetBehavior.getClass();
                    if (abs > 500) {
                        return true;
                    }
                }
                return false;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    float abs2 = Math.abs(f);
                    sideSheetBehavior.getClass();
                    if (abs2 > 500) {
                        return true;
                    }
                }
                return false;
        }
    }

    public final boolean OooOoO0(View view) {
        switch (this.f5578OooO00o) {
            case 0:
                if (view.getRight() < (OooOOoo() - OooOo00()) / 2) {
                    return true;
                }
                return false;
            default:
                if (view.getLeft() > (OooOOoo() + OooOo00()) / 2) {
                    return true;
                }
                return false;
        }
    }

    public final boolean OooOoOO(View view, float f) {
        int i = this.f5578OooO00o;
        SideSheetBehavior sideSheetBehavior = this.f5579OooO0O0;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.f3479OooOO0O) + view.getLeft()) > 0.5f) {
                    return true;
                }
                return false;
            default:
                if (Math.abs((f * sideSheetBehavior.f3479OooOO0O) + view.getRight()) > 0.5f) {
                    return true;
                }
                return false;
        }
    }
}