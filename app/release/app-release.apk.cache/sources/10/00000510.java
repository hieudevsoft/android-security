package o00000;

/* loaded from: classes.dex */
public final class o0000O0O extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0000O0O DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private com.google.crypto.tink.shaded.protobuf.OooOo value_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;

    static {
        o0000O0O o0000o0o2 = new o0000O0O();
        DEFAULT_INSTANCE = o0000o0o2;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0000O0O.class, o0000o0o2);
    }

    public static void OooOOOo(o0000O0O o0000o0o2, String str) {
        o0000o0o2.getClass();
        str.getClass();
        o0000o0o2.typeUrl_ = str;
    }

    public static void OooOOo(o0000O0O o0000o0o2, o0000O0 o0000o02) {
        o0000o0o2.getClass();
        o0000o0o2.keyMaterialType_ = o0000o02.OooO0O0();
    }

    public static void OooOOo0(o0000O0O o0000o0o2, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        o0000o0o2.getClass();
        o0000o0o2.value_ = oooOo00;
    }

    public static o0000O0O OooOOoo() {
        return DEFAULT_INSTANCE;
    }

    public static o0000oo OooOo0o() {
        return (o0000oo) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new o0000O0O();
            case 4:
                return new o0000oo();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0000O0O.class) {
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

    public final o0000O0 OooOo00() {
        o0000O0 OooO00o2 = o0000O0.OooO00o(this.keyMaterialType_);
        return OooO00o2 == null ? o0000O0.UNRECOGNIZED : OooO00o2;
    }

    public final com.google.crypto.tink.shaded.protobuf.OooOo OooOo0O() {
        return this.value_;
    }
}