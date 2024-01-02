package o000O000;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class o0OoOo0 implements OooOOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f4860OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOO0 f4861OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4862OooO0OO;

    public o0OoOo0(o0ooOOo o0ooooo) {
        o0000O00.OooO00o.OooOoo0(o0ooooo, "source");
        this.f4860OooO00o = o0ooooo;
        this.f4861OooO0O0 = new OooOO0();
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return this.f4860OooO00o.OooO00o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        return -1;
     */
    @Override // o000O000.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int OooO0Oo(o000O000.Oooo0 r8) {
        /*
            r7 = this;
            java.lang.String r0 = "options"
            o0000O00.OooO00o.OooOoo0(r8, r0)
            boolean r0 = r7.f4862OooO0OO
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L34
        Lb:
            o000O000.OooOO0 r0 = r7.f4861OooO0O0
            int r2 = o000OoO.OooO0o.OooO0O0(r0, r8, r1)
            r3 = -2
            r4 = -1
            if (r2 == r3) goto L24
            if (r2 == r4) goto L32
            o000O000.OooOOO[] r8 = r8.f4838OooO00o
            r8 = r8[r2]
            int r8 = r8.OooO0OO()
            long r3 = (long) r8
            r0.OooOOO(r3)
            goto L33
        L24:
            o000O000.o0ooOOo r2 = r7.f4860OooO00o
            r5 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2.OooO0o0(r0, r5)
            r5 = -1
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 != 0) goto Lb
        L32:
            r2 = r4
        L33:
            return r2
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "closed"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.o0OoOo0.OooO0Oo(o000O000.Oooo0):int");
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
            if (!this.f4862OooO0OO) {
                OooOO0 oooOO02 = this.f4861OooO0O0;
                if (oooOO02.f4823OooO0O0 == 0 && this.f4860OooO00o.OooO0o0(oooOO02, 8192L) == -1) {
                    return -1L;
                }
                return oooOO02.OooO0o0(oooOO0, Math.min(j, oooOO02.f4823OooO0O0));
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // o000O000.OooOOO0
    public final void OooO0oo(long j) {
        if (!OooOoO(j)) {
            throw new EOFException();
        }
    }

    @Override // o000O000.OooOOO0
    public final OooOOO OooOO0(long j) {
        OooO0oo(j);
        return this.f4861OooO0O0.OooOO0(j);
    }

    @Override // o000O000.OooOOO0
    public final String OooOO0o(long j) {
        boolean z;
        long j2;
        OooOO0 oooOO0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (j == Long.MAX_VALUE) {
                j2 = Long.MAX_VALUE;
            } else {
                j2 = j + 1;
            }
            long OooOo2 = OooOo((byte) 10, 0L, j2);
            int i = (OooOo2 > (-1L) ? 1 : (OooOo2 == (-1L) ? 0 : -1));
            OooOO0 oooOO02 = this.f4861OooO0O0;
            if (i != 0) {
                return o000OoO.OooO0o.OooO00o(oooOO02, OooOo2);
            }
            if (j2 < Long.MAX_VALUE && OooOoO(j2) && oooOO02.OooOoO0(j2 - 1) == 13 && OooOoO(1 + j2) && oooOO02.OooOoO0(j2) == 10) {
                return o000OoO.OooO0o.OooO00o(oooOO02, j2);
            }
            oooOO02.OooOo(new OooOO0(), 0L, Math.min(32, oooOO02.f4823OooO0O0));
            throw new EOFException("\\n not found: limit=" + Math.min(oooOO02.f4823OooO0O0, j) + " content=" + oooOO0.OooOO0(oooOO0.f4823OooO0O0).OooO0Oo() + (char) 8230);
        }
        throw new IllegalArgumentException(("limit < 0: " + j).toString());
    }

    @Override // o000O000.OooOOO0
    public final void OooOOO(long j) {
        if (!this.f4862OooO0OO) {
            while (j > 0) {
                OooOO0 oooOO0 = this.f4861OooO0O0;
                if (oooOO0.f4823OooO0O0 == 0 && this.f4860OooO00o.OooO0o0(oooOO0, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, oooOO0.f4823OooO0O0);
                oooOO0.OooOOO(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOOO0
    public final OooOO0 OooOOO0() {
        return this.f4861OooO0O0;
    }

    @Override // o000O000.OooOOO0
    public final boolean OooOOOO() {
        if (!this.f4862OooO0OO) {
            OooOO0 oooOO0 = this.f4861OooO0O0;
            return oooOO0.OooOOOO() && this.f4860OooO00o.OooO0o0(oooOO0, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOOO0
    public final short OooOOo0() {
        OooO0oo(2L);
        return this.f4861OooO0O0.OooOOo0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r0 == 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0034, code lost:
        o0000O00.OooO00o.OooOoo(16);
        o0000O00.OooO00o.OooOoo(16);
        r1 = java.lang.Integer.toString(r2, 16);
        o0000O00.OooO00o.OooOoOO(r1, "toString(this, checkRadix(radix))");
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r1));
     */
    @Override // o000O000.OooOOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long OooOOoo() {
        /*
            r6 = this;
            r0 = 1
            r6.OooO0oo(r0)
            r0 = 0
        L6:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.OooOoO(r2)
            o000O000.OooOO0 r3 = r6.f4861OooO0O0
            if (r2 == 0) goto L51
            long r4 = (long) r0
            byte r2 = r3.OooOoO0(r4)
            r4 = 48
            if (r2 < r4) goto L1e
            r4 = 57
            if (r2 <= r4) goto L2f
        L1e:
            r4 = 97
            if (r2 < r4) goto L26
            r4 = 102(0x66, float:1.43E-43)
            if (r2 <= r4) goto L2f
        L26:
            r4 = 65
            if (r2 < r4) goto L31
            r4 = 70
            if (r2 <= r4) goto L2f
            goto L31
        L2f:
            r0 = r1
            goto L6
        L31:
            if (r0 == 0) goto L34
            goto L51
        L34:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            r1 = 16
            o0000O00.OooO00o.OooOoo(r1)
            o0000O00.OooO00o.OooOoo(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            o0000O00.OooO00o.OooOoOO(r1, r2)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L51:
            long r0 = r3.OooOOoo()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o000O000.o0OoOo0.OooOOoo():long");
    }

    public final long OooOo(byte b, long j, long j2) {
        boolean z = true;
        if (!this.f4862OooO0OO) {
            long j3 = 0;
            if (0 > j2) {
                z = false;
            }
            if (z) {
                while (j3 < j2) {
                    long OooOoO2 = this.f4861OooO0O0.OooOoO(b, j3, j2);
                    if (OooOoO2 != -1) {
                        return OooOoO2;
                    }
                    OooOO0 oooOO0 = this.f4861OooO0O0;
                    long j4 = oooOO0.f4823OooO0O0;
                    if (j4 >= j2 || this.f4860OooO00o.OooO0o0(oooOO0, 8192L) == -1) {
                        return -1L;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1L;
            }
            throw new IllegalArgumentException(("fromIndex=0 toIndex=" + j2).toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.OooOOO0
    public final String OooOo00(Charset charset) {
        OooOO0 oooOO0 = this.f4861OooO0O0;
        oooOO0.Oooo00O(this.f4860OooO00o);
        return oooOO0.OooOoo0(oooOO0.f4823OooO0O0, charset);
    }

    @Override // o000O000.OooOOO0
    public final byte OooOo0O() {
        OooO0oo(1L);
        return this.f4861OooO0O0.OooOo0O();
    }

    @Override // o000O000.OooOOO0
    public final int OooOo0o() {
        OooO0oo(4L);
        return this.f4861OooO0O0.OooOo0o();
    }

    public final boolean OooOoO(long j) {
        boolean z;
        OooOO0 oooOO0;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f4862OooO0OO) {
                do {
                    oooOO0 = this.f4861OooO0O0;
                    if (oooOO0.f4823OooO0O0 >= j) {
                        return true;
                    }
                } while (this.f4860OooO00o.OooO0o0(oooOO0, 8192L) != -1);
                return false;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public final int OooOoO0() {
        OooO0oo(4L);
        int OooOo0o2 = this.f4861OooO0O0.OooOo0o();
        return ((OooOo0o2 & 255) << 24) | (((-16777216) & OooOo0o2) >>> 24) | ((16711680 & OooOo0o2) >>> 8) | ((65280 & OooOo0o2) << 8);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f4862OooO0OO) {
            this.f4862OooO0OO = true;
            this.f4860OooO00o.close();
            OooOO0 oooOO0 = this.f4861OooO0O0;
            oooOO0.OooOOO(oooOO0.f4823OooO0O0);
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f4862OooO0OO;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        o0000O00.OooO00o.OooOoo0(byteBuffer, "sink");
        OooOO0 oooOO0 = this.f4861OooO0O0;
        if (oooOO0.f4823OooO0O0 == 0 && this.f4860OooO00o.OooO0o0(oooOO0, 8192L) == -1) {
            return -1;
        }
        return oooOO0.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f4860OooO00o + ')';
    }
}