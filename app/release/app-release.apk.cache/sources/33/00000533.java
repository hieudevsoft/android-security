package o00000;

/* loaded from: classes.dex */
public final class oo000o extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final oo000o DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        oo000o oo000oVar = new oo000o();
        DEFAULT_INSTANCE = oo000oVar;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(oo000o.class, oo000oVar);
    }

    public static void OooOOOo(oo000o oo000oVar) {
        oo000oVar.keySize_ = 32;
    }

    public static o00Ooo OooOOo() {
        return (o00Ooo) DEFAULT_INSTANCE.OooO0o();
    }

    public static oo000o OooOOoo(com.google.crypto.tink.shaded.protobuf.OooOo oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (oo000o) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0O(DEFAULT_INSTANCE, oooOo, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new oo000o();
            case 4:
                return new o00Ooo();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (oo000o.class) {
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
        return this.keySize_;
    }
}