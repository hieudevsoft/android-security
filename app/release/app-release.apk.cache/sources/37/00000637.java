package o000O000;

import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class o00Ooo extends OooOOO {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final transient int[] f4854OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final transient byte[][] f4855OooO0o0;

    public o00Ooo(byte[][] bArr, int[] iArr) {
        super(OooOOO.f4824OooO0Oo.f4825OooO00o);
        this.f4855OooO0o0 = bArr;
        this.f4854OooO0o = iArr;
    }

    @Override // o000O000.OooOOO
    public final OooOOO OooO() {
        return new OooOOO(OooOO0o()).OooO();
    }

    @Override // o000O000.OooOOO
    public final String OooO00o() {
        throw null;
    }

    @Override // o000O000.OooOOO
    public final OooOOO OooO0O0(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.f4855OooO0o0;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f4854OooO0o;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        o0000O00.OooO00o.OooOo(digest);
        return new OooOOO(digest);
    }

    @Override // o000O000.OooOOO
    public final int OooO0OO() {
        return this.f4854OooO0o[this.f4855OooO0o0.length - 1];
    }

    @Override // o000O000.OooOOO
    public final String OooO0Oo() {
        return new OooOOO(OooOO0o()).OooO0Oo();
    }

    @Override // o000O000.OooOOO
    public final byte OooO0o(int i) {
        byte[][] bArr = this.f4855OooO0o0;
        int[] iArr = this.f4854OooO0o;
        com.google.gson.internal.OooO0o.OooO0o(iArr[bArr.length - 1], i, 1L);
        int o000o00O = o0000O00.OooO00o.o000o00O(this, i);
        return bArr[o000o00O][(i - (o000o00O == 0 ? 0 : iArr[o000o00O - 1])) + iArr[bArr.length + o000o00O]];
    }

    @Override // o000O000.OooOOO
    public final byte[] OooO0o0() {
        return OooOO0o();
    }

    @Override // o000O000.OooOOO
    public final boolean OooO0oO(int i, int i2, int i3, byte[] bArr) {
        int i4;
        o0000O00.OooO00o.OooOoo0(bArr, "other");
        if (i < 0 || i > OooO0OO() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int o000o00O = o0000O00.OooO00o.o000o00O(this, i);
        while (i < i5) {
            int[] iArr = this.f4854OooO0o;
            if (o000o00O == 0) {
                i4 = 0;
            } else {
                i4 = iArr[o000o00O - 1];
            }
            byte[][] bArr2 = this.f4855OooO0o0;
            int i6 = iArr[bArr2.length + o000o00O];
            int min = Math.min(i5, (iArr[o000o00O] - i4) + i4) - i;
            if (!com.google.gson.internal.OooO0o.OooO0O0((i - i4) + i6, i2, min, bArr2[o000o00O], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            o000o00O++;
        }
        return true;
    }

    @Override // o000O000.OooOOO
    public final boolean OooO0oo(OooOOO oooOOO, int i) {
        int i2;
        o0000O00.OooO00o.OooOoo0(oooOOO, "other");
        if (OooO0OO() - i < 0) {
            return false;
        }
        int i3 = i + 0;
        int o000o00O = o0000O00.OooO00o.o000o00O(this, 0);
        int i4 = 0;
        int i5 = 0;
        while (i4 < i3) {
            int[] iArr = this.f4854OooO0o;
            if (o000o00O == 0) {
                i2 = 0;
            } else {
                i2 = iArr[o000o00O - 1];
            }
            byte[][] bArr = this.f4855OooO0o0;
            int i6 = iArr[bArr.length + o000o00O];
            int min = Math.min(i3, (iArr[o000o00O] - i2) + i2) - i4;
            if (!oooOOO.OooO0oO(i5, (i4 - i2) + i6, min, bArr[o000o00O])) {
                return false;
            }
            i5 += min;
            i4 += min;
            o000o00O++;
        }
        return true;
    }

    @Override // o000O000.OooOOO
    public final void OooOO0O(OooOO0 oooOO0, int i) {
        int i2;
        o0000O00.OooO00o.OooOoo0(oooOO0, "buffer");
        int i3 = 0 + i;
        int o000o00O = o0000O00.OooO00o.o000o00O(this, 0);
        int i4 = 0;
        while (i4 < i3) {
            int[] iArr = this.f4854OooO0o;
            if (o000o00O == 0) {
                i2 = 0;
            } else {
                i2 = iArr[o000o00O - 1];
            }
            byte[][] bArr = this.f4855OooO0o0;
            int i5 = iArr[bArr.length + o000o00O];
            int min = Math.min(i3, (iArr[o000o00O] - i2) + i2) - i4;
            int i6 = (i4 - i2) + i5;
            o00O0O o00o0o = new o00O0O(bArr[o000o00O], i6, i6 + min, true);
            o00O0O o00o0o2 = oooOO0.f4822OooO00o;
            if (o00o0o2 == null) {
                o00o0o.f4850OooO0oO = o00o0o;
                o00o0o.f4848OooO0o = o00o0o;
                oooOO0.f4822OooO00o = o00o0o;
            } else {
                o00O0O o00o0o3 = o00o0o2.f4850OooO0oO;
                o0000O00.OooO00o.OooOo(o00o0o3);
                o00o0o3.OooO0O0(o00o0o);
            }
            i4 += min;
            o000o00O++;
        }
        oooOO0.f4823OooO0O0 += i;
    }

    public final byte[] OooOO0o() {
        byte[] bArr = new byte[OooO0OO()];
        byte[][] bArr2 = this.f4855OooO0o0;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f4854OooO0o;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            o0000.OooOOOO.o00O0OO0(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // o000O000.OooOOO
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof OooOOO) {
                OooOOO oooOOO = (OooOOO) obj;
                if (oooOOO.OooO0OO() != OooO0OO() || !OooO0oo(oooOOO, OooO0OO())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // o000O000.OooOOO
    public final int hashCode() {
        int i = this.f4826OooO0O0;
        if (i == 0) {
            byte[][] bArr = this.f4855OooO0o0;
            int length = bArr.length;
            int i2 = 0;
            int i3 = 1;
            int i4 = 0;
            while (i2 < length) {
                int[] iArr = this.f4854OooO0o;
                int i5 = iArr[length + i2];
                int i6 = iArr[i2];
                byte[] bArr2 = bArr[i2];
                int i7 = (i6 - i4) + i5;
                while (i5 < i7) {
                    i3 = (i3 * 31) + bArr2[i5];
                    i5++;
                }
                i2++;
                i4 = i6;
            }
            this.f4826OooO0O0 = i3;
            return i3;
        }
        return i;
    }

    @Override // o000O000.OooOOO
    public final String toString() {
        return new OooOOO(OooOO0o()).toString();
    }
}