package o000000O;

import androidx.activity.result.OooO0o;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import o00000.o0O0ooO;
import o0OO00O.OooOO0O;
import o0OO00O.OooOOO0;

/* loaded from: classes.dex */
public final class OooO0O0 implements OooOO0O {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooO0o f4013OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final byte[] f4014OooO0O0 = {0};

    public OooO0O0(OooO0o oooO0o) {
        this.f4013OooO00o = oooO0o;
    }

    @Override // o0OO00O.OooOO0O
    public final void OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            OooO0o oooO0o = this.f4013OooO00o;
            for (OooOOO0 oooOOO0 : oooO0o.OooO(copyOf)) {
                try {
                    boolean equals = oooOOO0.f5309OooO0Oo.equals(o0O0ooO.LEGACY);
                    Object obj = oooOOO0.f5306OooO00o;
                    if (equals) {
                        ((OooOO0O) obj).OooO00o(copyOfRange, o0000O00.OooO00o.Oooo(bArr2, this.f4014OooO0O0));
                        return;
                    } else {
                        ((OooOO0O) obj).OooO00o(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    Logger logger = OooO0OO.f4015OooO00o;
                    logger.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            for (OooOOO0 oooOOO02 : oooO0o.OooO(com.google.gson.internal.OooO0o.f3792OooO0oo)) {
                try {
                    ((OooOO0O) oooOOO02.f5306OooO00o).OooO00o(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    @Override // o0OO00O.OooOO0O
    public final byte[] OooO0O0(byte[] bArr) {
        OooO0o oooO0o = this.f4013OooO00o;
        if (((OooOOO0) oooO0o.f1983OooO0OO).f5309OooO0Oo.equals(o0O0ooO.LEGACY)) {
            return o0000O00.OooO00o.Oooo(((OooOOO0) oooO0o.f1983OooO0OO).OooO00o(), ((OooOO0O) ((OooOOO0) oooO0o.f1983OooO0OO).f5306OooO00o).OooO0O0(o0000O00.OooO00o.Oooo(bArr, this.f4014OooO0O0)));
        }
        return o0000O00.OooO00o.Oooo(((OooOOO0) oooO0o.f1983OooO0OO).OooO00o(), ((OooOO0O) ((OooOOO0) oooO0o.f1983OooO0OO).f5306OooO00o).OooO0O0(bArr));
    }
}