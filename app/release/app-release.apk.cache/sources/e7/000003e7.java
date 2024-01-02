package com.google.android.material.datepicker;

import OooOooo.o00O00o0;
import OooOooo.o0o0Oo;
import android.widget.LinearLayout;
import android.widget.TextView;
import hieubui.eup.android_app_security.R;
import java.util.WeakHashMap;
import o000oOoO.o000OOo0;

/* loaded from: classes.dex */
public final class oo000o extends o000OOo0 {

    /* renamed from: OooOo0  reason: collision with root package name */
    public final MaterialCalendarGridView f3448OooOo0;

    /* renamed from: OooOo00  reason: collision with root package name */
    public final TextView f3449OooOo00;

    public oo000o(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f3449OooOo00 = textView;
        WeakHashMap weakHashMap = o0o0Oo.f1363OooO00o;
        new o00O00o0(R.id.tag_accessibility_heading, 3).OooO0OO(textView, Boolean.TRUE);
        this.f3448OooOo0 = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z) {
            textView.setVisibility(8);
        }
    }
}