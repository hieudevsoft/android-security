package o00000;

/* loaded from: classes.dex */
public final class o000oOoO extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000oOoO DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private int keySize_;
    private o0OoOo0 params_;

    static {
        o000oOoO o000oooo = new o000oOoO();
        DEFAULT_INSTANCE = o000oooo;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000oOoO.class, o000oooo);
    }

    public static o000oOoO OooOOo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o000oOoO) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new o000oOoO();
            case 4:
                return new OooO0OO(5);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000oOoO.class) {
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

    public final int OooOOOo() {
        return this.keySize_;
    }

    public final o0OoOo0 OooOOo0() {
        o0OoOo0 o0oooo0 = this.params_;
        return o0oooo0 == null ? o0OoOo0.OooOOOo() : o0oooo0;
    }
}