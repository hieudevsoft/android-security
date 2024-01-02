package OoooooO;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class oOOoOOO0 extends o00OOOOo {
    public static final Parcelable.Creator<oOOoOOO0> CREATOR = new o0O0oo0o(7);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1893OooO0OO;

    public oOOoOOO0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            oOOoOOO0.class.getClassLoader();
        }
        this.f1893OooO0OO = parcel.readInt() == 1;
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeInt(this.f1893OooO0OO ? 1 : 0);
    }
}