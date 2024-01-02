package o000OoO;

import o0000O00.OooO00o;
import o0000Oo0.OooO0O0;
import o000O000.OooOO0;
import o000O000.Oooo0;
import o000O000.o00O0O;

/* loaded from: classes.dex */
public abstract class OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final byte[] f4879OooO00o;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(OooO0O0.f4385OooO00o);
        OooO00o.OooOoOO(bytes, "this as java.lang.String).getBytes(charset)");
        f4879OooO00o = bytes;
    }

    public static final String OooO00o(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "<this>");
        if (j > 0) {
            long j2 = j - 1;
            if (oooOO0.OooOoO0(j2) == 13) {
                String OooOoo02 = oooOO0.OooOoo0(j2, OooO0O0.f4385OooO00o);
                oooOO0.OooOOO(2L);
                return OooOoo02;
            }
        }
        String OooOoo03 = oooOO0.OooOoo0(j, OooO0O0.f4385OooO00o);
        oooOO0.OooOOO(1L);
        return OooOoo03;
    }

    public static final int OooO0O0(OooOO0 oooOO0, Oooo0 oooo0, boolean z) {
        int i;
        int i2;
        byte[] bArr;
        int i3;
        o00O0O o00o0o;
        OooO00o.OooOoo0(oooOO0, "<this>");
        OooO00o.OooOoo0(oooo0, "options");
        o00O0O o00o0o2 = oooOO0.f4822OooO00o;
        int i4 = -2;
        if (o00o0o2 == null) {
            return z ? -2 : -1;
        }
        int i5 = o00o0o2.f4845OooO0O0;
        int i6 = o00o0o2.f4846OooO0OO;
        byte[] bArr2 = o00o0o2.f4844OooO00o;
        o00O0O o00o0o3 = o00o0o2;
        int i7 = -1;
        int i8 = 0;
        loop0: while (true) {
            int i9 = i8 + 1;
            int[] iArr = oooo0.f4839OooO0O0;
            int i10 = iArr[i8];
            int i11 = i9 + 1;
            int i12 = iArr[i9];
            if (i12 != -1) {
                i7 = i12;
            }
            if (o00o0o3 == null) {
                break;
            }
            if (i10 >= 0) {
                int i13 = i5 + 1;
                int i14 = bArr2[i5] & 255;
                int i15 = i11 + i10;
                while (i11 != i15) {
                    if (i14 == iArr[i11]) {
                        i = iArr[i11 + i10];
                        if (i13 == i6) {
                            o00o0o3 = o00o0o3.f4848OooO0o;
                            OooO00o.OooOo(o00o0o3);
                            i2 = o00o0o3.f4845OooO0O0;
                            i6 = o00o0o3.f4846OooO0OO;
                            bArr2 = o00o0o3.f4844OooO00o;
                            if (o00o0o3 == o00o0o2) {
                                o00o0o3 = null;
                            }
                        } else {
                            i2 = i13;
                        }
                    } else {
                        i11++;
                    }
                }
                return i7;
            }
            int i16 = (i10 * (-1)) + i11;
            while (true) {
                int i17 = i5 + 1;
                int i18 = i11 + 1;
                if ((bArr2[i5] & 255) != iArr[i11]) {
                    return i7;
                }
                boolean z2 = i18 == i16;
                if (i17 == i6) {
                    OooO00o.OooOo(o00o0o3);
                    o00O0O o00o0o4 = o00o0o3.f4848OooO0o;
                    OooO00o.OooOo(o00o0o4);
                    i3 = o00o0o4.f4845OooO0O0;
                    int i19 = o00o0o4.f4846OooO0OO;
                    bArr = o00o0o4.f4844OooO00o;
                    if (o00o0o4 != o00o0o2) {
                        o00o0o = o00o0o4;
                        i6 = i19;
                    } else if (!z2) {
                        break loop0;
                    } else {
                        i6 = i19;
                        o00o0o = null;
                    }
                } else {
                    o00O0O o00o0o5 = o00o0o3;
                    bArr = bArr2;
                    i3 = i17;
                    o00o0o = o00o0o5;
                }
                if (z2) {
                    i = iArr[i18];
                    i2 = i3;
                    bArr2 = bArr;
                    o00o0o3 = o00o0o;
                    break;
                }
                i5 = i3;
                bArr2 = bArr;
                i11 = i18;
                o00o0o3 = o00o0o;
            }
            if (i >= 0) {
                return i;
            }
            i8 = -i;
            i5 = i2;
            i4 = -2;
        }
        return z ? i4 : i7;
    }
}