package o0000oOO;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o0000O00.OooO00o;
import o0000Oo.OooOOOO;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;
import o000O000.OooOOO;
import o000O000.OooOOO0;

/* loaded from: classes.dex */
public final class o00000O0 implements o000O000.o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOO0 f4666OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public int f4667OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public int f4668OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public int f4669OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public int f4670OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public int f4671OooO0o0;

    public o00000O0(OooOOO0 oooOOO0) {
        this.f4666OooO00o = oooOOO0;
    }

    @Override // o000O000.o0ooOOo
    public final o000O000.o0Oo0oo OooO00o() {
        return this.f4666OooO00o.OooO00o();
    }

    @Override // o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        int i;
        int OooOo0o2;
        OooO00o.OooOoo0(oooOO0, "sink");
        do {
            int i2 = this.f4671OooO0o0;
            OooOOO0 oooOOO0 = this.f4666OooO00o;
            if (i2 == 0) {
                oooOOO0.OooOOO(this.f4670OooO0o);
                this.f4670OooO0o = 0;
                if ((this.f4668OooO0OO & 4) != 0) {
                    return -1L;
                }
                i = this.f4669OooO0Oo;
                int OooOOoo2 = OooOO0O.OooOOoo(oooOOO0);
                this.f4671OooO0o0 = OooOOoo2;
                this.f4667OooO0O0 = OooOOoo2;
                int OooOo0O2 = oooOOO0.OooOo0O() & 255;
                this.f4668OooO0OO = oooOOO0.OooOo0O() & 255;
                OooOOOO oooOOOO = o00000O.f4661OooO0o0;
                if (oooOOOO.OooOOO0().isLoggable(Level.FINE)) {
                    Logger OooOOO0 = oooOOOO.OooOOO0();
                    OooOOO oooOOO = o00O0O.f4715OooO00o;
                    OooOOO0.fine(o00O0O.OooO00o(this.f4669OooO0Oo, this.f4667OooO0O0, OooOo0O2, this.f4668OooO0OO, true));
                }
                OooOo0o2 = oooOOO0.OooOo0o() & Integer.MAX_VALUE;
                this.f4669OooO0Oo = OooOo0o2;
                if (OooOo0O2 != 9) {
                    throw new IOException(OooOo0O2 + " != TYPE_CONTINUATION");
                }
            } else {
                long OooO0o02 = oooOOO0.OooO0o0(oooOO0, Math.min(j, i2));
                if (OooO0o02 == -1) {
                    return -1L;
                }
                this.f4671OooO0o0 -= (int) OooO0o02;
                return OooO0o02;
            }
        } while (OooOo0o2 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}