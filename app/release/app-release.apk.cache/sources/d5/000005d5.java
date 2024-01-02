package o0000o0o;

import java.io.IOException;
import java.net.ProtocolException;
import o0000O00.OooO00o;
import o000O000.OooOO0;
import o000O000.o0Oo0oo;
import o000O000.oo000o;

/* loaded from: classes.dex */
public final class o00000O0 implements oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final oo000o f4501OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final long f4502OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4503OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public long f4504OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public final /* synthetic */ o00000OO f4505OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public boolean f4506OooO0o0;

    public o00000O0(o00000OO o00000oo2, oo000o oo000oVar, long j) {
        OooO00o.OooOoo0(oo000oVar, "delegate");
        this.f4505OooO0o = o00000oo2;
        this.f4501OooO00o = oo000oVar;
        this.f4502OooO0O0 = j;
    }

    @Override // o000O000.oo000o
    public final o0Oo0oo OooO00o() {
        return this.f4501OooO00o.OooO00o();
    }

    public final void OooOo() {
        this.f4501OooO00o.close();
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "source");
        if (!this.f4506OooO0o0) {
            long j2 = this.f4502OooO0O0;
            if (j2 != -1 && this.f4504OooO0Oo + j > j2) {
                throw new ProtocolException("expected " + j2 + " bytes but received " + (this.f4504OooO0Oo + j));
            }
            try {
                this.f4501OooO00o.OooOo0(oooOO0, j);
                this.f4504OooO0Oo += j;
                return;
            } catch (IOException e) {
                throw OooOoO0(e);
            }
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void OooOoO() {
        this.f4501OooO00o.flush();
    }

    public final IOException OooOoO0(IOException iOException) {
        if (this.f4503OooO0OO) {
            return iOException;
        }
        this.f4503OooO0OO = true;
        return this.f4505OooO0o.OooO00o(false, true, iOException);
    }

    /* renamed from: OooOoOO */
    public final String toString() {
        return o00000O0.class.getSimpleName() + '(' + this.f4501OooO00o + ')';
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4506OooO0o0) {
            return;
        }
        this.f4506OooO0o0 = true;
        long j = this.f4502OooO0O0;
        if (j != -1 && this.f4504OooO0Oo != j) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            OooOo();
            OooOoO0(null);
        } catch (IOException e) {
            throw OooOoO0(e);
        }
    }

    @Override // o000O000.oo000o, java.io.Flushable
    public final void flush() {
        try {
            OooOoO();
        } catch (IOException e) {
            throw OooOoO0(e);
        }
    }
}