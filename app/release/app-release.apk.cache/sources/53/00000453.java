package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class o0OOO0o implements o000O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o0OOO0o f3735OooO00o = new o0OOO0o();

    @Override // com.google.crypto.tink.shaded.protobuf.o000O00
    public final boolean OooO00o(Class cls) {
        return o0O0O00.class.isAssignableFrom(cls);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O00
    public final o000Oo0 OooO0O0(Class cls) {
        if (o0O0O00.class.isAssignableFrom(cls)) {
            try {
                return (o000Oo0) o0O0O00.OooO0oo(cls.asSubclass(o0O0O00.class)).OooO0oO(oo0o0Oo.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
            }
        }
        throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
    }
}