package o0000oOO;

import o0000O00.OooO00o;
import o0000OoO.OooOO0O;
import o000O000.OooOO0;

/* loaded from: classes.dex */
public final class o0000Ooo implements o000O000.oo000o {

    /* renamed from: OooO00o  reason: collision with root package name */
    public final boolean f4686OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final OooOO0 f4687OooO0O0 = new OooOO0();

    /* renamed from: OooO0OO  reason: collision with root package name */
    public boolean f4688OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public final /* synthetic */ o0000oo f4689OooO0Oo;

    public o0000Ooo(o0000oo o0000ooVar, boolean z) {
        this.f4689OooO0Oo = o0000ooVar;
        this.f4686OooO00o = z;
    }

    @Override // o000O000.oo000o
    public final o000O000.o0Oo0oo OooO00o() {
        return this.f4689OooO0Oo.f4701OooOO0o;
    }

    public final void OooOo(boolean z) {
        long min;
        boolean z2;
        boolean z3;
        o0000oo o0000ooVar = this.f4689OooO0Oo;
        synchronized (o0000ooVar) {
            o0000ooVar.f4701OooOO0o.OooO0oo();
            while (o0000ooVar.f4696OooO0o0 >= o0000ooVar.f4695OooO0o && !this.f4686OooO00o && !this.f4688OooO0OO) {
                synchronized (o0000ooVar) {
                    OooOo oooOo = o0000ooVar.OooOOO0;
                    if (oooOo != null) {
                        break;
                    }
                    o0000ooVar.OooOO0();
                }
            }
            o0000ooVar.f4701OooOO0o.OooOO0o();
            o0000ooVar.OooO0O0();
            min = Math.min(o0000ooVar.f4695OooO0o - o0000ooVar.f4696OooO0o0, this.f4687OooO0O0.f4823OooO0O0);
            o0000ooVar.f4696OooO0o0 += min;
            if (z) {
                if (min == this.f4687OooO0O0.f4823OooO0O0) {
                    z2 = true;
                    z3 = z2;
                }
            }
            z2 = false;
            z3 = z2;
        }
        this.f4689OooO0Oo.f4701OooOO0o.OooO0oo();
        try {
            o0000oo o0000ooVar2 = this.f4689OooO0Oo;
            o0000ooVar2.f4692OooO0O0.OooOooO(o0000ooVar2.f4691OooO00o, z3, this.f4687OooO0O0, min);
        } finally {
            this.f4689OooO0Oo.f4701OooOO0o.OooOO0o();
        }
    }

    @Override // o000O000.oo000o
    public final void OooOo0(OooOO0 oooOO0, long j) {
        OooO00o.OooOoo0(oooOO0, "source");
        byte[] bArr = OooOO0O.f4403OooO00o;
        OooOO0 oooOO02 = this.f4687OooO0O0;
        oooOO02.OooOo0(oooOO0, j);
        while (oooOO02.f4823OooO0O0 >= 16384) {
            OooOo(false);
        }
    }

    @Override // o000O000.oo000o, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        o0000oo o0000ooVar = this.f4689OooO0Oo;
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (o0000ooVar) {
            if (this.f4688OooO0OO) {
                return;
            }
            synchronized (o0000ooVar) {
                OooOo oooOo = o0000ooVar.OooOOO0;
                z = false;
                if (oooOo == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            o0000oo o0000ooVar2 = this.f4689OooO0Oo;
            if (!o0000ooVar2.f4699OooOO0.f4686OooO00o) {
                if (this.f4687OooO0O0.f4823OooO0O0 > 0) {
                    z = true;
                }
                if (z) {
                    while (this.f4687OooO0O0.f4823OooO0O0 > 0) {
                        OooOo(true);
                    }
                } else if (z2) {
                    o0000ooVar2.f4692OooO0O0.OooOooO(o0000ooVar2.f4691OooO00o, true, null, 0L);
                }
            }
            synchronized (this.f4689OooO0Oo) {
                this.f4688OooO0OO = true;
            }
            this.f4689OooO0Oo.f4692OooO0O0.flush();
            this.f4689OooO0Oo.OooO00o();
        }
    }

    @Override // o000O000.oo000o, java.io.Flushable
    public final void flush() {
        o0000oo o0000ooVar = this.f4689OooO0Oo;
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (o0000ooVar) {
            o0000ooVar.OooO0O0();
        }
        while (this.f4687OooO0O0.f4823OooO0O0 > 0) {
            OooOo(false);
            this.f4689OooO0Oo.f4692OooO0O0.flush();
        }
    }
}