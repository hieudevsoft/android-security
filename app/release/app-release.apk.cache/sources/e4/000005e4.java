package o0000oO0;

import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;
import o000O000.OooOOOO;
import o000O000.o0Oo0oo;
import o000O000.oo000o;

/* loaded from: classes.dex */
public final class o00O0O implements oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final OooOOOO f4578OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public boolean f4579OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public final /* synthetic */ o00Ooo f4580OooO0OO;

    public o00O0O(o00Ooo o00ooo2) {
        this.f4580OooO0OO = o00ooo2;
        this.f4578OooO00o = new OooOOOO(o00ooo2.f4585OooO0Oo.OooO00o());
    }

    @Override // o000O000.oo000o
    public final o0Oo0oo OooO00o() {
        return this.f4578OooO00o;
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "source");
        if (!this.f4579OooO0O0) {
            long j2 = oooOO0.f4823OooO0O0;
            byte[] bArr = OooOO0O.f4403OooO00o;
            if ((0 | j) >= 0 && 0 <= j2 && j2 - 0 >= j) {
                this.f4580OooO0OO.f4585OooO0Oo.OooOo0(oooOO0, j);
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f4579OooO0O0) {
            return;
        }
        this.f4579OooO0O0 = true;
        o00Ooo o00ooo2 = this.f4580OooO0OO;
        o00ooo2.getClass();
        OooOOOO oooOOOO = this.f4578OooO00o;
        o0Oo0oo o0oo0oo = oooOOOO.f4828OooO0o0;
        oooOOOO.f4828OooO0o0 = o0Oo0oo.f4856OooO0Oo;
        o0oo0oo.OooO00o();
        o0oo0oo.OooO0O0();
        o00ooo2.f4587OooO0o0 = 3;
    }

    @Override // o000O000.oo000o, java.io.Flushable
    public final void flush() {
        if (this.f4579OooO0O0) {
            return;
        }
        this.f4580OooO0OO.f4585OooO0Oo.flush();
    }
}