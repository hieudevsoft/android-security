package o000oOoO;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class o00O000o implements Parcelable {
    public static final Parcelable.Creator<o00O000o> CREATOR = new androidx.activity.result.OooO00o(8);

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5063OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5064OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int[] f5065OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5066OooO0Oo;

    public o00O000o(Parcel parcel) {
        this.f5063OooO00o = parcel.readInt();
        this.f5064OooO0O0 = parcel.readInt();
        this.f5066OooO0Oo = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f5065OooO0OO = iArr;
            parcel.readIntArray(iArr);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f5063OooO00o + ", mGapDir=" + this.f5064OooO0O0 + ", mHasUnwantedGapAfter=" + this.f5066OooO0Oo + ", mGapPerSpan=" + Arrays.toString(this.f5065OooO0OO) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5063OooO00o);
        parcel.writeInt(this.f5064OooO0O0);
        parcel.writeInt(this.f5066OooO0Oo ? 1 : 0);
        int[] iArr = this.f5065OooO0OO;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(iArr.length);
        parcel.writeIntArray(this.f5065OooO0OO);
    }
}