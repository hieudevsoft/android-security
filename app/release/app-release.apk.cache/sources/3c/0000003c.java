package OooO0Oo;

import OooO0oO.o00O00O;
import OooO0oO.oo0oOO0;
import OooOooo.o00O0OO;
import OooOooo.o0O00OOO;
import OooOooo.o0O00o00;
import OooOooo.o0O00oO0;
import OooOooo.o0O0OOOo;
import OooOooo.o0O0ooO;
import OooOooo.o0o0Oo;
import OooOooo.o0oO0Ooo;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.o00O0O00;
import androidx.appcompat.widget.o00OO00O;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class oo000o implements o0O0ooO, o00OO00O, o00O0O00, oo0oOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f248OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00000OO f249OooO0O0;

    public /* synthetic */ oo000o(o00000OO o00000oo2, int i) {
        this.f248OooO00o = i;
        this.f249OooO0O0 = o00000oo2;
    }

    @Override // OooO0oO.oo0oOO0
    public final void OooO00o(o00O00O o00o00o, boolean z) {
        boolean z2;
        int i;
        o00000O o00000o;
        int i2 = this.f248OooO00o;
        o00000OO o00000oo2 = this.f249OooO0O0;
        switch (i2) {
            case 3:
                o00000oo2.OooOOo(o00o00o);
                return;
            default:
                o00O00O OooOO0O2 = o00o00o.OooOO0O();
                int i3 = 0;
                if (OooOO0O2 != o00o00o) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    o00o00o = OooOO0O2;
                }
                o00000O[] o00000oArr = o00000oo2.f151Oooo0o0;
                if (o00000oArr != null) {
                    i = o00000oArr.length;
                } else {
                    i = 0;
                }
                while (true) {
                    if (i3 < i) {
                        o00000o = o00000oArr[i3];
                        if (o00000o == null || o00000o.f110OooO0oo != o00o00o) {
                            i3++;
                        }
                    } else {
                        o00000o = null;
                    }
                }
                if (o00000o != null) {
                    if (z2) {
                        o00000oo2.OooOOo0(o00000o.f103OooO00o, o00000o, OooOO0O2);
                        o00000oo2.OooOOoo(o00000o, true);
                        return;
                    }
                    o00000oo2.OooOOoo(o00000o, z);
                    return;
                }
                return;
        }
    }

    @Override // OooOooo.o0O0ooO
    public final o0O0OOOo OooO0oo(View view, o0O0OOOo o0o0oooo) {
        o0O00oO0 o0o00ooo;
        int OooO0o02 = o0o0oooo.OooO0o0();
        int Oooo0O02 = this.f249OooO0O0.Oooo0O0(o0o0oooo, null);
        if (OooO0o02 != Oooo0O02) {
            int OooO0OO2 = o0o0oooo.OooO0OO();
            int OooO0Oo2 = o0o0oooo.OooO0Oo();
            int OooO0O02 = o0o0oooo.OooO0O0();
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                o0o00ooo = new o0O00o00(o0o0oooo);
            } else if (i >= 29) {
                o0o00ooo = new o0oO0Ooo(o0o0oooo);
            } else {
                o0o00ooo = new o0O00OOO(o0o0oooo);
            }
            o0o00ooo.OooO0oO(OooOo.OooO0OO.OooO0O0(OooO0OO2, Oooo0O02, OooO0Oo2, OooO0O02));
            o0o0oooo = o0o00ooo.OooO0O0();
        }
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        WindowInsets OooO0oO2 = o0o0oooo.OooO0oO();
        if (OooO0oO2 != null) {
            WindowInsets OooO0O03 = o00O0OO.OooO0O0(view, OooO0oO2);
            if (!OooO0O03.equals(OooO0oO2)) {
                return o0O0OOOo.OooO0oo(view, OooO0O03);
            }
            return o0o0oooo;
        }
        return o0o0oooo;
    }

    @Override // OooO0oO.oo0oOO0
    public final boolean OooOOOO(o00O00O o00o00o) {
        Window.Callback OooOoOO2;
        int i = this.f248OooO00o;
        o00000OO o00000oo2 = this.f249OooO0O0;
        switch (i) {
            case 3:
                Window.Callback OooOoOO3 = o00000oo2.OooOoOO();
                if (OooOoOO3 != null) {
                    OooOoOO3.onMenuOpened(108, o00o00o);
                }
                return true;
            default:
                if (o00o00o == o00o00o.OooOO0O() && o00000oo2.f145Oooo000 && (OooOoOO2 = o00000oo2.OooOoOO()) != null && !o00000oo2.f156OoooO00) {
                    OooOoOO2.onMenuOpened(108, o00o00o);
                }
                return true;
        }
    }
}