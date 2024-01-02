package OooooOo;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class oO00OOO extends o00OOOOo {
    public static final Parcelable.Creator<oO00OOO> CREATOR = new o0O0oo0o(5);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f1830OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f1831OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public float f1832OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f1833OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public boolean f1834OooO0oO;

    public oO00OOO(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1830OooO0OO = parcel.readByte() != 0;
        this.f1831OooO0Oo = parcel.readByte() != 0;
        this.f1833OooO0o0 = parcel.readInt();
        this.f1832OooO0o = parcel.readFloat();
        this.f1834OooO0oO = parcel.readByte() != 0;
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeByte(this.f1830OooO0OO ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f1831OooO0Oo ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f1833OooO0o0);
        parcel.writeFloat(this.f1832OooO0o);
        parcel.writeByte(this.f1834OooO0oO ? (byte) 1 : (byte) 0);
    }
}