package o00000;

import java.util.List;

/* loaded from: classes.dex */
public final class o000O00 extends com.google.crypto.tink.shaded.protobuf.o0O0O00 {
    private static final o000O00 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.o000O0O0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.o000000O key_ = com.google.crypto.tink.shaded.protobuf.o000OOo0.f3697OooO0Oo;
    private int primaryKeyId_;

    static {
        o000O00 o000o00 = new o000O00();
        DEFAULT_INSTANCE = o000o00;
        com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOOO(o000O00.class, o000o00);
    }

    public static void OooOOOo(o000O00 o000o00, int i) {
        o000o00.primaryKeyId_ = i;
    }

    public static void OooOOo0(o000O00 o000o00, o000Oo0 o000oo0) {
        int i;
        o000o00.getClass();
        com.google.crypto.tink.shaded.protobuf.o000000O o000000o2 = o000o00.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.OooO0OO) o000000o2).f3617OooO00o) {
            int size = o000000o2.size();
            if (size == 0) {
                i = 10;
            } else {
                i = size * 2;
            }
            o000o00.key_ = o000000o2.OooO0OO(i);
        }
        o000o00.key_.add(o000oo0);
    }

    public static o000O000 OooOo0O() {
        return (o000O000) DEFAULT_INSTANCE.OooO0o();
    }

    public static o000O00 OooOo0o(byte[] bArr, com.google.crypto.tink.shaded.protobuf.o00Oo0 o00oo0) {
        return (o000O00) com.google.crypto.tink.shaded.protobuf.o0O0O00.OooOO0o(DEFAULT_INSTANCE, bArr, o00oo0);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0O00
    public final Object OooO0oO(com.google.crypto.tink.shaded.protobuf.oo0o0Oo oo0o0oo) {
        switch (oo0o0oo.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.o00(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", o000Oo0.class});
            case 3:
                return new o000O00();
            case 4:
                return new o000O000();
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.o000O0O0 o000o0o0 = PARSER;
                if (o000o0o0 == null) {
                    synchronized (o000O00.class) {
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

    public final o000Oo0 OooOOo(int i) {
        return (o000Oo0) this.key_.get(i);
    }

    public final int OooOOoo() {
        return this.key_.size();
    }

    public final int OooOo0() {
        return this.primaryKeyId_;
    }

    public final List OooOo00() {
        return this.key_;
    }
}