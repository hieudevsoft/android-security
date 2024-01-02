package o00000;

/* loaded from: classes.dex */
public final class OooO extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final OooO DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        OooO oooO = new OooO();
        DEFAULT_INSTANCE = oooO;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(OooO.class, oooO);
    }

    public static OooO OooOOOo() {
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
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new OooO();
            case 4:
                return new OooO0OO(1);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (OooO.class) {
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

    public final int OooOOo0() {
        return this.tagSize_;
    }
}