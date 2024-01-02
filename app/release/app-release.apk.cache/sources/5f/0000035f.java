package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0000Ooo implements Parcelable {
    public static final Parcelable.Creator<o0000Ooo> CREATOR = new androidx.activity.result.OooO00o(4);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f2861OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f2862OooO0O0;

    public o0000Ooo(Parcel parcel) {
        this.f2861OooO00o = parcel.readString();
        this.f2862OooO0O0 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2861OooO00o);
        parcel.writeInt(this.f2862OooO0O0);
    }
}