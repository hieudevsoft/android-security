package com.google.android.material.datepicker;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class o00Oo0 extends BaseAdapter {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final int f3433OooO0Oo = o0Oo0oo.OooO0Oo(null).getMaximum(4);

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final int f3434OooO0o0 = (o0Oo0oo.OooO0Oo(null).getMaximum(7) + o0Oo0oo.OooO0Oo(null).getMaximum(5)) - 1;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00O0O f3435OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public OooO0o f3436OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooO0OO f3437OooO0OO;

    public o00Oo0(o00O0O o00o0o, OooO0OO oooO0OO) {
        this.f3435OooO00o = o00o0o;
        this.f3437OooO0OO = oooO0OO;
        throw null;
    }

    public final int OooO00o() {
        int i = this.f3437OooO0OO.f3370OooO0o0;
        o00O0O o00o0o = this.f3435OooO00o;
        Calendar calendar = o00o0o.f3426OooO00o;
        int i2 = calendar.get(7);
        if (i <= 0) {
            i = calendar.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            return i3 + o00o0o.f3429OooO0Oo;
        }
        return i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: OooO0O0 */
    public final Long getItem(int i) {
        if (i >= OooO00o()) {
            int OooO00o2 = OooO00o();
            o00O0O o00o0o = this.f3435OooO00o;
            if (i <= (OooO00o2 + o00o0o.f3431OooO0o0) - 1) {
                Calendar OooO0O02 = o0Oo0oo.OooO0O0(o00o0o.f3426OooO00o);
                OooO0O02.set(5, (i - OooO00o()) + 1);
                return Long.valueOf(OooO0O02.getTimeInMillis());
            }
            return null;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f3434OooO0o0;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i / this.f3435OooO00o.f3429OooO0Oo;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View getView(int r5, android.view.View r6, android.view.ViewGroup r7) {
        /*
            r4 = this;
            android.content.Context r0 = r7.getContext()
            com.google.android.material.datepicker.OooO0o r1 = r4.f3436OooO0O0
            if (r1 != 0) goto Lf
            com.google.android.material.datepicker.OooO0o r1 = new com.google.android.material.datepicker.OooO0o
            r1.<init>(r0)
            r4.f3436OooO0O0 = r1
        Lf:
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r6 != 0) goto L27
            android.content.Context r6 = r7.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r0 = 2131427401(0x7f0b0049, float:1.8476417E38)
            android.view.View r6 = r6.inflate(r0, r7, r1)
            r0 = r6
            android.widget.TextView r0 = (android.widget.TextView) r0
        L27:
            int r6 = r4.OooO00o()
            int r6 = r5 - r6
            if (r6 < 0) goto L5d
            com.google.android.material.datepicker.o00O0O r7 = r4.f3435OooO00o
            int r2 = r7.f3431OooO0o0
            if (r6 < r2) goto L36
            goto L5d
        L36:
            r2 = 1
            int r6 = r6 + r2
            r0.setTag(r7)
            android.content.res.Resources r7 = r0.getResources()
            android.content.res.Configuration r7 = r7.getConfiguration()
            java.util.Locale r7 = r7.locale
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r3 = "%d"
            java.lang.String r6 = java.lang.String.format(r7, r3, r6)
            r0.setText(r6)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L65
        L5d:
            r6 = 8
            r0.setVisibility(r6)
            r0.setEnabled(r1)
        L65:
            java.lang.Long r5 = r4.getItem(r5)
            if (r5 != 0) goto L6c
            goto L71
        L6c:
            r5.longValue()
            if (r0 != 0) goto L72
        L71:
            return r0
        L72:
            r0.getContext()
            java.util.Calendar r5 = com.google.android.material.datepicker.o0Oo0oo.OooO0OO()
            r5.getTimeInMillis()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.o00Oo0.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}