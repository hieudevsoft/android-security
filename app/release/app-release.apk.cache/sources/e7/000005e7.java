package o0000oO0;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o0OoOo0 extends Oooo000 {

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public long f4589OooO0Oo;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public final /* synthetic */ o00Ooo f4590OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OoOo0(o00Ooo o00ooo2, long j) {
        super(o00ooo2);
        this.f4590OooO0o0 = o00ooo2;
        this.f4589OooO0Oo = j;
        if (j == 0) {
            OooOo();
        }
    }

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
                long j2 = this.f4589OooO0Oo;
                if (j2 == 0) {
                    return -1L;
                }
                long OooO0o02 = super.OooO0o0(oooOO0, Math.min(j2, j));
                if (OooO0o02 != -1) {
                    long j3 = this.f4589OooO0Oo - OooO0o02;
                    this.f4589OooO0Oo = j3;
                    if (j3 == 0) {
                        OooOo();
                    }
                    return OooO0o02;
                }
                this.f4590OooO0o0.f4583OooO0O0.OooOO0O();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                OooOo();
                throw protocolException;
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
        if (this.f4589OooO0Oo != 0 && !OooOO0O.OooO0oO(this, TimeUnit.MILLISECONDS)) {
            this.f4590OooO0o0.f4583OooO0O0.OooOO0O();
            OooOo();
        }
        this.f4572OooO0O0 = true;
    }
}