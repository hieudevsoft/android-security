package o00000;

/* loaded from: classes.dex */
public final class o000O extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000O DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private o000OO00 params_;
    private int version_;

    static {
        o000O o000o = new o000O();
        DEFAULT_INSTANCE = o000o;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000O.class, o000o);
    }

    public static void OooOOOo(o000O o000o) {
        o000o.version_ = 0;
    }

    public static void OooOOo0(o000O o000o, o000OO00 o000oo00) {
        o000o.getClass();
        o000oo00.getClass();
        o000o.params_ = o000oo00;
    }

    public static o000O OooOo0(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o000O) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    public static o000O0O0 OooOo00() {
        return (o000O0O0) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new o000O();
            case 4:
                return new o000O0O0();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000O.class) {
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

    public final o000OO00 OooOOo() {
        o000OO00 o000oo00 = this.params_;
        return o000oo00 == null ? o000OO00.OooOOOo() : o000oo00;
    }

    public final int OooOOoo() {
        return this.version_;
    }
}