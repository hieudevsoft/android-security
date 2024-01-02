package o00000;

/* loaded from: classes.dex */
public enum o0000O0 implements com.google.crypto.tink.shaded.protobuf.o000000 {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f3985OooO00o;

    o0000O0(int i) {
        this.f3985OooO00o = i;
    }

    public static o0000O0 OooO00o(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return REMOTE;
                    }
                    return ASYMMETRIC_PUBLIC;
                }
                return ASYMMETRIC_PRIVATE;
            }
            return SYMMETRIC;
        }
        return UNKNOWN_KEYMATERIAL;
    }

    public final int OooO0O0() {
        if (this != UNRECOGNIZED) {
            return this.f3985OooO00o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}