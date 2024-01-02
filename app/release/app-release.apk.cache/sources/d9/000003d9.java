package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import o000oOoO.o000O000;

/* loaded from: classes.dex */
public final class OooOo extends o000O000 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ o00oO0o f3387OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ MaterialButton f3388OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ Oooo000 f3389OooO0OO;

    public OooOo(Oooo000 oooo000, o00oO0o o00oo0o, MaterialButton materialButton) {
        this.f3389OooO0OO = oooo000;
        this.f3387OooO00o = o00oo0o;
        this.f3388OooO0O0 = materialButton;
    }

    @Override // o000oOoO.o000O000
    public final void OooO00o(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.f3388OooO0O0.getText());
        }
    }

    @Override // o000oOoO.o000O000
    public final void OooO0O0(RecyclerView recyclerView, int i, int i2) {
        int o00000OO2;
        Oooo000 oooo000 = this.f3389OooO0OO;
        if (i < 0) {
            o00000OO2 = ((LinearLayoutManager) oooo000.OoooOoO.getLayoutManager()).o00000O();
        } else {
            o00000OO2 = ((LinearLayoutManager) oooo000.OoooOoO.getLayoutManager()).o00000OO();
        }
        o00oO0o o00oo0o = this.f3387OooO00o;
        Calendar OooO0O02 = o0Oo0oo.OooO0O0(o00oo0o.f3440OooO0OO.f3365OooO00o.f3426OooO00o);
        OooO0O02.add(2, o00000OO2);
        oooo000.f3403o000oOoO = new o00O0O(OooO0O02);
        Calendar OooO0O03 = o0Oo0oo.OooO0O0(o00oo0o.f3440OooO0OO.f3365OooO00o.f3426OooO00o);
        OooO0O03.add(2, o00000OO2);
        OooO0O03.set(5, 1);
        Calendar OooO0O04 = o0Oo0oo.OooO0O0(OooO0O03);
        OooO0O04.get(2);
        OooO0O04.get(1);
        OooO0O04.getMaximum(7);
        OooO0O04.getActualMaximum(5);
        OooO0O04.getTimeInMillis();
        this.f3388OooO0O0.setText(o0Oo0oo.OooO00o("yMMMM", Locale.getDefault()).format(new Date(OooO0O04.getTimeInMillis())));
    }
}