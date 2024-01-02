package o00000O0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
public abstract class OooOOO0 implements Oooo0 {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final int[] f4037OooO0OO = OooOO0O(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int[] f4038OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final int f4039OooO0O0;

    public OooOOO0(int i, byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f4038OooO00o = OooOO0O(bArr);
        this.f4039OooO0O0 = i;
    }

    public static void OooO(int i, int i2, int i3, int i4, int[] iArr) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int i6 = i5 ^ iArr[i4];
        int i7 = (i6 >>> (-16)) | (i6 << 16);
        iArr[i4] = i7;
        int i8 = iArr[i3] + i7;
        iArr[i3] = i8;
        int i9 = iArr[i2] ^ i8;
        int i10 = (i9 >>> (-12)) | (i9 << 12);
        iArr[i2] = i10;
        int i11 = iArr[i] + i10;
        iArr[i] = i11;
        int i12 = iArr[i4] ^ i11;
        int i13 = (i12 >>> (-8)) | (i12 << 8);
        iArr[i4] = i13;
        int i14 = iArr[i3] + i13;
        iArr[i3] = i14;
        int i15 = iArr[i2] ^ i14;
        iArr[i2] = (i15 >>> (-7)) | (i15 << 7);
    }

    public static void OooOO0(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            OooO(0, 4, 8, 12, iArr);
            OooO(1, 5, 9, 13, iArr);
            OooO(2, 6, 10, 14, iArr);
            OooO(3, 7, 11, 15, iArr);
            OooO(0, 5, 10, 15, iArr);
            OooO(1, 6, 11, 12, iArr);
            OooO(2, 7, 8, 13, iArr);
            OooO(3, 4, 9, 14, iArr);
        }
    }

    public static int[] OooOO0O(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // o00000O0.Oooo0
    public final byte[] OooO00o(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - OooO0oO()) {
            ByteBuffer allocate = ByteBuffer.allocate(OooO0oO() + bArr.length);
            OooO0o(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // o00000O0.Oooo0
    public final byte[] OooO0O0(byte[] bArr) {
        return OooO0o0(ByteBuffer.wrap(bArr));
    }

    public final ByteBuffer OooO0OO(int i, byte[] bArr) {
        int[] OooO0Oo2 = OooO0Oo(OooOO0O(bArr), i);
        int[] iArr = (int[]) OooO0Oo2.clone();
        OooOO0(iArr);
        for (int i2 = 0; i2 < OooO0Oo2.length; i2++) {
            OooO0Oo2[i2] = OooO0Oo2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(OooO0Oo2, 0, 16);
        return order;
    }

    public abstract int[] OooO0Oo(int[] iArr, int i);

    public final void OooO0o(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - OooO0oO() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] OooO00o2 = o00Oo0.OooO00o(OooO0oO());
        byteBuffer.put(OooO00o2);
        OooO0oo(OooO00o2, byteBuffer, ByteBuffer.wrap(bArr));
    }

    public final byte[] OooO0o0(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= OooO0oO()) {
            byte[] bArr = new byte[OooO0oO()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            OooO0oo(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public abstract int OooO0oO();

    public final void OooO0oo(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = (remaining / 64) + 1;
        for (int i2 = 0; i2 < i; i2++) {
            ByteBuffer OooO0OO2 = OooO0OO(this.f4039OooO0O0 + i2, bArr);
            if (i2 == i - 1) {
                o0000O00.OooO00o.o00O0(byteBuffer, byteBuffer2, OooO0OO2, remaining % 64);
            } else {
                o0000O00.OooO00o.o00O0(byteBuffer, byteBuffer2, OooO0OO2, 64);
            }
        }
    }
}