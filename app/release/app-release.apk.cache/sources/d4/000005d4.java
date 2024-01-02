package o0000o0o;

import java.io.IOException;
import java.net.ProtocolException;
import o0000O00.OooO00o;
import o000O000.OooOO0;
import o000O000.o0Oo0oo;
import o000O000.o0ooOOo;

/* loaded from: classes.dex */
public final class o00000O implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final o0ooOOo f4494OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f4495OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public long f4496OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public boolean f4497OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public boolean f4498OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4499OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final /* synthetic */ o00000OO f4500OooO0oO;

    public o00000O(o00000OO o00000oo2, o0ooOOo o0ooooo, long j) {
        OooO00o.OooOoo0(o0ooooo, "delegate");
        this.f4500OooO0oO = o00000oo2;
        this.f4494OooO00o = o0ooooo;
        this.f4495OooO0O0 = j;
        this.f4497OooO0Oo = true;
        if (j == 0) {
            OooOoO0(null);
        }
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        return this.f4494OooO00o.OooO00o();
    }

    @Override // o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "sink");
        if (!this.f4498OooO0o) {
            try {
                long OooO0o02 = this.f4494OooO00o.OooO0o0(oooOO0, j);
                if (this.f4497OooO0Oo) {
                    this.f4497OooO0Oo = false;
                    o00000OO o00000oo2 = this.f4500OooO0oO;
                    OooOoo.o0ooOOo o0ooooo = o00000oo2.f4508OooO0O0;
                    o0000O0 o0000o02 = o00000oo2.f4507OooO00o;
                    o0ooooo.getClass();
                    OooO00o.OooOoo0(o0000o02, "call");
                }
                if (OooO0o02 == -1) {
                    OooOoO0(null);
                    return -1L;
                }
                long j2 = this.f4496OooO0OO + OooO0o02;
                long j3 = this.f4495OooO0O0;
                if (j3 != -1 && j2 > j3) {
                    throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
                }
                this.f4496OooO0OO = j2;
                if (j2 == j3) {
                    OooOoO0(null);
                }
                return OooO0o02;
            } catch (IOException e) {
                throw OooOoO0(e);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void OooOo() {
        this.f4494OooO00o.close();
    }

    /* renamed from: OooOoO */
    public final String toString() {
        return o00000O.class.getSimpleName() + '(' + this.f4494OooO00o + ')';
    }

    public final IOException OooOoO0(IOException iOException) {
        if (this.f4499OooO0o0) {
            return iOException;
        }
        this.f4499OooO0o0 = true;
        o00000OO o00000oo2 = this.f4500OooO0oO;
        if (iOException == null && this.f4497OooO0Oo) {
            this.f4497OooO0Oo = false;
            o00000oo2.f4508OooO0O0.getClass();
            OooO00o.OooOoo0(o00000oo2.f4507OooO00o, "call");
        }
        return o00000oo2.OooO00o(true, false, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4498OooO0o) {
            return;
        }
        this.f4498OooO0o = true;
        try {
            OooOo();
            OooOoO0(null);
        } catch (IOException e) {
            throw OooOoO0(e);
        }
    }
}