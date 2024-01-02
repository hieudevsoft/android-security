package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public class OooOo00 extends OooOo {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final byte[] f3628OooO0Oo;

    public OooOo00(byte[] bArr) {
        bArr.getClass();
        this.f3628OooO0Oo = bArr;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo
    public void OooO(int i, byte[] bArr) {
        System.arraycopy(this.f3628OooO0Oo, 0, bArr, 0, i);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo
    public byte OooO0o(int i) {
        return this.f3628OooO0Oo[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo
    public byte OooOO0(int i) {
        return this.f3628OooO0Oo[i];
    }

    public int OooOOO0() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OooOo) || size() != ((OooOo) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof OooOo00) {
            OooOo00 oooOo00 = (OooOo00) obj;
            int i = this.f3627OooO00o;
            int i2 = oooOo00.f3627OooO00o;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= oooOo00.size()) {
                if (0 + size <= oooOo00.size()) {
                    int OooOOO0 = OooOOO0() + size;
                    int OooOOO02 = OooOOO0();
                    int OooOOO03 = oooOo00.OooOOO0() + 0;
                    while (OooOOO02 < OooOOO0) {
                        if (this.f3628OooO0Oo[OooOOO02] != oooOo00.f3628OooO0Oo[OooOOO03]) {
                            return false;
                        }
                        OooOOO02++;
                        OooOOO03++;
                    }
                    return true;
                }
                StringBuilder OooO0o02 = OooO0O0.OooO00o.OooO0o0("Ran off end of other: 0, ", size, ", ");
                OooO0o02.append(oooOo00.size());
                throw new IllegalArgumentException(OooO0o02.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.OooOo
    public int size() {
        return this.f3628OooO0Oo.length;
    }
}