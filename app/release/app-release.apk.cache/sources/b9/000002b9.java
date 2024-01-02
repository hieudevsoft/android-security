package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class o000Oo0 extends View.BaseSavedState {
    public static final Parcelable.Creator<o000Oo0> CREATOR = new androidx.activity.result.OooO00o(1);

    /* renamed from: OooO00o  reason: collision with root package name */
    public boolean f2315OooO00o;

    public o000Oo0(Parcel parcel) {
        super(parcel);
        this.f2315OooO00o = parcel.readByte() != 0;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f2315OooO00o ? (byte) 1 : (byte) 0);
    }
}