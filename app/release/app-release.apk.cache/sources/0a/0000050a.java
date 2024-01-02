package o00000;

/* loaded from: classes.dex */
public enum o00000O implements com.google.crypto.tink.shaded.protobuf.o000000 {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);

    o00000O(int i) {
    }

    public static o00000O OooO00o(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return SHA512;
                    }
                    return SHA256;
                }
                return SHA384;
            }
            return SHA1;
        }
        return UNKNOWN_HASH;
    }
}