package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class o000O0 implements o0O0ooO {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0O0 f3672OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final oOO00O f3673OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final o00Ooo f3674OooO0OO;

    public o000O0(oOO00O ooo00o, o00Ooo o00ooo2, OooO0O0 oooO0O0) {
        this.f3673OooO0O0 = ooo00o;
        o00ooo2.getClass();
        this.f3674OooO0OO = o00ooo2;
        this.f3672OooO00o = oooO0O0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final int OooO(Object obj) {
        this.f3673OooO0O0.getClass();
        return ((o0O0O00) obj).unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO00o(Object obj, byte[] bArr, int i, int i2, OooO oooO) {
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        if (o0o0o00.unknownFields == o00O00O.f3704OooO0o) {
            o0o0o00.unknownFields = o00O00O.OooO0O0();
        }
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final boolean OooO0O0(Object obj) {
        this.f3674OooO0OO.getClass();
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final int OooO0OO(Object obj) {
        this.f3673OooO0O0.getClass();
        o00O00O o00o00o = ((o0O0O00) obj).unknownFields;
        int i = o00o00o.f3708OooO0Oo;
        if (i == -1) {
            i = 0;
            for (int i2 = 0; i2 < o00o00o.f3705OooO00o; i2++) {
                i += Oooo0.OoooO0O(3, (OooOo) o00o00o.f3707OooO0OO[i2]) + Oooo0.Ooooooo(2, o00o00o.f3706OooO0O0[i2] >>> 3) + (Oooo0.OoooooO(1) * 2);
            }
            o00o00o.f3708OooO0Oo = i;
        }
        return i + 0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final Object OooO0Oo() {
        return ((o0Oo0oo) ((o0O0O00) this.f3672OooO00o).OooO0oO(oo0o0Oo.NEW_BUILDER)).OooO0O0();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0o(Object obj, o00O0000 o00o0000, o00Oo0 o00oo0) {
        this.f3673OooO0O0.getClass();
        o0O0O00 o0o0o00 = (o0O0O00) obj;
        if (o0o0o00.unknownFields == o00O00O.f3704OooO0o) {
            o0o0o00.unknownFields = o00O00O.OooO0O0();
        }
        this.f3674OooO0OO.getClass();
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0o0(Object obj, Object obj2) {
        o00oOoo.OooOoo0(this.f3673OooO0O0, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0oO(Object obj) {
        this.f3673OooO0O0.getClass();
        ((o0O0O00) obj).unknownFields.f3709OooO0o0 = false;
        this.f3674OooO0OO.getClass();
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final void OooO0oo(Object obj, o0OO00O.OooO0OO oooO0OO) {
        this.f3674OooO0OO.getClass();
        OooO0O0.OooO00o.OooO0oO(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0O0ooO
    public final boolean OooOO0(Object obj, Object obj2) {
        oOO00O ooo00o = this.f3673OooO0O0;
        ooo00o.getClass();
        o00O00O o00o00o = ((o0O0O00) obj).unknownFields;
        ooo00o.getClass();
        if (!o00o00o.equals(((o0O0O00) obj2).unknownFields)) {
            return false;
        }
        return true;
    }
}