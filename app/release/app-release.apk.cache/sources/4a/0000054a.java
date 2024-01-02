package o00000O0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

/* loaded from: classes.dex */
public abstract class OooOOOO implements o0OO00O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4040OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOOO0 f4041OooO0O0;

    public OooOOOO(byte[] bArr) {
        OooOOO0 oo000oVar;
        OooOOO0 oo000oVar2;
        int i = ((OooOOO) this).f4036OooO0OO;
        switch (i) {
            case 0:
                oo000oVar = new OooOO0O(1, bArr);
                break;
            default:
                oo000oVar = new oo000o(1, bArr);
                break;
        }
        this.f4040OooO00o = oo000oVar;
        switch (i) {
            case 0:
                oo000oVar2 = new OooOO0O(0, bArr);
                break;
            default:
                oo000oVar2 = new oo000o(0, bArr);
                break;
        }
        this.f4041OooO0O0 = oo000oVar2;
    }

    public static byte[] OooO0OO(ByteBuffer byteBuffer, byte[] bArr) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i = remaining % 16;
        int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
        ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i2);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        OooOOO0 oooOOO0 = this.f4040OooO00o;
        if (length <= (Integer.MAX_VALUE - oooOOO0.OooO0oO()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(oooOOO0.OooO0oO() + bArr.length + 16);
            if (allocate.remaining() >= oooOOO0.OooO0oO() + bArr.length + 16) {
                int position = allocate.position();
                oooOOO0.OooO0o(allocate, bArr);
                allocate.position(position);
                byte[] bArr3 = new byte[oooOOO0.OooO0oO()];
                allocate.get(bArr3);
                allocate.limit(allocate.limit() - 16);
                if (bArr2 == null) {
                    bArr2 = new byte[0];
                }
                byte[] bArr4 = new byte[32];
                this.f4041OooO0O0.OooO0OO(0, bArr3).get(bArr4);
                byte[] Oooo0o02 = o0000O00.OooO00o.Oooo0o0(bArr4, OooO0OO(allocate, bArr2));
                allocate.limit(allocate.limit() + 16);
                allocate.put(Oooo0o02);
                return allocate.array();
            }
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        OooOOO0 oooOOO0 = this.f4040OooO00o;
        if (remaining >= oooOOO0.OooO0oO() + 16) {
            int position = wrap.position();
            byte[] bArr3 = new byte[16];
            wrap.position(wrap.limit() - 16);
            wrap.get(bArr3);
            wrap.position(position);
            wrap.limit(wrap.limit() - 16);
            byte[] bArr4 = new byte[oooOOO0.OooO0oO()];
            wrap.get(bArr4);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            try {
                byte[] bArr5 = new byte[32];
                this.f4041OooO0O0.OooO0OO(0, bArr4).get(bArr5);
                if (o0000O00.OooO00o.Ooooooo(o0000O00.OooO00o.Oooo0o0(bArr5, OooO0OO(wrap, bArr2)), bArr3)) {
                    wrap.position(position);
                    return oooOOO0.OooO0o0(wrap);
                }
                throw new GeneralSecurityException("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}