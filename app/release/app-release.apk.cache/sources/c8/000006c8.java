package o0OOO0o;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.o0O0oo0o;

/* loaded from: classes.dex */
public final class oo0o0Oo extends o00OOOOo {
    public static final Parcelable.Creator<oo0o0Oo> CREATOR = new o0O0oo0o(10);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public CharSequence f5436OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f5437OooO0Oo;

    public oo0o0Oo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5436OooO0OO = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f5437OooO0Oo = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f5436OooO0OO) + "}";
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        TextUtils.writeToParcel(this.f5436OooO0OO, parcel, i);
        parcel.writeInt(this.f5437OooO0Oo ? 1 : 0);
    }
}