package com.google.crypto.tink.shaded.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class Oooo0 extends OooOO0 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public o0OO00O.OooO0OO f3631OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final byte[] f3632OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final int f3633OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3634OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public static final Logger f3630OooO0o0 = Logger.getLogger(Oooo0.class.getName());

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final boolean f3629OooO0o = o00O0OO0.f3719OooO0o;

    public Oooo0(byte[] bArr, int i) {
        int i2 = 0 + i;
        if ((0 | i | (bArr.length - i2)) >= 0) {
            this.f3632OooO0O0 = bArr;
            this.f3634OooO0Oo = 0;
            this.f3633OooO0OO = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
    }

    public static int OoooO(int i) {
        return OoooooO(i) + 8;
    }

    public static int OoooO0(int i) {
        return OoooooO(i) + 1;
    }

    public static int OoooO0O(int i, OooOo oooOo) {
        int OoooooO2 = OoooooO(i);
        int size = oooOo.size();
        return o0OoOo0(size) + size + OoooooO2;
    }

    public static int OoooOO0(int i, int i2) {
        return OoooOoo(i2) + OoooooO(i);
    }

    public static int OoooOOO(int i) {
        return OoooooO(i) + 8;
    }

    public static int OoooOOo(int i) {
        return OoooooO(i) + 4;
    }

    public static int OoooOo0(int i, OooO0O0 oooO0O0, o0O0ooO o0o0ooo) {
        return oooO0O0.OooO0O0(o0o0ooo) + (OoooooO(i) * 2);
    }

    public static int OoooOoO(int i, int i2) {
        return OoooOoo(i2) + OoooooO(i);
    }

    public static int OoooOoo(int i) {
        if (i >= 0) {
            return o0OoOo0(i);
        }
        return 10;
    }

    public static int Ooooo00(int i, long j) {
        return o00O0O(j) + OoooooO(i);
    }

    public static int Ooooo0o(int i) {
        return OoooooO(i) + 4;
    }

    public static int OooooO0(int i) {
        return OoooooO(i) + 8;
    }

    public static int OooooOO(int i, int i2) {
        return o0OoOo0((i2 >> 31) ^ (i2 << 1)) + OoooooO(i);
    }

    public static int OooooOo(int i, long j) {
        return o00O0O((j >> 63) ^ (j << 1)) + OoooooO(i);
    }

    public static int Oooooo(String str) {
        int length;
        try {
            length = o00O0OOO.OooO00o(str);
        } catch (o00O0OO unused) {
            length = str.getBytes(o00000.f3650OooO00o).length;
        }
        return o0OoOo0(length) + length;
    }

    public static int Oooooo0(String str, int i) {
        return Oooooo(str) + OoooooO(i);
    }

    public static int OoooooO(int i) {
        return o0OoOo0((i << 3) | 0);
    }

    public static int Ooooooo(int i, int i2) {
        return o0OoOo0(i2) + OoooooO(i);
    }

    public static int o000oOoO(int i) {
        return OoooooO(i) + 4;
    }

    public static int o00O0O(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int o0OoOo0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int ooOO(int i, long j) {
        return o00O0O(j) + OoooooO(i);
    }

    public final void o00Oo0(byte b) {
        try {
            byte[] bArr = this.f3632OooO0O0;
            int i = this.f3634OooO0Oo;
            this.f3634OooO0Oo = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(this.f3633OooO0OO), 1), e);
        }
    }

    public final void o00Ooo(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f3632OooO0O0, this.f3634OooO0Oo, i2);
            this.f3634OooO0Oo += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(this.f3633OooO0OO), Integer.valueOf(i2)), e);
        }
    }

    public final void o00o0O(int i, int i2) {
        o0ooOOo(i, 5);
        o00ooo(i2);
    }

    public final void o00oO0O(int i) {
        if (i >= 0) {
            o0ooOoO(i);
        } else {
            o0Oo0oo(i);
        }
    }

    public final void o00oO0o(long j) {
        try {
            byte[] bArr = this.f3632OooO0O0;
            int i = this.f3634OooO0Oo;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.f3634OooO0Oo = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(this.f3633OooO0OO), 1), e);
        }
    }

    public final void o00ooo(int i) {
        try {
            byte[] bArr = this.f3632OooO0O0;
            int i2 = this.f3634OooO0Oo;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.f3634OooO0Oo = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(this.f3633OooO0OO), 1), e);
        }
    }

    public final void o0OOO0o(int i, long j) {
        o0ooOOo(i, 0);
        o0Oo0oo(j);
    }

    public final void o0Oo0oo(long j) {
        boolean z = f3629OooO0o;
        int i = this.f3633OooO0OO;
        byte[] bArr = this.f3632OooO0O0;
        if (z && i - this.f3634OooO0Oo >= 10) {
            while ((j & (-128)) != 0) {
                int i2 = this.f3634OooO0Oo;
                this.f3634OooO0Oo = i2 + 1;
                o00O0OO0.OooOOo0(bArr, i2, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i3 = this.f3634OooO0Oo;
            this.f3634OooO0Oo = i3 + 1;
            o00O0OO0.OooOOo0(bArr, i3, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                int i4 = this.f3634OooO0Oo;
                this.f3634OooO0Oo = i4 + 1;
                bArr[i4] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(i), 1), e);
            }
        }
        int i5 = this.f3634OooO0Oo;
        this.f3634OooO0Oo = i5 + 1;
        bArr[i5] = (byte) j;
    }

    public final void o0ooOO0(String str) {
        int OoooO0O2;
        int i = this.f3634OooO0Oo;
        try {
            int o0OoOo02 = o0OoOo0(str.length() * 3);
            int o0OoOo03 = o0OoOo0(str.length());
            int i2 = this.f3633OooO0OO;
            byte[] bArr = this.f3632OooO0O0;
            if (o0OoOo03 == o0OoOo02) {
                int i3 = i + o0OoOo03;
                this.f3634OooO0Oo = i3;
                OoooO0O2 = o00O0OOO.f3723OooO00o.OoooO0O(str, bArr, i3, i2 - i3);
                this.f3634OooO0Oo = i;
                o0ooOoO((OoooO0O2 - i) - o0OoOo03);
            } else {
                o0ooOoO(o00O0OOO.OooO00o(str));
                int i4 = this.f3634OooO0Oo;
                OoooO0O2 = o00O0OOO.f3723OooO00o.OoooO0O(str, bArr, i4, i2 - i4);
            }
            this.f3634OooO0Oo = OoooO0O2;
        } catch (o00O0OO e) {
            this.f3634OooO0Oo = i;
            f3630OooO0o0.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(o00000.f3650OooO00o);
            try {
                o0ooOoO(bytes.length);
                o00Ooo(bytes, 0, bytes.length);
            } catch (o000oOoO e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new o000oOoO(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new o000oOoO(e4);
        }
    }

    public final void o0ooOOo(int i, int i2) {
        o0ooOoO((i << 3) | i2);
    }

    public final void o0ooOoO(int i) {
        boolean z = f3629OooO0o;
        int i2 = this.f3633OooO0OO;
        byte[] bArr = this.f3632OooO0O0;
        if (z && !OooO0o.OooO00o()) {
            int i3 = this.f3634OooO0Oo;
            if (i2 - i3 >= 5) {
                if ((i & (-128)) != 0) {
                    this.f3634OooO0Oo = i3 + 1;
                    o00O0OO0.OooOOo0(bArr, i3, (byte) (i | 128));
                    i >>>= 7;
                    if ((i & (-128)) != 0) {
                        int i4 = this.f3634OooO0Oo;
                        this.f3634OooO0Oo = i4 + 1;
                        o00O0OO0.OooOOo0(bArr, i4, (byte) (i | 128));
                        i >>>= 7;
                        if ((i & (-128)) != 0) {
                            int i5 = this.f3634OooO0Oo;
                            this.f3634OooO0Oo = i5 + 1;
                            o00O0OO0.OooOOo0(bArr, i5, (byte) (i | 128));
                            i >>>= 7;
                            if ((i & (-128)) != 0) {
                                int i6 = this.f3634OooO0Oo;
                                this.f3634OooO0Oo = i6 + 1;
                                o00O0OO0.OooOOo0(bArr, i6, (byte) (i | 128));
                                i >>>= 7;
                                i3 = this.f3634OooO0Oo;
                            }
                        }
                    }
                    i3 = this.f3634OooO0Oo;
                }
                this.f3634OooO0Oo = i3 + 1;
                o00O0OO0.OooOOo0(bArr, i3, (byte) i);
                return;
            }
        }
        while ((i & (-128)) != 0) {
            try {
                int i7 = this.f3634OooO0Oo;
                this.f3634OooO0Oo = i7 + 1;
                bArr[i7] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new o000oOoO(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f3634OooO0Oo), Integer.valueOf(i2), 1), e);
            }
        }
        int i8 = this.f3634OooO0Oo;
        this.f3634OooO0Oo = i8 + 1;
        bArr[i8] = (byte) i;
    }

    public final void oo000o(int i, long j) {
        o0ooOOo(i, 1);
        o00oO0o(j);
    }
}