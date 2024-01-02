package androidx.core.app;

import Ooooo0o.o000;
import Ooooo0o.o0000OO0;
import Ooooo0o.o000O000;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(o0000OO0 o0000oo02) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        o000O000 o000o000 = remoteActionCompat.f2622OooO00o;
        boolean z = true;
        if (o0000oo02.OooO0o0(1)) {
            o000o000 = o0000oo02.OooO0oo();
        }
        remoteActionCompat.f2622OooO00o = (IconCompat) o000o000;
        CharSequence charSequence = remoteActionCompat.f2623OooO0O0;
        if (o0000oo02.OooO0o0(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o000) o0000oo02).f1778OooO0o0);
        }
        remoteActionCompat.f2623OooO0O0 = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f2624OooO0OO;
        if (o0000oo02.OooO0o0(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((o000) o0000oo02).f1778OooO0o0);
        }
        remoteActionCompat.f2624OooO0OO = charSequence2;
        remoteActionCompat.f2625OooO0Oo = (PendingIntent) o0000oo02.OooO0oO(remoteActionCompat.f2625OooO0Oo, 4);
        boolean z2 = remoteActionCompat.f2627OooO0o0;
        if (o0000oo02.OooO0o0(5)) {
            if (((o000) o0000oo02).f1778OooO0o0.readInt() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        remoteActionCompat.f2627OooO0o0 = z2;
        boolean z3 = remoteActionCompat.f2626OooO0o;
        if (o0000oo02.OooO0o0(6)) {
            if (((o000) o0000oo02).f1778OooO0o0.readInt() == 0) {
                z = false;
            }
            z3 = z;
        }
        remoteActionCompat.f2626OooO0o = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, o0000OO0 o0000oo02) {
        o0000oo02.getClass();
        IconCompat iconCompat = remoteActionCompat.f2622OooO00o;
        o0000oo02.OooO(1);
        o0000oo02.OooOO0(iconCompat);
        CharSequence charSequence = remoteActionCompat.f2623OooO0O0;
        o0000oo02.OooO(2);
        Parcel parcel = ((o000) o0000oo02).f1778OooO0o0;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f2624OooO0OO;
        o0000oo02.OooO(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f2625OooO0Oo;
        o0000oo02.OooO(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z = remoteActionCompat.f2627OooO0o0;
        o0000oo02.OooO(5);
        parcel.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f2626OooO0o;
        o0000oo02.OooO(6);
        parcel.writeInt(z2 ? 1 : 0);
    }
}