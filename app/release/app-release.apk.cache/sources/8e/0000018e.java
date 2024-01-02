package Oooo0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class OooOo extends View.BaseSavedState {
    public static final Parcelable.Creator<OooOo> CREATOR = new androidx.activity.result.OooO00o(2);

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f1412OooO00o;

    public OooOo(Parcel parcel) {
        super(parcel);
        this.f1412OooO00o = parcel.readInt();
    }

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f1412OooO00o + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1412OooO00o);
    }
}