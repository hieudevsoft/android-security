package o00000;

/* loaded from: classes.dex */
public enum o0O0ooO implements com.google.crypto.tink.shaded.protobuf.o000000 {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4000OooO00o;

    o0O0ooO(int i) {
        this.f4000OooO00o = i;
    }

    public static o0O0ooO OooO00o(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return CRUNCHY;
                    }
                    return RAW;
                }
                return LEGACY;
            }
            return TINK;
        }
        return UNKNOWN_PREFIX;
    }

    public final int OooO0O0() {
        if (this != UNRECOGNIZED) {
            return this.f4000OooO00o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}