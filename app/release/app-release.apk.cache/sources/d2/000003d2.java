package com.google.android.material.datepicker;

import OooOooO.o0000oo;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OooO0OO implements Parcelable {
    public static final Parcelable.Creator<OooO0OO> CREATOR = new androidx.activity.result.OooO00o(12);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o00O0O f3365OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o00O0O f3366OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooO0O0 f3367OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o00O0O f3368OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f3369OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f3370OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f3371OooO0oO;

    public OooO0OO(o00O0O o00o0o, o00O0O o00o0o2, OooO0O0 oooO0O0, o00O0O o00o0o3, int i) {
        Objects.requireNonNull(o00o0o, "start cannot be null");
        Objects.requireNonNull(o00o0o2, "end cannot be null");
        Objects.requireNonNull(oooO0O0, "validator cannot be null");
        this.f3365OooO00o = o00o0o;
        this.f3366OooO0O0 = o00o0o2;
        this.f3368OooO0Oo = o00o0o3;
        this.f3370OooO0o0 = i;
        this.f3367OooO0OO = oooO0O0;
        Calendar calendar = o00o0o.f3426OooO00o;
        if (o00o0o3 != null && calendar.compareTo(o00o0o3.f3426OooO00o) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (o00o0o3 != null && o00o0o3.f3426OooO00o.compareTo(o00o0o2.f3426OooO00o) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0 && i <= o0Oo0oo.OooO0Oo(null).getMaximum(7)) {
            if (calendar instanceof GregorianCalendar) {
                int i2 = o00o0o2.f3428OooO0OO;
                int i3 = o00o0o.f3428OooO0OO;
                this.f3371OooO0oO = (o00o0o2.f3427OooO0O0 - o00o0o.f3427OooO0O0) + ((i2 - i3) * 12) + 1;
                this.f3369OooO0o = (i2 - i3) + 1;
                return;
            }
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooO0OO)) {
            return false;
        }
        OooO0OO oooO0OO = (OooO0OO) obj;
        if (this.f3365OooO00o.equals(oooO0OO.f3365OooO00o) && this.f3366OooO0O0.equals(oooO0OO.f3366OooO0O0) && o0000oo.OooO00o(this.f3368OooO0Oo, oooO0OO.f3368OooO0Oo) && this.f3370OooO0o0 == oooO0OO.f3370OooO0o0 && this.f3367OooO0OO.equals(oooO0OO.f3367OooO0OO)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3365OooO00o, this.f3366OooO0O0, this.f3368OooO0Oo, Integer.valueOf(this.f3370OooO0o0), this.f3367OooO0OO});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3365OooO00o, 0);
        parcel.writeParcelable(this.f3366OooO0O0, 0);
        parcel.writeParcelable(this.f3368OooO0Oo, 0);
        parcel.writeParcelable(this.f3367OooO0OO, 0);
        parcel.writeInt(this.f3370OooO0o0);
    }
}