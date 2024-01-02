package o00o0O;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class OooO0O0 extends o00OOOOo {
    public static final Parcelable.Creator<OooO0O0> CREATOR = new o0O0oo0o(8);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f5204OooO0OO;

    public OooO0O0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5204OooO0OO = parcel.readInt() == 1;
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeInt(this.f5204OooO0OO ? 1 : 0);
    }
}