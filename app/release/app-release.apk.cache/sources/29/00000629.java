package o000O000;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class OooO0OO implements oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final /* synthetic */ int f4816OooO00o = 1;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final Object f4817OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final Object f4818OooO0OO;

    public OooO0OO(OutputStream outputStream, o00oO0o o00oo0o) {
        this.f4817OooO0O0 = outputStream;
        this.f4818OooO0OO = o00oo0o;
    }

    @Override // o000O000.oo000o
    public final o0Oo0oo OooO00o() {
        switch (this.f4816OooO00o) {
            case 0:
                return (OooO) this.f4817OooO0O0;
            default:
                return (o0Oo0oo) this.f4818OooO0OO;
        }
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        int i = this.f4816OooO00o;
        Object obj = this.f4818OooO0OO;
        Object obj2 = this.f4817OooO0O0;
        switch (i) {
            case 0:
                o0000O00.OooO00o.OooOoo0(oooOO0, "source");
                com.google.gson.internal.OooO0o.OooO0o(oooOO0.f4823OooO0O0, 0L, j);
                while (j > 0) {
                    o00O0O o00o0o = oooOO0.f4822OooO00o;
                    long j2 = 0;
                    while (true) {
                        o0000O00.OooO00o.OooOo(o00o0o);
                        if (j2 < 65536) {
                            j2 += o00o0o.f4846OooO0OO - o00o0o.f4845OooO0O0;
                            if (j2 >= j) {
                                j2 = j;
                            } else {
                                o00o0o = o00o0o.f4848OooO0o;
                            }
                        }
                    }
                    OooO oooO = (OooO) obj2;
                    oo000o oo000oVar = (oo000o) obj;
                    oooO.OooO0oo();
                    try {
                        oo000oVar.OooOo0(oooOO0, j2);
                        if (!oooO.OooO()) {
                            j -= j2;
                        } else {
                            throw oooO.OooOO0(null);
                        }
                    } catch (IOException e) {
                        if (!oooO.OooO()) {
                            throw e;
                        }
                        throw oooO.OooOO0(e);
                    } finally {
                        oooO.OooO();
                    }
                }
                return;
            default:
                o0000O00.OooO00o.OooOoo0(oooOO0, "source");
                com.google.gson.internal.OooO0o.OooO0o(oooOO0.f4823OooO0O0, 0L, j);
                while (j > 0) {
                    ((o0Oo0oo) obj).OooO0o();
                    o00O0O o00o0o2 = oooOO0.f4822OooO00o;
                    o0000O00.OooO00o.OooOo(o00o0o2);
                    int min = (int) Math.min(j, o00o0o2.f4846OooO0OO - o00o0o2.f4845OooO0O0);
                    ((OutputStream) obj2).write(o00o0o2.f4844OooO00o, o00o0o2.f4845OooO0O0, min);
                    int i2 = o00o0o2.f4845OooO0O0 + min;
                    o00o0o2.f4845OooO0O0 = i2;
                    long j3 = min;
                    j -= j3;
                    oooOO0.f4823OooO0O0 -= j3;
                    if (i2 == o00o0o2.f4846OooO0OO) {
                        oooOO0.f4822OooO00o = o00o0o2.OooO00o();
                        o00Oo0.OooO00o(o00o0o2);
                    }
                }
                return;
        }
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.f4816OooO00o;
        Object obj = this.f4817OooO0O0;
        switch (i) {
            case 0:
                OooO oooO = (OooO) obj;
                oo000o oo000oVar = (oo000o) this.f4818OooO0OO;
                oooO.OooO0oo();
                try {
                    oo000oVar.close();
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
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // o000O000.oo000o, java.io.Flushable
    public final void flush() {
        int i = this.f4816OooO00o;
        Object obj = this.f4817OooO0O0;
        switch (i) {
            case 0:
                OooO oooO = (OooO) obj;
                oo000o oo000oVar = (oo000o) this.f4818OooO0OO;
                oooO.OooO0oo();
                try {
                    oo000oVar.flush();
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
                ((OutputStream) obj).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f4816OooO00o) {
            case 0:
                return "AsyncTimeout.sink(" + ((oo000o) this.f4818OooO0OO) + ')';
            default:
                return "sink(" + ((OutputStream) this.f4817OooO0O0) + ')';
        }
    }

    public OooO0OO(o00oO0o o00oo0o, OooO0OO oooO0OO) {
        this.f4817OooO0O0 = o00oo0o;
        this.f4818OooO0OO = oooO0OO;
    }
}