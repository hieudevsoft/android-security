package o0ooOOo;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.o0O0oo0o;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes.dex */
public final class OooO0o extends o00OOOOo {
    public static final Parcelable.Creator<OooO0o> CREATOR = new o0O0oo0o(9);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f5583OooO0OO;

    public OooO0o(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5583OooO0OO = parcel.readInt();
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeInt(this.f5583OooO0OO);
    }

    public OooO0o(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f5583OooO0OO = sideSheetBehavior.f3477OooO0oo;
    }
}