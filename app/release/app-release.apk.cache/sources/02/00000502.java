package o00000;

/* loaded from: classes.dex */
public final class Oooo0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final Oooo0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOo keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
    private o0OoOo0 params_;
    private int version_;

    static {
        Oooo0 oooo0 = new Oooo0();
        DEFAULT_INSTANCE = oooo0;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(Oooo0.class, oooo0);
    }

    public static void OooOOOo(Oooo0 oooo0) {
        oooo0.version_ = 0;
    }

    public static void OooOOo(Oooo0 oooo0, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        oooo0.getClass();
        oooo0.keyValue_ = oooOo00;
    }

    public static void OooOOo0(Oooo0 oooo0, o0OoOo0 o0oooo0) {
        oooo0.getClass();
        o0oooo0.getClass();
        oooo0.params_ = o0oooo0;
    }

    public static Oooo000 OooOo0O() {
        return (Oooo000) DEFAULT_INSTANCE.OooO0o();
    }

    public static Oooo0 OooOo0o(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (Oooo0) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new Oooo0();
            case 4:
                return new Oooo000();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (Oooo0.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.OooOo OooOOoo() {
        return this.keyValue_;
    }

    public final int OooOo0() {
        return this.version_;
    }

    public final o0OoOo0 OooOo00() {
        o0OoOo0 o0oooo0 = this.params_;
        return o0oooo0 == null ? o0OoOo0.OooOOOo() : o0oooo0;
    }
}