package o00000;

/* loaded from: classes.dex */
public final class o000O0Oo extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000O0Oo DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        o000O0Oo o000o0oo = new o000O0Oo();
        DEFAULT_INSTANCE = o000o0oo;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000O0Oo.class, o000o0oo);
    }

    public static void OooOOOo(o000O0Oo o000o0oo, String str) {
        o000o0oo.getClass();
        str.getClass();
        o000o0oo.typeUrl_ = str;
    }

    public static void OooOOo(o000O0Oo o000o0oo, o000OO o000oo) {
        o000o0oo.getClass();
        o000o0oo.status_ = o000oo.OooO00o();
    }

    public static void OooOOo0(o000O0Oo o000o0oo, o0O0ooO o0o0ooo) {
        o000o0oo.getClass();
        o000o0oo.outputPrefixType_ = o0o0ooo.OooO0O0();
    }

    public static void OooOOoo(o000O0Oo o000o0oo, int i) {
        o000o0oo.keyId_ = i;
    }

    public static o000O0 OooOo0() {
        return (o000O0) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new o000O0Oo();
            case 4:
                return new o000O0();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000O0Oo.class) {
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

    public final int OooOo00() {
        return this.keyId_;
    }
}