package oo0o0Oo;

import OooO0oO.o000O0O0;
import com.google.crypto.tink.shaded.protobuf.OooOo00;
import com.google.crypto.tink.shaded.protobuf.o00000O;
import com.google.crypto.tink.shaded.protobuf.o0O0O00;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.logging.Logger;
import o00000.o0000OO0;
import o0OO00O.OooOo;

/* loaded from: classes.dex */
public final class OooOO0O implements o0OO00O.OooO00o {

    /* renamed from: OooO0OO  reason: collision with root package name */
    public static final byte[] f5630OooO0OO = new byte[0];

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0000OO0 f5631OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o0OO00O.OooO00o f5632OooO0O0;

    public OooOO0O(o0000OO0 o0000oo02, o000000.OooO0OO oooO0OO) {
        this.f5631OooO00o = o0000oo02;
        this.f5632OooO0O0 = oooO0OO;
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        o0O0O00 OooO00o2;
        o0000OO0 o0000oo02 = this.f5631OooO00o;
        Logger logger = OooOo.f5310OooO00o;
        synchronized (OooOo.class) {
            o000O0O0 o000o0o0 = OooOo.OooO0O0(o0000oo02.OooOo0()).f5315OooO00o;
            Class cls = (Class) o000o0o0.f347OooO0OO;
            if (!((Map) o000o0o0.f346OooO0O0).keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", o000o0o0.toString(), cls.getName()));
            }
            if (((Boolean) OooOo.f5313OooO0Oo.get(o0000oo02.OooOo0())).booleanValue()) {
                com.google.crypto.tink.shaded.protobuf.OooOo OooOo0O2 = o0000oo02.OooOo0O();
                try {
                    OooO OooOOOo2 = o000o0o0.OooOOOo();
                    o0O0O00 OooO0Oo2 = OooOOOo2.OooO0Oo(OooOo0O2);
                    OooOOOo2.OooO0o0(OooO0Oo2);
                    OooO00o2 = OooOOOo2.OooO00o(OooO0Oo2);
                } catch (o00000O e) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) o000o0o0.OooOOOo().f1219OooO00o).getName()), e);
                }
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + o0000oo02.OooOo0());
            }
        }
        byte[] OooO0Oo3 = OooO00o2.OooO0Oo();
        byte[] OooO00o3 = this.f5632OooO0O0.OooO00o(OooO0Oo3, f5630OooO0OO);
        byte[] OooO00o4 = ((o0OO00O.OooO00o) OooOo.OooO0OO(this.f5631OooO00o.OooOo0(), com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(OooO0Oo3, 0, OooO0Oo3.length), o0OO00O.OooO00o.class)).OooO00o(bArr, bArr2);
        return ByteBuffer.allocate(OooO00o3.length + 4 + OooO00o4.length).putInt(OooO00o3.length).put(OooO00o3).put(OooO00o4).array();
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i > 0 && i <= bArr.length - 4) {
                byte[] bArr3 = new byte[i];
                wrap.get(bArr3, 0, i);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4, 0, wrap.remaining());
                byte[] OooO0O02 = this.f5632OooO0O0.OooO0O0(bArr3, f5630OooO0OO);
                String OooOo02 = this.f5631OooO00o.OooOo0();
                Logger logger = OooOo.f5310OooO00o;
                OooOo00 oooOo00 = com.google.crypto.tink.shaded.protobuf.OooOo.f3625OooO0O0;
                return ((o0OO00O.OooO00o) OooOo.OooO0OO(OooOo02, com.google.crypto.tink.shaded.protobuf.OooOo.OooO0oo(OooO0O02, 0, OooO0O02.length), o0OO00O.OooO00o.class)).OooO0O0(bArr4, bArr2);
            }
            throw new GeneralSecurityException("invalid ciphertext");
        } catch (IndexOutOfBoundsException e) {
            e = e;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (NegativeArraySizeException e2) {
            e = e2;
            throw new GeneralSecurityException("invalid ciphertext", e);
        } catch (BufferUnderflowException e3) {
            e = e3;
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}