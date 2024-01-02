package o000oOoO;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class o000O0 extends o00OOOOo {
    public static final Parcelable.Creator<o000O0> CREATOR = new o0O0oo0o(4);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Parcelable f4972OooO0OO;

    public o000O0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f4972OooO0OO = parcel.readParcelable(classLoader == null ? o000OO.class.getClassLoader() : classLoader);
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeParcelable(this.f4972OooO0OO, 0);
    }
}