package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class OooOO0O implements View.OnClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f3378OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00oO0o f3379OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f3380OooO0OO;

    public /* synthetic */ OooOO0O(Oooo000 oooo000, o00oO0o o00oo0o, int i) {
        this.f3378OooO00o = i;
        this.f3380OooO0OO = oooo000;
        this.f3379OooO0O0 = o00oo0o;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f3378OooO00o;
        o00oO0o o00oo0o = this.f3379OooO0O0;
        Oooo000 oooo000 = this.f3380OooO0OO;
        switch (i) {
            case 0:
                int o00000OO2 = ((LinearLayoutManager) oooo000.OoooOoO.getLayoutManager()).o00000OO() - 1;
                if (o00000OO2 >= 0) {
                    Calendar OooO0O02 = o0Oo0oo.OooO0O0(o00oo0o.f3440OooO0OO.f3365OooO00o.f3426OooO00o);
                    OooO0O02.add(2, o00000OO2);
                    oooo000.Oooo00O(new o00O0O(OooO0O02));
                    return;
                }
                return;
            default:
                int o00000O2 = ((LinearLayoutManager) oooo000.OoooOoO.getLayoutManager()).o00000O() + 1;
                if (o00000O2 < oooo000.OoooOoO.getAdapter().OooO00o()) {
                    Calendar OooO0O03 = o0Oo0oo.OooO0O0(o00oo0o.f3440OooO0OO.f3365OooO00o.f3426OooO00o);
                    OooO0O03.add(2, o00000O2);
                    oooo000.Oooo00O(new o00O0O(OooO0O03));
                    return;
                }
                return;
        }
    }
}