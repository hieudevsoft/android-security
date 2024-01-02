package o00000;

/* loaded from: classes.dex */
public final class o0ooOOo extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0ooOOo DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOo keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
    private int version_;

    static {
        o0ooOOo o0ooooo = new o0ooOOo();
        DEFAULT_INSTANCE = o0ooooo;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0ooOOo.class, o0ooooo);
    }

    public static void OooOOOo(o0ooOOo o0ooooo) {
        o0ooooo.version_ = 0;
    }

    public static void OooOOo0(o0ooOOo o0ooooo, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        o0ooooo.getClass();
        o0ooooo.keyValue_ = oooOo00;
    }

    public static o0ooOOo OooOo0(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o0ooOOo) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    public static o00oO0o OooOo00() {
        return (o00oO0o) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new o0ooOOo();
            case 4:
                return new o00oO0o();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0ooOOo.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.OooOo OooOOo() {
        return this.keyValue_;
    }

    public final int OooOOoo() {
        return this.version_;
    }
}