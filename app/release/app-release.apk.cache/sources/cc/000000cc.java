package OooOOoo;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class o0OOO0o extends o00OOOOo {
    public static final Parcelable.Creator<o0OOO0o> CREATOR = new o0O0oo0o(2);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public SparseArray f1103OooO0OO;

    public o0OOO0o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f1103OooO0OO = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f1103OooO0OO.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeParcelable(this.f1456OooO00o, i);
        SparseArray sparseArray = this.f1103OooO0OO;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.f1103OooO0OO.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f1103OooO0OO.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}