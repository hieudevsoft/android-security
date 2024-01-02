package o00000;

/* loaded from: classes.dex */
public final class o00000O0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o00000O0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private com.google.crypto.tink.shaded.protobuf.OooOo encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
    private o000OO0O keysetInfo_;

    static {
        o00000O0 o00000o02 = new o00000O0();
        DEFAULT_INSTANCE = o00000o02;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o00000O0.class, o00000o02);
    }

    public static void OooOOOo(o00000O0 o00000o02, com.google.crypto.tink.shaded.protobuf.OooOo00 oooOo00) {
        o00000o02.getClass();
        o00000o02.encryptedKeyset_ = oooOo00;
    }

    public static void OooOOo0(o00000O0 o00000o02, o000OO0O o000oo0o) {
        o00000o02.getClass();
        o00000o02.keysetInfo_ = o000oo0o;
    }

    public static o00000 OooOOoo() {
        return (o00000) DEFAULT_INSTANCE.OooO0o();
    }

    public static o00000O0 OooOo00(byte[] bArr, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o00000O0) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0o(DEFAULT_INSTANCE, bArr, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new o00000O0();
            case 4:
                return new o00000();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o00000O0.class) {
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
        return this.encryptedKeyset_;
    }
}