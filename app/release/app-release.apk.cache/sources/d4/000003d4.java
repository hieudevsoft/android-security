package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class OooOO0 extends BaseAdapter {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int f3374OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Calendar f3375OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f3376OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3377OooO0OO;

    static {
        f3374OooO0Oo = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public OooOO0() {
        Calendar OooO0Oo2 = o0Oo0oo.OooO0Oo(null);
        this.f3375OooO00o = OooO0Oo2;
        this.f3376OooO0O0 = OooO0Oo2.getMaximum(7);
        this.f3377OooO0OO = OooO0Oo2.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.f3376OooO0O0;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        int i2 = this.f3376OooO0O0;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.f3377OooO0OO;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i2 = i + this.f3377OooO0OO;
        int i3 = this.f3376OooO0O0;
        if (i2 > i3) {
            i2 -= i3;
        }
        Calendar calendar = this.f3375OooO00o;
        calendar.set(7, i2);
        textView.setText(calendar.getDisplayName(7, f3374OooO0Oo, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public OooOO0(int i) {
        Calendar OooO0Oo2 = o0Oo0oo.OooO0Oo(null);
        this.f3375OooO00o = OooO0Oo2;
        this.f3376OooO0O0 = OooO0Oo2.getMaximum(7);
        this.f3377OooO0OO = i;
    }
}