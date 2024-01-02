package com.google.android.material.datepicker;

import OooO0Oo.o0000OO0;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import hieubui.eup.android_app_security.R;
import java.util.Calendar;
import o000oOoO.o00000O;
import o000oOoO.o0000O;
import o000oOoO.o000OOo0;

/* loaded from: classes.dex */
public final class o00oO0o extends o00000O {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooO0OO f3440OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o0000OO0 f3441OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f3442OooO0o0;

    public o00oO0o(ContextThemeWrapper contextThemeWrapper, OooO0OO oooO0OO, o0000OO0 o0000oo02) {
        int i;
        Calendar calendar = oooO0OO.f3365OooO00o.f3426OooO00o;
        o00O0O o00o0o = oooO0OO.f3368OooO0Oo;
        if (calendar.compareTo(o00o0o.f3426OooO00o) <= 0) {
            if (o00o0o.f3426OooO00o.compareTo(oooO0OO.f3366OooO0O0.f3426OooO00o) <= 0) {
                int i2 = o00Oo0.f3433OooO0Oo;
                int i3 = Oooo000.f3393OooooOO;
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i2;
                if (o000oOoO.Oooo0OO(contextThemeWrapper)) {
                    i = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i = 0;
                }
                this.f3442OooO0o0 = dimensionPixelSize + i;
                this.f3440OooO0OO = oooO0OO;
                this.f3441OooO0Oo = o0000oo02;
                if (!this.f4951OooO00o.OooO00o()) {
                    this.f4952OooO0O0 = true;
                    return;
                }
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // o000oOoO.o00000O
    public final int OooO00o() {
        return this.f3440OooO0OO.f3371OooO0oO;
    }

    @Override // o000oOoO.o00000O
    public final long OooO0O0(int i) {
        Calendar OooO0O02 = o0Oo0oo.OooO0O0(this.f3440OooO0OO.f3365OooO00o.f3426OooO00o);
        OooO0O02.add(2, i);
        return new o00O0O(OooO0O02).f3426OooO00o.getTimeInMillis();
    }

    @Override // o000oOoO.o00000O
    public final void OooO0OO(o000OOo0 o000ooo0, int i) {
        oo000o oo000oVar = (oo000o) o000ooo0;
        OooO0OO oooO0OO = this.f3440OooO0OO;
        Calendar OooO0O02 = o0Oo0oo.OooO0O0(oooO0OO.f3365OooO00o.f3426OooO00o);
        OooO0O02.add(2, i);
        o00O0O o00o0o = new o00O0O(OooO0O02);
        oo000oVar.f3449OooOo00.setText(o00o0o.OooO0OO());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) oo000oVar.f3448OooOo0.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter2() != null && o00o0o.equals(materialCalendarGridView.getAdapter2().f3435OooO00o)) {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().getClass();
            throw null;
        }
        new o00Oo0(o00o0o, oooO0OO);
        throw null;
    }

    @Override // o000oOoO.o00000O
    public final o000OOo0 OooO0Oo(RecyclerView recyclerView) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, (ViewGroup) recyclerView, false);
        if (o000oOoO.Oooo0OO(recyclerView.getContext())) {
            linearLayout.setLayoutParams(new o0000O(-1, this.f3442OooO0o0));
            return new oo000o(linearLayout, true);
        }
        return new oo000o(linearLayout, false);
    }
}