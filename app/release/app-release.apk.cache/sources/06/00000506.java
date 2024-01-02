package o00000;

/* loaded from: classes.dex */
public final class o0000 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0000 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private o0000O00 params_;
    private int version_;

    static {
        o0000 o0000Var = new o0000();
        DEFAULT_INSTANCE = o0000Var;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0000.class, o0000Var);
    }

    public static o0000 OooOOOo() {
        return DEFAULT_INSTANCE;
    }

    public static o0000 OooOOoo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o0000) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new o0000();
            case 4:
                return new OooO0OO(9);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0000.class) {
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

    public final o0000O00 OooOOo() {
        o0000O00 o0000o00 = this.params_;
        return o0000o00 == null ? o0000O00.OooOOOo() : o0000o00;
    }

    public final int OooOOo0() {
        return this.keySize_;
    }
}