package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class o00Ooo implements AdapterView.OnItemClickListener {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f3438OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final /* synthetic */ o00oO0o f3439OooO0O0;

    public o00Ooo(o00oO0o o00oo0o, MaterialCalendarGridView materialCalendarGridView) {
        this.f3439OooO0O0 = o00oo0o;
        this.f3438OooO00o = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        o00Oo0 adapter2;
        boolean z;
        MaterialCalendarGridView materialCalendarGridView = this.f3438OooO00o;
        boolean z2 = true;
        if (i >= materialCalendarGridView.getAdapter2().OooO00o() && i <= (adapter2.OooO00o() + adapter2.f3435OooO00o.f3431OooO0o0) - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (materialCalendarGridView.getAdapter2().getItem(i).longValue() < ((OooO) ((Oooo000) this.f3439OooO0O0.f3441OooO0Oo.f183OooO0O0).f3395OoooOO0.f3367OooO0OO).f3357OooO00o) {
                z2 = false;
            }
            if (z2) {
                throw null;
            }
        }
    }
}