package o00000;

/* loaded from: classes.dex */
public final class o0000OO0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0000OO0 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.OooOo value_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;

    static {
        o0000OO0 o0000oo02 = new o0000OO0();
        DEFAULT_INSTANCE = o0000oo02;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0000OO0.class, o0000oo02);
    }

    public static void OooOOOo(o0000OO0 o0000oo02, String str) {
        o0000oo02.getClass();
        o0000oo02.typeUrl_ = str;
    }

    public static void OooOOo(o0000OO0 o0000oo02, o0O0ooO o0o0ooo) {
        o0000oo02.getClass();
        o0000oo02.outputPrefixType_ = o0o0ooo.OooO0O0();
    }

    public static void OooOOo0(o0000OO0 o0000oo02, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        o0000oo02.getClass();
        o0000oo02.value_ = oooOo00;
    }

    public static o0000OO0 OooOOoo() {
        return DEFAULT_INSTANCE;
    }

    public static o0000O OooOo0o() {
        return (o0000O) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new o0000OO0();
            case 4:
                return new o0000O();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0000OO0.class) {
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

    public final String OooOo0() {
        return this.typeUrl_;
    }

    public final o0O0ooO OooOo00() {
        o0O0ooO OooO00o2 = o0O0ooO.OooO00o(this.outputPrefixType_);
        return OooO00o2 == null ? o0O0ooO.UNRECOGNIZED : OooO00o2;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOo OooOo0O() {
        return this.value_;
    }
}