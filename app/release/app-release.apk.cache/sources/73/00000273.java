package androidx.activity.result;

import Oooo0.OooOo;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.o000Oo0;
import androidx.fragment.app.o0000O;
import androidx.fragment.app.o0000O0;
import androidx.fragment.app.o0000Ooo;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.o00O0O;
import com.google.android.material.timepicker.OooOO0O;
import o00000.o000;
import o000oOoO.o00O00;
import o000oOoO.o00O000o;
import o000oOoO.o0OO00O;

/* loaded from: classes.dex */
public final class OooO00o implements Parcelable.Creator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f1977OooO00o;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f1977OooO00o) {
            case 0:
                return new OooO0O0(parcel);
            case 1:
                return new o000Oo0(parcel);
            case 2:
                return new OooOo(parcel);
            case 3:
                return new androidx.fragment.app.OooO0O0(parcel);
            case 4:
                return new o0000Ooo(parcel);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new o0000O0(parcel);
            case 6:
                return new o0000O(parcel);
            case 7:
                return new o0OO00O(parcel);
            case 8:
                return new o00O000o(parcel);
            case 9:
                return new o00O00(parcel);
            case 10:
                return new ParcelImpl(parcel);
            case 11:
                return new o0OoOo0.OooO0O0(parcel);
            case 12:
                return new com.google.android.material.datepicker.OooO0OO((o00O0O) parcel.readParcelable(o00O0O.class.getClassLoader()), (o00O0O) parcel.readParcelable(o00O0O.class.getClassLoader()), (com.google.android.material.datepicker.OooO0O0) parcel.readParcelable(com.google.android.material.datepicker.OooO0O0.class.getClassLoader()), (o00O0O) parcel.readParcelable(o00O0O.class.getClassLoader()), parcel.readInt());
            case 13:
                return new com.google.android.material.datepicker.OooO(parcel.readLong());
            case 14:
                return o00O0O.OooO00o(parcel.readInt(), parcel.readInt());
            default:
                return new OooOO0O(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f1977OooO00o) {
            case 0:
                return new OooO0O0[i];
            case 1:
                return new o000Oo0[i];
            case 2:
                return new OooOo[i];
            case 3:
                return new androidx.fragment.app.OooO0O0[i];
            case 4:
                return new o0000Ooo[i];
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new o0000O0[i];
            case 6:
                return new o0000O[i];
            case 7:
                return new o0OO00O[i];
            case 8:
                return new o00O000o[i];
            case 9:
                return new o00O00[i];
            case 10:
                return new ParcelImpl[i];
            case 11:
                return new o0OoOo0.OooO0O0[i];
            case 12:
                return new com.google.android.material.datepicker.OooO0OO[i];
            case 13:
                return new com.google.android.material.datepicker.OooO[i];
            case 14:
                return new o00O0O[i];
            default:
                return new OooOO0O[i];
        }
    }
}