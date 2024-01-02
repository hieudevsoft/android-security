package o00000;

/* loaded from: classes.dex */
public final class o00oOoo extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final o00oOoo DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private String configName_ = "";
    private com.google.crypto.tink.shaded.protobuf.o000000O entry_ = com.google.crypto.tink.shaded.protobuf.o000OOo0.f3697OooO0Oo;

    static {
        o00oOoo o00oooo = new o00oOoo();
        DEFAULT_INSTANCE = o00oooo;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o00oOoo.class, o00oooo);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", o000.class});
            case 3:
                return new o00oOoo();
            case 4:
                return new OooO0OO(14);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o00oOoo.class) {
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
}