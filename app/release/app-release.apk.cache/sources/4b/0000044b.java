package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class o00O0OOO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final oo0o0O0 f3723OooO00o;

    static {
        boolean z;
        oo0o0O0 oo0o0o0;
        if (o00O0OO0.f3719OooO0o && o00O0OO0.f3720OooO0o0) {
            z = true;
        } else {
            z = false;
        }
        if (z && !OooO0o.OooO00o()) {
            oo0o0o0 = new oo0o0O0(1);
        } else {
            oo0o0o0 = new oo0o0O0(0);
        }
        f3723OooO00o = oo0o0o0;
    }

    public static int OooO00o(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                throw new o00O0OO(i2, length2);
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i3 + 4294967296L));
    }

    public static int OooO0O0(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int OooO0OO(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static boolean OooO0Oo(byte[] bArr, int i, int i2) {
        if (f3723OooO00o.OoooO(i, i2, bArr) == 0) {
            return true;
        }
        return false;
    }
}