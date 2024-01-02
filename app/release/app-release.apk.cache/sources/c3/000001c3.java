package Oooo0OO;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public abstract class o00OOOOo implements Parcelable {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final Parcelable f1456OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final o00OOOO0 f1455OooO0O0 = new o00OOOO0();
    public static final Parcelable.Creator<o00OOOOo> CREATOR = new o0O0oo0o(3);

    public o00OOOOo() {
        this.f1456OooO00o = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
    }

    public o00OOOOo(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1456OooO00o = readParcelable == null ? f1455OooO0O0 : readParcelable;
    }

    public o00OOOOo(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1456OooO00o = parcelable == f1455OooO0O0 ? null : parcelable;
    }
}