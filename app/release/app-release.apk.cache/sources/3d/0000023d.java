package Oooooo;

import OooOooo.o0O00O;
import OooOooo.o0O0OOOo;
import OooooOO.oO00O0o0;
import android.view.View;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class o00000O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public WindowInsets f1854OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final View f1855OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f1856OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f1857OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int[] f1858OooO0o0 = new int[2];

    public o00000O(View view) {
        this.f1855OooO0O0 = view;
    }

    public final void OooO00o(o0O0OOOo o0o0oooo, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            o0O00O o0o00o = (o0O00O) it.next();
            if ((o0o00o.f1321OooO00o.OooO0OO() & 8) != 0) {
                int i = this.f1857OooO0Oo;
                float OooO0O02 = o0o00o.f1321OooO00o.OooO0O0();
                LinearInterpolator linearInterpolator = oO00O0o0.f1815OooO00o;
                this.f1855OooO0O0.setTranslationY(Math.round(OooO0O02 * (0 - i)) + i);
                return;
            }
        }
    }
}