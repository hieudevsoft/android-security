package o000oOoO;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class o00O00 implements Parcelable {
    public static final Parcelable.Creator<o00O00> CREATOR = new androidx.activity.result.OooO00o(9);

    /* renamed from: OooO  reason: collision with root package name */
    public boolean f5050OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5051OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f5052OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f5053OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int[] f5054OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int[] f5055OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f5056OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public List f5057OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f5058OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public boolean f5059OooOO0;

    public o00O00(Parcel parcel) {
        this.f5051OooO00o = parcel.readInt();
        this.f5052OooO0O0 = parcel.readInt();
        int readInt = parcel.readInt();
        this.f5053OooO0OO = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.f5054OooO0Oo = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.f5056OooO0o0 = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.f5055OooO0o = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.f5058OooO0oo = parcel.readInt() == 1;
        this.f5050OooO = parcel.readInt() == 1;
        this.f5059OooOO0 = parcel.readInt() == 1;
        this.f5057OooO0oO = parcel.readArrayList(o00O000o.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f5051OooO00o);
        parcel.writeInt(this.f5052OooO0O0);
        parcel.writeInt(this.f5053OooO0OO);
        if (this.f5053OooO0OO > 0) {
            parcel.writeIntArray(this.f5054OooO0Oo);
        }
        parcel.writeInt(this.f5056OooO0o0);
        if (this.f5056OooO0o0 > 0) {
            parcel.writeIntArray(this.f5055OooO0o);
        }
        parcel.writeInt(this.f5058OooO0oo ? 1 : 0);
        parcel.writeInt(this.f5050OooO ? 1 : 0);
        parcel.writeInt(this.f5059OooOO0 ? 1 : 0);
        parcel.writeList(this.f5057OooO0oO);
    }

    public o00O00(o00O00 o00o00) {
        this.f5053OooO0OO = o00o00.f5053OooO0OO;
        this.f5051OooO00o = o00o00.f5051OooO00o;
        this.f5052OooO0O0 = o00o00.f5052OooO0O0;
        this.f5054OooO0Oo = o00o00.f5054OooO0Oo;
        this.f5056OooO0o0 = o00o00.f5056OooO0o0;
        this.f5055OooO0o = o00o00.f5055OooO0o;
        this.f5058OooO0oo = o00o00.f5058OooO0oo;
        this.f5050OooO = o00o00.f5050OooO;
        this.f5059OooOO0 = o00o00.f5059OooOO0;
        this.f5057OooO0oO = o00o00.f5057OooO0oO;
    }
}