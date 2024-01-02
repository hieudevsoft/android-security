package o0000oOO;

import o0000O00.OooO00o;
import o0000Oo0.OooOOOO;
import o0000OoO.OooOO0O;
import o000O000.OooOOO;

/* loaded from: classes.dex */
public abstract class o00O0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final OooOOO f4715OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public static final String[] f4716OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final String[] f4717OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final String[] f4718OooO0Oo;

    static {
        int i;
        OooOOO oooOOO = OooOOO.f4824OooO0Oo;
        f4715OooO00o = o00000OO.OooOO0("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f4716OooO0O0 = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f4717OooO0OO = new String[64];
        String[] strArr = new String[256];
        for (int i2 = 0; i2 < 256; i2++) {
            String binaryString = Integer.toBinaryString(i2);
            OooO00o.OooOoOO(binaryString, "toBinaryString(it)");
            String replace = OooOO0O.OooO0oo("%8s", binaryString).replace(' ', '0');
            OooO00o.OooOoOO(replace, "this as java.lang.String…replace(oldChar, newChar)");
            strArr[i2] = replace;
        }
        f4718OooO0Oo = strArr;
        String[] strArr2 = f4717OooO0OO;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        strArr2[iArr[0] | 8] = strArr2[i] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            String[] strArr3 = f4717OooO0OO;
            int i6 = i5 | i4;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = f4717OooO0OO.length;
        for (int i7 = 0; i7 < length; i7++) {
            String[] strArr4 = f4717OooO0OO;
            if (strArr4[i7] == null) {
                strArr4[i7] = f4718OooO0Oo[i7];
            }
        }
    }

    public static String OooO00o(int i, int i2, int i3, int i4, boolean z) {
        String OooO0oo2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String[] strArr = f4716OooO0O0;
        if (i3 < strArr.length) {
            OooO0oo2 = strArr[i3];
        } else {
            OooO0oo2 = OooOO0O.OooO0oo("0x%02x", Integer.valueOf(i3));
        }
        if (i4 == 0) {
            str = "";
        } else {
            String[] strArr2 = f4718OooO0Oo;
            if (i3 != 2 && i3 != 3) {
                if (i3 != 4 && i3 != 6) {
                    if (i3 != 7 && i3 != 8) {
                        String[] strArr3 = f4717OooO0OO;
                        if (i4 < strArr3.length) {
                            str2 = strArr3[i4];
                            OooO00o.OooOo(str2);
                        } else {
                            str2 = strArr2[i4];
                        }
                        if (i3 == 5 && (i4 & 4) != 0) {
                            str3 = "HEADERS";
                            str4 = "PUSH_PROMISE";
                        } else if (i3 == 0 && (i4 & 32) != 0) {
                            str3 = "PRIORITY";
                            str4 = "COMPRESSED";
                        } else {
                            str = str2;
                        }
                        str = OooOOOO.o00oOOo(str2, str3, str4);
                    }
                } else if (i4 == 1) {
                    str = "ACK";
                } else {
                    str = strArr2[i4];
                }
            }
            str = strArr2[i4];
        }
        if (z) {
            str5 = "<<";
        } else {
            str5 = ">>";
        }
        return OooOO0O.OooO0oo("%s 0x%08x %5d %-13s %s", str5, Integer.valueOf(i), Integer.valueOf(i2), OooO0oo2, str);
    }
}