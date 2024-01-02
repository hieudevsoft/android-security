package o000O000;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class OooOO0 implements OooOOO0, OooOO0O, Cloneable, ByteChannel {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o00O0O f4822OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public long f4823OooO0O0;

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooO(OooOOO oooOOO) {
        OooOooo(oooOOO);
        return this;
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return o0Oo0oo.f4856OooO0Oo;
    }

    @Override // o000O000.OooOO0O
    public final OooOO0O OooO0O0(byte[] bArr) {
        Oooo000(bArr, 0, bArr.length);
        return this;
    }

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooO0OO(int i) {
        Oooo0O0(i);
        return this;
    }

    @Override // o000O000.OooOOO0
    public final int OooO0Oo(Oooo0 oooo0) {
        o0000O00.OooO00o.OooOoo0(oooo0, "options");
        int OooO0O02 = o000OoO.OooO0o.OooO0O0(this, oooo0, false);
        if (OooO0O02 == -1) {
            return -1;
        }
        OooOOO(oooo0.f4838OooO00o[OooO0O02].OooO0OO());
        return OooO0O02;
    }

    @Override // o000O000.OooOOO0
    public final String OooO0o() {
        return OooOO0o(Long.MAX_VALUE);
    }

    @Override // o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        boolean z;
        o0000O00.OooO00o.OooOoo0(oooOO0, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = this.f4823OooO0O0;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            oooOO0.OooOo0(this, j);
            return j;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooO0oO(long j) {
        Oooo0(j);
        return this;
    }

    @Override // o000O000.OooOOO0
    public final void OooO0oo(long j) {
        if (this.f4823OooO0O0 < j) {
            throw new EOFException();
        }
    }

    @Override // o000O000.OooOOO0
    public final OooOOO OooOO0(long j) {
        boolean z;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f4823OooO0O0 >= j) {
                if (j >= 4096) {
                    OooOOO OooOoo2 = OooOoo((int) j);
                    OooOOO(j);
                    return OooOoo2;
                }
                return new OooOOO(OooOoOO(j));
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooOO0O(String str) {
        Oooo0o0(str);
        return this;
    }

    @Override // o000O000.OooOOO0
    public final String OooOO0o(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long OooOoO2 = OooOoO((byte) 10, 0L, j2);
            if (OooOoO2 != -1) {
                return o000OoO.OooO0o.OooO00o(this, OooOoO2);
            }
            if (j2 < this.f4823OooO0O0 && OooOoO0(j2 - 1) == 13 && OooOoO0(j2) == 10) {
                return o000OoO.OooO0o.OooO00o(this, j2);
            }
            OooOO0 oooOO0 = new OooOO0();
            OooOo(oooOO0, 0L, Math.min(32, this.f4823OooO0O0));
            throw new EOFException("\\n not found: limit=" + Math.min(this.f4823OooO0O0, j) + " content=" + oooOO0.OooOO0(oooOO0.f4823OooO0O0).OooO0Oo() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // o000O000.OooOOO0
    public final void OooOOO(long j) {
        while (j > 0) {
            o00O0O o00o0o = this.f4822OooO00o;
            if (o00o0o != null) {
                int min = (int) Math.min(j, o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0);
                long j2 = min;
                this.f4823OooO0O0 -= j2;
                j -= j2;
                int i = o00o0o.f4845OooO0O0 + min;
                o00o0o.f4845OooO0O0 = i;
                if (i == o00o0o.f4846OooO0OO) {
                    this.f4822OooO00o = o00o0o.OooO00o();
                    o00Oo0.OooO00o(o00o0o);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // o000O000.OooOOO0
    public final OooOO0 OooOOO0() {
        return this;
    }

    @Override // o000O000.OooOOO0
    public final boolean OooOOOO() {
        return this.f4823OooO0O0 == 0;
    }

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooOOOo(int i) {
        Oooo00o(i);
        return this;
    }

    @Override // o000O000.OooOO0O
    public final /* bridge */ /* synthetic */ OooOO0O OooOOo(int i) {
        Oooo0OO(i);
        return this;
    }

    @Override // o000O000.OooOOO0
    public final short OooOOo0() {
        if (this.f4823OooO0O0 >= 2) {
            o00O0O o00o0o = this.f4822OooO00o;
            o0000O00.OooO00o.OooOo(o00o0o);
            int i = o00o0o.f4845OooO0O0;
            int i2 = o00o0o.f4846OooO0OO;
            if (i2 - i < 2) {
                return (short) (((OooOo0O() & 255) << 8) | (OooOo0O() & 255));
            }
            int i3 = i + 1;
            byte[] bArr = o00o0o.f4844OooO00o;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f4823OooO0O0 -= 2;
            if (i4 == i2) {
                this.f4822OooO00o = o00o0o.OooO00o();
                o00Oo0.OooO00o(o00o0o);
            } else {
                o00o0o.f4845OooO0O0 = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a8 A[EDGE_INSN: B:44:0x00a8->B:39:0x00a8 ?: BREAK  , SYNTHETIC] */
    @Override // o000O000.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOOoo() {
        /*
            r14 = this;
            long r0 = r14.f4823OooO0O0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Laf
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            o000O000.o00O0O r7 = r14.f4822OooO00o
            o0000O00.OooO00o.OooOo(r7)
            int r8 = r7.f4845OooO0O0
            int r9 = r7.f4846OooO0OO
        L15:
            if (r8 >= r9) goto L94
            byte[] r10 = r7.f4844OooO00o
            r10 = r10[r8]
            r11 = 48
            if (r10 < r11) goto L26
            r11 = 57
            if (r10 > r11) goto L26
            int r11 = r10 + (-48)
            goto L3d
        L26:
            r11 = 97
            if (r10 < r11) goto L31
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L31
            int r11 = r10 + (-97)
            goto L3b
        L31:
            r11 = 65
            if (r10 < r11) goto L6c
            r11 = 70
            if (r10 > r11) goto L6c
            int r11 = r10 + (-65)
        L3b:
            int r11 = r11 + 10
        L3d:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4d
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L15
        L4d:
            o000O000.OooOO0 r0 = new o000O000.OooOO0
            r0.<init>()
            r0.Oooo0(r4)
            r0.Oooo00o(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            long r2 = r0.f4823OooO0O0
            java.nio.charset.Charset r4 = o0000Oo0.OooO0O0.f4385OooO00o
            java.lang.String r0 = r0.OooOoo0(r2, r4)
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6c:
            r6 = 1
            if (r1 == 0) goto L70
            goto L94
        L70:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 2
            char[] r2 = new char[r2]
            char[] r3 = com.google.gson.internal.OooO0o.f3787OooO0OO
            int r4 = r10 >> 4
            r4 = r4 & 15
            char r4 = r3[r4]
            r2[r0] = r4
            r0 = r10 & 15
            char r0 = r3[r0]
            r2[r6] = r0
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L94:
            if (r8 != r9) goto La0
            o000O000.o00O0O r8 = r7.OooO00o()
            r14.f4822OooO00o = r8
            o000O000.o00Oo0.OooO00o(r7)
            goto La2
        La0:
            r7.f4845OooO0O0 = r8
        La2:
            if (r6 != 0) goto La8
            o000O000.o00O0O r7 = r14.f4822OooO00o
            if (r7 != 0) goto Lc
        La8:
            long r2 = r14.f4823OooO0O0
            long r0 = (long) r1
            long r2 = r2 - r0
            r14.f4823OooO0O0 = r2
            return r4
        Laf:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.OooOO0.OooOOoo():long");
    }

    public final void OooOo(OooOO0 oooOO0, long j, long j2) {
        o0000O00.OooO00o.OooOoo0(oooOO0, "out");
        com.google.gson.internal.OooO0o.OooO0o(this.f4823OooO0O0, j, j2);
        if (j2 != 0) {
            oooOO0.f4823OooO0O0 += j2;
            o00O0O o00o0o = this.f4822OooO00o;
            while (true) {
                o0000O00.OooO00o.OooOo(o00o0o);
                long j3 = o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                if (j < j3) {
                    break;
                }
                j -= j3;
                o00o0o = o00o0o.f4848OooO0o;
            }
            while (j2 > 0) {
                o0000O00.OooO00o.OooOo(o00o0o);
                o00O0O OooO0OO2 = o00o0o.OooO0OO();
                int i = OooO0OO2.f4845OooO0O0 + ((int) j);
                OooO0OO2.f4845OooO0O0 = i;
                OooO0OO2.f4846OooO0OO = Math.min(i + ((int) j2), OooO0OO2.f4846OooO0OO);
                o00O0O o00o0o2 = oooOO0.f4822OooO00o;
                if (o00o0o2 == null) {
                    OooO0OO2.f4850OooO0oO = OooO0OO2;
                    OooO0OO2.f4848OooO0o = OooO0OO2;
                    oooOO0.f4822OooO00o = OooO0OO2;
                } else {
                    o00O0O o00o0o3 = o00o0o2.f4850OooO0oO;
                    o0000O00.OooO00o.OooOo(o00o0o3);
                    o00o0o3.OooO0O0(OooO0OO2);
                }
                j2 -= OooO0OO2.f4846OooO0OO - OooO0OO2.f4845OooO0O0;
                o00o0o = o00o0o.f4848OooO0o;
                j = 0;
            }
        }
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        boolean z;
        o00O0O o00o0o;
        boolean z2;
        int i;
        o00O0O o00o0o2;
        boolean z3;
        o00O0O OooO0O02;
        int i2;
        o0000O00.OooO00o.OooOoo0(oooOO0, "source");
        if (oooOO0 != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            com.google.gson.internal.OooO0o.OooO0o(oooOO0.f4823OooO0O0, 0L, j);
            while (j > 0) {
                o00O0O o00o0o3 = oooOO0.f4822OooO00o;
                o0000O00.OooO00o.OooOo(o00o0o3);
                int i3 = o00o0o3.f4846OooO0OO;
                o0000O00.OooO00o.OooOo(oooOO0.f4822OooO00o);
                if (j < i3 - o00o0o.f4845OooO0O0) {
                    o00O0O o00o0o4 = this.f4822OooO00o;
                    if (o00o0o4 != null) {
                        o00o0o2 = o00o0o4.f4850OooO0oO;
                    } else {
                        o00o0o2 = null;
                    }
                    if (o00o0o2 != null && o00o0o2.f4849OooO0o0) {
                        long j2 = o00o0o2.f4846OooO0OO + j;
                        if (o00o0o2.f4847OooO0Oo) {
                            i2 = 0;
                        } else {
                            i2 = o00o0o2.f4845OooO0O0;
                        }
                        if (j2 - i2 <= 8192) {
                            o00O0O o00o0o5 = oooOO0.f4822OooO00o;
                            o0000O00.OooO00o.OooOo(o00o0o5);
                            o00o0o5.OooO0Oo(o00o0o2, (int) j);
                            oooOO0.f4823OooO0O0 -= j;
                            this.f4823OooO0O0 += j;
                            return;
                        }
                    }
                    o00O0O o00o0o6 = oooOO0.f4822OooO00o;
                    o0000O00.OooO00o.OooOo(o00o0o6);
                    int i4 = (int) j;
                    if (i4 > 0 && i4 <= o00o0o6.f4846OooO0OO - o00o0o6.f4845OooO0O0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z3) {
                        if (i4 >= 1024) {
                            OooO0O02 = o00o0o6.OooO0OO();
                        } else {
                            OooO0O02 = o00Oo0.OooO0O0();
                            int i5 = o00o0o6.f4845OooO0O0;
                            o0000.OooOOOO.o00O0OO0(0, i5, i5 + i4, o00o0o6.f4844OooO00o, OooO0O02.f4844OooO00o);
                        }
                        OooO0O02.f4846OooO0OO = OooO0O02.f4845OooO0O0 + i4;
                        o00o0o6.f4845OooO0O0 += i4;
                        o00O0O o00o0o7 = o00o0o6.f4850OooO0oO;
                        o0000O00.OooO00o.OooOo(o00o0o7);
                        o00o0o7.OooO0O0(OooO0O02);
                        oooOO0.f4822OooO00o = OooO0O02;
                    } else {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                }
                o00O0O o00o0o8 = oooOO0.f4822OooO00o;
                o0000O00.OooO00o.OooOo(o00o0o8);
                long j3 = o00o0o8.f4846OooO0OO - o00o0o8.f4845OooO0O0;
                oooOO0.f4822OooO00o = o00o0o8.OooO00o();
                o00O0O o00o0o9 = this.f4822OooO00o;
                if (o00o0o9 == null) {
                    this.f4822OooO00o = o00o0o8;
                    o00o0o8.f4850OooO0oO = o00o0o8;
                    o00o0o8.f4848OooO0o = o00o0o8;
                } else {
                    o00O0O o00o0o10 = o00o0o9.f4850OooO0oO;
                    o0000O00.OooO00o.OooOo(o00o0o10);
                    o00o0o10.OooO0O0(o00o0o8);
                    o00O0O o00o0o11 = o00o0o8.f4850OooO0oO;
                    if (o00o0o11 != o00o0o8) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        o0000O00.OooO00o.OooOo(o00o0o11);
                        if (o00o0o11.f4849OooO0o0) {
                            int i6 = o00o0o8.f4846OooO0OO - o00o0o8.f4845OooO0O0;
                            o00O0O o00o0o12 = o00o0o8.f4850OooO0oO;
                            o0000O00.OooO00o.OooOo(o00o0o12);
                            int i7 = 8192 - o00o0o12.f4846OooO0OO;
                            o00O0O o00o0o13 = o00o0o8.f4850OooO0oO;
                            o0000O00.OooO00o.OooOo(o00o0o13);
                            if (o00o0o13.f4847OooO0Oo) {
                                i = 0;
                            } else {
                                o00O0O o00o0o14 = o00o0o8.f4850OooO0oO;
                                o0000O00.OooO00o.OooOo(o00o0o14);
                                i = o00o0o14.f4845OooO0O0;
                            }
                            if (i6 <= i7 + i) {
                                o00O0O o00o0o15 = o00o0o8.f4850OooO0oO;
                                o0000O00.OooO00o.OooOo(o00o0o15);
                                o00o0o8.OooO0Oo(o00o0o15, i6);
                                o00o0o8.OooO00o();
                                o00Oo0.OooO00o(o00o0o8);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cannot compact".toString());
                    }
                }
                oooOO0.f4823OooO0O0 -= j3;
                this.f4823OooO0O0 += j3;
                j -= j3;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    @Override // o000O000.OooOOO0
    public final String OooOo00(Charset charset) {
        return OooOoo0(this.f4823OooO0O0, charset);
    }

    @Override // o000O000.OooOOO0
    public final byte OooOo0O() {
        if (this.f4823OooO0O0 != 0) {
            o00O0O o00o0o = this.f4822OooO00o;
            o0000O00.OooO00o.OooOo(o00o0o);
            int i = o00o0o.f4845OooO0O0;
            int i2 = o00o0o.f4846OooO0OO;
            int i3 = i + 1;
            byte b = o00o0o.f4844OooO00o[i];
            this.f4823OooO0O0--;
            if (i3 == i2) {
                this.f4822OooO00o = o00o0o.OooO00o();
                o00Oo0.OooO00o(o00o0o);
            } else {
                o00o0o.f4845OooO0O0 = i3;
            }
            return b;
        }
        throw new EOFException();
    }

    @Override // o000O000.OooOOO0
    public final int OooOo0o() {
        if (this.f4823OooO0O0 >= 4) {
            o00O0O o00o0o = this.f4822OooO00o;
            o0000O00.OooO00o.OooOo(o00o0o);
            int i = o00o0o.f4845OooO0O0;
            int i2 = o00o0o.f4846OooO0OO;
            if (i2 - i < 4) {
                return ((OooOo0O() & 255) << 24) | ((OooOo0O() & 255) << 16) | ((OooOo0O() & 255) << 8) | (OooOo0O() & 255);
            }
            int i3 = i + 1;
            byte[] bArr = o00o0o.f4844OooO00o;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f4823OooO0O0 -= 4;
            if (i8 == i2) {
                this.f4822OooO00o = o00o0o.OooO00o();
                o00Oo0.OooO00o(o00o0o);
            } else {
                o00o0o.f4845OooO0O0 = i8;
            }
            return i9;
        }
        throw new EOFException();
    }

    public final long OooOoO(byte b, long j, long j2) {
        o00O0O o00o0o;
        long j3 = 0;
        boolean z = false;
        if (0 <= j && j <= j2) {
            z = true;
        }
        if (z) {
            long j4 = this.f4823OooO0O0;
            if (j2 > j4) {
                j2 = j4;
            }
            if (j == j2 || (o00o0o = this.f4822OooO00o) == null) {
                return -1L;
            }
            if (j4 - j < j) {
                while (j4 > j) {
                    o00o0o = o00o0o.f4850OooO0oO;
                    o0000O00.OooO00o.OooOo(o00o0o);
                    j4 -= o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                }
                while (j4 < j2) {
                    int min = (int) Math.min(o00o0o.f4846OooO0OO, (o00o0o.f4845OooO0O0 + j2) - j4);
                    for (int i = (int) ((o00o0o.f4845OooO0O0 + j) - j4); i < min; i++) {
                        if (o00o0o.f4844OooO00o[i] == b) {
                            return (i - o00o0o.f4845OooO0O0) + j4;
                        }
                    }
                    j4 += o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                    o00o0o = o00o0o.f4848OooO0o;
                    o0000O00.OooO00o.OooOo(o00o0o);
                    j = j4;
                }
                return -1L;
            }
            while (true) {
                long j5 = (o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0) + j3;
                if (j5 > j) {
                    break;
                }
                o00o0o = o00o0o.f4848OooO0o;
                o0000O00.OooO00o.OooOo(o00o0o);
                j3 = j5;
            }
            while (j3 < j2) {
                int min2 = (int) Math.min(o00o0o.f4846OooO0OO, (o00o0o.f4845OooO0O0 + j2) - j3);
                for (int i2 = (int) ((o00o0o.f4845OooO0O0 + j) - j3); i2 < min2; i2++) {
                    if (o00o0o.f4844OooO00o[i2] == b) {
                        return (i2 - o00o0o.f4845OooO0O0) + j3;
                    }
                }
                j3 += o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                o00o0o = o00o0o.f4848OooO0o;
                o0000O00.OooO00o.OooOo(o00o0o);
                j = j3;
            }
            return -1L;
        }
        throw new IllegalArgumentException(("size=" + this.f4823OooO0O0 + " fromIndex=" + j + " toIndex=" + j2).toString());
    }

    public final byte OooOoO0(long j) {
        com.google.gson.internal.OooO0o.OooO0o(this.f4823OooO0O0, j, 1L);
        o00O0O o00o0o = this.f4822OooO00o;
        if (o00o0o != null) {
            long j2 = this.f4823OooO0O0;
            if (j2 - j < j) {
                while (j2 > j) {
                    o00o0o = o00o0o.f4850OooO0oO;
                    o0000O00.OooO00o.OooOo(o00o0o);
                    j2 -= o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                }
                return o00o0o.f4844OooO00o[(int) ((o00o0o.f4845OooO0O0 + j) - j2)];
            }
            long j3 = 0;
            while (true) {
                int i = o00o0o.f4846OooO0OO;
                int i2 = o00o0o.f4845OooO0O0;
                long j4 = (i - i2) + j3;
                if (j4 <= j) {
                    o00o0o = o00o0o.f4848OooO0o;
                    o0000O00.OooO00o.OooOo(o00o0o);
                    j3 = j4;
                } else {
                    return o00o0o.f4844OooO00o[(int) ((i2 + j) - j3)];
                }
            }
        } else {
            o0000O00.OooO00o.OooOo(null);
            throw null;
        }
    }

    public final byte[] OooOoOO(long j) {
        boolean z;
        int min;
        int i = 0;
        if (j >= 0 && j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f4823OooO0O0 >= j) {
                int i2 = (int) j;
                byte[] bArr = new byte[i2];
                while (i < i2) {
                    int i3 = i2 - i;
                    com.google.gson.internal.OooO0o.OooO0o(i2, i, i3);
                    o00O0O o00o0o = this.f4822OooO00o;
                    if (o00o0o == null) {
                        min = -1;
                    } else {
                        min = Math.min(i3, o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0);
                        int i4 = o00o0o.f4845OooO0O0;
                        o0000.OooOOOO.o00O0OO0(i, i4, i4 + min, o00o0o.f4844OooO00o, bArr);
                        int i5 = o00o0o.f4845OooO0O0 + min;
                        o00o0o.f4845OooO0O0 = i5;
                        this.f4823OooO0O0 -= min;
                        if (i5 == o00o0o.f4846OooO0OO) {
                            this.f4822OooO00o = o00o0o.OooO00o();
                            o00Oo0.OooO00o(o00o0o);
                        }
                    }
                    if (min != -1) {
                        i += min;
                    } else {
                        throw new EOFException();
                    }
                }
                return bArr;
            }
            throw new EOFException();
        }
        throw new IllegalArgumentException(("byteCount: " + j).toString());
    }

    public final OooOOO OooOoo(int i) {
        if (i == 0) {
            return OooOOO.f4824OooO0Oo;
        }
        com.google.gson.internal.OooO0o.OooO0o(this.f4823OooO0O0, 0L, i);
        o00O0O o00o0o = this.f4822OooO00o;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            o0000O00.OooO00o.OooOo(o00o0o);
            int i5 = o00o0o.f4846OooO0OO;
            int i6 = o00o0o.f4845OooO0O0;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                o00o0o = o00o0o.f4848OooO0o;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        o00O0O o00o0o2 = this.f4822OooO00o;
        int i7 = 0;
        while (i2 < i) {
            o0000O00.OooO00o.OooOo(o00o0o2);
            bArr[i7] = o00o0o2.f4844OooO00o;
            i2 += o00o0o2.f4846OooO0OO - o00o0o2.f4845OooO0O0;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = o00o0o2.f4845OooO0O0;
            o00o0o2.f4847OooO0Oo = true;
            i7++;
            o00o0o2 = o00o0o2.f4848OooO0o;
        }
        return new o00Ooo(bArr, iArr);
    }

    public final String OooOoo0(long j, Charset charset) {
        o0000O00.OooO00o.OooOoo0(charset, "charset");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j).toString());
        } else if (this.f4823OooO0O0 >= j) {
            if (i == 0) {
                return "";
            }
            o00O0O o00o0o = this.f4822OooO00o;
            o0000O00.OooO00o.OooOo(o00o0o);
            int i2 = o00o0o.f4845OooO0O0;
            if (i2 + j > o00o0o.f4846OooO0OO) {
                return new String(OooOoOO(j), charset);
            }
            int i3 = (int) j;
            String str = new String(o00o0o.f4844OooO00o, i2, i3, charset);
            int i4 = o00o0o.f4845OooO0O0 + i3;
            o00o0o.f4845OooO0O0 = i4;
            this.f4823OooO0O0 -= j;
            if (i4 == o00o0o.f4846OooO0OO) {
                this.f4822OooO00o = o00o0o.OooO00o();
                o00Oo0.OooO00o(o00o0o);
            }
            return str;
        } else {
            throw new EOFException();
        }
    }

    public final o00O0O OooOooO(int i) {
        boolean z = true;
        if ((i < 1 || i > 8192) ? false : false) {
            o00O0O o00o0o = this.f4822OooO00o;
            if (o00o0o == null) {
                o00O0O OooO0O02 = o00Oo0.OooO0O0();
                this.f4822OooO00o = OooO0O02;
                OooO0O02.f4850OooO0oO = OooO0O02;
                OooO0O02.f4848OooO0o = OooO0O02;
                return OooO0O02;
            }
            o00O0O o00o0o2 = o00o0o.f4850OooO0oO;
            o0000O00.OooO00o.OooOo(o00o0o2);
            if (o00o0o2.f4846OooO0OO + i > 8192 || !o00o0o2.f4849OooO0o0) {
                o00O0O OooO0O03 = o00Oo0.OooO0O0();
                o00o0o2.OooO0O0(OooO0O03);
                return OooO0O03;
            }
            return o00o0o2;
        }
        throw new IllegalArgumentException("unexpected capacity".toString());
    }

    public final void OooOooo(OooOOO oooOOO) {
        o0000O00.OooO00o.OooOoo0(oooOOO, "byteString");
        oooOOO.OooOO0O(this, oooOOO.OooO0OO());
    }

    public final OooOO0 Oooo0(long j) {
        if (j == 0) {
            Oooo00o(48);
        } else {
            long j2 = (j >>> 1) | j;
            long j3 = j2 | (j2 >>> 2);
            long j4 = j3 | (j3 >>> 4);
            long j5 = j4 | (j4 >>> 8);
            long j6 = j5 | (j5 >>> 16);
            long j7 = j6 | (j6 >>> 32);
            long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
            long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
            long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
            long j11 = j10 + (j10 >>> 8);
            long j12 = j11 + (j11 >>> 16);
            int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
            o00O0O OooOooO2 = OooOooO(i);
            int i2 = OooOooO2.f4846OooO0OO;
            for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
                OooOooO2.f4844OooO00o[i3] = o000OoO.OooO0o.f4879OooO00o[(int) (15 & j)];
                j >>>= 4;
            }
            OooOooO2.f4846OooO0OO += i;
            this.f4823OooO0O0 += i;
        }
        return this;
    }

    public final void Oooo000(byte[] bArr, int i, int i2) {
        o0000O00.OooO00o.OooOoo0(bArr, "source");
        long j = i2;
        com.google.gson.internal.OooO0o.OooO0o(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            o00O0O OooOooO2 = OooOooO(1);
            int min = Math.min(i3 - i, 8192 - OooOooO2.f4846OooO0OO);
            int i4 = i + min;
            o0000.OooOOOO.o00O0OO0(OooOooO2.f4846OooO0OO, i, i4, bArr, OooOooO2.f4844OooO00o);
            OooOooO2.f4846OooO0OO += min;
            i = i4;
        }
        this.f4823OooO0O0 += j;
    }

    public final void Oooo00O(o0ooOOo o0ooooo) {
        o0000O00.OooO00o.OooOoo0(o0ooooo, "source");
        do {
        } while (o0ooooo.OooO0o0(this, 8192L) != -1);
    }

    public final void Oooo00o(int i) {
        o00O0O OooOooO2 = OooOooO(1);
        int i2 = OooOooO2.f4846OooO0OO;
        OooOooO2.f4846OooO0OO = i2 + 1;
        OooOooO2.f4844OooO00o[i2] = (byte) i;
        this.f4823OooO0O0++;
    }

    public final void Oooo0O0(int i) {
        o00O0O OooOooO2 = OooOooO(4);
        int i2 = OooOooO2.f4846OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = OooOooO2.f4844OooO00o;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        OooOooO2.f4846OooO0OO = i5 + 1;
        this.f4823OooO0O0 += 4;
    }

    public final void Oooo0OO(int i) {
        o00O0O OooOooO2 = OooOooO(2);
        int i2 = OooOooO2.f4846OooO0OO;
        int i3 = i2 + 1;
        byte[] bArr = OooOooO2.f4844OooO00o;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        OooOooO2.f4846OooO0OO = i3 + 1;
        this.f4823OooO0O0 += 2;
    }

    public final void Oooo0o(String str, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        char charAt;
        long j;
        long j2;
        char c;
        boolean z4;
        o0000O00.OooO00o.OooOoo0(str, "string");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= i) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i2 <= str.length()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            o00O0O OooOooO2 = OooOooO(1);
                            int i3 = OooOooO2.f4846OooO0OO - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            byte[] bArr = OooOooO2.f4844OooO00o;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = OooOooO2.f4846OooO0OO;
                            int i6 = (i3 + i) - i5;
                            OooOooO2.f4846OooO0OO = i5 + i6;
                            this.f4823OooO0O0 += i6;
                        } else {
                            if (charAt2 < 2048) {
                                o00O0O OooOooO3 = OooOooO(2);
                                int i7 = OooOooO3.f4846OooO0OO;
                                byte[] bArr2 = OooOooO3.f4844OooO00o;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | 128);
                                OooOooO3.f4846OooO0OO = i7 + 2;
                                j = this.f4823OooO0O0;
                                j2 = 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319) {
                                    if (56320 <= c && c < 57344) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (z4) {
                                        int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + 65536;
                                        o00O0O OooOooO4 = OooOooO(4);
                                        int i10 = OooOooO4.f4846OooO0OO;
                                        byte[] bArr3 = OooOooO4.f4844OooO00o;
                                        bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                        bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | 128);
                                        bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | 128);
                                        bArr3[i10 + 3] = (byte) ((i9 & 63) | 128);
                                        OooOooO4.f4846OooO0OO = i10 + 4;
                                        this.f4823OooO0O0 += 4;
                                        i += 2;
                                    }
                                }
                                Oooo00o(63);
                                i = i8;
                            } else {
                                o00O0O OooOooO5 = OooOooO(3);
                                int i11 = OooOooO5.f4846OooO0OO;
                                byte[] bArr4 = OooOooO5.f4844OooO00o;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | 128);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | 128);
                                OooOooO5.f4846OooO0OO = i11 + 3;
                                j = this.f4823OooO0O0;
                                j2 = 3;
                            }
                            this.f4823OooO0O0 = j + j2;
                            i++;
                        }
                    }
                    return;
                }
                StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("endIndex > string.length: ", i2, " > ");
                OooO0o02.append(str.length());
                throw new IllegalArgumentException(OooO0o02.toString().toString());
            }
            throw new IllegalArgumentException(("endIndex < beginIndex: " + i2 + " < " + i).toString());
        }
        throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("beginIndex < 0: ", i).toString());
    }

    public final void Oooo0o0(String str) {
        o0000O00.OooO00o.OooOoo0(str, "string");
        Oooo0o(str, 0, str.length());
    }

    public final void Oooo0oO(int i) {
        boolean z;
        String str;
        long j;
        long j2;
        if (i < 128) {
            Oooo00o(i);
            return;
        }
        if (i < 2048) {
            o00O0O OooOooO2 = OooOooO(2);
            int i2 = OooOooO2.f4846OooO0OO;
            byte[] bArr = OooOooO2.f4844OooO00o;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | 128);
            OooOooO2.f4846OooO0OO = i2 + 2;
            j = this.f4823OooO0O0;
            j2 = 2;
        } else {
            int i3 = 0;
            if (55296 <= i && i < 57344) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Oooo00o(63);
                return;
            } else if (i < 65536) {
                o00O0O OooOooO3 = OooOooO(3);
                int i4 = OooOooO3.f4846OooO0OO;
                byte[] bArr2 = OooOooO3.f4844OooO00o;
                bArr2[i4] = (byte) ((i >> 12) | 224);
                bArr2[i4 + 1] = (byte) (((i >> 6) & 63) | 128);
                bArr2[i4 + 2] = (byte) ((i & 63) | 128);
                OooOooO3.f4846OooO0OO = i4 + 3;
                j = this.f4823OooO0O0;
                j2 = 3;
            } else if (i <= 1114111) {
                o00O0O OooOooO4 = OooOooO(4);
                int i5 = OooOooO4.f4846OooO0OO;
                byte[] bArr3 = OooOooO4.f4844OooO00o;
                bArr3[i5] = (byte) ((i >> 18) | 240);
                bArr3[i5 + 1] = (byte) (((i >> 12) & 63) | 128);
                bArr3[i5 + 2] = (byte) (((i >> 6) & 63) | 128);
                bArr3[i5 + 3] = (byte) ((i & 63) | 128);
                OooOooO4.f4846OooO0OO = i5 + 4;
                j = this.f4823OooO0O0;
                j2 = 4;
            } else {
                StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
                if (i != 0) {
                    char[] cArr = com.google.gson.internal.OooO0o.f3787OooO0OO;
                    char[] cArr2 = {cArr[(i >> 28) & 15], cArr[(i >> 24) & 15], cArr[(i >> 20) & 15], cArr[(i >> 16) & 15], cArr[(i >> 12) & 15], cArr[(i >> 8) & 15], cArr[(i >> 4) & 15], cArr[i & 15]};
                    while (i3 < 8 && cArr2[i3] == '0') {
                        i3++;
                    }
                    if (i3 >= 0) {
                        if (i3 <= 8) {
                            str = new String(cArr2, i3, 8 - i3);
                        } else {
                            throw new IllegalArgumentException("startIndex: " + i3 + " > endIndex: 8");
                        }
                    } else {
                        throw new IndexOutOfBoundsException("startIndex: " + i3 + ", endIndex: 8, size: 8");
                    }
                } else {
                    str = "0";
                }
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f4823OooO0O0 = j + j2;
    }

    public final Object clone() {
        OooOO0 oooOO0 = new OooOO0();
        if (this.f4823OooO0O0 != 0) {
            o00O0O o00o0o = this.f4822OooO00o;
            o0000O00.OooO00o.OooOo(o00o0o);
            o00O0O OooO0OO2 = o00o0o.OooO0OO();
            oooOO0.f4822OooO00o = OooO0OO2;
            OooO0OO2.f4850OooO0oO = OooO0OO2;
            OooO0OO2.f4848OooO0o = OooO0OO2;
            for (o00O0O o00o0o2 = o00o0o.f4848OooO0o; o00o0o2 != o00o0o; o00o0o2 = o00o0o2.f4848OooO0o) {
                o00O0O o00o0o3 = OooO0OO2.f4850OooO0oO;
                o0000O00.OooO00o.OooOo(o00o0o3);
                o0000O00.OooO00o.OooOo(o00o0o2);
                o00o0o3.OooO0O0(o00o0o2.OooO0OO());
            }
            oooOO0.f4823OooO0O0 = this.f4823OooO0O0;
        }
        return oooOO0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, o000O000.oo000o
    public final void close() {
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OooOO0) {
                long j = this.f4823OooO0O0;
                OooOO0 oooOO0 = (OooOO0) obj;
                if (j == oooOO0.f4823OooO0O0) {
                    if (j != 0) {
                        o00O0O o00o0o = this.f4822OooO00o;
                        o0000O00.OooO00o.OooOo(o00o0o);
                        o00O0O o00o0o2 = oooOO0.f4822OooO00o;
                        o0000O00.OooO00o.OooOo(o00o0o2);
                        int i = o00o0o.f4845OooO0O0;
                        int i2 = o00o0o2.f4845OooO0O0;
                        long j2 = 0;
                        while (j2 < this.f4823OooO0O0) {
                            long min = Math.min(o00o0o.f4846OooO0OO - i, o00o0o2.f4846OooO0OO - i2);
                            long j3 = 0;
                            while (j3 < min) {
                                int i3 = i + 1;
                                byte b = o00o0o.f4844OooO00o[i];
                                int i4 = i2 + 1;
                                if (b == o00o0o2.f4844OooO00o[i2]) {
                                    j3++;
                                    i2 = i4;
                                    i = i3;
                                }
                            }
                            if (i == o00o0o.f4846OooO0OO) {
                                o00O0O o00o0o3 = o00o0o.f4848OooO0o;
                                o0000O00.OooO00o.OooOo(o00o0o3);
                                i = o00o0o3.f4845OooO0O0;
                                o00o0o = o00o0o3;
                            }
                            if (i2 == o00o0o2.f4846OooO0OO) {
                                o00o0o2 = o00o0o2.f4848OooO0o;
                                o0000O00.OooO00o.OooOo(o00o0o2);
                                i2 = o00o0o2.f4845OooO0O0;
                            }
                            j2 += min;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // o000O000.OooOO0O, o000O000.oo000o, java.io.Flushable
    public final void flush() {
    }

    public final int hashCode() {
        o00O0O o00o0o = this.f4822OooO00o;
        if (o00o0o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = o00o0o.f4846OooO0OO;
            for (int i3 = o00o0o.f4845OooO0O0; i3 < i2; i3++) {
                i = (i * 31) + o00o0o.f4844OooO00o[i3];
            }
            o00o0o = o00o0o.f4848OooO0o;
            o0000O00.OooO00o.OooOo(o00o0o);
        } while (o00o0o != this.f4822OooO00o);
        return i;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o0000O00.OooO00o.OooOoo0(byteBuffer, "sink");
        o00O0O o00o0o = this.f4822OooO00o;
        if (o00o0o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0);
        byteBuffer.put(o00o0o.f4844OooO00o, o00o0o.f4845OooO0O0, min);
        int i = o00o0o.f4845OooO0O0 + min;
        o00o0o.f4845OooO0O0 = i;
        this.f4823OooO0O0 -= min;
        if (i == o00o0o.f4846OooO0OO) {
            this.f4822OooO00o = o00o0o.OooO00o();
            o00Oo0.OooO00o(o00o0o);
        }
        return min;
    }

    public final String toString() {
        boolean z;
        long j = this.f4823OooO0O0;
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return OooOoo((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f4823OooO0O0).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        o0000O00.OooO00o.OooOoo0(byteBuffer, "source");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            o00O0O OooOooO2 = OooOooO(1);
            int min = Math.min(i, 8192 - OooOooO2.f4846OooO0OO);
            byteBuffer.get(OooOooO2.f4844OooO00o, OooOooO2.f4846OooO0OO, min);
            i -= min;
            OooOooO2.f4846OooO0OO += min;
        }
        this.f4823OooO0O0 += remaining;
        return remaining;
    }
}