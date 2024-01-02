package androidx.core.graphics.drawable;

import Ooooo0o.o000;
import Ooooo0o.o0000OO0;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(o0000OO0 o0000oo02) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2630OooO00o = o0000oo02.OooO0o(iconCompat.f2630OooO00o, 1);
        byte[] bArr = iconCompat.f2632OooO0OO;
        if (o0000oo02.OooO0o0(2)) {
            Parcel parcel = ((o000) o0000oo02).f1778OooO0o0;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f2632OooO0OO = bArr;
        iconCompat.f2633OooO0Oo = o0000oo02.OooO0oO(iconCompat.f2633OooO0Oo, 3);
        iconCompat.f2635OooO0o0 = o0000oo02.OooO0o(iconCompat.f2635OooO0o0, 4);
        iconCompat.f2634OooO0o = o0000oo02.OooO0o(iconCompat.f2634OooO0o, 5);
        iconCompat.f2636OooO0oO = (ColorStateList) o0000oo02.OooO0oO(iconCompat.f2636OooO0oO, 6);
        String str = iconCompat.f2629OooO;
        if (o0000oo02.OooO0o0(7)) {
            str = ((o000) o0000oo02).f1778OooO0o0.readString();
        }
        iconCompat.f2629OooO = str;
        String str2 = iconCompat.f2638OooOO0;
        if (o0000oo02.OooO0o0(8)) {
            str2 = ((o000) o0000oo02).f1778OooO0o0.readString();
        }
        iconCompat.f2638OooOO0 = str2;
        iconCompat.f2637OooO0oo = PorterDuff.Mode.valueOf(iconCompat.f2629OooO);
        switch (iconCompat.f2630OooO00o) {
            case -1:
                parcelable = iconCompat.f2633OooO0Oo;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f2631OooO0O0 = parcelable;
                break;
            case 1:
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                parcelable = iconCompat.f2633OooO0Oo;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.f2632OooO0OO;
                    iconCompat.f2631OooO0O0 = bArr3;
                    iconCompat.f2630OooO00o = 3;
                    iconCompat.f2635OooO0o0 = 0;
                    iconCompat.f2634OooO0o = bArr3.length;
                    break;
                }
                iconCompat.f2631OooO0O0 = parcelable;
                break;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f2632OooO0OO, Charset.forName("UTF-16"));
                iconCompat.f2631OooO0O0 = str3;
                if (iconCompat.f2630OooO00o == 2 && iconCompat.f2638OooOO0 == null) {
                    iconCompat.f2638OooOO0 = str3.split(":", -1)[0];
                    break;
                }
                break;
            case 3:
                iconCompat.f2631OooO0O0 = iconCompat.f2632OooO0OO;
                break;
        }
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, o0000OO0 o0000oo02) {
        o0000oo02.getClass();
        iconCompat.f2629OooO = iconCompat.f2637OooO0oo.name();
        switch (iconCompat.f2630OooO00o) {
            case -1:
            case 1:
            case o00000.o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                iconCompat.f2633OooO0Oo = (Parcelable) iconCompat.f2631OooO0O0;
                break;
            case 2:
                iconCompat.f2632OooO0OO = ((String) iconCompat.f2631OooO0O0).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f2632OooO0OO = (byte[]) iconCompat.f2631OooO0O0;
                break;
            case 4:
            case 6:
                iconCompat.f2632OooO0OO = iconCompat.f2631OooO0O0.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f2630OooO00o;
        if (-1 != i) {
            o0000oo02.OooO(1);
            ((o000) o0000oo02).f1778OooO0o0.writeInt(i);
        }
        byte[] bArr = iconCompat.f2632OooO0OO;
        if (bArr != null) {
            o0000oo02.OooO(2);
            int length = bArr.length;
            Parcel parcel = ((o000) o0000oo02).f1778OooO0o0;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f2633OooO0Oo;
        if (parcelable != null) {
            o0000oo02.OooO(3);
            ((o000) o0000oo02).f1778OooO0o0.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f2635OooO0o0;
        if (i2 != 0) {
            o0000oo02.OooO(4);
            ((o000) o0000oo02).f1778OooO0o0.writeInt(i2);
        }
        int i3 = iconCompat.f2634OooO0o;
        if (i3 != 0) {
            o0000oo02.OooO(5);
            ((o000) o0000oo02).f1778OooO0o0.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f2636OooO0oO;
        if (colorStateList != null) {
            o0000oo02.OooO(6);
            ((o000) o0000oo02).f1778OooO0o0.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f2629OooO;
        if (str != null) {
            o0000oo02.OooO(7);
            ((o000) o0000oo02).f1778OooO0o0.writeString(str);
        }
        String str2 = iconCompat.f2638OooOO0;
        if (str2 != null) {
            o0000oo02.OooO(8);
            ((o000) o0000oo02).f1778OooO0o0.writeString(str2);
        }
    }
}