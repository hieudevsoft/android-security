package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0O0O0Oo extends Oooo0OO.o00OOOOo {
    public static final Parcelable.Creator<o0O0O0Oo> CREATOR = new o0O0oo0o(0);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f2442OooO0OO;

    public o0O0O0Oo(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2442OooO0OO = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f2442OooO0OO + "}";
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeValue(Boolean.valueOf(this.f2442OooO0OO));
    }
}