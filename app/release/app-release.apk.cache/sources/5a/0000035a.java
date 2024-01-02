package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0000O implements Parcelable {
    public static final Parcelable.Creator<o0000O> CREATOR = new androidx.activity.result.OooO00o(6);

    /* renamed from: OooO  reason: collision with root package name */
    public final boolean f2826OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final String f2827OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f2828OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final boolean f2829OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f2830OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final String f2831OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f2832OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final boolean f2833OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public final boolean f2834OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final Bundle f2835OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final boolean f2836OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final int f2837OooOO0o;
    public Bundle OooOOO0;

    public o0000O(Parcel parcel) {
        this.f2827OooO00o = parcel.readString();
        this.f2828OooO0O0 = parcel.readString();
        this.f2829OooO0OO = parcel.readInt() != 0;
        this.f2830OooO0Oo = parcel.readInt();
        this.f2832OooO0o0 = parcel.readInt();
        this.f2831OooO0o = parcel.readString();
        this.f2833OooO0oO = parcel.readInt() != 0;
        this.f2834OooO0oo = parcel.readInt() != 0;
        this.f2826OooO = parcel.readInt() != 0;
        this.f2835OooOO0 = parcel.readBundle();
        this.f2836OooOO0O = parcel.readInt() != 0;
        this.OooOOO0 = parcel.readBundle();
        this.f2837OooOO0o = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2827OooO00o);
        sb.append(" (");
        sb.append(this.f2828OooO0O0);
        sb.append(")}:");
        if (this.f2829OooO0OO) {
            sb.append(" fromLayout");
        }
        int i = this.f2832OooO0o0;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f2831OooO0o;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2833OooO0oO) {
            sb.append(" retainInstance");
        }
        if (this.f2834OooO0oo) {
            sb.append(" removing");
        }
        if (this.f2826OooO) {
            sb.append(" detached");
        }
        if (this.f2836OooOO0O) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2827OooO00o);
        parcel.writeString(this.f2828OooO0O0);
        parcel.writeInt(this.f2829OooO0OO ? 1 : 0);
        parcel.writeInt(this.f2830OooO0Oo);
        parcel.writeInt(this.f2832OooO0o0);
        parcel.writeString(this.f2831OooO0o);
        parcel.writeInt(this.f2833OooO0oO ? 1 : 0);
        parcel.writeInt(this.f2834OooO0oo ? 1 : 0);
        parcel.writeInt(this.f2826OooO ? 1 : 0);
        parcel.writeBundle(this.f2835OooOO0);
        parcel.writeInt(this.f2836OooOO0O ? 1 : 0);
        parcel.writeBundle(this.OooOOO0);
        parcel.writeInt(this.f2837OooOO0o);
    }

    public o0000O(o00Oo0 o00oo0) {
        this.f2827OooO00o = o00oo0.getClass().getName();
        this.f2828OooO0O0 = o00oo0.f2956OooO0o0;
        this.f2829OooO0OO = o00oo0.OooOOO0;
        this.f2830OooO0Oo = o00oo0.f2971OooOo0O;
        this.f2832OooO0o0 = o00oo0.f2972OooOo0o;
        this.f2831OooO0o = o00oo0.f2968OooOo;
        this.f2833OooO0oO = o00oo0.f2975OooOoOO;
        this.f2834OooO0oo = o00oo0.f2961OooOO0o;
        this.f2826OooO = o00oo0.f2973OooOoO;
        this.f2835OooOO0 = o00oo0.f2955OooO0o;
        this.f2836OooOO0O = o00oo0.f2974OooOoO0;
        this.f2837OooOO0o = o00oo0.f2988Oooo0o0.ordinal();
    }
}