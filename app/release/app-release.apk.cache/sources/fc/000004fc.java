package o00000;

/* loaded from: classes.dex */
public final class OooOO0O extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final OooOO0O DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private OooOOOO aesCtrKey_;
    private o0000Ooo hmacKey_;
    private int version_;

    static {
        OooOO0O oooOO0O = new OooOO0O();
        DEFAULT_INSTANCE = oooOO0O;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(OooOO0O.class, oooOO0O);
    }

    public static void OooOOOo(OooOO0O oooOO0O) {
        oooOO0O.version_ = 0;
    }

    public static void OooOOo(OooOO0O oooOO0O, o0000Ooo o0000ooo) {
        oooOO0O.getClass();
        o0000ooo.getClass();
        oooOO0O.hmacKey_ = o0000ooo;
    }

    public static void OooOOo0(OooOO0O oooOO0O, OooOOOO oooOOOO) {
        oooOO0O.getClass();
        oooOOOO.getClass();
        oooOO0O.aesCtrKey_ = oooOOOO;
    }

    public static OooOO0 OooOo0O() {
        return (OooOO0) DEFAULT_INSTANCE.OooO0o();
    }

    public static OooOO0O OooOo0o(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (OooOO0O) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new OooOO0O();
            case 4:
                return new OooOO0();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (OooOO0O.class) {
                        try {
                            o000o0o0 = PARSER;
                            if (o000o0o0 == null) {
                                o000o0o0 = new com.google.crypto.tink.shaded.protobuf.o0OO00O();
                                PARSER = o000o0o0;
                            }
                        } finally {
                        }
                    }
                }
                return o000o0o0;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final OooOOOO OooOOoo() {
        OooOOOO oooOOOO = this.aesCtrKey_;
        return oooOOOO == null ? OooOOOO.OooOOoo() : oooOOOO;
    }

    public final int OooOo0() {
        return this.version_;
    }

    public final o0000Ooo OooOo00() {
        o0000Ooo o0000ooo = this.hmacKey_;
        return o0000ooo == null ? o0000Ooo.OooOOoo() : o0000ooo;
    }
}