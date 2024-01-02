package androidx.appcompat.widget;

import OooooOo.oO00OOO;
import OoooooO.oOOoOOO0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0O0oo0o implements Parcelable.ClassLoaderCreator {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f2480OooO00o;

    public /* synthetic */ o0O0oo0o(int i) {
        this.f2480OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f2480OooO00o) {
            case 0:
                return new o0O0O0Oo(parcel, null);
            case 1:
                return new oo0ooO(parcel, null);
            case 2:
                return new OooOOoo.o0OOO0o(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return Oooo0OO.o00OOOOo.f1455OooO0O0;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o000oOoO.o000O0(parcel, null);
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new oO00OOO(parcel, null);
            case 6:
                return new Oooooo.o00000(parcel, (ClassLoader) null);
            case 7:
                return new oOOoOOO0(parcel, null);
            case 8:
                return new o00o0O.OooO0O0(parcel, null);
            case 9:
                return new o0ooOOo.OooO0o(parcel, (ClassLoader) null);
            default:
                return new o0OOO0o.oo0o0Oo(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f2480OooO00o) {
            case 0:
                return new o0O0O0Oo[i];
            case 1:
                return new oo0ooO[i];
            case 2:
                return new OooOOoo.o0OOO0o[i];
            case 3:
                return new Oooo0OO.o00OOOOo[i];
            case 4:
                return new o000oOoO.o000O0[i];
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new oO00OOO[i];
            case 6:
                return new Oooooo.o00000[i];
            case 7:
                return new oOOoOOO0[i];
            case 8:
                return new o00o0O.OooO0O0[i];
            case 9:
                return new o0ooOOo.OooO0o[i];
            default:
                return new o0OOO0o.oo0o0Oo[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f2480OooO00o) {
            case 0:
                return new o0O0O0Oo(parcel, classLoader);
            case 1:
                return new oo0ooO(parcel, classLoader);
            case 2:
                return new OooOOoo.o0OOO0o(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return Oooo0OO.o00OOOOo.f1455OooO0O0;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new o000oOoO.o000O0(parcel, classLoader);
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new oO00OOO(parcel, classLoader);
            case 6:
                return new Oooooo.o00000(parcel, classLoader);
            case 7:
                return new oOOoOOO0(parcel, classLoader);
            case 8:
                return new o00o0O.OooO0O0(parcel, classLoader);
            case 9:
                return new o0ooOOo.OooO0o(parcel, classLoader);
            default:
                return new o0OOO0o.oo0o0Oo(parcel, classLoader);
        }
    }
}