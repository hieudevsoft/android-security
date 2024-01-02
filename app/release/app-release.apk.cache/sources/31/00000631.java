package o000O000;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class OooOo00 implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public byte f4833OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OoOo0 f4834OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Inflater f4835OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final OooOo f4836OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final CRC32 f4837OooO0o0;

    public OooOo00(o0ooOOo o0ooooo) {
        o0000O00.OooO00o.OooOoo0(o0ooooo, "source");
        o0OoOo0 o0oooo0 = new o0OoOo0(o0ooooo);
        this.f4834OooO0O0 = o0oooo0;
        Inflater inflater = new Inflater(true);
        this.f4835OooO0OO = inflater;
        this.f4836OooO0Oo = new OooOo(o0oooo0, inflater);
        this.f4837OooO0o0 = new CRC32();
    }

    public static void OooOo(String str, int i, int i2) {
        if (i2 == i) {
            return;
        }
        String format = String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3));
        o0000O00.OooO00o.OooOoOO(format, "format(this, *args)");
        throw new IOException(format);
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return this.f4834OooO0O0.OooO00o();
    }

    @Override // o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        boolean z;
        o0OoOo0 o0oooo0;
        boolean z2;
        OooOO0 oooOO02;
        boolean z3;
        boolean z4;
        boolean z5;
        long j2;
        o0000O00.OooO00o.OooOoo0(oooOO0, "sink");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                return 0L;
            }
            byte b = this.f4833OooO00o;
            CRC32 crc32 = this.f4837OooO0o0;
            o0OoOo0 o0oooo02 = this.f4834OooO0O0;
            if (b == 0) {
                o0oooo02.OooO0oo(10L);
                OooOO0 oooOO03 = o0oooo02.f4861OooO0O0;
                byte OooOoO02 = oooOO03.OooOoO0(3L);
                if (((OooOoO02 >> 1) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    oooOO02 = oooOO03;
                    OooOoO0(o0oooo02.f4861OooO0O0, 0L, 10L);
                } else {
                    oooOO02 = oooOO03;
                }
                OooOo("ID1ID2", 8075, o0oooo02.OooOOo0());
                o0oooo02.OooOOO(8L);
                if (((OooOoO02 >> 2) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    o0oooo02.OooO0oo(2L);
                    if (z2) {
                        OooOoO0(o0oooo02.f4861OooO0O0, 0L, 2L);
                    }
                    int OooOOo02 = oooOO02.OooOOo0() & 65535;
                    long j3 = ((short) (((OooOOo02 & 255) << 8) | ((OooOOo02 & 65280) >>> 8))) & 65535;
                    o0oooo02.OooO0oo(j3);
                    if (z2) {
                        OooOoO0(o0oooo02.f4861OooO0O0, 0L, j3);
                        j2 = j3;
                    } else {
                        j2 = j3;
                    }
                    o0oooo02.OooOOO(j2);
                }
                if (((OooOoO02 >> 3) & 1) == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    long OooOo2 = o0oooo02.OooOo((byte) 0, 0L, Long.MAX_VALUE);
                    if (OooOo2 != -1) {
                        if (z2) {
                            o0oooo0 = o0oooo02;
                            OooOoO0(o0oooo02.f4861OooO0O0, 0L, OooOo2 + 1);
                        } else {
                            o0oooo0 = o0oooo02;
                        }
                        o0oooo0.OooOOO(OooOo2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    o0oooo0 = o0oooo02;
                }
                if (((OooOoO02 >> 4) & 1) == 1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    long OooOo3 = o0oooo0.OooOo((byte) 0, 0L, Long.MAX_VALUE);
                    if (OooOo3 != -1) {
                        if (z2) {
                            OooOoO0(o0oooo0.f4861OooO0O0, 0L, OooOo3 + 1);
                        }
                        o0oooo0.OooOOO(OooOo3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z2) {
                    o0oooo0.OooO0oo(2L);
                    int OooOOo03 = oooOO02.OooOOo0() & 65535;
                    OooOo("FHCRC", (short) (((OooOOo03 & 255) << 8) | ((OooOOo03 & 65280) >>> 8)), (short) crc32.getValue());
                    crc32.reset();
                }
                this.f4833OooO00o = (byte) 1;
            } else {
                o0oooo0 = o0oooo02;
            }
            if (this.f4833OooO00o == 1) {
                long j4 = oooOO0.f4823OooO0O0;
                long OooO0o02 = this.f4836OooO0Oo.OooO0o0(oooOO0, j);
                if (OooO0o02 != -1) {
                    OooOoO0(oooOO0, j4, OooO0o02);
                    return OooO0o02;
                }
                this.f4833OooO00o = (byte) 2;
            }
            if (this.f4833OooO00o == 2) {
                OooOo("CRC", o0oooo0.OooOoO0(), (int) crc32.getValue());
                OooOo("ISIZE", o0oooo0.OooOoO0(), (int) this.f4835OooO0OO.getBytesWritten());
                this.f4833OooO00o = (byte) 3;
                if (!o0oooo0.OooOOOO()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    public final void OooOoO0(OooOO0 oooOO0, long j, long j2) {
        int i;
        o00O0O o00o0o = oooOO0.f4822OooO00o;
        while (true) {
            o0000O00.OooO00o.OooOo(o00o0o);
            int i2 = o00o0o.f4846OooO0OO;
            int i3 = o00o0o.f4845OooO0O0;
            if (j < i2 - i3) {
                break;
            }
            j -= i2 - i3;
            o00o0o = o00o0o.f4848OooO0o;
        }
        while (j2 > 0) {
            int min = (int) Math.min(o00o0o.f4846OooO0OO - i, j2);
            this.f4837OooO0o0.update(o00o0o.f4844OooO00o, (int) (o00o0o.f4845OooO0O0 + j), min);
            j2 -= min;
            o00o0o = o00o0o.f4848OooO0o;
            o0000O00.OooO00o.OooOo(o00o0o);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f4836OooO0Oo.close();
    }
}