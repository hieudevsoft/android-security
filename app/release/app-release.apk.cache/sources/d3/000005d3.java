package o0000o0o;

import java.io.IOException;
import o0000O00.OooO00o;
import o0000Oo.o0OOO0o;
import o0000Oo.oo0o0Oo;
import o0000o.OooOOOO;

/* loaded from: classes.dex */
public final class o000000O implements o0OOO0o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public static final o000000O f4493OooO00o = new o000000O();

    @Override // o0000Oo.o0OOO0o
    public final o0000Oo.o00000 OooO00o(OooOOOO oooOOOO) {
        boolean z;
        o0000O0 o0000o02 = oooOOOO.f4439OooO00o;
        o0000o02.getClass();
        synchronized (o0000o02) {
            if (o0000o02.f4532OooOOOO) {
                if (!o0000o02.f4531OooOOO) {
                    if (!(!o0000o02.OooOOO0)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                throw new IllegalStateException("released".toString());
            }
        }
        o0000Ooo o0000ooo = o0000o02.f4519OooO;
        OooO00o.OooOo(o0000ooo);
        oo0o0Oo oo0o0oo = o0000o02.f4520OooO00o;
        OooO00o.OooOoo0(oo0o0oo, "client");
        try {
            int i = oooOOOO.f4443OooO0o;
            int i2 = oooOOOO.f4445OooO0oO;
            int i3 = oooOOOO.f4446OooO0oo;
            int i4 = oo0o0oo.f4381OooOoOO;
            boolean z2 = oo0o0oo.f4361OooO0o;
            if (!OooO00o.OooOOO0((String) oooOOOO.f4444OooO0o0.f2520OooO0OO, "GET")) {
                z = true;
            } else {
                z = false;
            }
            o00000OO o00000oo2 = new o00000OO(o0000o02, o0000o02.f4525OooO0o0, o0000ooo, o0000ooo.OooO00o(i, i2, i3, i4, z2, z).OooOO0(oo0o0oo, oooOOOO));
            o0000o02.f4530OooOO0o = o00000oo2;
            o0000o02.f4535OooOOo0 = o00000oo2;
            synchronized (o0000o02) {
                o0000o02.OooOOO0 = true;
                o0000o02.f4531OooOOO = true;
            }
            if (!o0000o02.f4533OooOOOo) {
                return OooOOOO.OooO00o(oooOOOO, 0, o00000oo2, null, 61).OooO0O0(oooOOOO.f4444OooO0o0);
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            o0000ooo.OooO0OO(e);
            throw new o0000OO0(e);
        } catch (o0000OO0 e2) {
            o0000ooo.OooO0OO(e2.f4539OooO0O0);
            throw e2;
        }
    }
}