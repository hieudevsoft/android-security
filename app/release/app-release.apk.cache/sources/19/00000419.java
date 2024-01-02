package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public final class OooOOOO extends OooOo00 {

    /* renamed from: OooO0o  reason: collision with root package name */
    public final int f3623OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final int f3624OooO0o0;

    public OooOOOO(byte[] bArr, int i, int i2) {
        super(bArr);
        OooOo.OooO0oO(i, i + i2, bArr.length);
        this.f3624OooO0o0 = i;
        this.f3623OooO0o = i2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo00, com.google.crypto.tink.shaded.protobuf.OooOo
    public final void OooO(int i, byte[] bArr) {
        System.arraycopy(this.f3628OooO0Oo, this.f3624OooO0o0 + 0, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo00, com.google.crypto.tink.shaded.protobuf.OooOo
    public final byte OooO0o(int i) {
        int i2 = this.f3623OooO0o;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(OooO0O0.OooO00o.OooO0O0("Index < 0: ", i));
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
        return this.f3628OooO0Oo[this.f3624OooO0o0 + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo00, com.google.crypto.tink.shaded.protobuf.OooOo
    public final byte OooOO0(int i) {
        return this.f3628OooO0Oo[this.f3624OooO0o0 + i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo00
    public final int OooOOO0() {
        return this.f3624OooO0o0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo00, com.google.crypto.tink.shaded.protobuf.OooOo
    public final int size() {
        return this.f3623OooO0o;
    }
}