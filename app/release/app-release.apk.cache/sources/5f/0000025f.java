package androidx.activity;

import OooOooo.o00O0O0;
import OooOooo.o0o0Oo;
import Oooooo.o00000O0;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o00OO000;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import o00000.o000;

/* loaded from: classes.dex */
public final class OooOOO implements Runnable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1920OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f1921OooO0O0;

    public /* synthetic */ OooOOO(int i, Object obj) {
        this.f1920OooO00o = i;
        this.f1921OooO0O0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.appcompat.widget.Oooo000 oooo000;
        boolean z = true;
        switch (this.f1920OooO00o) {
            case 0:
                try {
                    Oooo000.OooO((Oooo000) this.f1921OooO0O0);
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    }
                    throw e;
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 1:
                OooO0o0.OooOO0 oooOO0 = (OooO0o0.OooOO0) this.f1921OooO0O0;
                oooOO0.OooO00o(true);
                oooOO0.invalidateSelf();
                return;
            case 2:
                o00OO000 o00oo000 = (o00OO000) this.f1921OooO0O0;
                o00oo000.f2349OooOO0o = null;
                o00oo000.drawableStateChanged();
                return;
            case 3:
                ActionMenuView actionMenuView = ((Toolbar) this.f1921OooO0O0).f2197OooO00o;
                if (actionMenuView != null && (oooo000 = actionMenuView.f2076OooOo00) != null) {
                    oooo000.OooOO0o();
                    return;
                }
                return;
            case 4:
                Oooo0.OooOO0O oooOO0O = (Oooo0.OooOO0O) this.f1921OooO0O0;
                if (oooOO0O.f1409OooOOOO) {
                    if (oooOO0O.OooOOO0) {
                        oooOO0O.OooOOO0 = false;
                        Oooo0.OooO00o oooO00o = oooOO0O.f1397OooO00o;
                        oooO00o.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        oooO00o.f1392OooO0o0 = currentAnimationTimeMillis;
                        oooO00o.f1393OooO0oO = -1L;
                        oooO00o.f1391OooO0o = currentAnimationTimeMillis;
                        oooO00o.f1394OooO0oo = 0.5f;
                    }
                    Oooo0.OooO00o oooO00o2 = oooOO0O.f1397OooO00o;
                    if (oooO00o2.f1393OooO0oO <= 0 || AnimationUtils.currentAnimationTimeMillis() <= oooO00o2.f1393OooO0oO + oooO00o2.f1386OooO) {
                        z = false;
                    }
                    if (!z && oooOO0O.OooO0o()) {
                        if (oooOO0O.f1408OooOOO) {
                            oooOO0O.f1408OooOOO = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            oooOO0O.f1399OooO0OO.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (oooO00o2.f1391OooO0o != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float OooO00o2 = oooO00o2.OooO00o(currentAnimationTimeMillis2);
                            oooO00o2.f1391OooO0o = currentAnimationTimeMillis2;
                            Oooo0.OooOOO0.OooO0O0(oooOO0O.f1411OooOOo0, (int) (((float) (currentAnimationTimeMillis2 - oooO00o2.f1391OooO0o)) * ((OooO00o2 * 4.0f) + ((-4.0f) * OooO00o2 * OooO00o2)) * oooO00o2.f1390OooO0Oo));
                            View view = oooOO0O.f1399OooO0OO;
                            WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
                            o00O0O0.OooOOO0(view, this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    oooOO0O.f1409OooOOOO = false;
                    return;
                }
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((Oooo0o0.o000oOoO) this.f1921OooO0O0).OooOOOO(0);
                return;
            case 6:
            default:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f1921OooO0O0).f3499OooO0OO.f5359OooO0oO;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 7:
                o00000O0 o00000o02 = (o00000O0) this.f1921OooO0O0;
                o00000o02.f1861OooO0OO = false;
                Oooo0o0.o000oOoO o000oooo = ((BottomSheetBehavior) o00000o02.f1863OooO0o0).f3291Oooo0o;
                if (o000oooo != null && o000oooo.OooO0oO()) {
                    o00000o02.OooO00o(o00000o02.f1860OooO0O0);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) o00000o02.f1863OooO0o0;
                if (bottomSheetBehavior.f3292Oooo0o0 == 2) {
                    bottomSheetBehavior.OooOooo(o00000o02.f1860OooO0O0);
                    return;
                }
                return;
        }
    }
}