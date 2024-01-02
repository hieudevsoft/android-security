package o0000oOO;

import Oooo0oO.o0oOO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;
import o000O000.OooOOO;

/* loaded from: classes.dex */
public final class Oooo0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final o000O000.o0OoOo0 f4602OooO0Oo;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f4605OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f4606OooO0oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4599OooO00o = 4096;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4600OooO0O0 = 4096;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final ArrayList f4601OooO0OO = new ArrayList();

    /* renamed from: OooO0o0  reason: collision with root package name */
    public Oooo000[] f4604OooO0o0 = new Oooo000[8];

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4603OooO0o = 7;

    public Oooo0(o00000O0 o00000o02) {
        this.f4602OooO0Oo = new o000O000.o0OoOo0(o00000o02);
    }

    public final int OooO00o(int i) {
        int i2;
        int i3 = 0;
        if (i > 0) {
            int length = this.f4604OooO0o0.length;
            while (true) {
                length--;
                i2 = this.f4603OooO0o;
                if (length < i2 || i <= 0) {
                    break;
                }
                Oooo000 oooo000 = this.f4604OooO0o0[length];
                OooO00o.OooOo(oooo000);
                int i4 = oooo000.f4615OooO0OO;
                i -= i4;
                this.f4606OooO0oo -= i4;
                this.f4605OooO0oO--;
                i3++;
            }
            Oooo000[] oooo000Arr = this.f4604OooO0o0;
            System.arraycopy(oooo000Arr, i2 + 1, oooo000Arr, i2 + 1 + i3, this.f4605OooO0oO);
            this.f4603OooO0o += i3;
        }
        return i3;
    }

    public final OooOOO OooO0O0(int i) {
        boolean z;
        Oooo000 oooo000;
        if (i >= 0 && i <= o0OoOo0.f4744OooO00o.length - 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            oooo000 = o0OoOo0.f4744OooO00o[i];
        } else {
            int length = this.f4603OooO0o + 1 + (i - o0OoOo0.f4744OooO00o.length);
            if (length >= 0) {
                Oooo000[] oooo000Arr = this.f4604OooO0o0;
                if (length < oooo000Arr.length) {
                    oooo000 = oooo000Arr[length];
                    OooO00o.OooOo(oooo000);
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }
        return oooo000.f4613OooO00o;
    }

    public final void OooO0OO(Oooo000 oooo000) {
        this.f4601OooO0OO.add(oooo000);
        int i = this.f4600OooO0O0;
        int i2 = oooo000.f4615OooO0OO;
        if (i2 > i) {
            Oooo000[] oooo000Arr = this.f4604OooO0o0;
            Arrays.fill(oooo000Arr, 0, oooo000Arr.length, (Object) null);
            this.f4603OooO0o = this.f4604OooO0o0.length - 1;
            this.f4605OooO0oO = 0;
            this.f4606OooO0oo = 0;
            return;
        }
        OooO00o((this.f4606OooO0oo + i2) - i);
        int i3 = this.f4605OooO0oO + 1;
        Oooo000[] oooo000Arr2 = this.f4604OooO0o0;
        if (i3 > oooo000Arr2.length) {
            Oooo000[] oooo000Arr3 = new Oooo000[oooo000Arr2.length * 2];
            System.arraycopy(oooo000Arr2, 0, oooo000Arr3, oooo000Arr2.length, oooo000Arr2.length);
            this.f4603OooO0o = this.f4604OooO0o0.length - 1;
            this.f4604OooO0o0 = oooo000Arr3;
        }
        int i4 = this.f4603OooO0o;
        this.f4603OooO0o = i4 - 1;
        this.f4604OooO0o0[i4] = oooo000;
        this.f4605OooO0oO++;
        this.f4606OooO0oo += i2;
    }

    public final OooOOO OooO0Oo() {
        boolean z;
        int i;
        o000O000.o0OoOo0 o0oooo0 = this.f4602OooO0Oo;
        byte OooOo0O2 = o0oooo0.OooOo0O();
        byte[] bArr = OooOO0O.f4403OooO00o;
        int i2 = OooOo0O2 & 255;
        int i3 = 0;
        if ((i2 & 128) == 128) {
            z = true;
        } else {
            z = false;
        }
        long OooO0o02 = OooO0o0(i2, 127);
        if (z) {
            OooOO0 oooOO0 = new OooOO0();
            int[] iArr = o0000O0O.f4682OooO00o;
            OooO00o.OooOoo0(o0oooo0, "source");
            o0oOO o0ooo = o0000O0O.f4684OooO0OO;
            o0oOO o0ooo2 = o0ooo;
            int i4 = 0;
            for (long j = 0; j < OooO0o02; j++) {
                byte OooOo0O3 = o0oooo0.OooOo0O();
                byte[] bArr2 = OooOO0O.f4403OooO00o;
                i3 = (i3 << 8) | (OooOo0O3 & 255);
                i4 += 8;
                while (i4 >= 8) {
                    int i5 = i4 - 8;
                    o0oOO[] o0oooArr = (o0oOO[]) o0ooo2.f1509OooO0OO;
                    OooO00o.OooOo(o0oooArr);
                    o0ooo2 = o0oooArr[(i3 >>> i5) & 255];
                    OooO00o.OooOo(o0ooo2);
                    if (((o0oOO[]) o0ooo2.f1509OooO0OO) == null) {
                        oooOO0.Oooo00o(o0ooo2.f1507OooO00o);
                        i4 -= o0ooo2.f1508OooO0O0;
                        o0ooo2 = o0ooo;
                    } else {
                        i4 = i5;
                    }
                }
            }
            while (i4 > 0) {
                o0oOO[] o0oooArr2 = (o0oOO[]) o0ooo2.f1509OooO0OO;
                OooO00o.OooOo(o0oooArr2);
                o0oOO o0ooo3 = o0oooArr2[(i3 << (8 - i4)) & 255];
                OooO00o.OooOo(o0ooo3);
                if (((o0oOO[]) o0ooo3.f1509OooO0OO) != null || (i = o0ooo3.f1508OooO0O0) > i4) {
                    break;
                }
                oooOO0.Oooo00o(o0ooo3.f1507OooO00o);
                i4 -= i;
                o0ooo2 = o0ooo;
            }
            return oooOO0.OooOO0(oooOO0.f4823OooO0O0);
        }
        return o0oooo0.OooOO0(OooO0o02);
    }

    public final int OooO0o0(int i, int i2) {
        int i3 = i & i2;
        if (i3 < i2) {
            return i3;
        }
        int i4 = 0;
        while (true) {
            byte OooOo0O2 = this.f4602OooO0Oo.OooOo0O();
            byte[] bArr = OooOO0O.f4403OooO00o;
            int i5 = OooOo0O2 & 255;
            if ((i5 & 128) != 0) {
                i2 += (i5 & 127) << i4;
                i4 += 7;
            } else {
                return i2 + (i5 << i4);
            }
        }
    }
}