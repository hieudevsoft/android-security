package o0000oO0;

import o0000O00.OooO00o;
import o000O000.OooOO0;
import o000O000.OooOO0O;
import o000O000.OooOOOO;
import o000O000.o0Oo0oo;
import o000O000.oo000o;

/* loaded from: classes.dex */
public final class Oooo0 implements oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f4568OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4569OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o00Ooo f4570OooO0OO;

    public Oooo0(o00Ooo o00ooo2) {
        this.f4570OooO0OO = o00ooo2;
        this.f4568OooO00o = new OooOOOO(o00ooo2.f4585OooO0Oo.OooO00o());
    }

    @Override // o000O000.oo000o
    public final o0Oo0oo OooO00o() {
        return this.f4568OooO00o;
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "source");
        if (!this.f4569OooO0O0) {
            if (j == 0) {
                return;
            }
            o00Ooo o00ooo2 = this.f4570OooO0OO;
            o00ooo2.f4585OooO0Oo.OooO0oO(j);
            OooOO0O oooOO0O = o00ooo2.f4585OooO0Oo;
            oooOO0O.OooOO0O("\r\n");
            oooOO0O.OooOo0(oooOO0, j);
            oooOO0O.OooOO0O("\r\n");
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f4569OooO0O0) {
            return;
        }
        this.f4569OooO0O0 = true;
        this.f4570OooO0OO.f4585OooO0Oo.OooOO0O("0\r\n\r\n");
        o00Ooo o00ooo2 = this.f4570OooO0OO;
        OooOOOO oooOOOO = this.f4568OooO00o;
        o00ooo2.getClass();
        o0Oo0oo o0oo0oo = oooOOOO.f4828OooO0o0;
        oooOOOO.f4828OooO0o0 = o0Oo0oo.f4856OooO0Oo;
        o0oo0oo.OooO00o();
        o0oo0oo.OooO0O0();
        this.f4570OooO0OO.f4587OooO0o0 = 3;
    }

    @Override // o000O000.oo000o, java.io.Flushable
    public final synchronized void flush() {
        if (this.f4569OooO0O0) {
            return;
        }
        this.f4570OooO0OO.f4585OooO0Oo.flush();
    }
}