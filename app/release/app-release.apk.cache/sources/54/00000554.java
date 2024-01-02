package o00000O0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class oo000o extends OooOOO0 {
    @Override // o00000O0.OooOOO0
    public final int[] OooO0Oo(int[] iArr, int i) {
        if (iArr.length == 6) {
            int[] iArr2 = new int[16];
            int[] iArr3 = OooOOO0.f4037OooO0OO;
            System.arraycopy(iArr3, 0, r0, 0, iArr3.length);
            System.arraycopy(this.f4038OooO00o, 0, r0, iArr3.length, 8);
            int[] iArr4 = {0, 0, 0, 0, iArr4[12], iArr4[13], iArr4[14], iArr4[15], 0, 0, 0, 0, iArr[0], iArr[1], iArr[2], iArr[3]};
            OooOOO0.OooOO0(iArr4);
            int[] copyOf = Arrays.copyOf(iArr4, 8);
            System.arraycopy(iArr3, 0, iArr2, 0, iArr3.length);
            System.arraycopy(copyOf, 0, iArr2, iArr3.length, 8);
            iArr2[12] = i;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // o00000O0.OooOOO0
    public final int OooO0oO() {
        return 24;
    }
}