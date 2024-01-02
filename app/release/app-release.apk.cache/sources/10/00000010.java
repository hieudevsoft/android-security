package OooO0Oo;

import OooO0oO.o00O00OO;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.o0OO000;

/* loaded from: classes.dex */
public final class OooO0OO implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f54OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ Object f55OooO0O0;

    public /* synthetic */ OooO0OO(int i, Object obj) {
        this.f54OooO00o = i;
        this.f55OooO0O0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        o00O00OO o00o00oo;
        int i = this.f54OooO00o;
        Object obj = this.f55OooO0O0;
        switch (i) {
            case 0:
                OooOOO0 oooOOO0 = (OooOOO0) obj;
                Button button = oooOOO0.f67OooO0o;
                Button button2 = oooOOO0.f69OooO0oO;
                Button button3 = oooOOO0.f70OooO0oo;
                oooOOO0.f84OooOo0o.obtainMessage(1, oooOOO0.f64OooO0O0).sendToTarget();
                return;
            case 1:
                o0OO000 o0oo000 = ((Toolbar) obj).f2234Oooo0o0;
                if (o0oo000 == null) {
                    o00o00oo = null;
                } else {
                    o00o00oo = o0oo000.f2485OooO0O0;
                }
                if (o00o00oo != null) {
                    o00o00oo.collapseActionView();
                    return;
                }
                return;
            default:
                com.google.android.material.datepicker.Oooo000 oooo000 = (com.google.android.material.datepicker.Oooo000) obj;
                int i2 = oooo000.f3396OoooOOO;
                if (i2 == 2) {
                    oooo000.Oooo00o(1);
                    return;
                } else if (i2 == 1) {
                    oooo000.Oooo00o(2);
                    return;
                } else {
                    return;
                }
        }
    }
}