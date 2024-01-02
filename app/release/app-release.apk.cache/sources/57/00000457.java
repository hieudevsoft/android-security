package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class oOO00O {
    public static boolean OooO00o(Object obj, o00O0000 o00o0000) {
        int OooOo2 = o00o0000.OooOo();
        int i = OooOo2 >>> 3;
        int i2 = OooOo2 & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            return false;
                        }
                        if (i2 == 5) {
                            ((o00O00O) obj).OooO0OO((i << 3) | 5, Integer.valueOf(o00o0000.OooOoo()));
                        } else {
                            int i3 = o00000O.f3652OooO00o;
                            throw new o00000O0();
                        }
                    } else {
                        o00O00O OooO0O02 = o00O00O.OooO0O0();
                        int i4 = i << 3;
                        int i5 = i4 | 4;
                        while (o00o0000.Oooo0O0() != Integer.MAX_VALUE && OooO00o(OooO0O02, o00o0000)) {
                        }
                        if (i5 == o00o0000.OooOo()) {
                            OooO0O02.f3709OooO0o0 = false;
                            ((o00O00O) obj).OooO0OO(i4 | 3, OooO0O02);
                        } else {
                            throw new o00000O("Protocol message end-group tag did not match expected tag.");
                        }
                    }
                } else {
                    ((o00O00O) obj).OooO0OO((i << 3) | 2, o00o0000.OooOO0());
                }
            } else {
                ((o00O00O) obj).OooO0OO((i << 3) | 1, Long.valueOf(o00o0000.OooOoo0()));
            }
        } else {
            ((o00O00O) obj).OooO0OO((i << 3) | 0, Long.valueOf(o00o0000.OooOo0o()));
        }
        return true;
    }

    public static void OooO0O0(Object obj, Object obj2) {
        ((o0O0O00) obj).unknownFields = (o00O00O) obj2;
    }
}