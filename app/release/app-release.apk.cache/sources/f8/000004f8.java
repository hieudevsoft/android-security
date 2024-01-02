package o00000;

/* loaded from: classes.dex */
public final class OooO0O0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final OooO0O0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.OooOo keyValue_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
    private OooO params_;
    private int version_;

    static {
        OooO0O0 oooO0O0 = new OooO0O0();
        DEFAULT_INSTANCE = oooO0O0;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(OooO0O0.class, oooO0O0);
    }

    public static void OooOOOo(OooO0O0 oooO0O0) {
        oooO0O0.version_ = 0;
    }

    public static void OooOOo(OooO0O0 oooO0O0, OooO oooO) {
        oooO0O0.getClass();
        oooO.getClass();
        oooO0O0.params_ = oooO;
    }

    public static void OooOOo0(OooO0O0 oooO0O0, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        oooO0O0.getClass();
        oooO0O0.keyValue_ = oooOo00;
    }

    public static OooO00o OooOo0O() {
        return (OooO00o) DEFAULT_INSTANCE.OooO0o();
    }

    public static OooO0O0 OooOo0o(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (OooO0O0) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new OooO0O0();
            case 4:
                return new OooO00o();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (OooO0O0.class) {
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

    public final OooO OooOo00() {
        OooO oooO = this.params_;
        return oooO == null ? OooO.OooOOOo() : oooO;
    }
}