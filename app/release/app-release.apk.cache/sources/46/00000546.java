package o00000O0;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final Charset f4035OooO00o = Charset.forName("UTF-8");

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (r7 == 1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
        if (r7 == 2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e3, code lost:
        if (r7 == 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e5, code lost:
        if (r7 == 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e8, code lost:
        r15 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r15 + 1;
        r3[r15] = (byte) (r8 >> 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static byte[] OooO00o(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00000O0.OooOO0.OooO00o(java.lang.String):byte[]");
    }

    public static byte[] OooO0O0(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = OooO.f4017OooOO0o;
        int i = (length / 3) * 4;
        if (length % 3 > 0) {
            i += 4;
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        int i3 = length + 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int i6 = i2 + 3;
            if (i6 > i3) {
                break;
            }
            int i7 = (bArr[i2 + 2] & 255) | ((bArr[i2] & 255) << 16) | ((bArr[i2 + 1] & 255) << 8);
            bArr3[i4] = bArr2[(i7 >> 18) & 63];
            bArr3[i4 + 1] = bArr2[(i7 >> 12) & 63];
            bArr3[i4 + 2] = bArr2[(i7 >> 6) & 63];
            bArr3[i4 + 3] = bArr2[i7 & 63];
            i4 += 4;
            i5--;
            if (i5 == 0) {
                bArr3[i4] = 10;
                i5 = 19;
                i4++;
            }
            i2 = i6;
        }
        int i8 = i2 + 0;
        if (i8 == i3 - 1) {
            int i9 = (bArr[i2] & 255) << 4;
            int i10 = i4 + 1;
            bArr3[i4] = bArr2[(i9 >> 6) & 63];
            int i11 = i10 + 1;
            bArr3[i10] = bArr2[i9 & 63];
            bArr3[i11] = 61;
            bArr3[i11 + 1] = 61;
        } else if (i8 == i3 - 2) {
            int i12 = ((bArr[i2 + 1] & 255) << 2) | ((bArr[i2] & 255) << 10);
            int i13 = i4 + 1;
            bArr3[i4] = bArr2[(i12 >> 12) & 63];
            int i14 = i13 + 1;
            bArr3[i13] = bArr2[(i12 >> 6) & 63];
            bArr3[i14] = bArr2[i12 & 63];
            bArr3[i14 + 1] = 61;
        }
        return bArr3;
    }
}