package oo0o0Oo;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o0OO00O.OooOOO0;

/* loaded from: classes.dex */
public final class OooO0O0 implements o0OO00O.OooO00o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final androidx.activity.result.OooO0o f5626OooO00o;

    public OooO0O0(androidx.activity.result.OooO0o oooO0o) {
        this.f5626OooO00o = oooO0o;
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO00o(byte[] bArr, byte[] bArr2) {
        androidx.activity.result.OooO0o oooO0o = this.f5626OooO00o;
        return o0000O00.OooO00o.Oooo(((OooOOO0) oooO0o.f1983OooO0OO).OooO00o(), ((o0OO00O.OooO00o) ((OooOOO0) oooO0o.f1983OooO0OO).f5306OooO00o).OooO00o(bArr, bArr2));
    }

    @Override // o0OO00O.OooO00o
    public final byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        androidx.activity.result.OooO0o oooO0o = this.f5626OooO00o;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (OooOOO0 oooOOO0 : oooO0o.OooO(copyOfRange)) {
                try {
                    return ((o0OO00O.OooO00o) oooOOO0.f5306OooO00o).OooO0O0(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    Logger logger = OooO0OO.f5627OooO00o;
                    logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                }
            }
        }
        for (OooOOO0 oooOOO02 : oooO0o.OooO(com.google.gson.internal.OooO0o.f3792OooO0oo)) {
            try {
                return ((o0OO00O.OooO00o) oooOOO02.f5306OooO00o).OooO0O0(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}