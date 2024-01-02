package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class OooO0O0 implements Parcelable {
    public static final Parcelable.Creator<OooO0O0> CREATOR = new OooO00o(0);

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f1978OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Intent f1979OooO0O0;

    public OooO0O0(Intent intent, int i) {
        this.f1978OooO00o = i;
        this.f1979OooO0O0 = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f1978OooO00o;
        if (i != -1) {
            if (i != 0) {
                str = String.valueOf(i);
            } else {
                str = "RESULT_CANCELED";
            }
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.f1979OooO0O0);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1978OooO00o);
        Intent intent = this.f1979OooO0O0;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }

    public OooO0O0(Parcel parcel) {
        this.f1978OooO00o = parcel.readInt();
        this.f1979OooO0O0 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }
}