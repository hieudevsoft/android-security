package o00000;

/* loaded from: classes.dex */
public final class o000Oo0 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000Oo0 DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private o0000O0O keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        o000Oo0 o000oo0 = new o000Oo0();
        DEFAULT_INSTANCE = o000oo0;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000Oo0.class, o000oo0);
    }

    public static void OooOOOo(o000Oo0 o000oo0, o0000O0O o0000o0o2) {
        o000oo0.getClass();
        o000oo0.keyData_ = o0000o0o2;
    }

    public static void OooOOo(o000Oo0 o000oo0) {
        o000OO o000oo = o000OO.ENABLED;
        o000oo0.getClass();
        o000oo0.status_ = o000oo.OooO00o();
    }

    public static void OooOOo0(o000Oo0 o000oo0, o0O0ooO o0o0ooo) {
        o000oo0.getClass();
        o000oo0.outputPrefixType_ = o0o0ooo.OooO0O0();
    }

    public static void OooOOoo(o000Oo0 o000oo0, int i) {
        o000oo0.keyId_ = i;
    }

    public static o000O0o OooOoO0() {
        return (o000O0o) DEFAULT_INSTANCE.OooO0o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new o000Oo0();
            case 4:
                return new o000O0o();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000Oo0.class) {
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

    public final boolean OooOo() {
        return this.keyData_ != null;
    }

    public final int OooOo0() {
        return this.keyId_;
    }

    public final o0000O0O OooOo00() {
        o0000O0O o0000o0o2 = this.keyData_;
        return o0000o0o2 == null ? o0000O0O.OooOOoo() : o0000o0o2;
    }

    public final o0O0ooO OooOo0O() {
        o0O0ooO OooO00o2 = o0O0ooO.OooO00o(this.outputPrefixType_);
        return OooO00o2 == null ? o0O0ooO.UNRECOGNIZED : OooO00o2;
    }

    public final o000OO OooOo0o() {
        o000OO o000oo;
        int i = this.status_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        o000oo = null;
                    } else {
                        o000oo = o000OO.DESTROYED;
                    }
                } else {
                    o000oo = o000OO.DISABLED;
                }
            } else {
                o000oo = o000OO.ENABLED;
            }
        } else {
            o000oo = o000OO.UNKNOWN_STATUS;
        }
        if (o000oo == null) {
            return o000OO.UNRECOGNIZED;
        }
        return o000oo;
    }
}