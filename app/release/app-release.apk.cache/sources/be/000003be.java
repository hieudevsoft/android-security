package androidx.versionedparcelable;

import Ooooo0o.o000;
import Ooooo0o.o000O000;
import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.OooO00o;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new OooO00o(10);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000O000 f3230OooO00o;

    public ParcelImpl(Parcel parcel) {
        this.f3230OooO00o = new o000(parcel).OooO0oo();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new o000(parcel).OooOO0(this.f3230OooO00o);
    }
}