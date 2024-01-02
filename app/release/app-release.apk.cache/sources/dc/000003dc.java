package com.google.android.material.datepicker;

import OooO0Oo.o0000OO0;
import OooOooo.o0o0Oo;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import hieubui.eup.android_app_security.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import o000oOoO.o000000O;
import o000oOoO.o0O0ooO;

/* loaded from: classes.dex */
public final class Oooo000<S> extends o0ooOOo {

    /* renamed from: OooooOO  reason: collision with root package name */
    public static final /* synthetic */ int f3393OooooOO = 0;

    /* renamed from: OoooO  reason: collision with root package name */
    public int f3394OoooO;

    /* renamed from: OoooOO0  reason: collision with root package name */
    public OooO0OO f3395OoooOO0;

    /* renamed from: OoooOOO  reason: collision with root package name */
    public int f3396OoooOOO;

    /* renamed from: OoooOOo  reason: collision with root package name */
    public OooO0o f3397OoooOOo;

    /* renamed from: OoooOo0  reason: collision with root package name */
    public RecyclerView f3398OoooOo0;
    public RecyclerView OoooOoO;

    /* renamed from: OoooOoo  reason: collision with root package name */
    public View f3399OoooOoo;

    /* renamed from: Ooooo00  reason: collision with root package name */
    public View f3400Ooooo00;

    /* renamed from: Ooooo0o  reason: collision with root package name */
    public View f3401Ooooo0o;

    /* renamed from: OooooO0  reason: collision with root package name */
    public View f3402OooooO0;

    /* renamed from: o000oOoO  reason: collision with root package name */
    public o00O0O f3403o000oOoO;

