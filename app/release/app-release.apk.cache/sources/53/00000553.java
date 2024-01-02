package o00000O0;

import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class o0OoOo0 implements o000000o.OooO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o000oOoO f4055OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final String f4056OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Key f4057OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final int f4058OooO0Oo;

    public o0OoOo0(String str, SecretKeySpec secretKeySpec) {
        int i;
        o000oOoO o000oooo = new o000oOoO(this);
        this.f4055OooO00o = o000oooo;
        this.f4056OooO0O0 = str;
        this.f4057OooO0OO = secretKeySpec;
        if (secretKeySpec.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1823053428:
                if (str.equals("HMACSHA1")) {
                    c = 0;
                    break;
                }
                break;
            case 392315118:
                if (str.equals("HMACSHA256")) {
                    c = 1;
                    break;
                }
                break;
            case 392316170:
                if (str.equals("HMACSHA384")) {
                    c = 2;
                    break;
                }
                break;
            case 392317873:
                if (str.equals("HMACSHA512")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 20;
                break;
            case 1:
                i = 32;
                break;
            case 2:
                i = 48;
                break;
            case 3:
                i = 64;
                break;
            default:
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
        }
        this.f4058OooO0Oo = i;
        o000oooo.get();
    }

    @Override // o000000o.OooO0o
    public final byte[] OooO0o(int i, byte[] bArr) {
        if (i <= this.f4058OooO0Oo) {
            o000oOoO o000oooo = this.f4055OooO00o;
            ((Mac) o000oooo.get()).update(bArr);
            return Arrays.copyOf(((Mac) o000oooo.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}