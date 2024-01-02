package o000O000;

import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import o0000oOO.o00000OO;

/* loaded from: classes.dex */
public class OooOOO implements Serializable, Comparable {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public static final OooOOO f4824OooO0Oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final byte[] f4825OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public transient int f4826OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public transient String f4827OooO0OO;

    static {
        new o00000OO(21, 0);
        f4824OooO0Oo = new OooOOO(new byte[0]);
    }

    public OooOOO(byte[] bArr) {
        o0000O00.OooO00o.OooOoo0(bArr, "data");
        this.f4825OooO00o = bArr;
    }

    public OooOOO OooO() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f4825OooO00o;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                o0000O00.OooO00o.OooOoOO(copyOf, "copyOf(this, size)");
                copyOf[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b2 = copyOf[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        copyOf[i2] = (byte) (b2 + 32);
                    }
                }
                return new OooOOO(copyOf);
            }
            i++;
        }
    }

    public String OooO00o() {
        byte[] bArr = OooO00o.f4815OooO00o;
        byte[] bArr2 = this.f4825OooO00o;
        o0000O00.OooO00o.OooOoo0(bArr2, "<this>");
        o0000O00.OooO00o.OooOoo0(bArr, "map");
        byte[] bArr3 = new byte[((bArr2.length + 2) / 3) * 4];
        int length = bArr2.length - (bArr2.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            byte b = bArr2[i];
            int i4 = i3 + 1;
            byte b2 = bArr2[i3];
            int i5 = i4 + 1;
            byte b3 = bArr2[i4];
            int i6 = i2 + 1;
            bArr3[i2] = bArr[(b & 255) >> 2];
            int i7 = i6 + 1;
            bArr3[i6] = bArr[((b & 3) << 4) | ((b2 & 255) >> 4)];
            int i8 = i7 + 1;
            bArr3[i7] = bArr[((b2 & 15) << 2) | ((b3 & 255) >> 6)];
            i2 = i8 + 1;
            bArr3[i8] = bArr[b3 & 63];
            i = i5;
        }
        int length2 = bArr2.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i9 = i + 1;
                byte b4 = bArr2[i];
                byte b5 = bArr2[i9];
                int i10 = i2 + 1;
                bArr3[i2] = bArr[(b4 & 255) >> 2];
                int i11 = i10 + 1;
                bArr3[i10] = bArr[((b4 & 3) << 4) | ((b5 & 255) >> 4)];
                bArr3[i11] = bArr[(b5 & 15) << 2];
                bArr3[i11 + 1] = 61;
            }
        } else {
            byte b6 = bArr2[i];
            int i12 = i2 + 1;
            bArr3[i2] = bArr[(b6 & 255) >> 2];
            int i13 = i12 + 1;
            bArr3[i12] = bArr[(b6 & 3) << 4];
            bArr3[i13] = 61;
            bArr3[i13 + 1] = 61;
        }
        return new String(bArr3, o0000Oo0.OooO0O0.f4385OooO00o);
    }

    public OooOOO OooO0O0(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.f4825OooO00o, 0, OooO0OO());
        byte[] digest = messageDigest.digest();
        o0000O00.OooO00o.OooOo(digest);
        return new OooOOO(digest);
    }

    public int OooO0OO() {
        return this.f4825OooO00o.length;
    }

    public String OooO0Oo() {
        byte[] bArr = this.f4825OooO00o;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = com.google.gson.internal.OooO0o.f3787OooO0OO;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public byte OooO0o(int i) {
        return this.f4825OooO00o[i];
    }

    public byte[] OooO0o0() {
        return this.f4825OooO00o;
    }

    public boolean OooO0oO(int i, int i2, int i3, byte[] bArr) {
        o0000O00.OooO00o.OooOoo0(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f4825OooO00o;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && com.google.gson.internal.OooO0o.OooO0O0(i, i2, i3, bArr2, bArr)) {
                return true;
            }
        }
        return false;
    }

    public boolean OooO0oo(OooOOO oooOOO, int i) {
        o0000O00.OooO00o.OooOoo0(oooOOO, "other");
        return oooOOO.OooO0oO(0, 0, i, this.f4825OooO00o);
    }

    public final String OooOO0() {
        String str = this.f4827OooO0OO;
        if (str == null) {
            byte[] OooO0o02 = OooO0o0();
            o0000O00.OooO00o.OooOoo0(OooO0o02, "<this>");
            String str2 = new String(OooO0o02, o0000Oo0.OooO0O0.f4385OooO00o);
            this.f4827OooO0OO = str2;
            return str2;
        }
        return str;
    }

    public void OooOO0O(OooOO0 oooOO0, int i) {
        o0000O00.OooO00o.OooOoo0(oooOO0, "buffer");
        oooOO0.Oooo000(this.f4825OooO00o, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032 A[ORIG_RETURN, RETURN] */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int compareTo(java.lang.Object r8) {
        /*
            r7 = this;
            o000O000.OooOOO r8 = (o000O000.OooOOO) r8
            java.lang.String r0 = "other"
            o0000O00.OooO00o.OooOoo0(r8, r0)
            int r0 = r7.OooO0OO()
            int r1 = r8.OooO0OO()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L15:
            if (r4 >= r2) goto L2b
            byte r5 = r7.OooO0o(r4)
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r6 = r8.OooO0o(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            if (r5 != r6) goto L28
            int r4 = r4 + 1
            goto L15
        L28:
            if (r5 >= r6) goto L32
            goto L30
        L2b:
            if (r0 != r1) goto L2e
            goto L33
        L2e:
            if (r0 >= r1) goto L32
        L30:
            r3 = -1
            goto L33
        L32:
            r3 = 1
        L33:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.OooOOO.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OooOOO) {
            OooOOO oooOOO = (OooOOO) obj;
            int OooO0OO2 = oooOOO.OooO0OO();
            byte[] bArr = this.f4825OooO00o;
            if (OooO0OO2 == bArr.length && oooOOO.OooO0oO(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f4826OooO0O0;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.f4825OooO00o);
            this.f4826OooO0O0 = hashCode;
            return hashCode;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x00fd, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x010e, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x011d, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x012f, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x013c, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0183, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0194, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x01b4, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x01ca, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x01d7, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x01de, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x021d, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0220, code lost:
        r7 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x009b, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00aa, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00b5, code lost:
        if (r6 == 64) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0220 A[EDGE_INSN: B:273:0x0220->B:248:0x0220 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0220 A[EDGE_INSN: B:278:0x0220->B:248:0x0220 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0220 A[EDGE_INSN: B:283:0x0220->B:248:0x0220 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0220 A[EDGE_INSN: B:289:0x0220->B:248:0x0220 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0220 A[EDGE_INSN: B:296:0x0220->B:248:0x0220 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.OooOOO.toString():java.lang.String");
    }
}