package o0000oOO;

import java.util.Arrays;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;
import o000O000.OooOOO;

/* loaded from: classes.dex */
public final class o000oOoO {

    /* renamed from: OooO  reason: collision with root package name */
    public int f4706OooO;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOO0 f4708OooO0O0;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4710OooO0Oo;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public int f4714OooO0oo;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4707OooO00o = true;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4709OooO0OO = Integer.MAX_VALUE;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4712OooO0o0 = 4096;

    /* renamed from: OooO0o  reason: collision with root package name */
    public Oooo000[] f4711OooO0o = new Oooo000[8];

    /* renamed from: OooO0oO  reason: collision with root package name */
    public int f4713OooO0oO = 7;

    public o000oOoO(OooOO0 oooOO0) {
        this.f4708OooO0O0 = oooOO0;
    }

    public final void OooO00o(int i) {
        int i2;
        if (i > 0) {
            int length = this.f4711OooO0o.length - 1;
            int i3 = 0;
            while (true) {
                i2 = this.f4713OooO0oO;
                if (length < i2 || i <= 0) {
                    break;
                }
                Oooo000 oooo000 = this.f4711OooO0o[length];
                OooO00o.OooOo(oooo000);
                i -= oooo000.f4615OooO0OO;
                int i4 = this.f4706OooO;
                Oooo000 oooo0002 = this.f4711OooO0o[length];
                OooO00o.OooOo(oooo0002);
                this.f4706OooO = i4 - oooo0002.f4615OooO0OO;
                this.f4714OooO0oo--;
                i3++;
                length--;
            }
            Oooo000[] oooo000Arr = this.f4711OooO0o;
            int i5 = i2 + 1;
            System.arraycopy(oooo000Arr, i5, oooo000Arr, i5 + i3, this.f4714OooO0oo);
            Oooo000[] oooo000Arr2 = this.f4711OooO0o;
            int i6 = this.f4713OooO0oO + 1;
            Arrays.fill(oooo000Arr2, i6, i6 + i3, (Object) null);
            this.f4713OooO0oO += i3;
        }
    }

    public final void OooO0O0(Oooo000 oooo000) {
        int i = this.f4712OooO0o0;
        int i2 = oooo000.f4615OooO0OO;
        if (i2 > i) {
            Oooo000[] oooo000Arr = this.f4711OooO0o;
            Arrays.fill(oooo000Arr, 0, oooo000Arr.length, (Object) null);
            this.f4713OooO0oO = this.f4711OooO0o.length - 1;
            this.f4714OooO0oo = 0;
            this.f4706OooO = 0;
            return;
        }
        OooO00o((this.f4706OooO + i2) - i);
        int i3 = this.f4714OooO0oo + 1;
        Oooo000[] oooo000Arr2 = this.f4711OooO0o;
        if (i3 > oooo000Arr2.length) {
            Oooo000[] oooo000Arr3 = new Oooo000[oooo000Arr2.length * 2];
            System.arraycopy(oooo000Arr2, 0, oooo000Arr3, oooo000Arr2.length, oooo000Arr2.length);
            this.f4713OooO0oO = this.f4711OooO0o.length - 1;
            this.f4711OooO0o = oooo000Arr3;
        }
        int i4 = this.f4713OooO0oO;
        this.f4713OooO0oO = i4 - 1;
        this.f4711OooO0o[i4] = oooo000;
        this.f4714OooO0oo++;
        this.f4706OooO += i2;
    }

    public final void OooO0OO(OooOOO oooOOO) {
        int OooO0OO2;
        OooO00o.OooOoo0(oooOOO, "data");
        int i = 0;
        if (this.f4707OooO00o) {
            int[] iArr = o0000O0O.f4682OooO00o;
            int OooO0OO3 = oooOOO.OooO0OO();
            long j = 0;
            for (int i2 = 0; i2 < OooO0OO3; i2++) {
                byte OooO0o2 = oooOOO.OooO0o(i2);
                byte[] bArr = OooOO0O.f4403OooO00o;
                j += o0000O0O.f4683OooO0O0[OooO0o2 & 255];
            }
            if (((int) ((j + 7) >> 3)) < oooOOO.OooO0OO()) {
                OooOO0 oooOO0 = new OooOO0();
                int[] iArr2 = o0000O0O.f4682OooO00o;
                int OooO0OO4 = oooOOO.OooO0OO();
                long j2 = 0;
                byte b = 0;
                while (i < OooO0OO4) {
                    byte OooO0o3 = oooOOO.OooO0o(i);
                    byte[] bArr2 = OooOO0O.f4403OooO00o;
                    int i3 = OooO0o3 & 255;
                    int i4 = o0000O0O.f4682OooO00o[i3];
                    byte b2 = o0000O0O.f4683OooO0O0[i3];
                    j2 = (j2 << b2) | i4;
                    int i5 = b + b2;
                    while (i5 >= 8) {
                        i5 = (i5 == 1 ? 1 : 0) - 8;
                        oooOO0.Oooo00o((int) (j2 >> i5));
                    }
                    i++;
                    b = i5;
                }
                if (b > 0) {
                    oooOO0.Oooo00o((int) ((255 >>> b) | (j2 << (8 - b))));
                }
                oooOOO = oooOO0.OooOO0(oooOO0.f4823OooO0O0);
                OooO0OO2 = oooOOO.OooO0OO();
                i = 128;
                OooO0o0(OooO0OO2, 127, i);
                this.f4708OooO0O0.OooOooo(oooOOO);
            }
        }
        OooO0OO2 = oooOOO.OooO0OO();
        OooO0o0(OooO0OO2, 127, i);
        this.f4708OooO0O0.OooOooo(oooOOO);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO0Oo(java.util.ArrayList r13) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o000oOoO.OooO0Oo(java.util.ArrayList):void");
    }

    public final void OooO0o0(int i, int i2, int i3) {
        OooOO0 oooOO0 = this.f4708OooO0O0;
        if (i < i2) {
            oooOO0.Oooo00o(i | i3);
            return;
        }
        oooOO0.Oooo00o(i3 | i2);
        int i4 = i - i2;
        while (i4 >= 128) {
            oooOO0.Oooo00o(128 | (i4 & 127));
            i4 >>>= 7;
        }
        oooOO0.Oooo00o(i4);
    }
}