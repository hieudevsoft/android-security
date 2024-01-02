package com.google.crypto.tink.shaded.protobuf;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class o00O00O {

    /* renamed from: OooO0o  reason: collision with root package name */
    public static final o00O00O f3704OooO0o = new o00O00O(0, new int[0], new Object[0], false);

    /* renamed from: OooO00o  reason: collision with root package name */
    public int f3705OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int[] f3706OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public Object[] f3707OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f3708OooO0Oo = -1;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f3709OooO0o0;

    public o00O00O(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f3705OooO00o = i;
        this.f3706OooO0O0 = iArr;
        this.f3707OooO0OO = objArr;
        this.f3709OooO0o0 = z;
    }

    public static o00O00O OooO0O0() {
        return new o00O00O(0, new int[8], new Object[8], true);
    }

    public final int OooO00o() {
        int ooOO2;
        int i = this.f3708OooO0Oo;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.f3705OooO00o; i3++) {
            int i4 = this.f3706OooO0O0[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 != 3) {
                            if (i6 == 5) {
                                ((Integer) this.f3707OooO0OO[i3]).intValue();
                                ooOO2 = Oooo0.o000oOoO(i5);
                            } else {
                                int i7 = o00000O.f3652OooO00o;
                                throw new IllegalStateException(new o00000O0());
                            }
                        } else {
                            i2 = ((o00O00O) this.f3707OooO0OO[i3]).OooO00o() + (Oooo0.OoooooO(i5) * 2) + i2;
                        }
                    } else {
                        ooOO2 = Oooo0.OoooO0O(i5, (OooOo) this.f3707OooO0OO[i3]);
                    }
                } else {
                    ((Long) this.f3707OooO0OO[i3]).longValue();
                    ooOO2 = Oooo0.OoooOOO(i5);
                }
            } else {
                ooOO2 = Oooo0.ooOO(i5, ((Long) this.f3707OooO0OO[i3]).longValue());
            }
            i2 = ooOO2 + i2;
        }
        this.f3708OooO0Oo = i2;
        return i2;
    }

    public final void OooO0OO(int i, Object obj) {
        int i2;
        if (this.f3709OooO0o0) {
            int i3 = this.f3705OooO00o;
            int[] iArr = this.f3706OooO0O0;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.f3706OooO0O0 = Arrays.copyOf(iArr, i4);
                this.f3707OooO0OO = Arrays.copyOf(this.f3707OooO0OO, i4);
            }
            int[] iArr2 = this.f3706OooO0O0;
            int i5 = this.f3705OooO00o;
            iArr2[i5] = i;
            this.f3707OooO0OO[i5] = obj;
            this.f3705OooO00o = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void OooO0Oo(o0OO00O.OooO0OO oooO0OO) {
        if (this.f3705OooO00o == 0) {
            return;
        }
        oooO0OO.getClass();
        for (int i = 0; i < this.f3705OooO00o; i++) {
            int i2 = this.f3706OooO0O0[i];
            Object obj = this.f3707OooO0OO[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 == 5) {
                                oooO0OO.OooOO0o(i3, ((Integer) obj).intValue());
                            } else {
                                int i5 = o00000O.f3652OooO00o;
                                throw new RuntimeException(new o00000O0());
                            }
                        } else {
                            Oooo0 oooo0 = (Oooo0) oooO0OO.f5302OooO0O0;
                            oooo0.o0ooOOo(i3, 3);
                            ((o00O00O) obj).OooO0Oo(oooO0OO);
                            oooo0.o0ooOOo(i3, 4);
                        }
                    } else {
                        oooO0OO.OooO(i3, (OooOo) obj);
                    }
                } else {
                    oooO0OO.OooOOO0(i3, ((Long) obj).longValue());
                }
            } else {
                oooO0OO.OooOOo0(i3, ((Long) obj).longValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof o00O00O)) {
            return false;
        }
        o00O00O o00o00o = (o00O00O) obj;
        int i = this.f3705OooO00o;
        if (i == o00o00o.f3705OooO00o) {
            int[] iArr = this.f3706OooO0O0;
            int[] iArr2 = o00o00o.f3706OooO0O0;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                Object[] objArr = this.f3707OooO0OO;
                Object[] objArr2 = o00o00o.f3707OooO0OO;
                int i3 = this.f3705OooO00o;
                int i4 = 0;
                while (true) {
                    if (i4 < i3) {
                        if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        }
                        i4++;
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f3705OooO00o;
        int i2 = (527 + i) * 31;
        int[] iArr = this.f3706OooO0O0;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.f3707OooO0OO;
        int i7 = this.f3705OooO00o;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}