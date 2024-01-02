package o0000oOO;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0000O00.OooO00o;
import o000O000.OooOO0;
import o000O000.OooOO0O;

/* loaded from: classes.dex */
public final class o0000O0 implements Closeable {

    /* renamed from: OooO0oO  reason: collision with root package name */
    public static final Logger f4675OooO0oO = Logger.getLogger(o00O0O.class.getName());

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOO0O f4676OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final boolean f4677OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final OooOO0 f4678OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4679OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final o000oOoO f4680OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4681OooO0o0;

    public o0000O0(OooOO0O oooOO0O, boolean z) {
        this.f4676OooO00o = oooOO0O;
        this.f4677OooO0O0 = z;
        OooOO0 oooOO0 = new OooOO0();
        this.f4678OooO0OO = oooOO0;
        this.f4679OooO0Oo = 16384;
        this.f4680OooO0o = new o000oOoO(oooOO0);
    }

    public final synchronized void OooOo(o0000O o0000o2) {
        int i;
        int i2;
        OooO00o.OooOoo0(o0000o2, "peerSettings");
        if (!this.f4681OooO0o0) {
            int i3 = this.f4679OooO0Oo;
            int i4 = o0000o2.f4673OooO00o;
            if ((i4 & 32) != 0) {
                i3 = o0000o2.f4674OooO0O0[5];
            }
            this.f4679OooO0Oo = i3;
            if ((i4 & 2) != 0) {
                i = o0000o2.f4674OooO0O0[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                o000oOoO o000oooo = this.f4680OooO0o;
                if ((i4 & 2) != 0) {
                    i2 = o0000o2.f4674OooO0O0[1];
                } else {
                    i2 = -1;
                }
                o000oooo.getClass();
                int min = Math.min(i2, 16384);
                int i5 = o000oooo.f4712OooO0o0;
                if (i5 != min) {
                    if (min < i5) {
                        o000oooo.f4709OooO0OO = Math.min(o000oooo.f4709OooO0OO, min);
                    }
                    o000oooo.f4710OooO0Oo = true;
                    o000oooo.f4712OooO0o0 = min;
                    int i6 = o000oooo.f4706OooO;
                    if (min < i6) {
                        if (min == 0) {
                            Oooo000[] oooo000Arr = o000oooo.f4711OooO0o;
                            Arrays.fill(oooo000Arr, 0, oooo000Arr.length, (Object) null);
                            o000oooo.f4713OooO0oO = o000oooo.f4711OooO0o.length - 1;
                            o000oooo.f4714OooO0oo = 0;
                            o000oooo.f4706OooO = 0;
                        } else {
                            o000oooo.OooO00o(i6 - min);
                        }
                    }
                }
            }
            OooOoO(0, 0, 4, 1);
            this.f4676OooO00o.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final void OooOoO(int i, int i2, int i3, int i4) {
        boolean z;
        Level level = Level.FINE;
        Logger logger = f4675OooO0oO;
        boolean z2 = false;
        if (logger.isLoggable(level)) {
            logger.fine(o00O0O.OooO00o(i, i2, i3, i4, false));
        }
        if (i2 <= this.f4679OooO0Oo) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((Integer.MIN_VALUE & i) == 0) {
                z2 = true;
            }
            if (z2) {
                byte[] bArr = o0000OoO.OooOO0O.f4403OooO00o;
                OooOO0O oooOO0O = this.f4676OooO00o;
                OooO00o.OooOoo0(oooOO0O, "<this>");
                oooOO0O.OooOOOo((i2 >>> 16) & 255);
                oooOO0O.OooOOOo((i2 >>> 8) & 255);
                oooOO0O.OooOOOo(i2 & 255);
                oooOO0O.OooOOOo(i3 & 255);
                oooOO0O.OooOOOo(i4 & 255);
                oooOO0O.OooO0OO(i & Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO0O0("reserved bit set: ", i).toString());
        }
        throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f4679OooO0Oo + ": " + i2).toString());
    }

    public final synchronized void OooOoO0(boolean z, int i, OooOO0 oooOO0, int i2) {
        if (!this.f4681OooO0o0) {
            OooOoO(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                OooO00o.OooOo(oooOO0);
                this.f4676OooO00o.OooOo0(oooOO0, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void OooOoOO(int i, OooOo oooOo, byte[] bArr) {
        boolean z;
        if (!this.f4681OooO0o0) {
            boolean z2 = false;
            if (oooOo.f4598OooO00o != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                OooOoO(0, bArr.length + 8, 7, 0);
                this.f4676OooO00o.OooO0OO(i);
                this.f4676OooO00o.OooO0OO(oooOo.f4598OooO00o);
                if (bArr.length == 0) {
                    z2 = true;
                }
                if (!z2) {
                    this.f4676OooO00o.OooO0O0(bArr);
                }
                this.f4676OooO00o.flush();
            } else {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void OooOoo(int i, OooOo oooOo) {
        boolean z;
        OooO00o.OooOoo0(oooOo, "errorCode");
        if (!this.f4681OooO0o0) {
            if (oooOo.f4598OooO00o != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                OooOoO(i, 4, 3, 0);
                this.f4676OooO00o.OooO0OO(oooOo.f4598OooO00o);
                this.f4676OooO00o.flush();
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void OooOoo0(int i, int i2, boolean z) {
        if (this.f4681OooO0o0) {
            throw new IOException("closed");
        }
        OooOoO(0, 8, 6, z ? 1 : 0);
        this.f4676OooO00o.OooO0OO(i);
        this.f4676OooO00o.OooO0OO(i2);
        this.f4676OooO00o.flush();
    }

    public final synchronized void OooOooO(int i, long j) {
        if (this.f4681OooO0o0) {
            throw new IOException("closed");
        }
        if (!(j != 0 && j <= 2147483647L)) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
        }
        OooOoO(i, 4, 8, 0);
        this.f4676OooO00o.OooO0OO((int) j);
        this.f4676OooO00o.flush();
    }

    public final void OooOooo(int i, long j) {
        while (j > 0) {
            long min = Math.min(this.f4679OooO0Oo, j);
            j -= min;
            OooOoO(i, (int) min, 9, j == 0 ? 4 : 0);
            this.f4676OooO00o.OooOo0(this.f4678OooO0OO, min);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f4681OooO0o0 = true;
        this.f4676OooO00o.close();
    }
}