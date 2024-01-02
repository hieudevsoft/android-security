package o00000O0;

/* loaded from: classes.dex */
public final class OooOO0O extends OooOOO0 {
    @Override // o00000O0.OooOOO0
    public final int[] OooO0Oo(int[] iArr, int i) {
        if (iArr.length == 3) {
            int[] iArr2 = new int[16];
            int[] iArr3 = OooOOO0.f4037OooO0OO;
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            System.arraycopy(this.f4038OooO00o, 0, iArr2, iArr3.length, 8);
            iArr2[12] = i;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // o00000O0.OooOOO0
    public final int OooO0oO() {
        return 12;
    }
}