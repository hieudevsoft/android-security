package o00000;

/* loaded from: classes.dex */
public final class OooOOOO extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final OooOOOO DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOo keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
    private OooOo params_;
    private int version_;

    static {
        OooOOOO oooOOOO = new OooOOOO();
        DEFAULT_INSTANCE = oooOOOO;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(OooOOOO.class, oooOOOO);
    }

    public static void OooOOOo(OooOOOO oooOOOO) {
        oooOOOO.version_ = 0;
    }

    public static void OooOOo(OooOOOO oooOOOO, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        oooOOOO.getClass();
        oooOOOO.keyValue_ = oooOo00;
    }

    public static void OooOOo0(OooOOOO oooOOOO, OooOo oooOo) {
        oooOOOO.getClass();
        oooOo.getClass();
        oooOOOO.params_ = oooOo;
    }

    public static OooOOOO OooOOoo() {
        return DEFAULT_INSTANCE;
    }

    public static OooOOOO OooOo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (OooOOOO) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    public static OooOOO OooOo0o() {
        return (OooOOO) DEFAULT_INSTANCE.OooO0o();
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
                return new OooOOOO();
            case 4:
                return new OooOOO();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (OooOOOO.class) {
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

    public final OooOo OooOo0() {
        OooOo oooOo = this.params_;
        return oooOo == null ? OooOo.OooOOOo() : oooOo;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOo OooOo00() {
        return this.keyValue_;
    }

    public final int OooOo0O() {
        return this.version_;
    }
}