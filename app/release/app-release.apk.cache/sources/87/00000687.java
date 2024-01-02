package o000oOoO;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0OO00O implements Parcelable {
    public static final Parcelable.Creator<o0OO00O> CREATOR = new androidx.activity.result.OooO00o(7);

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5111OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5112OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f5113OooO0OO;

    public o0OO00O(Parcel parcel) {
        this.f5111OooO00o = parcel.readInt();
        this.f5112OooO0O0 = parcel.readInt();
        this.f5113OooO0OO = parcel.readInt() == 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5111OooO00o);
        parcel.writeInt(this.f5112OooO0O0);
        parcel.writeInt(this.f5113OooO0OO ? 1 : 0);
    }

    public o0OO00O(o0OO00O o0oo00o) {
        this.f5111OooO00o = o0oo00o.f5111OooO00o;
        this.f5112OooO0O0 = o0oo00o.f5112OooO0O0;
        this.f5113OooO0OO = o0oo00o.f5113OooO0OO;
    }
}