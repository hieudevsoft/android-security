package androidx.activity;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.app.o00000;
import androidx.fragment.app.o0000oo;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class o0Oo0oo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Runnable f1960OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0000.OooOOO f1961OooO0O0 = new o0000.OooOOO();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public o00000 f1962OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OnBackInvokedCallback f1963OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f1964OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public OnBackInvokedDispatcher f1965OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f1966OooO0oO;

    public o0Oo0oo(Runnable runnable) {
        OnBackInvokedCallback OooO00o2;
        this.f1960OooO00o = runnable;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (i >= 34) {
                OooO00o2 = o00oO0o.f1958OooO00o.OooO00o(new o0OoOo0(this, 0), new o0OoOo0(this, 1), new o00O0O(this, 0), new o00O0O(this, 1));
            } else {
                OooO00o2 = o00Ooo.f1957OooO00o.OooO00o(new o00O0O(this, 2));
            }
            this.f1963OooO0Oo = OooO00o2;
        }
    }

    public final void OooO00o(androidx.lifecycle.o00Ooo o00ooo2, o00000 o00000Var) {
        o0000O00.OooO00o.OooOoo0(o00000Var, "onBackPressedCallback");
        androidx.lifecycle.o00oO0o OooO0oO2 = o00ooo2.OooO0oO();
        if (OooO0oO2.f3092OooO0OO == androidx.lifecycle.Oooo000.DESTROYED) {
            return;
        }
        o00000Var.f2816OooO0O0.add(new OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(this, OooO0oO2, o00000Var));
        OooO0Oo();
        o00000Var.f2817OooO0OO = new o0OOO0o(0, this);
    }

    public final void OooO0O0() {
        Object obj;
        o0000.OooOOO oooOOO = this.f1961OooO0O0;
        oooOOO.getClass();
        ListIterator listIterator = oooOOO.listIterator(oooOOO.f3963OooO0OO);
        while (true) {
            if (listIterator.hasPrevious()) {
                obj = listIterator.previous();
                if (((o00000) obj).f2815OooO00o) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        o00000 o00000Var = (o00000) obj;
        this.f1962OooO0OO = null;
        if (o00000Var != null) {
            o0000oo o0000ooVar = o00000Var.f2818OooO0Oo;
            o0000ooVar.OooOo(true);
            if (o0000ooVar.f2871OooO0oo.f2815OooO00o) {
                o0000ooVar.Oooo0o0();
                return;
            } else {
                o0000ooVar.f2870OooO0oO.OooO0O0();
                return;
            }
        }
        Runnable runnable = this.f1960OooO00o;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void OooO0OO(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f1965OooO0o0;
        if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f1963OooO0Oo) == null) {
            return;
        }
        o00Ooo o00ooo2 = o00Ooo.f1957OooO00o;
        if (z && !this.f1964OooO0o) {
            o00ooo2.OooO0O0(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f1964OooO0o = true;
        } else if (z || !this.f1964OooO0o) {
        } else {
            o00ooo2.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f1964OooO0o = false;
        }
    }

    public final void OooO0Oo() {
        boolean z;
        boolean z2 = this.f1966OooO0oO;
        o0000.OooOOO oooOOO = this.f1961OooO0O0;
        if (!(oooOOO instanceof Collection) || !oooOOO.isEmpty()) {
            Iterator it = oooOOO.iterator();
            while (it.hasNext()) {
                if (((o00000) it.next()).f2815OooO00o) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.f1966OooO0oO = z;
        if (z != z2 && Build.VERSION.SDK_INT >= 33) {
            OooO0OO(z);
        }
    }
}