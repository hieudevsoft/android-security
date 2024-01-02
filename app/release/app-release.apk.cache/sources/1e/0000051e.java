package o00000;

/* loaded from: classes.dex */
public final class o000OO0O extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000OO0O DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.o000000O keyInfo_ = com.google.crypto.tink.shaded.protobuf.o000OOo0.f3697OooO0Oo;
    private int primaryKeyId_;

    static {
        o000OO0O o000oo0o = new o000OO0O();
        DEFAULT_INSTANCE = o000oo0o;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000OO0O.class, o000oo0o);
    }

    public static void OooOOOo(o000OO0O o000oo0o, int i) {
        o000oo0o.primaryKeyId_ = i;
    }

    public static void OooOOo0(o000OO0O o000oo0o, o000O0Oo o000o0oo) {
        int i;
        o000oo0o.getClass();
        com.google.crypto.tink.shaded.protobuf.o000000O o000000o2 = o000oo0o.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.OooO0OO) o000000o2).f3617OooO00o) {
            int size = o000000o2.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            o000oo0o.keyInfo_ = o000000o2.OooO0OO(i);
        }
        o000oo0o.keyInfo_.add(o000o0oo);
    }

    public static o000O00O OooOOoo() {
        return (o000O00O) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", o000O0Oo.class});
            case 3:
                return new o000OO0O();
            case 4:
                return new o000O00O();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000OO0O.class) {
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

    public final o000O0Oo OooOOo() {
        return (o000O0Oo) this.keyInfo_.get(0);
    }
}