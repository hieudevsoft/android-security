package com.google.android.material.timepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class OooOO0O implements Parcelable {
    public static final Parcelable.Creator<OooOO0O> CREATOR = new androidx.activity.result.OooO00o(15);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f3604OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f3605OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3606OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f3607OooO0Oo;

    public OooOO0O(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int readInt3 = parcel.readInt();
        int readInt4 = parcel.readInt();
        this.f3605OooO0O0 = readInt;
        this.f3606OooO0OO = readInt2;
        this.f3607OooO0Oo = readInt3;
        this.f3604OooO00o = readInt4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OooOO0O) {
            OooOO0O oooOO0O = (OooOO0O) obj;
            return this.f3605OooO0O0 == oooOO0O.f3605OooO0O0 && this.f3606OooO0OO == oooOO0O.f3606OooO0OO && this.f3604OooO00o == oooOO0O.f3604OooO00o && this.f3607OooO0Oo == oooOO0O.f3607OooO0Oo;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3604OooO00o), Integer.valueOf(this.f3605OooO0O0), Integer.valueOf(this.f3606OooO0OO), Integer.valueOf(this.f3607OooO0Oo)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3605OooO0O0);
        parcel.writeInt(this.f3606OooO0OO);
        parcel.writeInt(this.f3607OooO0Oo);
        parcel.writeInt(this.f3604OooO00o);
    }
}