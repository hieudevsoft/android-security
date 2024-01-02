package o0000oOO;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import o0000O00.OooO00o;
import o0000OoO.OooOO0O;

/* loaded from: classes.dex */
public final class o0000oo {

    /* renamed from: OooO  reason: collision with root package name */
    public final o0000 f4690OooO;

    /* renamed from: OooO00o  reason: collision with root package name */
    public final int f4691OooO00o;

    /* renamed from: OooO0O0  reason: collision with root package name */
    public final o000000O f4692OooO0O0;

    /* renamed from: OooO0OO  reason: collision with root package name */
    public long f4693OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with root package name */
    public long f4694OooO0Oo;

    /* renamed from: OooO0o  reason: collision with root package name */
    public long f4695OooO0o;

    /* renamed from: OooO0o0  reason: collision with root package name */
    public long f4696OooO0o0;

    /* renamed from: OooO0oO  reason: collision with root package name */
    public final ArrayDeque f4697OooO0oO;

    /* renamed from: OooO0oo  reason: collision with root package name */
    public boolean f4698OooO0oo;

    /* renamed from: OooOO0  reason: collision with root package name */
    public final o0000Ooo f4699OooOO0;

    /* renamed from: OooOO0O  reason: collision with root package name */
    public final o0000O00 f4700OooOO0O;

    /* renamed from: OooOO0o  reason: collision with root package name */
    public final o0000O00 f4701OooOO0o;

    /* renamed from: OooOOO  reason: collision with root package name */
    public IOException f4702OooOOO;
    public OooOo OooOOO0;

