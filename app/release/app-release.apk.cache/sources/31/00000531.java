package o00000;

/* loaded from: classes.dex */
public final class o0OoOo0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0OoOo0 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private int ivSize_;

    static {
        o0OoOo0 o0oooo0 = new o0OoOo0();
        DEFAULT_INSTANCE = o0oooo0;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0OoOo0.class, o0oooo0);
    }

    public static o0OoOo0 OooOOOo() {
        return DEFAULT_INSTANCE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new o0OoOo0();
            case 4:
                return new OooO0OO(6);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0OoOo0.class) {
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

    public final int OooOOo0() {
        return this.ivSize_;
    }
}