package Oooooo;

import Oooo0OO.o00OOOOo;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import androidx.appcompat.widget.o0O0oo0o;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class o00000 extends o00OOOOo {
    public static final Parcelable.Creator<o00000> CREATOR = new o0O0oo0o(6);

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f1846OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f1847OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final boolean f1848OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final boolean f1849OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f1850OooO0oO;

    public o00000(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1846OooO0OO = parcel.readInt();
        this.f1847OooO0Oo = parcel.readInt();
        this.f1849OooO0o0 = parcel.readInt() == 1;
        this.f1848OooO0o = parcel.readInt() == 1;
        this.f1850OooO0oO = parcel.readInt() == 1;
    }

    @Override // Oooo0OO.o00OOOOo, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1456OooO00o, i);
        parcel.writeInt(this.f1846OooO0OO);
        parcel.writeInt(this.f1847OooO0Oo);
        parcel.writeInt(this.f1849OooO0o0 ? 1 : 0);
        parcel.writeInt(this.f1848OooO0o ? 1 : 0);
        parcel.writeInt(this.f1850OooO0oO ? 1 : 0);
    }

    public o00000(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f1846OooO0OO = bottomSheetBehavior.f3292Oooo0o0;
        this.f1847OooO0Oo = bottomSheetBehavior.f3260OooO0o0;
        this.f1849OooO0o0 = bottomSheetBehavior.f3256OooO0O0;
        this.f1848OooO0o = bottomSheetBehavior.f3285Oooo0;
        this.f1850OooO0oO = bottomSheetBehavior.f3289Oooo0O0;
    }
}