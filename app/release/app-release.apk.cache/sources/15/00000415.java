package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class OooOO0 {
    public static int OooO(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static void OooO00o(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!Oooo0oo(b2)) {
            if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !Oooo0oo(b3) && !Oooo0oo(b4)) {
                int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                cArr[i] = (char) ((i2 >>> 10) + 55232);
                cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                return;
            }
        }
        throw o00000O.OooO00o();
    }

    public static void OooO0O0(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (!Oooo0oo(b2) && ((b != -32 || b2 >= -96) && ((b != -19 || b2 < -96) && !Oooo0oo(b3)))) {
            cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
            return;
        }
        throw o00000O.OooO00o();
    }

    public static final String OooO0OO(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        r6 = Oooo0o0(r5, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        if (r9.f3615OooO0O0 == 0) goto L3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r9.f3615OooO0O0 != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
        r8.OooO0oo(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
        if (r6 >= r7) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
        r0 = Oooo0O0(r5, r6, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r4 == r9.f3614OooO00o) goto L8;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0026 -> B:5:0x000f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0028 -> B:6:0x0010). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0Oo(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.o000000O r8, com.google.crypto.tink.shaded.protobuf.OooO r9) {
        /*
            com.google.crypto.tink.shaded.protobuf.OooOO0O r8 = (com.google.crypto.tink.shaded.protobuf.OooOO0O) r8
            int r6 = Oooo0o0(r5, r6, r9)
            long r0 = r9.f3615OooO0O0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
            goto L28
        Lf:
            r0 = 0
        L10:
            r8.OooO0oo(r0)
            if (r6 >= r7) goto L2a
            int r0 = Oooo0O0(r5, r6, r9)
            int r1 = r9.f3614OooO00o
            if (r4 == r1) goto L1e
            goto L2a
        L1e:
            int r6 = Oooo0o0(r5, r0, r9)
            long r0 = r9.f3615OooO0O0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lf
        L28:
            r0 = 1
            goto L10
        L2a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOO0.OooO0Oo(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.o000000O, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
        r0 = Oooo0O0(r3, r4, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r2 == r7.f3614OooO00o) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0022, code lost:
        r4 = Oooo0O0(r3, r0, r7);
        r0 = r7.f3614OooO00o;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r0 < 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r0 > (r3.length - r4)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        if (r0 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0030, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        throw com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r6.add(com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(r3, r4, r0));
        r4 = r4 + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r4 >= r5) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x002e -> B:8:0x000f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0030 -> B:9:0x0017). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooO0o(int r2, byte[] r3, int r4, int r5, com.google.crypto.tink.shaded.protobuf.o000000O r6, com.google.crypto.tink.shaded.protobuf.OooO r7) {
        /*
            int r4 = Oooo0O0(r3, r4, r7)
            int r0 = r7.f3614OooO00o
            if (r0 < 0) goto L46
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L41
            if (r0 != 0) goto Lf
            goto L30
        Lf:
            com.google.crypto.tink.shaded.protobuf.OooOo00 r1 = com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(r3, r4, r0)
            r6.add(r1)
            int r4 = r4 + r0
        L17:
            if (r4 >= r5) goto L40
            int r0 = Oooo0O0(r3, r4, r7)
            int r1 = r7.f3614OooO00o
            if (r2 == r1) goto L22
            goto L40
        L22:
            int r4 = Oooo0O0(r3, r0, r7)
            int r0 = r7.f3614OooO00o
            if (r0 < 0) goto L3b
            int r1 = r3.length
            int r1 = r1 - r4
            if (r0 > r1) goto L36
            if (r0 != 0) goto Lf
        L30:
            com.google.crypto.tink.shaded.protobuf.OooOo00 r0 = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0
            r6.add(r0)
            goto L17
        L36:
            com.google.crypto.tink.shaded.protobuf.o00000O r2 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o()
            throw r2
        L3b:
            com.google.crypto.tink.shaded.protobuf.o00000O r2 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r2
        L40:
            return r4
        L41:
            com.google.crypto.tink.shaded.protobuf.o00000O r2 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0o()
            throw r2
        L46:
            com.google.crypto.tink.shaded.protobuf.o00000O r2 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOO0.OooO0o(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.o000000O, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    public static int OooO0o0(byte[] bArr, int i, OooO oooO) {
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o;
        if (i2 >= 0) {
            if (i2 <= bArr.length - Oooo0O02) {
                if (i2 == 0) {
                    oooO.f3616OooO0OO = OooOo.f3625OooO0O0;
                    return Oooo0O02;
                }
                oooO.f3616OooO0OO = OooOo.OooO0oo(bArr, Oooo0O02, i2);
                return Oooo0O02 + i2;
            }
            throw o00000O.OooO0o();
        }
        throw o00000O.OooO0Oo();
    }

    public static double OooO0oO(int i, byte[] bArr) {
        return Double.longBitsToDouble(OooOO0O(i, bArr));
    }

    public static int OooO0oo(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o0OoOo0 o0oooo0 = (o0OoOo0) o000000o2;
        o0oooo0.OooO0oo(Double.longBitsToDouble(OooOO0O(i2, bArr)));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int Oooo0O02 = Oooo0O0(bArr, i4, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            o0oooo0.OooO0oo(Double.longBitsToDouble(OooOO0O(Oooo0O02, bArr)));
            i4 = Oooo0O02 + 8;
        }
        return i4;
    }

    public static int OooOO0(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        o000ooo.OooO0oo(OooO(i2, bArr));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int Oooo0O02 = Oooo0O0(bArr, i4, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            o000ooo.OooO0oo(OooO(Oooo0O02, bArr));
            i4 = Oooo0O02 + 4;
        }
        return i4;
    }

    public static long OooOO0O(int i, byte[] bArr) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    public static int OooOO0o(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        o0000o0o2.OooO0oo(OooOO0O(i2, bArr));
        int i4 = i2 + 8;
        while (i4 < i3) {
            int Oooo0O02 = Oooo0O0(bArr, i4, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            o0000o0o2.OooO0oo(OooOO0O(Oooo0O02, bArr));
            i4 = Oooo0O02 + 8;
        }
        return i4;
    }

    public static int OooOOO(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o0ooOOo o0ooooo = (o0ooOOo) o000000o2;
        o0ooooo.OooO0oo(Float.intBitsToFloat(OooO(i2, bArr)));
        int i4 = i2 + 4;
        while (i4 < i3) {
            int Oooo0O02 = Oooo0O0(bArr, i4, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            o0ooooo.OooO0oo(Float.intBitsToFloat(OooO(Oooo0O02, bArr)));
            i4 = Oooo0O02 + 4;
        }
        return i4;
    }

    public static float OooOOO0(int i, byte[] bArr) {
        return Float.intBitsToFloat(OooO(i, bArr));
    }

    public static int OooOOOO(o0O0ooO o0o0ooo, byte[] bArr, int i, int i2, int i3, OooO oooO) {
        o000O00O o000o00o = (o000O00O) o0o0ooo;
        Object OooO0Oo2 = o000o00o.OooO0Oo();
        int OooOoOO2 = o000o00o.OooOoOO(OooO0Oo2, bArr, i, i2, i3, oooO);
        o000o00o.OooO0oO(OooO0Oo2);
        oooO.f3616OooO0OO = OooO0Oo2;
        return OooOoOO2;
    }

    public static int OooOOOo(o0O0ooO o0o0ooo, int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        int i4 = (i & (-8)) | 4;
        int OooOOOO2 = OooOOOO(o0o0ooo, bArr, i2, i3, i4, oooO);
        while (true) {
            o000000o2.add(oooO.f3616OooO0OO);
            if (OooOOOO2 >= i3) {
                break;
            }
            int Oooo0O02 = Oooo0O0(bArr, OooOOOO2, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            OooOOOO2 = OooOOOO(o0o0ooo, bArr, Oooo0O02, i3, i4, oooO);
        }
        return OooOOOO2;
    }

    public static int OooOOo(o0O0ooO o0o0ooo, int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        int OooOOo02 = OooOOo0(o0o0ooo, bArr, i2, i3, oooO);
        while (true) {
            o000000o2.add(oooO.f3616OooO0OO);
            if (OooOOo02 >= i3) {
                break;
            }
            int Oooo0O02 = Oooo0O0(bArr, OooOOo02, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            OooOOo02 = OooOOo0(o0o0ooo, bArr, Oooo0O02, i3, oooO);
        }
        return OooOOo02;
    }

    public static int OooOOo0(o0O0ooO o0o0ooo, byte[] bArr, int i, int i2, OooO oooO) {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = Oooo0(i4, bArr, i3, oooO);
            i4 = oooO.f3614OooO00o;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw o00000O.OooO0o();
        }
        Object OooO0Oo2 = o0o0ooo.OooO0Oo();
        int i6 = i4 + i5;
        o0o0ooo.OooO00o(OooO0Oo2, bArr, i5, i6, oooO);
        o0o0ooo.OooO0oO(OooO0Oo2);
        oooO.f3616OooO0OO = OooO0Oo2;
        return i6;
    }

    public static int OooOOoo(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        OooOO0O oooOO0O = (OooOO0O) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            Oooo0O02 = Oooo0o0(bArr, Oooo0O02, oooO);
            oooOO0O.OooO0oo(oooO.f3615OooO0O0 != 0);
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOo(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            Oooo0O02 = Oooo0O0(bArr, Oooo0O02, oooO);
            o000ooo.OooO0oo(Oooo000.OooO00o(oooO.f3614OooO00o));
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOo0(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            o000ooo.OooO0oo(OooO(Oooo0O02, bArr));
            Oooo0O02 += 4;
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOo00(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o0OoOo0 o0oooo0 = (o0OoOo0) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            o0oooo0.OooO0oo(Double.longBitsToDouble(OooOO0O(Oooo0O02, bArr)));
            Oooo0O02 += 8;
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOo0O(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            o0000o0o2.OooO0oo(OooOO0O(Oooo0O02, bArr));
            Oooo0O02 += 8;
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOo0o(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o0ooOOo o0ooooo = (o0ooOOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            o0ooooo.OooO0oo(Float.intBitsToFloat(OooO(Oooo0O02, bArr)));
            Oooo0O02 += 4;
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOoO(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            Oooo0O02 = Oooo0O0(bArr, Oooo0O02, oooO);
            o000ooo.OooO0oo(oooO.f3614OooO00o);
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOoO0(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            Oooo0O02 = Oooo0o0(bArr, Oooo0O02, oooO);
            o0000o0o2.OooO0oo(Oooo000.OooO0O0(oooO.f3615OooO0O0));
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOoOO(byte[] bArr, int i, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o + Oooo0O02;
        while (Oooo0O02 < i2) {
            Oooo0O02 = Oooo0o0(bArr, Oooo0O02, oooO);
            o0000o0o2.OooO0oo(oooO.f3615OooO0O0);
        }
        if (Oooo0O02 == i2) {
            return Oooo0O02;
        }
        throw o00000O.OooO0o();
    }

    public static int OooOoo(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        int Oooo0o02 = Oooo0o0(bArr, i2, oooO);
        while (true) {
            o0000o0o2.OooO0oo(Oooo000.OooO0O0(oooO.f3615OooO0O0));
            if (Oooo0o02 >= i3) {
                break;
            }
            int Oooo0O02 = Oooo0O0(bArr, Oooo0o02, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            Oooo0o02 = Oooo0o0(bArr, Oooo0O02, oooO);
        }
        return Oooo0o02;
    }

    public static int OooOoo0(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i2, oooO);
        while (true) {
            o000ooo.OooO0oo(Oooo000.OooO00o(oooO.f3614OooO00o));
            if (Oooo0O02 >= i3) {
                break;
            }
            int Oooo0O03 = Oooo0O0(bArr, Oooo0O02, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            Oooo0O02 = Oooo0O0(bArr, Oooo0O03, oooO);
        }
        return Oooo0O02;
    }

    public static int OooOooO(byte[] bArr, int i, OooO oooO) {
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o;
        if (i2 >= 0) {
            if (i2 == 0) {
                oooO.f3616OooO0OO = "";
                return Oooo0O02;
            }
            oooO.f3616OooO0OO = new String(bArr, Oooo0O02, i2, o00000.f3650OooO00o);
            return Oooo0O02 + i2;
        }
        throw o00000O.OooO0Oo();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002d -> B:9:0x0018). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:8:0x0014). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int OooOooo(int r4, byte[] r5, int r6, int r7, com.google.crypto.tink.shaded.protobuf.o000000O r8, com.google.crypto.tink.shaded.protobuf.OooO r9) {
        /*
            int r6 = Oooo0O0(r5, r6, r9)
            int r0 = r9.f3614OooO00o
            if (r0 < 0) goto L3f
            java.lang.String r1 = ""
            if (r0 != 0) goto Ld
            goto L2d
        Ld:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o
            r2.<init>(r5, r6, r0, r3)
        L14:
            r8.add(r2)
            int r6 = r6 + r0
        L18:
            if (r6 >= r7) goto L3e
            int r0 = Oooo0O0(r5, r6, r9)
            int r2 = r9.f3614OooO00o
            if (r4 == r2) goto L23
            goto L3e
        L23:
            int r6 = Oooo0O0(r5, r0, r9)
            int r0 = r9.f3614OooO00o
            if (r0 < 0) goto L39
            if (r0 != 0) goto L31
        L2d:
            r8.add(r1)
            goto L18
        L31:
            java.lang.String r2 = new java.lang.String
            java.nio.charset.Charset r3 = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o
            r2.<init>(r5, r6, r0, r3)
            goto L14
        L39:
            com.google.crypto.tink.shaded.protobuf.o00000O r4 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r4
        L3e:
            return r6
        L3f:
            com.google.crypto.tink.shaded.protobuf.o00000O r4 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOO0.OooOooo(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.o000000O, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    public static final void Oooo(StringBuilder sb, int i, String str, Object obj) {
        String obj2;
        String Oooo0oO2;
        if (obj instanceof List) {
            for (Object obj3 : (List) obj) {
                Oooo(sb, i, str, obj3);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Oooo(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                OooOo00 oooOo00 = OooOo.f3625OooO0O0;
                Oooo0oO2 = Oooo0oO(new OooOo00(((String) obj).getBytes(o00000.f3650OooO00o)));
            } else if (obj instanceof OooOo) {
                sb.append(": \"");
                Oooo0oO2 = Oooo0oO((OooOo) obj);
            } else {
                if (obj instanceof o0O0O00) {
                    sb.append(" {");
                    OoooO00((o0O0O00) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i4 = i + 2;
                    Oooo(sb, i4, "key", entry2.getKey());
                    Oooo(sb, i4, "value", entry2.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    obj2 = obj.toString();
                    sb.append(obj2);
                    return;
                }
                obj2 = "}";
                sb.append(obj2);
                return;
            }
            sb.append(Oooo0oO2);
            sb.append('\"');
        }
    }

    public static int Oooo0(int i, byte[] bArr, int i2, OooO oooO) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b < 0) {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                oooO.f3614OooO00o = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            oooO.f3614OooO00o = i7 | i3;
            return i8;
        }
        i4 = b << 7;
        oooO.f3614OooO00o = i5 | i4;
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x001d -> B:11:0x0020). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0033 -> B:6:0x000c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int Oooo000(int r5, byte[] r6, int r7, int r8, com.google.crypto.tink.shaded.protobuf.o000000O r9, com.google.crypto.tink.shaded.protobuf.OooO r10) {
        /*
            int r7 = Oooo0O0(r6, r7, r10)
            int r0 = r10.f3614OooO00o
            if (r0 < 0) goto L5a
            java.lang.String r1 = ""
            if (r0 != 0) goto Le
        Lc:
            r2 = r7
            goto L36
        Le:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o00O0OOO.OooO0Oo(r6, r7, r2)
            if (r3 == 0) goto L55
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o
            r3.<init>(r6, r7, r0, r4)
        L1d:
            r9.add(r3)
        L20:
            if (r2 >= r8) goto L54
            int r7 = Oooo0O0(r6, r2, r10)
            int r0 = r10.f3614OooO00o
            if (r5 == r0) goto L2b
            goto L54
        L2b:
            int r7 = Oooo0O0(r6, r7, r10)
            int r0 = r10.f3614OooO00o
            if (r0 < 0) goto L4f
            if (r0 != 0) goto L3a
            goto Lc
        L36:
            r9.add(r1)
            goto L20
        L3a:
            int r2 = r7 + r0
            boolean r3 = com.google.crypto.tink.shaded.protobuf.o00O0OOO.OooO0Oo(r6, r7, r2)
            if (r3 == 0) goto L4a
            java.lang.String r3 = new java.lang.String
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.o00000.f3650OooO00o
            r3.<init>(r6, r7, r0, r4)
            goto L1d
        L4a:
            com.google.crypto.tink.shaded.protobuf.o00000O r5 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO00o()
            throw r5
        L4f:
            com.google.crypto.tink.shaded.protobuf.o00000O r5 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r5
        L54:
            return r2
        L55:
            com.google.crypto.tink.shaded.protobuf.o00000O r5 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO00o()
            throw r5
        L5a:
            com.google.crypto.tink.shaded.protobuf.o00000O r5 = com.google.crypto.tink.shaded.protobuf.o00000O.OooO0Oo()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOO0.Oooo000(int, byte[], int, int, com.google.crypto.tink.shaded.protobuf.o000000O, com.google.crypto.tink.shaded.protobuf.OooO):int");
    }

    public static int Oooo00O(byte[] bArr, int i, OooO oooO) {
        int Oooo0O02 = Oooo0O0(bArr, i, oooO);
        int i2 = oooO.f3614OooO00o;
        if (i2 >= 0) {
            if (i2 == 0) {
                oooO.f3616OooO0OO = "";
                return Oooo0O02;
            }
            oooO.f3616OooO0OO = o00O0OOO.f3723OooO00o.OoooO0(bArr, Oooo0O02, i2);
            return Oooo0O02 + i2;
        }
        throw o00000O.OooO0Oo();
    }

    public static int Oooo00o(int i, byte[] bArr, int i2, int i3, o00O00O o00o00o, OooO oooO) {
        Object OooO0oo2;
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                o00o00o.OooO0OO(i, Integer.valueOf(OooO(i2, bArr)));
                                return i2 + 4;
                            }
                            throw new o00000O("Protocol message contained an invalid tag (zero).");
                        }
                        o00O00O OooO0O02 = o00O00O.OooO0O0();
                        int i5 = (i & (-8)) | 4;
                        int i6 = 0;
                        while (true) {
                            if (i2 >= i3) {
                                break;
                            }
                            int Oooo0O02 = Oooo0O0(bArr, i2, oooO);
                            int i7 = oooO.f3614OooO00o;
                            i6 = i7;
                            if (i7 == i5) {
                                i2 = Oooo0O02;
                                break;
                            }
                            int Oooo00o2 = Oooo00o(i6, bArr, Oooo0O02, i3, OooO0O02, oooO);
                            i6 = i7;
                            i2 = Oooo00o2;
                        }
                        if (i2 <= i3 && i6 == i5) {
                            o00o00o.OooO0OO(i, OooO0O02);
                            return i2;
                        }
                        throw o00000O.OooO0o0();
                    }
                    int Oooo0O03 = Oooo0O0(bArr, i2, oooO);
                    int i8 = oooO.f3614OooO00o;
                    if (i8 >= 0) {
                        if (i8 <= bArr.length - Oooo0O03) {
                            if (i8 == 0) {
                                OooO0oo2 = OooOo.f3625OooO0O0;
                            } else {
                                OooO0oo2 = OooOo.OooO0oo(bArr, Oooo0O03, i8);
                            }
                            o00o00o.OooO0OO(i, OooO0oo2);
                            return Oooo0O03 + i8;
                        }
                        throw o00000O.OooO0o();
                    }
                    throw o00000O.OooO0Oo();
                }
                o00o00o.OooO0OO(i, Long.valueOf(OooOO0O(i2, bArr)));
                return i2 + 8;
            }
            int Oooo0o02 = Oooo0o0(bArr, i2, oooO);
            o00o00o.OooO0OO(i, Long.valueOf(oooO.f3615OooO0O0));
            return Oooo0o02;
        }
        throw new o00000O("Protocol message contained an invalid tag (zero).");
    }

    public static int Oooo0O0(byte[] bArr, int i, OooO oooO) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            oooO.f3614OooO00o = b;
            return i2;
        }
        return Oooo0(b, bArr, i2, oooO);
    }

    public static int Oooo0OO(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o000OOo o000ooo = (o000OOo) o000000o2;
        int Oooo0O02 = Oooo0O0(bArr, i2, oooO);
        while (true) {
            o000ooo.OooO0oo(oooO.f3614OooO00o);
            if (Oooo0O02 >= i3) {
                break;
            }
            int Oooo0O03 = Oooo0O0(bArr, Oooo0O02, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            Oooo0O02 = Oooo0O0(bArr, Oooo0O03, oooO);
        }
        return Oooo0O02;
    }

    public static int Oooo0o(int i, byte[] bArr, int i2, int i3, o000000O o000000o2, OooO oooO) {
        o0000O0O o0000o0o2 = (o0000O0O) o000000o2;
        int Oooo0o02 = Oooo0o0(bArr, i2, oooO);
        while (true) {
            o0000o0o2.OooO0oo(oooO.f3615OooO0O0);
            if (Oooo0o02 >= i3) {
                break;
            }
            int Oooo0O02 = Oooo0O0(bArr, Oooo0o02, oooO);
            if (i != oooO.f3614OooO00o) {
                break;
            }
            Oooo0o02 = Oooo0o0(bArr, Oooo0O02, oooO);
        }
        return Oooo0o02;
    }

    public static int Oooo0o0(byte[] bArr, int i, OooO oooO) {
        byte b;
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            oooO.f3615OooO0O0 = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | ((b2 & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (b & Byte.MAX_VALUE) << i4;
            b2 = bArr[i3];
            i3 = i5;
        }
        oooO.f3615OooO0O0 = j2;
        return i3;
    }

    public static String Oooo0oO(OooOo oooOo) {
        String str;
        StringBuilder sb = new StringBuilder(oooOo.size());
        for (int i = 0; i < oooOo.size(); i++) {
            int OooO0o2 = oooOo.OooO0o(i);
            if (OooO0o2 != 34) {
                if (OooO0o2 != 39) {
                    if (OooO0o2 != 92) {
                        switch (OooO0o2) {
                            case 7:
                                str = "\\a";
                                break;
                            case 8:
                                str = "\\b";
                                break;
                            case 9:
                                str = "\\t";
                                break;
                            case 10:
                                str = "\\n";
                                break;
                            case 11:
                                str = "\\v";
                                break;
                            case 12:
                                str = "\\f";
                                break;
                            case 13:
                                str = "\\r";
                                break;
                            default:
                                if (OooO0o2 < 32 || OooO0o2 > 126) {
                                    sb.append('\\');
                                    sb.append((char) (((OooO0o2 >>> 6) & 3) + 48));
                                    sb.append((char) (((OooO0o2 >>> 3) & 7) + 48));
                                    OooO0o2 = (OooO0o2 & 7) + 48;
                                }
                                sb.append((char) OooO0o2);
                                continue;
                                break;
                        }
                    } else {
                        str = "\\\\";
                    }
                } else {
                    str = "\\'";
                }
            } else {
                str = "\\\"";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public static boolean Oooo0oo(byte b) {
        return b > -65;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x01ab, code lost:
        if (((java.lang.Integer) r4).intValue() == 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01bc, code lost:
        if (((java.lang.Float) r4).floatValue() == 0.0f) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ce, code lost:
        if (((java.lang.Double) r4).doubleValue() == 0.0d) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0204, code lost:
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void OoooO00(com.google.crypto.tink.shaded.protobuf.OooO0O0 r13, java.lang.StringBuilder r14, int r15) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.OooOO0.OoooO00(com.google.crypto.tink.shaded.protobuf.OooO0O0, java.lang.StringBuilder, int):void");
    }
}