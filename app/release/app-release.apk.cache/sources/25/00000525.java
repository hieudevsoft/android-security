package o00000;

/* loaded from: classes.dex */
public final class o00O0000 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o00O0000 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER;
    private o0000OO0 dekTemplate_;
    private String kekUri_ = "";

    static {
        o00O0000 o00o0000 = new o00O0000();
        DEFAULT_INSTANCE = o00o0000;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o00O0000.class, o00o0000);
    }

    public static o00O0000 OooOOOo() {
        return DEFAULT_INSTANCE;
    }

    public static o00O0000 OooOOoo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o00O0000) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new o00O0000();
            case 4:
                return new OooO0OO(13);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o00O0000.class) {
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

    public final String OooOOo() {
        return this.kekUri_;
    }

    public final o0000OO0 OooOOo0() {
        o0000OO0 o0000oo02 = this.dekTemplate_;
        return o0000oo02 == null ? o0000OO0.OooOOoo() : o0000oo02;
    }
}