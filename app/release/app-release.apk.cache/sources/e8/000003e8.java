package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import hieubui.eup.android_app_security.R;
import java.util.Locale;
import o000oOoO.o00000O;
import o000oOoO.o000OOo0;

/* loaded from: classes.dex */
public final class oo0o0Oo extends o00000O {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Oooo000 f3450OooO0OO;

    public oo0o0Oo(Oooo000 oooo000) {
        this.f3450OooO0OO = oooo000;
    }

    @Override // o000oOoO.o00000O
    public final int OooO00o() {
        return this.f3450OooO0OO.f3395OoooOO0.f3369OooO0o;
    }

    @Override // o000oOoO.o00000O
    public final void OooO0OO(o000OOo0 o000ooo0, int i) {
        String format;
        Oooo000 oooo000 = this.f3450OooO0OO;
        int i2 = oooo000.f3395OoooOO0.f3365OooO00o.f3428OooO0OO + i;
        String format2 = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
        TextView textView = ((o0OO00O) o000ooo0).f3443OooOo00;
        textView.setText(format2);
        Context context = textView.getContext();
        if (o0Oo0oo.OooO0OO().get(1) == i2) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i2));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i2));
        }
        textView.setContentDescription(format);
        OooO0o oooO0o = oooo000.f3397OoooOOo;
        if (o0Oo0oo.OooO0OO().get(1) == i2) {
            androidx.appcompat.widget.o00Oo0 o00oo0 = oooO0o.f3373OooO0O0;
        } else {
            androidx.appcompat.widget.o00Oo0 o00oo02 = oooO0o.f3372OooO00o;
        }
        throw null;
    }

    @Override // o000oOoO.o00000O
    public final o000OOo0 OooO0Oo(RecyclerView recyclerView) {
        return new o0OO00O((TextView) LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.mtrl_calendar_year, (ViewGroup) recyclerView, false));
    }
}