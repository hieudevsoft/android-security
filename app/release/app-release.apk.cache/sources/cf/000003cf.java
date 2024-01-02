package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooO implements OooO0O0 {
    public static final Parcelable.Creator<OooO> CREATOR = new androidx.activity.result.OooO00o(13);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final long f3357OooO00o;

    public OooO(long j) {
        this.f3357OooO00o = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OooO) && this.f3357OooO00o == ((OooO) obj).f3357OooO00o;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3357OooO00o)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3357OooO00o);
    }
}