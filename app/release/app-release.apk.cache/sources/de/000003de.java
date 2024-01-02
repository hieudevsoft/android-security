package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* loaded from: classes.dex */
public final class o00O0O implements Comparable, Parcelable {
    public static final Parcelable.Creator<o00O0O> CREATOR = new androidx.activity.result.OooO00o(14);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Calendar f3426OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f3427OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3428OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3429OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final long f3430OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f3431OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public String f3432OooO0oO;

    public o00O0O(Calendar calendar) {
        calendar.set(5, 1);
        Calendar OooO0O02 = o0Oo0oo.OooO0O0(calendar);
        this.f3426OooO00o = OooO0O02;
        this.f3427OooO0O0 = OooO0O02.get(2);
        this.f3428OooO0OO = OooO0O02.get(1);
        this.f3429OooO0Oo = OooO0O02.getMaximum(7);
        this.f3431OooO0o0 = OooO0O02.getActualMaximum(5);
        this.f3430OooO0o = OooO0O02.getTimeInMillis();
    }

    public static o00O0O OooO00o(int i, int i2) {
        Calendar OooO0Oo2 = o0Oo0oo.OooO0Oo(null);
        OooO0Oo2.set(1, i);
        OooO0Oo2.set(2, i2);
        return new o00O0O(OooO0Oo2);
    }

    public static o00O0O OooO0O0(long j) {
        Calendar OooO0Oo2 = o0Oo0oo.OooO0Oo(null);
        OooO0Oo2.setTimeInMillis(j);
        return new o00O0O(OooO0Oo2);
    }

    public final String OooO0OO() {
        if (this.f3432OooO0oO == null) {
            this.f3432OooO0oO = o0Oo0oo.OooO00o("yMMMM", Locale.getDefault()).format(new Date(this.f3426OooO00o.getTimeInMillis()));
        }
        return this.f3432OooO0oO;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3426OooO00o.compareTo(((o00O0O) obj).f3426OooO00o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o00O0O) {
            o00O0O o00o0o = (o00O0O) obj;
            return this.f3427OooO0O0 == o00o0o.f3427OooO0O0 && this.f3428OooO0OO == o00o0o.f3428OooO0OO;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3427OooO0O0), Integer.valueOf(this.f3428OooO0OO)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3428OooO0OO);
        parcel.writeInt(this.f3427OooO0O0);
    }
}