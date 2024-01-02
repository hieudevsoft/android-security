package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class oo0ooO extends Oooo0OO.o00OOOOo {
    public static final Parcelable.Creator<oo0ooO> CREATOR = new o0O0oo0o(1);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f2581OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f2582OooO0Oo;

    public oo0ooO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2581OooO0OO = parcel.readInt();
        this.f2582OooO0Oo = parcel.readInt() != 0;
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeInt(this.f2581OooO0OO);
        parcel.writeInt(this.f2582OooO0Oo ? 1 : 0);
    }
}