    @Override // androidx.fragment.app.o00Oo0
    public final View OooOOo(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        int i2;
        OooOO0 oooOO0;
        o000000O o000000o2;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(OooO(), this.f3394OoooO);
        this.f3397OoooOOo = new OooO0o(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        o00O0O o00o0o = this.f3395OoooOO0.f3365OooO00o;
        if (o000oOoO.Oooo0OO(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        Resources resources = OooOoo0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
        int i3 = o00Oo0.f3433OooO0Oo;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        o0o0Oo.OooOO0o(gridView, new OooOOO(0, this));
        int i4 = this.f3395OoooOO0.f3370OooO0o0;
        if (i4 > 0) {
            oooOO0 = new OooOO0(i4);
        } else {
            oooOO0 = new OooOO0();
        }
        gridView.setAdapter((ListAdapter) oooOO0);
        gridView.setNumColumns(o00o0o.f3429OooO0Oo);
        gridView.setEnabled(false);
        this.OoooOoO = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        OooO();
        this.OoooOoO.setLayoutManager(new OooOOOO(this, i2, i2));
        this.OoooOoO.setTag("MONTHS_VIEW_GROUP_TAG");
        o00oO0o o00oo0o = new o00oO0o(contextThemeWrapper, this.f3395OoooOO0, new o0000OO0(26, this));
        this.OoooOoO.setAdapter(o00oo0o);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.f3398OoooOo0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.f3398OoooOo0.setLayoutManager(new GridLayoutManager(integer));
            this.f3398OoooOo0.setAdapter(new oo0o0Oo(this));
            this.f3398OoooOo0.OooO0oO(new OooOo00(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            o0o0Oo.OooOO0o(materialButton, new OooOOO(2, this));
            View findViewById = inflate.findViewById(R.id.month_navigation_previous);
            this.f3399OoooOoo = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(R.id.month_navigation_next);
            this.f3400Ooooo00 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f3401Ooooo0o = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.f3402OooooO0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            Oooo00o(1);
            materialButton.setText(this.f3403o000oOoO.OooO0OO());
            this.OoooOoO.OooO0oo(new OooOo(this, o00oo0o, materialButton));
            materialButton.setOnClickListener(new OooO0Oo.OooO0OO(2, this));
            this.f3400Ooooo00.setOnClickListener(new OooOO0O(this, o00oo0o, 1));
            this.f3399OoooOoo.setOnClickListener(new OooOO0O(this, o00oo0o, 0));
        }
        if (!o000oOoO.Oooo0OO(contextThemeWrapper) && (recyclerView2 = (o000000o2 = new o000000O()).f4947OooO00o) != (recyclerView = this.OoooOoO)) {
            o0O0ooO o0o0ooo = o000000o2.f4948OooO0O0;
            if (recyclerView2 != null) {
                ArrayList arrayList = recyclerView2.f3193Ooooo00;
                if (arrayList != null) {
                    arrayList.remove(o0o0ooo);
                }
                o000000o2.f4947OooO00o.setOnFlingListener(null);
            }
            o000000o2.f4947OooO00o = recyclerView;
            if (recyclerView != null) {
                if (recyclerView.getOnFlingListener() == null) {
                    o000000o2.f4947OooO00o.OooO0oo(o0o0ooo);
                    o000000o2.f4947OooO00o.setOnFlingListener(o000000o2);
                    new Scroller(o000000o2.f4947OooO00o.getContext(), new DecelerateInterpolator());
                    o000000o2.OooO0o0();
                } else {
                    throw new IllegalStateException("An instance of OnFlingListener already set.");
                }
            }
        }
        RecyclerView recyclerView4 = this.OoooOoO;
        o00O0O o00o0o2 = this.f3403o000oOoO;
        o00O0O o00o0o3 = o00oo0o.f3440OooO0OO.f3365OooO00o;
        if (o00o0o3.f3426OooO00o instanceof GregorianCalendar) {
            recyclerView4.OoooOoO((o00o0o2.f3427OooO0O0 - o00o0o3.f3427OooO0O0) + ((o00o0o2.f3428OooO0OO - o00o0o3.f3428OooO0OO) * 12));
            o0o0Oo.OooOO0o(this.OoooOoO, new OooOOO(1, this));
            return inflate;
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOOo0(Bundle bundle) {
        super.OooOOo0(bundle);
        if (bundle == null) {
            bundle = this.f2955OooO0o;
        }
        this.f3394OoooO = bundle.getInt("THEME_RES_ID_KEY");
        OooO0O0.OooO00o.OooO0o(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f3395OoooOO0 = (OooO0OO) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        OooO0O0.OooO00o.OooO0o(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f3403o000oOoO = (o00O0O) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.o00Oo0
    public final void OooOo0O(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3394OoooO);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3395OoooOO0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f3403o000oOoO);
    }

    public final void Oooo000(int i) {
        this.OoooOoO.post(new OooOOO0(this, i));
    }

    public final void Oooo00O(o00O0O o00o0o) {
        boolean z;
        RecyclerView recyclerView;
        int i;
        o00O0O o00o0o2 = ((o00oO0o) this.OoooOoO.getAdapter()).f3440OooO0OO.f3365OooO00o;
        Calendar calendar = o00o0o2.f3426OooO00o;
        if (calendar instanceof GregorianCalendar) {
            int i2 = o00o0o.f3428OooO0OO;
            int i3 = o00o0o2.f3428OooO0OO;
            int i4 = o00o0o.f3427OooO0O0;
            int i5 = o00o0o2.f3427OooO0O0;
            int i6 = (i4 - i5) + ((i2 - i3) * 12);
            o00O0O o00o0o3 = this.f3403o000oOoO;
            if (calendar instanceof GregorianCalendar) {
                int i7 = i6 - ((o00o0o3.f3427OooO0O0 - i5) + ((o00o0o3.f3428OooO0OO - i3) * 12));
                boolean z2 = true;
                if (Math.abs(i7) > 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (i7 <= 0) {
                    z2 = false;
                }
                this.f3403o000oOoO = o00o0o;
                if (z && z2) {
                    recyclerView = this.OoooOoO;
                    i = i6 - 3;
                } else {
                    if (z) {
                        recyclerView = this.OoooOoO;
                        i = i6 + 3;
                    }
                    Oooo000(i6);
                    return;
                }
                recyclerView.OoooOoO(i);
                Oooo000(i6);
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final void Oooo00o(int i) {
        this.f3396OoooOOO = i;
        if (i == 2) {
            this.f3398OoooOo0.getLayoutManager().ooOO(this.f3403o000oOoO.f3428OooO0OO - ((oo0o0Oo) this.f3398OoooOo0.getAdapter()).f3450OooO0OO.f3395OoooOO0.f3365OooO00o.f3428OooO0OO);
            this.f3401Ooooo0o.setVisibility(0);
            this.f3402OooooO0.setVisibility(8);
            this.f3399OoooOoo.setVisibility(8);
            this.f3400Ooooo00.setVisibility(8);
        } else if (i == 1) {
            this.f3401Ooooo0o.setVisibility(8);
            this.f3402OooooO0.setVisibility(0);
            this.f3399OoooOoo.setVisibility(0);
            this.f3400Ooooo00.setVisibility(0);
            Oooo00O(this.f3403o000oOoO);
        }
    }
}