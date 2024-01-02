package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class Oooo000 {

    /* renamed from: OooO  reason: collision with root package name */
    public int f3635OooO = Integer.MAX_VALUE;

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3636OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public o000oOoO.o00O0O f3637OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final byte[] f3638OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3639OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f3640OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f3641OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final int f3642OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f3643OooO0oo;

    public Oooo000(byte[] bArr, int i, int i2, boolean z) {
        this.f3638OooO0OO = bArr;
        this.f3639OooO0Oo = i2 + i;
        this.f3640OooO0o = i;
        this.f3642OooO0oO = i;
    }

    public static int OooO00o(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long OooO0O0(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public final long OooO() {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.f3640OooO0o;
        int i3 = this.f3639OooO0Oo;
        if (i3 != i2) {
            int i4 = i2 + 1;
            byte[] bArr = this.f3638OooO0OO;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f3640OooO0o = i4;
                return b;
            } else if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 >= 0) {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = (bArr[i5] << 28) ^ j4;
                            if (j5 >= 0) {
                                j2 = j5 ^ 266354560;
                                i5 = i10;
                            } else {
                                int i11 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i7 = i11 + 1;
                                    long j7 = j6 ^ (bArr[i11] << 42);
                                    if (j7 >= 0) {
                                        j = j7 ^ 4363953127296L;
                                    } else {
                                        i11 = i7 + 1;
                                        j6 = j7 ^ (bArr[i7] << 49);
                                        if (j6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i7 = i11 + 1;
                                            j = (j6 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i11 = i7 + 1;
                                                if (bArr[i7] >= 0) {
                                                    j2 = j;
                                                    i5 = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                j2 = j3 ^ j6;
                                i5 = i11;
                            }
                            this.f3640OooO0o = i5;
                            return j2;
                        }
                        i = i9 ^ (-2080896);
                    }
                    i5 = i7;
                    j2 = j;
                    this.f3640OooO0o = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.f3640OooO0o = i5;
                return j2;
            }
        }
        return OooOO0();
    }

    public final boolean OooO0OO() {
        return this.f3640OooO0o == this.f3639OooO0Oo;
    }

    public final int OooO0Oo(int i) {
        if (i >= 0) {
            int i2 = this.f3640OooO0o;
            int i3 = this.f3642OooO0oO;
            int i4 = (i2 - i3) + i;
            int i5 = this.f3635OooO;
            if (i4 <= i5) {
                this.f3635OooO = i4;
                int i6 = this.f3639OooO0Oo + this.f3641OooO0o0;
                this.f3639OooO0Oo = i6;
                int i7 = i6 - i3;
                if (i7 > i4) {
                    int i8 = i7 - i4;
                    this.f3641OooO0o0 = i8;
                    this.f3639OooO0Oo = i6 - i8;
                } else {
                    this.f3641OooO0o0 = 0;
                }
                return i5;
            }
            throw o00000O.OooO0o();
        }
        throw o00000O.OooO0Oo();
    }

    public final int OooO0o() {
        int i = this.f3640OooO0o;
        if (this.f3639OooO0Oo - i >= 4) {
            this.f3640OooO0o = i + 4;
            byte[] bArr = this.f3638OooO0OO;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        throw o00000O.OooO0o();
    }

    public final boolean OooO0o0() {
        return OooO() != 0;
    }

    public final long OooO0oO() {
        int i = this.f3640OooO0o;
        if (this.f3639OooO0Oo - i >= 8) {
            this.f3640OooO0o = i + 8;
            byte[] bArr = this.f3638OooO0OO;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }
        throw o00000O.OooO0o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
        if (r3[r2] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0oo() {
        /*
            r5 = this;
            int r0 = r5.f3640OooO0o
            int r1 = r5.f3639OooO0Oo
            if (r1 != r0) goto L7
            goto L6a
        L7:
            int r2 = r0 + 1
            byte[] r3 = r5.f3638OooO0OO
            r0 = r3[r0]
            if (r0 < 0) goto L12
            r5.f3640OooO0o = r2
            return r0
        L12:
            int r1 = r1 - r2
            r4 = 9
            if (r1 >= r4) goto L18
            goto L6a
        L18:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 7
            r0 = r0 ^ r2
            if (r0 >= 0) goto L24
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L70
        L24:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L31
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2f:
            r1 = r2
            goto L70
        L31:
            int r1 = r2 + 1
            r2 = r3[r2]
            int r2 = r2 << 21
            r0 = r0 ^ r2
            if (r0 >= 0) goto L3f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L70
        L3f:
            int r2 = r1 + 1
            r1 = r3[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
            int r2 = r1 + 1
            r1 = r3[r1]
            if (r1 >= 0) goto L2f
            int r1 = r2 + 1
            r2 = r3[r2]
            if (r2 >= 0) goto L70
        L6a:
            long r0 = r5.OooOO0()
            int r0 = (int) r0
            return r0
        L70:
            r5.f3640OooO0o = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.Oooo000.OooO0oo():int");
    }

    public final long OooOO0() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            int i2 = this.f3640OooO0o;
            if (i2 != this.f3639OooO0Oo) {
                this.f3640OooO0o = i2 + 1;
                byte b = this.f3638OooO0OO[i2];
                j |= (b & Byte.MAX_VALUE) << i;
                if ((b & 128) == 0) {
                    return j;
                }
            } else {
                throw o00000O.OooO0o();
            }
        }
        throw o00000O.OooO0OO();
    }

    public final int OooOO0O() {
        if (OooO0OO()) {
            this.f3643OooO0oo = 0;
            return 0;
        }
        int OooO0oo2 = OooO0oo();
        this.f3643OooO0oo = OooO0oo2;
        if ((OooO0oo2 >>> 3) != 0) {
            return OooO0oo2;
        }
        throw new o00000O("Protocol message contained an invalid tag (zero).");
    }
}