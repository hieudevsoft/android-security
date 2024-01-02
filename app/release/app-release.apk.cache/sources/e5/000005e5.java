package o0000oO0;

import o0000O00.OooO00o;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o00Oo0 extends Oooo000 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4581OooO0Oo;

    @Override // o0000oO0.Oooo000, o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        boolean z;
        OooO00o.OooOoo0(oooOO0, "sink");
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f4572OooO0O0) {
                if (this.f4581OooO0Oo) {
                    return -1L;
                }
                long OooO0o02 = super.OooO0o0(oooOO0, j);
                if (OooO0o02 == -1) {
                    this.f4581OooO0Oo = true;
                    OooOo();
                    return -1L;
                }
                return OooO0o02;
            }
            throw new IllegalStateException("closed".toString());
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4572OooO0O0) {
            return;
        }
        if (!this.f4581OooO0Oo) {
            OooOo();
        }
        this.f4572OooO0O0 = true;
    }
}