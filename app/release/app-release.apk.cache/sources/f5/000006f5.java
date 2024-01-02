package oo0o0Oo;

import OooO0oO.o000O0O0;
import com.google.crypto.tink.shaded.protobuf.OooOo;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import o00000.OooOOO0;
import o00000.OooOOOO;
import o00000.OooOo00;
import o00000.o00;
import o00000.o000;
import o00000.o0000;
import o00000.o000000;
import o00000.o000000O;
import o00000.o0000O0;
import o00000.o0000O00;
import o00000.o0000Ooo;
import o00000.o000O;
import o00000.o000OO00;
import o00000.o000oOoO;
import o00000.o00O00;
import o00000.o00O0000;
import o00000.o00O000o;
import o00000.o00Oo0;
import o00000.o0O0O00;
import o00000.o0OO00O;
import o00000.o0OOO0o;
import o00000.o0ooOOo;
import o00000.oo000o;
import o00000O0.Oooo0;
import o00000O0.o00Ooo;

/* loaded from: classes.dex */
public final class OooOO0 extends o000O0O0 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ int f5629OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(int i) {
        super(o0000Ooo.class, new OooO0o(o0OO00O.OooOO0O.class, 11));
        this.f5629OooO0Oo = i;
        switch (i) {
            case 1:
                super(OooOOOO.class, new OooO0o(Oooo0.class, 1));
                return;
            case 2:
                super(o00000.Oooo0.class, new OooO0o(o0OO00O.OooO00o.class, 2));
                return;
            case 3:
                super(o00Oo0.class, new OooO0o(o0OO00O.OooO00o.class, 3));
                return;
            case 4:
                super(o0ooOOo.class, new OooO0o(o0OO00O.OooO00o.class, 4));
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                super(o000000.class, new OooO0o(o0OO00O.OooO00o.class, 5));
                return;
            case 6:
                super(o000O.class, new OooO0o(o0OO00O.OooO00o.class, 6));
                return;
            case 7:
                super(o00.class, new OooO0o(o0OO00O.OooO00o.class, 7));
                return;
            case 8:
                super(o00O000o.class, new OooO0o(o0OO00O.OooO00o.class, 8));
                return;
            case 9:
                super(o0OO00O.class, new OooO0o(o0OO00O.OooO0O0.class, 9));
                return;
            case 10:
                super(o00000.OooO0O0.class, new OooO0o(o0OO00O.OooOO0O.class, 10));
                return;
            case 11:
                return;
            default:
                super(o00000.OooOO0O.class, new OooO0o(o0OO00O.OooO00o.class, 0));
                return;
        }
    }

    public static void OooOo(o0000O00 o0000o00) {
        if (o0000o00.OooOOo() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int ordinal = o0000o00.OooOOo0().ordinal();
        if (ordinal == 1) {
            if (o0000o00.OooOOo() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal == 3) {
            if (o0000o00.OooOOo() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (ordinal != 4) {
            throw new GeneralSecurityException("unknown hash type");
        } else {
            if (o0000o00.OooOOo() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    public static void OooOo0O(o0000Ooo o0000ooo) {
        o00Ooo.OooO0OO(o0000ooo.OooOo0O());
        if (o0000ooo.OooOo00().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        OooOo(o0000ooo.OooOo0());
    }

    public static void OooOo0o(o00000.OooO oooO) {
        if (oooO.OooOOo0() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (oooO.OooOOo0() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    @Override // OooO0oO.o000O0O0
    public final String OooOOO0() {
        switch (this.f5629OooO0Oo) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesCtrKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 8:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            case 9:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 10:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // OooO0oO.o000O0O0
    public final OooO OooOOOo() {
        switch (this.f5629OooO0Oo) {
            case 0:
                return new OooO(this, OooOOO0.class, 0);
            case 1:
                return new OooO(this, OooOo00.class, 1);
            case 2:
                return new OooO(this, o000oOoO.class, 2);
            case 3:
                return new OooO(this, oo000o.class, 3);
            case 4:
                return new OooO(this, o0OOO0o.class, 4);
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return new OooO(this, o000000O.class, 5);
            case 6:
                return new OooO(this, o000OO00.class, 6);
            case 7:
                return new OooO(this, o00O0000.class, 7);
            case 8:
                return new OooO(this, o00O00.class, 8);
            case 9:
                return new OooO(this, o0O0O00.class, 9);
            case 10:
                return new OooO(this, o00000.OooO0o.class, 10);
            default:
                return new OooO(this, o0000.class, 11);
        }
    }

    @Override // OooO0oO.o000O0O0
    public final com.google.crypto.tink.shaded.protobuf.o0O0O00 OooOOo(OooOo oooOo) {
        switch (this.f5629OooO0Oo) {
            case 0:
                return o00000.OooOO0O.OooOo0o(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 1:
                return OooOOOO.OooOo(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 2:
                return o00000.Oooo0.OooOo0o(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 3:
                return o00Oo0.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 4:
                return o0ooOOo.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return o000000.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 6:
                return o000O.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 7:
                return o00.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 8:
                return o00O000o.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 9:
                return o0OO00O.OooOo0(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            case 10:
                return o00000.OooO0O0.OooOo0o(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
            default:
                return o0000Ooo.OooOo(oooOo, com.google.crypto.tink.shaded.protobuf.o00Oo0.OooO00o());
        }
    }

    @Override // OooO0oO.o000O0O0
    public final o0000O0 OooOOo0() {
        o0000O0 o0000o02 = o0000O0.REMOTE;
        o0000O0 o0000o03 = o0000O0.SYMMETRIC;
        switch (this.f5629OooO0Oo) {
            case 6:
            case 7:
                return o0000o02;
            default:
                return o0000o03;
        }
    }

    @Override // OooO0oO.o000O0O0
    public final void OooOo0(com.google.crypto.tink.shaded.protobuf.OooO0O0 oooO0O0) {
        switch (this.f5629OooO0Oo) {
            case 0:
                o00000.OooOO0O oooOO0O = (o00000.OooOO0O) oooO0O0;
                o00Ooo.OooO0OO(oooOO0O.OooOo0());
                new OooOO0(1);
                OooOOOO OooOOoo2 = oooOO0O.OooOOoo();
                o00Ooo.OooO0OO(OooOOoo2.OooOo0O());
                o00Ooo.OooO00o(OooOOoo2.OooOo00().size());
                o00000.OooOo OooOo02 = OooOOoo2.OooOo0();
                if (OooOo02.OooOOo0() >= 12 && OooOo02.OooOOo0() <= 16) {
                    new OooOO0(11);
                    OooOo0O(oooOO0O.OooOo00());
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                OooOOOO oooOOOO = (OooOOOO) oooO0O0;
                o00Ooo.OooO0OO(oooOOOO.OooOo0O());
                o00Ooo.OooO00o(oooOOOO.OooOo00().size());
                o00000.OooOo OooOo03 = oooOOOO.OooOo0();
                if (OooOo03.OooOOo0() >= 12 && OooOo03.OooOOo0() <= 16) {
                    return;
                }
                throw new GeneralSecurityException("invalid IV size");
            case 2:
                o00000.Oooo0 oooo0 = (o00000.Oooo0) oooO0O0;
                o00Ooo.OooO0OO(oooo0.OooOo0());
                o00Ooo.OooO00o(oooo0.OooOOoo().size());
                if (oooo0.OooOo00().OooOOo0() != 12 && oooo0.OooOo00().OooOOo0() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 3:
                o00Oo0 o00oo0 = (o00Oo0) oooO0O0;
                o00Ooo.OooO0OO(o00oo0.OooOOoo());
                o00Ooo.OooO00o(o00oo0.OooOOo().size());
                return;
            case 4:
                o0ooOOo o0ooooo = (o0ooOOo) oooO0O0;
                o00Ooo.OooO0OO(o0ooooo.OooOOoo());
                o00Ooo.OooO00o(o0ooooo.OooOOo().size());
                return;
            case o000.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                o000000 o000000Var = (o000000) oooO0O0;
                o00Ooo.OooO0OO(o000000Var.OooOOoo());
                if (o000000Var.OooOOo().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
            case 6:
                o00Ooo.OooO0OO(((o000O) oooO0O0).OooOOoo());
                return;
            case 7:
                o00Ooo.OooO0OO(((o00) oooO0O0).OooOOoo());
                return;
            case 8:
                o00O000o o00o000o = (o00O000o) oooO0O0;
                o00Ooo.OooO0OO(o00o000o.OooOOoo());
                if (o00o000o.OooOOo().size() == 32) {
                    return;
                }
                throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
            case 9:
                o0OO00O o0oo00o = (o0OO00O) oooO0O0;
                o00Ooo.OooO0OO(o0oo00o.OooOOoo());
                if (o0oo00o.OooOOo().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + o0oo00o.OooOOo().size() + ". Valid keys must have 64 bytes.");
            case 10:
                o00000.OooO0O0 oooO0O02 = (o00000.OooO0O0) oooO0O0;
                o00Ooo.OooO0OO(oooO0O02.OooOo0());
                if (oooO0O02.OooOOoo().size() == 32) {
                    OooOo0o(oooO0O02.OooOo00());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                OooOo0O((o0000Ooo) oooO0O0);
                return;
        }
    }
}