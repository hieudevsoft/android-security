package o00000;

/* loaded from: classes.dex */
public final class o000000O extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000000O DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;

    static {
        o000000O o000000o2 = new o000000O();
        DEFAULT_INSTANCE = o000000o2;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000000O.class, o000000o2);
    }

    public static o000000O OooOOOo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o000000O) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new o000000O();
            case 4:
                return new OooO0OO(8);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000000O.class) {
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