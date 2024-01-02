package o0OoOo0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class OooO0O0 extends View.BaseSavedState {
    public static final Parcelable.Creator<OooO0O0> CREATOR = new androidx.activity.result.OooO00o(11);

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f5440OooO00o;

    public OooO0O0(Parcel parcel) {
        super(parcel);
        this.f5440OooO00o = ((Integer) parcel.readValue(OooO0O0.class.getClassLoader())).intValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f5440OooO00o;
        if (i != 1) {
            if (i != 2) {
                str = "unchecked";
            } else {
                str = "indeterminate";
            }
        } else {
            str = "checked";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f5440OooO00o));
    }
}