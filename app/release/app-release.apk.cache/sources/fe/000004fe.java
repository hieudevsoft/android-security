package o00000;

/* loaded from: classes.dex */
public final class OooOOO0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final OooOOO0 DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private OooOo00 aesCtrKeyFormat_;
    private o0000 hmacKeyFormat_;

    static {
        OooOOO0 oooOOO0 = new OooOOO0();
        DEFAULT_INSTANCE = oooOOO0;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(OooOOO0.class, oooOOO0);
    }

    public static OooOOO0 OooOOo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (OooOOO0) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new OooOOO0();
            case 4:
                return new OooO0OO(2);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (OooOOO0.class) {
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

    public final OooOo00 OooOOOo() {
        OooOo00 oooOo00 = this.aesCtrKeyFormat_;
        return oooOo00 == null ? OooOo00.OooOOOo() : oooOo00;
    }

    public final o0000 OooOOo0() {
        o0000 o0000Var = this.hmacKeyFormat_;
        return o0000Var == null ? o0000.OooOOOo() : o0000Var;
    }
}