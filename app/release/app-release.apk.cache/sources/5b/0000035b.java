package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o0000O0 implements Parcelable {
    public static final Parcelable.Creator<o0000O0> CREATOR = new androidx.activity.result.OooO00o(5);

    /* renamed from: OooO00o  reason: collision with root package name */
    public ArrayList f2838OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public ArrayList f2839OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public OooO0O0[] f2840OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f2841OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final ArrayList f2842OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public String f2843OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final ArrayList f2844OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public ArrayList f2845OooO0oo;

    public o0000O0() {
        this.f2843OooO0o0 = null;
        this.f2842OooO0o = new ArrayList();
        this.f2844OooO0oO = new ArrayList();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2838OooO00o);
        parcel.writeStringList(this.f2839OooO0O0);
        parcel.writeTypedArray(this.f2840OooO0OO, i);
        parcel.writeInt(this.f2841OooO0Oo);
        parcel.writeString(this.f2843OooO0o0);
        parcel.writeStringList(this.f2842OooO0o);
        parcel.writeTypedList(this.f2844OooO0oO);
        parcel.writeTypedList(this.f2845OooO0oo);
    }

    public o0000O0(Parcel parcel) {
        this.f2843OooO0o0 = null;
        this.f2842OooO0o = new ArrayList();
        this.f2844OooO0oO = new ArrayList();
        this.f2838OooO00o = parcel.createTypedArrayList(o0000O.CREATOR);
        this.f2839OooO0O0 = parcel.createStringArrayList();
        this.f2840OooO0OO = (OooO0O0[]) parcel.createTypedArray(OooO0O0.CREATOR);
        this.f2841OooO0Oo = parcel.readInt();
        this.f2843OooO0o0 = parcel.readString();
        this.f2842OooO0o = parcel.createStringArrayList();
        this.f2844OooO0oO = parcel.createTypedArrayList(Bundle.CREATOR);
        this.f2845OooO0oo = parcel.createTypedArrayList(o0000Ooo.CREATOR);
    }
}