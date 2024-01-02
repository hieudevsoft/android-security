package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class o0OoOo0<S> extends o0ooOOo {

    /* renamed from: OoooO  reason: collision with root package name */
    public int f3445OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public OooO0OO f3446OoooOO0;

    @Override // androidx.fragment.app.o00Oo0
    public final View OooOOo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(OooO(), this.f3445OoooO));
        throw null;
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOOo0(Bundle bundle) {
        super.OooOOo0(bundle);
        if (bundle == null) {
            bundle = this.f2955OooO0o;
        }
        this.f3445OoooO = bundle.getInt("THEME_RES_ID_KEY");
        OooO0O0.OooO00o.OooO0o(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f3446OoooOO0 = (OooO0OO) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOo0O(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3445OoooO);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3446OoooOO0);
    }
}