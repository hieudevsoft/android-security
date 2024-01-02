package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class o0000O implements o000O00 {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000O00[] f3665OooO00o;

    public o0000O(o000O00... o000o00Arr) {
        this.f3665OooO00o = o000o00Arr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O00
    public final boolean OooO00o(Class cls) {
        for (o000O00 o000o00 : this.f3665OooO00o) {
            if (o000o00.OooO00o(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o000O00
    public final o000Oo0 OooO0O0(Class cls) {
        o000O00[] o000o00Arr;
        for (o000O00 o000o00 : this.f3665OooO00o) {
            if (o000o00.OooO00o(cls)) {
                return o000o00.OooO0O0(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}