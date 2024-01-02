package o00000;

/* loaded from: classes.dex */
public final class o0000O00 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o0000O00 DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        o0000O00 o0000o00 = new o0000O00();
        DEFAULT_INSTANCE = o0000o00;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o0000O00.class, o0000o00);
    }

    public static o0000O00 OooOOOo() {
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
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new o0000O00();
            case 4:
                return new OooO0OO(10);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o0000O00.class) {
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

    public final int OooOOo() {
        return this.tagSize_;
    }

    public final o00000O OooOOo0() {
        o00000O OooO00o2 = o00000O.OooO00o(this.hash_);
        return OooO00o2 == null ? o00000O.UNRECOGNIZED : OooO00o2;
    }
}