    public o0000oo(int i, o000000O o000000o2, boolean z, boolean z2, o0000Oo.oo000o oo000oVar) {
        this.f4691OooO00o = i;
        this.f4692OooO0O0 = o000000o2;
        this.f4695OooO0o = o000000o2.f4651OooOOoo.OooO00o();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f4697OooO0oO = arrayDeque;
        this.f4690OooO = new o0000(this, o000000o2.f4649OooOOo.OooO00o(), z2);
        this.f4699OooOO0 = new o0000Ooo(this, z);
        this.f4700OooOO0O = new o0000O00(this);
        this.f4701OooOO0o = new o0000O00(this);
        if (oo000oVar != null) {
            if (!OooO0oO()) {
                arrayDeque.add(oo000oVar);
                return;
            }
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
        } else if (OooO0oO()) {
        } else {
            throw new IllegalStateException("remotely-initiated streams should have headers".toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f A[Catch: all -> 0x0035, TryCatch #0 {, blocks: (B:4:0x0008, B:8:0x0010, B:11:0x001f, B:12:0x0023, B:9:0x0016), top: B:20:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void OooO(o0000Oo.oo000o r3, boolean r4) {
        /*
            r2 = this;
            java.lang.String r0 = "headers"
            o0000O00.OooO00o.OooOoo0(r3, r0)
            byte[] r0 = o0000OoO.OooOO0O.f4403OooO00o
            monitor-enter(r2)
            boolean r0 = r2.f4698OooO0oo     // Catch: java.lang.Throwable -> L35
            r1 = 1
            if (r0 == 0) goto L16
            if (r4 != 0) goto L10
            goto L16
        L10:
            o0000oOO.o0000 r3 = r2.f4690OooO     // Catch: java.lang.Throwable -> L35
            r3.getClass()     // Catch: java.lang.Throwable -> L35
            goto L1d
        L16:
            r2.f4698OooO0oo = r1     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = r2.f4697OooO0oO     // Catch: java.lang.Throwable -> L35
            r0.add(r3)     // Catch: java.lang.Throwable -> L35
        L1d:
            if (r4 == 0) goto L23
            o0000oOO.o0000 r3 = r2.f4690OooO     // Catch: java.lang.Throwable -> L35
            r3.f4617OooO0O0 = r1     // Catch: java.lang.Throwable -> L35
        L23:
            boolean r3 = r2.OooO0oo()     // Catch: java.lang.Throwable -> L35
            r2.notifyAll()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r2)
            if (r3 != 0) goto L34
            o0000oOO.o000000O r3 = r2.f4692OooO0O0
            int r4 = r2.f4691OooO00o
            r3.OooOoOO(r4)
        L34:
            return
        L35:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o0000oOO.o0000oo.OooO(o0000Oo.oo000o, boolean):void");
    }

    public final void OooO00o() {
        boolean z;
        boolean OooO0oo2;
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (this) {
            o0000 o0000Var = this.f4690OooO;
            if (!o0000Var.f4617OooO0O0 && o0000Var.f4621OooO0o0) {
                o0000Ooo o0000ooo = this.f4699OooOO0;
                if (o0000ooo.f4686OooO00o || o0000ooo.f4688OooO0OO) {
                    z = true;
                    OooO0oo2 = OooO0oo();
                }
            }
            z = false;
            OooO0oo2 = OooO0oo();
        }
        if (z) {
            OooO0OO(OooOo.CANCEL, null);
        } else if (!OooO0oo2) {
            this.f4692OooO0O0.OooOoOO(this.f4691OooO00o);
        }
    }

    public final void OooO0O0() {
        o0000Ooo o0000ooo = this.f4699OooOO0;
        if (!o0000ooo.f4688OooO0OO) {
            if (!o0000ooo.f4686OooO00o) {
                if (this.OooOOO0 != null) {
                    IOException iOException = this.f4702OooOOO;
                    if (iOException == null) {
                        OooOo oooOo = this.OooOOO0;
                        OooO00o.OooOo(oooOo);
                        throw new o0000OO0(oooOo);
                    }
                    throw iOException;
                }
                return;
            }
            throw new IOException("stream finished");
        }
        throw new IOException("stream closed");
    }

    public final void OooO0OO(OooOo oooOo, IOException iOException) {
        if (!OooO0Oo(oooOo, iOException)) {
            return;
        }
        o000000O o000000o2 = this.f4692OooO0O0;
        o000000o2.getClass();
        o000000o2.f4658OooOoO0.OooOoo(this.f4691OooO00o, oooOo);
    }

    public final boolean OooO0Oo(OooOo oooOo, IOException iOException) {
        byte[] bArr = OooOO0O.f4403OooO00o;
        synchronized (this) {
            if (this.OooOOO0 != null) {
                return false;
            }
            this.OooOOO0 = oooOo;
            this.f4702OooOOO = iOException;
            notifyAll();
            if (this.f4690OooO.f4617OooO0O0) {
                if (this.f4699OooOO0.f4686OooO00o) {
                    return false;
                }
            }
            this.f4692OooO0O0.OooOoOO(this.f4691OooO00o);
            return true;
        }
    }

    public final o0000Ooo OooO0o() {
        synchronized (this) {
            if (!(this.f4698OooO0oo || OooO0oO())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
        }
        return this.f4699OooOO0;
    }

    public final void OooO0o0(OooOo oooOo) {
        if (OooO0Oo(oooOo, null)) {
            this.f4692OooO0O0.OooOooo(this.f4691OooO00o, oooOo);
        }
    }

    public final boolean OooO0oO() {
        boolean z;
        if ((this.f4691OooO00o & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (this.f4692OooO0O0.f4635OooO00o == z) {
            return true;
        }
        return false;
    }

    public final synchronized boolean OooO0oo() {
        if (this.OooOOO0 != null) {
            return false;
        }
        o0000 o0000Var = this.f4690OooO;
        if (o0000Var.f4617OooO0O0 || o0000Var.f4621OooO0o0) {
            o0000Ooo o0000ooo = this.f4699OooOO0;
            if (o0000ooo.f4686OooO00o || o0000ooo.f4688OooO0OO) {
                if (this.f4698OooO0oo) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void OooOO0() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }
}