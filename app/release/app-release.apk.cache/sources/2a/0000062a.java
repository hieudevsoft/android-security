package o000O000;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class OooO0o implements o0ooOOo {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4819OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f4820OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f4821OooO0OO;

    public OooO0o(InputStream inputStream, o0Oo0oo o0oo0oo) {
        this.f4820OooO0O0 = inputStream;
        this.f4821OooO0OO = o0oo0oo;
    }

    @Override // o000O000.o0ooOOo
    public final o0Oo0oo OooO00o() {
        switch (this.f4819OooO00o) {
            case 0:
                return (OooO) this.f4820OooO0O0;
            default:
                return (o0Oo0oo) this.f4821OooO0OO;
        }
    }

    @Override // o000O000.o0ooOOo
    public final long OooO0o0(OooOO0 oooOO0, long j) {
        boolean z;
        int i = this.f4819OooO00o;
        Object obj = this.f4821OooO0OO;
        Object obj2 = this.f4820OooO0O0;
        switch (i) {
            case 0:
                o0000O00.OooO00o.OooOoo0(oooOO0, "sink");
                OooO oooO = (OooO) obj2;
                o0ooOOo o0ooooo = (o0ooOOo) obj;
                oooO.OooO0oo();
                try {
                    long OooO0o02 = o0ooooo.OooO0o0(oooOO0, j);
                    if (!oooO.OooO()) {
                        return OooO0o02;
                    }
                    throw oooO.OooOO0(null);
                } catch (IOException e) {
                    if (!oooO.OooO()) {
                        throw e;
                    }
                    throw oooO.OooOO0(e);
                } finally {
                    oooO.OooO();
                }
            default:
                o0000O00.OooO00o.OooOoo0(oooOO0, "sink");
                int i2 = (j > 0L ? 1 : (j == 0L ? 0 : -1));
                if (i2 == 0) {
                    return 0L;
                }
                if (i2 >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    try {
                        ((o0Oo0oo) obj).OooO0o();
                        o00O0O OooOooO2 = oooOO0.OooOooO(1);
                        int read = ((InputStream) obj2).read(OooOooO2.f4844OooO00o, OooOooO2.f4846OooO0OO, (int) Math.min(j, 8192 - OooOooO2.f4846OooO0OO));
                        if (read == -1) {
                            if (OooOooO2.f4845OooO0O0 == OooOooO2.f4846OooO0OO) {
                                oooOO0.f4822OooO00o = OooOooO2.OooO00o();
                                o00Oo0.OooO00o(OooOooO2);
                            }
                            return -1L;
                        }
                        OooOooO2.f4846OooO0OO += read;
                        long j2 = read;
                        oooOO0.f4823OooO0O0 += j2;
                        return j2;
                    } catch (AssertionError e2) {
                        if (o0000O00.OooO00o.o0000oo(e2)) {
                            throw new IOException(e2);
                        }
                        throw e2;
                    }
                }
                throw new IllegalArgumentException(("byteCount < 0: " + j).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f4819OooO00o;
        Object obj = this.f4820OooO0O0;
        switch (i) {
            case 0:
                OooO oooO = (OooO) obj;
                o0ooOOo o0ooooo = (o0ooOOo) this.f4821OooO0OO;
                oooO.OooO0oo();
                try {
                    o0ooooo.close();
                    if (!oooO.OooO()) {
                        return;
                    }
                    throw oooO.OooOO0(null);
                } catch (IOException e) {
                    if (!oooO.OooO()) {
                        throw e;
                    }
                    throw oooO.OooOO0(e);
                } finally {
                    oooO.OooO();
                }
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public final String toString() {
        switch (this.f4819OooO00o) {
            case 0:
                return "AsyncTimeout.source(" + ((o0ooOOo) this.f4821OooO0OO) + ')';
            default:
                return "source(" + ((InputStream) this.f4820OooO0O0) + ')';
        }
    }

    public OooO0o(o00oO0o o00oo0o, OooO0o oooO0o) {
        this.f4820OooO0O0 = o00oo0o;
        this.f4821OooO0OO = oooO0o;
    }
}